package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class t0<T> implements rx.b.j0 {
    public static volatile boolean c;
    final rx.b.j0 a;
    final java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements rx.d {
        final rx.d a;
        final java.lang.String b;

        public a(rx.d r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void a(rx.m r2) {
                r1 = this;
                rx.d r0 = r1.a
                r0.a(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.d r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.exceptions.AssemblyStackTraceException r0 = new rx.exceptions.AssemblyStackTraceException
                java.lang.String r1 = r2.b
                r0.<init>(r1)
                r0.attachTo(r3)
                rx.d r0 = r2.a
                r0.onError(r3)
                return
        }
    }

    public t0(rx.b.j0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = rx.internal.operators.s0.a()
            r0.b = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.d r1 = (rx.d) r1
            r0.call(r1)
            return
    }

    public void call(rx.d r4) {
            r3 = this;
            rx.b$j0 r0 = r3.a
            rx.internal.operators.t0$a r1 = new rx.internal.operators.t0$a
            java.lang.String r2 = r3.b
            r1.<init>(r4, r2)
            r0.call(r1)
            return
    }
}
