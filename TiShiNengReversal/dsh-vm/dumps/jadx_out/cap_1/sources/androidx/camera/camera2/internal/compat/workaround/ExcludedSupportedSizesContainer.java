package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExcludedSupportedSizesContainer {

    @androidx.annotation.NonNull
    private final java.lang.String mCameraId;

    public ExcludedSupportedSizesContainer(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraId = r1
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> get(int r3) {
            r2 = this;
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk) r0
            if (r0 != 0) goto L10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L10:
            java.lang.String r1 = r2.mCameraId
            java.util.List r3 = r0.getExcludedSizes(r1, r3)
            return r3
    }

    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> get(@androidx.annotation.NonNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk) r0
            if (r0 != 0) goto L10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L10:
            java.lang.String r1 = r2.mCameraId
            java.util.List r3 = r0.getExcludedSizes(r1, r3)
            return r3
    }
}
