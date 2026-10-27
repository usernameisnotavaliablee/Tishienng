package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableTakeLastTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeLastTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5677354903406201275L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription s;
        final io.reactivex.Scheduler scheduler;
        final long time;
        final java.util.concurrent.TimeUnit unit;

        TakeLastTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, long r5, java.util.concurrent.TimeUnit r7, io.reactivex.Scheduler r8, int r9, boolean r10) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                r1.actual = r2
                r1.count = r3
                r1.time = r5
                r1.unit = r7
                r1.scheduler = r8
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r9)
                r1.queue = r2
                r1.delayError = r10
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        boolean checkTerminated(boolean r3, org.reactivestreams.Subscriber<? super T> r4, boolean r5) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto Lb
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r3 = r2.queue
                r3.clear()
                return r1
            Lb:
                if (r5 == 0) goto L1b
                if (r3 == 0) goto L2e
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L17
                r4.onError(r3)
                goto L1a
            L17:
                r4.onComplete()
            L1a:
                return r1
            L1b:
                java.lang.Throwable r5 = r2.error
                if (r5 == 0) goto L28
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r3 = r2.queue
                r3.clear()
                r4.onError(r5)
                return r1
            L28:
                if (r3 == 0) goto L2e
                r4.onComplete()
                return r1
            L2e:
                r3 = 0
                return r3
        }

        void drain() {
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                goto L5a
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r13.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r1 = r13.queue
                boolean r2 = r13.delayError
                r3 = 1
                r4 = 1
            Lf:
                boolean r5 = r13.done
                if (r5 == 0) goto L53
                boolean r5 = r1.isEmpty()
                boolean r5 = r13.checkTerminated(r5, r0, r2)
                if (r5 == 0) goto L1e
                goto L5a
            L1e:
                java.util.concurrent.atomic.AtomicLong r5 = r13.requested
                long r5 = r5.get()
                r7 = 0
                r9 = r7
            L27:
                java.lang.Object r11 = r1.peek()
                if (r11 != 0) goto L2f
                r11 = 1
                goto L30
            L2f:
                r11 = 0
            L30:
                boolean r11 = r13.checkTerminated(r11, r0, r2)
                if (r11 == 0) goto L37
                goto L5a
            L37:
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 != 0) goto L45
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L53
                java.util.concurrent.atomic.AtomicLong r5 = r13.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r5, r9)
                goto L53
            L45:
                r1.poll()
                java.lang.Object r11 = r1.poll()
                r0.onNext(r11)
                r11 = 1
                long r9 = r9 + r11
                goto L27
            L53:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
            L5a:
                return
        }

        public void onComplete() {
                r3 = this;
                io.reactivex.Scheduler r0 = r3.scheduler
                java.util.concurrent.TimeUnit r1 = r3.unit
                long r0 = r0.now(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r3.queue
                r3.trim(r0, r2)
                r0 = 1
                r3.done = r0
                r3.drain()
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                boolean r0 = r3.delayError
                if (r0 == 0) goto L11
                io.reactivex.Scheduler r0 = r3.scheduler
                java.util.concurrent.TimeUnit r1 = r3.unit
                long r0 = r0.now(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r3.queue
                r3.trim(r0, r2)
            L11:
                r3.error = r4
                r4 = 1
                r3.done = r4
                r3.drain()
                return
        }

        public void onNext(T r5) {
                r4 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r4.queue
                io.reactivex.Scheduler r1 = r4.scheduler
                java.util.concurrent.TimeUnit r2 = r4.unit
                long r1 = r1.now(r2)
                java.lang.Long r3 = java.lang.Long.valueOf(r1)
                r0.offer(r3, r5)
                r4.trim(r1, r0)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }

        void trim(long r12, io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r14) {
                r11 = this;
                long r0 = r11.time
                long r2 = r11.count
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r6 = 1
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L10
                r4 = 1
                goto L11
            L10:
                r4 = 0
            L11:
                boolean r5 = r14.isEmpty()
                if (r5 != 0) goto L3a
                java.lang.Object r5 = r14.peek()
                java.lang.Long r5 = (java.lang.Long) r5
                long r7 = r5.longValue()
                long r9 = r12 - r0
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 < 0) goto L33
                if (r4 != 0) goto L3a
                int r5 = r14.size()
                int r5 = r5 >> r6
                long r7 = (long) r5
                int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r5 <= 0) goto L3a
            L33:
                r14.poll()
                r14.poll()
                goto L11
            L3a:
                return
        }
    }

    public FlowableTakeLastTimed(org.reactivestreams.Publisher<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, int r8, boolean r9) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            r0.time = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.bufferSize = r8
            r0.delayError = r9
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r12) {
            r11 = this;
            org.reactivestreams.Publisher<T> r0 = r11.source
            io.reactivex.internal.operators.flowable.FlowableTakeLastTimed$TakeLastTimedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTakeLastTimed$TakeLastTimedSubscriber
            long r3 = r11.count
            long r5 = r11.time
            java.util.concurrent.TimeUnit r7 = r11.unit
            io.reactivex.Scheduler r8 = r11.scheduler
            int r9 = r11.bufferSize
            boolean r10 = r11.delayError
            r2 = r12
            r1.<init>(r2, r3, r5, r7, r8, r9, r10)
            r0.subscribe(r1)
            return
    }
}
