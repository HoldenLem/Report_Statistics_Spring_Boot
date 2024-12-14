package com.sales.report.statistics;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sales.report.statistics.sales.SalesByDate;
import com.sales.report.statistics.traffic.TrafficByDates;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.redis.core.RedisHash;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    @Field("date")
    private LocalDate date;
    private SalesByDate salesByDate;
    private TrafficByDates trafficByDate;
}
