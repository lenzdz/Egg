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
//	// Mientras que la clave del usuario no sea igual a la clave, el bucle se ejecutar� (porque la prueba l�gica es VERDADERA)
//	// Mientras que i sea menor que 3, el bucle se ejecutar� (porque la prueba l�gica es VERDADERA)
//	// Cuando una de las dos expresiones sea falsa, ya sea porque el usuario adivin� la clave o porque excedi� los 3 intentos, el programa saldr� del bucle (porque al menos una de las dos pruebas es falsa,
//	// lo que nos devolver� un resultado l�gico FALSO)
//	
//	Si claveUsuario == clave Entonces
//		Escribir "Ha ingresado al sistema correctamente."
//	SiNo
//		Escribir "Usted ha agotado sus tres intentos."
//	FinSi
	
	/// Ejercicio #2
	
//	Definir num, max, min, suma, counter, promedio Como Real
//	
//	Escribir "Ingresa un n�mero. Para calcular el promedio de todos ellos presiona 0."
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
//		Escribir "Ingresa un n�mero. Para calcular el promedio de todos ellos presiona 0."
//		Leer num
//		
//	Mientras Que num > 0
//	
//	promedio = suma/counter
//	
//	Escribir "El n�mero m�s peque�o que ingresaste fue ", min
//	Escribir "El n�mero m�s grande que ingresaste fue ", max
//	Escribir "El promedio de todos los n�meros que ingresaste fue ", promedio
	
	/// Ejercicio #6
	
	Definir num, numN, suma Como Real
	
	Escribir "�Qu� cantidad de n�meros pares quieres sumar?"
	Leer num
	
	numN = num * 2
	suma = numN
	
	Repetir
		numN = numN - 2
		suma = suma + numN
	Mientras Que numN > 0
	
	
	Escribir "La suma de los primeros ", num, " n�meros pares es ", suma
	
	/// Ejercicio #7
	
//	Definir num, numUsuario Como Entero
//	
//	num = Aleatorio(1,10)
//	Escribir num
//	
//	Repetir
//		
//		Escribir "Adivina el n�mero sorpresa."
//		Leer numUsuario
//
//		Si numUsuario < num Entonces
//			Escribir "�Ups! El n�mero que ingresaste es menor que el n�mero sorpresa."
//		FinSi
//		
//		Si numUsuario > num Entonces
//			Escribir "�Ups! El n�mero que ingresaste es mayor que el n�mero sorpresa."
//		FinSi
//		
//	Mientras Que numUsuario <> num
//	
//	Escribir "�Felicitaciones! Adivinaste el n�mero sorpresa."
	
FinAlgoritmo
