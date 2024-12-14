package com.sales.report.statistics.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sales.report.statistics.sales.model.SalesByDateDTO;
import com.sales.report.statistics.traffic.model.TrafficByDatesDTO;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonInclude
public class StatisticsByDatesDTO implements Serializable {
    private LocalDate date;
    private SalesByDateDTO salesByDate;
    private TrafficByDatesDTO trafficByDate;
}
