# 🚀 FitNexusAI

AI-powered fitness platform built using **Spring Boot microservices architecture** with secure **OAuth2 authentication via Keycloak** and a modern **React + Redux frontend**.

---

## 🔥 Badges

![Java](https://img.shields.io/badge/Backend-SpringBoot-green)
![React](https://img.shields.io/badge/Frontend-React-blue)
![Keycloak](https://img.shields.io/badge/Auth-Keycloak-orange)
![MongoDB](https://img.shields.io/badge/Database-MongoDB-green)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue)
![Kafka](https://img.shields.io/badge/Messaging-Kafka-black)

---

## 📌 Overview

FitNexusAI is a **cloud-native fitness application** designed using a **microservices architecture**.
It enables users to track fitness activities, securely authenticate using OAuth2 (PKCE), and interact with scalable backend services.

This project demonstrates **real-world enterprise architecture**, including:

* Distributed systems
* Secure authentication
* API gateway routing
* Service discovery
* Event-driven communication

---

## 🌟 Features

* 🔐 Secure Authentication using **Keycloak (OAuth2 + PKCE)**
* 🧩 Microservices Architecture (Spring Boot)
* 📊 Activity Tracking System
* 🌐 API Gateway (Spring Cloud Gateway)
* 🔎 Service Discovery (Eureka)
* ⚡ Event-driven communication (Kafka)
* 🎨 Modern UI with **React + Redux Toolkit + Material UI**
* 🗄️ MongoDB & PostgreSQL integration

---

## 🏗️ Architecture

```text
User → React Frontend → API Gateway → Microservices → Databases
```

### Services:

* **User Service** → Manages users (PostgreSQL)
* **Activity Service** → Tracks fitness activities (MongoDB)
* **AI Service** → (future enhancement)
* **API Gateway** → Routes requests
* **Eureka Server** → Service discovery
* **Config Server** → Centralized configuration
* **Keycloak** → Authentication & Authorization

---

## 📁 Project Structure

```text
FitNexusAI/
│── userservice/
│── activityservice/
│── aiservice/
│── gateway/
│── eureka/
│── configserver/
│── frontend/
```

---

## 🛠️ Tech Stack

### Backend

* Spring Boot
* Spring Cloud (Gateway, Eureka, Config)
* Kafka
* MongoDB
* PostgreSQL

### Frontend

* React.js
* Redux Toolkit
* Material UI
* Axios

### Security

* Keycloak
* OAuth2 / OpenID Connect (PKCE)

---

## 🔐 Authentication Flow

1. User clicks **Login**
2. Redirect to Keycloak
3. User authenticates
4. Redirect back with authorization code
5. Token exchange (OAuth2 PKCE)
6. Token stored in Redux
7. API requests include:

   ```text
   Authorization: Bearer <token>
   ```

---

## 📡 API Example

```http
GET /api/activities
Authorization: Bearer <token>
```

---

## 📸 Screenshots

*Add your screenshots here*

---

## 🚀 Future Improvements

* 🤖 AI-based fitness recommendations
* 📱 Mobile app integration
* 📈 Analytics dashboard
* ☁️ Cloud deployment (AWS/GCP)

---


## ⭐ Show Your Support

If you like this project, give it a ⭐ on GitHub!
