package Version1;
/**
 * @author Afsanat Ineza
 * @version 1.01
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * class observatory stores a list of all galamseys
 * finds the largest color value
 * finds the average color value
 */
public class observatory {
    //These are the instance variables needed in the observatory class.
    private String ObservatoryName;
    private String countryName;
    private int year;
    private double area;
    private Galamsey[] galamseylist;
    private int currentgalamsey;


    //set defaults values we want to display
    public observatory(){
        this.ObservatoryName = "NONE";
        this.countryName = "NONE";
        this.year = 0;
        this.area = 0.0;
        this.galamseylist = new Galamsey[50];
        this.currentgalamsey=0;

    }


    /**
     * Constructoe
     * @param ObservatoryName
     * @param countryName
     * @param year
     * @param area
     * @param capacitygalamsey
     */
    public observatory(String ObservatoryName, String countryName, int year, double area, int capacitygalamsey) {
        this.ObservatoryName = ObservatoryName;
        this.countryName = countryName;
        this.year = year;
        this.area = area;
        this.currentgalamsey=0;
        this.galamseylist = new Galamsey[capacitygalamsey];
    }

    /**
     * getter method for ObservatoryName
     * @return observatoryName: String
     */
    public String getObservatoryName() {
        return ObservatoryName;
    }

    /**
     * setter method for ObservatoryName
     * @param observatoryName
     */
    public void setObservatoryName(String observatoryName) {
        ObservatoryName = observatoryName;
    }

    /**
     * getter method for countryName
     * @return String
     */
    public String getCountryName() {
        return countryName;
    }


    /**
     * setter method for countryName
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * getter method for year
     * @return int
     */
    public int getYear() {
        return year;
    }

    /**
     * setter method for year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getter method for he index of thecurrent galamsey
     * @return int
     */
    public int getcurrentgalamsey() {
        return currentgalamsey;
    }

    /**
     * getter method for area
     * @return double
     */

    public double getArea() {
        return area;
    }


    /**
     * setter method for area
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * getter method for galamsey list
     * @return Galamsey[]
     */

    public ArrayList getgalamseyList() {
        ArrayList galamList = new ArrayList();
        for (int i=0;i<getcurrentgalamsey();i++)
            galamList.add(galamseylist[i]);
        return galamList;
    }


    /**
     * add galamsey method in the array
     * @param newGalamsey
     * @return Boolean
     */
    public boolean addgalamsey(Galamsey newGalamsey) {
        //if the array if full, we expand
        if (currentgalamsey >= galamseylist.length ) {
            expandArray();
        } else {
            //we only enter the value at a place where there is null
            while (galamseylist[currentgalamsey] == null) {
                if (galamseylist[currentgalamsey] == null ) {
                    galamseylist[currentgalamsey] = newGalamsey;
                    currentgalamsey = currentgalamsey + 1;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * largest color value
     * @return large:int
     */

    public int largestColorValue(){
        int large= 0;
        //loop until you  are at the last index containing a value
        for (int i=0; i<currentgalamsey;i++){
            //set that value to large if it is bigger than large
            if(galamseylist[i].getcolour_value()>large){
                large=galamseylist[i].getcolour_value();
            }
        }
        return large;   //at the end return the current large value
    }


    /**
     * average color value method
     * It cummulatively finds the sum and divides with n after the loop
     * @return int
     */
    public int averagecolorvalue(){
        try {
            int sum = 0;
            for (int i = 0; i < currentgalamsey; i++) {
                sum = sum + galamseylist[i].getcolour_value();
            }
            int avg = sum / (currentgalamsey);
            return avg;

        }catch(ArithmeticException ignored){

        }
        return 0;
    }

    /**
     * galamseys greater than a certain value
     * @param value
     * @return list
     */
    public ArrayList galamseygreaterthanX(int value){
        //create a new arraylist to store the values greater than the specified value
        ArrayList newlist=new ArrayList();
        for(int i=0;i<currentgalamsey;i++){
            if(galamseylist[i].getcolour_value()>value){
                newlist.add(galamseylist[i].getname());
            }
        }
        return newlist;
    }


    /**
     * expanding the array method
     */
    private void expandArray() {

        Galamsey[] temp = new Galamsey[galamseylist.length*2];
        for (int i=0; i<currentgalamsey; i++) {
            temp[i] = galamseylist[i];
        }
        galamseylist = temp;
    }


    /**
     * Writting to a file method
     */
    public void write(){
        try{
            FileWriter fileWriter= new FileWriter("Observatories.txt", true);
            PrintWriter printWriter= new PrintWriter(fileWriter);
            File file = new File("Observatories.txt");
            Scanner open = new Scanner(file);
            printWriter.print(this.toString() + "\n");
            printWriter.close();
            open.close();
            System.out.println("Observation added to file");

        }catch(IOException e) { // catch IOException
            e.printStackTrace(); }
    }

    /**
     * tostring method to display details of galamsey
     *
     * @return String
     */

    @Override
    public String toString() {
        return "observatory{" +
                "ObservatoryName='" + getObservatoryName() + '\'' +
                ", countryName='" + getCountryName() + '\'' +
                ", year=" + getYear() +
                ", area='" + getArea() + '\'' +
                ", countGalamsey=" + getcurrentgalamsey() +
                ", galamseygreaterthanX=" + galamseygreaterthanX(2) +
                ", averagegalamsey=" + averagecolorvalue() +
                ", largest color value=" + largestColorValue() +
                '}';
    }

}


