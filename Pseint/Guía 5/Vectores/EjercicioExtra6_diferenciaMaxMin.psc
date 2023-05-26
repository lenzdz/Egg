Algoritmo Ejercicio6
	
	Definir dim, vector, diferencia Como Real
	
	Escribir "Ingrese el tamaño de su vector:"
	Leer dim
	
	Dimension vector[dim]
	rellenar(dim, vector)
	imprimirVector(dim, vector)
	
	diferencia = diferenciaMaxMin(dim, vector)
	
	Escribir "La diferencia entre el número más grande y el más pequeño es: ", diferencia
	
FinAlgoritmo


SubProceso rellenar(tamanio, arreglo Por Referencia)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta tamanio-1 Hacer
		arreglo[i] = Aleatorio(-300,500)
	Fin Para
	
FinSubProceso


Funcion retorno <- diferenciaMaxMin(dim, vector)
	
	Definir i, min, max, retorno Como Real
	
	Para i <- 0 Hasta dim-1 Hacer
		Si i == 0 Entonces
			min = vector[i]
			max = vector[i]
		SiNo
			Si min > vector[i] Entonces
				min = vector[i]
			Fin Si
			Si max < vector[i] Entonces
				max = vector[i]
			Fin Si
		Fin Si
	Fin Para
	
	retorno = max - min
	
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