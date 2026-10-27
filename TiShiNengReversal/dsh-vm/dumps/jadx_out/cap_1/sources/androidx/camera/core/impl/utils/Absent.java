package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Absent<T> extends androidx.camera.core.impl.utils.Optional<T> {
    static final androidx.camera.core.impl.utils.Absent<java.lang.Object> sInstance = null;
    private static final long serialVersionUID = 0;

    static {
            androidx.camera.core.impl.utils.Absent r0 = new androidx.camera.core.impl.utils.Absent
            r0.<init>()
            androidx.camera.core.impl.utils.Absent.sInstance = r0
            return
    }

    private Absent() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            androidx.camera.core.impl.utils.Absent<java.lang.Object> r0 = androidx.camera.core.impl.utils.Absent.sInstance
            return r0
    }

    static <T> androidx.camera.core.impl.utils.Optional<T> withType() {
            androidx.camera.core.impl.utils.Absent<java.lang.Object> r0 = androidx.camera.core.impl.utils.Absent.sInstance
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public T get() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Optional.get() cannot be called on an absent value"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
            r1 = this;
            r0 = 2040732332(0x79a31aac, float:1.0586067E35)
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.utils.Optional<T> or(@androidx.annotation.NonNull androidx.camera.core.impl.utils.Optional<? extends T> r1) {
            r0 = this;
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.camera.core.impl.utils.Optional r1 = (androidx.camera.core.impl.utils.Optional) r1
            return r1
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public T or(@androidx.annotation.NonNull androidx.core.util.Supplier<? extends T> r2) {
            r1 = this;
            java.lang.Object r2 = r2.get()
            java.lang.String r0 = "use Optional.orNull() instead of a Supplier that returns null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2, r0)
            return r2
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public T or(@androidx.annotation.NonNull T r2) {
            r1 = this;
            java.lang.String r0 = "use Optional.orNull() instead of Optional.or(null)"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2, r0)
            return r2
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.Nullable
    public T orNull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.core.impl.utils.Optional
    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Optional.absent()"
            return r0
    }
}
