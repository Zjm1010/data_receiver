package com.example.data_center.service;

import com.example.data_center.persistence.model.MqttPointTable;

import java.sql.Timestamp;
import java.util.List;

public interface MqttPointTableService {
    // 插入数据
    boolean insert(MqttPointTable mqttPointTable);

    // 根据pointId查询数据
    List<MqttPointTable> findByPointId(String pointId);

    // 查询所有数据
    List<MqttPointTable> findAll();

    // 根据时间范围查询数据
    List<MqttPointTable> findByTimeRange(Timestamp startTime, Timestamp endTime);

    // 更新数据
    boolean update(MqttPointTable mqttPointTable);

    // 根据pointId删除数据
    boolean deleteByPointId(String pointId);

    // 删除所有数据
    boolean deleteAll();
}