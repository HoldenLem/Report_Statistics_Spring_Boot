package com.sales.report.statistics.report;

import com.sales.report.statistics.StatisticsByAsin;
import com.sales.report.statistics.StatisticsByDates;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reports {
    private ReportSpecification reportSpecification;
    private List<StatisticsByDates> salesAndTrafficByDate;
    private List<StatisticsByAsin> salesAndTrafficByAsin;
}
