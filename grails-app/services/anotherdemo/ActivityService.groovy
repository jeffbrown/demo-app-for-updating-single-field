package anotherdemo

import grails.gorm.services.Service
import grails.gorm.services.Query

@Service(Activity)
interface ActivityService {

    List<Activity> findAll()

    @Query("UPDATE ${Activity activity} SET ${activity.state} = $state WHERE activity.id = $id")
    Activity updateState(String state, Long id)
}
