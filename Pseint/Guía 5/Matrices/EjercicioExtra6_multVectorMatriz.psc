Algoritmo EjercicioExtra6
	
	Definir matriz, vector, vectorFinal Como Entero
	
	Dimension vector[3]
	rellenarVector(vector)
	Escribir "VECTOR"
	imprimirVector(vector)
	Escribir ""
	
	Dimension matriz[3,3]
	rellenarMatriz(matriz)
	Escribir "MATRIZ"
	imprimirMatriz(matriz)
	Escribir ""
	
	Dimension vectorFinal[3]
	multVectorMatriz(vector, matriz, vectorFinal)
	Escribir "VECTOR FINAL"
	imprimirVector(vectorFinal)
	
FinAlgoritmo

SubProceso rellenarVector(vect)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta 3-1 Hacer
		vect[i] = Aleatorio(0,9)
	FinPara
	
FinSubProceso


SubProceso rellenarMatriz(mat)

	Definir i, j Como Entero
	
	Para i <- 0 Hasta 3-1 Hacer
		Para j <- 0 Hasta 3-1 Hacer
			mat[i,j] = Aleatorio(0,9)
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso multVectorMatriz(vect, mat, vectFinal)
	
	Definir i, j, mult como Entero
	
	Para i <- 0 Hasta 3-1 Hacer
		vectFinal[i] = 0
		Para j <- 0 Hasta 3-1 Hacer
			mult = mat[i,j] * vect[i]
			vectFinal[i] = vectFinal[i] + mult
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso imprimirVector(vect)
	
	Definir i Como Entero
	Definir impresion como Cadena
	
	Para i <- 0 Hasta 3-1 Hacer
		Segun i Hacer
			0:
				impresion = "[" + ConvertirATexto(vect[i]) + ", "
			3-1:
				impresion = impresion + ConvertirATexto(vect[i]) + "]"
			De Otro Modo:
				impresion = impresion + ConvertirATexto(vect[i]) + ", "
		Fin Segun
	FinPara
	
	Escribir impresion
	
FinSubProceso


SubProceso imprimirMatriz(mat)
	
	Definir i, j Como Entero
	Definir impresion como Cadena
	
	Para i <- 0 Hasta 3-1 Hacer
		impresion = ""
		Para j <- 0 Hasta 3-1 Hacer
			Segun j Hacer
				0:
					impresion = "[" + ConvertirATexto(mat[i,j]) + ", "
				3-1:
					impresion = impresion + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					impresion = impresion + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir impresion
	Fin Para
	
FinSubProceso
	