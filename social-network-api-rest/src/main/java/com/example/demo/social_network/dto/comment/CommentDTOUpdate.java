package com.example.demo.social_network.dto.comment;

public class CommentDTOUpdate {
	/*Properties*/
	private String content;

	/*Constructs*/
	public CommentDTOUpdate() {
		
	}
	public CommentDTOUpdate(String content) {
		this.content = content;
	}

	/*Methods*/
	public String getContent() {
		return content;
	}
}
