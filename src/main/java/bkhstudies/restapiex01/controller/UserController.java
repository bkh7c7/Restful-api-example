package bkhstudies.restapiex01.controller;

import bkhstudies.restapiex01.dao.UserDao;
import bkhstudies.restapiex01.domain.UserDomain;
import bkhstudies.restapiex01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    bkhstudies.restapiex01.domain.UserDomain userDomain;

    @RequestMapping(value = "/getuserid", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(HttpServletRequest request, Model model){
        String userId = request.getParameter("userId");

        userDomain.setUserId(userId);

        HashMap<String, Object> result = new HashMap<>();
        result.put("data", userService.getUserById(userDomain));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
