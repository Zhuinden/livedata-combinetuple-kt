package com.zhuinden.livedatacombinetuplekt

import androidx.lifecycle.MutableLiveData

internal fun <T: Any?> MutableLiveData<T>.setValueIfNotEqual(arg: T) {
    @Suppress("SuspiciousEqualsCombination")
    fun objectsEquals(a: T?, b: T?): Boolean {
        return (a === b) || (a != null && a == b)
    }

    val value = value
    if (!objectsEquals(value, arg)) {
        this.value = arg
    }
}