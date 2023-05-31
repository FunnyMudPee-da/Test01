package com.yunjia.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("user") //mybatis默认会从数据库里面寻找user表，如果需要指定表明，使用@TableName("user")指定即可
public class User {
    @TableId(type= IdType.AUTO) //解决新增数据自增id很大的问题
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
