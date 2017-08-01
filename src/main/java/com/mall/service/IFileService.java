package com.mall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: jin
 * @Version: 2017/7/12
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
