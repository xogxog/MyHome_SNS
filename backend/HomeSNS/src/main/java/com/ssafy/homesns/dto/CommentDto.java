package com.ssafy.homesns.dto;

import java.util.Date;

public class CommentDto {

	private int commentId;
	private int feedId; 
	private int commentTag;
	private int commentAuthor; 
	private String content;
	private Date commentUploadDate; 
	
	private int good;
	private int sad;
	private int check; 
	private int fun;
	private int amaze;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public int getCommentTag() {
		return commentTag;
	}
	public void setCommentTag(int commentTag) {
		this.commentTag = commentTag;
	}
	public int getCommentAuthor() {
		return commentAuthor;
	}
	public void setCommentAuthor(int commentAuthor) {
		this.commentAuthor = commentAuthor;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCommentUploadDate() {
		return commentUploadDate;
	}
	public void setCommentUploadDate(Date commentUploadDate) {
		this.commentUploadDate = commentUploadDate;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getSad() {
		return sad;
	}
	public void setSad(int sad) {
		this.sad = sad;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public int getFun() {
		return fun;
	}
	public void setFun(int fun) {
		this.fun = fun;
	}
	public int getAmaze() {
		return amaze;
	}
	public void setAmaze(int amaze) {
		this.amaze = amaze;
	}
	@Override
	public String toString() {
		return "CommentDto [commentId=" + commentId + ", feedId=" + feedId + ", commentTag=" + commentTag
				+ ", commentAuthor=" + commentAuthor + ", content=" + content + ", commentUploadDate="
				+ commentUploadDate + ", good=" + good + ", sad=" + sad + ", check=" + check + ", fun=" + fun
				+ ", amaze=" + amaze + "]";
	} 
	
	
	
}
