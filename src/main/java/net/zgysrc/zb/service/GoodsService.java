package net.zgysrc.zb.service;

import net.zgysrc.zb.bean.GoodsInfo;

import java.util.List;

public interface GoodsService {
    List<GoodsInfo> getIndexGoods(String keyWord);

    List<GoodsInfo> getAllGoodsByCondition(String keyWord);
}
