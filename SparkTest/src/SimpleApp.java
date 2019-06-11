import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class SimpleApp {
	public static void main(String[] args) {
		String logFile = "/usr/local/spark/README.md";
		System.out.println(logFile);
	    SparkSession spark = SparkSession.builder().appName("Simple Application").getOrCreate();
	    Dataset<String> logData = spark.read().textFile(logFile).cache();
	    
//	    long numAs = logData.filter(s -> s.contains("a")).count();
//	    long numBs = logData.filter(s -> s.contains("b")).count();
	    long numAs = 1, numBs = 2;
	    System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);
	    spark.stop();
	}
}
