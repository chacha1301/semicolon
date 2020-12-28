package co.semi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.semi.common.DAO;
import co.semi.vo.EduVO;

public class EduDAO extends DAO {
	private PreparedStatement psmt;
	private ResultSet rs;

	private final String subject_pro = "select * from edu where edusubject=?";
	private final String edu_new = "SELECT * FROM ( SELECT * FROM edu ORDER BY edunumber DESC ) WHERE ROWNUM <= 4";
	private final String edu_hit = "SELECT * FROM ( SELECT * FROM edu ORDER BY eduhit DESC ) WHERE ROWNUM <= 4";
	private final String selectAll = "select * from edu";
	private final String selectOne = "select * from edu where edunumber=?";
	private final String hit_update = "update edu set eduhit = eduhit +1 where edunumber=?";
	private final String selectDescOne = "select * from where edunumber=?";
	
	public ArrayList<EduVO> programmingList(EduVO vo) {
		ArrayList<EduVO> list = new ArrayList<EduVO>();

		try {
			psmt = conn.prepareStatement(subject_pro);
			psmt.setString(1, vo.getEduSubject());
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new EduVO();
				vo.setMemberId(rs.getString("MEMBERID"));
				vo.setEduNumber(rs.getInt("EDUNUMBER"));
				vo.setEduTitle(rs.getString("EDUTITLE"));
				vo.setEduPrice(rs.getString("EDUPRICE"));
				vo.setEduLecturer(rs.getString("EDULECTURER"));
				vo.setEduSubject(rs.getString("EDUSUBJECT"));
				vo.setEduHit(rs.getInt("EDUHIT"));
				vo.setEduDifficulty(rs.getString("EDUDIFFICULTY"));
				vo.setEduSkill(rs.getString("EDUSKILL"));
				vo.setEduKeyword(rs.getString("EDUKEYWORD"));
				vo.setEduImg(rs.getString("eduimg"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<EduVO> getMainList(EduVO vo) {
		ArrayList<EduVO> list = new ArrayList<EduVO>();
		try {
			psmt = conn.prepareStatement(edu_new);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new EduVO();
				vo.setMemberId(rs.getString("MEMBERID"));
				vo.setEduNumber(rs.getInt("EDUNUMBER"));
				vo.setEduTitle(rs.getString("EDUTITLE"));
				vo.setEduPrice(rs.getString("EDUPRICE"));
				vo.setEduLecturer(rs.getString("EDULECTURER"));
				vo.setEduSubject(rs.getString("EDUSUBJECT"));
				vo.setEduHit(rs.getInt("EDUHIT"));
				vo.setEduDifficulty(rs.getString("EDUDIFFICULTY"));
				vo.setEduSkill(rs.getString("EDUSKILL"));
				vo.setEduKeyword(rs.getString("EDUKEYWORD"));
				vo.setEduImg(rs.getString("eduimg"));
				list.add(vo);
			}

			psmt = conn.prepareStatement(edu_hit);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new EduVO();
				vo.setMemberId(rs.getString("MEMBERID"));
				vo.setEduNumber(rs.getInt("EDUNUMBER"));
				vo.setEduTitle(rs.getString("EDUTITLE"));
				vo.setEduPrice(rs.getString("EDUPRICE"));
				vo.setEduLecturer(rs.getString("EDULECTURER"));
				vo.setEduSubject(rs.getString("EDUSUBJECT"));
				vo.setEduHit(rs.getInt("EDUHIT"));
				vo.setEduDifficulty(rs.getString("EDUDIFFICULTY"));
				vo.setEduSkill(rs.getString("EDUSKILL"));
				vo.setEduKeyword(rs.getString("EDUKEYWORD"));
				vo.setEduImg(rs.getString("eduimg"));
				list.add(vo);
			}
			System.out.println("dao의 list : " + list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(vo);
		return list;

	}

	public ArrayList<EduVO> selectAllList(EduVO vo) {
	      ArrayList<EduVO> list = new ArrayList<EduVO>();

	      try {
	         psmt = conn.prepareStatement(selectAll);
	         rs = psmt.executeQuery();
	         while (rs.next()) {
	            vo = new EduVO();
	            vo.setMemberId(rs.getString("MEMBERID"));
	            vo.setEduNumber(rs.getInt("EDUNUMBER"));
	            vo.setEduTitle(rs.getString("EDUTITLE"));
	            vo.setEduPrice(rs.getString("EDUPRICE"));
	            vo.setEduLecturer(rs.getString("EDULECTURER"));
	            vo.setEduSubject(rs.getString("EDUSUBJECT"));
	            vo.setEduHit(rs.getInt("EDUHIT"));
	            vo.setEduDifficulty(rs.getString("EDUDIFFICULTY"));
	            vo.setEduSkill(rs.getString("EDUSKILL"));
	            vo.setEduKeyword(rs.getString("EDUKEYWORD"));
	            vo.setEduImg(rs.getString("eduimg"));
	            list.add(vo);
	         }
	         System.out.println(list);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return list;
	   }

	public EduVO selectOne(EduVO vo) {
		
		try {
			psmt=conn.prepareStatement(selectOne);
			psmt.setInt(1, vo.getEduNumber());
			rs = psmt.executeQuery();
			if(rs.next()) {
				psmt = conn.prepareStatement(hit_update);
				psmt.setInt(1,vo.getEduNumber());
				psmt.execute();
				vo.setMemberId(rs.getString("MEMBERID"));
	            vo.setEduNumber(rs.getInt("EDUNUMBER"));
	            vo.setEduTitle(rs.getString("EDUTITLE"));
	            vo.setEduPrice(rs.getString("EDUPRICE"));
	            vo.setEduLecturer(rs.getString("EDULECTURER"));
	            vo.setEduSubject(rs.getString("EDUSUBJECT"));
	            vo.setEduHit(rs.getInt("EDUHIT"));
	            vo.setEduDifficulty(rs.getString("EDUDIFFICULTY"));
	            vo.setEduSkill(rs.getString("EDUSKILL"));
	            vo.setEduKeyword(rs.getString("EDUKEYWORD"));
	            vo.setEduImg(rs.getString("eduimg"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	public EduVO selectDescOne(EduVO vo) {
		try {
			psmt=conn.prepareStatement(selectDescOne);
			psmt.setInt(1, vo.getEduNumber());
			rs = psmt.executeQuery();
			if(rs.next()) {
				psmt = conn.prepareStatement(hit_update);
				psmt.setInt(1,vo.getEduNumber());
				psmt.execute();
				vo.setMemberId(rs.getString("MEMBERID"));
	            vo.setEduNumber(rs.getInt("EDUNUMBER"));
	            vo.setEduTitle(rs.getString("EDUTITLE"));
	            vo.setEduPrice(rs.getString("EDUPRICE"));
	            vo.setEduLecturer(rs.getString("EDULECTURER"));
	            vo.setEduSubject(rs.getString("EDUSUBJECT"));
	            vo.setEduHit(rs.getInt("EDUHIT"));
	            vo.setEduDifficulty(rs.getString("EDUDIFFICULTY"));
	            vo.setEduSkill(rs.getString("EDUSKILL"));
	            vo.setEduKeyword(rs.getString("EDUKEYWORD"));
	            vo.setEduImg(rs.getString("eduimg"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

}
