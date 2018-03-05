/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wanguchallenge;

/**
 *
 * @author Levit Nudi
 */
public class Marathon {

    /**
     * @param args the command line arguments
     */
    static int slowest = 0, fastest =0;
    public static void main(String[] args) {
        // TODO code application logic here
        
         String[] names = new String[]{
                "Abdullah", "Tumo", "Cyrus", "Mwangi", "Ndungu", "Matt", "Alex",
                "Abel", "John", "James", "Jane", "Kiprotich", "Daniel", "Wilson",
                "Aaron", "William"
        };
        int[] times = new int[]{
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int fastestTime = Marathon.fastestTime(times);
         int slowestTime = Marathon.slowestTime(times);

        System.out.println("The fastest time ran was " + fastestTime+" minutes by "+names[fastest]);
        System.out.println("The slowest time ran was " + slowestTime+" minutes by "+names[slowest]);
        /*
         * Your output should look something like:
         *  The fastest time ran was 200 by Wangu
         I'm assuming these are minutes ran by the individuals
         It means the fastest person will take the least time to the finish line
         Take note, you are taking the first integer in the array as initial time
         then comparing with every other time recorded while looping through the 
         array. To check for the highest, you want to make sure that the value is < than 
         the initial time and in case of the lowest, it the current time should be higher than the value.
         
         
         In the assignment, you are also required to get the individuals who ran fastest, I have used slowest and fastest 
         variables to store the integer positions of the highest and lowest values and using that to reference the names
         from the integer.
         
         Happy Coding :)
         */
    }
    
    
    // This method will return the INDEX of the highest time from the given list
    public static int fastestTime(int[] times) {

        // INITIALIZE YOUR VARIABLE(S) HERE
        int currentTime = times[0];

         for(int i=1;i < times.length;i++){
          
             if(times[i] < currentTime){
	    currentTime = times[i];
            fastest = i;
	      }
       }
        return currentTime;
        }
    
    // This method will return the INDEX of the slowest time from the given list
    public static int slowestTime(int[] times) {

        // INITIALIZE YOUR VARIABLE(S) HERE
        int currentTime = times[0];

         for(int i=1;i < times.length;i++){
          
             if(times[i] > currentTime){
	    currentTime = times[i];
            slowest = i;
	      }
       }
        return currentTime;
        }
    
}






