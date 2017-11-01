package anotherdemo

class BootStrap {

    def init = { servletContext ->
        new Activity(name: 'Activity1').save(failOnError: true)
        new Activity(name: 'Activity2').save(failOnError: true)
        new Activity(name: 'Activity3').save(failOnError: true)
        new Activity(name: 'Activity4').save(failOnError: true)
        new Activity(name: 'Activity5').save(failOnError: true)
        new Activity(name: 'Activity6').save(failOnError: true)
    }
    def destroy = {
    }
}
