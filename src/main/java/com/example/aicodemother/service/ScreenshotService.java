package com.example.aicodemother.service;

/**
 * 截图服务
 */
public interface ScreenshotService {

    /**
     * 通用的截图服务, 可以得到访问地址
     *
     * @param webUrl 网址
     * @return 可访问的截图地址
     */
    String generateAndUploadScreenshot(String webUrl);
}
