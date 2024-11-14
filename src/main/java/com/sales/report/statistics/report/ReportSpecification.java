package com.sales.report.statistics.report;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document(collection = "reportSpecifications")
public class ReportSpecification {
    private String reportType;
    private ReportOptions reportOptions;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String dataStartTime;
    private String dataEndTime;
    private List<String> marketplaceIds;
}
