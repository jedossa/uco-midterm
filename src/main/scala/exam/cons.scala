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

  def length[A](col: Collection[A]): Int = foldRight(col, Integer.MIN_VALUE) { ??? }
}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, ???)(???)

  def sumRec(l: Collection[Int]): Int = {
    @tailrec
    def sumAccumulator(elm: Collection[Int], acum: Int): Int = {
      elm match {
        case Cons(h, Empty) => h + acum
        case Cons(h, t) => sumAccumulator(t, (h + acum))
        case Empty => acum
      }
    }
    sumAccumulator(l, 0)
  }

  def productFold(col: Collection[Int]) = ???

  //def productRec(col: Collection[Int]) = ???

  def productRec(l: Collection[Int]): Int = {
    @tailrec
    def proAccumulator(elm: Collection[Int], acum: Int): Int = {
      elm match {
        case Cons(h, Empty) => h * acum
        case Cons(h, t) => proAccumulator(t, (h * acum))
        case Empty => acum
      }
    }
    proAccumulator(l, 1)
  }

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MAX_VALUE)(_ max _)

  def maxRec(l: Collection[Int]): Int = {
    @tailrec
    def max(elm: Collection[Int], maximo: Int):
    Int ={
      elm match {
        case Cons(h, Empty) => if (h >= maximo) h else maximo
        case Cons(h, t) => max(t, if (h >= maximo) h else maximo)
        case Empty => maximo
      }
    }
    max(l, 0)
  }
}