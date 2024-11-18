package TransportSystem.ui;

import TransportSystem.model.TransportOption;
import TransportSystem.service.*;

public class TransportSystem {
    public static void main(String[] args) {
        TransportOption publicTransport = new TransportOption(
            "Public Transport",
            "Wait and Pay on Spot",
            "None"
        );

        publicTransport.addFilter(new PublicTransport());

        TransportService transportService = new TransportService();
        TransportPipeline pipeline = new TransportPipeline();

        User user1 = new User("Hasham");
        User user2 = new User("Khalid");
        transportService.registerObserver(user1);
        transportService.registerObserver(user2);

        if (pipeline.process(publicTransport)) {
            transportService.executeOption(publicTransport);
        }
    }
}
