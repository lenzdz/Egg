Algoritmo EjercicioExtra2
	
	Definir n, m, matriz, matrizTraspuesta Como Entero
	
	Escribir "Ingrese la cantidad de filas para su matriz:"
	Leer n
	
	Escribir "Ingrese la cantidad de columnas para su matriz:"
	Leer m
	
	Dimension matriz[n,m]
	rellenar(n, m, matriz)
	
	Escribir "La matriz original es:"
	impresion(n, m, matriz)
	
	Dimension matrizTraspuesta[m, n]
	trasponer(m, n, matriz, matrizTraspuesta)
	
	Escribir "La matriz traspuesta es:"
	impresion(m, n, matrizTraspuesta)
	
FinAlgoritmo

SubProceso rellenar(filas, columnas, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			mat[i,j] = Aleatorio(1,100)
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso trasponer(filas, columnas, mat, matTraspuesta)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			matTraspuesta[i,j] = mat[j,i]
		Fin Para
	Fin Para
	
FinSubProceso

SubProceso impresion(filas, columnas, mat)
	
	Definir i, j Como Entero
	Definir text como Cadena
	
	Para i <- 0 Hasta filas-1 Hacer
		text = ""
		Para j <- 0 Hasta columnas-1 Hacer
			Segun j Hacer
				0:
					text = text + "[" + ConvertirATexto(mat[i,j]) + ", "
				columnas-1:
					text = text + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					text = text + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir text
	Fin Para
	
FinSubProceso