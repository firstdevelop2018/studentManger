package com.teacher.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.bean.Teacher;
import com.student.mapper.TeacherMapper;

public class TeacherDao {

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
	 * @return 返回值类型： List<Teacher>
	 */
	public List<Teacher> queryAll() {

		String sql = "select id,teachername,course from teacher";
		// 将查询结果映射到Teacher类中，添加到list中，并返回
		return jdbcTemplate.query(sql, new TeacherMapper());
	}

	/**
	 * 通过姓名查询
	 *
	 * @param name
	 * @return 返回值类型： List<Teacher>
	 */
	public List<Teacher> queryByName(String teachername) {
		String sql = "select id,teachername,course from teacher where teachername like '%" + teachername + "%'";

		return jdbcTemplate.query(sql, new TeacherMapper());
	}

	/**
	 * 添加学生
	 *
	 * @param teacher
	 * @return 返回值类型： boolean
	 */
	public boolean addStu(Teacher teacher) {
		String sql = "insert into teacher(id,teachername,course) values(0,?,?)";

		return jdbcTemplate.update(sql,
				new Object[] { teacher.getTeachername(), teacher.getCourse() },
				new int[] { Types.VARCHAR, Types.VARCHAR}) == 1;
	}

	/**
	 * 删除学生
	 *
	 * @param id
	 * @return 返回值类型： boolean
	 */
	public boolean deleteTeacher(Integer id) {

		String sql = "delete from teacher where id = ?";
		return jdbcTemplate.update(sql, id) == 1;
	}

	/**
	 * 更新学生信息
	 *
	 * @param teacher
	 * @return 返回值类型： boolean
	 */
	public boolean updateTeacher(Teacher teacher) {

		//+ "telephone,postal_code) values(0,?,?,?,?,?,?)";
		String sql = "update teacher set teachername=? ,course=?  where id = ?";
		Object teaObj[] = new Object[] { teacher.getTeachername(), teacher.getCourse(),teacher.getId() };

		return jdbcTemplate.update(sql, teaObj) == 1;
	}

}
