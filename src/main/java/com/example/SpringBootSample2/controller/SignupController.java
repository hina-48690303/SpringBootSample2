package com.example.SpringBootSample2.controller;

import com.example.SpringBootSample2.application.service.UserApplicationService;
import com.example.SpringBootSample2.form.SignupForm;
import java.util.Locale;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {
  @Autowired
  private UserApplicationService userApplicationService;

  /** ユーザー登録画面を表示 */
  @GetMapping("/signup")
  public String getSignup(Model model, Locale locale, @ModelAttribute SignupForm form) {
    //性別を取得
    Map<String, Integer> genderMap = userApplicationService.getGenderMap(locale);
    model.addAttribute("genderMap", genderMap);

    //ユーザー登録画面に遷移
    return "user/signup";
  }

  /** ユーザー登録処理 */
  @PostMapping("/signup")
  public String postSignup(@ModelAttribute SignupForm form) {

    log.info(form.toString());

      //ログイン画面にリダイレクト
    return "redirect/login";
  }
}
