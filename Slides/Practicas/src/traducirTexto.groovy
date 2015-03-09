/**
 * Created by 57811 on 07/03/2015.
 */

String cadenaOriginal = """Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx
Ynkxxñsluxj, ky as jkzkizñbk vxñbgju, gqzu, jkqmgju, lxñu, ñxusñiu,
ñsmksñuyu k ñszkqkizagqrkszk ñswañkzu. Cgzyus qu jkyixñhk lñyñigrkszk
jkq yñmañkszk ruju gq vuiu jk iusuikxykf

Ya kyzgzaxg yuhxkvgyghg quy ykñy vñky, e kxg zgs kdzxguxjñsgxñgrkszk
ksoazu, wak vxujaiñg qg ñrvxkyñus jk ykx gas rgy gqzu. Zksñg qg rñxgjg
gmajg e vkskzxgszk, e ya sgxñf, lñsg e gmañqktg, jghg gq iusoaszu jk yay
lgiiñusky as gñxk jk bñbkfg e jk xkyuqaiñus.

Gaswak rainuy ngs skmgju kyzg uviñus, kq kyixñzux hgyu ya jkyixñviñus
jk Nuqrky ks as gszñmau grñmu jk qg lgiaqzgj, qqgrgju Ynkxxñsluxj, kq
iagq qqkmu g luxrgx vgxzk jk Yiuzqgsj Egxj, mxgs grñmu e gqñgju jk iusgs
jueqk e iaegy jkyixñviñusky jk bñbksiñgy vuqñiñgigy ñsyvñxgxus raingy jk
yay uhxgy.
"""
long start, end
start = System.currentTimeMillis()
cadenaOriginal.each() {
    tempo3 = (it.charAt(0))
    def valor3 = tempo3
    ((tempo3 == 32 || tempo3 == 46 || tempo3 == 44 || tempo3 == 13) ? "" :  (valor3 +=  20))
    (valor3 > 90)?(valor3 -= 26) : ""
    (valor3 >= 91 && valor3 <= 96 ) ? valor3 += 26 :(valor3 >= 105 && valor3 <= 110) ? valor3 += 1  :  (valor3 == 235) ? valor3 = 105 : ""
    print ((char)valor3)
}
end = System.currentTimeMillis()
print(end-start)
