import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

fun main() {
    val today = LocalDateTime.now()
    val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val todayFormatted = today.format(dateFormatter)

    println("Datetime now is: $todayFormatted")
}
