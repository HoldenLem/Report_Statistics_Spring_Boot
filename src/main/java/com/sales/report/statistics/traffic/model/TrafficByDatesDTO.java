package com.sales.report.statistics.traffic.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class TrafficByDatesDTO extends TrafficDTO {
    private double orderItemSessionPercentage;
    private double orderItemSessionPercentageB2B;
    private int averageOfferCount;
    private int averageParentItems;
    private int feedbackReceived;
    private int negativeFeedbackReceived;
    private double receivedNegativeFeedbackRate;
}
