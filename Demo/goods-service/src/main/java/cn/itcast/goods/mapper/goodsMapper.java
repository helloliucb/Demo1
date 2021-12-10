package cn.itcast.goods.mapper;



import cn.itcast.goods.pojo.goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface goodsMapper {

    @Select("select id, name,price,category_id from goods")
    List<goods> getList();

    @Select("select * from goods where id = #{id}")
    goods getById(@Param("id") Long id);

    @Insert("INSERT INTO goods VALUES (#{id}, #{name},#{price},#{category_id})")
    void add(@Param("id") Long id,@Param("name") String name,@Param("price") double price,@Param("category_id") Long category_id);

    @Update("update goods set name=#{name},price=#{price},category_id=#{category_id} where id=#{id}")
    void update(@Param("name") String name,@Param("price") double price,@Param("category_id") Long category_id,Long id);

    @Delete("delete from goods where id = #{id}")
    int delete(@Param("id") Long id );
}
