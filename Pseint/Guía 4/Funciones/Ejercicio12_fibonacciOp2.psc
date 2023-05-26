Algoritmo Ejercicio12
	
	Definir counter Como Entero
	
	Repetir
		Escribir "Ingrese un n�mero para determinar a qu� sucesi�n de Fibonacci equivale:"
		Leer counter
	Mientras Que counter < 1
	
	Escribir "La sucesi�n ", counter, " de Fibonacci es ", fibonacci(counter)
	
FinAlgoritmo


Funcion fibonacciFinal <- fibonacci(counter)
	
	Definir i, fibonacci1, fibonacci2, fibonacciFinal Como Entero
	
	fibonacci1 = 0
	fibonacci2 = 0
	
	Para i <- 0 Hasta counter Hacer
		fibonacciFinal = fibonacci1 + fibonacci2
		Segun i Hacer
			0:
				fibonacci1 = 1
				// Cuando i = 0, el programa se prepara para calcular la sucesi�n del primer t�rmino de Fibonacci: 0, [* 1 *].
				// Sin embargo, como 0 + 0 = 0, debemos redefinir fibonacci1 a 1 para garantizar que la suma en la siguiente iteraci�n del bucle PARA sea correcta.
			1:
				// Cuando i = 1, el programa se prepara para calcular la sucesi�n del segundo t�rmino de Fibonacci: 0, 1, [* 1 *].
				// El t�rmino inmediatamente anterior (fibonacci1) es 1, el t�rmino anterior por dos pasos es 0.
				// La suma entre ambos ya da 1, por eso no es necesario hacer nada en este paso.
			2:
				fibonacci2 = fibonacci1
			De Otro Modo:
				fibonacci2 = fibonacci1
				fibonacci1 = fibonacciFinal
		Fin Segun
		
	Fin Para
	
Fin Funcion