package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class v {
    private static final java.lang.Object a = null;
    private static final java.lang.Object b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.io.Serializable {
        private static final long serialVersionUID = 1;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Notification=>Completed"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements java.io.Serializable {
        private static final long serialVersionUID = 2;

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Notification=>NULL"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c implements java.io.Serializable {
        private static final long serialVersionUID = 3;
        final java.lang.Throwable a;

        public c(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Notification=>Error:"
                r0.append(r1)
                java.lang.Throwable r1 = r2.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            rx.internal.operators.v$a r0 = new rx.internal.operators.v$a
            r0.<init>()
            rx.internal.operators.v.a = r0
            rx.internal.operators.v$b r0 = new rx.internal.operators.v$b
            r0.<init>()
            rx.internal.operators.v.b = r0
            return
    }

    private v() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> boolean a(rx.f<? super T> r4, java.lang.Object r5) {
            java.lang.Object r0 = rx.internal.operators.v.a
            r1 = 1
            if (r5 != r0) goto L9
            r4.onCompleted()
            return r1
        L9:
            java.lang.Object r0 = rx.internal.operators.v.b
            r2 = 0
            if (r5 != r0) goto L13
            r5 = 0
            r4.onNext(r5)
            return r2
        L13:
            if (r5 == 0) goto L29
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<rx.internal.operators.v$c> r3 = rx.internal.operators.v.c.class
            if (r0 != r3) goto L25
            rx.internal.operators.v$c r5 = (rx.internal.operators.v.c) r5
            java.lang.Throwable r5 = r5.a
            r4.onError(r5)
            return r1
        L25:
            r4.onNext(r5)
            return r2
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The lite notification can not be null"
            r4.<init>(r5)
            throw r4
    }

    public static java.lang.Object b() {
            java.lang.Object r0 = rx.internal.operators.v.a
            return r0
    }

    public static java.lang.Object c(java.lang.Throwable r1) {
            rx.internal.operators.v$c r0 = new rx.internal.operators.v$c
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Throwable d(java.lang.Object r0) {
            rx.internal.operators.v$c r0 = (rx.internal.operators.v.c) r0
            java.lang.Throwable r0 = r0.a
            return r0
    }

    public static <T> T e(java.lang.Object r1) {
            java.lang.Object r0 = rx.internal.operators.v.b
            if (r1 != r0) goto L5
            r1 = 0
        L5:
            return r1
    }

    public static boolean f(java.lang.Object r1) {
            java.lang.Object r0 = rx.internal.operators.v.a
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean g(java.lang.Object r0) {
            boolean r0 = r0 instanceof rx.internal.operators.v.c
            return r0
    }

    public static boolean h(java.lang.Object r1) {
            if (r1 == 0) goto L10
            boolean r0 = g(r1)
            if (r0 != 0) goto L10
            boolean r1 = f(r1)
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean i(java.lang.Object r1) {
            java.lang.Object r0 = rx.internal.operators.v.b
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static <T> java.lang.Object j(T r0) {
            if (r0 != 0) goto L4
            java.lang.Object r0 = rx.internal.operators.v.b
        L4:
            return r0
    }
}
