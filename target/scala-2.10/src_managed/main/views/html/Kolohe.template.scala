
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
object Kolohe extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/Main("Kolohe Andino")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""
<div class="container">
  <div class="row">
    <div class="col-md-4">
      <div class="well">
        <div class="kolohe-andino"></div>
      </div>
    </div>
    <div class="col-md-8">
      <div class="well">
        <h3>Kalohe Andino</h3>
        <p>Kolohe Andino (born March 22, 1994 in San Clemente, California) is an American surfer. He began to surf
          at age 10 and holds the record for the most National Scholastic Surfing Association championships won by a
          male competitor (9) . He won both the ASP 6-Star Quicksilver Brazil Open of Surfing[1] and the Vans Pier
          Classic world tour events in 2011. Andino's sponsors include Oakley eyewear and Hurley wetsuits and clothing.</p>
      </div>
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
                    SOURCE: /Users/eduardgamiao/Desktop/ICS414/Mepedia/app/views/Kolohe.scala.html
                    HASH: e6618385764f418127190772a966394a5ab90689
                    MATRIX: 865->1|894->22|933->24|1722->782
                    LINES: 29->1|29->1|29->1|48->20
                    -- GENERATED --
                */
            