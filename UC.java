package lineComparisonProblem;
import java.lang.Math;
import java.lang.Double;



public class UC {
	
	
	public static double calcLength(int x1, int x2, int y1, int y2) {
		
		double length=Math.ceil(Math.sqrt((x2-x1)^2+(y2-y1)^2));
		return length;

	}
	
	public static void equalNCompareLengths() {
		//UC1
		int x1=1;
		int y1=2;
				
		int x2=1;
		int y2=5;
		
		Double length1=calcLength(x1,x2,y1,y2);
		
		String s1=String.valueOf(length1); 
		System.out.println(s1);
		
		//UC2
		
		
		int a1=1;
		int b1=2;
					
		int a2=1;
		int b2=5;
		
		Double length2=calcLength(a1,a2,b1,b2);
			
		
		String s2=String.valueOf(length2);  
		System.out.println(s2);
			
		if(s1.equals(s2)) {
				System.out.println("Both are equal");
			}
		else {
				System.out.println("not equal");
			}
		
		
		//  UC3
		int compareValue = length1.compareTo(length2);
		  
	    if (compareValue == 0) {
	         System.out.println("lengths are equal");
	    }
	    else if (compareValue < 0) {
	         System.out.println("Length 2 is greater than Length 1");
	    }
	    else {
	         System.out.println("Length 1 is greater tha length 2");
	    }
		
		
			
		
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to line Comparison Problem on Master Branch");
		

		equalNCompareLengths();
	
	}	 
}