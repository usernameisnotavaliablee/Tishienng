package io.reactivex.observers;

import io.reactivex.observers.BaseTestConsumer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BaseTestConsumer<T, U extends io.reactivex.observers.BaseTestConsumer<T, U>> implements io.reactivex.disposables.Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected final java.util.concurrent.CountDownLatch done;
    protected final java.util.List<java.lang.Throwable> errors;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected java.lang.Thread lastThread;
    protected final java.util.List<T> values;

    public BaseTestConsumer() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.values = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.errors = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.done = r0
            return
    }

    public static java.lang.String valueAndClass(java.lang.Object r2) {
            if (r2 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = " (class: "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L24:
            java.lang.String r2 = "null"
            return r2
    }

    public final U assertComplete() {
            r5 = this;
            long r0 = r5.completions
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L25
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            return r5
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Multiple completions: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.AssertionError r0 = r5.fail(r0)
            throw r0
        L25:
            java.lang.String r0 = "Not completed"
            java.lang.AssertionError r0 = r5.fail(r0)
            throw r0
    }

    public final U assertEmpty() {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r0 = r0.assertNoValues()
            io.reactivex.observers.BaseTestConsumer r0 = r0.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r0 = r0.assertNotComplete()
            return r0
    }

    public final U assertError(io.reactivex.functions.Predicate<java.lang.Throwable> r4) {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.errors
            int r0 = r0.size()
            if (r0 == 0) goto L38
            java.util.List<java.lang.Throwable> r1 = r3.errors
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r4.test(r2)     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto Le
            r4 = 1
            if (r0 != r4) goto L24
            return r3
        L24:
            java.lang.String r4 = "Error present but other errors as well"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L2b:
            r4 = move-exception
            java.lang.RuntimeException r4 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r4)
            throw r4
        L31:
            java.lang.String r4 = "Error not present"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L38:
            java.lang.String r4 = "No errors"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
    }

    public final U assertError(java.lang.Class<? extends java.lang.Throwable> r1) {
            r0 = this;
            io.reactivex.functions.Predicate r1 = io.reactivex.internal.functions.Functions.isInstanceOf(r1)
            io.reactivex.observers.BaseTestConsumer r1 = r0.assertError(r1)
            return r1
    }

    public final U assertError(java.lang.Throwable r1) {
            r0 = this;
            io.reactivex.functions.Predicate r1 = io.reactivex.internal.functions.Functions.equalsWith(r1)
            io.reactivex.observers.BaseTestConsumer r1 = r0.assertError(r1)
            return r1
    }

    public final U assertErrorMessage(java.lang.String r4) {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.errors
            int r0 = r0.size()
            if (r0 == 0) goto L44
            r1 = 1
            if (r0 != r1) goto L3d
            java.util.List<java.lang.Throwable> r0 = r3.errors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = r0.getMessage()
            boolean r1 = io.reactivex.internal.functions.ObjectHelper.equals(r4, r0)
            if (r1 == 0) goto L1f
            return r3
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error message differs; Expected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Actual: "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L3d:
            java.lang.String r4 = "Multiple errors"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L44:
            java.lang.String r4 = "No errors"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
    }

    public final U assertFailure(io.reactivex.functions.Predicate<java.lang.Throwable> r2, T... r3) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r3 = r0.assertValues(r3)
            io.reactivex.observers.BaseTestConsumer r2 = r3.assertError(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertFailure(java.lang.Class<? extends java.lang.Throwable> r2, T... r3) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r3 = r0.assertValues(r3)
            io.reactivex.observers.BaseTestConsumer r2 = r3.assertError(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertFailureAndMessage(java.lang.Class<? extends java.lang.Throwable> r2, java.lang.String r3, T... r4) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r4 = r0.assertValues(r4)
            io.reactivex.observers.BaseTestConsumer r2 = r4.assertError(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertErrorMessage(r3)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertNoErrors() {
            r2 = this;
            java.util.List<java.lang.Throwable> r0 = r2.errors
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return r2
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error(s) present: "
            r0.append(r1)
            java.util.List<java.lang.Throwable> r1 = r2.errors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r2.fail(r0)
            throw r0
    }

    public final U assertNoValues() {
            r1 = this;
            r0 = 0
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertValueCount(r0)
            return r0
    }

    public final U assertNotComplete() {
            r5 = this;
            long r0 = r5.completions
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            if (r4 > 0) goto Lb
            return r5
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Multiple completions: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.AssertionError r0 = r5.fail(r0)
            throw r0
        L21:
            java.lang.String r0 = "Completed!"
            java.lang.AssertionError r0 = r5.fail(r0)
            throw r0
    }

    public abstract U assertNotSubscribed();

    public final U assertNotTerminated() {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = r5.done
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            return r5
        Ld:
            java.lang.String r0 = "Subscriber terminated!"
            java.lang.AssertionError r0 = r5.fail(r0)
            throw r0
    }

    public final U assertResult(T... r2) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r2 = r0.assertValues(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertComplete()
            return r2
    }

    public abstract U assertSubscribed();

    public final U assertTerminated() {
            r7 = this;
            java.util.concurrent.CountDownLatch r0 = r7.done
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L67
            long r0 = r7.completions
            r4 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L51
            java.util.List<java.lang.Throwable> r4 = r7.errors
            int r4 = r4.size()
            r5 = 1
            if (r4 > r5) goto L3b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L24
            goto L3a
        L24:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Terminated with multiple completions and errors: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.AssertionError r0 = r7.fail(r0)
            throw r0
        L3a:
            return r7
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Terminated with multiple errors: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r7.fail(r0)
            throw r0
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Terminated with multiple completions: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.AssertionError r0 = r7.fail(r0)
            throw r0
        L67:
            java.lang.String r0 = "Subscriber still running!"
            java.lang.AssertionError r0 = r7.fail(r0)
            throw r0
    }

    public final U assertValue(io.reactivex.functions.Predicate<T> r2) {
            r1 = this;
            r0 = 0
            r1.assertValueAt(r0, r2)
            java.util.List<T> r2 = r1.values
            int r2 = r2.size()
            r0 = 1
            if (r2 > r0) goto Le
            return r1
        Le:
            java.lang.String r2 = "Value present but other values as well"
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
    }

    public final U assertValue(T r5) {
            r4 = this;
            java.util.List<T> r0 = r4.values
            int r0 = r0.size()
            r1 = 1
            java.lang.String r2 = ", Actual: "
            java.lang.String r3 = "Expected: "
            if (r0 != r1) goto L3d
            java.util.List<T> r0 = r4.values
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = io.reactivex.internal.functions.ObjectHelper.equals(r5, r0)
            if (r1 == 0) goto L1b
            return r4
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r5 = valueAndClass(r5)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = valueAndClass(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r5 = valueAndClass(r5)
            r0.append(r5)
            r0.append(r2)
            java.util.List<T> r5 = r4.values
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
    }

    public final U assertValueAt(int r2, io.reactivex.functions.Predicate<T> r3) {
            r1 = this;
            java.util.List<T> r0 = r1.values
            int r0 = r0.size()
            if (r0 == 0) goto L40
            java.util.List<T> r0 = r1.values
            int r0 = r0.size()
            if (r2 >= r0) goto L2a
            java.util.List<T> r0 = r1.values     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L24
            boolean r2 = r3.test(r2)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r2 = "Value not present"
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
        L24:
            r2 = move-exception
            java.lang.RuntimeException r2 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r2)
            throw r2
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Invalid index: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
        L40:
            java.lang.String r2 = "No values"
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
    }

    public final U assertValueCount(int r4) {
            r3 = this;
            java.util.List<T> r0 = r3.values
            int r0 = r0.size()
            if (r0 != r4) goto L9
            return r3
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value counts differ; Expected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Actual: "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
    }

    public final U assertValueSequence(java.lang.Iterable<? extends T> r6) {
            r5 = this;
            java.util.List<T> r0 = r5.values
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        Lb:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r2 == 0) goto L57
            if (r3 != 0) goto L18
            goto L57
        L18:
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = io.reactivex.internal.functions.ObjectHelper.equals(r3, r2)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Values at position "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = " differ; Expected: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            r6.append(r0)
            java.lang.String r0 = ", Actual: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L57:
            java.lang.String r6 = ")"
            if (r2 != 0) goto L77
            if (r3 != 0) goto L5e
            return r5
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Fever values received than expected ("
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "More values received than expected ("
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
    }

    public final U assertValueSet(java.util.Collection<? extends T> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            r3.assertNoValues()
            return r3
        La:
            java.util.List<T> r0 = r3.values
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            boolean r2 = r4.contains(r1)
            if (r2 == 0) goto L21
            goto L10
        L21:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Value not in the expected collection: "
            r4.append(r0)
            java.lang.String r0 = valueAndClass(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L3b:
            return r3
    }

    public final U assertValues(T... r7) {
            r6 = this;
            java.util.List<T> r0 = r6.values
            int r0 = r0.size()
            int r1 = r7.length
            java.lang.String r2 = ", Actual: "
            if (r0 != r1) goto L4c
            r1 = 0
        Lc:
            if (r1 >= r0) goto L4b
            java.util.List<T> r3 = r6.values
            java.lang.Object r3 = r3.get(r1)
            r4 = r7[r1]
            boolean r5 = io.reactivex.internal.functions.ObjectHelper.equals(r4, r3)
            if (r5 == 0) goto L1f
            int r1 = r1 + 1
            goto Lc
        L1f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Values at position "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = " differ; Expected: "
            r7.append(r0)
            java.lang.String r0 = valueAndClass(r4)
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = valueAndClass(r3)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.AssertionError r7 = r6.fail(r7)
            throw r7
        L4b:
            return r6
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Value count differs; Expected: "
            r1.append(r3)
            int r3 = r7.length
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r1.append(r7)
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.util.List<T> r7 = r6.values
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.AssertionError r7 = r6.fail(r7)
            throw r7
    }

    public final U await() throws java.lang.InterruptedException {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = r5.done
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            return r5
        Ld:
            java.util.concurrent.CountDownLatch r0 = r5.done
            r0.await()
            return r5
    }

    public final boolean await(long r6, java.util.concurrent.TimeUnit r8) throws java.lang.InterruptedException {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = r5.done
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            java.util.concurrent.CountDownLatch r0 = r5.done
            boolean r6 = r0.await(r6, r8)
            if (r6 == 0) goto L15
            goto L17
        L15:
            r6 = 0
            return r6
        L17:
            r6 = 1
            return r6
    }

    public final U awaitDone(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.done     // Catch: java.lang.InterruptedException -> Lc
            boolean r2 = r0.await(r2, r4)     // Catch: java.lang.InterruptedException -> Lc
            if (r2 != 0) goto Le
            r1.dispose()     // Catch: java.lang.InterruptedException -> Lc
            return r1
        Lc:
            r2 = move-exception
            goto Lf
        Le:
            return r1
        Lf:
            r1.dispose()
            java.lang.RuntimeException r2 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r2)
            throw r2
    }

    public final boolean awaitTerminalEvent() {
            r1 = this;
            r1.await()     // Catch: java.lang.InterruptedException -> L5
            r0 = 1
            return r0
        L5:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r0 = 0
            return r0
    }

    public final boolean awaitTerminalEvent(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            boolean r1 = r0.await(r1, r3)     // Catch: java.lang.InterruptedException -> L5
            return r1
        L5:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
    }

    public final long completions() {
            r2 = this;
            long r0 = r2.completions
            return r0
    }

    public final int errorCount() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.errors
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<java.lang.Throwable> errors() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.errors
            return r0
    }

    protected final java.lang.AssertionError fail(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 64
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " ("
            r0.append(r4)
            java.lang.String r4 = "latch = "
            r0.append(r4)
            java.util.concurrent.CountDownLatch r4 = r3.done
            long r1 = r4.getCount()
            r0.append(r1)
            java.lang.String r4 = ", "
            r0.append(r4)
            java.lang.String r1 = "values = "
            r0.append(r1)
            java.util.List<T> r1 = r3.values
            int r1 = r1.size()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "errors = "
            r0.append(r1)
            java.util.List<java.lang.Throwable> r1 = r3.errors
            int r1 = r1.size()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "completions = "
            r0.append(r4)
            long r1 = r3.completions
            r0.append(r1)
            r4 = 41
            r0.append(r4)
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            java.util.List<java.lang.Throwable> r0 = r3.errors
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L88
            java.util.List<java.lang.Throwable> r0 = r3.errors
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L7e
            java.util.List<java.lang.Throwable> r0 = r3.errors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r4.initCause(r0)
            return r4
        L7e:
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            java.util.List<java.lang.Throwable> r1 = r3.errors
            r0.<init>(r1)
            r4.initCause(r0)
        L88:
            return r4
    }

    public final java.util.List<java.util.List<java.lang.Object>> getEvents() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r7.values()
            r0.add(r1)
            java.util.List r1 = r7.errors()
            r0.add(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L1a:
            long r4 = r7.completions
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L2b
            io.reactivex.Notification r4 = io.reactivex.Notification.createOnComplete()
            r1.add(r4)
            r4 = 1
            long r2 = r2 + r4
            goto L1a
        L2b:
            r0.add(r1)
            return r0
    }

    public final boolean isTerminated() {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = r5.done
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final java.lang.Thread lastThread() {
            r1 = this;
            java.lang.Thread r0 = r1.lastThread
            return r0
    }

    public final int valueCount() {
            r1 = this;
            java.util.List<T> r0 = r1.values
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<T> values() {
            r1 = this;
            java.util.List<T> r0 = r1.values
            return r0
    }
}
