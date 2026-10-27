package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableBufferBoundarySupplier<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> boundarySupplier;
    final java.util.concurrent.Callable<U> bufferSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        boolean once;
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber<T, U, B> parent;

        BufferBoundarySubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber<T, U, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.once
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.once = r0
                io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySupplierSubscriber<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.next()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.once
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.once = r0
                io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySupplierSubscriber<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.onError(r2)
                return
        }

        public void onNext(B r1) {
                r0 = this;
                boolean r1 = r0.once
                if (r1 == 0) goto L5
                return
            L5:
                r1 = 1
                r0.once = r1
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySupplierSubscriber<T, U extends java.util.Collection<? super T>, B> r1 = r0.parent
                r1.next()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferBoundarySupplierSubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> boundarySupplier;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;
        org.reactivestreams.Subscription s;

        BufferBoundarySupplierSubscriber(org.reactivestreams.Subscriber<? super U> r2, java.util.concurrent.Callable<U> r3, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r4) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.other = r2
                r1.bufferSupplier = r3
                r1.boundarySupplier = r4
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(org.reactivestreams.Subscriber r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(org.reactivestreams.Subscriber<? super U> r1, U r2) {
                r0 = this;
                org.reactivestreams.Subscriber<? super V> r1 = r0.actual
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1a
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                r1.disposeOther()
                boolean r0 = r1.enter()
                if (r0 == 0) goto L1a
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                r0.clear()
            L1a:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                r1.disposeOther()
                return
        }

        void disposeOther() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.other
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        void next() {
                r5 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L5a
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L5a
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L5a
                java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r1 = r5.boundarySupplier     // Catch: java.lang.Throwable -> L48
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L48
                java.lang.String r2 = "The boundary publisher supplied is null"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L48
                org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1     // Catch: java.lang.Throwable -> L48
                io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySubscriber
                r2.<init>(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r5.other
                java.lang.Object r3 = r3.get()
                io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r4 = r5.other
                boolean r3 = androidx.camera.view.p.a(r4, r3, r2)
                if (r3 != 0) goto L32
                return
            L32:
                monitor-enter(r5)
                U extends java.util.Collection<? super T> r3 = r5.buffer     // Catch: java.lang.Throwable -> L39
                if (r3 != 0) goto L3b
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
                return
            L39:
                r0 = move-exception
                goto L46
            L3b:
                r5.buffer = r0     // Catch: java.lang.Throwable -> L39
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
                r1.subscribe(r2)
                r0 = 0
                r5.fastPathEmitMax(r3, r0, r5)
                return
            L46:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
                throw r0
            L48:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 1
                r5.cancelled = r1
                org.reactivestreams.Subscription r1 = r5.s
                r1.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r5.actual
                r1.onError(r0)
                return
            L5a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r5.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r5.actual
                r1.onError(r0)
                return
        }

        public void onComplete() {
                r3 = this;
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.buffer     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L24
            L9:
                r1 = 0
                r3.buffer = r1     // Catch: java.lang.Throwable -> L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L23
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                org.reactivestreams.Subscriber<? super V> r1 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r1, r2, r3, r3)
            L23:
                return
            L24:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancel()
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                U extends java.util.Collection<? super T> r0 = r1.buffer     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto Le
            L9:
                r0.add(r2)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            Le:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        public void onSubscribe(org.reactivestreams.Subscription r6) {
                r5 = this;
                org.reactivestreams.Subscription r0 = r5.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r6)
                if (r0 != 0) goto L9
                goto L48
            L9:
                r5.s = r6
                org.reactivestreams.Subscriber<? super V> r0 = r5.actual
                r1 = 1
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r2 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L56
                java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L56
                java.lang.String r3 = "The buffer supplied is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L56
                java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L56
                r5.buffer = r2
                java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r2 = r5.boundarySupplier     // Catch: java.lang.Throwable -> L49
                java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = "The boundary publisher supplied is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L49
                org.reactivestreams.Publisher r2 = (org.reactivestreams.Publisher) r2     // Catch: java.lang.Throwable -> L49
                io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySubscriber
                r1.<init>(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r5.other
                r3.set(r1)
                r0.onSubscribe(r5)
                boolean r0 = r5.cancelled
                if (r0 != 0) goto L48
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r6.request(r3)
                r2.subscribe(r1)
            L48:
                return
            L49:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r5.cancelled = r1
                r6.cancel()
                io.reactivex.internal.subscriptions.EmptySubscription.error(r2, r0)
                return
            L56:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r5.cancelled = r1
                r6.cancel()
                io.reactivex.internal.subscriptions.EmptySubscription.error(r2, r0)
                return
        }

        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }
    }

    public FlowableBufferBoundarySupplier(org.reactivestreams.Publisher<T> r1, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r2, java.util.concurrent.Callable<U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.boundarySupplier = r2
            r0.bufferSupplier = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySupplierSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySupplierSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r5)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r5 = r4.bufferSupplier
            java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r3 = r4.boundarySupplier
            r1.<init>(r2, r5, r3)
            r0.subscribe(r1)
            return
    }
}
