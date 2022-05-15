
public class Lab3 {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Lab3--------------");

        System.out.println("Exercise 1: for loop");
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Sataurday"};

        System.out.println("DayOfWeek in general for loop");
        for(int i=0; i<daysOfWeek.length; i++){
            System.out.println(daysOfWeek[i]);
        }

        System.out.println("DayOfWeek in for-next loop");
        for(String day: daysOfWeek){
            System.out.println(day);
        }

        System.out.println("Exercise 2: while loop and continue");

        System.out.println("while loop that will print out only even numbers between 1 and 20");
        int i = 1;
        while(i<=20){
            System
            System.out.println(i);
            i++;
        }

        System.out.println("Use the continue statement and an if statement to skip printing the odd numbers");
        
        int j = 1;
        while(j<=20){
            if((j%2) == 0){ // even 
                System.out.println(i);
            } else { // odd
               // System.out.println(i);
            }
            j++;
        }


        System.out.println("Exercise 3: for loop");
        int k = 1;
        while(k<=100){
            if(k < 50 || k > 60){
                System.out.println(k);
            }
            k++;
        }

        System.out.println("Exercise 4: switch statement");

        System.out.println("Create a while loop that will execute the following code 12 times using a counter that starts at 1 and is incremented by 1 each time through the loop.");
        System.out.println("Within the while loop, create a switch statement that will print out the number of days in each of the months of the year. ");
        
        int[] daysInMonths = new int[12];
        daysInMonths[0] = 31;
        daysInMonths[1] = 28;
        daysInMonths[2] = 30;
        daysInMonths[3] = 31;
        daysInMonths[4] = 30;
        daysInMonths[5] = 31;
        daysInMonths[6] = 30;
        daysInMonths[7] = 31;
        daysInMonths[8] = 30;
        daysInMonths[9] = 31;
        daysInMonths[10] = 30;
        daysInMonths[11] = 31;

        String[] monthNames = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        int l = 1;
        while(l<=12){
            switch(monthNames[l-1]){
                default:
                System.out.println(monthNames[l-1]+" days "+daysInMonths[l-1]);
                break;
            }
            l++;
        }


    }
}
