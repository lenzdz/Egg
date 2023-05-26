Algoritmo EjercicioExtra3
	
	Definir filas, columnas, matriz Como Entero
	
	filas = 5
	columnas = 15
	
	Dimension matriz[filas, columnas]
	rellenar(filas, columnas, matriz)
	impresion(filas, columnas, matriz)
	
FinAlgoritmo


SubProceso rellenar(fil, col, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta fil-1 Hacer
		Para j <- 0 Hasta col-1 Hacer
			Si i == 0 O i == fil-1 O j == 0 O j == col-1 Entonces
				mat[i,j] = 1
			SiNo
				mat[i,j] = 0
			Fin Si
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso impresion(fil, col, mat)
	
	Definir i, j Como Entero
	Definir text como Cadena
	
	Escribir "MATRIZ"
	
	Para i<- 0 Hasta fil-1 Hacer
		text = ""
		Para j <- 0 Hasta col-1 Hacer
			Segun j Hacer
				0:
					text = text + "[" + ConvertirATexto(mat[i,j]) + ", "
				col-1:
					text = text + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					text = text + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir text
	Fin Para
	
FinSubProceso