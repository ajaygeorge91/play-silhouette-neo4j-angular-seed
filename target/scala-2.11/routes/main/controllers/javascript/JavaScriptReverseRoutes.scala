
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/ajay/D/my_projects/play-silhouette-angular-seed-2/conf/routes
// @DATE:Mon Sep 28 10:26:16 IST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:10
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
          }
        
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:18
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.view",
      """
        function(template) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("template", template) + ".html"})
        }
      """
    )
  
    // @LINE:10
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseCredentialsAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CredentialsAuthController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.signUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
  }


}