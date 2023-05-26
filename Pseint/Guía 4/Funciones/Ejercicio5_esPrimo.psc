Algoritmo Ejercicio5
	
	Definir num Como Entero
	
	Repetir
		Escribir "Ingrese un número entero para determinar si es primo:"
		Leer num
	Mientras Que num < 0
	
	Si num == 1 O num == 0 Entonces
		Escribir num, " no es un número primo."
	SiNo
		Si esPrimo(num) == Verdadero Entonces
			Escribir num, " es un número primo."
		SiNo
			Escribir num, " no es un número primo."
		FinSi
	FinSi
	
FinAlgoritmo



/// Funciones 

Funcion retorno <-  esPrimo(num)
	Definir i Como Entero
	Definir retorno Como Logico
	
	retorno = Verdadero
	i = 2
	Mientras i < num Hacer
		Si num % i == 0 Entonces
			retorno = Falso			
		FinSi
		i = i + 1
	Fin Mientras
	
FinFuncion
	