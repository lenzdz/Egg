Algoritmo Ejercicio7
	
	Definir vectorA, vectorB, dim Como Entero
	Definir respuesta Como Logico
	
	Escribir "Determina la dimensión de tus vectores:"
	Leer dim
	
	Dimension vectorA[dim], vectorB[dim]
	rellenar(dim, vectorA)
	rellenar(dim, vectorB)
	
	respuesta = sonIguales(dim, vectorA, vectorB)
	
	Escribir "El vector A y el vector B son iguales: ", respuesta
	
FinAlgoritmo


SubProceso rellenar(dim, arreglo Por Referencia)
	
	Definir i Como Entero
	Definir impArreglo como Cadena
	
	impArreglo = "El vector es: "
	
	Para i <- 0 Hasta dim-1 Hacer
		arreglo[i] = Aleatorio(1,3)
		impArreglo = impArreglo + ConvertirATexto(arreglo[i]) + " "
	Fin Para
	
	Escribir impArreglo
	
FinSubProceso


Funcion retorno <- sonIguales(dim, arregloA, arregloB)
	
	Definir i Como Entero
	Definir retorno Como Logico
	
	i = 0
	retorno = Verdadero
	Mientras (i < dim) Y (retorno == Verdadero) Hacer
		Si arregloA[i] <> arregloB[i] Entonces
			retorno = Falso
		Fin Si
		i = i + 1
	Fin Mientras
	
Fin Funcion
