package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowablePublishMulticast<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> selector;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MulticastProcessor<T> extends io.reactivex.Flowable<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] TERMINATED = null;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final int prefetch;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;
        int sourceMode;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> subscribers;
        final java.util.concurrent.atomic.AtomicInteger wip;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r0]
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r0]
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED = r0
                return
        }

        MulticastProcessor(int r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.prefetch = r1
                r0.delayError = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.s = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r2 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY
                r1.<init>(r2)
                r0.subscribers = r1
                return
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r3 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r1 = r4.subscribers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        void completeAll() {
                r9 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r9.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                int r1 = r0.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L22
                r3 = r0[r2]
                long r4 = r3.get()
                r6 = -9223372036854775808
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L1f
                org.reactivestreams.Subscriber<? super T> r3 = r3.actual
                r3.onComplete()
            L1f:
                int r2 = r2 + 1
                goto Lc
            L22:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L14
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                if (r0 == 0) goto L14
                r0.clear()
            L14:
                return
        }

        void drain() {
                r19 = this;
                r1 = r19
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto Lc
                goto Le2
            Lc:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r2 = 1
                r3 = 1
            L10:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r4 = r1.subscribers
                java.lang.Object r4 = r4.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r4 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r4
                int r5 = r4.length
                if (r0 == 0) goto Ld9
                if (r5 == 0) goto Ld9
                int r5 = r4.length
                r6 = 0
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9 = 0
            L25:
                r10 = -9223372036854775808
                if (r9 >= r5) goto L3b
                r12 = r4[r9]
                long r12 = r12.get()
                int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r14 == 0) goto L38
                int r10 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r10 <= 0) goto L38
                r7 = r12
            L38:
                int r9 = r9 + 1
                goto L25
            L3b:
                r12 = 0
            L3d:
                int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                if (r5 == 0) goto L9e
                boolean r9 = r1.isDisposed()
                if (r9 == 0) goto L4b
                r0.clear()
                return
            L4b:
                boolean r9 = r1.done
                if (r9 == 0) goto L5b
                boolean r14 = r1.delayError
                if (r14 != 0) goto L5b
                java.lang.Throwable r14 = r1.error
                if (r14 == 0) goto L5b
                r1.errorAll(r14)
                return
            L5b:
                java.lang.Object r14 = r0.poll()     // Catch: java.lang.Throwable -> L91
                if (r14 != 0) goto L63
                r15 = 1
                goto L64
            L63:
                r15 = 0
            L64:
                if (r9 == 0) goto L74
                if (r15 == 0) goto L74
                java.lang.Throwable r0 = r1.error
                if (r0 == 0) goto L70
                r1.errorAll(r0)
                return
            L70:
                r1.completeAll()
                return
            L74:
                if (r15 == 0) goto L77
                goto L9e
            L77:
                int r5 = r4.length
                r9 = 0
            L79:
                if (r9 >= r5) goto L8d
                r15 = r4[r9]
                long r16 = r15.get()
                int r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
                if (r18 == 0) goto L8a
                org.reactivestreams.Subscriber<? super T> r15 = r15.actual
                r15.onNext(r14)
            L8a:
                int r9 = r9 + 1
                goto L79
            L8d:
                r14 = 1
                long r12 = r12 + r14
                goto L3d
            L91:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
                r1.errorAll(r0)
                return
            L9e:
                if (r5 != 0) goto Lce
                boolean r5 = r1.isDisposed()
                if (r5 == 0) goto Laa
                r0.clear()
                return
            Laa:
                boolean r5 = r1.done
                if (r5 == 0) goto Lba
                boolean r7 = r1.delayError
                if (r7 != 0) goto Lba
                java.lang.Throwable r7 = r1.error
                if (r7 == 0) goto Lba
                r1.errorAll(r7)
                return
            Lba:
                if (r5 == 0) goto Lce
                boolean r5 = r0.isEmpty()
                if (r5 == 0) goto Lce
                java.lang.Throwable r0 = r1.error
                if (r0 == 0) goto Lca
                r1.errorAll(r0)
                return
            Lca:
                r1.completeAll()
                return
            Lce:
                int r5 = r4.length
            Lcf:
                if (r6 >= r5) goto Ld9
                r7 = r4[r6]
                io.reactivex.internal.util.BackpressureHelper.produced(r7, r12)
                int r6 = r6 + 1
                goto Lcf
            Ld9:
                java.util.concurrent.atomic.AtomicInteger r4 = r1.wip
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto Le3
            Le2:
                return
            Le3:
                if (r0 != 0) goto L10
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                goto L10
        }

        void errorAll(java.lang.Throwable r10) {
                r9 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r9.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                int r1 = r0.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L22
                r3 = r0[r2]
                long r4 = r3.get()
                r6 = -9223372036854775808
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L1f
                org.reactivestreams.Subscriber<? super T> r3 = r3.actual
                r3.onError(r10)
            L1f:
                int r2 = r2 + 1
                goto Lc
            L22:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto La
                r0 = 1
                r1.done = r0
                r1.drain()
            La:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.drain()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 != 0) goto L25
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L25
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.s
                java.lang.Object r2 = r2.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L25:
                r1.drain()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4)
                if (r0 == 0) goto L3b
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L2e
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                r3.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L2e
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.prefetch
                io.reactivex.internal.util.QueueDrainHelper.request(r4, r0)
                return
            L2e:
                int r0 = r3.prefetch
                io.reactivex.internal.fuseable.SimpleQueue r0 = io.reactivex.internal.util.QueueDrainHelper.createQueue(r0)
                r3.queue = r0
                int r0 = r3.prefetch
                io.reactivex.internal.util.QueueDrainHelper.request(r4, r0)
            L3b:
                return
        }

        void remove(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                if (r0 == r1) goto L3f
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY
                if (r0 != r1) goto L11
                goto L3f
            L11:
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L14:
                if (r3 >= r1) goto L1e
                r4 = r0[r3]
                if (r4 != r7) goto L1b
                goto L1f
            L1b:
                int r3 = r3 + 1
                goto L14
            L1e:
                r3 = -1
            L1f:
                if (r3 >= 0) goto L22
                goto L3f
            L22:
                r4 = 1
                if (r1 != r4) goto L28
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY
                goto L37
            L28:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r5 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L37:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r2 = r6.subscribers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L3f:
                return
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription
                r0.<init>(r3, r2)
                r3.onSubscribe(r0)
                boolean r1 = r2.add(r0)
                if (r1 == 0) goto L1c
                boolean r3 = r0.isCancelled()
                if (r3 == 0) goto L18
                r2.remove(r0)
                return
            L18:
                r2.drain()
                return
            L1c:
                java.lang.Throwable r0 = r2.error
                if (r0 == 0) goto L24
                r3.onError(r0)
                return
            L24:
                r3.onComplete()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> parent;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        public void cancel() {
                r2 = this;
                r0 = -9223372036854775808
                r2.getAndSet(r0)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<T> r0 = r2.parent
                r0.remove(r2)
                return
        }

        public boolean isCancelled() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                io.reactivex.internal.util.BackpressureHelper.addCancel(r1, r2)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<T> r2 = r1.parent
                r2.drain()
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class OutputCanceller<R> implements org.reactivestreams.Subscriber<R>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super R> actual;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> processor;
        org.reactivestreams.Subscription s;

        OutputCanceller(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.processor = r2
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<?> r0 = r1.processor
                r0.dispose()
                return
        }

        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<?> r0 = r1.processor
                r0.dispose()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<?> r2 = r1.processor
                r2.dispose()
                return
        }

        public void onNext(R r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowablePublishMulticast(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.selector = r2
            r0.prefetch = r3
            r0.delayError = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r4) {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor
            int r1 = r3.prefetch
            boolean r2 = r3.delayError
            r0.<init>(r1, r2)
            io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r3.selector     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "selector returned a null Publisher"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L25
            org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1     // Catch: java.lang.Throwable -> L25
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast$OutputCanceller r2 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast$OutputCanceller
            r2.<init>(r4, r0)
            r1.subscribe(r2)
            org.reactivestreams.Publisher<T> r4 = r3.source
            r4.subscribe(r0)
            return
        L25:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
            return
    }
}
