Algoritmo Ejercicio2
	
	Definir dim, vector Como Entero
	
	Escribir "Ingresa la dimensión que deseas asignarle a tu vector:"
	Leer dim
	
	Dimension vector[dim]
	rellenar(dim, vector)
	
FinAlgoritmo


SubProceso rellenar(dim, vector Por Referencia)
	
	Definir i, suma Como Entero
	
	suma = 0
	Para i <- 0 Hasta dim-1 Hacer
		Escribir "Ingresa el elemento ", i, " de tu vector:"
		Leer vector[i]
		
		suma = suma + vector[i]
	Fin Para
	
	Escribir "El promedio de los valores ingresados es: ", suma/dim
	
FinSubProceso
	