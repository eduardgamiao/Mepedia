// @SOURCE:/Users/eduardgamiao/Desktop/ICS414/Mepedia/conf/routes
// @HASH:75484cb6a6ddb613f1f332f85fd50a21d19b6c2b
// @DATE:Fri Jan 10 22:31:22 HST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_ho1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ho"))))
        

// @LINE:8
private[this] lazy val controllers_Application_manuel2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("manuel"))))
        

// @LINE:9
private[this] lazy val controllers_Application_devault3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("devault"))))
        

// @LINE:10
private[this] lazy val controllers_Application_joyce4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("joyce"))))
        

// @LINE:11
private[this] lazy val controllers_Application_kelia5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kelia"))))
        

// @LINE:12
private[this] lazy val controllers_Application_kolohe6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kolohe"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ho""","""controllers.Application.ho()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """manuel""","""controllers.Application.manuel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """devault""","""controllers.Application.devault()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """joyce""","""controllers.Application.joyce()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kelia""","""controllers.Application.kelia()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kolohe""","""controllers.Application.kolohe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_ho1(params) => {
   call { 
        invokeHandler(controllers.Application.ho(), HandlerDef(this, "controllers.Application", "ho", Nil,"GET", """""", Routes.prefix + """ho"""))
   }
}
        

// @LINE:8
case controllers_Application_manuel2(params) => {
   call { 
        invokeHandler(controllers.Application.manuel(), HandlerDef(this, "controllers.Application", "manuel", Nil,"GET", """""", Routes.prefix + """manuel"""))
   }
}
        

// @LINE:9
case controllers_Application_devault3(params) => {
   call { 
        invokeHandler(controllers.Application.devault(), HandlerDef(this, "controllers.Application", "devault", Nil,"GET", """""", Routes.prefix + """devault"""))
   }
}
        

// @LINE:10
case controllers_Application_joyce4(params) => {
   call { 
        invokeHandler(controllers.Application.joyce(), HandlerDef(this, "controllers.Application", "joyce", Nil,"GET", """""", Routes.prefix + """joyce"""))
   }
}
        

// @LINE:11
case controllers_Application_kelia5(params) => {
   call { 
        invokeHandler(controllers.Application.kelia(), HandlerDef(this, "controllers.Application", "kelia", Nil,"GET", """""", Routes.prefix + """kelia"""))
   }
}
        

// @LINE:12
case controllers_Application_kolohe6(params) => {
   call { 
        invokeHandler(controllers.Application.kolohe(), HandlerDef(this, "controllers.Application", "kolohe", Nil,"GET", """""", Routes.prefix + """kolohe"""))
   }
}
        

// @LINE:15
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     