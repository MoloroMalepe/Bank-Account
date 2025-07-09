package com.address;

public final class Address {

    private final int unitNo;
    private final String streetName;
    private final String city;
    private final int postalCode;

    Address(int unitNo, String streetName, String city, int postalCode){
        this.unitNo=50;
        this.streetName=streetName;
        this.city=city;
        this.postalCode=postalCode;
    }

    public int getUnitNo() {
        return unitNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public long getPostalCode() {
        return postalCode;
    }
}
