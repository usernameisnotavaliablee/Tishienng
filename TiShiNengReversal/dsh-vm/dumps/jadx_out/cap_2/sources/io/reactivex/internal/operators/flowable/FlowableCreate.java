package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableCreate<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.BackpressureStrategy backpressure;
    final io.reactivex.FlowableOnSubscribe<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy = null;

        static {
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureStrategy = r0
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L28
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L33
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class BaseEmitter<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableEmitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.disposables.SequentialDisposable serial;

        BaseEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.serial = r1
                return
        }

        public final void cancel() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.dispose()
                r1.onUnsubscribed()
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.isCancelled()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual     // Catch: java.lang.Throwable -> L12
                r0.onComplete()     // Catch: java.lang.Throwable -> L12
                io.reactivex.internal.disposables.SequentialDisposable r0 = r2.serial
                r0.dispose()
                return
            L12:
                r0 = move-exception
                io.reactivex.internal.disposables.SequentialDisposable r1 = r2.serial
                r1.dispose()
                throw r0
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto L9
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L9:
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto L13
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L13:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual     // Catch: java.lang.Throwable -> L1e
                r0.onError(r2)     // Catch: java.lang.Throwable -> L1e
                io.reactivex.internal.disposables.SequentialDisposable r2 = r1.serial
                r2.dispose()
                return
            L1e:
                r2 = move-exception
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.dispose()
                throw r2
        }

        void onRequested() {
                r0 = this;
                return
        }

        void onUnsubscribed() {
                r0 = this;
                return
        }

        public final void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Lc
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
                r1.onRequested()
            Lc:
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
                r2 = this;
                long r0 = r2.get()
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public final io.reactivex.FlowableEmitter<T> serialize() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter
                r0.<init>(r1)
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.disposables.CancellableDisposable r0 = new io.reactivex.internal.disposables.CancellableDisposable
                r0.<init>(r2)
                r1.setDisposable(r0)
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.update(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicInteger wip;

        BufferAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r2)
                r0.queue = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        void drain() {
                r14 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r14.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto La
                goto L7c
            La:
                org.reactivestreams.Subscriber<? super T> r0 = r14.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r1 = r14.queue
                r2 = 1
                r3 = 1
            L10:
                long r4 = r14.get()
                r6 = 0
                r8 = r6
            L17:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L4a
                boolean r11 = r14.isCancelled()
                if (r11 == 0) goto L25
                r1.clear()
                return
            L25:
                boolean r11 = r14.done
                java.lang.Object r12 = r1.poll()
                if (r12 != 0) goto L2f
                r13 = 1
                goto L30
            L2f:
                r13 = 0
            L30:
                if (r11 == 0) goto L40
                if (r13 == 0) goto L40
                java.lang.Throwable r0 = r14.error
                if (r0 == 0) goto L3c
                super.onError(r0)
                return
            L3c:
                super.onComplete()
                return
            L40:
                if (r13 == 0) goto L43
                goto L4a
            L43:
                r0.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto L17
            L4a:
                if (r10 != 0) goto L6c
                boolean r4 = r14.isCancelled()
                if (r4 == 0) goto L56
                r1.clear()
                return
            L56:
                boolean r4 = r14.done
                boolean r5 = r1.isEmpty()
                if (r4 == 0) goto L6c
                if (r5 == 0) goto L6c
                java.lang.Throwable r0 = r14.error
                if (r0 == 0) goto L68
                super.onError(r0)
                return
            L68:
                super.onComplete()
                return
            L6c:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L73
                io.reactivex.internal.util.BackpressureHelper.produced(r14, r8)
            L73:
                java.util.concurrent.atomic.AtomicInteger r4 = r14.wip
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto L10
            L7c:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L1d
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto Lb
                goto L1d
            Lb:
                if (r2 != 0) goto L14
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L14:
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            L1d:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L20
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto Lb
                goto L20
            Lb:
                if (r2 != 0) goto L18
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                return
            L18:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
            L20:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onRequested() {
                r0 = this;
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onUnsubscribed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Ld
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.clear()
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DropAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        DropAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void onOverflow() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ErrorAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void onOverflow() {
                r2 = this;
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "create: could not emit value due to lack of requests"
                r0.<init>(r1)
                r2.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LatestAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicReference<T> queue;
        final java.util.concurrent.atomic.AtomicInteger wip;

        LatestAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.queue = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        void drain() {
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.wip
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto L85
            Lc:
                org.reactivestreams.Subscriber<? super T> r1 = r0.actual
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.queue
                r3 = 1
                r4 = 1
            L12:
                long r5 = r0.get()
                r7 = 0
                r9 = r7
            L19:
                r11 = 0
                r12 = 0
                int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r13 == 0) goto L50
                boolean r14 = r0.isCancelled()
                if (r14 == 0) goto L29
                r2.lazySet(r12)
                return
            L29:
                boolean r14 = r0.done
                java.lang.Object r15 = r2.getAndSet(r12)
                if (r15 != 0) goto L34
                r16 = 1
                goto L36
            L34:
                r16 = 0
            L36:
                if (r14 == 0) goto L46
                if (r16 == 0) goto L46
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L42
                super.onError(r1)
                return
            L42:
                super.onComplete()
                return
            L46:
                if (r16 == 0) goto L49
                goto L50
            L49:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L50:
                if (r13 != 0) goto L75
                boolean r5 = r0.isCancelled()
                if (r5 == 0) goto L5c
                r2.lazySet(r12)
                return
            L5c:
                boolean r5 = r0.done
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L65
                r11 = 1
            L65:
                if (r5 == 0) goto L75
                if (r11 == 0) goto L75
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L71
                super.onError(r1)
                return
            L71:
                super.onComplete()
                return
            L75:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7c
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r9)
            L7c:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.wip
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            L85:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L20
                boolean r0 = r2.isCancelled()
                if (r0 == 0) goto Lb
                goto L20
            Lb:
                if (r3 != 0) goto L17
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r0.<init>(r1)
                r2.onError(r0)
            L17:
                r2.error = r3
                r3 = 1
                r2.done = r3
                r2.drain()
                return
            L20:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L20
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto Lb
                goto L20
            Lb:
                if (r2 != 0) goto L18
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                return
            L18:
                java.util.concurrent.atomic.AtomicReference<T> r0 = r1.queue
                r0.set(r2)
                r1.drain()
            L20:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onRequested() {
                r0 = this;
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onUnsubscribed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Le
                java.util.concurrent.atomic.AtomicReference<T> r0 = r2.queue
                r1 = 0
                r0.lazySet(r1)
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MissingEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.isCancelled()
                if (r0 == 0) goto L7
                goto L22
            L7:
                if (r5 == 0) goto L23
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
            Le:
                long r0 = r4.get()
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L22
                r2 = 1
                long r2 = r0 - r2
                boolean r5 = r4.compareAndSet(r0, r2)
                if (r5 == 0) goto Le
            L22:
                return
            L23:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r5.<init>(r0)
                r4.onError(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class NoOverflowBaseAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        NoOverflowBaseAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.isCancelled()
                if (r0 == 0) goto L7
                return
            L7:
                if (r6 != 0) goto L14
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r6.<init>(r0)
                r5.onError(r6)
                return
            L14:
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L29
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onNext(r6)
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r5, r0)
                return
            L29:
                r5.onOverflow()
                return
        }

        abstract void onOverflow();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> emitter;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;

        SerializedEmitter(io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> r2) {
                r1 = this;
                r1.<init>()
                r1.emitter = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r0 = 16
                r2.<init>(r0)
                r1.queue = r2
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r8 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r8.emitter
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r1 = r8.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r8.error
                r3 = 1
                r4 = 1
            L8:
                boolean r5 = r0.isCancelled()
                if (r5 == 0) goto L12
                r1.clear()
                return
            L12:
                java.lang.Object r5 = r2.get()
                if (r5 == 0) goto L23
                r1.clear()
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L23:
                boolean r5 = r8.done
                java.lang.Object r6 = r1.poll()
                if (r6 != 0) goto L2d
                r7 = 1
                goto L2e
            L2d:
                r7 = 0
            L2e:
                if (r5 == 0) goto L36
                if (r7 == 0) goto L36
                r0.onComplete()
                return
            L36:
                if (r7 == 0) goto L40
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto L8
                return
            L40:
                r0.onNext(r6)
                goto L8
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean isCancelled() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L13
                boolean r0 = r1.done
                if (r0 == 0) goto Ld
                goto L13
            Ld:
                r0 = 1
                r1.done = r0
                r1.drain()
            L13:
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L29
                boolean r0 = r1.done
                if (r0 == 0) goto Ld
                goto L29
            Ld:
                if (r2 != 0) goto L16
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L16:
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L25
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            L25:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L29:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L49
                boolean r0 = r2.done
                if (r0 == 0) goto Ld
                goto L49
            Ld:
                if (r3 != 0) goto L1a
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
                r2.onError(r3)
                return
            L1a:
                int r0 = r2.get()
                if (r0 != 0) goto L34
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L34
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                r0.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L42
                goto L49
            L34:
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r2.queue
                monitor-enter(r0)
                r0.offer(r3)     // Catch: java.lang.Throwable -> L46
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L42
                goto L49
            L42:
                r2.drainLoop()
                return
            L46:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                throw r3
            L49:
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public long requested() {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                long r0 = r0.requested()
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public io.reactivex.FlowableEmitter<T> serialize() {
                r0 = this;
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                r0.setCancellable(r2)
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                r0.setDisposable(r2)
                return
        }
    }

    public FlowableCreate(io.reactivex.FlowableOnSubscribe<T> r1, io.reactivex.BackpressureStrategy r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.backpressure = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureStrategy
            io.reactivex.BackpressureStrategy r1 = r2.backpressure
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L2c
            r1 = 3
            if (r0 == r1) goto L26
            r1 = 4
            if (r0 == r1) goto L20
            io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter
            int r1 = io.reactivex.Flowable.bufferSize()
            r0.<init>(r3, r1)
            goto L37
        L20:
            io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter
            r0.<init>(r3)
            goto L37
        L26:
            io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter
            r0.<init>(r3)
            goto L37
        L2c:
            io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter
            r0.<init>(r3)
            goto L37
        L32:
            io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter
            r0.<init>(r3)
        L37:
            r3.onSubscribe(r0)
            io.reactivex.FlowableOnSubscribe<T> r3 = r2.source     // Catch: java.lang.Throwable -> L40
            r3.subscribe(r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            r0.onError(r3)
            return
    }
}
