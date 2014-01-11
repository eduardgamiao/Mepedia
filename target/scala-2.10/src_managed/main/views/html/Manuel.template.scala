
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Manuel extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/Main("Malia Manuel")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""
<div class="container">
  <div class="row">
    <div class="col-md-4">
      <div class="well">
        <div class="malia"></div>
      </div>
    </div>
    <div class="col-md-8">
      <div class="well">
        <h3>Malia Manuel</h3>
        <p>Malia Manuel hasn't been a surfer for that long. Let's be honest, surfer Malia Manuel hasn't been a kid
          for too long. At 14, Malia is the new Women's Honda U.S. Open of Surfing presented by O'Neill champion. Malia
          was part of the youngest women's final at the Women's Honda U.S. Open of Surfing presented by O'Neill in
          Huntington Beach and took top prize winning with a two-wave score of 14.34 points. Malia was surprised by her
          string of upsets and overall victory since it was her first open and her first ever 2-person surfing heat.</p>
      </div>
    </div>
  </div>
</div>
""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 22:31:23 HST 2014
                    SOURCE: /Users/eduardgamiao/Desktop/ICS414/Mepedia/app/views/Manuel.scala.html
                    HASH: bfd52d6ba2b53c5d4183532105b1cd766340fe86
                    MATRIX: 865->1|893->21|932->23|1832->892
                    LINES: 29->1|29->1|29->1|49->21
                    -- GENERATED --
                */
            