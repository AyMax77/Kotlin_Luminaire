class Luminaire : Eclairage {
    val ampoule1 = AmpouleIncandescente()
    val ampoule2 = AmpouleIncandescente()
    val ampoule3 = AmpouleIncandescente()
    val ampoule4 = AmpouleIncandescente()
    constructor()
    override fun allumer() {
        this.ampoule1.allumer()
        this.ampoule2.allumer()
        this.ampoule3.allumer()
        this.ampoule4.allumer()

    }
    override fun eteindre() {
        this.ampoule1.eteindre()
        this.ampoule2.eteindre()
        this.ampoule3.eteindre()
        this.ampoule4.eteindre()
    }
    override fun intensifier() {
        this.ampoule1.intensifier()
        this.ampoule2.intensifier()
        this.ampoule3.intensifier()
        this.ampoule4.intensifier()
    }
    override fun diminuer() {
        this.ampoule1.diminuer()
        this.ampoule2.diminuer()
        this.ampoule3.diminuer()
        this.ampoule4.diminuer()
    }
    override fun etat(): Int {
        var etat = 0
        if (ampoule1.etat == -1 && ampoule2.etat == -1 && ampoule3.etat == -1 && ampoule4.etat == -1){
            return -1
        }  else {
            return etat
        }
    }

    override fun toString(): String {
        return "Etat: ampoule1 :${ampoule1.etat} , ampoule 2 :${ampoule2.etat}, ampoule 3 :${ampoule3.etat}, ampoule 4 :${ampoule4.etat}"
    }
}