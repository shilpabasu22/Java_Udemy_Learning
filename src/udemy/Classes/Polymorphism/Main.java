package udemy.Classes.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Maruti maruti = new Maruti(4,"Ciaz");
        System.out.println(maruti.startEngine());
        System.out.println(maruti.accelerate());
        System.out.println(maruti.brake());

        Car car = new Car(5, "Generic Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Vauxhall vauxhall = new Vauxhall(4,"Insignia");
        System.out.println(vauxhall.startEngine());
        System.out.println(vauxhall.accelerate());
        System.out.println(vauxhall.brake());

       Ford ford = new Ford(6,"Mondeo");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}

class Car {
    private int wheels;
    private boolean engine;
    private int cylinder;
    private String name;

    Car (int cylinder, String name) {
        this.wheels = 4;
        this.engine =true;
        this.cylinder = cylinder;
        this.name = name;
    }
    public String startEngine(){
        return "Car ->Start Engine()";
    }

    public String accelerate(){
        return "Car ->Accelerate()";
    }

    public String brake(){
        return "Car ->Brake()";
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
}

class Ford extends Car {

    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Ford ->Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Ford ->Accelerate()";
    }

    @Override
    public String brake() {
        return  getClass().getSimpleName()+" ->Brake()";
    }
}

class Vauxhall extends Car {

    public Vauxhall(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Vauxhall ->Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Vauxhall ->Accelerate()";
    }

    @Override
    public String brake() {
        return "Vauxhall ->Brake()";
    }
}
class Maruti extends Car {

    public Maruti(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Maruti ->Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Maruti ->Accelerate()";
    }

    @Override
    public String brake() {
        return "Maruti ->Brake()";
    }
}

