package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n0<T> implements rx.e.a<T> {
    final java.lang.Iterable<? extends T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g {
        private static final long serialVersionUID = -8730475647105475802L;
        private final rx.l<? super T> a;
        private final java.util.Iterator<? extends T> b;

        a(rx.l<? super T> r1, java.util.Iterator<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        void a() {
                r3 = this;
                rx.l<? super T> r0 = r3.a
                java.util.Iterator<? extends T> r1 = r3.b
            L4:
                boolean r2 = r0.isUnsubscribed()
                if (r2 == 0) goto Lb
                goto L28
            Lb:
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2e
                r0.onNext(r2)
                boolean r2 = r0.isUnsubscribed()
                if (r2 == 0) goto L19
                goto L28
            L19:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
                if (r2 != 0) goto L4
                boolean r1 = r0.isUnsubscribed()
                if (r1 != 0) goto L28
                r0.onCompleted()
            L28:
                return
            L29:
                r1 = move-exception
                rx.exceptions.a.f(r1, r0)
                return
            L2e:
                r1 = move-exception
                rx.exceptions.a.f(r1, r0)
                return
        }

        void b(long r9) {
                r8 = this;
                rx.l<? super T> r0 = r8.a
                java.util.Iterator<? extends T> r1 = r8.b
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L3e
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L12
                goto L4e
            L12:
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L39
                r0.onNext(r6)
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L20
                goto L4e
            L20:
                boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
                if (r6 != 0) goto L30
                boolean r9 = r0.isUnsubscribed()
                if (r9 != 0) goto L4e
                r0.onCompleted()
                return
            L30:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L34:
                r9 = move-exception
                rx.exceptions.a.f(r9, r0)
                return
            L39:
                r9 = move-exception
                rx.exceptions.a.f(r9, r0)
                return
            L3e:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = rx.internal.operators.a.i(r8, r4)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
            L4e:
                return
        }

        public void request(long r6) {
                r5 = this;
                long r0 = r5.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Le
                goto L2d
            Le:
                r0 = 0
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
                boolean r2 = r5.compareAndSet(r0, r2)
                if (r2 == 0) goto L1e
                r5.a()
                return
            L1e:
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L2d
                long r2 = rx.internal.operators.a.b(r5, r6)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L2d
                r5.b(r6)
            L2d:
                return
        }
    }

    public n0(java.lang.Iterable<? extends T> r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "iterable must not be null"
            r2.<init>(r0)
            throw r2
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r4) {
            r3 = this;
            java.lang.Iterable<? extends T> r0 = r3.a     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r4.isUnsubscribed()
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L16
            r4.onCompleted()
            return
        L16:
            rx.internal.operators.n0$a r1 = new rx.internal.operators.n0$a
            r1.<init>(r4, r0)
            r4.setProducer(r1)
        L1e:
            return
        L1f:
            r0 = move-exception
            rx.exceptions.a.f(r0, r4)
            return
    }
}
