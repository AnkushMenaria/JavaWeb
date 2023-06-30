# My API Project

This is a Java-based API project using Servlets. The API provides the following functionality:

1. Accepts GET requests and returns a simple message.
2. Accepts POST requests as a JSON object, saves the request in a file, and sends a JSON object response acknowledgement message.

## Getting Started

To get started with the project, follow these instructions.

### Prerequisites

- Java Development Kit (JDK) installed
- Apache Tomcat (or any other Servlet container) installed

### Installation

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Configure the Servlet container to deploy the project. For Apache Tomcat, copy the WAR file to the Tomcat's `webapps` directory.
4. Start the Servlet container to deploy the project.

### Usage

1. To test the API's GET endpoint, open a web browser and navigate to the API endpoint URL. You should see a simple message displayed.
2. To test the API's POST endpoint, use a tool like Postman. Send a POST request to the API endpoint with a JSON payload. The API will save the request in a file and send a JSON response acknowledging the request.

## Contributing

Contributions to this project are welcome. Feel free to open an issue or submit a pull request with any improvements or additional features.

## License

This project is licensed under the [MIT License](LICENSE).

