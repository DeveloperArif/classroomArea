package co.grandcircus.lab2;

import java.util.Scanner;

public class ClassroomDetails {

	public static void main(String[] args) {
		System.out.println("Let's find out the area and perimeter of your classroom!");

		System.out.println("Measure the length of your classroom in feet and enter it here: ");

		Scanner scnr = new Scanner(System.in);

		double classroomLength;

		classroomLength = scnr.nextDouble();

		System.out.println("Measure the width of your classroom in feet and enter it here: ");

		double classroomWidth;

		double classroomHeight;

		double classroomVolume;

		classroomWidth = scnr.nextDouble();

		double area = classroomLength * classroomWidth;

		double perimeter = 2 * (classroomLength + classroomWidth);

		System.out.print("The area of your classroom is ");
		System.out.print(area);
		System.out.println(" sq ft!");

		System.out.print("The perimeter of your classroom is ");
		System.out.print(perimeter);
		System.out.println(" ft!");

		System.out.println("Would you like to continue and measure the volume of your classroom?");
		System.out.println("Enter \"y\" for yes, or \"n\" for no.");

		String continueMeasuringVolume;

		continueMeasuringVolume = scnr.next();

		if (continueMeasuringVolume == "y") {
			System.out.println("Enter the height of your classroom in feet: ");
			classroomHeight = scnr.nextDouble();
			double volume = classroomLength * classroomWidth * classroomHeight;
			System.out.print("The volume of your classroom is:");
			System.out.println(volume);
		}

		else {
			System.out.println("Thank you.  Have a good day!");
		}

	}
}