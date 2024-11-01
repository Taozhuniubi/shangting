package com.atguigu.lease.web.admin.service;

import com.atguigu.lease.model.entity.FeeKey;
import com.atguigu.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author CBXX
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service
* @createDate 2024-10-30 19:56:06
*/
public interface FeeKeyService extends IService<FeeKey> {

    List<FeeKeyVo> listFeeInfo();
}
