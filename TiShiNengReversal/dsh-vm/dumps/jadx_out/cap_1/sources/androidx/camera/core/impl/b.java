package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class b {
    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SessionProcessor a(androidx.camera.core.impl.CameraConfig r1) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionProcessor> r0 = androidx.camera.core.impl.CameraConfig.OPTION_SESSION_PROCESSOR
            java.lang.Object r1 = r1.retrieveOption(r0)
            androidx.camera.core.impl.SessionProcessor r1 = (androidx.camera.core.impl.SessionProcessor) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.impl.SessionProcessor b(androidx.camera.core.impl.CameraConfig r1, @androidx.annotation.Nullable androidx.camera.core.impl.SessionProcessor r2) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionProcessor> r0 = androidx.camera.core.impl.CameraConfig.OPTION_SESSION_PROCESSOR
            java.lang.Object r1 = r1.retrieveOption(r0, r2)
            androidx.camera.core.impl.SessionProcessor r1 = (androidx.camera.core.impl.SessionProcessor) r1
            return r1
    }

    public static int c(androidx.camera.core.impl.CameraConfig r2) {
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.retrieveOption(r0, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.UseCaseConfigFactory d(androidx.camera.core.impl.CameraConfig r2) {
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory> r0 = androidx.camera.core.impl.CameraConfig.OPTION_USECASE_CONFIG_FACTORY
            androidx.camera.core.impl.UseCaseConfigFactory r1 = androidx.camera.core.impl.UseCaseConfigFactory.EMPTY_INSTANCE
            java.lang.Object r2 = r2.retrieveOption(r0, r1)
            androidx.camera.core.impl.UseCaseConfigFactory r2 = (androidx.camera.core.impl.UseCaseConfigFactory) r2
            return r2
    }
}
