Algoritmo Ejercicio7
	
	Definir dim, vector, multiplicacion Como Entero
	
	Escribir "Ingrese el tamaño de su vector:"
	Leer dim
	
	Dimension vector[dim]
	rellenar(dim, vector)
	imprimirVector(dim, vector)
	
	multiplicacion = multiplicarElementos(dim, vector)
	
	Escribir "La multiplicación entre los elementos del vector es: ", multiplicacion
	
FinAlgoritmo


SubProceso rellenar(tamanio, arreglo Por Referencia)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta tamanio-1 Hacer
		arreglo[i] = Aleatorio(0,10)
	Fin Para
	
FinSubProceso


Funcion retorno <- multiplicarElementos(dim, vector)
	
	Definir i, retorno Como Entero
	
	retorno = 1
	Para i <- 0 Hasta dim-1 Hacer
		retorno = retorno * vector[i]
	Fin Para
	
Fin Funcion


SubProceso imprimirVector(tamanio, arreglo)
	
	Definir i Como Entero
	Definir retorno como Cadena
	
	retorno = "El vector es: "
	Para i <- 0 Hasta tamanio-1 Hacer
		Segun i Hacer
			0:
				retorno = retorno + "[" + ConvertirATexto(arreglo[i]) + ", "
			tamanio-1:
				retorno = retorno + ConvertirATexto(arreglo[i]) + "]"
			De Otro Modo:
				retorno = retorno + ConvertirATexto(arreglo[i]) + ", "
		Fin Segun
	Fin Para
	
	Escribir retorno
	
FinSubProceso