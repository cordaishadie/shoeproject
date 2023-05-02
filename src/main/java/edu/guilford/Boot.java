package edu.guilford;

public class Boot extends Shoe {
    // attributes
    private boolean furLined;
    private boolean zipper;

    // constructors
    public Boot() {
        super();
        // choose a random value for fur lined
        boolean randomFurLined = Math.random() < 0.5;
        furLined = randomFurLined;

        // choose a random value for zipper
        boolean randomZipper = Math.random() < 0.5;
        zipper = randomZipper;
    }

    public Boot(String brand, String color, double size, String material, double heelHeight, 
    int shaftHeight, boolean gender, boolean furLined, boolean zipper){
        super(brand, color, size, material, heelHeight, shaftHeight, gender);
        this.furLined = furLined;
        this.zipper = zipper;
    }


    // getters and setters
    public boolean isFurLined() {
        return furLined;
    }

    public boolean isZipper() {
        return zipper;
    }

    public void setFurLined(boolean furLined) {
        this.furLined = furLined;
    }

    public void setZipper(boolean zipper) {
        this.zipper = zipper;
    }

    // methods
    // toString() method
    @Override
    public String toString() {
        return "Boot{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size=" + getSize() +
                ", material='" + getMaterial() + '\'' +
                ", heelHeight='" + getHeelHeight() + '\'' +
                ", shaftHeight='" + getShaftHeight() + '\'' +
                ", furLined=" + furLined +
                ", zipper=" + zipper +
                '}';
    }

    // add a pricing() method
    public double pricing() {
        // this method will return a price based on various attributes
        // the base price will be the size of the shoe times 8
        double price = getSize() * 8;
        // if the material is leather, mark the price up by 30%
        if (getMaterial().equals("leather")) {
            price = price * 1.3;
        }
        // if the boot is fur lined, add $25 to the price
        if (furLined) {
            price = price + 25;
        }
        // if the heel height is greater than 1.5 inches, increase the price by $20
        if (getHeelHeight() > 1.5) {
            price = price + 20;
        }
        return price;
    }

}
