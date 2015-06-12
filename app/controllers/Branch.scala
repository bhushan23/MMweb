package controllers

import play.api.mvc._
import akka.actor.Props
import actors._
import play.api.libs.json.JsValue
import play.api.libs.iteratee.{Concurrent, Iteratee}
import play.api.Play.current
import akka.util.Timeout
import play.twirl.api.Html
import scala.concurrent.duration._
import utils.IpAddress
import json.JsonFormats._
import actors.StreamMergingActor.OrientationChangeEvent


object Branch extends Controller {

def menu(branchId:Int) = Action {
    Ok(views.html.menu(branchId+4))
    //Redirect(routes.Application.branchmenu(branchId))
}

}