let res = prompt("Ingresa una palabra:");

let count = res.length;

let textoLongitud = document.getElementById("texto-longitud");
textoLongitud.textContent = "La longitud de la palabra " + res.toUpperCase() + " es de " + count + " caracteres.";
