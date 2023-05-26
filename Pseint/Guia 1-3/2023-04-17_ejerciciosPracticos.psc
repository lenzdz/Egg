Algoritmo sin_titulo
	
	/// Ejercicio #1
	
//	Definir clave, claveUsuario Como Caracter
//	Definir i Como Entero
//	
//	clave = "eureka"
//	i = 0
//	
//	Hacer 
//		
//		Escribir "Ingrese la clave para acceder al sistema."
//		Leer claveUsuario
//		
//		i = i + 1
//		
//	Mientras Que claveUsuario <> clave Y i < 3 
//	// Mientras que la clave del usuario no sea igual a la clave, el bucle se ejecutará (porque la prueba lógica es VERDADERA)
//	// Mientras que i sea menor que 3, el bucle se ejecutará (porque la prueba lógica es VERDADERA)
//	// Cuando una de las dos expresiones sea falsa, ya sea porque el usuario adivinó la clave o porque excedió los 3 intentos, el programa saldrá del bucle (porque al menos una de las dos pruebas es falsa,
//	// lo que nos devolverá un resultado lógico FALSO)
//	
//	Si claveUsuario == clave Entonces
//		Escribir "Ha ingresado al sistema correctamente."
//	SiNo
//		Escribir "Usted ha agotado sus tres intentos."
//	FinSi
	
	/// Ejercicio #2
	
//	Definir num, max, min, suma, counter, promedio Como Real
//	
//	Escribir "Ingresa un número. Para calcular el promedio de todos ellos presiona 0."
//	Leer num
//	
//	min = num
//	max = num
//	suma = 0
//	counter = 0
//	
//	Repetir
//		
//		counter = counter + 1
//		suma = suma + num
//		
//		Si max < num Entonces
//			max = num			
//		FinSi
//		
//		Si min > num Entonces
//			min = num
//		FinSi
//		
//		Escribir "Ingresa un número. Para calcular el promedio de todos ellos presiona 0."
//		Leer num
//		
//	Mientras Que num > 0
//	
//	promedio = suma/counter
//	
//	Escribir "El número más pequeño que ingresaste fue ", min
//	Escribir "El número más grande que ingresaste fue ", max
//	Escribir "El promedio de todos los números que ingresaste fue ", promedio
	
	/// Ejercicio #6
	
	Definir num, numN, suma Como Real
	
	Escribir "¿Qué cantidad de números pares quieres sumar?"
	Leer num
	
	numN = num * 2
	suma = numN
	
	Repetir
		numN = numN - 2
		suma = suma + numN
	Mientras Que numN > 0
	
	
	Escribir "La suma de los primeros ", num, " números pares es ", suma
	
	/// Ejercicio #7
	
//	Definir num, numUsuario Como Entero
//	
//	num = Aleatorio(1,10)
//	Escribir num
//	
//	Repetir
//		
//		Escribir "Adivina el número sorpresa."
//		Leer numUsuario
//
//		Si numUsuario < num Entonces
//			Escribir "¡Ups! El número que ingresaste es menor que el número sorpresa."
//		FinSi
//		
//		Si numUsuario > num Entonces
//			Escribir "¡Ups! El número que ingresaste es mayor que el número sorpresa."
//		FinSi
//		
//	Mientras Que numUsuario <> num
//	
//	Escribir "¡Felicitaciones! Adivinaste el número sorpresa."
	
FinAlgoritmo
