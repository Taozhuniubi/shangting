package com.atguigu.lease.web.admin.service.impl;

import com.atguigu.lease.model.entity.*;
import com.atguigu.lease.web.admin.mapper.*;
import com.atguigu.lease.web.admin.service.LeaseAgreementService;
import com.atguigu.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.atguigu.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaseAgreementServiceImpl extends ServiceImpl<LeaseAgreementMapper, LeaseAgreement>
        implements LeaseAgreementService {

    @Autowired
    LeaseAgreementMapper leaseAgreementMapper;

    @Autowired
    ApartmentInfoMapper apartmentInfoMapper;

    @Autowired
    RoomInfoMapper roomInfoMapper;

    @Autowired
    PaymentTypeMapper paymentTypeMapper;

    @Autowired
    LeaseTermMapper leaseTermMapper;

    @Override
    public IPage<AgreementVo> pageAgreementByQuery(IPage<AgreementVo> page, AgreementQueryVo queryVo) {
        return leaseAgreementMapper.pageAgreementByQuery(page,queryVo);
    }

    @Override
    public AgreementVo getAgreementById(Long id) {
        //1.查询租约信息
        LeaseAgreement leaseAgreement = leaseAgreementMapper.selectById(id);

        //2.查询公寓信息

        ApartmentInfo apartmentInfo= apartmentInfoMapper.selectById(leaseAgreement.getApartmentId());

        //3.查询房间信息
        RoomInfo roomInfo = roomInfoMapper.selectById(leaseAgreement.getRoomId());

        //4.查询付款方式信息
        PaymentType paymentType = paymentTypeMapper.selectById(leaseAgreement.getPaymentTypeId());

        //5.租期信息查询
        LeaseTerm leaseTerm = leaseTermMapper.selectById(leaseAgreement.getId());


        AgreementVo adminAgreementVo = new AgreementVo();
        BeanUtils.copyProperties(leaseAgreement, adminAgreementVo);
        adminAgreementVo.setApartmentInfo(apartmentInfo);
        adminAgreementVo.setRoomInfo(roomInfo);
        adminAgreementVo.setPaymentType(paymentType);
        adminAgreementVo.setLeaseTerm(leaseTerm);
        return adminAgreementVo;
    }
}




