# Jetpack Compose Weather App

This is a simple weather application built using Jetpack Compose, MVVM architecture, Dagger Hilt for dependency injection, Room for local data persistence, Google Maps for location services, and a weather detection API for fetching weather data.

## Features

1. **Weather Display**: View the current weather conditions along with the temperature, humidity, wind speed, and direction.

2. **Location Detection**: Automatically detect the user's location using Google Maps services.

3. **Search Functionality**: Search for weather conditions in any location around the globe.

4. **Local Data Storage**: Utilizes Room for storing recent search history and favorite locations.

## Technologies Used

### Jetpack Compose
Jetpack Compose is used for building the UI of the application. It allows for a more declarative way of defining UI components compared to traditional XML layouts.

### MVVM Architecture
The application follows the Model-View-ViewModel (MVVM) architecture pattern. This helps in separating the concerns of the application and makes it easier to maintain and test.

### Dagger Hilt
Dagger Hilt is used for dependency injection in the application. It helps in managing dependencies and makes the codebase more modular and easier to maintain.

### Room
Room is used for local data persistence. It provides an abstraction layer over SQLite database and helps in managing the application's database operations.

### Google Maps
Google Maps services are utilized for location detection. This allows the application to accurately detect the user's current location and provide weather information accordingly.

### Weather Detection API
The application uses a weather detection API to fetch weather data for different locations. This API provides real-time weather information such as temperature, humidity, wind speed, and direction.

## Installation

1. Clone the repository:


2. Open the project in Android Studio.

3. Build and run the application on an emulator or a physical device.

## Usage

1. Upon launching the application, it will attempt to detect your current location. If permission is granted, it will display the weather information for your current location.

2. You can also search for weather conditions in other locations by using the search functionality.

3. Recent searches and favorite locations are stored locally for easy access.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and submit a pull request.

## Acknowledgements

- Special thanks to the developers of Jetpack Compose, Dagger Hilt, Room, Google Maps, and the weather detection API used in this project.
- This project was created as a learning exercise and is not affiliated with any of the mentioned technologies or APIs.
