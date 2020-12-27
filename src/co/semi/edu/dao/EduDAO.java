package co.semi.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.semi.common.DAO;

public class EduDAO extends DAO{
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String sql;

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//
	String edulists = "select * from edu";
	String edusublist = "select*from edu where edusubject=?";
	
	// 전체조회
	public ArrayList<EduVO> selectAll(String list) {

		ArrayList<EduVO> elist = new ArrayList<EduVO>();
		EduVO vo = new EduVO();
		try {
			psmt = conn.prepareStatement(edulists);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new EduVO();
				vo.setEduNumber(rs.getString("edunumber"));
				vo.setEduTitle(rs.getString("edutitle"));
				vo.setEduPrice(rs.getString("eduprice"));
				vo.setEduLecturer(rs.getString("edulecturer"));
				vo.setEduSubject(rs.getString("edusubject"));
				vo.setEduState(rs.getString("edustate"));
				vo.setEduKeyword(rs.getString("edukeyword"));
				vo.setEduImg(rs.getString("eduimg"));

				elist.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return elist;

	}

	// 주제별 강의목록 불러오기
	public ArrayList<EduVO> select(String sub) {
		ArrayList<EduVO> elist = new ArrayList<EduVO>();
		EduVO vo = new EduVO();
		try {
			psmt = conn.prepareStatement(edusublist);
			psmt.setString(1, vo.getEduSubject());
			rs = psmt.executeQuery();
			if (rs.next()) {// 여기 파란 것들은 디비에있는 컬럼명이야 수정 ㄴㄴ
				vo.setEduNumber(rs.getString("edunumber"));
				vo.setEduTitle(rs.getString("edutitle"));
				vo.setEduPrice(rs.getString("eduprice"));
				vo.setEduLecturer(rs.getString("edulecturer"));
				vo.setEduSubject(rs.getString("edusubject"));
				vo.setEduState(rs.getString("edustate"));
				vo.setEduKeyword(rs.getString("edukeyword"));
				vo.setEduImg(rs.getString("eduimg"));
				elist.add(vo);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close();
		}
		return elist;

	}

}
