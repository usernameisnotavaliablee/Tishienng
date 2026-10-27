package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b<T> extends rx.subjects.f<T, T> {
    private static final java.lang.Object[] c = null;
    private final rx.subjects.g<T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.b<rx.subjects.g.c<T>> {
        final /* synthetic */ rx.subjects.g a;

        a(rx.subjects.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.subjects.g$c r1 = (rx.subjects.g.c) r1
                r0.call(r1)
                return
        }

        public void call(rx.subjects.g.c<T> r2) {
                r1 = this;
                rx.subjects.g r0 = r1.a
                java.lang.Object r0 = r0.c()
                r2.e(r0)
                return
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            rx.subjects.b.c = r0
            return
    }

    protected b(rx.e.a<T> r1, rx.subjects.g<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    private static <T> rx.subjects.b<T> A7(T r1, boolean r2) {
            rx.subjects.g r0 = new rx.subjects.g
            r0.<init>()
            if (r2 == 0) goto Le
            java.lang.Object r1 = rx.internal.operators.v.j(r1)
            r0.g(r1)
        Le:
            rx.subjects.b$a r1 = new rx.subjects.b$a
            r1.<init>(r0)
            r0.d = r1
            r0.e = r1
            rx.subjects.b r1 = new rx.subjects.b
            r1.<init>(r0, r0)
            return r1
    }

    public static <T> rx.subjects.b<T> y7() {
            r0 = 0
            r1 = 0
            rx.subjects.b r0 = A7(r0, r1)
            return r0
    }

    public static <T> rx.subjects.b<T> z7(T r1) {
            r0 = 1
            rx.subjects.b r1 = A7(r1, r0)
            return r1
    }

    public java.lang.Throwable B7() {
            r2 = this;
            rx.subjects.g<T> r0 = r2.b
            java.lang.Object r0 = r0.c()
            boolean r1 = rx.internal.operators.v.g(r0)
            if (r1 == 0) goto L11
            java.lang.Throwable r0 = rx.internal.operators.v.d(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public T C7() {
            r2 = this;
            rx.subjects.g<T> r0 = r2.b
            java.lang.Object r0 = r0.c()
            boolean r1 = rx.internal.operators.v.h(r0)
            if (r1 == 0) goto L11
            java.lang.Object r0 = rx.internal.operators.v.e(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public java.lang.Object[] D7() {
            r2 = this;
            java.lang.Object[] r0 = rx.subjects.b.c
            java.lang.Object[] r1 = r2.E7(r0)
            if (r1 != r0) goto Lc
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lc:
            return r1
    }

    public T[] E7(T[] r6) {
            r5 = this;
            rx.subjects.g<T> r0 = r5.b
            java.lang.Object r0 = r0.c()
            boolean r1 = rx.internal.operators.v.h(r0)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L2c
            int r1 = r6.length
            r4 = 1
            if (r1 != 0) goto L20
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r4)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L20:
            java.lang.Object r0 = rx.internal.operators.v.e(r0)
            r6[r3] = r0
            int r0 = r6.length
            if (r0 <= r4) goto L2b
            r6[r4] = r2
        L2b:
            return r6
        L2c:
            int r0 = r6.length
            if (r0 <= 0) goto L31
            r6[r3] = r2
        L31:
            return r6
    }

    public boolean F7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            java.lang.Object r0 = r0.c()
            boolean r0 = rx.internal.operators.v.f(r0)
            return r0
    }

    public boolean G7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            java.lang.Object r0 = r0.c()
            boolean r0 = rx.internal.operators.v.g(r0)
            return r0
    }

    public boolean H7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            java.lang.Object r0 = r0.c()
            boolean r0 = rx.internal.operators.v.h(r0)
            return r0
    }

    int I7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            rx.subjects.g$c[] r0 = r0.e()
            int r0 = r0.length
            return r0
    }

    public void onCompleted() {
            r5 = this;
            rx.subjects.g<T> r0 = r5.b
            java.lang.Object r0 = r0.c()
            if (r0 == 0) goto Le
            rx.subjects.g<T> r0 = r5.b
            boolean r0 = r0.b
            if (r0 == 0) goto L24
        Le:
            java.lang.Object r0 = rx.internal.operators.v.b()
            rx.subjects.g<T> r1 = r5.b
            rx.subjects.g$c[] r1 = r1.h(r0)
            int r2 = r1.length
            r3 = 0
        L1a:
            if (r3 >= r2) goto L24
            r4 = r1[r3]
            r4.g(r0)
            int r3 = r3 + 1
            goto L1a
        L24:
            return
    }

    public void onError(java.lang.Throwable r6) {
            r5 = this;
            rx.subjects.g<T> r0 = r5.b
            java.lang.Object r0 = r0.c()
            if (r0 == 0) goto L10
            rx.subjects.g<T> r0 = r5.b
            boolean r0 = r0.b
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            java.lang.Object r6 = rx.internal.operators.v.c(r6)
            rx.subjects.g<T> r0 = r5.b
            rx.subjects.g$c[] r0 = r0.h(r6)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L1d:
            if (r3 >= r1) goto L33
            r4 = r0[r3]
            r4.g(r6)     // Catch: java.lang.Throwable -> L25
            goto L30
        L25:
            r4 = move-exception
            if (r2 != 0) goto L2d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L2d:
            r2.add(r4)
        L30:
            int r3 = r3 + 1
            goto L1d
        L33:
            rx.exceptions.a.d(r2)
            return
    }

    public void onNext(T r5) {
            r4 = this;
            rx.subjects.g<T> r0 = r4.b
            java.lang.Object r0 = r0.c()
            if (r0 == 0) goto Le
            rx.subjects.g<T> r0 = r4.b
            boolean r0 = r0.b
            if (r0 == 0) goto L24
        Le:
            java.lang.Object r5 = rx.internal.operators.v.j(r5)
            rx.subjects.g<T> r0 = r4.b
            rx.subjects.g$c[] r0 = r0.d(r5)
            int r1 = r0.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L24
            r3 = r0[r2]
            r3.g(r5)
            int r2 = r2 + 1
            goto L1a
        L24:
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            rx.subjects.g$c[] r0 = r0.e()
            int r0 = r0.length
            if (r0 <= 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
