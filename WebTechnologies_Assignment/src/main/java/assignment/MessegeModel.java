package assignment;

public class MessegeModel {
	private int uid;
    private String from;
    private String to;
    private String msg;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "MessegeModel [uid=" + uid + ", from=" + from + ", to=" + to + ", msg=" + msg + "]";
	}
    
}
