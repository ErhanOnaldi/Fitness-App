class User(
    var username: String,
    private var password: String,
    var age: Int = 0,
    var weight: Double = 0.0,
    var gender: String = "",
    var trainingExperience: String = "Beginner",
    var bodyFatPercentage: Double? = null,
    var bodyMeasurements: Map<String, Double> = emptyMap(),
    var currentWorkoutPlan: WorkoutPlan? = null
) {
    // Password validation and management
    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }

    // Update profile details
    fun updateProfile(age: Int, weight: Double, gender: String, trainingExperience: String) {
        this.age = age
        this.weight = weight
        this.gender = gender
        this.trainingExperience = trainingExperience
    }
}
