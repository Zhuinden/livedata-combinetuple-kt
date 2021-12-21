/*
 * Copyright 2020 Gabor Varadi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhuinden.livedatacombinetuplekt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.zhuinden.tupleskt.*

fun <T1, T2> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>): LiveData<Pair<T1?, T2?>> = MediatorLiveData<Pair<T1?, T2?>>().also { mediator ->
    mediator.setValueIfNotEqual(Pair(f1.value, f2.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2) = mediator.value!!
        mediator.setValueIfNotEqual(Pair(t1, t2))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _) = mediator.value!!
        mediator.setValueIfNotEqual(Pair(t1, t2))
    }
}

fun <T1, T2, T3> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>): LiveData<Triple<T1?, T2?, T3?>> = MediatorLiveData<Triple<T1?, T2?, T3?>>().also { mediator ->
    mediator.setValueIfNotEqual(Triple(f1.value, f2.value, f3.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3) = mediator.value!!
        mediator.setValueIfNotEqual(Triple(t1, t2, t3))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3) = mediator.value!!
        mediator.setValueIfNotEqual(Triple(t1, t2, t3))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _) = mediator.value!!
        mediator.setValueIfNotEqual(Triple(t1, t2, t3))
    }
}

fun <T1, T2, T3, T4> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>): LiveData<Tuple4<T1?, T2?, T3?, T4?>> = MediatorLiveData<Tuple4<T1?, T2?, T3?, T4?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple4(f1.value, f2.value, f3.value, f4.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple4(t1, t2, t3, t4))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple4(t1, t2, t3, t4))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple4(t1, t2, t3, t4))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple4(t1, t2, t3, t4))
    }
}

fun <T1, T2, T3, T4, T5> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>): LiveData<Tuple5<T1?, T2?, T3?, T4?, T5?>> = MediatorLiveData<Tuple5<T1?, T2?, T3?, T4?, T5?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple5(f1.value, f2.value, f3.value, f4.value, f5.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple5(t1, t2, t3, t4, t5))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple5(t1, t2, t3, t4, t5))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple5(t1, t2, t3, t4, t5))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple5(t1, t2, t3, t4, t5))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple5(t1, t2, t3, t4, t5))
    }
}

fun <T1, T2, T3, T4, T5, T6> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>): LiveData<Tuple6<T1?, T2?, T3?, T4?, T5?, T6?>> = MediatorLiveData<Tuple6<T1?, T2?, T3?, T4?, T5?, T6?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple6(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple6(t1, t2, t3, t4, t5, t6))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple6(t1, t2, t3, t4, t5, t6))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple6(t1, t2, t3, t4, t5, t6))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple6(t1, t2, t3, t4, t5, t6))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple6(t1, t2, t3, t4, t5, t6))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple6(t1, t2, t3, t4, t5, t6))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>): LiveData<Tuple7<T1?, T2?, T3?, T4?, T5?, T6?, T7?>> = MediatorLiveData<Tuple7<T1?, T2?, T3?, T4?, T5?, T6?, T7?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple7(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple7(t1, t2, t3, t4, t5, t6, t7))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>): LiveData<Tuple8<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?>> = MediatorLiveData<Tuple8<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple8(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple8(t1, t2, t3, t4, t5, t6, t7, t8))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>): LiveData<Tuple9<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?>> = MediatorLiveData<Tuple9<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple9(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>): LiveData<Tuple10<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?>> = MediatorLiveData<Tuple10<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple10(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>): LiveData<Tuple11<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?>> = MediatorLiveData<Tuple11<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple11(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _, t11) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }

    mediator.addSource(f11) { t11: T11? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>): LiveData<Tuple12<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?>> = MediatorLiveData<Tuple12<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple12(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _, t11, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f11) { t11: T11? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, _, t12) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }

    mediator.addSource(f12) { t12: T12? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>): LiveData<Tuple13<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?>> = MediatorLiveData<Tuple13<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple13(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _, t11, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f11) { t11: T11? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, _, t12, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f12) { t12: T12? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, _, t13) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }

    mediator.addSource(f13) { t13: T13? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>, f14: LiveData<T14>): LiveData<Tuple14<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?, T14?>> = MediatorLiveData<Tuple14<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?, T14?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple14(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _, t11, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f11) { t11: T11? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, _, t12, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f12) { t12: T12? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, _, t13, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f13) { t13: T13? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, _, t14) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }

    mediator.addSource(f14) { t14: T14? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>, f14: LiveData<T14>, f15: LiveData<T15>): LiveData<Tuple15<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?, T14?, T15?>> = MediatorLiveData<Tuple15<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?, T14?, T15?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple15(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _, t11, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f11) { t11: T11? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, _, t12, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f12) { t12: T12? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, _, t13, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f13) { t13: T13? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, _, t14, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f14) { t14: T14? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, _, t15) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }

    mediator.addSource(f15) { t15: T15? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> combineTuple(f1: LiveData<T1>, f2: LiveData<T2>, f3: LiveData<T3>, f4: LiveData<T4>, f5: LiveData<T5>, f6: LiveData<T6>, f7: LiveData<T7>, f8: LiveData<T8>, f9: LiveData<T9>, f10: LiveData<T10>, f11: LiveData<T11>, f12: LiveData<T12>, f13: LiveData<T13>, f14: LiveData<T14>, f15: LiveData<T15>, f16: LiveData<T16>): LiveData<Tuple16<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?, T14?, T15?, T16?>> = MediatorLiveData<Tuple16<T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?, T9?, T10?, T11?, T12?, T13?, T14?, T15?, T16?>>().also { mediator ->
    mediator.setValueIfNotEqual(Tuple16(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value))

    mediator.addSource(f1) { t1: T1? ->
        val (_, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f2) { t2: T2? ->
        val (t1, _, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f3) { t3: T3? ->
        val (t1, t2, _, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f4) { t4: T4? ->
        val (t1, t2, t3, _, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f5) { t5: T5? ->
        val (t1, t2, t3, t4, _, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f6) { t6: T6? ->
        val (t1, t2, t3, t4, t5, _, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f7) { t7: T7? ->
        val (t1, t2, t3, t4, t5, t6, _, t8, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f8) { t8: T8? ->
        val (t1, t2, t3, t4, t5, t6, t7, _, t9, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f9) { t9: T9? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, _, t10, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f10) { t10: T10? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, _, t11, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f11) { t11: T11? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, _, t12, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f12) { t12: T12? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, _, t13, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f13) { t13: T13? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, _, t14, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f14) { t14: T14? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, _, t15, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f15) { t15: T15? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, _, t16) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }

    mediator.addSource(f16) { t16: T16? ->
        val (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, _) = mediator.value!!
        mediator.setValueIfNotEqual(Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
    }
}