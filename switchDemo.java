
package com.java.demo.intro;


public class switchDemo {

	
	 public static void main(String[] args)
	 {
		 char grade='M';
		 
		 switch(grade) {
        
		 case 'A' :
	            System.out.println("Excellent!"); 
	            break; //stop
	     case 'B' :
	    	 System.out.println("good!"); 
	    	 break;
	     case 'C' :
	    	 System.out.println("ok!"); 
	    	 break;
	    	 default:
	    		 System.out.println("Invalid Grade");
	    	 
		
		 }
	       
	 }

}
