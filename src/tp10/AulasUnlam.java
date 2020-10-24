package tp10;

public class AulasUnlam {
	
	public static void main(String[]args) {
		
	int [][] matrix=new int[4][5];
	
	  matrix [0][0]=1;
	  matrix [0][1]=20;
	  matrix [0][2]=23;
	  matrix [0][3]=32;
	  matrix [0][4]=1;
	  
	  matrix [1][0]=1;
	  matrix [1][1]=44;
	  matrix [1][2]=42;
	  matrix [1][3]=20;
	  matrix [1][4]=1;
	  
	  matrix [2][0]=1;
	  matrix [2][1]=1;
	  matrix [2][2]=1;
	  matrix [2][3]=23;
	  matrix [2][4]=55;
	  
	  matrix [3][0]=1;
	  matrix [3][1]=82;
	  matrix [3][2]=76;
	  matrix [3][3]=56;
	  matrix [3][4]=2;
	  
	  for (int i=0;i<4;i++) {
		  System.out.println();
		  for(int j=0;j<5;j++) {
			  
			 if(matrix[i][j] == 1) {
				 
				 
				 System.out.print("desocopado" + " "); 
			 }else  System.out.print("ocupado ");
			  
			  
			  
		  }
	  }

}
	

}
