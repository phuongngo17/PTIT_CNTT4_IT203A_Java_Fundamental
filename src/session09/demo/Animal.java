package session09.demo;

import java.util.Scanner;

public class Animal {
   private String animalName;			// Tên động vật
    private int numberOfLegs;		// Số chân;
	private String furColor;			// Màu lông
	private double everageLifeExpectancy; //Tuổi thọ trung bình

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(double everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public  void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên động vật: ");
        animalName = sc.nextLine();
        System.out.println("Số chân động vật: ");
        numberOfLegs = Integer.parseInt(sc.nextLine());
        System.out.println("Màu lông: ");
        furColor = sc.nextLine();
        System.out.println("Tuổi thọ trung bình: ");
        everageLifeExpectancy = Double.parseDouble(sc.nextLine());
    }
    public void display(){
        System.out.println("Tên động hình: " + animalName);
        System.out.println("Số chân: " + numberOfLegs);
        System.out.println("Màu lông: " + furColor);
        System.out.println("Tuổi thọ trung bình: " + everageLifeExpectancy);
    }
}
