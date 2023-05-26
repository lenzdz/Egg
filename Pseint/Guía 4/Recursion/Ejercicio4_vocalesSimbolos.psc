Algoritmo Ejercicio4
	
	Definir cad, cadConvert como Cadena
	
	Escribir "Escriba una oración:"
	Leer cad
	
	vocalesSimbolos(cad, cadConvert)
	Escribir cadConvert
	
FinAlgoritmo

SubProceso vocalesSimbolos(cad, cadConvert Por Referencia)
	
	Definir i Como Entero
	
	cadConvert = ""
	Para i <- 0 Hasta Longitud(cad)-1 Hacer
		Segun SubCadena(cad,i,i) Hacer
			"A", "a":
				cadConvert = cadConvert + "@"
			"E", "e":
				cadConvert = cadConvert + "#"
			"I", "i":
				cadConvert = cadConvert + "$"
			"O", "o":
				cadConvert = cadConvert + "%"
			"U", "u":
				cadConvert = cadConvert + "*"
			De Otro Modo:
				cadConvert = cadConvert + Subcadena(cad, i, i)
		Fin Segun
	Fin Para
	
FinSubProceso
	