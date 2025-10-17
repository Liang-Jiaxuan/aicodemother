package com.example.aicodemother.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.example.aicodemother.model.entity.App;
import com.example.aicodemother.mapper.AppMapper;
import com.example.aicodemother.service.AppService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author 梁家萱
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
