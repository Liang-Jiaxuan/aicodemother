package com.example.aicodemother.service;

import com.example.aicodemother.model.dto.chathistory.ChatHistoryQueryRequest;
import com.example.aicodemother.model.entity.User;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.example.aicodemother.model.entity.ChatHistory;

import java.time.LocalDateTime;

/**
 * 服务层。
 *
 * @author 梁家萱
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 添加对话历史
     *
     * @param appId       应用 ID
     * @param message     消息内容
     * @param messageType 消息类型, AI 或 用户
     * @param userId      用户 ID
     * @return 是否添加成功
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    /**
     * 根据应用 ID 删除对话历史
     *
     * @param appId 应用 ID
     * @return 是否删除成功
     */
    boolean deleteByAppId(Long appId);

    /**
     * 分页查询某 APP 的对话记录, 即 根据应用 ID 分页查询对话历史
     *
     * @param appId           应用 ID
     * @param pageSize        每页大小
     * @param lastCreateTime  最后创建时间
     * @param loginUser       登录用户
     * @return 对话历史分页结果
     */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    /**
     * 构造查询条件, 获取查询包装器
     *
     * @param chatHistoryQueryRequest 查询请求
     * @return 查询包装器
     */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);
}
