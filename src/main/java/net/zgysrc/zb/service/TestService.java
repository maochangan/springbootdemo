package net.zgysrc.zb.service;

import java.util.List;
import java.util.Map;

public interface TestService {
    List<Map<String,Object>> getAllUser();

    Map<String,Object> getUserById(Integer id);
}
