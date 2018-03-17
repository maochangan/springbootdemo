package net.zgysrc.zb.service.impl;

import net.zgysrc.zb.bean.GoodsInfo;
import net.zgysrc.zb.bean.GoodsInfoExample;
import net.zgysrc.zb.dao.GoodsInfoMapper;
import net.zgysrc.zb.service.GoodsService;
import net.zgysrc.zb.util.JDBCLikeStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public List<GoodsInfo> getIndexGoods(String keyWord) {
        GoodsInfoExample example = new GoodsInfoExample();
        example.setOrderByClause("id desc");
        GoodsInfoExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsNameLike(JDBCLikeStringUtil.JDBCLikeUtil(keyWord));
        List<GoodsInfo> list = goodsInfoMapper.selectByExample(example);
        if(0 == list.size()){
            return null;
        }else{
            return list;
        }
    }

    @Override
    public List<GoodsInfo> getAllGoodsByCondition(String keyWord) {
        GoodsInfoExample example = new GoodsInfoExample();
        example.setOrderByClause("id desc");
        GoodsInfoExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsNameLike(JDBCLikeStringUtil.JDBCLikeUtil(keyWord));
        GoodsInfoExample.Criteria criteria2 = example.createCriteria();
        criteria2.andGoodsTypeLike(JDBCLikeStringUtil.JDBCLikeUtil(keyWord));
        example.or(criteria2);
        List<GoodsInfo> list = goodsInfoMapper.selectByExample(example);
        if(0 == list.size()){
            return null;
        }else{
            return list;
        }
    }

    @Override
    public GoodsInfo getGoodsInfoById(Integer id) {
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(id);
        return goodsInfo;
    }
}
