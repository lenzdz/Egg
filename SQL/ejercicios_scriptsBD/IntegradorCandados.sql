USE nba;

SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM jugadores;
SELECT * FROM partidos;

/* POSICIÓN CANDADO A = 2
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo. */
SELECT MAX(Asistencias_por_partido) FROM estadisticas;
SELECT Asistencias_por_partido, COUNT(Asistencias_por_partido) 
	FROM estadisticas 
    GROUP BY Asistencias_por_partido 
    ORDER BY Asistencias_por_partido ASC;
    
/* POSICIÓN CANDADO B = 3
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat. */
SELECT COUNT(codigo) FROM jugadores WHERE Nombre_equipo = 'Heat'; -- Número jugadores Heat (16)

SELECT codigo, jugadores.Nombre, estadisticas.Asistencias_por_partido
	FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
    WHERE estadisticas.Asistencias_por_partido > 16
    ORDER BY estadisticas.Asistencias_por_partido;

SELECT COUNT(codigo)
	FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
    HAVING estadisticas.Asistencias_por_partido > 16;
    
/* POSICION CANDADO C = 1
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945. */
SELECT COUNT(codigo) -- Res = 2
	FROM jugadores INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
    WHERE Conferencia = 'West' AND Procedencia = 'Michigan';

SELECT COUNT(codigo) -- Res = 362
	FROM jugadores
    WHERE Peso >= 195;
    
SELECT ((2/195)+0.9945);

/* POSICION CANDADO D = 4
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado.*/
SELECT ROUND(SUM(Tapones_por_partido))
	FROM jugadores
	INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
    WHERE jugadores.Nombre = 'Corey Maggette' AND estadisticas.temporada = '00/01';

/* CLAVE CANDADO A = 14043
Suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones. */
SELECT jugadores.Nombre, Posicion, Nombre_equipo, equipos.Conferencia 
	FROM jugadores INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
    WHERE Posicion REGEXP 'C' AND Conferencia = 'East';

SELECT SUM(Peso) 
	FROM jugadores INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
    WHERE Posicion REGEXP 'C' AND Conferencia = 'East';
    
/* CLAVE CANDADO B = 3480
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999. */
SELECT COUNT(codigo) 
	FROM partidos
    WHERE temporada REGEXP '99';
    
/* CLAVE CANDADO C = 631
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido, 
el conteo de asistencias por partido, y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea central.*/
SELECT FLOOR(AVG(Puntos_por_partido) + COUNT(Asistencias_por_partido) + SUM(Tapones_por_partido))
	FROM estadisticas 
    INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
	INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
    WHERE equipos.Division = 'Central';
    
/* CLAVE CANDADO D = 191
Para obtener el siguiente código deberás redondear hacia abajo la suma de puntos por partido
de todos los jugadores de procedencia argentina. */
SELECT FLOOR(SUM(Puntos_por_partido))
	FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
    WHERE Procedencia = 'Argentina';