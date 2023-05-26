Algoritmo Ejercicio5
	
	Definir dim, vector, respuesta Como Entero
	
	Escribir "Ingrese el tamaño de su vector:"
	Leer dim
	
	Dimension vector[dim]
	llenarVector(dim, vector)
	
	respuesta = elementoMayor(dim, vector)
	
FinAlgoritmo


SubProceso llenarVector(dim, vector Por Referencia)
	
	Definir i, elemento Como Entero
	
	Para i <- 0 Hasta dim-1 Hacer
		Leer elemento
		vector[i] = elemento
	Fin Para
	
FinSubProceso


Funcion retorno <- elementoMayor(dim, vector)
	
	Definir i, max Como Entero
	
	max = 0
	Para i <- 0 Hasta dim-1 Hacer
		Si vector[i] > max Entonces
			max = vector[i]
		FinSi
	Fin Para
	
	retorno = "El elemento más grande en el vector es: " + ConvertirATexto(max)
	
FinFuncion
	