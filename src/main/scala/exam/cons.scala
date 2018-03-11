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

  def length[A](col: Collection[A]): Int = {
    val acc:Int = while((foldRight(col, _)(_) != _){
      val tamano = 0
      suma(tamano)
    }
  }
  def suma(num:Int):Int = num+1
}

object CollectionInt {
  def sumFold(col: Collection[Int]): Int =
    Collection.foldRight(col, Integer.MIN_VALUE)(Integer.sum(_,_))

  def sumRec(col: Collection[Int]): Int= {
    @tailrec
    def sumAccumulator(acc:Int):Int = col match {
      case Empty => acc
      case Cons(h,t) => sumAccumulator(acc+h)
    }
    sumAccumulator(0)
  }

  def productFold(col: Collection[Int]) =
    Int = Collection.foldRight(col, Int)(product(_,_))

  def productRec(col: Collection[Int]):Int = {
    @tailrec
    def productAccumulator(llamados:Int,acc:Int):Int = col match{
      case Empty => acc
      case Cons(h,t) => productAccumulator(llamados+1,acc*h)
      case cero if llamados==0 => 0
    }
    productAccumulator(0,1)
  }

  def maxFold(col: Collection[Int]) = Collection.foldRight(col, Integer.MIN_VALUE)(_ max _)

  def maxRec(col: Collection[Int]):Int = {
    @tailrec
    def maxAccumulator(max:Int):Int = col match{
      case Empty => max
      case Cons(h,t) => maxAccumulator(Integer.max(max,h))
    }
    maxAccumulator(0)
  }

  def product(mult:Int,mult2:Int):Int=mult*mult2
}