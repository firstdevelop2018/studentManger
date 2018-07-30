package com.student.bean;
/**
 * student のBean　class
 * @author FIRSTDEVELOP
 *
 */
public class Student {

	private Integer id;//学生id　１
	private String name;//学生姓名 2
	private String telephone;//学生电话 3
	private String poslnumber;//学生邮编 4
	private String birthday;//学生生年月日 5
	private int age;//学生年齢 6
	private double score;//学生成績 7
	private int classid;//学生成績 7
	private String mail;//学生メール８
	private String address;//学生住所８
	private String postalCode;//郵便番号
	private String country;//国籍
	private String sex;//性別

	

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
	 * @return telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone セットする telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return poslnumber
	 */
	public String getPoslnumber() {
		return poslnumber;
	}

	/**
	 * @param poslnumber セットする poslnumber
	 */
	public void setPoslnumber(String poslnumber) {
		this.poslnumber = poslnumber;
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
	 * @return classid
	 */
	public int getClassid() {
		return classid;
	}

	/**
	 * @param classid セットする classid
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}

	/**
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail セットする mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode セットする postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
	 * @param id
	 * @param name
	 * @param telephone
	 * @param poslnumber
	 * @param birthday
	 * @param age
	 * @param score
	 * @param classid
	 * @param mail
	 * @param address
	 * @param postalCode
	 * @param country
	 * @param sex
	 */
	public Student(Integer id, String name, String telephone, String poslnumber, String birthday, int age, double score,
			int classid, String mail, String address, String postalCode, String country, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.poslnumber = poslnumber;
		this.birthday = birthday;
		this.age = age;
		this.score = score;
		this.classid = classid;
		this.mail = mail;
		this.address = address;
		this.postalCode = postalCode;
		this.country = country;
		this.sex = sex;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", telephone=" + telephone + ", poslnumber=" + poslnumber
				+ ", birthday=" + birthday + ", age=" + age + ", score=" + score + ", classid=" + classid + ", mail="
				+ mail + ", address=" + address + ", postalCode=" + postalCode + ", country=" + country + ", sex=" + sex
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getTelephone()=" + getTelephone()
				+ ", getPoslnumber()=" + getPoslnumber() + ", getBirthday()=" + getBirthday() + ", getAge()=" + getAge()
				+ ", getScore()=" + getScore() + ", getClassid()=" + getClassid() + ", getMail()=" + getMail()
				+ ", getAddress()=" + getAddress() + ", getPostalCode()=" + getPostalCode() + ", getCountry()="
				+ getCountry() + ", getSex()=" + getSex() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
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
