Algoritmo Ejercicio6
	
	Definir num Como Entero
	
	Escribir "Ingrese un n�mero:"
	Leer num
	
	Escribir "La suma de todos los divisores de ", num, " es ", sumaDivisores(num)
	
FinAlgoritmo


/// Funci�n

Funcion suma <- sumaDivisores(num)
	Definir suma, i Como Entero
	
	suma = 0
	Para i <- 1 Hasta num-1 Hacer // Para todos los n�meros desde 1 hasta num-1 [i] (porque la funci�n no pretende incluir num) 
		Si num % i == 0 Entonces // se eval�a el resto de num dividido entre i. Si este es igual a 0, i es un divisor de num,
			suma = suma + i			// as� que se adiciona a la suma.
		FinSi
	Fin Para
	
Fin Funcion