
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
object KeliaMoniz extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/Main("Kelia")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
<div class="container">
  <div class="row">

    <div class="col-md-4">
      <div class="well">
      <div class="kelia"></div>
      </div>
    </div>

    <div class="col-md-8">
      <div class="well">
      <h2>Kelia Moniz</h2>
      <p>Multi-talented Japanese, Hawaiian, Portuguese, Chinese, Irish beauty Kelia Moniz grew up in a surfing family that
      spends more time in the water than on land. Raised with four brothers and an ex-professional surfer for a father,
      Kelia (known by friends and family as Sister) definitely knows how to surf with the boys. She proved her merit
      last year by being the only girl to make it to the semifinals in the noseriding event at the Corona Hawaiian Open.
      </p>
      <p>Growing up on Oahu, Kelia began surfing at the age of five and spent most of her life as a longboarder, recently
      adding shortboarding to her repeptoire in order to enjoy riding with her brothers. Her family's strong bond and
      ties to surfing - they own and operate Faith Surf School in Waikiki and all of the children are homeschooled -
      have been an important influence in her life, both in and out of the water. When asked about her favorite surf
      memory, Kelia quickly responds, "watching my Dad teach a man with no arms or legs to surf, it was absolutely
      amazing!"</p>
      <p>A born competitor, Kelia began her amateur career amongst her brothers and friends in unofficial
      contests organized and judged by her father. Recently, Kelia has been boldly competing against top adult pros in
      contests across the globe, including Europe and California. This past year she has demonstrated her contest
      prowess on both a longboard and shortboard with a second place finish in the Roxy Jam Honolulu (longboard) and a
      first place finish at the NSSA High School Nationals (shortboard). The ease with which she competes on both a long
      and short board makes Kelia a force to watch in the coming years.</p>
</div>
    </div>

  </div>
</div>
""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 22:31:23 HST 2014
                    SOURCE: /Users/eduardgamiao/Desktop/ICS414/Mepedia/app/views/KeliaMoniz.scala.html
                    HASH: 741c528058b5854c4a1e9739134864556f6f9e7d
                    MATRIX: 869->1|890->14|929->16|2986->2042
                    LINES: 29->1|29->1|29->1|64->36
                    -- GENERATED --
                */
            