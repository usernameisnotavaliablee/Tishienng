package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ExtendedCameraConfigProviderStore {

    @androidx.annotation.GuardedBy("LOCK")
    private static final java.util.Map<java.lang.Object, androidx.camera.core.impl.CameraConfigProvider> CAMERA_CONFIG_PROVIDERS = null;
    private static final java.lang.Object LOCK = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.camera.core.impl.ExtendedCameraConfigProviderStore.LOCK = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.core.impl.ExtendedCameraConfigProviderStore.CAMERA_CONFIG_PROVIDERS = r0
            return
    }

    private ExtendedCameraConfigProviderStore() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addConfig(@androidx.annotation.NonNull java.lang.Object r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraConfigProvider r3) {
            java.lang.Object r0 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.Object, androidx.camera.core.impl.CameraConfigProvider> r1 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.CAMERA_CONFIG_PROVIDERS     // Catch: java.lang.Throwable -> La
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public static void clear() {
            java.lang.Object r0 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.Object, androidx.camera.core.impl.CameraConfigProvider> r1 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.CAMERA_CONFIG_PROVIDERS     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraConfigProvider getConfigProvider(@androidx.annotation.NonNull java.lang.Object r2) {
            java.lang.Object r0 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.Object, androidx.camera.core.impl.CameraConfigProvider> r1 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.CAMERA_CONFIG_PROVIDERS     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            androidx.camera.core.impl.CameraConfigProvider r2 = (androidx.camera.core.impl.CameraConfigProvider) r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L10
            androidx.camera.core.impl.CameraConfigProvider r2 = androidx.camera.core.impl.CameraConfigProvider.EMPTY
        L10:
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }
}
