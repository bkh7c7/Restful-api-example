package bkhstudies.restapiex01.service;

import bkhstudies.restapiex01.dao.UserDao;
import bkhstudies.restapiex01.domain.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<UserDomain> getUserById(UserDomain userDomain){
        return userDao.getUserById(userDomain);
    }
}
