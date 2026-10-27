package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ShaderProvider {
    public static final androidx.camera.core.processing.ShaderProvider DEFAULT = null;


    static {
            androidx.camera.core.processing.ShaderProvider$1 r0 = new androidx.camera.core.processing.ShaderProvider$1
            r0.<init>()
            androidx.camera.core.processing.ShaderProvider.DEFAULT = r0
            return
    }

    @androidx.annotation.Nullable
    java.lang.String createFragmentShader(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2);
}
