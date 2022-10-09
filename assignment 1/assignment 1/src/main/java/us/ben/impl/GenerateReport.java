package us.ben.impl;

import us.ben.Sale;

import java.util.List;

public class GenerateReport {
    public void generateReport(){
        List<Sale> allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            shippingPolicy.applyShipping(aSale);
        salesReport.generateReport(allSales);
    }
}
