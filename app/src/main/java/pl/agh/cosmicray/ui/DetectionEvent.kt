package pl.agh.cosmicray.ui

data class DetectionEvent(
    val timestamp: Long,
    val maxPixelValue: Int,
    val type: DetectionType // SPOT / TRACK / WORM
)
enum class DetectionType { SPOT, TRACK, WORM }