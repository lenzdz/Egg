Algoritmo Ejercicio3
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese dos números. El programa verificará si el primero es múltiplo del segundo."
	Leer num1, num2
	
	Escribir num1, " es múltiplo de ", num2, ": ", esMultiplo(num1, num2)
	
FinAlgoritmo



Funcion res <- esMultiplo (num1, num2)
	
	Definir res Como Logico
	res = num1 % num2 == 0
	
Fin Funcion