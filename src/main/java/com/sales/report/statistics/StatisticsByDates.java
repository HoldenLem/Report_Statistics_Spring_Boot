package com.sales.report.statistics;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sales.report.statistics.sales.SalesByDate;
import com.sales.report.statistics.traffic.TrafficByDates;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document(collection = "salesAndTrafficByDate")
@JsonInclude
public class StatisticsByDates implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
    public LocalDate date;
    private SalesByDate salesByDate;
    private TrafficByDates trafficByDate;
}
