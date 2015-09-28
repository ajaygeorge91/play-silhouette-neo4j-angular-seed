
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navigation_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class navigation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<div class="navigation-area" ng-controller="NavigationCtrl">
    <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" ng-init="navCollapsed = true" ng-click="navCollapsed = !navCollapsed">
                    <span class="sr-only">"""),_display_(/*8.44*/Messages("toggle.navigation")),format.raw/*8.73*/("""</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand">Silhouette Play Angular Seed</a>
            </div>
            <div class="collapse navbar-collapse" ng-class=""""),format.raw/*15.61*/("""{"""),format.raw/*15.62*/(""" """),format.raw/*15.63*/("""in: !navCollapsed """),format.raw/*15.81*/("""}"""),format.raw/*15.82*/("""" ng-click="navCollapsed = !navCollapsed">
                <ul class="nav navbar-nav">
                    <!-- User is logged in -->
                    <li ng-if="isAuthenticated()"><a ui-sref="home">"""),_display_(/*18.70*/Messages("home")),format.raw/*18.86*/("""</a></li>

                    <!-- User is logged out -->
                    <li ng-if="!isAuthenticated()"><a ui-sref="signIn">"""),_display_(/*21.73*/Messages("home")),format.raw/*21.89*/("""</a></li>

                    <li><a href="https://github.com/mohiva/play-silhouette-angular-seed">GitHub</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <!-- User is logged in -->
                    <li ng-if="isAuthenticated()"><a ui-sref="home">"""),format.raw/*27.69*/("""{"""),format.raw/*27.70*/("""{"""),format.raw/*27.71*/("""user.fullName ? user.fullName : user.firstName"""),format.raw/*27.117*/("""}"""),format.raw/*27.118*/("""}"""),format.raw/*27.119*/("""</a></li>
                    <li ng-if="isAuthenticated()" ui-sref="signOut"><a href="">"""),_display_(/*28.81*/Messages("sign.out")),format.raw/*28.101*/("""</a></li>

                    <!-- User is logged out -->
                    <li ng-if="!isAuthenticated()"><a ui-sref="signIn">"""),_display_(/*31.73*/Messages("sign.in")),format.raw/*31.92*/("""</a></li>
                    <li ng-if="!isAuthenticated()"><a ui-sref="signUp">"""),_display_(/*32.73*/Messages("sign.up")),format.raw/*32.92*/("""</a></li>
                </ul>
            </div>
        </div>
    </header>
</div>
"""))
      }
    }
  }

  def render(messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(messages)

  def f:(() => (Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (messages) => apply()(messages)

  def ref: this.type = this

}


}

/**/
object navigation extends navigation_Scope0.navigation
              /*
                  -- GENERATED --
                  DATE: Wed Sep 16 10:08:00 IST 2015
                  SOURCE: /media/ajay/D/my_projects/play-silhouette-angular-seed-2/app/views/navigation.scala.html
                  HASH: 84e0e43aba08786ffbfe0e4697bbf7d9224366d9
                  MATRIX: 539->1|665->32|693->34|1104->419|1153->448|1520->787|1549->788|1578->789|1624->807|1653->808|1883->1011|1920->1027|2078->1158|2115->1174|2453->1484|2482->1485|2511->1486|2586->1532|2616->1533|2646->1534|2763->1624|2805->1644|2963->1775|3003->1794|3112->1876|3152->1895
                  LINES: 20->1|25->1|27->3|32->8|32->8|39->15|39->15|39->15|39->15|39->15|42->18|42->18|45->21|45->21|51->27|51->27|51->27|51->27|51->27|51->27|52->28|52->28|55->31|55->31|56->32|56->32
                  -- GENERATED --
              */
          