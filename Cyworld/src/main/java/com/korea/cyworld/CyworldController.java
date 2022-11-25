package com.korea.cyworld;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import dao.DiaryDAO;

import util.Comm;
import vo.DiaryVO;


@Controller
public class CyworldController {

	@Autowired
	ServletContext app;// 현재 프로젝트의 기본정보들을 저장하고 있는 클래스

	@Autowired
	HttpServletRequest request;

	DiaryDAO diary_dao;

public void setDiary_dao(DiaryDAO diary_dao) {
 	this.diary_dao = diary_dao;
}

	// 사진첩 조회
	@RequestMapping(value = { "/", "/list.do" })
	public String list(Model model) {

		List<DiaryVO> list = diary_dao.selectList();
		model.addAttribute("list", list);// 바인딩 : jsp까지 정보운반
		return Comm.VIEW_PATH + "diary_list.jsp";// 포워딩

	}

	@RequestMapping("/insert_form.do")
	public String insert_form() {
		return Comm.VIEW_PATH + "diary_insert_form.jsp";
	}

	//////////////////////////
	// 새 글쓰기
	@RequestMapping("/insert.do")
	// public String insert(String name, String content, String pwd) {
	public String insert(DiaryVO vo) {
		
		    int res=diary_dao.insert(vo);
		    String webPath = "/resources/upload/";
			String savePath = app.getRealPath(webPath);//절대경로
			System.out.println("경로 : " + savePath);
			
	        //redirect: view로 이동하는 것이 아닌, 컨트롤러의 url매핑을 호출하기 위한 키워드
			return "redirect:list.do";
		}

	// 게시글 삭제
	@RequestMapping("/delete.do")
	@ResponseBody // Ajax로 요청된 메서드는 결과를 콜백메서드로 돌려주기 위해 반드시 @ResponseBody가 필요!!
	public String delete(int DiaryContentRef) {
		// delete.do?idx=1
		int res = diary_dao.delete(DiaryContentRef);

		String result = "no";
		if (res == 1) {
			result = "yes";
		}

		// yes, no값을 가지고 콜백메서드(resultFn)로 돌아간다
		// 콜백으로 리턴되는 값은 영문으로 보내준다
		return result;
	}

	// 글 수정 폼으로 전환
	@RequestMapping("/modify_form.do")
	public String modify_form(Model model, int DiaryContentRef) {
		// modify_form.do?idx=2&pwd=1111&c_pwd=1111
		DiaryVO vo = diary_dao.selectOne(DiaryContentRef);

		if (vo != null) {
			model.addAttribute("vo", vo);
		}

		return Comm.VIEW_PATH + "gallery_modify_form.jsp";

	}

	// 게시글 수정하기
	@RequestMapping("/modify.do")
	@ResponseBody
	public String modify(DiaryVO vo) {

		int res = diary_dao.update(vo);

		String result = "{'result':'no'}";
		if (res != 0) {
			result = "{'result':'yes'}";
		}

		return result;
	}

}
