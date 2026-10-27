package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface TargetConfig<T> extends androidx.camera.core.impl.ReadableConfig {

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.camera.core.impl.Config.Option<java.lang.Class<?>> OPTION_TARGET_CLASS = null;

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.camera.core.impl.Config.Option<java.lang.String> OPTION_TARGET_NAME = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<T, B> {
        @androidx.annotation.NonNull
        B setTargetClass(@androidx.annotation.NonNull java.lang.Class<T> r1);

        @androidx.annotation.NonNull
        B setTargetName(@androidx.annotation.NonNull java.lang.String r1);
    }

    static {
            java.lang.String r0 = "camerax.core.target.name"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME = r0
            java.lang.String r0 = "camerax.core.target.class"
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS = r0
            return
    }

    @androidx.annotation.NonNull
    java.lang.Class<T> getTargetClass();

    @androidx.annotation.Nullable
    java.lang.Class<T> getTargetClass(@androidx.annotation.Nullable java.lang.Class<T> r1);

    @androidx.annotation.NonNull
    java.lang.String getTargetName();

    @androidx.annotation.Nullable
    java.lang.String getTargetName(@androidx.annotation.Nullable java.lang.String r1);
}
