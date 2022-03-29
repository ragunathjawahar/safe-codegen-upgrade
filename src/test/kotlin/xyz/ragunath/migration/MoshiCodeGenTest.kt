package xyz.ragunath.migration

import java.io.File
import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

class MoshiCodeGenTest {
  @Test
  internal fun `generated adapter`() {
    // given
    val bookJsonAdapter = File("build/generated/source/kapt/main/xyz/ragunath/BookJsonAdapter.kt").absoluteFile

    // when & then
    Approvals.verify(bookJsonAdapter.readText())
  }
}
