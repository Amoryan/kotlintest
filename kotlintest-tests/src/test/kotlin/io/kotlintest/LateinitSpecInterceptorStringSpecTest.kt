package io.kotlintest

import io.kotlintest.specs.StringSpec

class LateinitSpecInterceptorStringSpecTest : StringSpec() {

  private lateinit var string: String

  override fun interceptSpec(process: () -> Unit) {
    string = "Hello"
    super.interceptSpec(process)
  }

  init {
    "Hello should equal to Hello" {
      string shouldBe "Hello"
    }
  }
}