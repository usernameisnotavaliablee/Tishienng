package rx.singles;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a<T> {
    private final rx.i<? extends T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.singles.a$a, reason: collision with other inner class name */
    class C0053a extends rx.k<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference b;
        final /* synthetic */ java.util.concurrent.CountDownLatch c;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference d;
        final /* synthetic */ rx.singles.a e;

        C0053a(rx.singles.a r1, java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.CountDownLatch r3, java.util.concurrent.atomic.AtomicReference r4) {
                r0 = this;
                r0.e = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        public void d(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.b
                r0.set(r2)
                java.util.concurrent.CountDownLatch r2 = r1.c
                r2.countDown()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.d
                r0.set(r2)
                java.util.concurrent.CountDownLatch r2 = r1.c
                r2.countDown()
                return
        }
    }

    private a(rx.i<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.singles.a<T> a(rx.i<? extends T> r1) {
            rx.singles.a r0 = new rx.singles.a
            r0.<init>(r1)
            return r0
    }

    public java.util.concurrent.Future<T> b() {
            r1 = this;
            rx.i<? extends T> r0 = r1.a
            rx.e r0 = r0.z0()
            java.util.concurrent.Future r0 = rx.internal.operators.e.a(r0)
            return r0
    }

    public T c() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            rx.i<? extends T> r3 = r5.a
            rx.singles.a$a r4 = new rx.singles.a$a
            r4.<init>(r5, r0, r2, r1)
            rx.m r3 = r3.j0(r4)
            rx.internal.util.d.a(r2, r3)
            java.lang.Object r1 = r1.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 != 0) goto L2b
            java.lang.Object r0 = r0.get()
            return r0
        L2b:
            java.lang.RuntimeException r0 = rx.exceptions.a.c(r1)
            throw r0
    }
}
