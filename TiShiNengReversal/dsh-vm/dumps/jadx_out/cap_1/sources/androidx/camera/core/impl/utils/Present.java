package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Present<T> extends androidx.camera.core.impl.utils.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T mReference;

    Present(T r1) {
            r0 = this;
            r0.<init>()
            r0.mReference = r1
            return
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.camera.core.impl.utils.Present
            if (r0 == 0) goto Lf
            androidx.camera.core.impl.utils.Present r2 = (androidx.camera.core.impl.utils.Present) r2
            T r0 = r1.mReference
            T r2 = r2.mReference
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public T get() {
            r1 = this;
            T r0 = r1.mReference
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
            r2 = this;
            T r0 = r2.mReference
            int r0 = r0.hashCode()
            r1 = 1502476572(0x598df91c, float:4.995234E15)
            int r0 = r0 + r1
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.utils.Optional<T> or(@androidx.annotation.NonNull androidx.camera.core.impl.utils.Optional<? extends T> r1) {
            r0 = this;
            androidx.core.util.Preconditions.checkNotNull(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public T or(@androidx.annotation.NonNull androidx.core.util.Supplier<? extends T> r1) {
            r0 = this;
            androidx.core.util.Preconditions.checkNotNull(r1)
            T r1 = r0.mReference
            return r1
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public T or(@androidx.annotation.NonNull T r2) {
            r1 = this;
            java.lang.String r0 = "use Optional.orNull() instead of Optional.or(null)"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            T r2 = r1.mReference
            return r2
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
            r1 = this;
            T r0 = r1.mReference
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Optional.of("
            r0.append(r1)
            T r1 = r2.mReference
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
