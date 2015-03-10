def mapa = [2, 3, 5, 7]
def noPrimo = true

(1..100).step(2) {
    (it >= 1 && it < 2) ? mapa.each {num -> println'Numero Primo ----> ' + (num)} : ""
    if (it > 10)
        for (int numero in mapa){
            noPrimo = (it % numero == 0)
            if (noPrimo)
                break
        }
        (!noPrimo)?( println('Numero Primo ----> ' + it)) : ""
}