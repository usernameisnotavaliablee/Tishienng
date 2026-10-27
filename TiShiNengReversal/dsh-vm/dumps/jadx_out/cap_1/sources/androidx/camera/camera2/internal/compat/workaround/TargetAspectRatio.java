package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TargetAspectRatio {
    public static final int RATIO_16_9 = 1;
    public static final int RATIO_4_3 = 0;
    public static final int RATIO_MAX_JPEG = 2;
    public static final int RATIO_ORIGINAL = 3;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Ratio {
    }

    public TargetAspectRatio() {
            r0 = this;
            r0.<init>()
            return
    }

    public int get(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3) {
            r1 = this;
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) r0
            if (r0 == 0) goto Lf
            int r2 = r0.getCorrectedAspectRatio()
            return r2
        Lf:
            androidx.camera.core.impl.Quirks r2 = androidx.camera.camera2.internal.compat.quirk.CameraQuirks.get(r2, r3)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r3 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            androidx.camera.core.impl.Quirk r2 = r2.get(r3)
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r2 = (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk) r2
            if (r2 == 0) goto L22
            int r2 = r2.getCorrectedAspectRatio()
            return r2
        L22:
            r2 = 3
            return r2
    }
}
