package navicore.augorama

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.typesafe.config.{Config, ConfigFactory}

import scala.concurrent.ExecutionContextExecutor

object Conf {

  val conf: Config = ConfigFactory.load()
  val appName: String = conf.getString("main.appName")

  // akka
  implicit val system: ActorSystem = ActorSystem(s"$appName-system")
  implicit val materializer: ActorMaterializer = ActorMaterializer()
  implicit val executionContext: ExecutionContextExecutor = system.dispatcher

  // http
  val urlpath: String = conf.getString("main.path")
  val port: Int = conf.getInt("main.port")

}
