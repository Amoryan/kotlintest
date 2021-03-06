package io.kotlintest.extensions

import io.kotlintest.AbstractProjectConfig

/**
 * Reusable extension to be registered with [AbstractProjectConfig.extensions].
 */
interface ProjectExtension : Extension {

  /**
   * Executed before the first test of the project and before [AbstractProjectConfig.beforeAll].
   */
  fun beforeAll() {}

  /**
   * Executed after the last test of the project and after [AbstractProjectConfig.afterAll]
   */
  fun afterAll() {}
}