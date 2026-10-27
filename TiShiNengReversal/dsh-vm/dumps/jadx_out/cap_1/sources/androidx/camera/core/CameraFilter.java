package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraFilter {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.camera.core.impl.Identifier DEFAULT_ID = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.camera.core.impl.Identifier r0 = androidx.camera.core.impl.Identifier.create(r0)
            androidx.camera.core.CameraFilter.DEFAULT_ID = r0
            return
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.CameraInfo> filter(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r1);

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    androidx.camera.core.impl.Identifier getIdentifier();
}
