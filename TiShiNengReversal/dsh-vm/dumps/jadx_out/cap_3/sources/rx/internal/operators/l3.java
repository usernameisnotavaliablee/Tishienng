package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l3<T> implements rx.e.b<T, T> {
    final int a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        int a;
        boolean b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.l3 d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.l3$a$a, reason: collision with other inner class name */
        class C0017a implements rx.g {
            final java.util.concurrent.atomic.AtomicLong a;
            final /* synthetic */ rx.g b;
            final /* synthetic */ rx.internal.operators.l3.a c;

            C0017a(rx.internal.operators.l3.a r3, rx.g r4) {
                    r2 = this;
                    r2.c = r3
                    r2.b = r4
                    r2.<init>()
                    java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
                    r0 = 0
                    r3.<init>(r0)
                    r2.a = r3
                    return
            }

            public void request(long r10) {
                    r9 = this;
                    r0 = 0
                    int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                    if (r2 <= 0) goto L32
                    rx.internal.operators.l3$a r2 = r9.c
                    boolean r2 = r2.b
                    if (r2 != 0) goto L32
                Lc:
                    java.util.concurrent.atomic.AtomicLong r2 = r9.a
                    long r2 = r2.get()
                    rx.internal.operators.l3$a r4 = r9.c
                    rx.internal.operators.l3 r4 = r4.d
                    int r4 = r4.a
                    long r4 = (long) r4
                    long r4 = r4 - r2
                    long r4 = java.lang.Math.min(r10, r4)
                    int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r6 != 0) goto L23
                    goto L32
                L23:
                    java.util.concurrent.atomic.AtomicLong r6 = r9.a
                    long r7 = r2 + r4
                    boolean r2 = r6.compareAndSet(r2, r7)
                    if (r2 == 0) goto Lc
                    rx.g r10 = r9.b
                    r10.request(r4)
                L32:
                    return
            }
        }

        a(rx.internal.operators.l3 r1, rx.l r2) {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto Lc
                r0 = 1
                r1.b = r0
                rx.l r0 = r1.c
                r0.onCompleted()
            Lc:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L15
                r0 = 1
                r1.b = r0
                rx.l r0 = r1.c     // Catch: java.lang.Throwable -> L10
                r0.onError(r2)     // Catch: java.lang.Throwable -> L10
                r1.unsubscribe()
                return
            L10:
                r2 = move-exception
                r1.unsubscribe()
                throw r2
            L15:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.isUnsubscribed()
                if (r0 != 0) goto L33
                int r0 = r3.a
                int r1 = r0 + 1
                r3.a = r1
                rx.internal.operators.l3 r2 = r3.d
                int r2 = r2.a
                if (r0 >= r2) goto L33
                r0 = 1
                if (r1 != r2) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                rx.l r2 = r3.c
                r2.onNext(r4)
                if (r1 == 0) goto L33
                boolean r4 = r3.b
                if (r4 != 0) goto L33
                r3.b = r0
                rx.l r4 = r3.c     // Catch: java.lang.Throwable -> L2e
                r4.onCompleted()     // Catch: java.lang.Throwable -> L2e
                r3.unsubscribe()
                return
            L2e:
                r4 = move-exception
                r3.unsubscribe()
                throw r4
            L33:
                return
        }

        public void setProducer(rx.g r3) {
                r2 = this;
                rx.l r0 = r2.c
                rx.internal.operators.l3$a$a r1 = new rx.internal.operators.l3$a$a
                r1.<init>(r2, r3)
                r0.setProducer(r1)
                return
        }
    }

    public l3(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto L8
            r3.a = r4
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "limit >= 0 required but it was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.l3$a r0 = new rx.internal.operators.l3$a
            r0.<init>(r2, r3)
            int r1 = r2.a
            if (r1 != 0) goto Lf
            r3.onCompleted()
            r0.unsubscribe()
        Lf:
            r3.add(r0)
            return r0
    }
}
