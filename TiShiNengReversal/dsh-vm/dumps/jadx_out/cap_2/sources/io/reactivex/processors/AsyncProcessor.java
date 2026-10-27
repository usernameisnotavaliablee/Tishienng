package io.reactivex.processors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AsyncProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.AsyncProcessor.AsyncSubscription[] EMPTY = null;
    static final io.reactivex.processors.AsyncProcessor.AsyncSubscription[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor.AsyncSubscription<T>[]> subscribers;
    T value;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class AsyncSubscription<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final io.reactivex.processors.AsyncProcessor<T> parent;

        AsyncSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.AsyncProcessor<T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.parent = r2
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription
        public void cancel() {
                r1 = this;
                boolean r0 = super.tryCancel()
                if (r0 == 0) goto Lb
                io.reactivex.processors.AsyncProcessor<T> r0 = r1.parent
                r0.remove(r1)
            Lb:
                return
        }

        void onComplete() {
                r1 = this;
                boolean r0 = r1.isCancelled()
                if (r0 != 0) goto Lb
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lb:
                return
        }

        void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            La:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }
    }

    static {
            r0 = 0
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[r0]
            io.reactivex.processors.AsyncProcessor.EMPTY = r1
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r0 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[r0]
            io.reactivex.processors.AsyncProcessor.TERMINATED = r0
            return
    }

    AsyncProcessor() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.EMPTY
            r0.<init>(r1)
            r2.subscribers = r0
            return
    }

    public static <T> io.reactivex.processors.AsyncProcessor<T> create() {
            io.reactivex.processors.AsyncProcessor r0 = new io.reactivex.processors.AsyncProcessor
            r0.<init>()
            return r0
    }

    boolean add(io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r0 = (io.reactivex.processors.AsyncProcessor.AsyncSubscription[]) r0
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r3 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r1 = r4.subscribers
            boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto Ld
            java.lang.Throwable r0 = r2.error
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public T getValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto Ld
            T r0 = r2.value
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public java.lang.Object[] getValues() {
            r3 = this;
            java.lang.Object r0 = r3.getValue()
            r1 = 0
            if (r0 == 0) goto Ld
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            return r2
        Ld:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            return r0
    }

    public T[] getValues(T[] r6) {
            r5 = this;
            java.lang.Object r0 = r5.getValue()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Le
            int r0 = r6.length
            if (r0 == 0) goto Ld
            r6[r2] = r1
        Ld:
            return r6
        Le:
            int r3 = r6.length
            r4 = 1
            if (r3 != 0) goto L16
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r4)
        L16:
            r6[r2] = r0
            int r0 = r6.length
            if (r0 == r4) goto L1d
            r6[r4] = r1
        L1d:
            return r6
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto L10
            java.lang.Throwable r0 = r2.error
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r0 = (io.reactivex.processors.AsyncProcessor.AsyncSubscription[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto L10
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean hasValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto L10
            T r0 = r2.value
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    void nullOnNext() {
            r5 = this;
            r0 = 0
            r5.value = r0
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r0.<init>(r1)
            r5.error = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r1 = r5.subscribers
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r2 = io.reactivex.processors.AsyncProcessor.TERMINATED
            java.lang.Object r1 = r1.getAndSet(r2)
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = (io.reactivex.processors.AsyncProcessor.AsyncSubscription[]) r1
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L22
            r4 = r1[r3]
            r4.onError(r0)
            int r3 = r3 + 1
            goto L18
        L22:
            return
    }

    public void onComplete() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r5.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto Lb
            goto L2e
        Lb:
            T r0 = r5.value
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r2 = r5.subscribers
            java.lang.Object r1 = r2.getAndSet(r1)
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = (io.reactivex.processors.AsyncProcessor.AsyncSubscription[]) r1
            r2 = 0
            if (r0 != 0) goto L23
            int r0 = r1.length
        L19:
            if (r2 >= r0) goto L2e
            r3 = r1[r2]
            r3.onComplete()
            int r2 = r2 + 1
            goto L19
        L23:
            int r3 = r1.length
        L24:
            if (r2 >= r3) goto L2e
            r4 = r1[r2]
            r4.complete(r0)
            int r2 = r2 + 1
            goto L24
        L2e:
            return
    }

    public void onError(java.lang.Throwable r5) {
            r4 = this;
            if (r5 != 0) goto L9
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r5.<init>(r0)
        L9:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto L17
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
        L17:
            r0 = 0
            r4.value = r0
            r4.error = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r0 = (io.reactivex.processors.AsyncProcessor.AsyncSubscription[]) r0
            int r1 = r0.length
            r2 = 0
        L26:
            if (r2 >= r1) goto L30
            r3 = r0[r2]
            r3.onError(r5)
            int r2 = r2 + 1
            goto L26
        L30:
            return
    }

    public void onNext(T r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto Lb
            return
        Lb:
            if (r3 != 0) goto L11
            r2.nullOnNext()
            return
        L11:
            r2.value = r3
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.TERMINATED
            if (r0 != r1) goto Le
            r3.cancel()
            return
        Le:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            return
    }

    void remove(io.reactivex.processors.AsyncProcessor.AsyncSubscription<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r0 = (io.reactivex.processors.AsyncProcessor.AsyncSubscription[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            goto L39
        Lc:
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 != r7) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto Le
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1c
            goto L39
        L1c:
            r4 = 1
            if (r1 != r4) goto L22
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r1 = io.reactivex.processors.AsyncProcessor.EMPTY
            goto L31
        L22:
            int r5 = r1 + (-1)
            io.reactivex.processors.AsyncProcessor$AsyncSubscription[] r5 = new io.reactivex.processors.AsyncProcessor.AsyncSubscription[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L31:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.AsyncProcessor$AsyncSubscription<T>[]> r2 = r6.subscribers
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto L0
        L39:
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.processors.AsyncProcessor$AsyncSubscription r0 = new io.reactivex.processors.AsyncProcessor$AsyncSubscription
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L18
            boolean r3 = r0.isCancelled()
            if (r3 == 0) goto L17
            r2.remove(r0)
        L17:
            return
        L18:
            java.lang.Throwable r1 = r2.error
            if (r1 == 0) goto L20
            r3.onError(r1)
            return
        L20:
            T r3 = r2.value
            if (r3 == 0) goto L28
            r0.complete(r3)
            return
        L28:
            r0.onComplete()
            return
    }
}
