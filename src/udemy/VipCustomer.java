package udemy;

public class VipCustomer {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Tom", "tom@tom.com");
        VipCustomer customer3 = new VipCustomer("Ron", 1000.0, "Ron@ron.com");
        System.out.println("-------Customer 1-------");
        System.out.println("Customer 1 name = "+customer1.getName());
        System.out.println("Customer 1 credit limit = "+customer1.getCreditLimit());
        System.out.println("Customer 1 email Address = "+ customer1.getEmailAddress());
        System.out.println("-------Customer 2-------");
        System.out.println("Customer 2 name = "+customer2.getName());
        System.out.println("Customer 2 credit limit = "+customer2.getCreditLimit());
        System.out.println("Customer 2 email Address = "+ customer2.getEmailAddress());
        System.out.println("-------Customer 3-------");
        System.out.println("Customer 3 name = "+customer3.getName());
        System.out.println("Customer 3 credit limit = "+customer3.getCreditLimit());
        System.out.println("Customer 3 email Address = "+ customer3.getEmailAddress());
    }
    private String name;
    private double creditLimit;
    private String emailAddress;
    public VipCustomer(){
        this("Bob", 100.0, "bob@bob.com");
        System.out.println("Empty constructor called");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with all parameters called");
    }

    public VipCustomer(String name, String emailAddress){
        this(name, 500.0, emailAddress);
        System.out.println("Constructor with 2 parameters called");
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
