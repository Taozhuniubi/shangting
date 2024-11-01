package com.atguigu.lease.web.admin.service;

import com.atguigu.lease.model.entity.AttrKey;
import com.atguigu.lease.web.admin.mapper.AttrKeyMapper;
import com.atguigu.lease.web.admin.vo.attr.AttrKeyVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* @author CBXX
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service
* @createDate 2024-10-30 19:56:06
*/
public interface AttrKeyService extends IService<AttrKey> {
    List<AttrKeyVo> listAttrInfo();
 }