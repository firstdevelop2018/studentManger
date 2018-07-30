            package com.student.bean;
/**
 * student のBean　class
 * @author FIRSTDEVELOP
 *
 */
public class Teacher {

	private Integer id;//先生id　１
	private String teachername;//先生姓名 2
	private String course;//学科
	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return teachername
	 */
	public String getTeachername() {
		return teachername;
	}
	/**
	 * @param teachername セットする teachername
	 */
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	/**
	 * @return course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course セットする course
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teachername=" + teachername + ", course=" + course + ", getId()=" + getId()
				+ ", getTeachername()=" + getTeachername() + ", getCourse()=" + getCourse() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
