package com.sales.report.statistics.sales;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)

@Document(collection = "salesByAsin")
public class SalesByAsin implements Serializable {
    private int unitsOrdered;
    private int unitsOrderedB2B;
    private Amount orderedProductSales;
    private Amount orderedProductSalesB2B;
    private int totalOrderItems;
    private int totalOrderItemsB2B;

}
