Algoritmo Ejercicio13
	
	Definir num Como Real
	
	Repetir
		Escribir "Ingrese un número entero positivo para determinar si este es capicúa:"
		Leer num
	Mientras Que num < 0
	
	Escribir num, esCapicua(num)
	
FinAlgoritmo


Funcion retorno <- esCapicua(num)
	
	Definir numOriginal, counter, reversedNum, dig, i Como Real
	Definir retorno Como Caracter
	
	numOriginal = num // Tenemos que guardar el valor original de num porque lo alteraremos en el primer bucle, pero lo volveremos a necesitar para el segundo 
	// bucle de la función y la comprobación final sobre si es capicúa.
	
	Si numOriginal < 10 Entonces
		retorno = " no es capicúa."
	SiNo
		counter = 0
		Mientras num > 0 Hacer
			// Mediante este bucle sabremos cuántos digitos tiene num; se ejecutará mientras que num sea mayor a cero.
			// Se opta por un bucle "Mientras" ya que no sabemos cuántos dígitos tendrá el número ingresado por el usuario.
			num = trunc(num/10) // Truncamos dividiendo por 10 para reducir el número de dígitos y llegar al resultado esperado sin necesidad de usar una cadena.
			counter = counter + 1 // Sumamos 1 al counter de dígitos.
		Fin Mientras
		
		num = numOriginal
		
		i = 1 * 10^(counter-1) // El máximo valor posicional de num será 10^(número de dígitos - 1). P. ej.: si num es 1234 (4 dígitos) su máximo valor posicional será el millar (10^3 = 1000).
		reversedNum = 0
		Mientras num > 0 Hacer
			// Mediante este bucle se invierte el número de atrás hacia adelante.
			dig = num % 10 // Comenzamos obteniendo el último dígito del número.
			num = trunc(num/10) // Truncamos el número para eliminar el último dígito del número (pues ya lo extrajimos).
			reversedNum = (dig*i) + reversedNum // Multiplicamos el último dígito extraído por i (el máximo valor posicional del número actual) y lo sumamos al valor guardado en memoria para el número invertido.
			i = i/10 // Dividimos i (máximo valor posicional) por 10 para reducir el máximo valor posicional del siguiente número evaluado y poder sumarlo correctamente al número invertido.
		Fin Mientras
		
		Si numOriginal == reversedNum Entonces // Verificación lógica sobre si num es el mismo de atrás para adelante.
			retorno = " es capicúa."
		SiNo
			retorno = " no es capicúa."
		Fin Si
	Fin Si
	
FinFuncion