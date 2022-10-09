package us.ben.iface;

import us.ben.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
