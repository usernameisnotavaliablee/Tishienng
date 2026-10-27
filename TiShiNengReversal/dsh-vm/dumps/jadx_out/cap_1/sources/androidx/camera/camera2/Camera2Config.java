package androidx.camera.camera2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2Config {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final class DefaultProvider implements androidx.camera.core.CameraXConfig.Provider {
        public DefaultProvider() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.CameraXConfig.Provider
        @androidx.annotation.NonNull
        public androidx.camera.core.CameraXConfig getCameraXConfig() {
                r1 = this;
                androidx.camera.core.CameraXConfig r0 = androidx.camera.camera2.Camera2Config.defaultConfig()
                return r0
        }
    }

    private Camera2Config() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.camera.core.impl.UseCaseConfigFactory a(android.content.Context r1) {
            androidx.camera.camera2.internal.Camera2UseCaseConfigFactory r0 = new androidx.camera.camera2.internal.Camera2UseCaseConfigFactory
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ androidx.camera.core.impl.CameraDeviceSurfaceManager b(android.content.Context r1, java.lang.Object r2, java.util.Set r3) {
            androidx.camera.camera2.internal.Camera2DeviceSurfaceManager r0 = new androidx.camera.camera2.internal.Camera2DeviceSurfaceManager     // Catch: androidx.camera.core.CameraUnavailableException -> L6
            r0.<init>(r1, r2, r3)     // Catch: androidx.camera.core.CameraUnavailableException -> L6
            return r0
        L6:
            r1 = move-exception
            androidx.camera.core.InitializationException r2 = new androidx.camera.core.InitializationException
            r2.<init>(r1)
            throw r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraXConfig defaultConfig() {
            b.a r0 = new b.a
            r0.<init>()
            b.b r1 = new b.b
            r1.<init>()
            b.c r2 = new b.c
            r2.<init>()
            androidx.camera.core.CameraXConfig$Builder r3 = new androidx.camera.core.CameraXConfig$Builder
            r3.<init>()
            androidx.camera.core.CameraXConfig$Builder r0 = r3.setCameraFactoryProvider(r0)
            androidx.camera.core.CameraXConfig$Builder r0 = r0.setDeviceSurfaceManagerProvider(r1)
            androidx.camera.core.CameraXConfig$Builder r0 = r0.setUseCaseConfigFactoryProvider(r2)
            androidx.camera.core.CameraXConfig r0 = r0.build()
            return r0
    }
}
