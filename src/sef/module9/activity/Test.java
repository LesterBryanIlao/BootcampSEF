package sef.module9.activity;

public class Test {
    public static void main(String[] args) {
        RadarImpl radarImpl = new RadarImpl();
        RadarContactImpl radarContactImpl1 = new RadarContactImpl("R1", 15.0D, 1000.0D);
//        RadarContactImpl radarContactImpl2 = new RadarContactImpl("R1", 360.0D, 2000.0D);
//        RadarContactImpl radarContactImpl3 = new RadarContactImpl("R3", 405.0D, 3500.0D);
//        RadarContactImpl radarContactImpl4 = new RadarContactImpl("R4", 720.0D, 3500.1D);
//        RadarContactImpl radarContactImpl5 = new RadarContactImpl("R5", 725.3D, -3024.0D);
        
//        RadarContactImpl radarContactImpl1 = new RadarContactImpl("R1", -350.0D, 1000.0D);
//        RadarContactImpl radarContactImpl2 = new RadarContactImpl("R2", -360.0D, 2000.0D);
//        RadarContactImpl radarContactImpl3 = new RadarContactImpl("R3", -375.5D, 3500.0D);
//        RadarContactImpl radarContactImpl4 = new RadarContactImpl("R4", -720.0D, 3500.1D);
//        RadarContactImpl radarContactImpl5 = new RadarContactImpl("R5", -721.5D, -3024.0D);
//        System.out.println(radarContactImpl2.getContactID());
//        System.out.println(radarContactImpl2.getBearing());
//        System.out.println(radarContactImpl2.getDistance());
//        radarContactImpl1 = (RadarContact)
        radarImpl.addContact((RadarContact) radarContactImpl1);
//        radarImpl.addContact((RadarContact) radarContactImpl2);
        System.out.println(radarImpl.returnContacts());
    }

}
