package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    Optional() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <T> androidx.camera.core.impl.utils.Optional<T> absent() {
            androidx.camera.core.impl.utils.Optional r0 = androidx.camera.core.impl.utils.Absent.withType()
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> androidx.camera.core.impl.utils.Optional<T> fromNullable(@androidx.annotation.Nullable T r1) {
            if (r1 != 0) goto L7
            androidx.camera.core.impl.utils.Optional r1 = absent()
            return r1
        L7:
            androidx.camera.core.impl.utils.Present r0 = new androidx.camera.core.impl.utils.Present
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> androidx.camera.core.impl.utils.Optional<T> of(@androidx.annotation.NonNull T r1) {
            androidx.camera.core.impl.utils.Present r0 = new androidx.camera.core.impl.utils.Present
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            r0.<init>(r1)
            return r0
    }

    public abstract boolean equals(@androidx.annotation.Nullable java.lang.Object r1);

    @androidx.annotation.NonNull
    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.utils.Optional<T> or(@androidx.annotation.NonNull androidx.camera.core.impl.utils.Optional<? extends T> r1);

    @androidx.annotation.NonNull
    public abstract T or(@androidx.annotation.NonNull androidx.core.util.Supplier<? extends T> r1);

    @androidx.annotation.NonNull
    public abstract T or(@androidx.annotation.NonNull T r1);

    @androidx.annotation.Nullable
    public abstract T orNull();

    @androidx.annotation.NonNull
    public abstract java.lang.String toString();
}
