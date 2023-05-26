Algoritmo Ejercicio3
	
	Definir dimFil, dimCol, matriz, suma Como Entero
	
	Escribir "Ingrese la cantidad de filas y columnas de la matriz, respectivamente:"
	Leer dimFil, dimCol	
	
	Dimension matriz[dimFil,dimCol]
	
	rellenar(dimFil, dimCol, matriz)
	impresion(dimFil, dimCol, matriz)
	Escribir ""
	
	sumaMatriz(dimFil, dimCol, matriz, suma)
	Escribir "La suma de todos los elementos de la matriz es: ", suma
	
FinAlgoritmo


SubProceso rellenar(tamanioFil, tamanioCol, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta tamanioFil-1 Hacer
		Para j <- 0 Hasta tamanioCol-1 Hacer
			mat[i,j] = Aleatorio(0,50)
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso impresion(tamanioFil, tamanioCol, mat)
	
	Definir i, j Como Entero
	Definir impresionFila como Cadena
	
	Escribir "MATRIZ"
	impresionFila = ""
	
	Para i <- 0 Hasta tamanioFil-1 Hacer
		Para j <- 0 Hasta tamanioCol-1 Hacer
			Segun j Hacer
				0:
					impresionFila = impresionFila + "[" + ConvertirATexto(mat[i,j]) + ", "
				tamanioCol-1:
					impresionFila = impresionFila + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					impresionFila = impresionFila + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir impresionFila
		impresionFila = ""
	Fin Para
	
FinSubProceso

SubProceso sumaMatriz(tamanioFil, tamanioCol, mat, sum Por Referencia)
	
	Definir i, j Como Entero
	
	sum = 0
	Para i <- 0 Hasta tamanioFil-1 Hacer
		Para j <- 0 Hasta tamanioCol-1 Hacer
			sum = sum + mat[i,j]
		Fin Para
	Fin Para
	
FinSubProceso
	