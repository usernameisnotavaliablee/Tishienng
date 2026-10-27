package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum InternalObservableUtils extends java.lang.Enum<rx.internal.util.InternalObservableUtils> {
    private static final /* synthetic */ rx.internal.util.InternalObservableUtils[] $VALUES = null;
    public static final rx.internal.util.InternalObservableUtils.g COUNTER = null;
    static final rx.internal.util.InternalObservableUtils.e ERROR_EXTRACTOR = null;
    public static final rx.functions.b<java.lang.Throwable> ERROR_NOT_IMPLEMENTED = null;
    public static final rx.e.b<java.lang.Boolean, java.lang.Object> IS_EMPTY = null;
    public static final rx.internal.util.InternalObservableUtils.h LONG_COUNTER = null;
    public static final rx.internal.util.InternalObservableUtils.f OBJECT_EQUALS = null;
    static final rx.internal.util.InternalObservableUtils.o RETURNS_VOID = null;
    public static final rx.internal.util.InternalObservableUtils.q TO_ARRAY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, R> implements rx.functions.q<R, T, R> {
        final rx.functions.c<R, ? super T> a;

        public a(rx.functions.c<R, ? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public R call(R r2, T r3) {
                r1 = this;
                rx.functions.c<R, ? super T> r0 = r1.a
                r0.call(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements rx.functions.p<java.lang.Object, java.lang.Boolean> {
        final java.lang.Object a;

        public b(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.lang.Boolean call(java.lang.Object r2) {
                r1 = this;
                java.lang.Object r0 = r1.a
                if (r2 == r0) goto Lf
                if (r2 == 0) goto Ld
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                goto L10
            Lf:
                r2 = 1
            L10:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        /* renamed from: call, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m24call(java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.call(r1)
                return r1
        }
    }


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d implements rx.functions.p<java.lang.Object, java.lang.Boolean> {
        final java.lang.Class<?> a;

        public d(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.lang.Boolean call(java.lang.Object r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.a
                boolean r2 = r0.isInstance(r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        /* renamed from: call, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m25call(java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.call(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e implements rx.functions.p<rx.Notification<?>, java.lang.Throwable> {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.Notification r1 = (rx.Notification) r1
                java.lang.Throwable r1 = r0.call(r1)
                return r1
        }

        public java.lang.Throwable call(rx.Notification<?> r1) {
                r0 = this;
                java.lang.Throwable r1 = r1.g()
                return r1
        }
    }




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class i implements rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> {
        final rx.functions.p<? super rx.e<? extends java.lang.Void>, ? extends rx.e<?>> a;

        public i(rx.functions.p<? super rx.e<? extends java.lang.Void>, ? extends rx.e<?>> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<?> call(rx.e<? extends rx.Notification<?>> r3) {
                r2 = this;
                rx.functions.p<? super rx.e<? extends java.lang.Void>, ? extends rx.e<?>> r0 = r2.a
                rx.internal.util.InternalObservableUtils$o r1 = rx.internal.util.InternalObservableUtils.RETURNS_VOID
                rx.e r3 = r3.c3(r1)
                java.lang.Object r3 = r0.call(r3)
                rx.e r3 = (rx.e) r3
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class j<T> implements rx.functions.o<rx.observables.c<T>> {
        private final rx.e<T> a;
        private final int b;

        j(rx.e<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.observables.c r0 = r1.m27call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.observables.c<T> m27call() {
                r2 = this;
                rx.e<T> r0 = r2.a
                int r1 = r2.b
                rx.observables.c r0 = r0.v4(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class k<T> implements rx.functions.o<rx.observables.c<T>> {
        private final java.util.concurrent.TimeUnit a;
        private final rx.e<T> b;
        private final long c;
        private final rx.h d;

        k(rx.e<T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5) {
                r0 = this;
                r0.<init>()
                r0.a = r4
                r0.b = r1
                r0.c = r2
                r0.d = r5
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.observables.c r0 = r1.m28call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.observables.c<T> m28call() {
                r5 = this;
                rx.e<T> r0 = r5.b
                long r1 = r5.c
                java.util.concurrent.TimeUnit r3 = r5.a
                rx.h r4 = r5.d
                rx.observables.c r0 = r0.A4(r1, r3, r4)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class l<T> implements rx.functions.o<rx.observables.c<T>> {
        private final rx.e<T> a;

        l(rx.e<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.observables.c r0 = r1.m29call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.observables.c<T> m29call() {
                r1 = this;
                rx.e<T> r0 = r1.a
                rx.observables.c r0 = r0.u4()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class m<T> implements rx.functions.o<rx.observables.c<T>> {
        private final long a;
        private final java.util.concurrent.TimeUnit b;
        private final rx.h c;
        private final int d;
        private final rx.e<T> e;

        m(rx.e<T> r1, int r2, long r3, java.util.concurrent.TimeUnit r5, rx.h r6) {
                r0 = this;
                r0.<init>()
                r0.a = r3
                r0.b = r5
                r0.c = r6
                r0.d = r2
                r0.e = r1
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.observables.c r0 = r1.m30call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.observables.c<T> m30call() {
                r6 = this;
                rx.e<T> r0 = r6.e
                int r1 = r6.d
                long r2 = r6.a
                java.util.concurrent.TimeUnit r4 = r6.b
                rx.h r5 = r6.c
                rx.observables.c r0 = r0.x4(r1, r2, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class n implements rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> {
        final rx.functions.p<? super rx.e<? extends java.lang.Throwable>, ? extends rx.e<?>> a;

        public n(rx.functions.p<? super rx.e<? extends java.lang.Throwable>, ? extends rx.e<?>> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<?> call(rx.e<? extends rx.Notification<?>> r3) {
                r2 = this;
                rx.functions.p<? super rx.e<? extends java.lang.Throwable>, ? extends rx.e<?>> r0 = r2.a
                rx.internal.util.InternalObservableUtils$e r1 = rx.internal.util.InternalObservableUtils.ERROR_EXTRACTOR
                rx.e r3 = r3.c3(r1)
                java.lang.Object r3 = r0.call(r3)
                rx.e r3 = (rx.e) r3
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class o implements rx.functions.p<java.lang.Object, java.lang.Void> {
        o() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                java.lang.Void r1 = r0.m31call(r1)
                return r1
        }

        /* renamed from: call, reason: collision with other method in class */
        public java.lang.Void m31call(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class p<T, R> implements rx.functions.p<rx.e<T>, rx.e<R>> {
        final rx.functions.p<? super rx.e<T>, ? extends rx.e<R>> a;
        final rx.h b;

        public p(rx.functions.p<? super rx.e<T>, ? extends rx.e<R>> r1, rx.h r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<R> call(rx.e<T> r2) {
                r1 = this;
                rx.functions.p<? super rx.e<T>, ? extends rx.e<R>> r0 = r1.a
                java.lang.Object r2 = r0.call(r2)
                rx.e r2 = (rx.e) r2
                rx.h r0 = r1.b
                rx.e r2 = r2.I3(r0)
                return r2
        }
    }


    static {
            r0 = 0
            rx.internal.util.InternalObservableUtils[] r0 = new rx.internal.util.InternalObservableUtils[r0]
            rx.internal.util.InternalObservableUtils.$VALUES = r0
            rx.internal.util.InternalObservableUtils$h r0 = new rx.internal.util.InternalObservableUtils$h
            r0.<init>()
            rx.internal.util.InternalObservableUtils.LONG_COUNTER = r0
            rx.internal.util.InternalObservableUtils$f r0 = new rx.internal.util.InternalObservableUtils$f
            r0.<init>()
            rx.internal.util.InternalObservableUtils.OBJECT_EQUALS = r0
            rx.internal.util.InternalObservableUtils$q r0 = new rx.internal.util.InternalObservableUtils$q
            r0.<init>()
            rx.internal.util.InternalObservableUtils.TO_ARRAY = r0
            rx.internal.util.InternalObservableUtils$o r0 = new rx.internal.util.InternalObservableUtils$o
            r0.<init>()
            rx.internal.util.InternalObservableUtils.RETURNS_VOID = r0
            rx.internal.util.InternalObservableUtils$g r0 = new rx.internal.util.InternalObservableUtils$g
            r0.<init>()
            rx.internal.util.InternalObservableUtils.COUNTER = r0
            rx.internal.util.InternalObservableUtils$e r0 = new rx.internal.util.InternalObservableUtils$e
            r0.<init>()
            rx.internal.util.InternalObservableUtils.ERROR_EXTRACTOR = r0
            rx.internal.util.InternalObservableUtils$c r0 = new rx.internal.util.InternalObservableUtils$c
            r0.<init>()
            rx.internal.util.InternalObservableUtils.ERROR_NOT_IMPLEMENTED = r0
            rx.internal.operators.o1 r0 = new rx.internal.operators.o1
            rx.functions.p r1 = rx.internal.util.n.b()
            r2 = 1
            r0.<init>(r1, r2)
            rx.internal.util.InternalObservableUtils.IS_EMPTY = r0
            return
    }

    InternalObservableUtils(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T, R> rx.functions.q<R, T, R> createCollectorCaller(rx.functions.c<R, ? super T> r1) {
            rx.internal.util.InternalObservableUtils$a r0 = new rx.internal.util.InternalObservableUtils$a
            r0.<init>(r1)
            return r0
    }

    public static rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> createRepeatDematerializer(rx.functions.p<? super rx.e<? extends java.lang.Void>, ? extends rx.e<?>> r1) {
            rx.internal.util.InternalObservableUtils$i r0 = new rx.internal.util.InternalObservableUtils$i
            r0.<init>(r1)
            return r0
    }

    public static <T, R> rx.functions.p<rx.e<T>, rx.e<R>> createReplaySelectorAndObserveOn(rx.functions.p<? super rx.e<T>, ? extends rx.e<R>> r1, rx.h r2) {
            rx.internal.util.InternalObservableUtils$p r0 = new rx.internal.util.InternalObservableUtils$p
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> rx.functions.o<rx.observables.c<T>> createReplaySupplier(rx.e<T> r1) {
            rx.internal.util.InternalObservableUtils$l r0 = new rx.internal.util.InternalObservableUtils$l
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.functions.o<rx.observables.c<T>> createReplaySupplier(rx.e<T> r1, int r2) {
            rx.internal.util.InternalObservableUtils$j r0 = new rx.internal.util.InternalObservableUtils$j
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> rx.functions.o<rx.observables.c<T>> createReplaySupplier(rx.e<T> r7, int r8, long r9, java.util.concurrent.TimeUnit r11, rx.h r12) {
            rx.internal.util.InternalObservableUtils$m r0 = new rx.internal.util.InternalObservableUtils$m
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
    }

    public static <T> rx.functions.o<rx.observables.c<T>> createReplaySupplier(rx.e<T> r6, long r7, java.util.concurrent.TimeUnit r9, rx.h r10) {
            rx.internal.util.InternalObservableUtils$k r0 = new rx.internal.util.InternalObservableUtils$k
            r1 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public static rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> createRetryDematerializer(rx.functions.p<? super rx.e<? extends java.lang.Throwable>, ? extends rx.e<?>> r1) {
            rx.internal.util.InternalObservableUtils$n r0 = new rx.internal.util.InternalObservableUtils$n
            r0.<init>(r1)
            return r0
    }

    public static rx.functions.p<java.lang.Object, java.lang.Boolean> equalsWith(java.lang.Object r1) {
            rx.internal.util.InternalObservableUtils$b r0 = new rx.internal.util.InternalObservableUtils$b
            r0.<init>(r1)
            return r0
    }

    public static rx.functions.p<java.lang.Object, java.lang.Boolean> isInstanceOf(java.lang.Class<?> r1) {
            rx.internal.util.InternalObservableUtils$d r0 = new rx.internal.util.InternalObservableUtils$d
            r0.<init>(r1)
            return r0
    }

    public static rx.internal.util.InternalObservableUtils valueOf(java.lang.String r1) {
            java.lang.Class<rx.internal.util.InternalObservableUtils> r0 = rx.internal.util.InternalObservableUtils.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rx.internal.util.InternalObservableUtils r1 = (rx.internal.util.InternalObservableUtils) r1
            return r1
    }

    public static rx.internal.util.InternalObservableUtils[] values() {
            rx.internal.util.InternalObservableUtils[] r0 = rx.internal.util.InternalObservableUtils.$VALUES
            java.lang.Object r0 = r0.clone()
            rx.internal.util.InternalObservableUtils[] r0 = (rx.internal.util.InternalObservableUtils[]) r0
            return r0
    }
}
