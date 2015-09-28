
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/ajay/D/my_projects/play-silhouette-angular-seed-2/conf/routes
// @DATE:Mon Sep 28 10:26:16 IST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Yeoman_5: com.tuplejump.playYeoman.Yeoman,
  // @LINE:10
  ApplicationController_2: javax.inject.Provider[controllers.ApplicationController],
  // @LINE:12
  CredentialsAuthController_1: javax.inject.Provider[controllers.CredentialsAuthController],
  // @LINE:13
  SignUpController_3: javax.inject.Provider[controllers.SignUpController],
  // @LINE:14
  SocialAuthController_0: javax.inject.Provider[controllers.SocialAuthController],
  // @LINE:21
  Assets_4: controllers.Assets,
  // @LINE:23
  yeoman_Routes_0: yeoman.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Yeoman_5: com.tuplejump.playYeoman.Yeoman,
    // @LINE:10
    ApplicationController_2: javax.inject.Provider[controllers.ApplicationController],
    // @LINE:12
    CredentialsAuthController_1: javax.inject.Provider[controllers.CredentialsAuthController],
    // @LINE:13
    SignUpController_3: javax.inject.Provider[controllers.SignUpController],
    // @LINE:14
    SocialAuthController_0: javax.inject.Provider[controllers.SocialAuthController],
    // @LINE:21
    Assets_4: controllers.Assets,
    // @LINE:23
    yeoman_Routes_0: yeoman.Routes
  ) = this(errorHandler, Yeoman_5, ApplicationController_2, CredentialsAuthController_1, SignUpController_3, SocialAuthController_0, Assets_4, yeoman_Routes_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Yeoman_5, ApplicationController_2, CredentialsAuthController_1, SignUpController_3, SocialAuthController_0, Assets_4, yeoman_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """com.tuplejump.playYeoman.Yeoman.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """@controllers.ApplicationController@.user"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """@controllers.ApplicationController@.signOut"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """@controllers.CredentialsAuthController@.authenticate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """@controllers.SignUpController@.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""", """@controllers.SocialAuthController@.authenticate(provider:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""", """@controllers.SocialAuthController@.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """views/$template<.+>.html""", """@controllers.ApplicationController@.view(template:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    prefixed_yeoman_Routes_0_9.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val com_tuplejump_playYeoman_Yeoman_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val com_tuplejump_playYeoman_Yeoman_index0_invoker = createInvoker(
    Yeoman_5.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.tuplejump.playYeoman.Yeoman",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApplicationController_user1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_ApplicationController_user1_invoker = createInvoker(
    ApplicationController_2.get.user,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "user",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApplicationController_signOut2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut2_invoker = createInvoker(
    ApplicationController_2.get.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signOut"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CredentialsAuthController_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_CredentialsAuthController_authenticate3_invoker = createInvoker(
    CredentialsAuthController_1.get.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CredentialsAuthController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """signIn"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignUpController_signUp4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_signUp4_invoker = createInvoker(
    SignUpController_3.get.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "signUp",
      Nil,
      "POST",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SocialAuthController_authenticate5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate5_invoker = createInvoker(
    SocialAuthController_0.get.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/$provider<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SocialAuthController_authenticate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate6_invoker = createInvoker(
    SocialAuthController_0.get.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """authenticate/$provider<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ApplicationController_view7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("views/"), DynamicPart("template", """.+""",false), StaticPart(".html")))
  )
  private[this] lazy val controllers_ApplicationController_view7_invoker = createInvoker(
    ApplicationController_2.get.view(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "view",
      Seq(classOf[String]),
      "GET",
      """ Dynamic part of the url""",
      this.prefix + """views/$template<.+>.html"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:23
  private[this] val prefixed_yeoman_Routes_0_9 = Include(yeoman_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case com_tuplejump_playYeoman_Yeoman_index0_route(params) =>
      call { 
        com_tuplejump_playYeoman_Yeoman_index0_invoker.call(Yeoman_5.index)
      }
  
    // @LINE:10
    case controllers_ApplicationController_user1_route(params) =>
      call { 
        controllers_ApplicationController_user1_invoker.call(ApplicationController_2.get.user)
      }
  
    // @LINE:11
    case controllers_ApplicationController_signOut2_route(params) =>
      call { 
        controllers_ApplicationController_signOut2_invoker.call(ApplicationController_2.get.signOut)
      }
  
    // @LINE:12
    case controllers_CredentialsAuthController_authenticate3_route(params) =>
      call { 
        controllers_CredentialsAuthController_authenticate3_invoker.call(CredentialsAuthController_1.get.authenticate)
      }
  
    // @LINE:13
    case controllers_SignUpController_signUp4_route(params) =>
      call { 
        controllers_SignUpController_signUp4_invoker.call(SignUpController_3.get.signUp)
      }
  
    // @LINE:14
    case controllers_SocialAuthController_authenticate5_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate5_invoker.call(SocialAuthController_0.get.authenticate(provider))
      }
  
    // @LINE:15
    case controllers_SocialAuthController_authenticate6_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate6_invoker.call(SocialAuthController_0.get.authenticate(provider))
      }
  
    // @LINE:18
    case controllers_ApplicationController_view7_route(params) =>
      call(params.fromPath[String]("template", None)) { (template) =>
        controllers_ApplicationController_view7_invoker.call(ApplicationController_2.get.view(template))
      }
  
    // @LINE:21
    case controllers_Assets_at8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:23
    case prefixed_yeoman_Routes_0_9(handler) => handler
  }
}