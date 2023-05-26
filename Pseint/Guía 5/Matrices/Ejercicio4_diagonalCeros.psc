Algoritmo Ejercicio4
	
	Definir dim, matriz Como Entero
	
	Escribir "Ingrese la dimensión de su matriz:"
	Leer dim
	
	Dimension matriz[dim, dim]
	rellenar(dim, matriz)
	
	impresion(dim, matriz)
	
FinAlgoritmo

SubProceso rellenar(tamanio, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta tamanio-1 Hacer
		Para j <- 0 Hasta tamanio-1 Hacer
			Si i == j Entonces
				mat[i,j] = 0
			SiNo
				mat[i,j] = Aleatorio(1,9)
			Fin Si
		FinPara
	Fin Para
	
FinSubProceso


SubProceso impresion(tamanio, mat)
	
	Definir i, j Como Entero
	Definir fila como Cadena
	
	Escribir "MATRIZ"
	Para i <- 0 Hasta tamanio-1 Hacer
		fila = ""
		Para j <- 0 Hasta tamanio-1 Hacer
			Segun j Hacer
				0:
					fila = fila + "[" + ConvertirATexto(mat[i,j]) + ", "
				tamanio-1:
					fila = fila + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					fila = fila + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		FinPara
		Escribir fila
	FinPara
	
FinSubProceso
	