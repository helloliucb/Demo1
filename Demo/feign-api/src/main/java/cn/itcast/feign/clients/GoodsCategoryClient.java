package cn.itcast.feign.clients;

import cn.itcast.feign.clients.fallback.GoodsCategoryFallbackFactory;
import cn.itcast.feign.pojo.goods_category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "goodsservice", fallbackFactory = GoodsCategoryFallbackFactory.class)
public interface GoodsCategoryClient {

    @GetMapping("/goodscategory/select/{id}")
    goods_category getById(@PathVariable("id") Long id);

}
