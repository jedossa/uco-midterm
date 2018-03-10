package exam

import scala.annotation.tailrec

sealed trait Collection[+A]
case object Empty extends Collection[Nothing]
final case class Cons[+A](head: A, tail: Collection[A]) extends Collection[A]

object Collection {
  def apply[A](as: A*): Collection[A] = as.toList match {
    case cons if cons.isEmpty => ???
    case _ :: t => Cons(???, apply(t: _*))
  }

  def foldRight[A, B](col: Collection[A], z: B)(f: (A, B) => B): B = col match {
    case Empty => ???
    case Cons(_, t) => f(???, foldRight(t, z)(???))
  }

  def length(col: Collection): Int = foldRight(col, ???) { ??? }
}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, ???)(???)

  def sumRec(col: Collection[Int]) = {
    @tailrec
    def sumAccumulator = ???
    ???
  }

  def productFold(col: Collection[Int]) = ???

  def productRec(col: Collection[Int]) = ???

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

  def maxRec(col: Collection[Int]): Int = ???
}