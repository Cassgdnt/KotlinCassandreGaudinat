fun main() {
    print("Choisissez un chiffre: ")

    val question = readLine()!!
    println("Le chiffre gagnant est $question")

    var reponse = ""

    while(reponse != question) {
        print("Vous pensez que le chiffre est: ")

        reponse = readLine()!!

        when {
            (question.equals(reponse)) -> System.out.println("Vous avez gagnez!");
            else -> println("Faux! Ce n'est pas le chiffre $reponse");
        }

        if(reponse < question){
            println("C'est plus ")
        }
        else if(reponse > question){
            println("C'est moins ")
        }
        else{
            println("C'est le bon chiffre")
        }

    }
}