package cn.itcast.goods.service;

import cn.itcast.feign.clients.GoodsCategoryClient;
import cn.itcast.feign.pojo.goods_category;
import cn.itcast.goods.mapper.goodsMapper;
import cn.itcast.goods.pojo.goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class goodsService {

    @Autowired
    private goodsMapper goods;

    @Autowired
    private GoodsCategoryClient goodsCategoryClient;


    public goods queryById(Long categoryId){
        goods good =  goods.getById(categoryId);

        goods_category category = goodsCategoryClient.getById(good.getCategoryId());

        good.setGoods_category(category);
        return good;
    }

}
