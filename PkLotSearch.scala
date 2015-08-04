
import org.apache.spark._
import org.apache.spark.SparkContext._

object PkLotSearch {
    def main(args: Array[String]) {
     
      val conf = new SparkConf().setAppName("PkLotSearch")
    // Create a Scala Spark Context.
      val sc = new SparkContext(conf)
    // Load our input data.
      val input =  sc.textFile("5.xml")
    //cache data
     input.cache()
   //keep lines(space ID) when occupied=1
     val occupied = input.filter(line => line.contains("occupied="+""""1""""))
   //count no of occupied
     occupied.count()
     occupied.saveAsTextFile("scresult.txt")
}}
