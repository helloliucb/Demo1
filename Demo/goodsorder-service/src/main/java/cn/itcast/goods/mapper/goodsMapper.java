package cn.itcast.goods.mapper;


import cn.itcast.goods.pojo.goods;
import org.apache.ibatis.annotations.*;

public interface goodsMapper {
    @Select("select * from goods where id = #{id}")
    goods getById(Long id);


}
