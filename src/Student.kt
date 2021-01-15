data class Student(val name: String, val observable: Teacher) : Observer {

    override fun update() {
        println("Hola $name the professor ${observable.name} has uploaded a new homework ${observable.getLastedHomework()?.title}")
    }
}