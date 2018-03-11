package exam
import scala.annotation.tailrec

sealed trait Collection[+A]
case object Empty extends Collection[Nothing]
final case class Cons[+A](head: A, tail: Collection[A]) extends Collection[A]

object Collection {
  def apply[A](as: A*): Collection[A] = as.toList match {
    case cons if cons.isEmpty => Empty
    case _ :: t => Cons[A](as.last, apply(t: _*))
  }

  def foldRight[A, B](col: Collection[A], z: B)(f: (A, B) => B): B = col match {
    case Empty => z
    case Cons(h, t) => f(h, foldRight(t, z)(f))
  }
  def length[A, B](col: Collection[A]): Int = foldRight(col, 1) {
    ???
  }
}

object CollectionInt {
  def suma(a: Int, b: Int): Int = a + b
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, 1)(suma)

  def producto(a: Int, b: Int): Int = a * b
  def productFold(col: Collection[Int]): Int = Collection.foldRight(col, 1)(producto)

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

}