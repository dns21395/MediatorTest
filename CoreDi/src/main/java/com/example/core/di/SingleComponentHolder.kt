package com.example.core.di

class SingleComponentHolder<T, R>(private val producer: (T) -> R) {

    @Volatile
    var component: R? = null
        private set

    fun initAndGet(provider: () -> T): R {
        return component ?: synchronized(this) {
            component ?: producer(provider()).apply {
                component = this
            }
        }
    }

    @Synchronized
    fun recycle() {
        component = null
    }
}