package com.lmk.service;

import com.lmk.hrm.MainApp9001;
import com.lmk.hrm.domain.Systemdictionary;
import com.lmk.hrm.service.ISystemdictionaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApp9001.class)
public class ServiceTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;
    @Test
    public void test()throws Exception{
        List<Systemdictionary> systemdictionaries = systemdictionaryService.selectList(null);
        for (Systemdictionary systemdictionary : systemdictionaries) {
            System.out.println(systemdictionary);
        }
    }
}
