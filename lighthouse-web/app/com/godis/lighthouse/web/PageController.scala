package com.godis.lighthouse.web

import javax.inject.Singleton

import com.google.inject.Inject
import controllers.Assets
import play.api.mvc.{Action, AnyContent, InjectedController}

@Singleton
class PageController @Inject()(assets: Assets) extends InjectedController {

  def page(folder: String): Action[AnyContent] = assets.at("/public", s"$folder/$folder.html")
}
