package com.sales.report.statistics.model;


import com.sales.report.statistics.sales.model.SalesByDateDTO;
import com.sales.report.statistics.traffic.model.TrafficByDatesDTO;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StatisticsByDatesDTO {
    private String date;
    private SalesByDateDTO salesByDate;
    private TrafficByDatesDTO trafficByDate;
}
