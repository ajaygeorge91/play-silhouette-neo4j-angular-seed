
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signIn_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signIn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(socialProviders: com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import forms.SignInForm.form
import b3.inline.fieldConstructor

Seq[Any](format.raw/*1.138*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<fieldset class="col-md-6 col-md-offset-3" ng-controller="SignInCtrl">
    <legend>"""),_display_(/*7.14*/Messages("sign.in.credentials")),format.raw/*7.45*/("""</legend>
    <form name="form" id="sign-in-form" ng-submit="submit()" ng-model-options=""""),format.raw/*8.80*/("""{"""),format.raw/*8.81*/(""" """),format.raw/*8.82*/("""updateOn: 'submit blur' """),format.raw/*8.106*/("""}"""),format.raw/*8.107*/("""" autocomplete="off">

        """),_display_(/*10.10*/b3/*10.12*/.email(form("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg", 'required -> "", Symbol("ng-model") -> "email")),format.raw/*10.187*/("""
        """),format.raw/*11.9*/("""<div class="help-block text-danger" ng-if="form.email.$dirty" ng-messages="form.email.$error">
            <div ng-message="required">"""),_display_(/*12.41*/Messages("error.required")),format.raw/*12.67*/("""</div>
            <div ng-message="email">"""),_display_(/*13.38*/Messages("error.email")),format.raw/*13.61*/("""</div>
        </div>

        """),_display_(/*16.10*/b3/*16.12*/.password(form("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg", 'required -> "", Symbol("ng-model") -> "password")),format.raw/*16.202*/("""
        """),format.raw/*17.9*/("""<div class="help-block text-danger" ng-if="form.password.$dirty" ng-messages="form.password.$error">
            <div ng-message="required">"""),_display_(/*18.41*/Messages("error.required")),format.raw/*18.67*/("""</div>
        </div>

        """),_display_(/*21.10*/b3/*21.12*/.checkbox(form("rememberMe"), '_text -> Messages("remember.me"), 'checked -> true, Symbol("ng-model") -> "rememberMe", Symbol("ng-init") -> "rememberMe=true")),format.raw/*21.170*/("""

        """),format.raw/*23.9*/("""<div class="form-group">
            <button ng-disabled="form.$invalid" id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*24.132*/Messages("sign.in")),format.raw/*24.151*/("""</button>
        </div>

        <div>
            <p class="not-a-member">"""),_display_(/*28.38*/Messages("not.a.member")),format.raw/*28.62*/(""" """),format.raw/*28.63*/("""<a ui-sref="signUp">"""),_display_(/*28.84*/Messages("sign.up.now")),format.raw/*28.107*/("""</a></p>
        </div>

        """),_display_(/*31.10*/if(socialProviders.providers.nonEmpty)/*31.48*/ {_display_(Seq[Any](format.raw/*31.50*/("""
            """),format.raw/*32.13*/("""<div class="social-providers">
                <p>"""),_display_(/*33.21*/Messages("or.use.social")),format.raw/*33.46*/("""</p>
                <div>
                """),_display_(/*35.18*/for(p <- socialProviders.providers) yield /*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/("""
                    """),format.raw/*36.21*/("""<a ng-click="authenticate('"""),_display_(/*36.49*/p/*36.50*/.id),format.raw/*36.53*/("""')" class="provider """),_display_(/*36.74*/p/*36.75*/.id),format.raw/*36.78*/("""" title=""""),_display_(/*36.88*/Messages(p.id)),format.raw/*36.102*/(""""><img src=""""),_display_(/*36.115*/routes/*36.121*/.Assets.at(s"images/providers/${p.id}.png")),format.raw/*36.164*/("""" width="64px" height="64px" alt=""""),_display_(/*36.199*/Messages(p.id)),format.raw/*36.213*/(""""></a>
                """)))}),format.raw/*37.18*/("""
                """),format.raw/*38.17*/("""</div>
            </div>
        """)))}),format.raw/*40.10*/("""
    """),format.raw/*41.5*/("""</form>
</fieldset>
"""))
      }
    }
  }

  def render(socialProviders:com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(socialProviders)(request,messages)

  def f:((com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (socialProviders) => (request,messages) => apply(socialProviders)(request,messages)

  def ref: this.type = this

}


}

/**/
object signIn extends signIn_Scope0.signIn
              /*
                  -- GENERATED --
                  DATE: Wed Sep 16 10:08:00 IST 2015
                  SOURCE: /media/ajay/D/my_projects/play-silhouette-angular-seed-2/app/views/signIn.scala.html
                  HASH: bd78eca7cb3ed036f07174d96b0c931131c8d111
                  MATRIX: 610->1|904->137|932->204|959->205|1069->289|1120->320|1236->409|1264->410|1292->411|1344->435|1373->436|1432->468|1443->470|1640->645|1676->654|1838->789|1885->815|1956->859|2000->882|2059->914|2070->916|2282->1106|2318->1115|2486->1256|2533->1282|2592->1314|2603->1316|2783->1474|2820->1484|3004->1640|3045->1659|3149->1736|3194->1760|3223->1761|3271->1782|3316->1805|3377->1839|3424->1877|3464->1879|3505->1892|3583->1943|3629->1968|3700->2012|3751->2047|3791->2049|3840->2070|3895->2098|3905->2099|3929->2102|3977->2123|3987->2124|4011->2127|4048->2137|4084->2151|4125->2164|4141->2170|4206->2213|4269->2248|4305->2262|4360->2286|4405->2303|4471->2338|4503->2343
                  LINES: 20->1|26->1|28->5|29->6|30->7|30->7|31->8|31->8|31->8|31->8|31->8|33->10|33->10|33->10|34->11|35->12|35->12|36->13|36->13|39->16|39->16|39->16|40->17|41->18|41->18|44->21|44->21|44->21|46->23|47->24|47->24|51->28|51->28|51->28|51->28|51->28|54->31|54->31|54->31|55->32|56->33|56->33|58->35|58->35|58->35|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|60->37|61->38|63->40|64->41
                  -- GENERATED --
              */
          