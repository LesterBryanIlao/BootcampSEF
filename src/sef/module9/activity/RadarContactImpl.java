package sef.module9.activity;

/**
 * Implementation of a RadarContact
 * 
 * @author John Doe
 */
public class RadarContactImpl implements RadarContact {
    private String contactId;
    private double bearing;
    private double distance;

    /**
     * Creates a RadarContact with the specified ID, bearing and distance.
     * 
     * @param contactID
     *            the contact's ID
     * @param bearing
     *            the contact's bearing
     * @param distance
     *            the contact's distance
     */
    public RadarContactImpl(String contactID, double bearing, double distance) {
        this.contactId = contactID;
        setBearing(bearing);
        setDistance(distance);
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#getBearing()
     */
    public final double getBearing() {
        return bearing;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#setBearing(double)
     */
    public final void setBearing(double bearing) {
        bearing %= 360;

        if (bearing < 0)
            bearing += 360;

        if (bearing == -0.0)
            bearing = 0.0D;

        this.bearing = bearing;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#getDistance()
     */
    public final double getDistance() {
        return distance;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#setDistance(double)
     */
    public final void setDistance(double distance) {
        this.distance = distance < 0 ? 0 : distance;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#getContactID()
     */
    public final String getContactID() {
        return contactId;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#setContactID(java.lang.String)
     */
    public final void setContactID(String contactID) {
        this.contactId = contactID;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    // public String toString() {
    // return toString();
    // }
}
