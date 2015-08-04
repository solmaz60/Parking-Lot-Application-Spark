import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.Function;

public class PkLotsj {
  public static void main(String[] args) {
    String logFile = "/home/sparktp/5.xml"; // input file
    SparkConf conf = new SparkConf().setAppName("PkLotn analyzer");
    JavaSparkContext sc = new JavaSparkContext(conf);
    JavaRDD<String> logData = sc.textFile(logFile).cache();

JavaRDD<String> occupied = logData.filter(new Function<String, Boolean>() {
  public Boolean call(String s) { return s.contains("occupied=\"1\""); }
});
// Count all the occupied space
occupied.count();

occupied.saveAsTextFile("javaresult");
      }
}

