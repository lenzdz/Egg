let num1 = parseFloat(prompt("Ingrese el primer número:"));
let num2 = parseFloat(prompt("Ingrese el segundo número"));

let suma = num1 + num2;
let textoSuma = document.getElementById("texto-suma");
textoSuma.textContent = "La suma de " + num1 + " y " + num2 + " es igual a " + suma + ".";

let resta = num1 - num2;
let textoResta = document.getElementById("texto-resta");
textoResta.textContent = "La resta de " + num2 + " a " + num1 + " es igual a " + resta + ".";
