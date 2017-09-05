import org.musyozoku.vuekt.ComponentOptions
import org.musyozoku.vuekt.ObjectOrFactory
import org.musyozoku.vuekt.Vue
import org.musyozoku.vuekt.json

@JsModule("vue")
@JsNonModule
@JsName("Vue")
external class Example1Vue(options: ComponentOptions<Example1Vue>) : Vue {
    var message: String
    var checkedNames: Array<String>
}

val example1 = Example1Vue(json {
    el = "#example-1"
    data = ObjectOrFactory(json<Example1Vue> {
        message = ""
        checkedNames = emptyArray()
    })
})

@JsModule("vue")
@JsNonModule
@JsName("Vue")
external class Example2Vue(options: ComponentOptions<Example2Vue>) : Vue {
    var selected: String
    var options: Array<OptionItem>
}

class OptionItem(val text: String, val value: String)

val example2 = Example2Vue(json {
    el = "#example-2"
    data = ObjectOrFactory(json<Example2Vue> {
        selected = "A"
        options = arrayOf(
                OptionItem("One", "A"),
                OptionItem("Two", "B"),
                OptionItem("Three", "C")
        )
    })
})