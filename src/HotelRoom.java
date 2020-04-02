import java.util.Scanner;

import entities.Room;

public class HotelRoom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		
		
		for(int i=0;n>i;i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room");
			int number = sc.nextInt();
			
			vect[number] = new Room(name,email);
				
		}
		
		System.out.println("Rooms occupied");
		
		for(int i=0;vect.length>i;i++) {
			if(vect[i] != null) {
				System.out.printf("Name: %s%n",vect[i].getName());
				System.out.printf("Email: %s%n",vect[i].getEmail());
				System.out.printf("Room: %d%n",i );
			}
			
		}
		
		
		
		
		sc.close();
	}

}
