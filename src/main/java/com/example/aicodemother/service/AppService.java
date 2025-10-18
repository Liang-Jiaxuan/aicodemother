package com.example.aicodemother.service;

import com.example.aicodemother.model.dto.app.AppQueryRequest;
import com.example.aicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.example.aicodemother.model.entity.App;

import java.util.List;

/**
 * 服务层。
 *
 * @author 梁家萱
 */
public interface AppService extends IService<App> {

    /**
     * 获取应用封装类
     *
     * @param app 应用实体类
     * @return 应用封装类
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     *
     * @param appList 应用实体类列表
     * @return 应用封装类列表
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     * 将 AppQueryRequest 这个 dto
     * 转换为
     * MyBatis Flex 查询所需要的 QueryWrapper
     *
     * @param appQueryRequest 应用查询请求
     * @return 应用查询条件
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);
}
