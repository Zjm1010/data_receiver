package com.example.data_center.rule;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MqttEsp32DataHandler extends DataHandler{

    private String topic;

    private String deviceId;

}
