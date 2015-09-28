
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signUp_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.inline.fieldConstructor
import forms.SignUpForm.form

Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<fieldset class="col-md-6 col-md-offset-3" ng-controller="SignUpCtrl">
    <legend >"""),_display_(/*7.15*/Messages("sign.up.account")),format.raw/*7.42*/("""</legend>
    <form name="form" id="sign-up-form" ng-submit="submit()" ng-model-options=""""),format.raw/*8.80*/("""{"""),format.raw/*8.81*/(""" """),format.raw/*8.82*/("""updateOn: 'submit blur' """),format.raw/*8.106*/("""}"""),format.raw/*8.107*/("""" autocomplete="off">

        """),_display_(/*10.10*/b3/*10.12*/.text(form("firstName"), '_hiddenLabel -> Messages("first.name"), 'placeholder -> Messages("first.name"), 'class -> "form-control input-lg", 'required -> "", Symbol("ng-model") -> "firstName")),format.raw/*10.204*/("""
        """),format.raw/*11.9*/("""<div class="help-block text-danger" ng-if="form.firstName.$dirty" ng-messages="form.firstName.$error">
            <div ng-message="required">"""),_display_(/*12.41*/Messages("error.required")),format.raw/*12.67*/("""</div>
        </div>

        """),_display_(/*15.10*/b3/*15.12*/.text(form("lastName"), '_hiddenLabel -> Messages("last.name"), 'placeholder -> Messages("last.name"), 'class -> "form-control input-lg", 'required -> "", Symbol("ng-model") -> "lastName")),format.raw/*15.200*/("""
        """),format.raw/*16.9*/("""<div class="help-block text-danger" ng-if="form.lastName.$dirty" ng-messages="form.lastName.$error">
            <div ng-message="required">"""),_display_(/*17.41*/Messages("error.required")),format.raw/*17.67*/("""</div>
        </div>

        """),_display_(/*20.10*/b3/*20.12*/.text(form("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg", 'required -> "", Symbol("ng-model") -> "email")),format.raw/*20.186*/("""
        """),format.raw/*21.9*/("""<div class="help-block text-danger" ng-if="form.email.$dirty" ng-messages="form.email.$error">
            <div ng-message="required">"""),_display_(/*22.41*/Messages("error.required")),format.raw/*22.67*/("""</div>
            <div ng-message="email">"""),_display_(/*23.38*/Messages("error.email")),format.raw/*23.61*/("""</div>
        </div>

        """),_display_(/*26.10*/b3/*26.12*/.password(form("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg", 'required -> "", Symbol("ng-model") -> "password")),format.raw/*26.202*/("""
        """),format.raw/*27.9*/("""<div class="help-block text-danger" ng-if="form.password.$dirty" ng-messages="form.password.$error">
            <div ng-message="required">"""),_display_(/*28.41*/Messages("error.required")),format.raw/*28.67*/("""</div>
        </div>

        <div class="form-group">
            <button ng-disabled="form.$invalid" id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*32.132*/Messages("sign.up")),format.raw/*32.151*/("""</button>
        </div>

        <div>
            <p class="already-member">"""),_display_(/*36.40*/Messages("already.a.member")),format.raw/*36.68*/(""" """),format.raw/*36.69*/("""<a ui-sref="signIn">"""),_display_(/*36.90*/Messages("sign.in.now")),format.raw/*36.113*/("""</a></p>
        </div>
    </form>
</fieldset>
"""))
      }
    }
  }

  def render(request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(request,messages)

  def f:(() => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (request,messages) => apply()(request,messages)

  def ref: this.type = this

}


}

/**/
object signUp extends signUp_Scope0.signUp
              /*
                  -- GENERATED --
                  DATE: Wed Sep 16 10:08:00 IST 2015
                  SOURCE: /media/ajay/D/my_projects/play-silhouette-angular-seed-2/app/views/signUp.scala.html
                  HASH: 7f11edf5d5c7f6b20787da7194a0d07275d6eb37
                  MATRIX: 545->1|757->56|785->123|812->124|923->209|970->236|1086->325|1114->326|1142->327|1194->351|1223->352|1282->384|1293->386|1507->578|1543->587|1713->730|1760->756|1819->788|1830->790|2040->978|2076->987|2244->1128|2291->1154|2350->1186|2361->1188|2557->1362|2593->1371|2755->1506|2802->1532|2873->1576|2917->1599|2976->1631|2987->1633|3199->1823|3235->1832|3403->1973|3450->1999|3665->2186|3706->2205|3812->2284|3861->2312|3890->2313|3938->2334|3983->2357
                  LINES: 20->1|26->1|28->5|29->6|30->7|30->7|31->8|31->8|31->8|31->8|31->8|33->10|33->10|33->10|34->11|35->12|35->12|38->15|38->15|38->15|39->16|40->17|40->17|43->20|43->20|43->20|44->21|45->22|45->22|46->23|46->23|49->26|49->26|49->26|50->27|51->28|51->28|55->32|55->32|59->36|59->36|59->36|59->36|59->36
                  -- GENERATED --
              */
          