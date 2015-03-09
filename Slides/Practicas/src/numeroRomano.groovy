def tipo = "Romano"
def numeroArabigo = 93 //Escribe solo numeros
def numeroRomanoss = "CCXI" //Escribe lo que sea.- tiene validaciones
def mapa = [M : 1000, CM : 900,D : 500, CD : 400, C : 100, XC : 90,  L : 50, XL : 40, X : 10, IX : 9, V : 5, IV : 4, I : 1]
def romano = ''
comp = 0
numeroRomanoss = numeroRomanoss.toUpperCase() //En caso de que el usuario no escriba en mayuscula

if(tipo == 'Romano') {
    numeroArabigo = 0
    numeroRomanoss.reverse().each {
        if(mapa.containsKey(it)){
            for (def ciclo in mapa){
                (mapa.get(it) >= comp) ? (numeroArabigo += mapa.get(it)) : (numeroArabigo -= mapa.get(it))
                comp = mapa.get(it)
                break
            }
        }
        else
            println("La letra/numero: $it no es valida")
    }
    (conversion(numeroArabigo, mapa, romano) == numeroRomanoss)? println(numeroArabigo): println('Error de sintaxis')
}
else
    (println(conversion(numeroArabigo, mapa, romano)))

def conversion(numeroArabigo, mapa, romano){
    while (numeroArabigo > 0 ) {
        for (def valor in mapa)
            if (numeroArabigo >= valor.value) {
                numeroArabigo -= valor.value
                romano += valor.key
                break
            }
    }
    return romano
}