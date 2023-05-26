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
		r="El número ingresado es capicúa"
	SiNo
		r="El número ingresado no es capicúa"
	FinSi
	
FinFuncion
	