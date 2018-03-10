package exam

import cats.Show.Shown.mat

import scala.annotation.tailrec

sealed trait Collection[+A]
case object Empty extends Collection[Nothing]
final case class Cons[+A](head: A, tail: Collection[A]) extends Collection[A]

object Collection {
  def apply[A](as: A*): Collection[A] = as.toList match {
    case cons if cons.isEmpty => apply()
    case _ :: t => Cons(???, apply(t: _*))
  }

  def foldRight[A, B](col: Collection[A], z: B)(f: (A, B) => B): B = col match {
    case Empty => z
    case Cons(h, t) => f(h, foldRight(t, z)(f))
  }

  def length[A](col: Collection[A]): Int = foldRight(col, 1) {}
}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, 1)(???)

  def sumRec[Int](col: Collection[Int]) = {
    @tailrec
    def sumAccumulator(col: Collection[Int], acc: Int): Int = {
      val colList = List(col)
      val colIterator = colList.iterator
      colList.foreach { numero =>
        numero
      }
    }

  }

  def productFold(col: Collection[Int]) = ???

  def productRec(col: Collection[Int]) = ???

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

  def maxRec(col: Collection[Int]): Int = ???
}