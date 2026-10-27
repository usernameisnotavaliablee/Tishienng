package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableRangeLong extends io.reactivex.Flowable<java.lang.Long> {
    final long end;
    final long start;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class BaseRangeSubscription extends io.reactivex.internal.subscriptions.BasicQueueSubscription<java.lang.Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        BaseRangeSubscription(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                r0.end = r3
                return
        }

        public final void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
                r2 = this;
                long r0 = r2.end
                r2.index = r0
                return
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
                r5 = this;
                long r0 = r5.index
                long r2 = r5.end
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final java.lang.Long poll() {
                r5 = this;
                long r0 = r5.index
                long r2 = r5.end
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto La
                r0 = 0
                return r0
            La:
                r2 = 1
                long r2 = r2 + r0
                r5.index = r2
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
                r1 = this;
                java.lang.Long r0 = r1.poll()
                return r0
        }

        public final void request(long r6) {
                r5 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r6)
                if (r0 == 0) goto L20
                long r0 = io.reactivex.internal.util.BackpressureHelper.add(r5, r6)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L20
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L1d
                r5.fastPath()
                return
            L1d:
                r5.slowPath(r6)
            L20:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int r1) {
                r0 = this;
                r1 = r1 & 1
                return r1
        }

        abstract void slowPath(long r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RangeConditionalSubscription extends io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> actual;

        RangeConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> r1, long r2, long r4) {
                r0 = this;
                r0.<init>(r2, r4)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
                r7 = this;
                long r0 = r7.end
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> r2 = r7.actual
                long r3 = r7.index
            L6:
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 == 0) goto L1a
                boolean r5 = r7.cancelled
                if (r5 == 0) goto Lf
                goto L1e
            Lf:
                java.lang.Long r5 = java.lang.Long.valueOf(r3)
                r2.tryOnNext(r5)
                r5 = 1
                long r3 = r3 + r5
                goto L6
            L1a:
                boolean r0 = r7.cancelled
                if (r0 == 0) goto L1f
            L1e:
                return
            L1f:
                r2.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long r13) {
                r12 = this;
                long r0 = r12.end
                long r2 = r12.index
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> r4 = r12.actual
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 == 0) goto L25
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L25
                boolean r9 = r12.cancelled
                if (r9 == 0) goto L16
                goto L44
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                boolean r9 = r4.tryOnNext(r9)
                r10 = 1
                if (r9 == 0) goto L23
                long r7 = r7 + r10
            L23:
                long r2 = r2 + r10
                goto L9
            L25:
                int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r13 != 0) goto L31
                boolean r13 = r12.cancelled
                if (r13 != 0) goto L44
                r4.onComplete()
                return
            L31:
                long r13 = r12.get()
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 != 0) goto L9
                r12.index = r2
                long r13 = -r7
                long r13 = r12.addAndGet(r13)
                int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
            L44:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RangeSubscription extends io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> actual;

        RangeSubscription(org.reactivestreams.Subscriber<? super java.lang.Long> r1, long r2, long r4) {
                r0 = this;
                r0.<init>(r2, r4)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
                r7 = this;
                long r0 = r7.end
                org.reactivestreams.Subscriber<? super java.lang.Long> r2 = r7.actual
                long r3 = r7.index
            L6:
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 == 0) goto L1a
                boolean r5 = r7.cancelled
                if (r5 == 0) goto Lf
                goto L1e
            Lf:
                java.lang.Long r5 = java.lang.Long.valueOf(r3)
                r2.onNext(r5)
                r5 = 1
                long r3 = r3 + r5
                goto L6
            L1a:
                boolean r0 = r7.cancelled
                if (r0 == 0) goto L1f
            L1e:
                return
            L1f:
                r2.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long r12) {
                r11 = this;
                long r0 = r11.end
                long r2 = r11.index
                org.reactivestreams.Subscriber<? super java.lang.Long> r4 = r11.actual
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 == 0) goto L22
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L22
                boolean r9 = r11.cancelled
                if (r9 == 0) goto L16
                goto L41
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                r4.onNext(r9)
                r9 = 1
                long r7 = r7 + r9
                long r2 = r2 + r9
                goto L9
            L22:
                int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r12 != 0) goto L2e
                boolean r12 = r11.cancelled
                if (r12 != 0) goto L41
                r4.onComplete()
                return
            L2e:
                long r12 = r11.get()
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 != 0) goto L9
                r11.index = r2
                long r12 = -r7
                long r12 = r11.addAndGet(r12)
                int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
            L41:
                return
        }
    }

    public FlowableRangeLong(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.start = r1
            long r1 = r1 + r3
            r0.end = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> r9) {
            r8 = this;
            boolean r0 = r9 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L14
            io.reactivex.internal.operators.flowable.FlowableRangeLong$RangeConditionalSubscription r1 = new io.reactivex.internal.operators.flowable.FlowableRangeLong$RangeConditionalSubscription
            r2 = r9
            io.reactivex.internal.fuseable.ConditionalSubscriber r2 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r2
            long r3 = r8.start
            long r5 = r8.end
            r1.<init>(r2, r3, r5)
            r9.onSubscribe(r1)
            return
        L14:
            io.reactivex.internal.operators.flowable.FlowableRangeLong$RangeSubscription r2 = new io.reactivex.internal.operators.flowable.FlowableRangeLong$RangeSubscription
            long r4 = r8.start
            long r6 = r8.end
            r3 = r9
            r2.<init>(r3, r4, r6)
            r3.onSubscribe(r2)
            return
    }
}
