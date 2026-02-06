package session09.demo;

import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;			// Có bay được hay không
	private String birdSound;		// Tiếng hót

    public Bird() {
    }

    public Bird(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Có bay được hay không: ");
        isFly =Boolean.parseBoolean(sc.nextLine());
        System.out.println("Tiếng hót: ");
        birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Có bay được: " + isFly);
        System.out.println("Tiếng hót: " + birdSound);
    }
}
