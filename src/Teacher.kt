class Teacher(val name: String) : Observable {

    private val observables = mutableListOf<Observer>()
    private val homeWorksList = mutableListOf<HomeWork>()
    private var lastedHomeWork: HomeWork? = null

    fun postNewHomeWork(homeWork: HomeWork) {
        this.lastedHomeWork = homeWork
        this.homeWorksList.add(homeWork)

        notifyObservers()
    }

    fun getLastedHomework() = lastedHomeWork

    fun getHomeWorkList() = homeWorksList

    override fun attach(observer: Observer) {
        observables.add(observer)
    }

    override fun detach(observer: Observer) {
        observables.remove(observer)
    }

    override fun notifyObservers() {
        observables.forEach {
            it.update()
        }
    }

}

class HomeWork(val title: String)