package session09.demo;

import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;		// Kiểu thức ăn
	private boolean isLiveWithHuman;	// Có sống với con người hay không
	private String mamalSound;		// Tiếng kêu
    public MamalAnimal() {
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Kiểu thức ăn: ");
        foodType = sc.nextLine();
        System.out.println("Có sống với con người được hay k: ");
        isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Tiếng kêu: ");
        mamalSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kiểu thức ăn: " + foodType );
        System.out.println("Có sống được: " + isLiveWithHuman);
        System.out.println("Tiếng kêu: " + mamalSound);
    }
}
