package org.thinkjack.domain;

public class UserVO {

	private int id;
	private String userid;
	private String userpw;
	private String username;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", userid=" + userid + ", userpw=" + userpw + ", username=" + username + "]";
	}
}
