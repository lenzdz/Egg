Algoritmo Ejercicio12
	
	Definir counter Como Entero
	
	Repetir
		Escribir "Ingrese un número para determinar a qué sucesión de Fibonacci equivale:"
		Leer counter
	Mientras Que counter < 1
	
	Escribir "La sucesión ", counter, " de Fibonacci es ", fibonacci(counter)
	
FinAlgoritmo


Funcion fibonacciFinal <- fibonacci(counter)
	
	Definir i, fibonacci1, fibonacci2, fibonacciFinal Como Entero
	
	Si counter <= 2 Entonces
		fibonacciFinal = 1
		
	SiNo
		fibonacci1 = 1
		fibonacci2 = 1
		
		Para i <- 3 Hasta counter Hacer
			fibonacciFinal = fibonacci1 + fibonacci2
			fibonacci2 = fibonacci1
			fibonacci1 = fibonacciFinal
		Fin Para
		
	Fin Si
	
Fin Funcion