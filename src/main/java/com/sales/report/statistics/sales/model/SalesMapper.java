package com.sales.report.statistics.sales.model;

import com.sales.report.statistics.sales.Amount;
import com.sales.report.statistics.sales.SalesByAsin;
import com.sales.report.statistics.sales.SalesByDate;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = lombok.AccessLevel.PACKAGE)
public class SalesMapper {

    public static AmountDTO from(Amount amount) {
        return AmountDTO.builder()
                .amount(amount.getAmount())
                .currencyCode(amount.getCurrencyCode())
                .build();
    }

    public static Amount from(AmountDTO amountDTO) {
        return Amount.builder()
                .amount(amountDTO.getAmount())
                .currencyCode(amountDTO.getCurrencyCode())
                .build();
    }

    public static SalesByAsinDTO from(SalesByAsin salesByAsin) {
        return SalesByAsinDTO.builder()
                .unitsOrdered(salesByAsin.getUnitsOrdered())
                .unitsOrderedB2B(salesByAsin.getUnitsOrderedB2B())
                .orderedProductSales(from(salesByAsin.getOrderedProductSales()))
                .orderedProductSalesB2B(from(salesByAsin.getOrderedProductSalesB2B()))
                .totalOrderItems(salesByAsin.getTotalOrderItems())
                .totalOrderItemsB2B(salesByAsin.getTotalOrderItemsB2B())
                .build();
    }

    public static SalesByAsin from(SalesByAsinDTO salesByAsinDTO) {
        return SalesByAsin.builder()
                .unitsOrdered(salesByAsinDTO.getUnitsOrdered())
                .unitsOrderedB2B(salesByAsinDTO.getUnitsOrderedB2B())
                .orderedProductSales(from(salesByAsinDTO.getOrderedProductSales()))
                .orderedProductSalesB2B(from(salesByAsinDTO.getOrderedProductSalesB2B()))
                .totalOrderItems(salesByAsinDTO.getTotalOrderItems())
                .totalOrderItemsB2B(salesByAsinDTO.getTotalOrderItemsB2B())
                .build();
    }

    public static SalesByDateDTO from(SalesByDate salesByDate) {
        return SalesByDateDTO.builder()
                .orderedProductSalesB2B(from(salesByDate.getOrderedProductSalesB2B()))
                .unitsOrdered(salesByDate.getUnitsOrdered())
                .unitsOrderedB2B(salesByDate.getUnitsOrderedB2B())
                .totalOrderItems(salesByDate.getTotalOrderItems())
                .totalOrderItemsB2B(salesByDate.getTotalOrderItemsB2B())
                .averageSalesPerOrderItem(from(salesByDate.getAverageSalesPerOrderItem()))
                .averageSalesPerOrderItemB2B(from(salesByDate.getAverageSalesPerOrderItemB2B()))
                .averageUnitsPerOrderItem(salesByDate.getAverageUnitsPerOrderItem())
                .averageUnitsPerOrderItemB2B(salesByDate.getAverageUnitsPerOrderItemB2B())
                .averageSellingPrice(from(salesByDate.getAverageSellingPrice()))
                .averageSellingPriceB2B(from(salesByDate.getAverageSellingPriceB2B()))
                .unitsRefunded(salesByDate.getUnitsRefunded())
                .refundRate(salesByDate.getRefundRate())
                .claimsGranted(salesByDate.getClaimsGranted())
                .claimsAmount(from(salesByDate.getClaimsAmount()))
                .shippedProductSales(from(salesByDate.getShippedProductSales()))
                .unitsShipped(salesByDate.getUnitsShipped())
                .build();
    }

    public static SalesByDate from(SalesByDateDTO salesByDateDTO) {
        return SalesByDate.builder()
                .orderedProductSales(from(salesByDateDTO.getOrderedProductSales()))
                .orderedProductSalesB2B(from(salesByDateDTO.getOrderedProductSalesB2B()))
                .unitsOrdered(salesByDateDTO.getUnitsOrdered())
                .unitsOrderedB2B(salesByDateDTO.getUnitsOrderedB2B())
                .totalOrderItems(salesByDateDTO.getTotalOrderItems())
                .totalOrderItemsB2B(salesByDateDTO.getTotalOrderItemsB2B())
                .averageSalesPerOrderItem(from(salesByDateDTO.getAverageSalesPerOrderItem()))
                .averageSalesPerOrderItemB2B(from(salesByDateDTO.getAverageSalesPerOrderItemB2B()))
                .averageSellingPrice(from(salesByDateDTO.getAverageSellingPrice()))
                .averageSellingPriceB2B(from(salesByDateDTO.getAverageSellingPriceB2B()))
                .claimsAmount(from(salesByDateDTO.getClaimsAmount()))
                .refundRate(salesByDateDTO.getRefundRate())
                .claimsGranted(salesByDateDTO.getClaimsGranted())
                .averageUnitsPerOrderItem(salesByDateDTO.getAverageUnitsPerOrderItem())
                .averageUnitsPerOrderItemB2B(salesByDateDTO.getAverageUnitsPerOrderItem())
                .shippedProductSales(from(salesByDateDTO.getOrderedProductSales()))
                .unitsShipped(salesByDateDTO.getUnitsShipped())
                .unitsRefunded(salesByDateDTO.getUnitsRefunded())
                .build();
    }

}
