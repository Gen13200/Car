package main;

public class Car {

    String name;

    double wheelDiameter;
    double wheelWidth;

    double bodyHeight;
    double bodyWidth;
    double bodyLong;

    int numberOfEngineCylinders;

    int transmissionNumberOfGears;


    public static class Builder {
        private Car carBuilder;

        public Builder(){
            carBuilder = new Car();
        }

        public Car build(){
            return carBuilder;
        }

        public  Builder setName(String name){
            carBuilder.name = name;
            return this;
        }
        public  Builder setWheelParameter(double wheelDiameter, double wheelWidth){
            carBuilder.wheelDiameter = wheelDiameter;
            carBuilder.wheelWidth = wheelWidth;
            return this;
        }
        public  Builder setBodyParameter(double bodyHeight, double bodyWidth, double bodyLong){
            carBuilder.bodyHeight = bodyHeight;
            carBuilder.bodyWidth = bodyWidth;
            carBuilder.bodyLong = bodyLong;
            return this;
        }
        public  Builder setNumberOfEngineCylinders(int numberOfEngineCylinders){
            carBuilder.numberOfEngineCylinders = numberOfEngineCylinders;
            return this;
        }
        public  Builder setTransmissionNumberOfGears(int transmissionNumberOfGears){
            carBuilder.transmissionNumberOfGears = transmissionNumberOfGears;
            return this;
        }

    }

}
