import akka.actor.{ActorSystem, Props}

object Chess {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem.create("chess")
    val chessController = actorSystem.actorOf(Props[ControllerActor], "controller")
    println(chessController)

    val game = new Game()
    game.run
  }

  def setupControllerActor(): Unit = {
    val actorSystem = ActorSystem.create("chess")
    val chessController = actorSystem.actorOf(Props[ControllerActor], "controller")
    println(chessController)
  }
}
