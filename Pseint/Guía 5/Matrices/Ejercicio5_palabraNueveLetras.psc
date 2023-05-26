Algoritmo Ejercicio5
	
	Definir dim, i, j, indicePalabra Como Entero
	Definir palabra, matriz, fila como Cadena
	
	dim = 3
	
	Repetir
		
		Escribir "Ingresa una palabra de 9 letras:"
		Leer palabra
		
	Mientras Que Longitud(palabra) <> 9
	
	Dimension matriz[dim, dim]
	
	indicePalabra = 0
	
	Para i <- 0 Hasta dim-1 Hacer
		Para j <- 0 Hasta dim-1 Hacer
			matriz[i,j] = Subcadena(palabra, indicePalabra, indicePalabra)
			indicePalabra = indicePalabra + 1
		Fin Para
	Fin Para
	
	Escribir "MATRIZ"
	
	Para i <- 0 Hasta dim-1 Hacer
		fila = ""
		Para j <- 0 Hasta dim-1 Hacer
			Segun j Hacer
				0:
					fila = fila + "[" + matriz[i,j] + ", "
				dim-1:
					fila = fila + matriz[i,j] + "]"
				De Otro Modo:
					fila = fila + matriz[i,j] + ", "
			Fin Segun
		Fin Para
		Escribir fila
	Fin Para
	
FinAlgoritmo
