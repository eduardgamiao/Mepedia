
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
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/Main("Surferpedia")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""
<div class="container">
  <div id="carousel-example-generic" class="carousel slide">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-example-generic" data-slide-to="1"></li>
      <li data-target="#carousel-example-generic" data-slide-to="2"></li>
      <li data-target="#carousel-example-generic" data-slide-to="3"></li>
      <li data-target="#carousel-example-generic" data-slide-to="4"></li>
      <li data-target="#carousel-example-generic" data-slide-to="5"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <div class="ho"></div>
        <div class="carousel-caption">
          <h3>Micheal Ho</h3>
        </div>
      </div>
      <div class="item">
        <div class="malia"></div>
        <div class="carousel-caption">
          <h3>Malia Manuel</h3>
        </div>
      </div>
      <div class="item">
        <div class="devault"></div>
        <div class="carousel-caption">
          <h3>Imaikalani DeVault</h3>
        </div>
      </div>
      <div class="item">
        <div class="joyce"></div>
        <div class="carousel-caption">
          <h3>Joyce Hoffman</h3>
        </div>
      </div>
      <div class="item">
        <div class="kelia"></div>
        <div class="carousel-caption">
          <h3>Kelia Moniz</h3>
        </div>
      </div>
      <div class="item">
        <div class="kolohe-andino"></div>
        <div class="carousel-caption">
          <h3>Kolohe Andino</h3>
        </div>
      </div>



    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> <span class="icon-prev"></span>
    </a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> <span class="icon-next"></span>
    </a>
  </div>
</div>
""")))})),format.raw/*63.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 22:31:23 HST 2014
                    SOURCE: /Users/eduardgamiao/Desktop/ICS414/Mepedia/app/views/Index.scala.html
                    HASH: 33b7c9aec670c56c6b534c6a853dc481e6953f10
                    MATRIX: 864->1|891->20|930->22|2921->1982
                    LINES: 29->1|29->1|29->1|91->63
                    -- GENERATED --
                */
            