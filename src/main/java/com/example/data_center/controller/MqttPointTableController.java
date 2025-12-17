package com.example.data_center.controller;

import com.example.data_center.persistence.model.MqttPointTable;
import com.example.data_center.service.MqttPointTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/mqtt-point-table")
public class MqttPointTableController {

    @Autowired
    private MqttPointTableService mqttPointTableService;

    // 插入数据
    @PostMapping
    public String insert(@RequestBody MqttPointTable mqttPointTable) {
        boolean result = mqttPointTableService.insert(mqttPointTable);
        return result ? "插入成功" : "插入失败";
    }

    // 根据pointId查询数据
    @GetMapping("/{pointId}")
    public List<MqttPointTable> findByPointId(@PathVariable String pointId) {
        return mqttPointTableService.findByPointId(pointId);
    }

    // 查询所有数据
    @GetMapping
    public List<MqttPointTable> findAll() {
        return mqttPointTableService.findAll();
    }

    // 根据时间范围查询数据
    @GetMapping("/time-range")
    public List<MqttPointTable> findByTimeRange(
            @RequestParam("startTime") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Timestamp startTime,
            @RequestParam("endTime") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Timestamp endTime) {
        return mqttPointTableService.findByTimeRange(startTime, endTime);
    }

    // 更新数据
    @PutMapping
    public String update(@RequestBody MqttPointTable mqttPointTable) {
        boolean result = mqttPointTableService.update(mqttPointTable);
        return result ? "更新成功" : "更新失败";
    }

    // 根据pointId删除数据
    @DeleteMapping("/{pointId}")
    public String deleteByPointId(@PathVariable String pointId) {
        boolean result = mqttPointTableService.deleteByPointId(pointId);
        return result ? "删除成功" : "删除失败";
    }

    // 删除所有数据
    @DeleteMapping
    public String deleteAll() {
        boolean result = mqttPointTableService.deleteAll();
        return result ? "删除所有数据成功" : "删除所有数据失败";
    }
}