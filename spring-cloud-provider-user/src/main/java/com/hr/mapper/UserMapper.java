package com.hr.mapper;

import com.hr.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hr on 2017/4/20.
 */
@Mapper
public interface UserMapper {

    User selectById(Integer id);

    void batchUpdate(@Param("users") List<User> users);

}
