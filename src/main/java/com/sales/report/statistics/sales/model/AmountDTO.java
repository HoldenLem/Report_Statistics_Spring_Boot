package com.sales.report.statistics.sales.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class AmountDTO {
    private double amount;
    private String currencyCode;
}
