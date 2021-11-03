@file:Suppress("NAME_SHADOWING")
package com.zhuinden.livedatacombinetuplekt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.zhuinden.tupleskt.*

fun <T1, T2> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>): LiveData<Pair<T1, T2>?> = MediatorLiveData<Pair<T1, T2>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value

    if (v1 != null && v2 != null) {
        mediator.value = Pair(v1, v2)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value

        if (v1 != null && v2 != null) {
            mediator.value = Pair(v1, v2)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2

        if (v1 != null && v2 != null) {
            mediator.value = Pair(v1, v2)
        }
    }
}

fun <T1, T2, T3> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>): LiveData<Triple<T1, T2, T3>?> = MediatorLiveData<Triple<T1, T2, T3>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value

    if (v1 != null && v2 != null && v3 != null) {
        mediator.value = Triple(v1, v2, v3)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value

        if (v1 != null && v2 != null && v3 != null) {
            mediator.value = Triple(v1, v2, v3)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value

        if (v1 != null && v2 != null && v3 != null) {
            mediator.value = Triple(v1, v2, v3)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3

        if (v1 != null && v2 != null && v3 != null) {
            mediator.value = Triple(v1, v2, v3)
        }
    }
}

fun <T1, T2, T3, T4> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>): LiveData<Tuple4<T1, T2, T3, T4>?> = MediatorLiveData<Tuple4<T1, T2, T3, T4>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value

    if (v1 != null && v2 != null && v3 != null && v4 != null) {
        mediator.value = Tuple4(v1, v2, v3, v4)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value

        if (v1 != null && v2 != null && v3 != null && v4 != null) {
            mediator.value = Tuple4(v1, v2, v3, v4)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value

        if (v1 != null && v2 != null && v3 != null && v4 != null) {
            mediator.value = Tuple4(v1, v2, v3, v4)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value

        if (v1 != null && v2 != null && v3 != null && v4 != null) {
            mediator.value = Tuple4(v1, v2, v3, v4)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4

        if (v1 != null && v2 != null && v3 != null && v4 != null) {
            mediator.value = Tuple4(v1, v2, v3, v4)
        }
    }
}

fun <T1, T2, T3, T4, T5> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>): LiveData<Tuple5<T1, T2, T3, T4, T5>?> = MediatorLiveData<Tuple5<T1, T2, T3, T4, T5>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
        mediator.value = Tuple5(v1, v2, v3, v4, v5)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
            mediator.value = Tuple5(v1, v2, v3, v4, v5)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
            mediator.value = Tuple5(v1, v2, v3, v4, v5)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
            mediator.value = Tuple5(v1, v2, v3, v4, v5)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
            mediator.value = Tuple5(v1, v2, v3, v4, v5)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
            mediator.value = Tuple5(v1, v2, v3, v4, v5)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>): LiveData<Tuple6<T1, T2, T3, T4, T5, T6>?> = MediatorLiveData<Tuple6<T1, T2, T3, T4, T5, T6>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
        mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
            mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
            mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
            mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
            mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
            mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null) {
            mediator.value = Tuple6(v1, v2, v3, v4, v5, v6)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>): LiveData<Tuple7<T1, T2, T3, T4, T5, T6, T7>?> = MediatorLiveData<Tuple7<T1, T2, T3, T4, T5, T6, T7>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
        mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null) {
            mediator.value = Tuple7(v1, v2, v3, v4, v5, v6, v7)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>): LiveData<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>?> = MediatorLiveData<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    
    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
        mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
    }
    
    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null) {
            mediator.value = Tuple8(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>): LiveData<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?> = MediatorLiveData<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
        mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null) {
            mediator.value = Tuple9(v1, v2, v3, v4, v5, v6, v7, v8, v9)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>): LiveData<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>?> = MediatorLiveData<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
        mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
    }
    
    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null) {
            mediator.value = Tuple10(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>): LiveData<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>?> = MediatorLiveData<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value
    val v11 = f11.value
    
    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
        mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10
        val v11 = f11.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }

    mediator.addSource(f11) { t11: T11? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = t11

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null) {
            mediator.value = Tuple11(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>): LiveData<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>?> = MediatorLiveData<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value
    val v11 = f11.value
    val v12 = f12.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
        mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
    }
    
    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10
        val v11 = f11.value
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f11) { t11: T11? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = t11
        val v12 = f12.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }

    mediator.addSource(f12) { t12: T12? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = t12

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null) {
            mediator.value = Tuple12(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>): LiveData<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>?> = MediatorLiveData<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value
    val v11 = f11.value
    val v12 = f12.value
    val v13 = f13.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
        mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f11) { t11: T11? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = t11
        val v12 = f12.value
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f12) { t12: T12? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = t12
        val v13 = f13.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }

    mediator.addSource(f13) { t13: T13? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = t13

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null) {
            mediator.value = Tuple13(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>, f14: LiveData<T14>): LiveData<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>?> = MediatorLiveData<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value
    val v11 = f11.value
    val v12 = f12.value
    val v13 = f13.value
    val v14 = f14.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
        mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
    }
    
    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f11) { t11: T11? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = t11
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f12) { t12: T12? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = t12
        val v13 = f13.value
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f13) { t13: T13? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = t13
        val v14 = f14.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }

    mediator.addSource(f14) { t14: T14? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = t14

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null) {
            mediator.value = Tuple14(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>, f14: LiveData<T14>, f15: LiveData<T15>): LiveData<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>?> = MediatorLiveData<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value
    val v11 = f11.value
    val v12 = f12.value
    val v13 = f13.value
    val v14 = f14.value
    val v15 = f15.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
        mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
    }

    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f11) { t11: T11? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = t11
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f12) { t12: T12? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = t12
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f13) { t13: T13? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = t13
        val v14 = f14.value
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f14) { t14: T14? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = t14
        val v15 = f15.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }

    mediator.addSource(f15) { t15: T15? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = t15

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null) {
            mediator.value = Tuple15(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
        }
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> combineTupleSkipNull(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>, f14: LiveData<T14>, f15: LiveData<T15>, f16: LiveData<T16>): LiveData<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>?> = MediatorLiveData<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>?>().also { mediator ->
    val v1 = f1.value
    val v2 = f2.value
    val v3 = f3.value
    val v4 = f4.value
    val v5 = f5.value
    val v6 = f6.value
    val v7 = f7.value
    val v8 = f8.value
    val v9 = f9.value
    val v10 = f10.value
    val v11 = f11.value
    val v12 = f12.value
    val v13 = f13.value
    val v14 = f14.value
    val v15 = f15.value
    val v16 = f16.value

    if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
        mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
    }
    
    mediator.addSource(f1) { t1: T1? ->
        val v1 = t1
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f2) { t2: T2? ->
        val v1 = f1.value
        val v2 = t2
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f3) { t3: T3? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = t3
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f4) { t4: T4? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = t4
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f5) { t5: T5? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = t5
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f6) { t6: T6? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = t6
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f7) { t7: T7? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = t7
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f8) { t8: T8? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = t8
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f9) { t9: T9? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = t9
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f10) { t10: T10? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = t10
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f11) { t11: T11? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = t11
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f12) { t12: T12? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = t12
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f13) { t13: T13? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = t13
        val v14 = f14.value
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f14) { t14: T14? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = t14
        val v15 = f15.value
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f15) { t15: T15? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = t15
        val v16 = f16.value

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }

    mediator.addSource(f16) { t16: T16? ->
        val v1 = f1.value
        val v2 = f2.value
        val v3 = f3.value
        val v4 = f4.value
        val v5 = f5.value
        val v6 = f6.value
        val v7 = f7.value
        val v8 = f8.value
        val v9 = f9.value
        val v10 = f10.value
        val v11 = f11.value
        val v12 = f12.value
        val v13 = f13.value
        val v14 = f14.value
        val v15 = f15.value
        val v16 = t16

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null && v6 != null && v7 != null && v8 != null && v9 != null && v10 != null && v11 != null && v12 != null && v13 != null && v14 != null && v15 != null && v16 != null) {
            mediator.value = Tuple16(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
        }
    }
}