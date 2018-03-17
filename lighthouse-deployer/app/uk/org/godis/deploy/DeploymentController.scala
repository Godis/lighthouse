package uk.org.godis.deploy

import play.api.libs.json.JsValue
import play.api.mvc.{Action, InjectedController}

import scala.concurrent.ExecutionContext.Implicits.global

class DeploymentController extends InjectedController {

  def deploy(): Action[JsValue] = Action.async(parse.json) { request =>

    val deployable = request.body.as[Deployable]
    DeploymentService.deploy(deployable).map(_ => Ok)
  }
}