package hlju.chaoshang.controller;


import hlju.chaoshang.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {
    @Resource
    private UserService userService;
    /**
     *功能描述
     * @author moots
     * @param account
     * @param password
     * @param httpSession
     * @description 简单的进行登录验证
     */
    @GetMapping("/loginPost")
    @ResponseBody
    public Map<String,Boolean> loginPost(String account,
                            String password, int type,HttpSession httpSession){
        Map<String, Boolean> msg = new HashMap<>();
        msg.put("success",Boolean.valueOf(userService.checkLogin(account,password,type)));
        return msg;
    }

}
