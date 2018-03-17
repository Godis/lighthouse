package uk.org.godis.deploy

import play.api.libs.json.{Json, OFormat}

case class Deployable(push_data: PushData)
object Deployable {
  implicit val format: OFormat[Deployable] = Json.format[Deployable]
}

case class PushData(tag: String)
object PushData {
  implicit val format: OFormat[PushData] = Json.format[PushData]
}
