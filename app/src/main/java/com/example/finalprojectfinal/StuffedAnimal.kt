package com.example.finalprojectfinal

data class StuffedAnimal(
    var animalType: String,
    val name: String,
    val birthdate: String
) {


//lateinit var animalType:String
//animalType = animalType

    fun returnImageResourceId(): Int {
    if (animalType.equals("Cat")) return R.drawable.cat
    else if (animalType.equals("Dog")) return R.drawable.dog
    else if (animalType.equals("Dragon")) return R.drawable.dragon
    else if (animalType.equals("Horse")) return R.drawable.horse
    else if (animalType.equals("Penguin")) return R.drawable.penguin
    else if (animalType.equals("Bear")) return R.drawable.bear
    else if (animalType.equals("Other")) return R.drawable.other
    else return R.drawable.other
    }

//val imageResourceId:Int
//    get() {
//        if (animalType.equals("Cat")) R.drawable.cat
//        else if (animalType.equals("Dog")) R.drawable.dog
//        else if (animalType.equals("Dragon")) R.drawable.dragon
//        else if (animalType.equals("Horse")) R.drawable.horse
//        else if (animalType.equals("Penguin")) R.drawable.penguin
//        else if (animalType.equals("Bear")) R.drawable.bear
//        else if (animalType.equals("Other")) R.drawable.other
//        else R.drawable.other
//    }
}
