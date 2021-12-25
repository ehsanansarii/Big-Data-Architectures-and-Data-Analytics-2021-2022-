package it.polito.bigdata.hadoop.lab;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ProductIdRatingWritable implements org.apache.hadoop.io.Writable{
	private String  productId;
	private double rating;
	

	@Override
	public void write(DataOutput out) throws IOException {
		
		out.writeDouble(rating);
		out.writeUTF(productId);
		
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		rating = in.readDouble();
		productId = in.readUTF();
		
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	public ProductIdRatingWritable() {
	}

	public ProductIdRatingWritable(String productId, double rating) {
		this.productId = new String(productId);
		this.rating = rating;
	}
	

}
