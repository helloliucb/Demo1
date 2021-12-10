package cn.itcast.goods.web;


import cn.itcast.goods.pojo.goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private cn.itcast.goods.service.goodsService goodsService;

    @GetMapping("/select/list")
    public List<goods> getlist(){
        return  goodsService.getList();
    }
    @GetMapping("/select/{id}")
    public goods getById(@PathVariable("id") Long id){
        return goodsService.getById(id);
    }
    @GetMapping("/add/{id}/{name}/{price}/{category_id}")
    public void add(@PathVariable("id")Long id , @PathVariable("name")String name, @PathVariable("price")double price, @PathVariable("category_id")Long category_id){
        goodsService.add(id, name, price,category_id);
    }

    @GetMapping("/update/{id}/{name}/{price}/{category_id}")
    public void update(@PathVariable("id")Long id ,@PathVariable("name")String name,@PathVariable("price")double price,@PathVariable("category_id")Long category_id){
         goodsService.update(name,price,category_id,id);
    }

    @GetMapping("/delete/{id}")
    public int delete(@PathVariable Long id){
        return goodsService.delete(id);
    }
}
