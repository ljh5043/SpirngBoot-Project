package com.example.test.services;

import com.example.test.model.appointment.dao.ReplyDAO;
import com.example.test.model.mainBoard.dao.AnswerDAO;
import com.example.test.model.mainBoard.vo.AnswerVO;
import com.example.test.model.user.vo.DocVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerDAO answerDAO;

    public void insert(AnswerVO answerVO){
        answerDAO.insert(answerVO);
    }

    public List<AnswerVO> answerList(Long qnaNo){
        return answerDAO.answerList(qnaNo);
    }

    public void delete(Long reQnaNo){
        answerDAO.delete(reQnaNo);
    }

    public int checkAnswer(Long qnaNo, Long docNo) { return answerDAO.checkAnswer(qnaNo, docNo); }

    public void getTotal(Long qnaNo){ answerDAO.getTotal(qnaNo);}
}
