package com.sales.report.statistics;

import com.sales.report.statistics.sales.SalesByAsin;
import com.sales.report.statistics.traffic.TrafficByAsin;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document(collection = "salesAndTrafficByAsin")
public class StatisticsByAsin {
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
