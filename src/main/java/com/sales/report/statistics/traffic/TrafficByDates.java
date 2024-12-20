package com.sales.report.statistics.traffic;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude

@Document(collection = "trafficByDate")
public class TrafficByDates extends Traffic {
    private double orderItemSessionPercentage;
    private double orderItemSessionPercentageB2B;
    private int averageOfferCount;
    private int averageParentItems;
    private int feedbackReceived;
    private int negativeFeedbackReceived;
    private double receivedNegativeFeedbackRate;
}
