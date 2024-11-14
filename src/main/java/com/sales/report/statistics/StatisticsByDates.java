package com.sales.report.statistics;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sales.report.statistics.sales.SalesByDate;
import com.sales.report.statistics.traffic.TrafficByDates;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document(collection = "salesAndTrafficByDate")
public class StatisticsByDates {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String date;
    private SalesByDate salesByDate;
    private TrafficByDates trafficByDate;
}
