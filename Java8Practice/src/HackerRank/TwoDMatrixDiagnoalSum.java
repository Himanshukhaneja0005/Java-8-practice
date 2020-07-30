package HackerRank;

public class TwoDMatrixDiagnoalSum {
	
	
		  
	    static void printDiagonalSums(int [][]mat) 
	    { 
	    	int rowlen = mat.length;
	    	System.out.println(rowlen);
	    	int principal = 0, secondary = 0; 
	    	
	    	for (int i = 0; i < rowlen; i++) { 
	            for (int j = 0; j < rowlen; j++) { 
	      
	                // Condition for principal 
	                // diagonal 
	                if (i == j) 
	                    principal += mat[i][j]; 
	      
	                // Condition for secondary 
	                // diagonal 
	                if ((i + j) == (rowlen - 1)) 
	                    secondary += mat[i][j]; 
	            } 
	            System.out.println("Principal Diagonal:"
                        + principal); 
                          
                 System.out.println("Secondary Diagonal:"
                        + secondary);
	        } 
	    } 
	      
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [][]a = { {1}, 
                 { 5, 6, 7, 8 },  
                 { 1, 2, 3, 4 }, 
                 { 5, 6, 7, 8 } }; 
 
   printDiagonalSums(a); 
	}

}
