Transport Options System
This project demonstrates a scalable implementation of a Transport Options System using the Pipeline Filter Pattern, Observer Pattern, and Layered Architecture. The system supports dynamic filtering of transport options and notifies users (observers) about relevant updates.

Key Features
Pipeline Filter Pattern:

Dynamically applies a series of filters to transport options to determine eligibility.
Filters can be added, removed, or composed without altering existing code.
Observer Pattern:

Notifies registered users (observers) when a transport option passes the pipeline.
Ensures real-time updates to all observers.
Layered Architecture:

Separates concerns into three layers:
Data Layer (model): Defines core entities like TransportOption and observer-related logic.
Business Logic Layer (service): Contains filters, pipelines, and transport-related operations.
Presentation Layer (ui): Handles user interaction and outputs results.
