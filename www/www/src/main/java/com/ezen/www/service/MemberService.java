package com.ezen.www.service;

import com.ezen.www.domain.MemberVO;

import java.util.List;

public interface MemberService {


    int insert(MemberVO mvo);

    List<MemberVO> getList();

    void updateName(MemberVO mvo);

    void updatePw(MemberVO mvo);

    void deleteAuth(String id);

    void delete(String id);
}
