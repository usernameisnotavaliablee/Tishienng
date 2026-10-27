package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnsafeLazyImpl<T> implements kotlin.s<T>, java.io.Serializable {

    @org.jetbrains.annotations.Nullable
    private java.lang.Object _value;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<? extends T> initializer;

    public UnsafeLazyImpl(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.initializer = r2
            kotlin.h1 r2 = kotlin.h1.a
            r1._value = r2
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
            r2 = this;
            java.lang.Object r0 = r2._value
            kotlin.h1 r1 = kotlin.h1.a
            if (r0 != r1) goto L14
            kotlin.jvm.functions.Function0<? extends T> r0 = r2.initializer
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Object r0 = r0.invoke()
            r2._value = r0
            r0 = 0
            r2.initializer = r0
        L14:
            java.lang.Object r0 = r2._value
            return r0
    }

    @Override // kotlin.s
    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2._value
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
