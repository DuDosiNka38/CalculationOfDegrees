package Numbers;

public class Calculation {
	
	
	 int FirstNumber = Number.getInt();
	 int CommonRatio = Number.getInt();
	 int NumberOfTerms = Number.getInt();
    
     public static void Compute(){
    	  
    	 Calculation c = new Calculation();
    	 
    	  double n = c.FirstNumber;
    	  double x = c.CommonRatio;
    	  double k = c.NumberOfTerms;
    	  
    	  System.out.println(" n       x ");
    	 
    	  
    	  for(int i = 0; i < k ; i++) {
    		 double answer = Math.pow(x, n);
    		  
    		 System.out.println(" "+ (int)n +";       "+ (int)answer + ";   ");
    		  n++;
    		   }
    	  
    	  
    	 }

}


