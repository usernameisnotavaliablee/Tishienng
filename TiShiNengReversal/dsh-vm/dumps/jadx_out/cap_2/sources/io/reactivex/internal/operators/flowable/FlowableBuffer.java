package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableBuffer<T, C extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, C> {
    final java.util.concurrent.Callable<C> bufferSupplier;
    final int size;
    final int skip;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PublisherBufferExactSubscriber<T, C extends java.util.Collection<? super T>> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super C> actual;
        C buffer;
        final java.util.concurrent.Callable<C> bufferSupplier;
        boolean done;
        int index;
        org.reactivestreams.Subscription s;
        final int size;

        PublisherBufferExactSubscriber(org.reactivestreams.Subscriber<? super C> r1, int r2, java.util.concurrent.Callable<C> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.size = r2
                r0.bufferSupplier = r3
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
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
                C extends java.util.Collection<? super T> r0 = r2.buffer
                if (r0 == 0) goto L17
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L17
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r1 = r2.actual
                r1.onNext(r0)
            L17:
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r0 = r2.actual
                r0.onComplete()
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
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                C extends java.util.Collection<? super T> r0 = r2.buffer
                if (r0 != 0) goto L25
                java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1a
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L1a
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L1a
                r2.buffer = r0
                goto L25
            L1a:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.cancel()
                r2.onError(r3)
                return
            L25:
                r0.add(r3)
                int r3 = r2.index
                int r3 = r3 + 1
                int r1 = r2.size
                if (r3 != r1) goto L3c
                r3 = 0
                r2.index = r3
                r3 = 0
                r2.buffer = r3
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r3 = r2.actual
                r3.onNext(r0)
                return
            L3c:
                r2.index = r3
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r4)
                if (r0 == 0) goto L12
                org.reactivestreams.Subscription r0 = r3.s
                int r1 = r3.size
                long r1 = (long) r1
                long r4 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r4, r1)
                r0.request(r4)
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PublisherBufferOverlappingSubscriber<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, io.reactivex.functions.BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final org.reactivestreams.Subscriber<? super C> actual;
        final java.util.concurrent.Callable<C> bufferSupplier;
        final java.util.ArrayDeque<C> buffers;
        volatile boolean cancelled;
        boolean done;
        int index;
        final java.util.concurrent.atomic.AtomicBoolean once;
        long produced;
        org.reactivestreams.Subscription s;
        final int size;
        final int skip;

        PublisherBufferOverlappingSubscriber(org.reactivestreams.Subscriber<? super C> r1, int r2, int r3, java.util.concurrent.Callable<C> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.size = r2
                r0.skip = r3
                r0.bufferSupplier = r4
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.once = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.buffers = r1
                return
        }

        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public boolean getAsBoolean() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        public void onComplete() {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r5.done = r0
                long r0 = r5.produced
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L13
                io.reactivex.internal.util.BackpressureHelper.produced(r5, r0)
            L13:
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r0 = r5.actual
                java.util.ArrayDeque<C extends java.util.Collection<? super T>> r1 = r5.buffers
                io.reactivex.internal.util.QueueDrainHelper.postComplete(r0, r1, r5, r5)
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
                java.util.ArrayDeque<C extends java.util.Collection<? super T>> r0 = r1.buffers
                r0.clear()
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r8) {
                r7 = this;
                boolean r0 = r7.done
                if (r0 == 0) goto L5
                return
            L5:
                java.util.ArrayDeque<C extends java.util.Collection<? super T>> r0 = r7.buffers
                int r1 = r7.index
                int r2 = r1 + 1
                if (r1 != 0) goto L2a
                java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r1 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L1f
                java.lang.String r3 = "The bufferSupplier returned a null buffer"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r3)     // Catch: java.lang.Throwable -> L1f
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L1f
                r0.offer(r1)
                goto L2a
            L1f:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r7.cancel()
                r7.onError(r8)
                return
            L2a:
                java.lang.Object r1 = r0.peek()
                java.util.Collection r1 = (java.util.Collection) r1
                if (r1 == 0) goto L4e
                int r3 = r1.size()
                int r3 = r3 + 1
                int r4 = r7.size
                if (r3 != r4) goto L4e
                r0.poll()
                r1.add(r8)
                long r3 = r7.produced
                r5 = 1
                long r3 = r3 + r5
                r7.produced = r3
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r3 = r7.actual
                r3.onNext(r1)
            L4e:
                java.util.Iterator r0 = r0.iterator()
            L52:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L62
                java.lang.Object r1 = r0.next()
                java.util.Collection r1 = (java.util.Collection) r1
                r1.add(r8)
                goto L52
            L62:
                int r8 = r7.skip
                if (r2 != r8) goto L67
                r2 = 0
            L67:
                r7.index = r2
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r8) {
                r7 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r8)
                if (r0 == 0) goto L4a
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r3 = r7.actual
                java.util.ArrayDeque<C extends java.util.Collection<? super T>> r4 = r7.buffers
                r6 = r7
                r5 = r7
                r1 = r8
                boolean r8 = io.reactivex.internal.util.QueueDrainHelper.postCompleteRequest(r1, r3, r4, r5, r6)
                if (r8 == 0) goto L14
                goto L4b
            L14:
                java.util.concurrent.atomic.AtomicBoolean r8 = r5.once
                boolean r8 = r8.get()
                if (r8 != 0) goto L3d
                java.util.concurrent.atomic.AtomicBoolean r8 = r5.once
                r9 = 0
                r0 = 1
                boolean r8 = r8.compareAndSet(r9, r0)
                if (r8 == 0) goto L3d
                int r8 = r5.skip
                long r8 = (long) r8
                r3 = 1
                long r1 = r1 - r3
                long r8 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r8, r1)
                int r0 = r5.size
                long r0 = (long) r0
                long r8 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r8)
                org.reactivestreams.Subscription r0 = r5.s
                r0.request(r8)
                return
            L3d:
                int r8 = r5.skip
                long r8 = (long) r8
                long r8 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r8, r1)
                org.reactivestreams.Subscription r0 = r5.s
                r0.request(r8)
                return
            L4a:
                r5 = r7
            L4b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PublisherBufferSkipSubscriber<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5616169793639412593L;
        final org.reactivestreams.Subscriber<? super C> actual;
        C buffer;
        final java.util.concurrent.Callable<C> bufferSupplier;
        boolean done;
        int index;
        org.reactivestreams.Subscription s;
        final int size;
        final int skip;

        PublisherBufferSkipSubscriber(org.reactivestreams.Subscriber<? super C> r1, int r2, int r3, java.util.concurrent.Callable<C> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.size = r2
                r0.skip = r3
                r0.bufferSupplier = r4
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
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
                C extends java.util.Collection<? super T> r0 = r2.buffer
                r1 = 0
                r2.buffer = r1
                if (r0 == 0) goto L14
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r1 = r2.actual
                r1.onNext(r0)
            L14:
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r0 = r2.actual
                r0.onComplete()
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
                r0 = 0
                r1.buffer = r0
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                C extends java.util.Collection<? super T> r0 = r3.buffer
                int r1 = r3.index
                int r2 = r1 + 1
                if (r1 != 0) goto L29
                java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r0 = r3.bufferSupplier     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L1e
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L1e
                r3.buffer = r0
                goto L29
            L1e:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r3.cancel()
                r3.onError(r4)
                return
            L29:
                if (r0 == 0) goto L3e
                r0.add(r4)
                int r4 = r0.size()
                int r1 = r3.size
                if (r4 != r1) goto L3e
                r4 = 0
                r3.buffer = r4
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r4 = r3.actual
                r4.onNext(r0)
            L3e:
                int r4 = r3.skip
                if (r2 != r4) goto L43
                r2 = 0
            L43:
                r3.index = r2
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r7) {
                r6 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r7)
                if (r0 == 0) goto L3e
                int r0 = r6.get()
                if (r0 != 0) goto L32
                r0 = 0
                r1 = 1
                boolean r0 = r6.compareAndSet(r0, r1)
                if (r0 == 0) goto L32
                int r0 = r6.size
                long r0 = (long) r0
                long r0 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r7, r0)
                int r2 = r6.skip
                int r3 = r6.size
                int r2 = r2 - r3
                long r2 = (long) r2
                r4 = 1
                long r7 = r7 - r4
                long r7 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r2, r7)
                org.reactivestreams.Subscription r2 = r6.s
                long r7 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r7)
                r2.request(r7)
                return
            L32:
                org.reactivestreams.Subscription r0 = r6.s
                int r1 = r6.skip
                long r1 = (long) r1
                long r7 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r1, r7)
                r0.request(r7)
            L3e:
                return
        }
    }

    public FlowableBuffer(org.reactivestreams.Publisher<T> r1, int r2, int r3, java.util.concurrent.Callable<C> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.size = r2
            r0.skip = r3
            r0.bufferSupplier = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super C> r6) {
            r5 = this;
            int r0 = r5.size
            int r1 = r5.skip
            if (r0 != r1) goto L13
            org.reactivestreams.Publisher<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferExactSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferExactSubscriber
            java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r3 = r5.bufferSupplier
            r2.<init>(r6, r0, r3)
            r1.subscribe(r2)
            return
        L13:
            if (r1 <= r0) goto L26
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferSkipSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferSkipSubscriber
            int r2 = r5.size
            int r3 = r5.skip
            java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r4 = r5.bufferSupplier
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
        L26:
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferOverlappingSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferOverlappingSubscriber
            int r2 = r5.size
            int r3 = r5.skip
            java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r4 = r5.bufferSupplier
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
