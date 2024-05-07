//import java.util.Date;

public class Citation 
{
	String date;
	int offenceCode;
	double amount;
	String status;
	Registration registration;
	
	public Citation(String date, int offenceCode, double amount, String status, Registration registration)
	{
		this.date = date;
		this.offenceCode = offenceCode;
		this.amount = amount;
		this.status = status;
		this.registration = registration;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getOffenceCode() {
		return offenceCode;
	}

	public void setOffenceCode(int offenceCode) {
		this.offenceCode = offenceCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "Citation [date=" + date + ", offenceCode=" + offenceCode + ", amount=" + amount + ", status=" + status
				+ ", registration=" + registration + ", getDate()=" + getDate() + ", getOffenceCode()="
				+ getOffenceCode() + ", getAmount()=" + getAmount() + ", getStatus()=" + getStatus()
				+ ", getRegistration()=" + getRegistration() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
