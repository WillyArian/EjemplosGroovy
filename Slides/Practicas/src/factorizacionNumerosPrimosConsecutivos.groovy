def cuantosPrimos = 4 // Especifica cuantos numeros primos diferentes a utilizar
Integer valorDeseado
Integer vueltas = 2
def divisor = 2
ArrayList arreglo = []
ArrayList consecutivo = []
long start, end

start = System.currentTimeMillis()
while(vueltas <= 300000){
    if(vueltas <= 2)
        (vueltas = setValue(cuantosPrimos))
    valorDeseado = vueltas
    while ( valorDeseado >= 2 ) {
        if ((valorDeseado > 1) && (valorDeseado % divisor) == 0){
            valorDeseado /= divisor
            arreglo.add(divisor)
        }
        else
            divisor += 1
    }
    if (iteraciones(arreglo) == cuantosPrimos) {
//       println(vueltas + ' --> ' + arreglo)
        consecutivo.add(vueltas)
        if (consecutivo.size() == 4){
            if(!esConsecutivo(consecutivo)){
                vueltas = (((int)consecutivo.get(1)) - 1)
                consecutivo.clear()
                println("Buscando.. numero = $vueltas, ve por un cafe!!")
            }
            else{
                consecutivo.each{
                   //pendiente de refactorizar/optimizar en especial esta parte
                    valorDeseado = it
                    arreglo.clear()
                    divisor = 2
                    while ( valorDeseado >= 2 ) {
                        if ((valorDeseado > 1) && (valorDeseado % divisor) == 0){
                            valorDeseado /= divisor
                            arreglo.add(divisor)

                        }
                        else
                            divisor += 1
                    }
                    println ("Numero consecutivo ---------------------------> $it <------------------------------$arreglo")
                }
                //consecutivo.clear()
                break
            }
        }
    }
    divisor = 2
    ++vueltas
    arreglo.clear()
}
end = System.currentTimeMillis()
println(end -start)
//funcion de optimizacion para poner el valor y no empezar desde el dos
def setValue(primos){
    def arreglos = [2, 3, 5, 7, 11, 13, 17, 19]
    def setValue = 1
    (0..(primos - 1)).each{
        setValue *= arreglos.get(it)
    }
    return setValue
}
//funcion para mostrar los numeros 
def iteraciones(arreglos){
    def repetidos = 0
    iteracion = 0
    arreglos.each{
        if(it > repetidos){
            repetidos = it
            iteracion++
        }
    }
    return iteracion
}

def esConsecutivo(consecutivo){
    def tempo1 = 0
    def tempo2 = true
    consecutivo.each{
        if (tempo1 !=0){
            ((it - tempo1) == 1 && tempo2) ?  (tempo2 = true) :  (tempo2 = false)
        }
        tempo1 = it
    }
    return tempo2
}