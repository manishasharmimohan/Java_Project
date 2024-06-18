package busReserv;
import java.util.*;
import java.util.ArrayList;
public class BusDemo {
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,2,true));
		buses.add(new Bus(2,50,false));
		buses.add(new Bus(3,55,true));
		int userOption=1;
		Scanner sc=new Scanner(System.in);
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		while(userOption==1) {
		System.out.println("Enter 1 to book 2 to exit ");
		userOption=sc.nextInt();
		if(userOption==1) {
			Booking booking =new Booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Booking is confirmed");
			}
			else {
				System.out.println("Sorry ! bus is full. Try another bus or date");
			}
			
		}
		
	}
	}
}
