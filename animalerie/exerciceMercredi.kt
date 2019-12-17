fun main(args: Array<String>){
    val Animalerie = Animalerie()
    Animalerie.add(Chien())
    Animalerie.add(Chat())
    Animalerie.add(Perroquet())
    Animalerie.add(Ane())
    Animalerie.add(Vache())
    Animalerie.afficheQuiSuisJePourTousLesAnimeaux()
}

interface Animal{
    fun parler()
    fun quiSuisJe()
}

class Chien : Animal{
    override fun parler() {
        println("wouaf wouaf")
    }

    override fun quiSuisJe() {
        println("Je suis un chien")
    }
}

class Chat : Animal{
    override fun parler() {
        println("miaou miaou")
    }

    override fun quiSuisJe() {
        println("Je suis un chat")
    }
}

class Perroquet : Animal{
    override fun parler() {
        println("coac coac")
    }

    override fun quiSuisJe() {
        println("Je suis un perroquet")
    }
}

class Ane : Animal{
    override fun parler() {
        println("hi-han hi-han")
    }

    override fun quiSuisJe() {
        println("Je suis un âne")
    }
}

class Vache : Animal{
    override fun parler() {
        println("meuh")
    }

    override fun quiSuisJe() {
        println("Je suis une vache")
    }
}

class Animalerie{
    var nbrAnimal = mutableListOf<Animal>()
    fun add(animal: Animal){
        nbrAnimal.add(animal)
    }
    fun afficheQuiSuisJePourTousLesAnimeaux(){
        for(chacun in nbrAnimal){
            chacun.quiSuisJe()
        }
    }
}