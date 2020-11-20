import com.pi4j.io.gpio.RaspiPin.GPIO_01
import mhashim6.pi4k.digitalOutput

fun main(args: Array<String>) {
    digitalOutput(GPIO_01).pulse(1000)
}