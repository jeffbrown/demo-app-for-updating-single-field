package anotherdemo

class ActivityController {

    @Autowired ActivityService activityService

    def index() {
        respond activityService.findAll()
    }

    def updateState(Long id) {
        Activity activity = activityService.updateState('notified', id)

        flash.message = 'Updated'
        redirect action: 'index'
    }
}
