package com.javatechie.springdroolsapi.pojo;

import org.springframework.web.multipart.MultipartFile;

public class DrlFileDTO {

	private MultipartFile drlFile;

    public MultipartFile getDrlFile() {
        return drlFile;
    }

    public void setDrlFile(MultipartFile drlFile) {
        this.drlFile = drlFile;
    }
}
