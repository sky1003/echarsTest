package com.qfedu.service.impl;

import com.qfedu.dao.NewStudentInfoDao;
import com.qfedu.entity.NewStudent;
import com.qfedu.service.NewStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName:echarsTest
 * @author:卢卫振
 * @date:2020/9/23 20:10
 * Description:
 */
@Service
public class NewStudentInfoServiceImpl implements NewStudentInfoService {
    @Autowired
    private NewStudentInfoDao newStudentInfoDao;
    @Override
    public List<NewStudent> getAllStudent() {
        return newStudentInfoDao.getAllStudent();
    }
}
