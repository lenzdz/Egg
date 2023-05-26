Algoritmo EjercicioExtra5
	
	Definir filas, columnas, matriz Como Entero
	
	columnas = 3
	
	Escribir "Ingresa la cantidad de sumas que deseas hacer:"
	Leer filas
	
	Dimension matriz[filas, columnas]
	rellenar(filas, columnas, matriz)
	impresion(filas, columnas, matriz)
	
FinAlgoritmo

SubProceso rellenar(fil, col, mat)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta fil-1 Hacer
		Escribir "Fila #", i, ": ingresa los números a sumar."
		Para j <- 0 Hasta col-1 Hacer
			Si j < col-1 Entonces
				Leer mat[i,j]
			SiNo
				mat[i,j] = mat[i,0] + mat[i,1]
			Fin Si
		Fin Para
		Escribir ""
	Fin Para
	
FinSubProceso

SubProceso impresion(fil, col, mat)
	
	Definir i, j Como Entero
	Definir imp como Cadena
	
	Para i <- 0 Hasta fil-1 Hacer
		imp = ""
		Para j <- 0 Hasta col-1 Hacer
			Segun j Hacer
				0:
					imp = imp + ConvertirATexto(mat[i,j]) + " + "
				1:
					imp = imp + ConvertirATexto(mat[i,j]) + " = "
				col-1:
					imp = imp + ConvertirATexto(mat[i,j])
			Fin Segun
		Fin Para
		Escribir imp
	Fin Para
	
FinSubProceso
	