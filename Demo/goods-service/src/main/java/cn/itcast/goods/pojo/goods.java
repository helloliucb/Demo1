package cn.itcast.goods.pojo;

import lombok.Data;

@Data
public class goods {
    private Long id;
    private String name;
    private double price;
    private Long categoryId;
}
