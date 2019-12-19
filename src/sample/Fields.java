package sample;

public class Fields {
	private int people;
	private int ship;
	private int money;
	private int status;
	Fields(){
		this.people = 30;
		this.ship = 30;
		this.money = 30;
		this.status = 30;
	}
	public void decrease() {
		this.people-=15;
		this.ship-=10;
		this.money-=10;
		this.status-=15;
	}
	public void increase() {
		this.people+=5;
		this.ship+=10;
		this.money+=5;
		this.status+=10;
	}
	public boolean check() {
		if((this.people<=0)||(this.ship<=0)||(this.money<=0)||(this.status<=0)) {
			return true;
		}
		return false;
	}
	public void get() {
		System.out.println(people + " " + ship + " " + money + " " + status);
	}
}
