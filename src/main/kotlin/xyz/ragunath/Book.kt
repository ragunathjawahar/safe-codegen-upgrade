package xyz.ragunath

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Book(
  val title: String,
  val author: Author
)
