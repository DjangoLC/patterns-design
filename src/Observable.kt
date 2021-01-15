interface Observable {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyObservers()
}
