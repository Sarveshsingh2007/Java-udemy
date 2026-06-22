final class Vehicle {

    final void start() {
        System.out.println("Vehicle Started");
    }
}

public class finalKeyword {

    public static void main(String[] args) {

        final int SPEED = 100;

        System.out.println("Speed: " + SPEED);

        Vehicle v = new Vehicle();
        v.start();

        // SPEED = 200;        // Error
        // class Car extends Vehicle {} // Error
        // start() cannot be overridden because it is final
    }
}