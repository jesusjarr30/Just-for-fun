package normalization;

import java.util.ArrayList;

public class DataSet {
	private ArrayList<Double> x;
	private ArrayList<Double> newdata;
	private Double min;
	private Double max;
	
	public DataSet() {
		
		x=new ArrayList<Double>();
		newdata=new ArrayList<Double>();
		min=0.0;
		max=0.0;
		HardData();
		normalization();
	}
	private void HardData() {
		x.add(12.0);
		x.add(26.0);
		x.add(28.0);
		x.add(32.0);
	}
	public void print() {
		
		for(Double number:x) {
			System.out.println("the number "+number);
		}
		System.out.println("the data afther normalization");
		
		for(Double number:newdata) {
			System.out.println("the number "+number);
		}
		System.out.println("the min value "+ min);
		System.out.println("The max value "+ max);
		
		
	}
	//Normalization
	
	private void findRange() {
		double min=x.get(0);
		double max=x.get(0);
		for(int i=1;i<x.size();i++) {
			if(min > x.get(i)) {
				// menor
				min=x.get(i);
				
			}
			if(max < x.get(i)) {
				// menor
				max=x.get(i);
				
			}
		}
		//modificar en los parametros 
		this.max=max;
		this.min=min;
		
	}
	private void normalization() {
		findRange();
		double aux;
		double range=max-min;
		for (int i=0;i<x.size();i++) {
			
			aux=(x.get(i)-min)/range;
			newdata.add(aux);
		}
		
		
	}
	
	
	
	

}
