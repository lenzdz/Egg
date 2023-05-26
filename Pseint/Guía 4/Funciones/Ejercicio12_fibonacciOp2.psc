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
	
	fibonacci1 = 0
	fibonacci2 = 0
	
	Para i <- 0 Hasta counter Hacer
		fibonacciFinal = fibonacci1 + fibonacci2
		Segun i Hacer
			0:
				fibonacci1 = 1
				// Cuando i = 0, el programa se prepara para calcular la sucesión del primer término de Fibonacci: 0, [* 1 *].
				// Sin embargo, como 0 + 0 = 0, debemos redefinir fibonacci1 a 1 para garantizar que la suma en la siguiente iteración del bucle PARA sea correcta.
			1:
				// Cuando i = 1, el programa se prepara para calcular la sucesión del segundo término de Fibonacci: 0, 1, [* 1 *].
				// El término inmediatamente anterior (fibonacci1) es 1, el término anterior por dos pasos es 0.
				// La suma entre ambos ya da 1, por eso no es necesario hacer nada en este paso.
			2:
				fibonacci2 = fibonacci1
			De Otro Modo:
				fibonacci2 = fibonacci1
				fibonacci1 = fibonacciFinal
		Fin Segun
		
	Fin Para
	
Fin Funcion