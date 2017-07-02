package com.mall.service;

import com.mall.common.ServerResponse;
import com.mall.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/27.
 */
@Service
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetRestPassword(String username, String passwordNew, String forgetToken);

}
