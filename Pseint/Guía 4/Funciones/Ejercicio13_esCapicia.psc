Algoritmo Ejercicio13
	
	Definir num Como Real
	
	Repetir
		Escribir "Ingrese un n�mero entero positivo para determinar si este es capic�a:"
		Leer num
	Mientras Que num < 0
	
	Escribir num, esCapicua(num)
	
FinAlgoritmo


Funcion retorno <- esCapicua(num)
	
	Definir numOriginal, counter, reversedNum, dig, i Como Real
	Definir retorno Como Caracter
	
	numOriginal = num // Tenemos que guardar el valor original de num porque lo alteraremos en el primer bucle, pero lo volveremos a necesitar para el segundo 
	// bucle de la funci�n y la comprobaci�n final sobre si es capic�a.
	
	Si numOriginal < 10 Entonces
		retorno = " no es capic�a."
	SiNo
		counter = 0
		Mientras num > 0 Hacer
			// Mediante este bucle sabremos cu�ntos digitos tiene num; se ejecutar� mientras que num sea mayor a cero.
			// Se opta por un bucle "Mientras" ya que no sabemos cu�ntos d�gitos tendr� el n�mero ingresado por el usuario.
			num = trunc(num/10) // Truncamos dividiendo por 10 para reducir el n�mero de d�gitos y llegar al resultado esperado sin necesidad de usar una cadena.
			counter = counter + 1 // Sumamos 1 al counter de d�gitos.
		Fin Mientras
		
		num = numOriginal
		
		i = 1 * 10^(counter-1) // El m�ximo valor posicional de num ser� 10^(n�mero de d�gitos - 1). P. ej.: si num es 1234 (4 d�gitos) su m�ximo valor posicional ser� el millar (10^3 = 1000).
		reversedNum = 0
		Mientras num > 0 Hacer
			// Mediante este bucle se invierte el n�mero de atr�s hacia adelante.
			dig = num % 10 // Comenzamos obteniendo el �ltimo d�gito del n�mero.
			num = trunc(num/10) // Truncamos el n�mero para eliminar el �ltimo d�gito del n�mero (pues ya lo extrajimos).
			reversedNum = (dig*i) + reversedNum // Multiplicamos el �ltimo d�gito extra�do por i (el m�ximo valor posicional del n�mero actual) y lo sumamos al valor guardado en memoria para el n�mero invertido.
			i = i/10 // Dividimos i (m�ximo valor posicional) por 10 para reducir el m�ximo valor posicional del siguiente n�mero evaluado y poder sumarlo correctamente al n�mero invertido.
		Fin Mientras
		
		Si numOriginal == reversedNum Entonces // Verificaci�n l�gica sobre si num es el mismo de atr�s para adelante.
			retorno = " es capic�a."
		SiNo
			retorno = " no es capic�a."
		Fin Si
	Fin Si
	
FinFuncion