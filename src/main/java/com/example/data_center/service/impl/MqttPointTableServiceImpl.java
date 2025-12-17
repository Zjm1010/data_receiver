package com.example.data_center.service.impl;

import com.example.data_center.persistence.mapper.MqttPointTableMapper;
import com.example.data_center.persistence.model.MqttPointTable;
import com.example.data_center.service.MqttPointTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class MqttPointTableServiceImpl implements MqttPointTableService {

    @Autowired
    private MqttPointTableMapper mqttPointTableMapper;

    @Override
    public boolean insert(MqttPointTable mqttPointTable) {
        return mqttPointTableMapper.insert(mqttPointTable) > 0;
    }

    @Override
    public List<MqttPointTable> findByPointId(String pointId) {
        return mqttPointTableMapper.findByPointId(pointId);
    }

    @Override
    public List<MqttPointTable> findAll() {
        return mqttPointTableMapper.findAll();
    }

    @Override
    public List<MqttPointTable> findByTimeRange(Timestamp startTime, Timestamp endTime) {
        return mqttPointTableMapper.findByTimeRange(startTime, endTime);
    }

    @Override
    public boolean update(MqttPointTable mqttPointTable) {
        return mqttPointTableMapper.update(mqttPointTable) > 0;
    }

    @Override
    public boolean deleteByPointId(String pointId) {
        return mqttPointTableMapper.deleteByPointId(pointId) > 0;
    }

    @Override
    public boolean deleteAll() {
        return mqttPointTableMapper.deleteAll() > 0;
    }
}