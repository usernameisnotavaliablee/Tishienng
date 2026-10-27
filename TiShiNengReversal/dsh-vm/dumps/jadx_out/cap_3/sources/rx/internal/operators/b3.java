package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b3 {
    static final java.lang.Object a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.q<java.lang.Object, java.lang.Object, java.lang.Boolean> {
        final /* synthetic */ rx.functions.q a;

        a(rx.functions.q r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean call(java.lang.Object r5, java.lang.Object r6) {
                r4 = this;
                java.lang.Object r0 = rx.internal.operators.b3.a
                r1 = 0
                r2 = 1
                if (r5 != r0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                if (r6 != r0) goto Lc
                r1 = 1
            Lc:
                if (r3 == 0) goto L13
                if (r1 == 0) goto L13
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                return r5
            L13:
                if (r3 != 0) goto L21
                if (r1 == 0) goto L18
                goto L21
            L18:
                rx.functions.q r0 = r4.a
                java.lang.Object r5 = r0.call(r5, r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                return r5
            L21:
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                return r5
        }

        /* renamed from: call, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m16call(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.call(r1, r2)
                return r1
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.operators.b3.a = r0
            return
    }

    private b3() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    static <T> rx.e<java.lang.Object> a(rx.e<T> r1) {
            java.lang.Object r0 = rx.internal.operators.b3.a
            rx.e r0 = rx.e.M2(r0)
            rx.e r1 = rx.e.v0(r1, r0)
            return r1
    }

    public static <T> rx.e<java.lang.Boolean> b(rx.e<? extends T> r1, rx.e<? extends T> r2, rx.functions.q<? super T, ? super T, java.lang.Boolean> r3) {
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.internal.operators.b3$a r0 = new rx.internal.operators.b3$a
            r0.<init>(r3)
            rx.e r1 = rx.e.r7(r1, r2, r0)
            rx.functions.p r2 = rx.internal.util.n.c()
            rx.e r1 = r1.d(r2)
            return r1
    }
}
