Algoritmo Ejercicio6
	
	Definir posicion Como Entero
	Definir frase, vector, carNuevo como Cadena
	
	Escribir "Escriba una frase:"
	Leer frase
	
	Dimension vector[20]
	asignarElementos(frase, vector)
	
	Escribir "Intente ingresar un último caracter a su vector. Escríbalo y luego indíque su posición:"
	Leer carNuevo, posicion
	
	anadirElemento(frase, carNuevo, posicion, vector)
	imprimirVector(vector)
	
FinAlgoritmo


SubProceso asignarElementos (frase, vector Por Referencia)
	
	Definir i Como Entero
	
	Para i <- 0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i)
	Fin Para
	
FinSubProceso


SubProceso anadirElemento(frase, carNuevo, posicion, vector Por Referencia)
	
	Si vector[posicion] == "" O vector[posicion] == " " Entonces
		vector[posicion] = carNuevo
		Escribir "Se ha añadido el caracter exitosamente en la posición ", posicion, "."
	SiNo
		vector[posicion] = carNuevo
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
	