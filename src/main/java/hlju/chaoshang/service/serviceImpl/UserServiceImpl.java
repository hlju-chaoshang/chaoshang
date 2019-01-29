package hlju.chaoshang.service.serviceImpl;

import hlju.chaoshang.mapper.RegisterinfoMapper;
import hlju.chaoshang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;

/**
 * @author moots
 * @description
 * @data
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RegisterinfoMapper registerinfoMapper;


    public boolean checkLogin(String account,String password,int type){
        String passwordFromSql = null;
        /**
         * 类型一是根据用户名
         */
        if(type == 1){
            try{
                passwordFromSql = registerinfoMapper.selectPasswordByName(account);
            }catch (SQLException e){

            }
        }else {
            try{
                passwordFromSql = registerinfoMapper.selectPasswordByPhoneNum(account);
            }catch (SQLException e){

            }
        }
        /**
         * 判断密码
         */
        if(passwordFromSql == null){
            return false;
        }else{
            if(passwordFromSql == null){
                return false;
            }else{
                if(!passwordFromSql.equals(password)){
                    return false;
                }else{
                    return true;
                }
            }
        }

    }
}
