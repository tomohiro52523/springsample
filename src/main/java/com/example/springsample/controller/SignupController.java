package com.example.springsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class SignupController {

    // ラジオボタンの実装
    private Map<String, String> radioMarriage;
    // ラジオぼたんの初期化
    private Map<String, String> initRadioMarrige(){
        Map<String, String> radio = new LinkedHashMap<>();
        // 既婚、未婚をMapに格納
        radio.put("既婚", "true");
        radio.put("未婚", "false");

        return radio;
    }

    // ユーザー登録画面のGET用コントローラー
    @GetMapping("/signup")
    public String getSignUp(Model model){
        // ラジオボタン初期化
        radioMarriage = initRadioMarrige();
        // ラジオボタン用のMapをModelに登録
        model.addAttribute("radioMarriage", radioMarriage);
        // signup.htmlへ画面遷移
        return "login/signup";
    }

    // ユーザー登録画面のPOST用コントローラー
    @PostMapping("/signup")
    public String postSignUp(Model model){
        // login.htmlへリダイレクト
        return "redirect:login";
    }
}
