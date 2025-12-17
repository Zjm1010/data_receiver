package com.example.data_center.persistence.mapper;

import com.example.data_center.persistence.model.MqttPointTable;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface MqttPointTableMapper {
    // 插入数据
    @Insert("INSERT INTO mqtt_point_table (time, value, point_id, point_name) VALUES (#{time}, #{value}, #{pointId}, #{pointName})")
    int insert(MqttPointTable mqttPointTable);

    // 根据pointId查询数据
    @Select("SELECT time, value, point_id as pointId, point_name as pointName FROM mqtt_point_table WHERE point_id = #{pointId}")
    List<MqttPointTable> findByPointId(String pointId);

    // 查询所有数据
    @Select("SELECT time, value, point_id as pointId, point_name as pointName FROM mqtt_point_table")
    List<MqttPointTable> findAll();

    // 根据时间范围查询数据
    @Select("SELECT time, value, point_id as pointId, point_name as pointName FROM mqtt_point_table WHERE time BETWEEN #{startTime} AND #{endTime}")
    List<MqttPointTable> findByTimeRange(@Param("startTime") Timestamp startTime, @Param("endTime") Timestamp endTime);

    // 更新数据
    @Update("UPDATE mqtt_point_table SET value = #{value}, point_name = #{pointName}, time = #{time} WHERE point_id = #{pointId}")
    int update(MqttPointTable mqttPointTable);

    // 根据pointId删除数据
    @Delete("DELETE FROM mqtt_point_table WHERE point_id = #{pointId}")
    int deleteByPointId(String pointId);

    // 删除所有数据
    @Delete("DELETE FROM mqtt_point_table")
    int deleteAll();
}