package beans;

public class studentBean {

	private int stuId;
	private String stuName;
	private String stuPwd;
	@Override
	public String toString() {
		return "studentBean [stuId=" + stuId + ", stuName=" + stuName + ", stuPwd=" + stuPwd + "]";
	}
	public studentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	
}
