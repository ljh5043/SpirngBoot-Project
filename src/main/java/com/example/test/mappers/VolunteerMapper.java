package com.example.test.mappers;

import com.example.test.model.beans.vo.Criteria;
import com.example.test.model.volunteer.vo.ApplicantsVO;
import com.example.test.model.volunteer.vo.VolunteerBoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VolunteerMapper {

    public List<VolunteerBoardVO> getList(Criteria criteria);

    public VolunteerBoardVO get(Long volunteerBoardNo);

    public void insert(ApplicantsVO applicantsVO);

    public String getTitle(Long bno);

    public int countApplicants(Long bno);

    public void update(Long volunteerBoardNo);

    public int getTotal(Criteria criteria);

    public int checkCnt(Long docNo, Long volunteerBoardNo);
}
