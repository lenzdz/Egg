Algoritmo Ejercicio1
	
	Definir dim, matriz Como Entero
	
	dim = 3
	Dimension matriz[dim,dim]
	rellenar(dim, matriz)
	impresion(dim, matriz)
	
FinAlgoritmo


SubProceso rellenar(tamanio, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta tamanio-1 Hacer
		Para j <- 0 Hasta tamanio-1 Hacer
			Escribir "Ingrese el elemento para las coordenadas ", i, ", ", j, ":"
			Leer mat[i,j]
		Fin Para
	Fin Para
	
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
	