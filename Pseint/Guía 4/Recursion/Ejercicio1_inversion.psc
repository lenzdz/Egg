Algoritmo Ejercicio1
	
	Definir a, b Como Entero
	
	Escribir "Ingrese dos números:"
	Leer a, b
	
	inversion(a,b)
	Escribir "Ahora a = ", a, " y b = ", b
	
FinAlgoritmo

SubProceso inversion(a Por Referencia, b Por Referencia)
	
	Definir c Como Entero
	c = a
	a = b
	b = c	
	
FinSubProceso
	