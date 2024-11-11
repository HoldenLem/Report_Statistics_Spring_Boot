package com.sales.report.statistics;

import com.sales.report.statistics.sales.SalesByAsin;
import com.sales.report.statistics.traffic.TrafficByAsin;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StatisticsByAsin {
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
