package co.semi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.semi.common.DAO;
import co.semi.vo.BoardVO;

// INSERT INTO board VALUES(b_seq.nextval, '첫 제목', '첫 내용', 1, 'no', '작성자수기입력', 'sy'); 

public class BoardDAO extends DAO {
	private PreparedStatement psmt;
	private ResultSet rs;

	private final String allList = "SELECT b.* FROM (SELECT a.*, ROWNUM rn FROM (SELECT * FROM board ORDER BY boardnumber DESC)a )b WHERE rn BETWEEN ? and ?";
	private final String pagingTitleList = "SELECT * FROM( SELECT rownum rn, b.* FROM (SELECT * FROM board WHERE boardtitle LIKE ? ORDER BY boardnumber DESC)b ) WHERE rn BETWEEN ? and ?";
	private final String pagingIdList = "SELECT * FROM( SELECT rownum rn, b.* FROM (SELECT * FROM board WHERE memberid LIKE ? ORDER BY boardnumber DESC)b ) WHERE rn BETWEEN ? and ?";
	private final String pagingContentList = "SELECT * FROM( SELECT rownum rn, b.* FROM (SELECT * FROM board WHERE boardcontent LIKE ? ORDER BY boardnumber DESC)b ) WHERE rn BETWEEN ? and ?";
	private final String pagingCount = "SELECT COUNT(*) cnt FROM board";
	private final String keywordTitleCount = "SELECT count(*) cnt FROM board WHERE boardtitle LIKE ?";
	private final String keywordIdCount = "SELECT count(*) cnt FROM board WHERE memberid LIKE ?";
	private final String keywordContentCount = "SELECT count(*) cnt FROM board WHERE boardcontent LIKE ?";
	private final String hit_update = "UPDATE board set boardhit = boardhit + 1 WHERE memberid=?";
	private final String board_read = "SELECT * FROM board WHERE memberid=? ";
	private final String board_insert = "INSERT INTO board(boardnumber, boardtitle, boarddate, boardcontent, memberid) VALUES(semi_b_seq.NEXTVAL, ?, ?, ?, ?)";

	public ArrayList<BoardVO> getList(String currentPage, Integer pSize) {

		int pNum = Integer.parseInt(currentPage);
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();

		try {
			psmt = conn.prepareStatement(allList);
			psmt.setInt(1, pNum * pSize - (pSize - 1));
			psmt.setInt(2, pNum * pSize);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardnumber(rs.getInt("boardnumber"));
				vo.setBoardtitle(rs.getString("boardtitle"));
				vo.setBoardcontent(rs.getString("boardcontent"));
				vo.setBoardhit(rs.getInt("boardhit"));
				vo.setBoardfile(rs.getString("boardfile"));
				vo.setBoarddate(rs.getDate("boarddate"));
				vo.setMemberid(rs.getString("memberid"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<BoardVO> getKeywordList(String currentPage, Integer pSize, String opt, String search) {

		int pNum = Integer.parseInt(currentPage);
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();

		try {
			if (opt.equals("boardtitle")) {
				psmt = conn.prepareStatement(pagingTitleList);
				psmt.setString(1, "%" + search + "%");
				psmt.setInt(2, pNum * pSize - (pSize - 1));
				psmt.setInt(3, pNum * pSize);
			} else if (opt.equals("memberid")) {
				psmt = conn.prepareStatement(pagingIdList);
				psmt.setString(1, "%" + search + "%");
				psmt.setInt(2, pNum * pSize - (pSize - 1));
				psmt.setInt(3, pNum * pSize);
			} else {
				psmt = conn.prepareStatement(pagingContentList);
				psmt.setString(1, "%" + search + "%");
				psmt.setInt(2, pNum * pSize - (pSize - 1));
				psmt.setInt(3, pNum * pSize);
			}
			rs = psmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardnumber(rs.getInt("boardnumber"));
				vo.setBoardtitle(rs.getString("boardtitle"));
				vo.setBoardcontent(rs.getString("boardcontent"));
				vo.setBoardhit(rs.getInt("boardhit"));
				vo.setBoardfile(rs.getString("boardfile"));
				vo.setMemberid(rs.getString("memberid"));
				vo.setBoarddate(rs.getDate("boarddate"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int getAllCount() {
		int count = 0;

		try {
			psmt = conn.prepareStatement(pagingCount);
			rs = psmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	public int getKeywordCount(String opt, String search) {

		int count = 0;

		try {
			if (opt.equals("boardtitle")) {
				psmt = conn.prepareStatement(keywordTitleCount);
				psmt.setString(1, "%" + search + "%");
			} else if (opt.equals("memberid")) {
				psmt = conn.prepareStatement(keywordIdCount);
				psmt.setString(1, "%" + search + "%");
			} else {
				psmt = conn.prepareStatement(keywordContentCount);
				psmt.setString(1, "%" + search + "%");
			}
			rs = psmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("cnt");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public int insert(BoardVO vo) {
		int n = 0;
		try {
			psmt = conn.prepareStatement(board_insert);
			psmt.setString(1, vo.getBoardtitle());
			psmt.setDate(2, vo.getBoarddate());
			psmt.setString(3, vo.getBoardcontent());
			psmt.setString(4, vo.getMemberid());
			n = psmt.executeUpdate();
			System.out.println(n + "건의 글이 등록되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	public BoardVO selectRead(BoardVO vo) {
		try {
			psmt = conn.prepareStatement(board_read);
			psmt.setString(1, vo.getMemberid());
			rs = psmt.executeQuery();
			while (rs.next()) {
				psmt = conn.prepareStatement(hit_update);
				psmt.setString(1, vo.getMemberid());
				psmt.executeUpdate();

				vo.setBoardnumber(rs.getInt("boardnumber"));
				vo.setBoardtitle(rs.getString("boardtitle"));
				vo.setBoardcontent(rs.getString("boardcontent"));
				vo.setBoardhit(rs.getInt("boardhit"));
				vo.setBoardfile(rs.getString("boardfile"));
				vo.setMemberid(rs.getString("memberid"));
				vo.setBoarddate(rs.getDate("boarddate"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}
}
