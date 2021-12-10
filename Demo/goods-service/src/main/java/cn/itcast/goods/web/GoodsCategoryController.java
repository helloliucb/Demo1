package cn.itcast.goods.web;

import cn.itcast.goods.pojo.goods_category;
import cn.itcast.goods.service.goodsCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/goodscategory")
public class GoodsCategoryController {
    @Autowired
    private goodsCategoryService goodsCategoryService;

    @GetMapping("/select/list")
    public List<goods_category> getlist(){
        return  goodsCategoryService.getList();
    }
    @GetMapping("/select/{id}")
    public goods_category getById(@PathVariable("id") Long id){
        return goodsCategoryService.getById(id);
    }
    @GetMapping("/add/{id}/{name}")
    public void add(@PathVariable("id")Long id , @PathVariable("name")String name){
        goodsCategoryService.add(id, name);
    }

    @GetMapping("/update/{id}/{name}")
    public void update(@PathVariable("id")Long id ,@PathVariable("name")String name){
        goodsCategoryService.update(id, name);
    }

    @GetMapping("/delete/{id}")
    public int delete(@PathVariable Long id){
        return goodsCategoryService.delete(id);
    }
}
