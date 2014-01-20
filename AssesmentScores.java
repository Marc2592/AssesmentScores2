class AssesmentScores{
public static void main(String[] args){

   int[] Scores = new int[101];
   mathPlacements(Scores);
   outputStatement(Scores);
  
}
private static void mathPlacements( int[] Scores ){
   for(int i = 0; i<= 100; i++){
       if(i== 0)
          Scores[i]=0;
       else	
		 if (i<=16)
		    	Scores[i] = 4;
		    
		    else
		       if (i<=21)
		    	     Scores[i] = 5;

		    
		    else 
		      if (i<=25)
		    	Scores[i] = 6;
		    
		    else
		       if (i<=27)
		    	Scores[i] = 7;

		    
		    else 
		       if (i<=32)
		    	   Scores[i] = 8;
		    
		    else if (i<=43)
		    	Scores[i] = 9;
		    
		    else 
		       Scores[i] = 10;
   }
}
private static void outputStatement(int[] Scores) {
 System.out.println("Scores,Math");
 for(int i = 0; i<=100; i++)
    System.out.println(i + "  , " + Scores[i]);


}
}
