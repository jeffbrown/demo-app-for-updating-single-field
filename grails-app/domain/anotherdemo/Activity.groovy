package anotherdemo

class Activity {

    String name
    String state = 'created'

    static constraints = {
        name blank: false
        state inList: ['created', 'notified', 'approved'], maxSize: 100
    }
}
