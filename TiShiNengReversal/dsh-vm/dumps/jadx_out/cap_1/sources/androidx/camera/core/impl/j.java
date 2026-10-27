package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class j {
    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraControl a(androidx.camera.core.impl.CameraInternal r0) {
            androidx.camera.core.impl.CameraControlInternal r0 = r0.getCameraControlInternal()
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraInfo b(androidx.camera.core.impl.CameraInternal r0) {
            androidx.camera.core.impl.CameraInfoInternal r0 = r0.getCameraInfoInternal()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.LinkedHashSet c(androidx.camera.core.impl.CameraInternal r1) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraConfig d(androidx.camera.core.impl.CameraInternal r0) {
            androidx.camera.core.impl.CameraConfig r0 = androidx.camera.core.impl.CameraConfigs.emptyConfig()
            return r0
    }

    public static boolean e(androidx.camera.core.impl.CameraInternal r0) {
            r0 = 1
            return r0
    }

    public static boolean f(androidx.camera.core.impl.CameraInternal r0) {
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()
            int r0 = r0.getLensFacing()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static void g(androidx.camera.core.impl.CameraInternal r0, boolean r1) {
            return
    }

    public static void h(androidx.camera.core.impl.CameraInternal r0, @androidx.annotation.Nullable androidx.camera.core.impl.CameraConfig r1) {
            return
    }
}
