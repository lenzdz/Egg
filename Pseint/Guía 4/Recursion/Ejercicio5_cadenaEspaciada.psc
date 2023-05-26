Algoritmo Ejercicio5
	
	Definir cad, cadEspacio como Cadena
	
	Escribir "Escriba una oración:"
	Leer cad
	
	cadenaEspaciada(cad, cadEspacio)
	Escribir cadEspacio
	
FinAlgoritmo

SubProceso cadenaEspaciada (cad, retorno Por Referencia)
	
	Definir i Como Entero
	
	retorno = ""
	Para i <- 0 Hasta Longitud(cad)-1 Hacer
		retorno = retorno + Subcadena(cad, i, i) + " "
	Fin Para
	
FinSubProceso
