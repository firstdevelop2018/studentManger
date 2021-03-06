package com.student.bean;
/**
 * student のBean　class
 * @author FIRSTDEVELOP
 *
 */
public class Student {

	private Integer id;//学生id　１
	private String name;//学生姓名 2
	private String birthday;//学生生年月日 5
	private int age;//学生年齢 6
	private double score;//学生成績 7
	private String sex;//性別
	private String country;//国籍
	private String myNumber;//個人情報
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
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return score
	 */
	public double getScore() {
		return score;
	}
	/**
	 * @param score セットする score
	 */
	public void setScore(double score) {
		this.score = score;
	}
	/**
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex セットする sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country セットする country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return myNumber
	 */
	public String getMyNumber() {
		return myNumber;
	}
	/**
	 * @param myNumber セットする myNumber
	 */
	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}
	/**
	 * @param id
	 * @param name
	 * @param birthday
	 * @param age
	 * @param score
	 * @param sex
	 * @param country
	 * @param myNumber
	 */
	public Student(Integer id, String name, String birthday, int age, double score, String sex, String country,
			String myNumber) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.score = score;
		this.sex = sex;
		this.country = country;
		this.myNumber = myNumber;
	}
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", sex=" + sex + ", country=" + country + ", myNumber=" + myNumber + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getBirthday()=" + getBirthday() + ", getAge()=" + getAge()
				+ ", getScore()=" + getScore() + ", getSex()=" + getSex() + ", getCountry()=" + getCountry()
				+ ", getMyNumber()=" + getMyNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	/**
	 *
	 */
	public Student() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}


}
