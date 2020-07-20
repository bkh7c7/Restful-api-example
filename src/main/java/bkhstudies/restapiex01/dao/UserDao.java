package bkhstudies.restapiex01.dao;


import bkhstudies.restapiex01.domain.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    List<UserDomain> getUserById(UserDomain userDomain);
}
