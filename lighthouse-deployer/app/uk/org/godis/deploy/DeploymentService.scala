package uk.org.godis.deploy

import scala.concurrent.{ExecutionContext, Future}
import sys.process._

object DeploymentService {

  def deploy(deployable: Deployable)(implicit ec: ExecutionContext): Future[Unit] = Future {
    val tag = deployable.push_data.tag
    val result = s"docker service update --image godis/lighthouse:$tag lighthouse".!!
    println(result)
  }
}
