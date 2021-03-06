package com.song.woo.member.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.song.woo.member.domain.Member;

public interface MemberDao extends JpaRepository<Member, Long> {
	Member findByMemId(String memId);
}
