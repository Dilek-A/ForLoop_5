package assignments.ForLoop_5;

public class Question11 {

	public static void main(String[] args) {
		 
		for( int row=4; row>=1; row--) {
	    	   for(int i=1; i<=4-row; i++) {
	    		   System.out.print(" ");
	    	   }
	          for (int col=row; col>=1; col--) {
	    	    System.out.print(col+" ");
	          
	       }
	          System.out.println();
	       
	   }
		

	}

}
