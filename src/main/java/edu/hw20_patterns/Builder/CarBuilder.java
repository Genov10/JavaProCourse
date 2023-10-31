package edu.hw20_patterns.Builder;

public class CarBuilder {
    private int wheelAmount;
    private String color;
    private String fuelType;

    public CarBuilder(Builder builder) {
        this.wheelAmount = builder.wheelAmount;
        this.color = builder.color;
        this.fuelType = builder.fuelType;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private int wheelAmount;
        private String color;
        private String fuelType;

        public Builder wheelAmount(int wheelAmount) {
            if (wheelAmount < 4) {
                System.out.println("It cannot exist");
            } else {
                this.wheelAmount = wheelAmount;
            }
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder fuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder build() {
            return new CarBuilder(this);
        }
    }
    public static void main(String[] args) {
        CarBuilder builderDemo = CarBuilder.newBuilder().wheelAmount(2).color("black").fuelType("gas").build();
        System.out.println("wheel amount: " + builderDemo.wheelAmount + "\ncolor: " + builderDemo.color + "\ntype of fuel: " + builderDemo.fuelType);
    }
}
