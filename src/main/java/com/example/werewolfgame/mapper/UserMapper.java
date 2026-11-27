package com.example.werewolfgame.mapper;

import com.example.werewolfgame.dto.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    // ユーザ定義
    @Select("SELECT user_id, user_name, password FROM users WHERE user_name = #{userName}")
    User selectUserByUsername(String userName);

    //ユーザ追加
    @Insert("INSERT INTO users(user_name, password) VALUES (#{userName}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    void insertUser(User user); //long userId, String userName, String password を受け取る
}
