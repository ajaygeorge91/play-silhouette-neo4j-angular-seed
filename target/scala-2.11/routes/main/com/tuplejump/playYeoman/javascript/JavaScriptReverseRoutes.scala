
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/ajay/D/my_projects/play-silhouette-angular-seed-2/conf/routes
// @DATE:Mon Sep 28 10:26:16 IST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package com.tuplejump.playYeoman.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseYeoman(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.tuplejump.playYeoman.Yeoman.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}