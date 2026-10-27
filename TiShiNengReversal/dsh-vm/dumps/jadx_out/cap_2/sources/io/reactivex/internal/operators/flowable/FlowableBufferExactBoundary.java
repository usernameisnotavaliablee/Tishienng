package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableBufferExactBoundary<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final org.reactivestreams.Publisher<B> boundary;
    final java.util.concurrent.Callable<U> bufferSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber<T, U, B> parent;

        BufferBoundarySubscriber(io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber<T, U, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferExactBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferExactBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.onError(r2)
                return
        }

        public void onNext(B r1) {
                r0 = this;
                io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferExactBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> r1 = r0.parent
                r1.next()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferExactBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final org.reactivestreams.Publisher<B> boundary;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        io.reactivex.disposables.Disposable other;
        org.reactivestreams.Subscription s;

        BufferExactBoundarySubscriber(org.reactivestreams.Subscriber<? super U> r2, java.util.concurrent.Callable<U> r3, org.reactivestreams.Publisher<B> r4) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.boundary = r4
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
                if (r0 != 0) goto L1c
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.other
                r0.dispose()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                boolean r0 = r1.enter()
                if (r0 == 0) goto L1c
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                r0.clear()
            L1c:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                r0.cancel()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        void next() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L21
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L21
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L21
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L21
                monitor-enter(r2)
                U extends java.util.Collection<? super T> r1 = r2.buffer     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r0 = move-exception
                goto L1f
            L17:
                r2.buffer = r0     // Catch: java.lang.Throwable -> L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                r0 = 0
                r2.fastPathEmitMax(r1, r0, r2)
                return
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                throw r0
            L21:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r2.actual
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

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 != 0) goto L9
                goto L38
            L9:
                r3.s = r4
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r3.bufferSupplier     // Catch: java.lang.Throwable -> L39
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L39
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L39
                r3.buffer = r0
                io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferBoundarySubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferBoundarySubscriber
                r0.<init>(r3)
                r3.other = r0
                org.reactivestreams.Subscriber<? super V> r1 = r3.actual
                r1.onSubscribe(r3)
                boolean r1 = r3.cancelled
                if (r1 != 0) goto L38
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.request(r1)
                org.reactivestreams.Publisher<B> r4 = r3.boundary
                r4.subscribe(r0)
            L38:
                return
            L39:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 1
                r3.cancelled = r1
                r4.cancel()
                org.reactivestreams.Subscriber<? super V> r4 = r3.actual
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
                return
        }

        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }
    }

    public FlowableBufferExactBoundary(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<B> r2, java.util.concurrent.Callable<U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.boundary = r2
            r0.bufferSupplier = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferExactBoundarySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$BufferExactBoundarySubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r5)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r5 = r4.bufferSupplier
            org.reactivestreams.Publisher<B> r3 = r4.boundary
            r1.<init>(r2, r5, r3)
            r0.subscribe(r1)
            return
    }
}
