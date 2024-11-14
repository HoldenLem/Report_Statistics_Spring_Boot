package com.sales.report.statistics.traffic;


import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)

@Document(collection = "trafficByAsin")
public class TrafficByAsin extends Traffic {
    private double browserSessionPercentage;
    private double browserSessionPercentageB2B;
    private double mobileAppSessionPercentage;
    private double mobileAppSessionPercentageB2B;
    private double sessionPercentage;
    private double sessionPercentageB2B;
    private double browserPageViewsPercentage;
    private double browserPageViewsPercentageB2B;
    private double mobileAppPageViewsPercentage;
    private double mobileAppPageViewsPercentageB2B;
    private double pageViewsPercentage;
    private double pageViewsPercentageB2B;

}
