Algoritmo Ejercicio9
	
	Definir nombre, dia, festivo, turno como Cadena
	Definir horas, jornalDiario Como Real
	
	Escribir "Ingrese el nombre del trabajador:"
	Leer nombre
	
	Escribir "Ingrese el día de la semana:"
	Leer dia
	dia = Minusculas(dia)
	
	Si dia == "lunes" O dia == "martes" O dia == "miercoles" O dia == "miércoles" O dia == "jueves" O dia == "viernes" O dia == "sabado" O dia == "sábado" Entonces
		Escribir "¿El día laborado fue festivo? (s/n)"
		Leer festivo
		festivo = Minusculas(festivo)
	SiNo
		festivo = "s"
	FinSi
	
	Escribir "¿Durante qué turno laboró el trabajador? (d/n)"
	Leer turno
	turno = Minusculas(turno)
	
	Escribir "¿Cuántas horas laboró el trabajador?"
	Leer horas
	
	jornalDiario = calculoJornal(festivo, turno, horas)
	
	Escribir "El jornal diario de ", nombre, " es de $", jornalDiario
	
FinAlgoritmo


/// Funcion

Funcion jornalDiario <- calculoJornal(festivo, turno, horas)
	
	Definir jornalDiario Como Real
	
	Segun turno Hacer
		// Turno diurno
		"d":
			Si festivo == "n" Entonces
				jornalDiario = horas * 90
			SiNo
				jornalDiario = horas * 99
			Fin Si
			
		// Turno nocturno
		"n":
			Si festivo == "n" Entonces
				jornalDiario = horas * 125
			SiNo
				jornalDiario = horas * 143.75
			Fin Si
	Fin Segun
	
Fin Funcion