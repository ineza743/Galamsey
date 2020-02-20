package Version1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Christabel Alormene Kekeli
 * @version 1.0.1
 * This class stores the information of galamseys
 */

public class Galamsey {
    /**
     * these are the instance variables for the Galamsey class
     *
     * the vegetation_colour method holds the 3 enum colour values
     */
    public static enum vegetation_colour {Green, Yellow, Brown}

    private Position position;
    private vegetation_colour color;
    private int value;
    private int year;
    private String name;



    /**
     * this is the default constructor
     */
    public Galamsey() {
        this.color = null;
        this.name = "None";
        this.year=0;
        this.position = null;
    }



    /**
     * this is the constructor
     * @param color a string representing the galmasey colour
     * @param name a string representing the galamsey colour
     * @param position shows the position of the galamsey
     */
    public Galamsey(vegetation_colour color,int year, String name, Position position) {
        this.color = color;
        this.name = name;
        this.year=year;
        this.position = position;
    }




    /**
     * getter method for year
     * @return year
     */

    public int getYear(){
        return this.year;
    }



    /**
     * the getVegetation_colour method returns the vegetation colour
     * @return returns the colour of the vegetation
     */

    public vegetation_colour getVegetation_colour() {
        return color;
    }


    /**
     * the getname method returns the name of the galamsey
     * @return returns the galamsey name
     */

    public String getname() {
        return name;
    }



    /**
     * the setname method ssets the name of the galamsey
     * @param newname a string containing the galamsey name
     */

    public void setname(String newname) {
        this.name = newname;
    }



    /**
     * setter method for year
     * @param year int
     */
    public void setyear(int year){
        this.year=year;
    }



    /**
     * the  setVegetation_colour method sets the color of the vegetation
     * @param newcolour contains the color of the vegetation
     */

    public void setVegetation_colour(vegetation_colour newcolour) {
        this.color = newcolour;
    }



    /**
     * the  getcolour_value method assigns the values
     * to the vegetation colour
     * @return returns 0 if the vegetation colour entered
     * is not gree, Yellow, and Brown
     */

    public int getcolour_value() {
        try {
            if (getVegetation_colour().equals(vegetation_colour.Green)) {
                return 1;
            } else if (getVegetation_colour().equals(vegetation_colour.Yellow)) {
                return 2;
            } else if (getVegetation_colour().equals(vegetation_colour.Brown)) {
                return 3;
            } else {
                return 0;
            }
        }catch(NullPointerException e){
            return 0;
        }
    }


    /**
     * the getPosition methods gets the position of the galamsey
     * @return returns the position of the galamsey
     */

    public Position getPosition() {
        return position;
    }


    /**
     * the setPosition method sets the position of the galamsey
     * @param position a string containing the position of the galamsey
     */

    public void setPosition(Position position) {
        this.position = position;
    }

    public void write(){
        try{
            FileWriter fileWriter= new FileWriter("Galamsey.txt", true);
            PrintWriter printWriter= new PrintWriter(fileWriter);
            File file = new File("Galamsey.txt");
            Scanner open = new Scanner(file);
            printWriter.print(this.toString() + "\n");
            printWriter.close();
            open.close();
            System.out.println("Galamsey added to Galamsey file");

        }catch(
                IOException e) { // catch IOException
            e.printStackTrace(); }

    }

    /**
     * tostring method to display information
     * @return
     */

    @Override
    public String toString() {
        return "Galamsey{" +
                "position=" + getPosition() +
                ", color=" + getVegetation_colour() +
                ", value=" + getcolour_value() +
                ", year=" + getYear() +
                ", name='" + getname() + '\'' +
                '}';
    }

}
