Algoritmo EjercicioExtra4
	
	Definir matriz1, matriz2, matrizMultiplicar Como Real
	
	Dimension matriz1[3,3], matriz2[3,3], matrizMultiplicar[3,3]
	
	Escribir "MATRIZ #1"
	rellenar(matriz1)
	impresion(matriz1)
	Escribir ""
	
	Escribir "MATRIZ #2"
	rellenar(matriz2)
	impresion(matriz2)
	Escribir ""
	
	Escribir "MATRIZ MULTIPLICACIÓN"
	multiplicar(matriz1, matriz2, matrizMultiplicar)
	impresion(matrizMultiplicar)
	Escribir ""
	
FinAlgoritmo


SubProceso rellenar(mat)
	
	Definir i, j Como Entero
	
	Para i<- 0 Hasta 3-1 Hacer
		Para j <- 0 Hasta 3-1 Hacer
			mat[i,j] = Aleatorio(1,9)
		Fin Para
	Fin Para
	
FinSubProceso

SubProceso multiplicar(mat1, mat2, matFinal)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta 3-1 Hacer
		Para j <- 0 Hasta 3-1 Hacer
			matFinal[i,j] = mat1[i,j] * mat2[i,j]
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso impresion(mat)
	
	Definir i, j Como Entero
	Definir text como Cadena
	
	Para i<- 0 Hasta 3-1 Hacer
		text = ""
		Para j <- 0 Hasta 3-1 Hacer
			Segun j Hacer
				0:
					text = text + "[" + ConvertirATexto(mat[i,j]) + ", "
				3-1:
					text = text + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					text = text + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir text
	Fin Para
	
FinSubProceso