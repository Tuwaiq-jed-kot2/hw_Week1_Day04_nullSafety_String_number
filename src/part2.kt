fun main() {
    val oldSen = "The quick brown fox jumps over the lazy dog."
    print("Enter first index you want start to cut: ")
    val FIndex = Integer.valueOf(readLine())
    print("Enter last index you want start to cut: ")
    val LIndex = Integer.valueOf(readLine())
    val newSen :String = (oldSen.substring(FIndex, LIndex))
    print("you're new sentence is: $newSen")
}
