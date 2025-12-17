package com.example.data_center.rule;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class DataHandler {

    private BigDecimal dataValue;

    private String dataPoint;

    private LocalDateTime time;
}
