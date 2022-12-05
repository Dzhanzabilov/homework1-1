class Predator (name: String, val food: String ="meat") : Animals(name){
    override fun toString(): String {
        return "Predator(name='$name',food='$food')"
    }
}
