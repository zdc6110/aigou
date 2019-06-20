package cn.itsource.aigou.web.controller;

import cn.itsouece.util.AjaxResult;
import cn.itsource.aigou.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("xxx".equals(employee.getUsername())&&"xxxooo".equals(employee.getPassword())){
            return AjaxResult.me().setData(null);
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setData(null);
        }
    }
    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult get(){
        return AjaxResult.me();
    }
}
