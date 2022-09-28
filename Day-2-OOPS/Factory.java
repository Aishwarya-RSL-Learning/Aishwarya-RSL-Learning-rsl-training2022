public class Factory {
    // factoryName is private. can be accessed within the class only
    private String factoryName;
    //parameterized constructor
    Factory(String factoryName){
        this.factoryName = factoryName;
    }
    boolean isFactoryOpened;
    boolean isProductionStart;
    //inner class
    //Vehicle class contains abstract methods hence it is abstract class
    abstract class Vehicle{
        protected String engineType;
        protected int registrationNum;
        protected int getNumberOfWheels;
        abstract void start();
        abstract void run(int speed);
        abstract void stop();
        abstract void getSpeed();
    }

    /**
     *Car is type of Vehicle
     */
    class Car extends Vehicle{
        //private String name;
        //Whenever we create an object of Car class constructor will print the message
        int speed;
        boolean isBackLightOn;
        Car(){
            //can directly access member of outer class
            isBackLightOn = false;
            speed = 0;
            System.out.println("-----This is a brand new " + factoryName + " car------");
        }
        //can access protected member
        String engineType = "Petrol";
        int registrationNum = 1234;
        int getNumberOfWheels = 4;
        void start(){
            //can directly access member of outer class
            System.out.println(factoryName + " car is started");
        }

        @Override
        void run(int speed) {
            this.speed = speed;
            //can directly access member of outer class
            System.out.println(factoryName+" car is running");
        }

        @Override
        void stop() {
            //can directly access member of outer class
            System.out.println(factoryName+" car is stopped");
        }
        void getSpeed(){
            System.out.println(speed+"kmph");
        }
        public void changeBackLightState(boolean isBackLightOn){
            this.isBackLightOn = isBackLightOn;
            if(isBackLightOn){
                System.out.println("Turned BackLight on");
            }
            else{
                System.out.println("Turned BackLight off");
            }
        }
    }

    /**
     * Cycle is type of Vehicle
     */
    private class Cycle extends Vehicle{
        //can access protected member
        int getNumberOfWheels = 2;
        String engineType = "electricity";
        private String typeOfCycle;
        int speed;
        Cycle(){
            //can directly access member of outer class
            System.out.println("----This is a brand new "+ factoryName +" cycle----");
        }
        @Override
        void start() {
            System.out.println(factoryName+" cycle is running");
        }

        //method overloading
        void run(int speed){
            this.speed = speed;
            System.out.println(factoryName + "Cycle is running");
        }

        @Override
        void stop() {
            System.out.println(factoryName+" Cycle is stopped");
        }
        void getSpeed(){
            System.out.println(speed+"kmph");
        }
    }

    /**
     * Tractor is type of vehicle
     */
    class Tractor extends Vehicle{
        //can access protected member
        String engineType = "Diesel";
        int registrationNum = 123456;
        int getNumberOfWheels = 4;
        int speed;
        Tractor(){
            //can directly access member of outer class
            System.out.println("----This is a brand new "+ factoryName+" Tractor----");
        }
        @Override
        void start() {
            //can directly access member of outer class
            System.out.println(factoryName + " tractor is started");
        }

        @Override
        void run(int speed) {
            this.speed = speed;
            //can directly access member of outer class
            System.out.println(factoryName+" tractor is running");
        }

        @Override
        void stop() {
            System.out.println(factoryName +" tractor is stopped");
        }
        void getSpeed(){
            System.out.println(speed+"kmph");
        }
    }

    public static void main(String[] args) {
        Factory ferrari = new Factory("Ferrari");
        Factory johnDeer = new Factory("John Deer");
        Factory atlas = new Factory("Atlas");

        //Object of car is Associated with the factory object
        Car  ferrariCar = ferrari.new Car();
        ferrariCar.run(40);
        ferrariCar.changeBackLightState(true);
        //Object of Tractor is Associated with the factory object
        Tractor johnDeerCycle = johnDeer.new Tractor();
        johnDeerCycle.run(40);
        //Object of cycle is Associated with the factory object
        Cycle atlas_Cycle = atlas.new Cycle();
        atlas_Cycle.run(20);
    }

}
