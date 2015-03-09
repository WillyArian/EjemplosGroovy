def xxx = 'o'
def yyy= 'x'
def frase = 'Esto es otro ejemplo practico'
def r = 0

StringBuffer nuevo = new StringBuffer()

def index = frase.indexOf(xxx)
i = index +1
nuevo.append(frase.substring( 0, index )).append(yyy)

while (index != -1)
{
    index = frase.indexOf(xxx, i)
    if ( index != -1){
        nuevo.append (frase.substring(i , index))
        ++r
        (0..r).each {nuevo.append(yyy)}
        i = index + 1
    }
}
println(nuevo.append(frase.substring( i, frase.length())))