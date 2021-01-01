package co.semi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.semi.common.DAO;
import co.semi.vo.RepleVO;

public class RepleDAO extends DAO {

	private PreparedStatement psmt;
	private ResultSet rs;

	private final String newReple = "INSERT INTO REPLE VALUES(R_SEQ.NEXTVAL,?,?,?,?)";

	public int insert(RepleVO vo) {
		int n = 0;
		
		try {
			psmt = conn.prepareStatement(newReple);
			psmt.setString(1, vo.getRepleid());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getReplecontent());
			psmt.setInt(4, vo.getBoardnumber());
			n = psmt.executeUpdate();
			System.out.println(n+ "건의 댓글이 등록되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return n;
	}
}
