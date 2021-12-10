package cn.itcast.goods.pojo;



import cn.itcast.feign.pojo.goods_category;
import lombok.Data;
@Data
public class goods {
    private Long id;
    private String name;
    private double price;
    private Long categoryId;
    private goods_category goods_category;
}
