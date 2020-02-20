package Version1;


import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Lindiwe Mutungamiri
 * @version 1.0.1
 * the monitoring class holds information about all observatories
 *
 */

public class Monitoring {
    private observatory[] observatorylist; // observatory array
    private int currentobs;

    /**
     * the monitoring constructor
     */

    public Monitoring() {
        this.observatorylist = new observatory[100]; //by default the array length is 100
        currentobs = 0;
    }


    /**
     * the getObservatorylist method returns the observatory list
     *
     * @return returns the observatory list
     */

    public observatory[] getObservatorylist() {
        return observatorylist;
    }


    /**
     * the set observatory list method sets the list into the observatory array
     *
     * @param observatorylist an array that sets the observatory list
     */

    public void setObservatorylist(observatory[] observatorylist) {
        this.observatorylist = observatorylist;
    }


    /**
     * the tostring method dispays the observatory list
     *
     * @return returns the observatory list
     */

    @Override
    public String toString() {
        return "Monitoring{" +
                "observatorylist=" + Arrays.toString(observatorylist) +
                '}';
    }


    /**
     * the add observatory method adds a new observatory to
     * the observatory list.
     *
     * @param newobservatory
     * @return returns true if the observatory has been added and returns false if the observatory has not been added.
     */

    public boolean addobservatory(observatory newobservatory) {
        if (currentobs >= observatorylist.length) {
            expandArray();
        }

        while (observatorylist[currentobs] == null) {
            if (observatorylist[currentobs] == null) {
                observatorylist[currentobs] = newobservatory;
                currentobs = currentobs + 1;
            }
            return true;
        }

        return false;
    }


    /**
     * the largest average method returns the largest average galamsey colour value
     *
     * @return returns a string value of the largest average  galamsey colour value in the observatory list
     */
    public observatory largestaverageObservatory() {
        int large = 0;
        for (int i = 0; i < currentobs; i++) {
            if (observatorylist[i].averagecolorvalue() > large) {
                large = observatorylist[i].averagecolorvalue();
                i++;
            }
            return observatorylist[i];
        }
        return null;
    }

    public int largestaverage() {
        int large = 0;
        for (int i = 0; i < currentobs; i++) {
            if (observatorylist[i].averagecolorvalue() > large) {
                large = observatorylist[i].averagecolorvalue();
                i++;
            }
        }
        large=large+1;
        return large;
    }

    /**
     * the largest colour value2 method computes the largest galamsey colour value ever recorded
     *
     * @return returns an integer value of the largest galamsey colour value ever recorded
     */

    public int largestColorValue2() {
        int large = 0;
        for (int i = 0; i < currentobs; i++) {
            if (observatorylist[i].largestColorValue() > large) {
                large = observatorylist[i].averagecolorvalue();
            }
        }
        return large;
    }


    /**
     * the galamseygreaterthanvalue method displays the  list of all “galamsey”
     * recorded with colour value greater than a  number (1)
     *
     * @return returns the new list
     */

    public ArrayList galamseygreaterthanvalue(int value) {
        ArrayList newlist = new ArrayList();
        for (int i = 0; i < currentobs; i++) {
            newlist.add(observatorylist[i].galamseygreaterthanX(value));
        }
        return newlist;
    }


    /**
     * expanding the existing array to a biiger sized array
     */
    private void expandArray() {
        //reate a new array which doubles the existing one
        observatory[] newArray = (observatory[]) new Object[observatorylist.length * 2];

        //put every value in the new array
        for (int i = 0; i < currentobs; i++) {
            newArray[i] = observatorylist[i];
        }

        //assign the bigger array to the smaller one
        observatorylist = newArray;
    }

}



