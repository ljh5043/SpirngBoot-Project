package com.example.test.services;

import com.example.test.model.mainBoard.vo.AnswerVO;
import com.example.test.model.user.vo.DocAttachFileVO;
import com.example.test.model.user.vo.DocHosAttachFileVO;
import com.example.test.model.user.vo.DocVO;
import com.example.test.model.user.vo.UserVO;
import com.google.inject.spi.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Service
public interface DocService {

    /*의사회원가입*/
    public void DocSignUp(DocVO vo);

    public List<DocAttachFileVO> getAttachList(Long docNo);

    public DocVO docLogin(DocVO vo);

    public List<DocHosAttachFileVO> getHosAttachList(Long docNo);

    public int checkId(DocVO vo);

    public void docLogout(HttpSession session);

    public DocVO findId(DocVO vo);

    public DocVO findPw(DocVO vo);

    public void updatePassword(DocVO vo);

/*
    public void certifiedPhoneNumber(String phoneNumber, String cerNum) {

        String api_key = "본인의 API KEY";
        String api_secret = "본인의 API SECRET";
        Message coolsms = new Message(api_key, api_secret);

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", phoneNumber);    // 수신전화번호
        params.put("from", "발송할 번호 입력");    // 발신전화번호. 테스트시에는 발신,수신 둘다 본인 번호로 하면 됨
        params.put("type", "SMS");
        params.put("text", "핫띵크 휴대폰인증 테스트 메시지 : 인증번호는" + "["+cerNum+"]" + "입니다.");
        params.put("app_version", "test app 1.2"); // application name and version

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }

    }*/

    /* 좋아요 */
    public void like1(Long docNo);
    public void like2(Long docNo, Long userNo, Long reQnaNo);
    public int getLike(Long docNo, Long userNo, Long reQnaNo);

    /* 신고하기 */
    public AnswerVO viewReport(Long reQnaNo);
    public void report1(Long docNo);
    public void report2(Long reQnaNo, Long docNo, Long userNo, String reportType, String reportContent);
    public int getReport(Long docNo, Long userNo, Long reQnaNo);
}
