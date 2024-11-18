package TransportSystem.service;

import TransportSystem.model.TransportOption;

public class TransportPipeline {
    public boolean process(TransportOption option) {
        for (TransportFilter filter : option.getFilters()) { // Use filters from the TransportOption
            if (filter.apply(option)) {
                return true; // Option passes the filter
            }
        }
        return false; // Option fails all filters
    }
}
