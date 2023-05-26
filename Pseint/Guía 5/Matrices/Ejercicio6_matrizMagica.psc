Algoritmo Ejercicio6
	
	Definir dim, i, j, matriz, sumFil, sumCol, sumDiag Como Entero
	Definir flag, resFil, resCol, resDiag Como Logico
	
	flag = Falso // El usuario aún no ha ingreado un valor para la dimensión de la matriz
	
	Repetir
		
		Si flag == Verdadero Entonces
			Escribir "Valor inválido. Por favor, vuelva a intentarlo."
		Fin Si
		
		Escribir "Ingrese el tamaño de su matriz. El valor máximo es 10."
		Leer dim
		Escribir ""
		
		flag = Verdadero
		
	Mientras Que dim < 1 O dim > 10
	
	Dimension matriz[dim, dim]
	Escribir "Ingrese los elementos de su matriz:"
	
	Para i <- 0 Hasta dim-1 Hacer
		Para j <- 0 Hasta dim-1 Hacer
			
			flag = Falso // El usuario no ha ingresado el elemtento correspondiente a las coordenadas establecidas por el programa
			Repetir
				Si flag == Verdadero Entonces
					Escribir "Valor incorrecto. El elemento debe ser >=1 y <=9."
				Fin Si
				
				Escribir "Elemento [", i, ", ", j, "]"
				Leer matriz[i,j]
				Escribir ""
				
				flag = Verdadero
			Mientras Que matriz[i,j] < 1 O matriz[i,j] > 9
			
		FinPara
	Fin Para
	
	impresion(dim, matriz)
	
	comprobacionFilas(dim, matriz, resFil, sumFil)
	comprobacionColumnas(dim, matriz, resCol, sumCol)
	comprobacionDiagonales(dim, matriz, resDiag, sumDiag)
	
	Si resFil == resCol Y resFil == resDiag Entonces
		Si sumFil == sumCol Y sumFil == sumDiag Entonces
			Escribir "¡Wow! Tu matriz es mágica :)"
			Escribir "La suma de las filas, columas y diagonales es ", sumFil
		SiNo
			Escribir "Tu matriz no es mágica :("
		Fin Si
	SiNo
		Escribir "Tu matriz no es mágica :("
	Fin Si
	
FinAlgoritmo


SubProceso comprobacionFilas(tamanio, mat, retornoLogico Por Referencia, retornoSuma Por Referencia)
	
	Definir i, j, sumOriginal, sum Como Entero
	
	Para i <- 0 Hasta tamanio-1 Hacer
		
		sum = 0
		Para j <- 0 Hasta tamanio-1 Hacer
			sum = sum + mat[i,j]
		Fin Para
		
		Si i == 0 Entonces
			sumOriginal = sum
		SiNo
			Si sumOriginal == sum Entonces
				retornoLogico = Verdadero
				retornoSuma = sum
			SiNo
				retornoLogico = Falso
				i = tamanio
			Fin Si
		Fin Si
		
	Fin Para
	
FinSubProceso


SubProceso comprobacionColumnas(tamanio, mat, retornoLogico Por Referencia, retornoSuma Por Referencia)
	
	Definir i, j, sumOriginal, sum Como Entero
	
	Para j <- 0 Hasta tamanio-1 Hacer
		
		sum = 0
		Para i <- 0 Hasta tamanio-1 Hacer
			sum = sum + mat[i,j]
		Fin Para
		
		Si j == 0 Entonces
			sumOriginal = sum
		SiNo
			Si sumOriginal == sum Entonces
				retornoLogico = Verdadero
				retornoSuma = sum
			SiNo
				retornoLogico = Falso
				j = tamanio
			Fin Si
		Fin Si
		
	Fin Para
	
FinSubProceso


SubProceso comprobacionDiagonales(tamanio, mat, retornoLogico Por Referencia, retornoSuma Por Referencia)
	
	Definir i, j, sumOriginal, sum Como Entero
	
	// Revisión diagonal primaria (arriba a abajo, izquierda a derecha)
	sumOriginal = 0
	Para i <- 0 Hasta tamanio-1 Hacer
		sumOriginal = sumOriginal + mat[i,i]
	Fin Para
	
	// Revisión diagonal secundaria (arriba a abajo, derecha a izquierda)
	sum = 0
	i = 0
	j = tamanio-1
	Mientras i < tamanio Y j >= 0 Hacer
		sum = sum + mat[i,j]
		i = i + 1
		j = j - 1
	Fin Mientras
	
	Si sumOriginal == sum Entonces
		retornoLogico = Verdadero
		retornoSuma = sum
	SiNo
		retornoLogico = Falso
	Fin Si
	
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
	
	Escribir ""
	
FinSubProceso
	