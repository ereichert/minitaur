package controllers

import javax.inject.{ Inject, Singleton }

import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc.Controller

@Singleton
class ImagesController @Inject() (
    val messagesApi: MessagesApi,
    implicit val wja: WebJarAssets
) extends Controller with I18nSupport {

}
