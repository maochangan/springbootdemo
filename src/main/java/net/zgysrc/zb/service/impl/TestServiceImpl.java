package net.zgysrc.zb.service.impl;

import net.zgysrc.zb.dao.UserMapperDao;
import net.zgysrc.zb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapperDao userMapperDao;

    @Override
    public List<Map<String, Object>> getAllUser() {
        List<Map<String, Object>> list = userMapperDao.getAllUser();
        System.out.println(list.size());
        return list;
    }

    @Override
    public Map<String, Object> getUserById(Integer id) {
        System.out.println(id);
        Map<String, Object> map = userMapperDao.getUserById(id);
        System.out.println(map.size());
        System.out.println(map.get("id"));
        return map;
    }

}
