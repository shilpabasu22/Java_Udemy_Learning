package udemy.Classes.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger {

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    public DeluxeBurger() {
        super("Deluxe", "Brown", true, 14.54);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.45);


    }
}
