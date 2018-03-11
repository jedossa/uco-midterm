package exam

import scala.annotation.tailrec

sealed trait Collection[+A]
case object Empty extends Collection[Nothing]
final case class Cons[+A](head: A, tail: Collection[A]) extends Collection[A]

sealed trait Operador
case object suma extends Operador
case object producto extends Operador

object Suma {
}

object Collection {

  def apply[A](as: A*): Collection[A] = as.toList match {
    case cons if cons.isEmpty => Empty
    case h :: t => Cons(h, apply(t: _*))
  }

  def foldRight[A, B](col: Collection[A], z: B)(f: (A, B) => B): B = col match {
    case Empty => z
    case Cons(h, t) => f(h, foldRight(t, z)(f))
  }

  def isEmpty[A](collection: Collection[A]) = collection match {
    case Empty => true
    case _ => false
  }

  def tail[A](collection: Collection[A]) = collection

  @tailrec
  def size(col:Collection[Int], acumulador:Int):Int = {
    if(isEmpty(col)) acumulador else size(tail(col), acumulador + 1)
  }

  def length(col: Collection[Int]): Int = foldRight(col, Integer.MIN_VALUE) {
    ???
  }



}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int = Collection.foldRight(col, Integer.MIN_VALUE)(???)

  def sumRec(col: Collection[Int]) = {
    @tailrec
    def sumAccumulator(coll:Collection[Int], acc:Int, sum:Int):Int = {
      if (acc==0) acc else sumAccumulator(coll, acc-1, sum + col.hashCode())
    }
  }

  def productFold(col: Collection[Int]) = {
    @tailrec
    def productAccumulator(coll:Collection[Int], acc:Int, product:Int):Int = {
      if (acc==0) acc else productAccumulator(coll, acc-1, product * col.hashCode())
    }
  }

  def productRec(col: Collection[Int]) = ???

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

  def maxRec(col: Collection[Int]): Int = ???
}