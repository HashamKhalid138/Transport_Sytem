package TransportSystem.service;

import TransportSystem.model.TransportOption;

public interface TransportFilter {
    boolean apply(TransportOption option);
}
