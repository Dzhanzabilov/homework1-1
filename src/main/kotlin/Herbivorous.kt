class Herbivorous(name: String, val food: String = "vegetables") : Animals(name){
    override fun toString(): String {
        return "Herbivorous(name='$name',food='$food')"
    }
}
