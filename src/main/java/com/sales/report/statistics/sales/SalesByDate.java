package com.sales.report.statistics.sales;

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
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@JsonInclude

@Document(collection = "salesByDate")
public class SalesByDate extends SalesByAsin {
    private Amount averageSalesPerOrderItem;
    private Amount averageSalesPerOrderItemB2B;
    private double averageUnitsPerOrderItem;
    private double averageUnitsPerOrderItemB2B;
    private Amount averageSellingPrice;
    private Amount averageSellingPriceB2B;
    private int unitsRefunded;
    private double refundRate;
    private int claimsGranted;
    private Amount claimsAmount;
    private Amount shippedProductSales;
    private int unitsShipped;
    private int ordersShipped;
}


