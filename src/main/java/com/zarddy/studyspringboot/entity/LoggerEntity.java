package com.zarddy.studyspringboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 日志信息
 */
@Data
@Entity
@Table(name = "t_logger_info")
public class LoggerEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    // 客户端请求ip
    @Column(name = "client_ip")
    private String clientIp;

    // 客户端请求路径
    @Column(name = "uri")
    private String uri;

    // 终端请求方式：普通请求，ajax请求
    @Column(name = "type")
    private String type;

    // 请求方式method：post，get等
    @Column(name = "method")
    private String method;
}
