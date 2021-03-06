package com.ssafy.homesns.service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ssafy.homesns.dto.GroupDto;
import com.ssafy.homesns.dto.GroupMemberDto;
import com.ssafy.homesns.dto.GroupMemberResultDto;
import com.ssafy.homesns.dto.GroupResultDto;
import com.ssafy.homesns.dto.ProfileImageResultDto;

public interface GroupService {
	
	// 그룹 생성
	public GroupResultDto groupListCreate(GroupDto groupDto, MultipartHttpServletRequest request);
	// 그룹 프로필 이미지 수정
	public GroupResultDto groupProfileImageUpdate(int groupId, MultipartHttpServletRequest request);
	// 그룹 프로필 이미지 조회
	public ProfileImageResultDto groupProfileImageSearch(int groupId);

	
	// 그룹 리스트 불러오기
	public GroupResultDto groupListSearch(int userSeq);
	// 그룹 정보 수정
	public GroupResultDto groupListUpdate(GroupDto groupDto);
	// 그룹 삭제
	public GroupResultDto groupListDelete(int groupId);
	
	
	// 그룹 멤버 추가
	public GroupMemberResultDto groupMemberCreate(GroupDto groupDto);
	// 그룹 멤버 리스트 불러오기
	public GroupMemberResultDto groupMemberSearch(int groupId);
	// 그룹 멤버 수정 -> 매니저 권한 부여
	public GroupMemberResultDto groupMemberManagerAuthApprove(GroupMemberDto groupMemberDto);
	// 그룹 멤버 수정 -> 매니저 권한 삭제
	public GroupMemberResultDto groupMemberManagerAuthDecline(GroupMemberDto groupMemberDto);
	// 그룹 나가기
	public GroupMemberResultDto groupMemberDelete(GroupMemberDto groupMemberDto);
}
