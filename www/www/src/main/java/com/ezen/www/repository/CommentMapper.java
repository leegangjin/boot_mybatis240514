
package com.ezen.www.repository;

import com.ezen.www.domain.CommentVO;
import com.ezen.www.domain.PagingVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {


    int post(CommentVO cvo);

    List<CommentVO> getList(@Param("bno") long bno,@Param("pgvo") PagingVO pgvo);

    int bnoToTotalCount(long bno);

    int update(CommentVO cvo);

    int delete(long cno);
}



