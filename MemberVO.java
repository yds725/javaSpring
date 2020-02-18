package lab.web.dto;

public class MemberVO {
	
	private String id;
	private String name;
	private String pw;
	private String email;
	private String phoneNumber;
	private String gitAddr;
	private String job;
	private String interset;
	
	
	public MemberVO(String id, String name, String pw, String email, String phoneNumber, String gitAddr, String job,
			String interset) {
		//super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gitAddr = gitAddr;
		this.job = job;
		this.interset = interset;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getGitAddr() {
		return gitAddr;
	}


	public void setGitAddr(String gitAddr) {
		this.gitAddr = gitAddr;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getInterset() {
		return interset;
	}


	public void setInterset(String interset) {
		this.interset = interset;
	}
		
	//public MemberVO()
}



