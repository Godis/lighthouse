package com.godis.lighthouse.web

import javax.inject.Singleton

import com.google.inject.Inject
import controllers.Assets
import play.api.mvc.{Action, AnyContent, InjectedController}

@Singleton
class ResourceController @Inject()(assets: Assets) extends InjectedController {

  def resource(folder: String, file: String): Action[AnyContent] = assets.at("/public", s"$folder/$file")
}
