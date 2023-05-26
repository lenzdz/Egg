Algoritmo Ejercicio1
	
	Definir dim, vectorA, vectorB Como Entero
	
	dim = 5
	Dimension vectorA[dim], vectorB[dim]
	
	rellenar(dim, vectorA, vectorB)
	
FinAlgoritmo


SubProceso rellenar(dim, arregloA Por Referencia, arregloB Por Referencia)
	
	Definir i Como Entero
	Definir impA, impB como Cadena
	
	impA = "El vector A es ["
	impB = "El vector B es ["
	
	Para i <- 0 Hasta dim-1 Hacer
		arregloA[i] = Aleatorio(0,9)
		arregloB[i] = Aleatorio(0,9)
		Si i == dim-1 Entonces
			impA = impA + ConvertirATexto(arregloA[i]) + "]"
			impB = impB + ConvertirATexto(arregloB[i]) + "]"
		SiNo
			impA = impA + ConvertirATexto(arregloA[i]) + ", "
			impB = impB + ConvertirATexto(arregloB[i]) + ", "
		Fin Si
	Fin Para
	
	Escribir impA
	Escribir impB
	
FinSubProceso
	