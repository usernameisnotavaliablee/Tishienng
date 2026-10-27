package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableBufferBoundary<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> bufferClose;
    final org.reactivestreams.Publisher<? extends Open> bufferOpen;
    final java.util.concurrent.Callable<U> bufferSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> bufferClose;
        final org.reactivestreams.Publisher<? extends Open> bufferOpen;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;
        final io.reactivex.disposables.CompositeDisposable resources;
        org.reactivestreams.Subscription s;
        final java.util.concurrent.atomic.AtomicInteger windows;

        BufferBoundarySubscriber(org.reactivestreams.Subscriber<? super U> r2, org.reactivestreams.Publisher<? extends Open> r3, io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r4, java.util.concurrent.Callable<U> r5) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>()
                r1.windows = r2
                r1.bufferOpen = r3
                r1.bufferClose = r4
                r1.bufferSupplier = r5
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.buffers = r2
                io.reactivex.disposables.CompositeDisposable r2 = new io.reactivex.disposables.CompositeDisposable
                r2.<init>()
                r1.resources = r2
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
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto La
                r0 = 1
                r1.cancelled = r0
                r1.dispose()
            La:
                return
        }

        void close(U r2, io.reactivex.disposables.Disposable r3) {
                r1 = this;
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L22
                boolean r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
                if (r0 == 0) goto Le
                r0 = 0
                r1.fastPathOrderedEmitMax(r2, r0, r1)
            Le:
                io.reactivex.disposables.CompositeDisposable r2 = r1.resources
                boolean r2 = r2.remove(r3)
                if (r2 == 0) goto L21
                java.util.concurrent.atomic.AtomicInteger r2 = r1.windows
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto L21
                r1.complete()
            L21:
                return
            L22:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
                throw r2
        }

        void complete() {
                r3 = this;
                monitor-enter(r3)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
                java.util.List<U extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch: java.lang.Throwable -> L34
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L34
                java.util.List<U extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch: java.lang.Throwable -> L34
                r1.clear()     // Catch: java.lang.Throwable -> L34
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r3.queue
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r0.next()
                java.util.Collection r2 = (java.util.Collection) r2
                r1.offer(r2)
                goto L14
            L24:
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L33
                org.reactivestreams.Subscriber<? super V> r0 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r1, r0, r2, r3, r3)
            L33:
                return
            L34:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
                throw r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                boolean r0 = r0.isDisposed()
                return r0
        }

        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.windows
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Lb
                r1.complete()
            Lb:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancel()
                r0 = 1
                r1.cancelled = r0
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L13
                r0.clear()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                return
            L13:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
                throw r2
        }

        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L17
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L17
                r1.add(r3)     // Catch: java.lang.Throwable -> L17
                goto L7
            L17:
                r3 = move-exception
                goto L1b
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r3
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L2c
                r3.s = r4
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferOpenSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferOpenSubscriber
                r0.<init>(r3)
                io.reactivex.disposables.CompositeDisposable r1 = r3.resources
                r1.add(r0)
                org.reactivestreams.Subscriber<? super V> r1 = r3.actual
                r1.onSubscribe(r3)
                java.util.concurrent.atomic.AtomicInteger r1 = r3.windows
                r2 = 1
                r1.lazySet(r2)
                org.reactivestreams.Publisher<? extends Open> r1 = r3.bufferOpen
                r1.subscribe(r0)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.request(r0)
            L2c:
                return
        }

        void open(Open r3) {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L5
                goto L25
            L5:
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L52
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L52
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L52
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L52
                io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r1 = r2.bufferClose     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r3 = r1.apply(r3)     // Catch: java.lang.Throwable -> L4a
                java.lang.String r1 = "The buffer closing publisher is null"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r1)     // Catch: java.lang.Throwable -> L4a
                org.reactivestreams.Publisher r3 = (org.reactivestreams.Publisher) r3     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r2.cancelled
                if (r1 == 0) goto L26
            L25:
                return
            L26:
                monitor-enter(r2)
                boolean r1 = r2.cancelled     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L2f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
                return
            L2d:
                r3 = move-exception
                goto L48
            L2f:
                java.util.List<U extends java.util.Collection<? super T>> r1 = r2.buffers     // Catch: java.lang.Throwable -> L2d
                r1.add(r0)     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber
                r1.<init>(r0, r2)
                io.reactivex.disposables.CompositeDisposable r0 = r2.resources
                r0.add(r1)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.windows
                r0.getAndIncrement()
                r3.subscribe(r1)
                return
            L48:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
                throw r3
            L4a:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
            L52:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
        }

        void openFinished(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                java.util.concurrent.atomic.AtomicInteger r2 = r1.windows
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto L13
                r1.complete()
            L13:
                return
        }

        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferCloseSubscriber<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.subscribers.DisposableSubscriber<Close> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, U, Open, Close> parent;
        final U value;

        BufferCloseSubscriber(U r1, io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, U, Open, Close> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r2
                r0.value = r1
                return
        }

        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r2.parent
                U extends java.util.Collection<? super T> r1 = r2.value
                r0.close(r1, r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.onError(r2)
                return
        }

        public void onNext(Close r1) {
                r0 = this;
                r0.onComplete()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferOpenSubscriber<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.subscribers.DisposableSubscriber<Open> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, U, Open, Close> parent;

        BufferOpenSubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, U, Open, Close> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.openFinished(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.onError(r2)
                return
        }

        public void onNext(Open r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.open(r2)
                return
        }
    }

    public FlowableBufferBoundary(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<? extends Open> r2, io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r3, java.util.concurrent.Callable<U> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferOpen = r2
            r0.bufferClose = r3
            r0.bufferSupplier = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r6) {
            r5 = this;
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r6)
            org.reactivestreams.Publisher<? extends Open> r6 = r5.bufferOpen
            io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r3 = r5.bufferClose
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r4 = r5.bufferSupplier
            r1.<init>(r2, r6, r3, r4)
            r0.subscribe(r1)
            return
    }
}
