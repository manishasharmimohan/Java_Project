package busReserv;

public class Bus {
private int busNo;
private int capacity;
private boolean ac;

Bus(int no,int cap,boolean ac){
	this.busNo=no;
	this.ac=ac;
	this.capacity=cap;
	}
public int getBusNo() {
	return busNo;
}
public int getCapacity(){
	return capacity;
}
public boolean isAc() {
	return ac;
}
public void setAc(boolean val) {
	ac=val;
}
public void setCapacity(int cap) {
	capacity=cap;
}
public void displayBusInfo(){
	System.out.println("Bus No: "+busNo+" Ac: "+ac+" Total Capacity:"+capacity);
}
}
