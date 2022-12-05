fun main(args: Array<String>) {
    //init
    val list = mutableListOf<Animals>()
    //
    val tiger = Predator(name = "tiger")
    list.add(tiger)

    val volf = Predator("volf")
    list.add(volf)

    val cow = Herbivorous("cow")
    list.add(cow)

    val sheep = Herbivorous("sheep")
    list.add(sheep)

    println(list)
  }