class WorkoutPlan(
    var planName: String,
    var weeks: Int,
    var workoutDays: Map<String, List<Workout>>
) {
    // Add or modify workouts
    fun addWorkout(day: String, workout: Workout) {
        workoutDays[day]?.add(workout)
    }

    fun getWorkout(day: String): List<Workout>? {
        return workoutDays[day]
    }
}
