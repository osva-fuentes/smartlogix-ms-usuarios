# ms-usuarios

Microservicio de gestión de usuarios de SmartLogix SaaS. Implementa el patrón Factory Method para instanciar diferentes tipos de usuario sin acoplar el código cliente a las clases concretas.

## Patrón de diseño implementado

| Patrón | Ubicación | Propósito |
|---|---|---|
| Factory Method | `UsuarioFactory` | Instancia `Pyme` o `Admin` según el tipo solicitado, aplicando polimorfismo controlado |

## Tecnologías

- Java 21
- Spring Boot 3.5.14
- Lombok
- Docker

## DTO implementados

- `UsuarioRequestDTO`: datos de entrada (tipo, nombre).
- `UsuarioResponseDTO`: datos de salida (rol asignado, permisos).

## Endpoints

| Método | Endpoint | Descripción |
|---|---|---|
| POST | `/api/usuarios/crear?tipo=PYME\|ADMIN&nombre=X` | Crea un usuario mediante el Factory Method |
| GET | `/api/usuarios/health` | Verifica que el servicio está activo |

## Tipos de usuario

| Tipo | Rol | Permisos |
|---|---|---|
| PYME | PYME | Inventario, pedidos, reportes propios |
| ADMIN | ADMIN | Acceso total al sistema |

## Cómo ejecutar localmente

### Requisitos
- Java 21
- Maven 3.9+

### Con Maven

```bash
mvn clean package -DskipTests
java -jar target/ms-usuarios-0.0.1-SNAPSHOT.jar
```

El servicio queda disponible en `http://localhost:8084`.

### Con Docker

```bash
docker build -t ms-usuarios .
docker run -p 8084:8084 ms-usuarios
```

## Cómo probar

```bash
curl -X POST "http://localhost:8084/api/usuarios/crear?tipo=PYME&nombre=Maria%20Gonzalez"
```

Respuesta esperada:
```
Usuario creado - Rol: PYME | Permisos: Acceso: inventario, pedidos, reportes propios
```

## Estructura del proyecto

```
src/main/java/com/proyectofullstack/usuarios/
├── Controller/   UsuarioController
├── Model/        Usuario, Pyme, Admin
├── Factory/      UsuarioFactory
└── UsuariosApplication.java
```
