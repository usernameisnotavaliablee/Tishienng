package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class InitializedLazyImpl<T> implements kotlin.s<T>, java.io.Serializable {
    private final T value;

    public InitializedLazyImpl(T r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // kotlin.s
    public T getValue() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    @Override // kotlin.s
    public boolean isInitialized() {
            r1 = this;
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
