package com.address;

public class AddMain {
    public static void main(String[] args) {
        Address address = new Address(80,"Sekhukhune Street","Pretoria",9029);

        System.out.println("The address is :"+address.getUnitNo()+" "+
                         address.getStreetName()+"\n \t\t\t\t"+address.getCity()+"\n \t\t\t\t"+
                            address.getPostalCode());
    }
}
