package Version1;
/**
 * the Position class records the position of the galamsey
 */

public class Position{
    private String latitude;
    private String longtitude;
    /**
     * default constructor
     */

    public Position(){}

    /**
     * a constructor
     * @param latitude a string value containing the latitute of the galamsey
     * @param longtitude a string value containing the longitude of the constructor
     */

    public Position(String latitude, String longtitude){
        this.latitude=latitude;
        this.longtitude=longtitude;
    }
    /**
     * the get Latitude method gets the galamsey latitude
     * @return returns the latitute of the galamsey
     */

    public String getLatitude() {
        return latitude;
    }
    /**
     * the set latitute method sets the latitude of the galamsey
     * @param latitude is a string value containing the latitude of the galamsey
     */

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    /**
     * the get longitude method gets the longitude of the galamsey
     * @return returns the longitude of the galamsey
     */

    public String getLongtitude() {
        return longtitude;
    }
    /**
     * the set longtitude method sets the longtitude of the galamsey
     * @param longtitude a string value containing the longtitude of the galamsey
     */

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    /**
     * the to string method displays the latitude and the longtitude of the galamsey
     */

    @Override
    public String toString() {
        return "Position: (" + getLatitude() + ", " + getLongtitude() + ")";
    }

}
