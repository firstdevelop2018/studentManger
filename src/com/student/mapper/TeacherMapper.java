package com.student.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.student.bean.Teacher;

/**
 * TeacherMapper数据库映射
 *
 * @ClassName TeacherMapper
 */

public class TeacherMapper implements RowMapper<Teacher> {

	public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Teacher Teacher = new Teacher();

		Teacher.setId(rs.getInt(1));
		Teacher.setName(rs.getString(2));

		Teacher.setBirthday(getStringDate(rs.getString(3)));
		Teacher.setAge(rs.getInt(4));
		Teacher.setSex(rs.getString(5));
		Teacher.setScore(rs.getDouble(6));
		Teacher.setCountry(rs.getString(7));
		Teacher.setMyNumber(rs.getString(8));
		return Teacher;
	}

	/**
	 * 获取日期
	 *
	 * @return 返回日期字符串格式yyyy-MM-dd
	 * @throws ParseException
	 */
	private String getStringDate(String birthday) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dateString = new Date();
		String strRtnDate = "";
		try {
			dateString = formatter.parse(birthday);
			strRtnDate = new SimpleDateFormat("yyyy-MM-dd").format(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return strRtnDate;
	}

}