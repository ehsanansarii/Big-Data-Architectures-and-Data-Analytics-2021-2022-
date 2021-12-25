package it.polito.bigdata.hadoop.lab;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Lab  - Mapper
 */

/* Set the proper data types for the (key,value) pairs */
class MapperBigData1 extends Mapper<
                    LongWritable, // Input key type
                    Text,         // Input value type
                    Text,         // Output key type
                    ProductIdRatingWritable> {// Output value type
    
    protected void map(
            LongWritable key,   // Input key type
            Text value,         // Input value type
            Context context) throws IOException, InterruptedException {

    		String[] fields = value.toString().split(",");
    		// Check if it is a review or the name of the attributes
    		if(fields[0].compareTo("Id") != 0) {
    			String productId = fields[1];
    			String userId = fields[2];
    			int rating = Integer.parseInt(fields[6]);
    			context.write(new Text(userId), new ProductIdRatingWritable(productId, rating));
    		}

    }
}
