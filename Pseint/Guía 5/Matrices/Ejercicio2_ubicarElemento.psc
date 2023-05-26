Algoritmo Ejercicio2
	
	Definir dim, matriz, num Como Entero
	
	dim = 5
	Dimension matriz[dim,dim]
	
	rellenar(dim, matriz)
	impresion(dim, matriz)
	
	Escribir "¿Qué número deseas ubicar en la matriz?"
	Leer num
	
	ubicar(dim, matriz, num)
	
FinAlgoritmo


SubProceso rellenar(tamanio, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta tamanio-1 Hacer
		Para j <- 0 Hasta tamanio-1 Hacer
			mat[i,j] = Aleatorio(0,50)
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso ubicar(tamanio, mat, number)
	
	Definir i, j Como Entero
	Definir numberExiste Como Logico
	
	numberExiste = Falso
	Para i <- 0 Hasta tamanio-1 Hacer
		Para j <- 0 Hasta tamanio-1 Hacer
			Si mat[i,j] == number Entonces
				Escribir number, " se encuentra en las coordenadas [", i, ", ", j, "] de la matriz."
				numberExiste = Verdadero
			FinSi
		Fin Para
	Fin Para
	
	Si numberExiste == Falso Entonces
		Escribir number, " no se encuentra en la matriz."
	FinSi
	
FinSubProceso


SubProceso impresion(tamanio, mat)
	
	Definir i, j Como Entero
	Definir impresionFila como Cadena
	
	Para i <- 0 Hasta tamanio-1 Hacer
		impresionFila = "La fila #" + ConvertirATexto(i) + " de la matriz es "
		Para j <- 0 Hasta tamanio-1 Hacer
			Segun j Hacer
				0:
					impresionFila = impresionFila + "[" + ConvertirATexto(mat[i,j]) + ", "
				tamanio-1:
					impresionFila = impresionFila + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					impresionFila = impresionFila + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir impresionFila
	Fin Para
	
FinSubProceso
