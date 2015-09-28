
package views.html.fields

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object constructor_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class constructor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[views.html.helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: views.html.helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/field/*3.7*/.input),format.raw/*3.13*/("""
"""))
      }
    }
  }

  def render(field:views.html.helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(field)

  def f:((views.html.helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (field) => apply(field)

  def ref: this.type = this

}


}

/**/
object constructor extends constructor_Scope0.constructor
              /*
                  -- GENERATED --
                  DATE: Wed Sep 16 10:08:00 IST 2015
                  SOURCE: /media/ajay/D/my_projects/play-silhouette-angular-seed-2/app/views/fields/constructor.scala.html
                  HASH: c138b320cbe9fa142141a68f6e2475e80a35264c
                  MATRIX: 571->1|706->41|734->44|746->49|772->55
                  LINES: 20->1|25->1|27->3|27->3|27->3
                  -- GENERATED --
              */
          