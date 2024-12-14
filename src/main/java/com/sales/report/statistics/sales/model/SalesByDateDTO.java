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
public class SalesByDateDTO extends SalesByAsinDTO {
    private AmountDTO averageSalesPerOrderItem;
    private AmountDTO averageSalesPerOrderItemB2B;
    private double averageUnitsPerOrderItem;
    private double averageUnitsPerOrderItemB2B;
    private AmountDTO averageSellingPrice;
    private AmountDTO averageSellingPriceB2B;
    private int unitsRefunded;
    private double refundRate;
    private int claimsGranted;
    private AmountDTO claimsAmount;
    private AmountDTO shippedProductSales;
    private int unitsShipped;

}
