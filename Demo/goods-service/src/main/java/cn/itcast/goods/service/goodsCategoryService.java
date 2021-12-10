package cn.itcast.goods.service;

import cn.itcast.goods.mapper.goodsCategoryMapper;
import cn.itcast.goods.pojo.goods_category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class goodsCategoryService {
    @Autowired
    private goodsCategoryMapper goodsCategory;

    public goods_category getById(Long id){
        return goodsCategory.getById(id);
    }
    public List<goods_category> getList(){
        return goodsCategory.getList();
    }
    public void add(Long id , String name){
         goodsCategory.add(id,name);
    }

    public void update(Long id,String name){
         goodsCategory.update(name, id);
    }

    public int delete(Long id){
        return goodsCategory.delete(id);
    }

}
