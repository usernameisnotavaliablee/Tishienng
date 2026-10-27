package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final org.reactivestreams.Subscriber<? super R> actual;
    protected long produced;
    protected org.reactivestreams.Subscription s;
    protected R value;

    public SinglePostCompleteSubscriber(org.reactivestreams.Subscriber<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    public void cancel() {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.s
            r0.cancel()
            return
    }

    protected final void complete(R r10) {
            r9 = this;
            long r0 = r9.produced
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            io.reactivex.internal.util.BackpressureHelper.produced(r9, r0)
        Lb:
            long r0 = r9.get()
            r4 = -9223372036854775808
            long r6 = r0 & r4
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L1b
            r9.onDrop(r10)
            return
        L1b:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L38
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9.lazySet(r0)
            org.reactivestreams.Subscriber<? super R> r0 = r9.actual
            r0.onNext(r10)
            org.reactivestreams.Subscriber<? super R> r10 = r9.actual
            r10.onComplete()
            return
        L38:
            r9.value = r10
            boolean r0 = r9.compareAndSet(r2, r4)
            if (r0 == 0) goto L41
            return
        L41:
            r0 = 0
            r9.value = r0
            goto Lb
    }

    protected void onDrop(R r1) {
            r0 = this;
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

    public final void request(long r10) {
            r9 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r10)
            if (r0 == 0) goto L3b
        L6:
            long r0 = r9.get()
            r2 = -9223372036854775808
            long r4 = r0 & r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L2c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r10 = r9.compareAndSet(r2, r10)
            if (r10 == 0) goto L3b
            org.reactivestreams.Subscriber<? super R> r10 = r9.actual
            R r11 = r9.value
            r10.onNext(r11)
            org.reactivestreams.Subscriber<? super R> r10 = r9.actual
            r10.onComplete()
            return
        L2c:
            long r2 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r10)
            boolean r0 = r9.compareAndSet(r0, r2)
            if (r0 == 0) goto L6
            org.reactivestreams.Subscription r0 = r9.s
            r0.request(r10)
        L3b:
            return
    }
}
