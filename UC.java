package lineComparisonProblem;
import java.lang.Math;
import java.lang.Double;



public class UC {
	public static void main(String[] args) {
		
		System.out.println("Welcome to line Comparison Problem on Master Branch");

	
	//UC1
	int x1=1;
	int y1=2;
	
	int x2=1;
	int y2=5;
	
	double length1=Math.ceil(Math.sqrt((x2-x1)^2+(y2-y1)^2));
	System.out.println(length1);
	
	
	//UC2
	
	
	int a1=1;
	int b1=2;
			
	int a2=1;
	int b2=5;
			
	double length2=Math.ceil(Math.sqrt((a2-a1)^2+(b2-b1)^2));
	System.out.println(length2);
			
	String s1=String.valueOf(length1);  
	String s2=String.valueOf(length2);  
			
			
	if(s1.equals(s2)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("not equal");
		}
			
	
     //  UC3
	
	
		if(Double.compare(length1, length2)==0) {
			System.out.println("Both are equal");
		}
		else if(Double.compare(length1, length2)<0){
			System.out.println("length1 is less than length2");
		}
		else {
			System.out.println("length2 is greater than length1");
		}
	}
	
}
	
		
	

