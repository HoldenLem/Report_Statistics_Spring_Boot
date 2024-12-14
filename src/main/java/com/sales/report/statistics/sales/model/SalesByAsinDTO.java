package com.sales.report.statistics.sales.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SalesByAsinDTO implements Serializable {
    private int unitsOrdered;
    private int unitsOrderedB2B;
    private AmountDTO orderedProductSales;
    private AmountDTO orderedProductSalesB2B;
    private int totalOrderItems;
    private int totalOrderItemsB2B;
}
