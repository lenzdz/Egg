Algoritmo Ejercicio11
	
	Definir num Como Entero
	
	Repetir
		Escribir "Ingrese un número mayor que cero:"
		Leer num
	Mientras Que num < 1
	
	Escribir "Todos los dígitos de ", num, " son impares: ", digImpares(num)
	
FinAlgoritmo


Funcion retorno <- digImpares(num)
	
	Definir suma, dig Como Entero
	Definir retorno Como Logico
	
	retorno = Verdadero
	Mientras num > 0 Hacer
		dig = num % 10
		Si dig % 2 == 0 Entonces
			retorno = Falso
			num = 0
		FinSi
		num = trunc(num/10)
	Fin Mientras
	
FinFuncion