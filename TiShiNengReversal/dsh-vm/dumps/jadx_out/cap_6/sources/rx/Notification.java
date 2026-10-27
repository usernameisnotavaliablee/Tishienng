package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Notification<T> {
    private static final rx.Notification<java.lang.Void> d = null;
    private final rx.Notification.Kind a;
    private final java.lang.Throwable b;
    private final T c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Kind extends java.lang.Enum<rx.Notification.Kind> {
        private static final /* synthetic */ rx.Notification.Kind[] $VALUES = null;
        public static final rx.Notification.Kind OnCompleted = null;
        public static final rx.Notification.Kind OnError = null;
        public static final rx.Notification.Kind OnNext = null;

        static {
                rx.Notification$Kind r0 = new rx.Notification$Kind
                java.lang.String r1 = "OnNext"
                r2 = 0
                r0.<init>(r1, r2)
                rx.Notification.Kind.OnNext = r0
                rx.Notification$Kind r1 = new rx.Notification$Kind
                java.lang.String r3 = "OnError"
                r4 = 1
                r1.<init>(r3, r4)
                rx.Notification.Kind.OnError = r1
                rx.Notification$Kind r3 = new rx.Notification$Kind
                java.lang.String r5 = "OnCompleted"
                r6 = 2
                r3.<init>(r5, r6)
                rx.Notification.Kind.OnCompleted = r3
                r5 = 3
                rx.Notification$Kind[] r5 = new rx.Notification.Kind[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                rx.Notification.Kind.$VALUES = r5
                return
        }

        Kind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static rx.Notification.Kind valueOf(java.lang.String r1) {
                java.lang.Class<rx.Notification$Kind> r0 = rx.Notification.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                rx.Notification$Kind r1 = (rx.Notification.Kind) r1
                return r1
        }

        public static rx.Notification.Kind[] values() {
                rx.Notification$Kind[] r0 = rx.Notification.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                rx.Notification$Kind[] r0 = (rx.Notification.Kind[]) r0
                return r0
        }
    }

    static {
            rx.Notification r0 = new rx.Notification
            rx.Notification$Kind r1 = rx.Notification.Kind.OnCompleted
            r2 = 0
            r0.<init>(r1, r2, r2)
            rx.Notification.d = r0
            return
    }

    private Notification(rx.Notification.Kind r1, T r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.c = r2
            r0.b = r3
            r0.a = r1
            return
    }

    public static <T> rx.Notification<T> b() {
            rx.Notification<java.lang.Void> r0 = rx.Notification.d
            return r0
    }

    @java.lang.Deprecated
    public static <T> rx.Notification<T> c(java.lang.Class<T> r0) {
            rx.Notification<java.lang.Void> r0 = rx.Notification.d
            return r0
    }

    public static <T> rx.Notification<T> d(java.lang.Throwable r3) {
            rx.Notification r0 = new rx.Notification
            rx.Notification$Kind r1 = rx.Notification.Kind.OnError
            r2 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T> rx.Notification<T> e(T r3) {
            rx.Notification r0 = new rx.Notification
            rx.Notification$Kind r1 = rx.Notification.Kind.OnNext
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    public void a(rx.f<? super T> r3) {
            r2 = this;
            rx.Notification$Kind r0 = r2.a
            rx.Notification$Kind r1 = rx.Notification.Kind.OnNext
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.h()
            r3.onNext(r0)
            return
        Le:
            rx.Notification$Kind r1 = rx.Notification.Kind.OnCompleted
            if (r0 != r1) goto L16
            r3.onCompleted()
            return
        L16:
            java.lang.Throwable r0 = r2.g()
            r3.onError(r0)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<rx.Notification> r3 = rx.Notification.class
            if (r2 == r3) goto L11
            return r0
        L11:
            rx.Notification r5 = (rx.Notification) r5
            rx.Notification$Kind r2 = r5.f()
            rx.Notification$Kind r3 = r4.f()
            if (r2 != r3) goto L3a
            T r2 = r4.c
            T r3 = r5.c
            if (r2 == r3) goto L2b
            if (r2 == 0) goto L3a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.Throwable r2 = r4.b
            java.lang.Throwable r5 = r5.b
            if (r2 == r5) goto L39
            if (r2 == 0) goto L3a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3a
        L39:
            return r1
        L3a:
            return r0
    }

    public rx.Notification.Kind f() {
            r1 = this;
            rx.Notification$Kind r0 = r1.a
            return r0
    }

    public java.lang.Throwable g() {
            r1 = this;
            java.lang.Throwable r0 = r1.b
            return r0
    }

    public T h() {
            r1 = this;
            T r0 = r1.c
            return r0
    }

    public int hashCode() {
            r2 = this;
            rx.Notification$Kind r0 = r2.f()
            int r0 = r0.hashCode()
            boolean r1 = r2.j()
            if (r1 == 0) goto L19
            int r0 = r0 * 31
            java.lang.Object r1 = r2.h()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L19:
            boolean r1 = r2.i()
            if (r1 == 0) goto L2a
            int r0 = r0 * 31
            java.lang.Throwable r1 = r2.g()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L2a:
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.l()
            if (r0 == 0) goto Lc
            java.lang.Throwable r0 = r1.b
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.m()
            if (r0 == 0) goto Lc
            T r0 = r1.c
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean k() {
            r2 = this;
            rx.Notification$Kind r0 = r2.f()
            rx.Notification$Kind r1 = rx.Notification.Kind.OnCompleted
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean l() {
            r2 = this;
            rx.Notification$Kind r0 = r2.f()
            rx.Notification$Kind r1 = rx.Notification.Kind.OnError
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean m() {
            r2 = this;
            rx.Notification$Kind r0 = r2.f()
            rx.Notification$Kind r1 = rx.Notification.Kind.OnNext
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            rx.Notification$Kind r2 = r3.f()
            r0.append(r2)
            boolean r2 = r3.j()
            if (r2 == 0) goto L2f
            r0.append(r1)
            java.lang.Object r2 = r3.h()
            r0.append(r2)
        L2f:
            boolean r2 = r3.i()
            if (r2 == 0) goto L43
            r0.append(r1)
            java.lang.Throwable r1 = r3.g()
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
        L43:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
