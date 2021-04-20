import org.koin.dsl.module

data class HelloMessageData(val message : String = "Hello Koin!")
val helloModule = module {
    single { HelloMessageData() }
    single { HelloServiceImpl(get()) as HelloService }
}