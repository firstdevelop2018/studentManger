package com.student.dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.bean.Student;
import com.student.mapper.StudentMapper;
import org.apache.log4j.*;
import org.apache.log4j.xml.*;
import java.io.*;

public class StudentDao {

	/**
	 * @Fields jdbcTemplate
	 */
	private JdbcTemplate jdbcTemplate;

	/**
	 * spring提供的类
	 *
	 * @param jdbcTemplate
	 *            返回值类型： void
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * データベースから全部ユーザ検索して結果をindex,jspに返却
	 *
	 * @return 返回值类型： List<Student>
	 */
	public ArrayList<Student> queryAll() {

		// (1)Loggerオブジェクトの生成
		Logger log = Logger.getLogger(ExLog2.class.getName());
		log.info("変数は10以上です。"); // (2)infoメソッドの記述

		String sql = "select id,name,birthday,age,sex,score,country,myNumber from student";
		// 将查询结果映射到Student类中，添加到list中，并返回
		return (ArrayList<Student>) jdbcTemplate.query(sql, new StudentMapper());
	}

	/**
	 * 通过姓名查询
	 *
	 * @param name
	 * @return 返回值类型： List<Student>
	 */
	public List<Student> queryByName(String name) {
		String sql = "select id,name,birthday,age,sex,score,country,myNumber from student where name like '%" + name + "%'";

		return jdbcTemplate.query(sql, new StudentMapper());
	}

	/**
	 * 添加学生
	 *
	 * @param student
	 * @return 返回值类型： boolean
	 */
	public boolean addStu(Student student) {
		String sql = "insert into student(id,name,birthday,age,sex,score,country,myNumber) values(0,?,?,?,?,?,?,?)";

		return jdbcTemplate.update(sql,
				new Object[] { student.getName(), student.getBirthday(), student.getAge(),student.getSex(), student.getScore(),
						student.getCountry(),student.getMyNumber()},
				new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.VARCHAR,
						Types.INTEGER,Types.VARCHAR,Types.VARCHAR}) == 1;
	}

	/**
	 * 删除学生
	 *
	 * @param id
	 * @return 返回值类型： boolean
	 */
	public boolean deleteStu(Integer id) {

		String sql = "delete from student where id = ?";
		return jdbcTemplate.update(sql, id) == 1;
	}

	/**
	 * 更新学生信息
	 *
	 * @param student
	 * @return 返回值类型： boolean
	 */
	public boolean updateStu(Student student) {

		//+ "telephone,postal_code) values(0,?,?,?,?,?,?)";
		String sql = "update student set name=? ,age=?,sex = ? ,score = ? ,country = ? ,myNumber = ? where id = ?";
		Object stuObj[] = new Object[] { student.getName(),student.getBirthday(), student.getAge(), student.getSex(), student.getScore(),
				student.getCountry(),student.getMyNumber()};

		return jdbcTemplate.update(sql, stuObj) == 1;
	}

}
