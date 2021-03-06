public class Time{

	public Time(int hours, int minutes, String amOrPm){
		
		this.hours = hours;
		this.minutes = minutes;
		this.amOrPm = amOrPm;
		totMinutes = totMinutes();
	}

	private int totMinutes(){
		if(this.amOrPm.equals("am")){
			if(this.hours!=12)
				return this.minutes+60*this.hours;
			else
				return this.minutes;
		}
		else{
			if(this.hours!=12)
				return this.minutes+60*(this.hours+12);
			else
				return this.minutes+60*this.hours;
		}
			
	}
	private void prettyTime(){
		this.hours= totMinutes/60;
		this.minutes = totMinutes-this.hours*60;
		while(this.hours>24)
			this.hours -=24;
		if(this.hours>12){
			this.hours -= 12;
			this.amOrPm = this.amOrPm.replace('a', 'p');
		}
		else{
	        	if(this.hours!=12){
				if(this.hours!=0)
					this.amOrPm = this.amOrPm.replace('p', 'a');
				else{
					this.hours = 12;
					this.amOrPm = this.amOrPm.replace('p', 'a');
				}
			}
			else
				this.amOrPm = this.amOrPm.replace('a', 'p');
		}
	}

	public void addDuration(int minutes){
		totMinutes += minutes;
	}

	public void addDuration(int hours, int minutes){
		totMinutes += minutes+60*hours;
		}
	
	public boolean isBefore (Time t2){
		if(this.totMinutes<t2.totMinutes)
			return true;
		else
			return false;
	}

	public boolean isAfter(Time t2){
		if(this.totMinutes>t2.totMinutes)
			return true;
		else
			return false;
	}
		
	public void print(){
		prettyTime();
		System.out.println(this.hours+" "+this.minutes+" "+this.amOrPm);
		System.out.println(totMinutes);
	}
	
	private int hours, minutes, totMinutes;
	private String amOrPm;
}
