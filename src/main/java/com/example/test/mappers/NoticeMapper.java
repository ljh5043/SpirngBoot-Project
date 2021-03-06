package com.example.test.mappers;

import com.example.test.model.beans.vo.Criteria;
import com.example.test.model.notice.vo.NoticeVO;

import java.util.List;

public interface NoticeMapper {

    public List<NoticeVO> getList(Criteria criteria);

    public NoticeVO get(Long noticeNo);

    public int getTotal(Criteria criteria);

    public int updateViews(Long noticeNo);
}
