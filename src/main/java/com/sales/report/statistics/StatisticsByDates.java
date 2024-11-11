package com.sales.report.statistics;

import com.sales.report.statistics.sales.SalesByDate;
import com.sales.report.statistics.traffic.TrafficByDates;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StatisticsByDates {
    private String date;
    private SalesByDate salesByDate;
    private TrafficByDates trafficByDate;
}
