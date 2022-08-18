package derived;

import data.IcEngine;

public class Diesel extends IcEngine {
    public Diesel(int modelNo, int maxPower, int maxRPM, int displacement, int noOfCyllender, String fuelType) {
        super(modelNo, maxPower, maxRPM, displacement, noOfCyllender, fuelType);
    }
}
