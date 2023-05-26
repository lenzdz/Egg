Algoritmo Ejercicio5
	
	Definir posicion Como Entero
	Definir frase, vector, vectorFinal, carNuevo como Cadena
	
	Escribir "Escriba una frase:"
	Leer frase
	
	Dimension vector[20]
	asignarElementos(frase, vector)
	
	Escribir "El vector original es:"
	imprimirVector(vector)
	
	Escribir "Ingrese un caracter a su vector. Escríbalo y luego indíque su posición:"
	Leer carNuevo, posicion
	
	anadirElemento(carNuevo, posicion, vector)
	imprimirVector(vector)
	
FinAlgoritmo


SubProceso asignarElementos (frase, vector Por Referencia)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i)
	Fin Para
	
FinSubProceso


SubProceso anadirElemento(carNuevo, posicion, vector Por Referencia)
	
	Definir i, posicionOriginal, counterIzq, counterDer Como Entero
	
	posicionOriginal = posicion
	counterIzq = 0
	counterDer = 0

	Si vector[posicion] == "" O vector[posicion] == " " O posicion == 19 Entonces
		vector[posicion] = carNuevo
	SiNo
		
		Si posicion == 0 Entonces
			Para i <- 19 Hasta posicion + 1 Con Paso -1 Hacer
				vector[i] = vector[i-1]
			Fin Para
			vector[posicion] = carNuevo
		SiNo
			// Caracteres a la izquierda
			Mientras posicion >= 0 Y (vector[posicion] <> "" Y vector[posicion] <> " ") Hacer // Cuando hay negación el "y" se lee como "ni"
				counterIzq = counterIzq + 1
				posicion = posicion - 1
			Fin Mientras
			
			// Reinicio en valor inicial de posición para hacer verificación hacia la derecha
			posicion = posicionOriginal
			
			// Caracteres a la derecha
			Mientras posicion <= 19 Y (vector[posicion] <> "" Y vector[posicion] <> " ") Hacer
				counterDer = counterDer + 1
				posicion = posicion + 1 
			Fin Mientras
			
			// Reinicio en valor inicial de posición para reorganizar el vector
			posicion = posicionOriginal
			
			// Verificación de counter más pequeño
			Si counterIzq < counterDer Entonces // Si los elementos hacia la izquierda hasta el primer espacio en blanco son menos que los que hay hacia la derecha:
				Para i <- 0 Hasta posicion Hacer
					vector[i] = vector[i+1]
				Fin Para
				vector[posicion] = carNuevo
			SiNo // Si los elementos hacia la derecha hasta el primer espacio en blanco son menos que los que hay hacia la izquierda:
				Para i <- 19 Hasta posicion Con Paso -1 Hacer
					vector[i] = vector[i-1]
				Fin Para
				vector[posicion] = carNuevo
			Fin Si
			
		Fin Si
		
	Fin Si
	
FinSubProceso


SubProceso imprimirVector(vector)
	
	Definir i Como Entero
	Definir retorno como Cadena
	
	retorno = "El vector final es: "
	Para i <- 0 Hasta 19 Hacer
		Segun i Hacer
			0:
				retorno = retorno + "[" + vector[i] + ", "
			19:
				retorno = retorno + vector[i] + "]"
			De Otro Modo:
				retorno = retorno + vector[i] + ", "
		Fin Segun
	Fin Para
	
	Escribir retorno
	
FinSubProceso