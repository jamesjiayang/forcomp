package forcomp
//import Anagrams._
object test1 {
 // println("Welcome to the Scal
 val i:Int = 7                                    //> i  : Int = 7
	for (x <- 1 to i; y <- 1 to 2)
  yield (x,y)                                     //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (2,1), (2,2), (3,1), (3,2), (4,1), (4,2), (5,1), (5,2), (6,1), (6,2), (7,
                                                  //| 1), (7,2))
}