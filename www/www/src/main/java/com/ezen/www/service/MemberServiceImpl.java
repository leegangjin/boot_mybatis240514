package com.ezen.www.service;


import com.ezen.www.domain.MemberVO;
import com.ezen.www.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements  MemberService {

    private final MemberMapper memberMapper;

    @Override
    public int insert(MemberVO mvo) {
        int isOk = memberMapper.insert(mvo);

        return (isOk > 0 ? memberMapper.insertAuth(mvo.getEmail()) : 0);
    }
    @Override
    public List<MemberVO> getList(){
        List<MemberVO> list = memberMapper.getList();
        for(MemberVO mvo : list){
            mvo.setAuthList(memberMapper.selectAuth(mvo.getEmail()));
        }
        return list;
    }

    @Override
    public void updateName(MemberVO mvo) {
        memberMapper.updateName(mvo);
    }

    @Override
    public void updatePw(MemberVO mvo) {
        memberMapper.updatePw(mvo);

    }

    @Override
    public void deleteAuth(String id) {
        memberMapper.deleteAuth(id);
    }

    @Override
    public void delete(String id) {
        memberMapper.delete(id);
    }


}
