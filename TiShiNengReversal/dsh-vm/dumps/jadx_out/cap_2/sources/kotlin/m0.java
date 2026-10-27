package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m0<T> implements kotlin.s<T>, java.io.Serializable {

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<? extends T> a;

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object c;

    public m0(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.h1 r2 = kotlin.h1.a
            r1.b = r2
            if (r3 != 0) goto L11
            r3 = r1
        L11:
            r1.c = r3
            return
    }

    public /* synthetic */ m0(kotlin.jvm.functions.Function0 r1, java.lang.Object r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
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
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            java.lang.Object r2 = r3.b     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            kotlin.jvm.functions.Function0<? extends T> r1 = r3.a     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.invoke()     // Catch: java.lang.Throwable -> L1f
            r3.b = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.a = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
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
