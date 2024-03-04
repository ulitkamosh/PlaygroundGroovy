class MainGroovy {

  static void main(String[] args) {

    def list = [1, 3, 4, 5, 1, 5, 4]
    def counts = countElements(list)
    println counts

  }

  static def countElements(list) {
    def counts = [:]
    list.each { element ->
      counts[element] = counts.getOrDefault(element, 0) + 1
    }
    return counts
  }
}