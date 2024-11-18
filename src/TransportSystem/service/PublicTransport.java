package TransportSystem.service;

import TransportSystem.model.TransportOption;

public class PublicTransport implements TransportFilter {
    public boolean apply(TransportOption option) {
        return option.getName().equals("Public Transport");
    }
}
