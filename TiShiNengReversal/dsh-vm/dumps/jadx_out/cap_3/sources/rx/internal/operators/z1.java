package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class z1<T> implements rx.e.b<T, rx.Notification<T>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<rx.Notification<T>> {
        boolean a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.z1 c;

        a(rx.internal.operators.z1 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                return
        }

        public void g(rx.Notification<T> r4) {
                r3 = this;
                int[] r0 = rx.internal.operators.z1.b.a
                rx.Notification$Kind r1 = r4.f()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L3b
                r1 = 2
                if (r0 == r1) goto L33
                r1 = 3
                if (r0 == r1) goto L2f
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported notification type: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                r3.onError(r0)
                return
            L2f:
                r3.onCompleted()
                return
            L33:
                java.lang.Throwable r4 = r4.g()
                r3.onError(r4)
                return
            L3b:
                boolean r0 = r3.a
                if (r0 != 0) goto L48
                rx.l r0 = r3.b
                java.lang.Object r4 = r4.h()
                r0.onNext(r4)
            L48:
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
                if (r0 != 0) goto Lc
                r0 = 1
                r1.a = r0
                rx.l r0 = r1.b
                r0.onError(r2)
            Lc:
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.Notification r1 = (rx.Notification) r1
                r0.g(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a = null;

        static {
                rx.Notification$Kind[] r0 = rx.Notification.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rx.internal.operators.z1.b.a = r0
                rx.Notification$Kind r1 = rx.Notification.Kind.OnNext     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = rx.internal.operators.z1.b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                rx.Notification$Kind r1 = rx.Notification.Kind.OnError     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = rx.internal.operators.z1.b.a     // Catch: java.lang.NoSuchFieldError -> L28
                rx.Notification$Kind r1 = rx.Notification.Kind.OnCompleted     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c {
        static final rx.internal.operators.z1<java.lang.Object> a = null;

        static {
                rx.internal.operators.z1 r0 = new rx.internal.operators.z1
                r0.<init>()
                rx.internal.operators.z1.c.a = r0
                return
        }

        c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    z1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static rx.internal.operators.z1 a() {
            rx.internal.operators.z1<java.lang.Object> r0 = rx.internal.operators.z1.c.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super rx.Notification<T>> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.z1$a r0 = new rx.internal.operators.z1$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
