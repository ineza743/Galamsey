/**
 * @author Farida Eleshin
 * @version 1.01
 */
package Version1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The main method to call the position, galamsey, monitoring, and observatory classes
 */
public class MonitoringIO2 {
    /**
     * main method that already has some existing data in it
     * @param args
     */
    public static void main(String [] args){

        // two existing observatory objects
        observatory obs = new observatory("observation1", "Ghana", 2004, 1.5, 4);
        observatory obs2 = new observatory("observation2", "Ghana", 2016, 4.6, 5);

        //position instance
        Position one = new Position("45N", "60S");

        //three galamsey objects
        Galamsey g1=new Galamsey(Galamsey.vegetation_colour.Green,1980,"galamsey1", one );
        Galamsey g2=new Galamsey(Galamsey.vegetation_colour.Brown,1997, "galamsey2",one);
        Galamsey g3=new Galamsey(Galamsey.vegetation_colour.Yellow,2000, "galamsey3",one);

        //adding the galamseys to the observatory using the add method
        obs.addgalamsey(g1);
        obs.addgalamsey(g3);

        obs2.addgalamsey(g2);
        obs2.addgalamsey(g1);

        //adding the observatories to the monitoring object
        Monitoring m = new Monitoring();
        m.addobservatory(obs);
        m.addobservatory(obs2);

        // //This statement presents the user with a menu (printed to the console) of 4 options
        while(true){
            System.out.println("WELCOME TO THE GALAMSEY SECTION:\n" +
                    " Input 1 to enter   Observatory data\n" +
                    " Input 2 to Galamsey data \n" +
                    " Input 3 to Monitor statistics\n" +
                    " Input 0 to exit\n"
            );

            try {
                Scanner word = new Scanner(System.in);
                int input = word.nextInt();
                switch (input) {
                    /**
                     * case 1 prompts the user to enetr observatory informations and adds it to the monitoring object
                     */
                    case 1:

                        // enter observatory data
                        System.out.println("Enter Observatory name");
                        String obname = word.next();

                        System.out.println("Enter the country of Observatory");
                        String obcountry = word.next();

                        System.out.println("Enter the year of Observatory");
                        int obyear = word.nextInt();

                        System.out.println("Enter the area the observatory covered in squared kilometers");
                        double obarea = word.nextDouble();


                        observatory obse = new observatory();
                        obse.setObservatoryName(obname);
                        obse.setCountryName(obcountry);
                        obse.setYear(obyear);
                        obse.setArea(obarea);
                        m.addobservatory(obse);
                        obse.write();
                        break;

                    /**
                     * case 2 asks the user to enter galamsey information and adds it to the observatory object
                     */
                    case 2:
                        //enter galamsey data
                        Galamsey galam = new Galamsey();
                        //DB_connection h = new DB_connection();
                        System.out.println("Enter Galamsey name");
                        String gname = word.next();
                        galam.setname(gname);

                        System.out.println(
                                "Green :  healthy vegetation with no “galamsey” presence, " +
                                "Yellow:  fair vegetation with a potential “galamsey” presence, " +
                                "Brown: poor vegetation with a certain “galamsey” presence");
                        System.out.println("Enter the vegetation colour of Galamsey");
                        String gvegetativecolor = word.next();
                        galam.setVegetation_colour(Galamsey.vegetation_colour.valueOf(gvegetativecolor));


                        System.out.println("Enter the Year");
                        int galamYear = word.nextInt();
                        galam.setyear(galamYear);

                        System.out.println("Enter  the position of Galamsey in Latitude and Longitude");
                        System.out.println("Enter Latitiude");
                        String glatitude = word.next();

                        System.out.println("Enter Longitude");
                        String glongitude = word.next();
                        Position pose = new Position();
                        pose.setLatitude(glatitude);
                        pose.setLongtitude(glongitude);
                        obs.addgalamsey(galam);
                        int positionid =1;
                        galam.write();

                        //h.insert_Database
                        break;


                    /**
                     * case 3 prints details on information already in the monitoring array
                     */
                    case 3:
                        //displays the monitoring statistics
                        System.out.println("--------------Information on  Monitoring Statistics---------------");
                        System.out.println("The Largest average observatory : "  );
                        System.out.println(m.largestaverageObservatory());
                        System.out.println();

                        System.out.println("The Largest average Galamsey List : "  );
                        System.out.println(m.largestaverageObservatory().getgalamseyList());
                        System.out.println();

                        System.out.println("The Largest average color Value : "  );
                        System.out.println(m.largestaverage());
                        System.out.println();

                        System.out.println(" The largest galamsey colorValue ever ");
                        System.out.println(m.largestaverageObservatory().largestColorValue());


                        System.out.println("enter the color value to see all galamseys greater than that value");
                        int greaterValue = word.nextInt();
                        System.out.println(" All galamsey with colour value greater than the given number in each observatory");
                        System.out.println(m.galamseygreaterthanvalue(greaterValue));
                        System.out.println();

                        break;

                    /**
                     * case 0 exits from the loop
                     */
                    case 0:
                        System.out.println("DONE");
                        System.exit(0);
                        break;
                }
                //catches the exception when a string is entered instead of an integer.

            } catch (Exception e) {
                System.out.println("The number you have entered is invalid, please enter another number");
            }
        }


    }
}



