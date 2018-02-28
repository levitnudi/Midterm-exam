public class Marathon {

    // This method will return the INDEX of the highest time from the given list
    public static int fastestTime(int[] times) {

        // INITIALIZE YOUR VARIABLE(S) HERE
        int currentTime = 0;

        for (int i = 0; i <= times.length; i++)
            if (currentTime != times[i])
                {System.out.println(currentTime);
            }
            else
                return currentTime;
    }

    public static void main (String[] arguments) {
        String[] names = {
                "Abdullah", "Tumo", "Cyrus", "Mwangi", "Ndungu", "Matt", "Alex",
                "Abel", "John", "James", "Jane", "Kiprotich", "Daniel", "Wilson",
                "Aaron", "William"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int fastestTime = Marathon.fastestTime(times);

        System.out.println("The fastest time ran was " + fastestTime);
        /*
         * Your output should look something like:
         *  The fastest time ran was 200
         */
    }
}




