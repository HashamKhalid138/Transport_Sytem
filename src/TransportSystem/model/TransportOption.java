package TransportSystem.model;

import TransportSystem.service.TransportFilter;

import java.util.ArrayList;
import java.util.List;

public class TransportOption {
    private String name;
    private String flexibility;
    private String restriction;
    private List<TransportFilter> filters; // Store associated filters

    public TransportOption(String name, String flexibility, String restriction) {
        this.name = name;
        this.flexibility = flexibility;
        this.restriction = restriction;
        this.filters = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getFlexibility() {
        return flexibility;
    }

    public String getRestriction() {
        return restriction;
    }

    // Methods for filter management
    public void addFilter(TransportFilter filter) {
        filters.add(filter);
    }

    public List<TransportFilter> getFilters() {
        return filters;
    }
}
