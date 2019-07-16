package udemy.Classes.OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "White Bread", false, 2.49);

        System.out.println("Total Burger Price is "+hamburger.itemisedHamburger());
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.45);
        System.out.println("Total Burger Price is "+hamburger.itemisedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(false,3.56);
        healthyBurger.addHamburgerAddition1("Egg", 4.23);
        healthyBurger.addHealthyAddition1("Lettuce",1);
        System.out.println("Total Burger Price is "+healthyBurger.itemisedHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Lettuce", 2.3);
        System.out.println("Total Burger Price is "+db.itemisedHamburger());
    }
}

