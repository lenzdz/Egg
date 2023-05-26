Algoritmo EjercicioExtra7
	
	Definir filas, columnas, matriz Como Entero
	
	filas = 7
	columnas = 6
	Dimension matriz[filas, columnas]
	rellenar(filas, columnas, matriz)
	impresion(filas, columnas, matriz)
	
FinAlgoritmo

SubProceso rellenar(fil, col, mat)
	
	Definir i, j, suma, max, counterP1, counterP2, counterP3, counterP4, counterP5 Como Entero
	
	counterP1 = 0
	counterP2 = 0
	counterP3 = 0
	counterP4 = 0
	counterP5 = 0
	
	Para i <- 0 Hasta fil-3 Hacer // Menos tres porque no rellenaremos las últimas dos filas
		suma = 0
		Para j <- 0 Hasta col-1 Hacer
			Si j < col-1 Entonces
				mat[i,j] = Aleatorio(0,10)
				suma = suma + mat[i,j]
			SiNo
				mat[i,j] = suma
			Fin Si
		Fin Para
	Fin Para
	
	Para j <- 0 Hasta col-1 Hacer
		suma = 0
		Para i <- 0 Hasta fil-2 Hacer // Menos dos porque no rellenaremos la última fila
			Si i < fil-2 Entonces
				suma = suma + mat[i,j]
			SiNo
				mat[i,j] = suma
			Fin Si
		Fin Para
	Fin Para
	
	Para j <- 0 Hasta col-1 Hacer
		
		max = 0
		Para i <- 0 Hasta fil-3 Hacer // Menos tres porque no nos interesa el total vendido, sino el número de ventas por producto (van hasta la fila 5)
			Si mat[i,j] > max Entonces
				max = mat[i,j]
				mat[6,j] = i+1
			Fin Si
		Fin Para
		
	Fin Para
	
FinSubProceso


SubProceso impresion(fil, col, mat)
	
	Definir i, j Como Entero
	Definir text como Cadena
	
	Escribir "            |   Lu   |   Ma   |   Mi   |   Ju   |   Vi   |   To   |"
	Para i <- 0 Hasta fil-1 Hacer // Menos dos porque la última columna es para el total
		
		Segun i Hacer
			fil-1:
				text = "Más vendido |"
			fil-2:
				text = "Total día   |"
			De Otro Modo:
				text = "Producto " + ConvertirATexto(i+1) + "  |"
		Fin Segun
		
		Para j <- 0 Hasta col-1 Hacer
			Si Longitud(ConvertirATexto(mat[i,j])) == 1 Entonces
				text = text + "    " + ConvertirATexto(mat[i,j]) + "   |"
			SiNo
				Si Longitud(ConvertirATexto(mat[i,j])) == 2 Entonces
					text = text + "   " + ConvertirATexto(mat[i,j]) + "   |"
				SiNo
					text = text + "  " + ConvertirATexto(mat[i,j]) + "   |"
				Fin Si
			Fin Si
		Fin Para
		Escribir text
	Fin Para
	
FinSubProceso
