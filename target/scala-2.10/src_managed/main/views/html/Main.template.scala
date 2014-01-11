
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
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

<!DOCTYPE html>

<html>
<head>
<title>"""),_display_(Seq[Any](/*7.9*/page)),format.raw/*7.13*/("""</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!--  Load site-specific customizations after bootstrap. -->
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("stylesheets/main.css"))),format.raw/*12.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.51*/routes/*13.57*/.Assets.at("images/favicon.png"))),format.raw/*13.89*/("""">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
</head>
<body>

  <div class="header"></div>

  <!-- Responsive navbar -->
  <div class="navbar navbar-inverse" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">surferpedia</a>
      </div>

      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">

          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Males<b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*41.29*/routes/*41.35*/.Application.ho())),format.raw/*41.52*/("""">Micheal Ho</a></li>
              <li><a href=""""),_display_(Seq[Any](/*42.29*/routes/*42.35*/.Application.kolohe())),format.raw/*42.56*/("""">Kolohe Andino</a></li>
            </ul>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Females<b
              class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*47.29*/routes/*47.35*/.Application.manuel())),format.raw/*47.56*/("""">Malia Manuel</a></li>
              <li><a href=""""),_display_(Seq[Any](/*48.29*/routes/*48.35*/.Application.joyce())),format.raw/*48.55*/("""">Joyce Hoffman</a></li>
              <li><a href=""""),_display_(Seq[Any](/*49.29*/routes/*49.35*/.Application.kelia())),format.raw/*49.55*/("""">Kelia Moniz</a></li>
            </ul></li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Groms<b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*53.29*/routes/*53.35*/.Application.devault())),format.raw/*53.57*/("""">Imaikalani DeVault</a></li>
            </ul></li>
        </ul>
      </div>
    </div>
  </div>
  """),_display_(Seq[Any](/*59.4*/content)),format.raw/*59.11*/("""
  <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
  <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</body>
</html>
"""))}
    }
    
    def render(page:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 22:31:23 HST 2014
                    SOURCE: /Users/eduardgamiao/Desktop/ICS414/Mepedia/app/views/Main.scala.html
                    HASH: cdc5efce2d37c956cb9fe94eb7d989e37d414c8c
                    MATRIX: 778->1|901->30|976->71|1001->75|1324->362|1339->368|1395->402|1484->455|1499->461|1553->493|2764->1668|2779->1674|2818->1691|2904->1741|2919->1747|2962->1768|3257->2027|3272->2033|3315->2054|3403->2106|3418->2112|3460->2132|3549->2185|3564->2191|3606->2211|3888->2457|3903->2463|3947->2485|4085->2588|4114->2595
                    LINES: 26->1|29->1|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|69->41|69->41|69->41|70->42|70->42|70->42|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|81->53|81->53|81->53|87->59|87->59
                    -- GENERATED --
                */
            