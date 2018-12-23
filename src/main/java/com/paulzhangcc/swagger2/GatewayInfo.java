package com.paulzhangcc.swagger2;

import io.swagger.annotations.ApiModel;

/**
 * Created by paul on 2018/12/9.
 */
public class GatewayInfo {
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private String ip;

    @Override
    public String toString() {
        return "GatewayInfo{" +
                "ip='" + ip + '\'' +
                '}';
    }
}
