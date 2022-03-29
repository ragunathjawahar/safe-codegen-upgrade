package xyz.ragunath

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Author(
  val firstName: String,
  val lastName: String
)
