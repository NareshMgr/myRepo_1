package SeleniumScripts_2023;

import java.util.Arrays;
import java.util.LinkedList;

public class Seggregate_IntegerArray {

	public static void main(String[] args) {
		
		Integer arr[]=new Integer[]{0,1,0,1,0,1};
		
		System.out.println("Total length of Array: "+arr.length);
		
		LinkedList<Integer> ll= new LinkedList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0)
			
			ll.addFirst(arr[i]);
			
			else 
				
				ll.addLast(arr[i]);
			
		}
		
		System.out.println("");
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("");
		System.out.println("After Seggregate Array: "+ll);
		
		

	}

}
