package com.atguigu.lease.web.admin.service;

import com.atguigu.lease.model.entity.ViewAppointment;
import com.atguigu.lease.web.admin.vo.appointment.AppointmentQueryVo;
import com.atguigu.lease.web.admin.vo.appointment.AppointmentVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author CBXX
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
* @createDate 2024-10-30 19:56:07
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {


    IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo);
}
