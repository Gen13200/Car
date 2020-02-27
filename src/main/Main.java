package main;

public class Main {

    public static void main(String[] args) {

        Car moskvich = new Car.Builder()
                .setName("Москвич 412")
                .setWheelParameter(50,20)
                .setBodyParameter(160, 180,350)
                .setNumberOfEngineCylinders(4)
                .setTransmissionNumberOfGears(4)
                .build();


    }
}
