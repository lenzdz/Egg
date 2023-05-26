Algoritmo Ejercicio6
	
	Definir letra Como Caracter
	Definir retorno Como Logico
	
	Escribir "Ingrese una letra:"
	Leer letra
	
	entreMT(letra, retorno)
	Escribir "La letra está entre M y T: ", retorno
	
FinAlgoritmo

SubProceso entreMT (letra, respuesta Por Referencia)
	
	Si letra >= "M" Y letra <= "T" Entonces
		respuesta = Verdadero
	SiNo
		respuesta = Falso
	Fin Si
	
FinSubProceso
	