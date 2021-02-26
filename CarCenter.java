package com.car;

public class CarCenter {
    public static void main(String[] args) {
        Father father = new Father("红","天宇",4,2);
        father.sentence();
        Bike bike = new Bike("黄","捷安特");
        bike.sentence();
        ElecreicBike elecreicBike = new ElecreicBike("飞鸽");
        elecreicBike.sentence();
        ThreeWheelsCar threeWheelsCar = new ThreeWheelsCar();
        threeWheelsCar.sentence();
    }
}

class Father {
    private String color;
    private String brand;
    private int wheels;
    private int seats;

    public Father() {

    }

    public Father(String c, String b) {
        color = c;
        brand = b;
    }

    public Father(String c, String b, int w, int s) {
        color = c;
        brand = b;
        wheels = w;
        seats = s;
    }

    public String getColor() {
        return color;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void sentence() {
        System.out.println("父类测试信息：这是一辆" + getColor() + "颜色的，" + getBrand() + "的非机动车，有" + getWheels() + "个轮子，有" + getSeats() + "个座椅");
    }
}

class Bike extends Father {
    public Bike() {

    }

    public Bike(String c, String b) {
        super(c,b);
    }

    public void sentence() {
        System.out.println("自行车类信息测试:这是一辆" + super.getColor() + "颜色的," + super.getBrand() + "牌的自行车");
    }
}

class ElecreicBike {
    private String battery;

    public ElecreicBike(String b) {
        battery = b;
    }

    public String getBattery() {
        return battery;
    }

    public void sentence() {
        System.out.println("电动车类信息测试:这是一辆使用" + getBattery() + "牌电池的电动车");
    }
}

class ThreeWheelsCar extends Father {
    public ThreeWheelsCar() {
        super.setWheels(3);
    }
    public void sentence() {
        System.out.println("三轮车类信息测试:三轮车是一款有" + getWheels() + "个轮子的非机动车");
    }
}
