package forcomp
//import Anagrams._
object test1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 
 // println("Welcome to the Scal
 val i:Int = 7;System.out.println("""i  : Int = """ + $show(i ));$skip(46); val res$0 = 
	for (x <- 1 to i; y <- 1 to 2)
  yield (x,y);System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0))}
}
