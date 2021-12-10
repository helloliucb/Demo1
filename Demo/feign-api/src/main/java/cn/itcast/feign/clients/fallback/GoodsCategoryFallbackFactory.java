package cn.itcast.feign.clients.fallback;

import cn.itcast.feign.clients.GoodsCategoryClient;
import cn.itcast.feign.pojo.goods_category;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodsCategoryFallbackFactory implements FallbackFactory<GoodsCategoryClient> {
    @Override
    public GoodsCategoryClient create(Throwable throwable) {
        return new GoodsCategoryClient() {
            @Override
            public goods_category getById(Long id) {
                log.error("根据ID查询异常",throwable);
                return new goods_category();
            }
        };
    }
}
