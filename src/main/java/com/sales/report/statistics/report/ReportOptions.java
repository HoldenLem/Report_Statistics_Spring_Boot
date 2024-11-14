package com.sales.report.statistics.report;

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

@Document(collection = "ReportOptions")
public class ReportOptions {
        private String dateGranularity;
        private String asinGranularity;
}
