package com.huxx.controller;

import com.huxx.service.UserService;
import com.huxx.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/reg")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return "userinfo";
    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String reg() {

        return "joinform";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add (@ModelAttribute UserVo userVo, Model model) {
//        userService.add(userVo);
//        model.addAttribute("info", userService.get(userVo));
//        return "done";
//    }

    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String loginForm() {
        return "login";
    }

    @RequestMapping(value = "/cate", method = RequestMethod.GET)
    public String categoryEdit() {
        return "cartex";
    }

    @RequestMapping(value = "/addusers", method = RequestMethod.GET)
    private String mak() {
        UsersVo usersVo = new UsersVo();

        for (int i = 0; i < 250; i++) {
            if (i % 50 == 0) {
                usersVo.setAuthCode(2);
            } else if (i % 42 == 0) {
                usersVo.setAuthCode(3);
            } else {
                usersVo.setAuthCode(1);
            }
            usersVo.setNameHan("이름" + i);
            usersVo.setNameEng("name" + i);
            usersVo.setLoginID("ID" + i);
            usersVo.setPassword("PW" + i);
            usersVo.setBirthDate("1998-05-" + i);
            usersVo.setStudResNum("980512-" + i);
            usersVo.setAddress("주소" + i);
            usersVo.setFamilyAddress("등본주소" + i);
            usersVo.setPostNum("우편번호" + i);
            usersVo.setHandphone("핸드폰번호" + i);
            usersVo.setTelephone("집전화" + i);
            usersVo.setEmail("email@email.com" + i);
            usersVo.setHomePage("www.homepage.com" + i);
            usersVo.setBank("은행명" + i);
            usersVo.setDepositor("예금주" + i);
            usersVo.setAccountNum("1234-565-574-454" + i);
            usersVo.setMillArm("병과" + i);
            usersVo.setMillRank("계급" + i);
            usersVo.setMillEnrollDate("2011-0" + i);
            usersVo.setMillDischargeDate("2013-0" + i);
            usersVo.setMillIncompletReason("미필사유" + i);
            usersVo.setLanguage("어학" + i);
            usersVo.setoS("윈도우,맥" + i);
            usersVo.setProLang("프로그래밍언어" + i);
            usersVo.setMagazine("구독잡지" + i);
            usersVo.setNewspaper("구독신문" + i);
            usersVo.setAfterPlan("수료후희망" + i);
            usersVo.setMotive("동기" + i);
            usersVo.setLearningContent("학습내용" + i);
            usersVo.setConsultContent("상담내역 ㄴㅁ아ㅓ" + i);
            usersVo.setThesis("논문에 대한 논문" + i);

            System.out.println(i);
            userService.add(usersVo);
        }
        return "done";
    }

    @RequestMapping(value = "/scholar", method = RequestMethod.GET)
    public String addUserScholarship() {
        ScholarshipVo scholarshipVo = new ScholarshipVo();

        for (int i = 1; i < 251; i++) {
            scholarshipVo.setUser_no(i);
            scholarshipVo.setPeriodFr("2014-0" + i);
            scholarshipVo.setPeriodTo("2018-0" + i);
            scholarshipVo.setSchool("서을대" + i);
            scholarshipVo.setStat("졸업" + i);
            scholarshipVo.setLocation("서울시" + i);
            scholarshipVo.setDegree("학사" + i);
            scholarshipVo.setMajor("컴퓨터공학과" + i);
            scholarshipVo.setSubMajor("토목공학과" + i);
            System.out.println(i);

            userService.addscholar(scholarshipVo);
        }
        return "done";
    }

    @RequestMapping(value = "/traning", method = RequestMethod.GET)
    public String addUserTraining() {
        TrainingVo trainingVo = new TrainingVo();

        for (int i = 1; i < 251; i++) {

            trainingVo.setUser_no(i);
            trainingVo.setPeriodFr("2018-0" + i);
            trainingVo.setPeriodTo("2019-0" + i);
            trainingVo.setOragan("교육기관" + i);
            trainingVo.setCourse("교육과정" + i);
            trainingVo.setContent("주요교육내용" + i);
            System.out.println(i);

            userService.addtraining(trainingVo);
        }
        return "done";
    }

    @RequestMapping(value = "/career", method = RequestMethod.GET)
    public String addUserCareer() {
        CareerVo careerVo = new CareerVo();
        for (int i = 1; i < 251; i++) {

            careerVo.setUser_no(i);
            careerVo.setPeriodFr("2018-0"+i);
            careerVo.setPeriodTo("2019-0"+i);
            careerVo.setOragan("회사/공모전/학교"+i);
            careerVo.setDevPart("주업무/개발프로그램"+i);
            careerVo.setRole("직무"+i);

            System.out.println(i);

            userService.addcareer(careerVo);
        }
        return "done";
    }

    @RequestMapping(value = "/licence", method = RequestMethod.GET)
    public String addLicence() {
        LicenceVo licenceVo = new LicenceVo();

        for (int i = 1; i < 251; i++) {

            licenceVo.setUser_no(i);
            licenceVo.setLiceName("자격증명"+i);
            licenceVo.setAcquirDate("2018-0"+i);
            licenceVo.setIssueOrgan("발급기관"+i);
            licenceVo.setScore("비고(점수)"+i);

            System.out.println(i);

            userService.addlicence(licenceVo);
        }
        return "done";
    }

    @RequestMapping(value = "/as", method = RequestMethod.GET)
    public String addAfterService() {
        AfterServiceVo afterServiceVo = new AfterServiceVo();
        for (int i = 1; i < 251; i++) {
            afterServiceVo.setUser_no(i);
            afterServiceVo.setCompName("회사이름"+i);
            afterServiceVo.setDepartment("부서명"+i);
            afterServiceVo.setState("재직여부"+i);
            afterServiceVo.setPosition("직책"+i);
            afterServiceVo.setPeriodFr("2018-0"+i);
            afterServiceVo.setPeriodTo("2019-0"+i);
            afterServiceVo.setTelePhone("회사전화"+i);

            System.out.println(i);

            userService.addafterservice(afterServiceVo);
        }
        return "done";
    }
}

