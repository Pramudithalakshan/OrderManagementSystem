# Order Management System (OMS)

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.8-brightgreen)
![MongoDB](https://img.shields.io/badge/MongoDB-Database-green)
![Maven](https://img.shields.io/badge/Maven-Build-blue)

A comprehensive **Order Management System** built with Spring Boot and MongoDB for managing customers, products, orders, and suppliers. This RESTful API application provides full CRUD operations for enterprise-level order management.

## 📋 Table of Contents

- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Architecture](#-architecture)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Configuration](#️-configuration)
- [Running the Application](#-running-the-application)
- [API Endpoints](#-api-endpoints)
- [Project Structure](#-project-structure)
- [Testing](#-testing)
- [Deployment](#-deployment)
- [Security](#-security)
- [Contributing](#-contributing)
- [License](#-license)

## ✨ Features

- **Customer Management**: Create, retrieve, and delete customer records
- **Product Management**: Manage product inventory with pricing and expiry tracking
- **Order Management**: Complete order lifecycle management
- **Supplier Management**: Track and manage supplier information
- **RESTful API**: Clean and intuitive REST endpoints
- **MongoDB Integration**: Scalable NoSQL database for data persistence
- **DTO Pattern**: Data Transfer Objects for clean separation of concerns
- **MapStruct**: Automatic entity-to-DTO mapping
- **Cross-Origin Support**: CORS enabled for frontend integration
- **Environment Configuration**: Secure configuration via environment variables
- **Heroku Ready**: Configured for easy cloud deployment

## 🛠 Tech Stack

### Backend
- **Java 21** - Programming language
- **Spring Boot 3.5.8** - Application framework
- **Spring Web** - RESTful web services
- **Spring Data MongoDB** - MongoDB integration
- **Maven** - Build automation and dependency management

### Database
- **MongoDB** - NoSQL database

### Libraries & Tools
- **Lombok 1.18.42** - Reduce boilerplate code
- **MapStruct 1.5.5** - Type-safe bean mapping
- **Spring Dotenv 4.0.0** - Environment variable management

## 🏗 Architecture

This application follows a layered architecture pattern:

```
┌─────────────────┐
│   Controllers   │  ← REST endpoints
├─────────────────┤
│   Services      │  ← Business logic
├─────────────────┤
│   Repositories  │  ← Data access layer
├─────────────────┤
│   Entities      │  ← MongoDB documents
└─────────────────┘
```

**Design Patterns Used:**
- Repository Pattern
- Data Transfer Object (DTO) Pattern
- Dependency Injection
- Service Layer Pattern

## 📦 Prerequisites

Before running this application, ensure you have:

- **JDK 21** or higher
- **Maven 3.8+**
- **MongoDB Atlas account** (or local MongoDB instance)
- **Git** (for cloning the repository)

## 🚀 Installation

1. **Clone the repository:**
```bash
git clone https://github.com/yourusername/OrderManagementSystem.git
cd OrderManagementSystem
```

2. **Create a `.env` file in the project root:**
```bash
touch .env
```

3. **Add the following environment variables to `.env`:**
```properties
MONGODB_URI=mongodb+srv://username:password@cluster.mongodb.net/yourdbname?retryWrites=true&w=majority
PORT=8080
```

> **Note:** Replace `username`, `password`, `cluster`, and `yourdbname` with your actual MongoDB credentials.

## ⚙️ Configuration

The application uses environment variables for configuration defined in `application.yml`:

| Variable | Description | Default | Required |
|----------|-------------|---------|----------|
| `MONGODB_URI` | MongoDB connection string | - | ✅ Yes |
| `PORT` | Application server port | 8080 | ❌ No |

### Setting Environment Variables

**Linux/macOS:**
```bash
export MONGODB_URI="mongodb+srv://username:password@cluster.mongodb.net/oms_db"
export PORT=8080
```

**Windows (CMD):**
```cmd
set MONGODB_URI=mongodb+srv://username:password@cluster.mongodb.net/oms_db
set PORT=8080
```

**Windows (PowerShell):**
```powershell
$env:MONGODB_URI="mongodb+srv://username:password@cluster.mongodb.net/oms_db"
$env:PORT=8080
```

## 🏃 Running the Application

### Option 1: Using Maven

```bash
# Clean and build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### Option 2: Using Packaged JAR

```bash
# Package the application
mvn clean package

# Run the JAR file
java -jar target/org.craftigen-1.0-SNAPSHOT.jar
```

### Option 3: Using IntelliJ IDEA

1. Import the project as a Maven project
2. Configure Project SDK to JDK 21
3. Set environment variables in Run Configuration:
   - Edit Configurations → Environment Variables
   - Add `MONGODB_URI` and `PORT`
4. Run `Main.java`

The application will start at: **`http://localhost:8080`**

## 📡 API Endpoints

Base URL: `http://localhost:8080`

### 👥 Customer Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/customer/get-customer` | Retrieve all customers | - |
| `POST` | `/customer/add-customer` | Add a new customer | CustomerDTO |
| `DELETE` | `/customer/remove-customer/{id}` | Delete a customer by ID | - |

**CustomerDTO Structure:**
```json
{
  "id": "string",
  "firstName": "string",
  "lastName": "string",
  "phoneNumber": "string",
  "city": "string"
}
```

### 📦 Product Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/product/get-product` | Retrieve all products | - |
| `POST` | `/product/add-product` | Add a new product | ProductDTO |
| `DELETE` | `/product/remove-product/{id}` | Delete a product by ID | - |

**ProductDTO Structure:**
```json
{
  "id": "string",
  "name": "string",
  "price": 0.0,
  "addedDate": "string",
  "expiryDate": "string"
}
```

### 📋 Order Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/orders/get-order` | Retrieve all orders | - |
| `POST` | `/orders/add-order` | Create a new order | OrderDTO |
| `DELETE` | `/orders/remove-order/{id}` | Delete an order by ID | - |

**OrderDTO Structure:**
```json
{
  "id": "string",
  "name": "string",
  "date": "string",
  "qty": 0,
  "price": 0.0
}
```

### 🏢 Supplier Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/supplier/get-supplier` | Retrieve all suppliers | - |
| `POST` | `/supplier/add-supplier` | Register a new supplier | SupplierDTO |
| `DELETE` | `/supplier/remove-customer/{id}` | Delete a supplier by ID | - |

**SupplierDTO Structure:**
```json
{
  "id": "string",
  "firstName": "string",
  "lastName": "string",
  "email": "string",
  "contact": "string",
  "company": "string",
  "registeredDate": "string"
}
```

## 📁 Project Structure

```
OrderManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── craftigen/
│   │   │           ├── Main.java                    # Application entry point
│   │   │           ├── controller/                  # REST controllers
│   │   │           │   ├── CustomerController.java
│   │   │           │   ├── OrderController.java
│   │   │           │   ├── ProductController.java
│   │   │           │   └── SupplierController.java
│   │   │           ├── dtos/                        # Data Transfer Objects
│   │   │           │   ├── CustomerDTO.java
│   │   │           │   ├── OrderDTO.java
│   │   │           │   ├── ProductDTO.java
│   │   │           │   └── SupplierDTO.java
│   │   │           ├── entity/                      # MongoDB entities
│   │   │           │   ├── Customer.java
│   │   │           │   ├── Order.java
│   │   │           │   ├── Product.java
│   │   │           │   └── Supplier.java
│   │   │           ├── mapper/                      # MapStruct mappers
│   │   │           │   ├── CustomerMapper.java
│   │   │           │   ├── OrderMapper.java
│   │   │           │   ├── ProductMapper.java
│   │   │           │   └── SupplierMapper.java
│   │   │           ├── repository/                  # MongoDB repositories
│   │   │           │   ├── CustomerRepository.java
│   │   │           │   ├── OrderRepository.java
│   │   │           │   ├── ProductRepository.java
│   │   │           │   └── SupplierRepository.java
│   │   │           └── service/                     # Business logic
│   │   │               ├── CustomerService.java
│   │   │               ├── OrderService.java
│   │   │               ├── ProductService.java
│   │   │               ├── SupplierService.java
│   │   │               └── impl/                    # Service implementations
│   │   └── resources/
│   │       └── application.yml                      # Application configuration
│   └── test/
│       └── java/                                    # Test files
├── target/                                          # Build output
├── .env                                             # Environment variables (gitignored)
├── .gitignore                                       # Git ignore rules
├── Procfile                                         # Heroku deployment config
├── system.properties                                # Java version for Heroku
├── pom.xml                                          # Maven configuration
└── README.md                                        # This file
```

## 🧪 Testing

Run all tests:
```bash
mvn test
```

Run tests with coverage:
```bash
mvn clean test jacoco:report
```

Run specific test class:
```bash
mvn test -Dtest=YourTestClassName
```

## 🚢 Deployment

### Deploy to Heroku

This application is pre-configured for Heroku deployment with `Procfile` and `system.properties`.

1. **Create a Heroku app:**
```bash
heroku create your-app-name
```

2. **Set environment variables:**
```bash
heroku config:set MONGODB_URI="your-mongodb-connection-string"
```

3. **Deploy:**
```bash
git push heroku main
```

4. **Open the application:**
```bash
heroku open
```

### Deploy with Docker

**Create a `Dockerfile`:**
```dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/org.craftigen-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

**Build and run:**
```bash
# Build Docker image
docker build -t order-management-system .

# Run container
docker run -p 8080:8080 \
  -e MONGODB_URI="your-connection-string" \
  order-management-system
```

### Deploy to AWS, GCP, or Azure

The packaged JAR file can be deployed to any cloud platform that supports Java applications. Ensure environment variables are configured in the respective platform's configuration.

## 🔒 Security

### Important Security Notes

⚠️ **Critical:** This application currently does not implement authentication or authorization. For production use, consider adding:

- Spring Security for authentication/authorization
- JWT tokens for stateless authentication
- Role-based access control (RBAC)
- API rate limiting
- Input validation and sanitization

### Best Practices

- ✅ Never commit `.env` files or secrets to version control
- ✅ Use environment variables for all sensitive data
- ✅ Rotate MongoDB credentials regularly
- ✅ Enable MongoDB network access controls
- ✅ Use HTTPS in production
- ✅ Implement proper error handling without exposing sensitive information
- ✅ Keep dependencies up to date

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch:**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your changes:**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push to the branch:**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

### Code Style Guidelines

- Follow Java naming conventions
- Use Lombok annotations to reduce boilerplate
- Write meaningful commit messages
- Add comments for complex logic
- Ensure all tests pass before submitting PR

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Pramuditha Lakshan**

- GitHub: [@Pramudithalakshan](https://github.com/Pramudithalakshan)

## 🙏 Acknowledgments

- Spring Boot Team for the excellent framework
- MongoDB for the flexible NoSQL database
- MapStruct for simplified object mapping
- Lombok for reducing boilerplate code

## 📞 Support

If you encounter any issues or have questions:

- 🐛 [Open an issue](https://github.com/yourusername/OrderManagementSystem/issues)
- 📧 Contact the maintainer
- 📖 Check the [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)

---

**Made with ❤️ using Spring Boot and MongoDB**

