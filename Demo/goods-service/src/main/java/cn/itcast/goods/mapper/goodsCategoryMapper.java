package cn.itcast.goods.mapper;

import cn.itcast.goods.pojo.goods_category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface goodsCategoryMapper {
    @Select("select * from goods_category")
    List<goods_category> getList();

    @Select("select * from goods_category where id = #{id}")
    goods_category getById(@Param("id") Long id);

    @Insert("INSERT INTO goods_category (id, name) VALUES (#{id}, #{name})")
    void add(@Param("id") Long id,@Param("name") String name);

    @Update("update goods_category set name=#{name} where id=#{id}")
    void update( @Param("name") String name,@Param("id") Long id );

    @Delete("delete from goods_category where id = #{id}")
    int delete(@Param("id") Long id );

}