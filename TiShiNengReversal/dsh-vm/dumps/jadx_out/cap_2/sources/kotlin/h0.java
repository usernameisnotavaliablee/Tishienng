package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class h0<T> implements kotlin.s<T>, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.h0.a d = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.h0<?>, java.lang.Object> e = null;

    @org.jetbrains.annotations.Nullable
    private volatile kotlin.jvm.functions.Function0<? extends T> a;

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.h0$a r0 = new kotlin.h0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.h0.d = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "b"
            java.lang.Class<kotlin.h0> r2 = kotlin.h0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlin.h0.e = r0
            return
    }

    public h0(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.h1 r2 = kotlin.h1.a
            r1.b = r2
            r1.c = r2
            return
    }

    private static /* synthetic */ void a() {
            return
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            kotlin.InitializedLazyImpl r0 = new kotlin.InitializedLazyImpl
            java.lang.Object r1 = r2.getValue()
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.s
    public T getValue() {
            r3 = this;
            java.lang.Object r0 = r3.b
            kotlin.h1 r1 = kotlin.h1.a
            if (r0 == r1) goto L7
            return r0
        L7:
            kotlin.jvm.functions.Function0<? extends T> r0 = r3.a
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.h0<?>, java.lang.Object> r2 = kotlin.h0.e
            boolean r1 = androidx.concurrent.futures.a.a(r2, r3, r1, r0)
            if (r1 == 0) goto L1b
            r1 = 0
            r3.a = r1
            return r0
        L1b:
            java.lang.Object r0 = r3.b
            return r0
    }

    @Override // kotlin.s
    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2.b
            kotlin.h1 r1 = kotlin.h1.a
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
            return r0
    }
}
