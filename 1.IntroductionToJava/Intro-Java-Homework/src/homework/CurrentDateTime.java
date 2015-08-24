package homework;

import java.util.Date;

public class CurrentDateTime {

	private Date date;

	public CurrentDateTime() {
		this.setDate(new Date());
		System.out.println(this.getDate());
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}