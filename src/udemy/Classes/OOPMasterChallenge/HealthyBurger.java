package udemy.Classes.OOPMasterChallenge;

public class HealthyBurger extends Hamburger {

    private String healthyExta1Name;
    private double healthyExtra1Price;

    private String healthyExta2Name;
    private double healthyExtra2Price;
    public HealthyBurger( boolean meat, double basePrice) {
        super("Healthy", "Brown Rye", meat, basePrice);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExta1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExta2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemisedHamburger() {
        double hamburgerPrice = super.itemisedHamburger();

        if(this.healthyExta1Name!=null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added "+this.healthyExta1Name+" for an extra "+this.healthyExtra1Price);
        }

        if(this.healthyExta2Name!=null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added "+this.healthyExta2Name+" for an extra "+this.healthyExtra2Price);
        }

        return hamburgerPrice;

    }
}
