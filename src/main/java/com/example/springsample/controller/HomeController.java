package com.example.springsample.controller;

import com.example.springsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    UserService userService;

    //ユーザー一覧画面のGET用メソッド
    @GetMapping("/home")
    public String getHome(Model model){
        //コンテンツ部分にユーザー一覧を表示するための文字列を登録
        model.addAttribute("contents","login/home::home_contents");
        return "login/homeLayout";
    }

    //ログアウト用メソッド
    @PostMapping("/logout")
    public String postLogout(){
        // ログイン画面へリダイレクト
        return "redirect:login";
    }

}
