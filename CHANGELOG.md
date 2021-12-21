# Change log

-LiveData-CombineTuple-KT 2.0.0 (2021-12-21)
--------------------------------

- BEHAVIOR CHANGE: `Objects.equals()` is applied before setting the value on the Mediator.

Refer to https://github.com/android/architecture-components-samples/blob/ea59732402708c8e7bca3ecc24a7c9ca85736b55/GithubBrowserSample/app/src/main/java/com/android/example/github/repository/NetworkBoundResource.java#L60-L65

- FIX: `onActive()` would call `setValue` which would trigger `observe()` as many times as there were LiveDatas.

I think this was reported, but someone truly pointed out the cause not too long ago, unfortunately.

-LiveData-CombineTuple-KT 1.3.0 (2021-11-03)
--------------------------------
- Add `combineTupleSkipNull`, which is probably what people always really wanted (has `null` until all values of all LiveData are not null).

-LiveData-CombineTuple-KT 1.2.1 (2021-02-10)
--------------------------------

- Update Kotlin to 1.4.30.

- Update tuples-kt to 1.1.0.

-LiveData-CombineTuple-KT 1.2.0 (2020-12-19)
--------------------------------

- Update Kotlin to 1.4.21.

- Update tuples-kt to 1.1.0.

-LiveData-CombineTuple-KT 1.1.0 (2020-10-04)
--------------------------------

- Add `combineTupleNonNull`, which only allows LiveData with non-null values, but provides non-null decomposition.

-LiveData-CombineTuple-KT 1.0.0 (2020-03-31)
--------------------------------

- Initial Release.