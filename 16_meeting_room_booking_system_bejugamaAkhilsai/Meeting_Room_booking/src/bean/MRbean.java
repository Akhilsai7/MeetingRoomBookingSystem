package bean;

public class MRbean {

	String Date,Start_time,end_time,user,status;
	int MR_no,resource,id;
	public int getId() {
		return id;
	}
	public void setId(int string) {
		this.id = string;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getStart_time() {
		return Start_time;
	}
	public void setStart_time(String start_time) {
		Start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMR_no() {
		return MR_no;
	}
	public void setMR_no(int mR_no) {
		MR_no = mR_no;
	}
	public int getResource() {
		return resource;
	}
	public void setResource(int resource) {
		this.resource = resource;
	}
}
