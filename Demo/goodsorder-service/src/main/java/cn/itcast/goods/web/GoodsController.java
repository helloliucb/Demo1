package cn.itcast.goods.web;

import cn.itcast.goods.pojo.goods;


import cn.itcast.goods.service.goodsService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private goodsService goodsService;



    @SentinelResource("selectById")
    @GetMapping("{categoryId}")
    public goods queryById(@PathVariable("categoryId")Long categoryId){
        return  goodsService.queryById(categoryId);
    }

}
