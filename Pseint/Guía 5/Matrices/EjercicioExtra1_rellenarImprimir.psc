Algoritmo EjercicioExtra1
	
	Definir dim, matriz Como Entero
	
	dim = 5
	Dimension matriz[dim, dim]
	
	rellenar(dim, matriz)
	impresion(dim, matriz)
	
FinAlgoritmo


SubProceso rellenar(tamanio, mat)
	
	Definir i, j Como Entero
	
	Para i<- 0 Hasta tamanio-1 Hacer
		Para j <- 0 Hasta tamanio-1 Hacer
			mat[i,j] = Aleatorio(0,9)
		Fin Para
	Fin Para
	
FinSubProceso


SubProceso impresion(tamanio, mat)
	
	Definir i, j Como Entero
	Definir text como Cadena
	
	Escribir "MATRIZ"
	
	Para i<- 0 Hasta tamanio-1 Hacer
		text = ""
		Para j <- 0 Hasta tamanio-1 Hacer
			Segun j Hacer
				0:
					text = text + "[" + ConvertirATexto(mat[i,j]) + ", "
				tamanio-1:
					text = text + ConvertirATexto(mat[i,j]) + "]"
				De Otro Modo:
					text = text + ConvertirATexto(mat[i,j]) + ", "
			Fin Segun
		Fin Para
		Escribir text
	Fin Para
	
FinSubProceso
	