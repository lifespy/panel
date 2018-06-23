package com.not404.panel.dao;

import com.not404.panel.BaseTest;
import com.not404.panel.config.LogBase;
import com.not404.panel.domain.UserDto;
import com.not404.panel.utils.HEX;
import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.rsa.RSASignature;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Optional;

public class IUserDaoTest extends BaseTest {

    @Autowired
    private IUserDao userDao;

    private final static Logger logger = LogBase.getLogger(IUserDaoTest.class);

    @Test
    public void testGetUserById(){

        Long id = 1L;
        Optional<UserDto> userDto = userDao.findById(id);
        System.out.println(userDto);
    }

    @Test
    public void testGetUserByMail(){

        UserDto userDto = userDao.findUserDtoByEmail("llll@wq.com");
        System.out.println(userDto);
    }

    @Test
    public void addUser() throws UnsupportedEncodingException, NoSuchAlgorithmException {

        logger.error("dd");

        UserDto userDto = new UserDto();
        userDto.setClazz(1);
        userDto.setUserName("小王");
        userDto.setEmail("llll@wq.com");
        userDto.setAutoResetBandwidth(new BigDecimal(2));
        userDto.setClassExpire(new Timestamp(3164316546316L));
        userDto.setPass("123456");
        userDto.setPasswd(HEX.encode2SHA256("123456"));
        userDto.setT(123);
        userDto.setD(11111L);
        userDto.setU(11111L);
        userDto.setPlan("1");
        userDto.setTransferEnable(123L);
        userDto.setPort(2056);
        userDto.setCanSwitch(new Byte("1"));
        userDto.setEnable(new Byte("1"));
        userDto.setType(new Byte("1"));
        userDto.setLastGetGiftTime(123456798);
        userDto.setLastCheckInTime(1111111111);
        userDto.setLastRestPassTime(2222222);
        userDto.setRegDate(new Timestamp(111111111));

        userDao.save(userDto);
    }

}
