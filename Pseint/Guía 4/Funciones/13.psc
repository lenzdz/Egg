Algoritmo sin_titulo
	
	definir a Como real
	
	escribir "Ingrese un numero"
	leer a
	
	escribir esCapicua(a)
	
FinAlgoritmo

Funcion r=esCapicua(a)
	r es cadena
	b,c es entero
	b=0
	c=a
	
	mientras c>0 hacer
		b=(b*10)+(c%10)
		c=trunc(c/10)
	FinMientras
	
	si b=a
		r="El n�mero ingresado es capic�a"
	SiNo
		r="El n�mero ingresado no es capic�a"
	FinSi
	
FinFuncion
	