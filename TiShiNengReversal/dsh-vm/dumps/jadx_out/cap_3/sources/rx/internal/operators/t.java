package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class t<T, R> extends rx.l<T> {
    static final int e = 0;
    static final int f = 1;
    static final int g = 2;
    static final int h = 3;
    protected final rx.l<? super R> a;
    protected boolean b;
    protected R c;
    final java.util.concurrent.atomic.AtomicInteger d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements rx.g {
        final rx.internal.operators.t<?, ?> a;

        public a(rx.internal.operators.t<?, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.t<?, ?> r0 = r1.a
                r0.s(r2)
                return
        }
    }

    public t(rx.l<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r0.d = r1
            return
    }

    final void A() {
            r2 = this;
            rx.l<? super R> r0 = r2.a
            r0.add(r2)
            rx.internal.operators.t$a r1 = new rx.internal.operators.t$a
            r1.<init>(r2)
            r0.setProducer(r1)
            return
    }

    public final void B(rx.e<? extends T> r1) {
            r0 = this;
            r0.A()
            r1.J6(r0)
            return
    }

    protected final void g() {
            r1 = this;
            rx.l<? super R> r0 = r1.a
            r0.onCompleted()
            return
    }

    protected final void j(R r6) {
            r5 = this;
            rx.l<? super R> r0 = r5.a
        L2:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.d
            int r1 = r1.get()
            r2 = 2
            if (r1 == r2) goto L35
            r3 = 3
            if (r1 == r3) goto L35
            boolean r4 = r0.isUnsubscribed()
            if (r4 == 0) goto L15
            goto L35
        L15:
            r4 = 1
            if (r1 != r4) goto L2a
            r0.onNext(r6)
            boolean r6 = r0.isUnsubscribed()
            if (r6 != 0) goto L24
            r0.onCompleted()
        L24:
            java.util.concurrent.atomic.AtomicInteger r6 = r5.d
            r6.lazySet(r3)
            return
        L2a:
            r5.c = r6
            java.util.concurrent.atomic.AtomicInteger r1 = r5.d
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L2
        L35:
            return
    }

    public void onCompleted() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto La
            R r0 = r1.c
            r1.j(r0)
            return
        La:
            r1.g()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.c = r0
            rx.l<? super R> r0 = r1.a
            r0.onError(r2)
            return
    }

    final void s(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L41
            if (r2 == 0) goto L40
            rx.l<? super R> r4 = r3.a
        La:
            java.util.concurrent.atomic.AtomicInteger r5 = r3.d
            int r5 = r5.get()
            r0 = 1
            if (r5 == r0) goto L40
            r1 = 3
            if (r5 == r1) goto L40
            boolean r2 = r4.isUnsubscribed()
            if (r2 == 0) goto L1d
            goto L40
        L1d:
            r2 = 2
            if (r5 != r2) goto L37
            java.util.concurrent.atomic.AtomicInteger r5 = r3.d
            boolean r5 = r5.compareAndSet(r2, r1)
            if (r5 == 0) goto L40
            R r5 = r3.c
            r4.onNext(r5)
            boolean r5 = r4.isUnsubscribed()
            if (r5 != 0) goto L40
            r4.onCompleted()
            return
        L37:
            java.util.concurrent.atomic.AtomicInteger r5 = r3.d
            r1 = 0
            boolean r5 = r5.compareAndSet(r1, r0)
            if (r5 == 0) goto La
        L40:
            return
        L41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "n >= 0 required but it was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void setProducer(rx.g r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            return
    }
}
