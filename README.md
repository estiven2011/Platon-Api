# Platon API 

# Paso a paso 
Clonamos el repo
Verificamos dependencias e instalciones
Prendemos el servidor
Verificamos en postman (opcional ensayar los json sugeridos)

# Enpoints

http://localhost:8085/platon-api/cursos - GET
http://localhost:8085/platon-api/cursos - POST
http://localhost:8085/platon-api/cursos?nombre=ingenieria - GET
http://localhost:8085/platon-api/cursos?nombre=salud - GET



## Json que puedes ensayar para pruebas

### Exitosas

{
    "id": 1,
    "nombre": "Programación Básica",
    "codigo": "PRG01",
    "profesor": "Diana Gómez",
    "cupoMaximo": 30,
    "estudiantesInscritos": 0,
    "facultad": "ingenierias"
}

---
{
    "id": 2,
    "nombre": "Programacion Media-alta",
    "codigo": "CES02",
    "profesor": "Oscar Mesa",
    "cupoMaximo": 40,
    "estudiantesInscritos": 0,
    "facultad": "ingenierias"
}

---
{
    "id": 3,
    "nombre": "Anatomía I",
    "codigo": "MED101",
    "profesor": "Juliana Ríos",
    "cupoMaximo": 20,
    "estudiantesInscritos": 0,
    "facultad": "Salud"
}

---

### Rechazados

codigo duplicado

{
    "id": 4,
    "nombre": "Programación Intermedia",
    "codigo": "CES02", 
    "profesor": "Norberto",
    "cupoMaximo": 25,
    "estudiantesInscritos": 0,
    "facultad": "ingenierias"
}
---

cupo maximo menor a 0
{
    "id": 5,
    "nombre": "Lógica de Programación Media",
    "codigo": "SIST02",
    "profesor": "Maryem",
    "cupoMaximo": 0,
    "estudiantesInscritos": 0,
    "facultad": "ingenierias"
}

Elaborado por Juan Estiven Posada Rua
