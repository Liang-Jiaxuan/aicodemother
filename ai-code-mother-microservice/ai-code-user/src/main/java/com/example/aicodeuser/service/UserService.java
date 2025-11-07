package com.example.aicodeuser.service;

import com.example.aicodemother.model.dto.user.UserQueryRequest;
import com.example.aicodemother.model.entity.User;
import com.example.aicodemother.model.vo.LoginUserVO;
import com.example.aicodemother.model.vo.UserVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 *  服务层。
 *
 * @author 梁家萱
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @param user 已登录用户
     * @return 脱敏的已登录用户信息
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request 请求对象
     * @return 当前登录用户信息
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 单个  获取脱敏后的用户信息(自己看他人)
     *
     * @param user 用户信息
     * @return 脱敏后的用户信息(自己看他人)
     */
    UserVO getUserVO(User user);

    /**
     * 列表  分页获取脱敏后的用户信息(自己看他人)
     *
     * @param userList 用户列表
     * @return 脱敏后的用户信息(自己看他人)
     */
    List<UserVO> getUserVOList(List<User> userList);


    /**
     * 用户注销
     *
     * @param request 请求对象
     * @return 退出登录是否成功
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 根据查询条件(即查询接口dto)构造数据查询参数(即QueryWrapper)
     *
     * @param userQueryRequest 查询条件, 即查询接口dto
     * @return 数据查询参数, 即QueryWrapper
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 加密
     * @param userPassword 用户原始密码
     * @return 加入盐值后 MD5 生成的加密密码
     */
    String getEncryptPassword(String userPassword);
}
