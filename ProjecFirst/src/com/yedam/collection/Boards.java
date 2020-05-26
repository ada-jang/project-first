package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class Boards {
	private String boardName;
	private List<Board> boards;

	Boards(String boardName, int capacity) {
		this.boardName = boardName;
		this.boards = new ArrayList<>();
	}

	public void addBoard(Board board) {
		boards.add(board);
	}

	public void updateBoard(Board board) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getTitle().equals(board.getTitle())) {
				boards.get(i).setContent(board.getContent());
			}
		}
	}

	public void deleteBoard(String title) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getTitle().equals(title)) {
				boards.remove(i);
			}
		}
	}

	public List<Board> boardList() {
		return this.boards;
	}

}