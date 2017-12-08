package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by cstarnight on 2017/12/1.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
