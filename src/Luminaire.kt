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
        this.ampoule1.etat()
        this.ampoule2.etat()
        this.ampoule3.etat()
        this.ampoule4.etat()

    }
}