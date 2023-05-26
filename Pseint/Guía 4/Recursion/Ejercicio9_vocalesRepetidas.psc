Algoritmo Ejercicio9
	
	Definir frase, retorno como Cadena
	
	Escribir "Escriba una oración:"
	Leer frase
	
	vocalRep(frase, retorno)
	Escribir retorno
	
FinAlgoritmo

SubProceso vocalRep(frase, fraseNoRep Por Referencia)
	
	Definir i Como Entero
	Definir repA, repE, repI, repO, repU Como Logico
	
	repA = Falso
	repE = Falso
	repI = Falso
	repO = Falso
	repU = Falso
	
	fraseNoRep = ""
	
	Para i <- 0 Hasta Longitud(frase)-1 Hacer
		Segun SubCadena(frase,i,i) Hacer
			"A","a":
				Si repA == Falso Entonces
					fraseNoRep = fraseNoRep + SubCadena(frase,i,i)
					repA = Verdadero
				FinSi
			"E","e":
				Si repE == Falso Entonces
					fraseNoRep = fraseNoRep + SubCadena(frase,i,i)
					repE = Verdadero
				FinSi
			"I","i":
				Si repI == Falso Entonces
					fraseNoRep = fraseNoRep + SubCadena(frase,i,i)
					repI = Verdadero
				FinSi
			"O","o":
				Si repO == Falso Entonces
					fraseNoRep = fraseNoRep + SubCadena(frase,i,i)
					repO = Verdadero
				FinSi
			"U","u":
				Si repU == Falso Entonces
					fraseNoRep = fraseNoRep + SubCadena(frase,i,i)
					repU = Verdadero
				FinSi
			De Otro Modo:
				fraseNoRep = fraseNoRep + SubCadena(frase,i,i)
		Fin Segun
	Fin Para
	
FinSubProceso
