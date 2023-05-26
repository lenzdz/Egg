Algoritmo Ejercicio3
	
	Definir dim, vector, i, x Como Real
	Definir retorno como Cadena
	
	Escribir "¿Qué dimensión desea asignarle a su arreglo?"
	Leer dim
	
	Dimension vector(dim)
	
	Escribir "Asigne un valor a cada elemento:"
	Para i <- 0 Hasta dim-1 Hacer
		Leer vector[i]
	FinPara
	
	Escribir "Ingrese el elemento que desea buscar:"
	Leer x
	
	retorno = busqueda(vector, dim, x)
	Escribir retorno
	
FinAlgoritmo

Funcion respuesta <- busqueda(vector, dim, x)
	
	Definir indices, respuesta como Cadena
	Definir i Como Real
	
	indices = ""
	Para i <- dim-1 Hasta 0 Con Paso -1 Hacer
		Si vector[i] == x Entonces
			Si Longitud(indices) == 0 Entonces
				indices = ConvertirATexto(i)
			SiNo
				Si Longitud(indices) == 1 Entonces
					indices = ConvertirATexto(i) + " y " + indices
				SiNo
					indices = ConvertirATexto(i) + ", " + indices
				FinSi
			FinSi
		Fin Si
	FinPara
	
	Segun Longitud(indices) Hacer
		0:
			respuesta = "No hay coincidencias."
		1:
			respuesta = ConvertirATexto(x) + " se ubica en el índice " + indices + " del vector."
		De Otro Modo:
			respuesta = ConvertirATexto(x) + " se ubica en los índices " + indices + " del vector."
	Fin Segun
	
Fin Funcion