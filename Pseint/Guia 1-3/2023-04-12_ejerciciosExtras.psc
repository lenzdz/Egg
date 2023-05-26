Algoritmo sin_titulo
	
	/// Ejercicio extra #8 
	
	Definir contrato Como Caracter
	
	Escribir "¿Qué tipo de contrato tiene el trabajador? C: comisión; SFC: salario fijo + comisión; SF: salario fijo."
	Leer contrato
	
	contrato = Mayusculas(contrato)
	
	Segun contrato Hacer
		"C":
			Definir ventas, sueldoFinal Como Real
			
			Escribir "Ingrese el monto total de ventas para esta semana:"
			Leer ventas
			
			sueldoFinal = (40*ventas)/100
			
			Escribir "El sueldo semanal del trabajador es de ", sueldoFinal			
		"SFC":
			Definir sueldoHora, sueldoFinal, ventas, comision Como Real
			
			Escribir "Ingrese el sueldo por hora:"
			Leer sueldoHora
			
			Escribir "Ingrese el monto total de ventas para esta semana:"
			Leer ventas
			
			sueldoFinal = (sueldoHora*40) + ((25*ventas)/100)
			
			Escribir "El sueldo semanal del trabajador es de ", sueldoFinal
		"SF":
			Definir sueldoHora, sueldoHoraExtra, sueldoFinal, horasExtras como Real
			
			Escribir "Ingrese el sueldo por hora:"
			Leer sueldoHora
			
			Escribir "Ingrese la cantidad de horas extras realizadas por el trabajador:"
			Leer horasExtras
			
			sueldoHoraExtra = sueldoHora + (sueldoHora*50)/100
			
			sueldoFinal = (sueldoHora*40) + (sueldoHoraExtra*horasExtras)
			
			Escribir "El sueldo semanal del trabajador es de ", sueldoFinal			
		De Otro Modo:
			Escribir "La opción ingresada no es válida."
	Fin Segun
	
FinAlgoritmo
