
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
object Devault extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/Main("Imaikalani DeVault")/*1.28*/ {_display_(Seq[Any](format.raw/*1.30*/("""
<div class="container">
  <div class="row">
    <div class="col-md-4">
      <div class="well">
        <div class="devault"></div>
      </div>
    </div>
    <div class="well col-md-8">
      <h3>Imaikalani DeVault</h3>
      <p>The Valley Isle's Imaikalani DeValult is yet another contender from Maui poised to break onto the world
        stage. Like so many of the other Maui boys that came before him, Imai's stomping grounds are the rippable peaks
        of Ho'okipa. Above the lip, he's on the same level as many of his peers and his style is downright buttery.
        Although he's had some solid results in the past, for Imaikalani to further his career to the next level, he'll
        need to make another hard push on the contest scene next year. Lucky for him, he's got Volcom's esteemed coach,
        Dave Riddle, in his corner lighting the path ahead.</p>
    </div>
  </div>
</div>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 22:31:23 HST 2014
                    SOURCE: /Users/eduardgamiao/Desktop/ICS414/Mepedia/app/views/Devault.scala.html
                    HASH: cc0559e8c566680613dc5db5a16642f1ccdcd999
                    MATRIX: 866->1|900->27|939->29|1874->933
                    LINES: 29->1|29->1|29->1|48->20
                    -- GENERATED --
                */
            