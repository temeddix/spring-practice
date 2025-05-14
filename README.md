# spring-practice

## Docker (Cross-Platform)

You can run this application using Docker and Docker Compose on any platform:

### Prerequisites

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/install/) (usually included with Docker Desktop)

### Running the Application

1. Create an environment file:

```shell
cp .env.template .env
```

You can edit the `.env` file to customize database credentials and other settings.

2. Build and start the containers:

```shell
docker-compose up -d --build
```

3. View logs:

```shell
docker-compose logs -f
```

4. Stop the application:

```shell
docker-compose down
```

5. To delete all data (including the MySQL volume):

```shell
docker-compose down -v
```

The application will be available at http://localhost:8080
