# Evaluación: Ordenamiento de Películas

## Objetivo

Implementar `sortByTitle(Movie[] movies)` en `MovieController` para ordenar películas por título en orden descendente.

**Los nombres de clases, metodos, atributos deben ser exactamente los indicados en esta guía de requerimientos.**

## Qué debes editar

1. Edita solo `src/controllers/MovieController.java`.
2. Implementa `sortByTitle`.
3. Implementa clase modelo `Movie` con atributos `name` y `year`.
3. No cambies tests, modelo ni validadores.


## Rúbrica (10 puntos)

| Componente | Descripción | Puntos |
| --- | --- | ---: |
| Desarrollo | Implementación correcta de `sortByTitle` y paso de pruebas | 9.0 |
| Evidencia en main | Impresión en consola de películas ordenadas desde `App` | 1.0 |
| **Total** |  | **10.0** |

## Ejemplo de salida esperada (5 películas)

Entrada de ejemplo:
```text
1. Inception (2010)
2. avatar (2009)
3. The Matrix (1999)
4. AVATAR (2022)
5. Avatar (2016)
```

Salida ordenada esperada:
```text
1. avatar (2009)
2. The Matrix (1999)
3. Inception (2010)
4. Avatar (2016)
5. AVATAR (2022)
```

Otro ejemplo:
```text
ANTES
1. dune (2021)
2. Dune (1984)
3. DUNE (2024)
4. Batman (2022)
5. avatar (2009)

DESPUÉS
1. dune (2021)
2. avatar (2009)
3. Dune (1984)
4. DUNE (2024)
5. Batman (2022)
```

## Configuración de estudiante

Actualiza `student.env`:
```text
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.email@universidad.edu
```

## Calificación automática

GitHub Actions ejecuta compilación y pruebas al hacer push en `main`.

- Puntaje automático por pruebas: hasta 9.0.
- El punto restante corresponde a la evidencia de salida ordenada en `App`.

¡Éxitos!
