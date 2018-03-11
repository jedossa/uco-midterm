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

  def length(col: Collection[_]): Int = foldRight(col, 0) { case (_, z) => z + 1 }
}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, 0)(_ + _)

  def sumRec(col: Collection[Int]): Int = {
    @tailrec
    def sumAccumulator(col: Collection[Int], acc: Int): Int = {
      col match {
        case Empty => acc
        case Cons(h, t) => sumAccumulator(t, acc + h)
      }
    }
    sumAccumulator(col, 0)
  }

  def productFold(col: Collection[Int]): Int = Collection.foldRight(col, 1)(_ * _)

  def productRec(col: Collection[Int]): Int = {
    @tailrec
    def productAccumulator(col: Collection[Int], acc: Int): Int = {
      col match {
        case Empty => acc
        case Cons(h, t) => productAccumulator(t, acc * h)
      }
    }
    productAccumulator(col, 1)
  }

  def maxFold(col: Collection[Int]): Int = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

  def maxRec(col: Collection[Int]): Int = {
    @tailrec
    def maxAccum(col: Collection[Int], max: Int): Int = {
      col match {
        case Empty => max
        case Cons(h, t) =>
          maxAccum(t, if (h > max) h else max)
      }
    }
    maxAccum(col, Integer.MIN_VALUE)
  }
}