package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class s2<T> implements rx.e.b<T, T> {
    final rx.functions.b<? super T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ java.util.concurrent.atomic.AtomicLong a;
        final /* synthetic */ rx.internal.operators.s2 b;

        a(rx.internal.operators.s2 r1, java.util.concurrent.atomic.AtomicLong r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.a
                rx.internal.operators.a.b(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        boolean a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
        final /* synthetic */ rx.internal.operators.s2 d;

        b(rx.internal.operators.s2 r1, rx.l r2, rx.l r3, java.util.concurrent.atomic.AtomicLong r4) {
                r0 = this;
                r0.d = r1
                r0.b = r3
                r0.c = r4
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto Lc
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.b
                r0.onCompleted()
            Lc:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto Ld
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.b
                r0.onError(r2)
                return
            Ld:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.a
                if (r0 == 0) goto L5
                goto L2a
            L5:
                java.util.concurrent.atomic.AtomicLong r0 = r5.c
                long r0 = r0.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1c
                rx.l r0 = r5.b
                r0.onNext(r6)
                java.util.concurrent.atomic.AtomicLong r6 = r5.c
                r6.decrementAndGet()
                return
            L1c:
                rx.internal.operators.s2 r0 = r5.d
                rx.functions.b<? super T> r0 = r0.a
                if (r0 == 0) goto L2a
                r0.call(r6)     // Catch: java.lang.Throwable -> L26
                return
            L26:
                r0 = move-exception
                rx.exceptions.a.g(r0, r5, r6)
            L2a:
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c {
        static final rx.internal.operators.s2<java.lang.Object> a = null;

        static {
                rx.internal.operators.s2 r0 = new rx.internal.operators.s2
                r0.<init>()
                rx.internal.operators.s2.c.a = r0
                return
        }

        c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    s2() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public s2(rx.functions.b<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.internal.operators.s2<T> a() {
            rx.internal.operators.s2<java.lang.Object> r0 = rx.internal.operators.s2.c.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            rx.internal.operators.s2$a r1 = new rx.internal.operators.s2$a
            r1.<init>(r2, r0)
            r3.setProducer(r1)
            rx.internal.operators.s2$b r1 = new rx.internal.operators.s2$b
            r1.<init>(r2, r3, r3, r0)
            return r1
    }
}
