package TransportSystem.service;

import TransportSystem.model.Subject;
import TransportSystem.model.TransportOption;

public class TransportService extends Subject {
    public void executeOption(TransportOption option) {
        String message = "Selected Transport: " + option.getName() +
                         "\nFlexibility: " + option.getFlexibility() +
                         "\nRestriction: " + option.getRestriction();
        notifyObservers(message);
    }
}
