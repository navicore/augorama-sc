package navicore.augorama

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import com.typesafe.scalalogging.LazyLogging
import navicore.augorama.models.JsonSupport
import navicore.augorama.routes.{ApiRoute, ApiSegmentRoute}
import Conf._

object Main extends LazyLogging with JsonSupport with ErrorSupport {

  def main(args: Array[String]) {

    val route =
      HealthCheck ~
        ApiRoute.apply ~
        ApiSegmentRoute.apply

    Http().bindAndHandle(route, "0.0.0.0", port)
  }

}
