package us.ben.iface;

import us.ben.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
