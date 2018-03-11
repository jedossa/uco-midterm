package exam

import scala.annotation.tailrec

sealed trait Collection[+A]
case object Empty extends Collection[Nothing]
final case class Cons[+A](head: A, tail: Collection[A]) extends Collection[A]

object Collection {
  def apply[A](as: A*): Collection[A] = as.toList match {
    case cons if cons.isEmpty => Empty
    case h :: t => Cons(h, apply(t: _*))
  }

  def foldRight[A, B](col: Collection[A], z: B)(f: (A, B) => B): B = col match {
    case Empty => z
    case Cons(h, t) => f(h, foldRight(t, z)(f))
  }

  def length[A](col: Collection[A]): Int = foldRight(col, 0) { (_, t) => t + 1 }
}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, 0)(_ + _)

  def sumRec(col: Collection[Int]) = {
    @tailrec
    def sumAccumulator(elm: Collection[Int], total: Int): Int = {
      elm match {
        case Empty => total
        case Cons(h, t) => sumAccumulator(t, total + h)
      }
    }
    sumAccumulator(col, 0)
  }

  def productFold(col: Collection[Int]) = Collection.foldRight(col, 1)(_ * _)

  def productRec(col: Collection[Int]) = {
    @tailrec
    def productAccumulator(elm: Collection[Int], total: Int): Int = {
      elm match {
        case Empty => total
        case Cons(h, t) => productAccumulator(t, total * h)
      }
    }
    productAccumulator(col, 1)
  }

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

  def maxRec(col: Collection[Int]): Int = {
    @tailrec
    def maxAccumulator(elm: Collection[Int], total: Int): Int = {
      elm match {
        case Empty => total
        case Cons(h, t) => maxAccumulator(t, total max h)
      }
    }
    maxAccumulator(col, Integer.MIN_VALUE)
  }
}