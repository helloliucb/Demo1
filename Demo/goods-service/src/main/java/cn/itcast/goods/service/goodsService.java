package cn.itcast.goods.service;


import cn.itcast.goods.mapper.goodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class goodsService {

    @Autowired
    private goodsMapper goods;
    public List<cn.itcast.goods.pojo.goods> getList(){
        return goods.getList();
    }

    public cn.itcast.goods.pojo.goods getById(Long id){
        return goods.getById(id);
    }

    public void  add(Long id , String name, double price, Long category_id){
         goods.add(id,name,price,category_id);
    }

    public void update(String name,double price,Long category_id,Long id){
         goods.update(name,price,category_id,id);
    }

    public int delete(Long id){
        return goods.delete(id);
    }


}
