import org.koin.core.context.startKoin

fun main(args: Array<String>) {
    startKoin() {
        printLogger()
        modules(helloModule)
    }

    HelloApplication().sayHello()
}