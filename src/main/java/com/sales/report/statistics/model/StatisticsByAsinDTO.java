package com.sales.report.statistics.model;

import com.sales.report.statistics.sales.model.SalesByAsinDTO;
import com.sales.report.statistics.traffic.model.TrafficByAsinDTO;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StatisticsByAsinDTO {
    private String parentAsin;
    private SalesByAsinDTO salesByAsin;
    private TrafficByAsinDTO trafficByAsin;
}
