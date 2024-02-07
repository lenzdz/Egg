let precio = parseFloat(prompt("¿Cuál es el precio de su producto?"));

let nuevoPrecio;
let descuento = (precio >= 1000) ? nuevoPrecio = precio - (precio * 0.1) : nuevoPrecio = precio;

console.log(nuevoPrecio);