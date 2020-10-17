package assignments.ForLoop_5;

public class Question13 {

	public static void main(String[] args) {
		
		int rows=8;
		for(int i=1; i<=rows; i++) {
			if(i%2!=0) {
				for(int j=1; j<=4; j++) {
					System.out.print("W ");
					System.out.print("B ");
					
				}
				System.out.println();
			}else {
				for(int j=1; j<=4; j++) {
					System.out.print("B ");
					System.out.print("W ");
				}
				System.out.println();
			}
		}
				

	}

}
