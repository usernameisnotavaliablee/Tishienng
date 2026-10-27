package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraMode {
    public static final int CONCURRENT_CAMERA = 1;
    public static final int DEFAULT = 0;
    public static final int ULTRA_HIGH_RESOLUTION_CAMERA = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private CameraMode() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String toLabelString(int r1) {
            r0 = 1
            if (r1 == r0) goto Lc
            r0 = 2
            if (r1 == r0) goto L9
            java.lang.String r1 = "DEFAULT"
            return r1
        L9:
            java.lang.String r1 = "ULTRA_HIGH_RESOLUTION_CAMERA"
            return r1
        Lc:
            java.lang.String r1 = "CONCURRENT_CAMERA"
            return r1
    }
}
