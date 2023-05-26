Algoritmo Ejercicio3
	
	Definir dim, vectorLong Como Entero
	Definir vectorNombres como Cadena
	
	Escribir "Ingresa la dimensión de tu vector:"
	Leer dim
	
	Dimension vectorNombres[dim], vectorLong[dim]
	rellenarNombres(dim, vectorNombres)
	longitudNombres(dim, vectorNombres, vectorLong)
	
	impConjuntaVectores(dim, vectorNombres, vectorLong)
	
FinAlgoritmo


SubProceso rellenarNombres(dim, vectorNombres Por Referencia)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta dim-1 Hacer
		Escribir "Ingresa el nombre:"
		Leer vectorNombres[i]
	Fin Para
	
FinSubProceso


SubProceso longitudNombres(dim, vectorNombres, vectorLong Por Referencia)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta dim-1 Hacer
		vectorLong[i] = Longitud(vectorNombres[i])
	Fin Para
	
FinSubProceso


SubProceso impConjuntaVectores(dim, vectorNombres, vectorLong)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta dim-1 Hacer
		Escribir "El elemento ", i, " del vector es ", vectorNombres[i], " y su longitud es ", vectorLong[i]
	Fin Para
	
FinSubProceso
	