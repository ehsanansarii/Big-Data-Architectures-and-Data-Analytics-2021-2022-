package it.polito.bigdata.spark.example;

import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;

public class SparkDriver {
	
	public static void main(String[] args) {


		String inputPath;
		String outputPath;
		String prefix;


		inputPath=args[0];
		outputPath=args[1];
		prefix=args[2];

		
	
		// Create a configuration object and set the name of the application
		SparkConf conf=new SparkConf().setAppName("Spark Lab #5");
		
		
		// Create a Spark Context object
		JavaSparkContext sc = new JavaSparkContext(conf);

		
		// Read the content of the input file/folder
		// Each element/string of wordFreqRDD corresponds to one line of the input data 
		// (i.e, one pair "word\tfreq")  
		JavaRDD<String> wordFreqRDD = sc.textFile(inputPath);

		/*
		 * Task 1
		 .......
		 .......
		*/
		
		/*
		 * Task 2
		 .......
		 .......
		 */

		// Close the Spark context
		sc.close();
	}
}
