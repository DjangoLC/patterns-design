class Student(val name: String, vararg val observable: Teacher) : Observer {

    override fun update() {
        observable.forEach { obs ->
            println("Hola $name the professor ${obs.name} has uploaded a new homework ${obs.getLastedHomework()?.title}")
        }
    }
}