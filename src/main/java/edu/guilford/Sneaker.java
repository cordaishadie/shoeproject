package edu.guilford;

public class Sneaker extends Shoe {
    // attributes
    private String laceType;
    private String soleType;
    private String performance;

    // constructor
    public Sneaker() {
        super();
        // choose a random lace type
        String[] laceTypes = {"flat", "round", "oval", "elastic", "no tie"};
        int randomLaceType = (int) (Math.random() * laceTypes.length);
        laceType = laceTypes[randomLaceType];

        // choose a random sole type
        String[] soleTypes = {"flat", "platform", "wedge", "high heel", "stiletto"};
        int randomSoleType = (int) (Math.random() * soleTypes.length);
        soleType = soleTypes[randomSoleType];

        // choose a random performance
        String[] performances = {"running", "walking", "basketball", "tennis", "skateboarding"};
        int randomPerformance = (int) (Math.random() * performances.length);
        performance = performances[randomPerformance];
    }

    public Sneaker(String brand, String color, double size, String material, double heelHeight, 
    int shaftHeight, boolean gender, String laceType, String soleType, String performance){
        super(brand, color, size, material, heelHeight, shaftHeight, gender);
        this.laceType = laceType;
        this.soleType = soleType;
        this.performance = performance;
    }

    // getters and setters
    public String getLaceType() {
        return laceType;
    }

    public String getSoleType() {
        return soleType;
    }

    public String getPerformance() {
        return performance;
    }

    public void setLaceType(String laceType) {
        this.laceType = laceType;
    }

    public void setSoleType(String soleType) {
        this.soleType = soleType;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    // methods
    // toString() method
    @Override
    public String toString() {
        return "Sneaker{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size=" + getSize() +
                ", material='" + getMaterial() + '\'' +
                ", heelHeight='" + getHeelHeight() + '\'' +
                ", shaftHeight='" + getShaftHeight() + '\'' +
                ", laceType='" + laceType + '\'' +
                ", soleType='" + soleType + '\'' +
                ", performance='" + performance + '\'' +
                '}';
    }

    // add a pricing() method
    public double pricing() {
        // this method will return a price based on various attributes
        // the base price will be the size of the shoe times 10
        double price = getSize() * 10;
        // if the brand is Nike, add $30
        if (getBrand().equals("Nike")) {
            price += 30;
        }
        // if the lace type is no tie, take off $10
        if (laceType.equals("no tie")) {
            price -= 10;
        }
        // if the performance is tennis, mark up the price by 20%
        if (performance.equals("tennis")) {
            price *= 1.2;
        }
        return price;
    }

    
}
