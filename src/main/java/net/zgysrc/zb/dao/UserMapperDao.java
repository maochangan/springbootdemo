package net.zgysrc.zb.dao;

import java.util.List;
import java.util.Map;

public interface UserMapperDao {

    List<Map<String , Object>> getAllUser();

    Map<String , Object> getUserById(Integer id);


}
