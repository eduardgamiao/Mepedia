// @SOURCE:/Users/eduardgamiao/Desktop/ICS414/Mepedia/conf/routes
// @HASH:75484cb6a6ddb613f1f332f85fd50a21d19b6c2b
// @DATE:Fri Jan 10 22:31:22 HST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def manuel(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "manuel")
}
                                                

// @LINE:10
def joyce(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "joyce")
}
                                                

// @LINE:7
def ho(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ho")
}
                                                

// @LINE:12
def kolohe(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kolohe")
}
                                                

// @LINE:11
def kelia(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kelia")
}
                                                

// @LINE:9
def devault(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "devault")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def manuel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.manuel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manuel"})
      }
   """
)
                        

// @LINE:10
def joyce : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.joyce",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "joyce"})
      }
   """
)
                        

// @LINE:7
def ho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ho",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ho"})
      }
   """
)
                        

// @LINE:12
def kolohe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kolohe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kolohe"})
      }
   """
)
                        

// @LINE:11
def kelia : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kelia",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kelia"})
      }
   """
)
                        

// @LINE:9
def devault : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.devault",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "devault"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def manuel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.manuel(), HandlerDef(this, "controllers.Application", "manuel", Seq(), "GET", """""", _prefix + """manuel""")
)
                      

// @LINE:10
def joyce(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.joyce(), HandlerDef(this, "controllers.Application", "joyce", Seq(), "GET", """""", _prefix + """joyce""")
)
                      

// @LINE:7
def ho(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ho(), HandlerDef(this, "controllers.Application", "ho", Seq(), "GET", """""", _prefix + """ho""")
)
                      

// @LINE:12
def kolohe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kolohe(), HandlerDef(this, "controllers.Application", "kolohe", Seq(), "GET", """""", _prefix + """kolohe""")
)
                      

// @LINE:11
def kelia(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kelia(), HandlerDef(this, "controllers.Application", "kelia", Seq(), "GET", """""", _prefix + """kelia""")
)
                      

// @LINE:9
def devault(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.devault(), HandlerDef(this, "controllers.Application", "devault", Seq(), "GET", """""", _prefix + """devault""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    