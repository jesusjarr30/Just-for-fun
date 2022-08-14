package binarySearch;

public class BinaryApp {

	private  static int [] nums;
	
	
	BinaryApp(){
		
		nums=new int[100];
		fill();
	}
	private static void fill() {
		for (int i=0;i<nums.length;i++) {
					nums[i]=i;	
				}
	}
	private static void print() {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void main(String[] args) {
		
		//add numbber 
		
		BinaryApp v=new BinaryApp();
		int target=49;
		int index;
		index=v.binarySearch(target);
		System.out.println("the index is "+index);
		System.out.println(" the target is "+target+" if we search int the vectore"+nums[index]);
		
		}
	private int binarySearch(int target) {
		
		int right=nums.length-1;
		int left=0;
		int  index=0;
		while(left<=right) {
			index= left +(right-left)/2;
			
			
			if(nums[index]==target) {
				return index;
			}
			if(nums[index]>target) {
				right=index-1;
				
			}else {
				left=index+1;
			}
			System.out.println("left side "+left +" right side"+right+" index is "+index);
		}
		return index;
		
		
		
	}
		
}
