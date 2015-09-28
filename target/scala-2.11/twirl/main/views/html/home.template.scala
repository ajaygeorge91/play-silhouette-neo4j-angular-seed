
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<div class="user col-md-6 col-md-offset-3" ng-controller="HomeCtrl" ng-init="init()">
    <div class="row">
        <hr class="col-md-12" />
        <h4 class="col-md-8">"""),_display_(/*6.31*/Messages("welcome.signed.in")),format.raw/*6.60*/("""</h4>
        <div class="col-md-4 text-right">
            <img ng-if="!user.avatarURL" src=""""),_display_(/*8.48*/routes/*8.54*/.Assets.at("images/silhouette.png")),format.raw/*8.89*/("""" height="40px" />
            <img ng-if="user.avatarURL" ng-src=""""),format.raw/*9.49*/("""{"""),format.raw/*9.50*/("""{"""),format.raw/*9.51*/("""user.avatarURL"""),format.raw/*9.65*/("""}"""),format.raw/*9.66*/("""}"""),format.raw/*9.67*/("""" height="40px" />
        </div>
        <hr class="col-md-12" />
    </div>
    <div class="row data">
        <div class="col-md-12">
            <div class="row">
                <p class="col-md-6"><strong>"""),_display_(/*16.46*/Messages("first.name")),format.raw/*16.68*/(""":</strong></p><p class="col-md-6">"""),format.raw/*16.102*/("""{"""),format.raw/*16.103*/("""{"""),format.raw/*16.104*/("""user.firstName ? user.firstName : 'None'"""),format.raw/*16.144*/("""}"""),format.raw/*16.145*/("""}"""),format.raw/*16.146*/("""</p>
            </div>
            <div class="row">
                <p class="col-md-6"><strong>"""),_display_(/*19.46*/Messages("last.name")),format.raw/*19.67*/(""":</strong></p><p class="col-md-6">"""),format.raw/*19.101*/("""{"""),format.raw/*19.102*/("""{"""),format.raw/*19.103*/("""user.lastName ? user.lastName : 'None'"""),format.raw/*19.141*/("""}"""),format.raw/*19.142*/("""}"""),format.raw/*19.143*/("""</p>
            </div>
            <div class="row">
                <p class="col-md-6"><strong>"""),_display_(/*22.46*/Messages("full.name")),format.raw/*22.67*/(""":</strong></p><p class="col-md-6">"""),format.raw/*22.101*/("""{"""),format.raw/*22.102*/("""{"""),format.raw/*22.103*/("""user.fullName ? user.fullName : 'None'"""),format.raw/*22.141*/("""}"""),format.raw/*22.142*/("""}"""),format.raw/*22.143*/("""</p>
            </div>
            <div class="row">
                <p class="col-md-6"><strong>"""),_display_(/*25.46*/Messages("email")),format.raw/*25.63*/(""":</strong></p><p class="col-md-6">"""),format.raw/*25.97*/("""{"""),format.raw/*25.98*/("""{"""),format.raw/*25.99*/("""user.email ? user.email : 'None'"""),format.raw/*25.131*/("""}"""),format.raw/*25.132*/("""}"""),format.raw/*25.133*/("""</p>
            </div>
        </div>
    </div>
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 10:34:44 IST 2015
                  SOURCE: /media/ajay/D/my_projects/play-silhouette-angular-seed-2/app/views/home.scala.html
                  HASH: 750e6613d0c8bf8740eb281aae3d34a5be3bb295
                  MATRIX: 527->1|653->32|681->34|878->205|927->234|1048->329|1062->335|1117->370|1211->437|1239->438|1267->439|1308->453|1336->454|1364->455|1603->667|1646->689|1709->723|1739->724|1769->725|1838->765|1868->766|1898->767|2024->866|2066->887|2129->921|2159->922|2189->923|2256->961|2286->962|2316->963|2442->1062|2484->1083|2547->1117|2577->1118|2607->1119|2674->1157|2704->1158|2734->1159|2860->1258|2898->1275|2960->1309|2989->1310|3018->1311|3079->1343|3109->1344|3139->1345
                  LINES: 20->1|25->1|27->3|30->6|30->6|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|33->9|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|43->19|43->19|43->19|43->19|43->19|43->19|43->19|43->19|46->22|46->22|46->22|46->22|46->22|46->22|46->22|46->22|49->25|49->25|49->25|49->25|49->25|49->25|49->25|49->25
                  -- GENERATED --
              */
          