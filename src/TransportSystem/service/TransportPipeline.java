package TransportSystem.service;

import TransportSystem.model.TransportOption;

public class TransportPipeline {
    public boolean process(TransportOption option) {
        for (TransportFilter filter : option.getFilters()) { 
            if (filter.apply(option)) {
                return true;
            }
        }
        return false; 
    }
}
