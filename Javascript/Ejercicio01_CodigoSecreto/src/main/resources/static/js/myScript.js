let codigoDescuentoSecreto = 7;
let intentosCodigo = 0;
const maxIntentos = 5;

let textoIntentos = document.getElementById("texto-intentos");
textoIntentos.textContent = "Usted tiene " + maxIntentos + " intentos y ha gastado " + intentosCodigo + ".";

function ingresarCodigo() {
    let res;
    while (intentosCodigo < maxIntentos && res != codigoDescuentoSecreto) {
        res = prompt("Ingresa tu código de descuento:");
        intentosCodigo++;
        textoIntentos.textContent = "Usted tiene " + maxIntentos + " intentos y ha gastado " + intentosCodigo + ".";
    }
    
    if (res == codigoDescuentoSecreto) {
        alert("¡Felicitaciones! Has recibido un descuento.")
        codigoDescuentoSecreto = null;
    } else {
        alert("Usted ya no tiene intentos disponibles.");
    }
    
}