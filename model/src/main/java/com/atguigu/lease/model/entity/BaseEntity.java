package com.atguigu.lease.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @JsonIgnore
    @Schema(description = "创建时间")
    @TableField(value = "create_time")
    private Date createTime;


    @JsonIgnore
    @Schema(description = "更新时间")
    @TableField(value = "update_time")
    private Date updateTime;


    @JsonIgnore
    @TableLogic
    @Schema(description = "逻辑删除")
    @TableField("is_deleted")
    private Byte isDeleted;

}