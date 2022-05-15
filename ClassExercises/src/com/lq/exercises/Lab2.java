


public class Lab2 {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------Lab2------------------");
        int width, height, area;
        double radius = 10.0;
        double p = 3.14;
        boolean result = true;
        width = 8;
        height = 12;
        area = 96;

        System.out.println("The value of width: "+ width);
        System.out.println("The value of height: "+ height);
        System.out.println("The value of area: "+ area);
        System.out.println("The value of radius: "+ radius);
        System.out.println("The value of p: "+ p);
        System.out.println("The value of result: "+ result);
        

        int[] daysInMonths = new int[12];
        String[] monthNames = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

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

        System.out.println(monthNames[0]+" has "+ daysInMonths[0] +" days");
        System.out.println(monthNames[1]+" has "+ daysInMonths[1] +" days");
        System.out.println(monthNames[2]+" has "+ daysInMonths[2] +" days");
        System.out.println(monthNames[3]+" has "+ daysInMonths[3] +" days");
        System.out.println(monthNames[4]+" has "+ daysInMonths[4] +" days");
        System.out.println(monthNames[5]+" has "+ daysInMonths[5] +" days");
        System.out.println(monthNames[6]+" has "+ daysInMonths[6] +" days");
        System.out.println(monthNames[7]+" has "+ daysInMonths[7] +" days");
        System.out.println(monthNames[8]+" has "+ daysInMonths[8] +" days");
        System.out.println(monthNames[9]+" has "+ daysInMonths[9] +" days");
        System.out.println(monthNames[10]+" has "+ daysInMonths[10] +" days");
        System.out.println(monthNames[11]+" has "+ daysInMonths[11] +" days");
    }
}
