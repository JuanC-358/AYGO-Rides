# AYGO-Rides
# Ride-Sharing Platform Microservice Architecture

## Overview
This repository contains a prototype for a ride-sharing platform with microservice architecture. The architecture is designed for modularity, scalability, and real-time communication, incorporating services for user management, ride requests, driver tracking, and payments.

## Architecture
- **API Gateway**: Routes client requests to backend services.
- **Lambda Functions**: Handle real-time operations such as ride requests.
- **EC2 Instances**: Manage persistent services, such as payments.
- **Database**: NoSQL for rides and user profiles; RDBMS for payments.

## Class Diagram Structure
| User | Driver | Ride |
|---|---|---|
| id | id | id |
| name | status | driverId |
| phoneNumber | rating | userId |
| ... | name | pickupLocation |
| | | dropoffLocation |
| | | status |

## Example JSON Representation
### Ride
```
{
  "rideId": "1",
  "userId": "123",
  "driverId": "456",
  "pickupLocation": { "lat": 40.748817, "long": -73.985428 },
  "dropoffLocation": { "lat": 40.712776, "long": -74.005974 },
  "status": "in-progress"
}

```
### User
```
{
  "Id": "123",
  "name": "Test",
  "phoneNumber": "7899"
}

```
### Driver
```
{
  "Id": "456",
  "status": "in-progress"
  "rating": "5",
  "name": "Toreto",
  
}

```
## Endpoints
- **User Service**
  - `GET /users/{userId}` - Retrieve user profile.
  <!-- - `POST /users` - Create a new user. -->

- **Driver Service**
  - `GET /drivers/{driverId}` - Retrieve driver profile.
  - `PUT /drivers/{driverId}/status` - Update driver status.

- **Ride Service**
  - `POST /rides` - Create a new ride.
  - `GET /rides/{rideId}` - Retrieve ride details.

- **Payment Service**
  - `POST /rides/{rideId}/payment` - Process payment.
  - `GET /rides/{rideId}/paymentDetails` - Retrieve payment details.

## Setup Instructions
1. Deploy API Gateway and Lambda functions in AWS.
2. Configure EC2 instances for payment services.
3. Set up a database for storing user, driver, and ride data.

## Architectural Decisions
- **Modularity**: Each service is designed independently to facilitate scalability.
- **Real-time Communication**: WebSockets used for real-time driver location updates.
- **Fault Tolerance**: Services are stateless wherever possible, and databases are distributed.

## Getting Started
To start using this repository, clone the repository and deploy the services as described above.
