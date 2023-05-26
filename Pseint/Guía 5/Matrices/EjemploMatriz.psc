Algoritmo EjemploMatriz
	
	Definir i, j, dimFil, dimCol, matriz Como Entero
	Definir impresionFila como Cadena
	
	dimFil = 2
	dimCol = 6
	
	Dimension matriz[dimFil, dimCol]
	
	Para i <- 0 Hasta dimFil-1 Hacer
		Para j <- 0 Hasta dimCol-1 Hacer
			matriz[i,j] = Aleatorio(0,9)
			Escribir matriz[i,j]
		Fin Para
	Fin Para
	
	Para i <- 0 Hasta dimFil-1 Hacer
		impresionFila = "La fila #" + ConvertirATexto(i) + " es: "
		Para j <- 0 Hasta dimCol-1 Hacer
			Segun j Hacer
				0:
					impresionFila = impresionFila + "[" + ConvertirATexto(matriz[i,j]) + ", "
				dimCol-1:
					impresionFila = impresionFila + ConvertirATexto(matriz[i,j]) + "]."
				De Otro Modo:
					impresionFila = impresionFila + ConvertirATexto(matriz[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir impresionFila
	Fin Para
	
FinAlgoritmo
