Algoritmo Ejercicio3
	
	Definir a, b, cociente, resto Como Real
	
	Escribir "Ingrese dos n�meros:"
	Leer a, b
	
	cocienteResto(a, b, cociente, resto)
	
	Escribir "El cociente de la divisi�n ", a, "/", b, " es ", cociente, ", mientras que el resto es ", resto
	
FinAlgoritmo

SubProceso cocienteResto(a Por Valor, b Por Valor, cociente Por Referencia, resto Por Referencia)
	
	cociente = trunc(a/b)
	resto = a % b
	
FinSubProceso
	