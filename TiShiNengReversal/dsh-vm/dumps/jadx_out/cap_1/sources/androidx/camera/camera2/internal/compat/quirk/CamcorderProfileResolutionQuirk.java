package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CamcorderProfileResolutionQuirk implements androidx.camera.core.impl.quirk.ProfileResolutionQuirk {
    private static final java.lang.String TAG = "CamcorderProfileResolutionQuirk";
    private final androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat mStreamConfigurationMapCompat;
    private java.util.List<android.util.Size> mSupportedResolutions;

    public CamcorderProfileResolutionQuirk(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSupportedResolutions = r0
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r2 = r2.getStreamConfigurationMapCompat()
            r1.mStreamConfigurationMapCompat = r2
            return
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L13
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // androidx.camera.core.impl.quirk.ProfileResolutionQuirk
    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getSupportedResolutions() {
            r2 = this;
            java.util.List<android.util.Size> r0 = r2.mSupportedResolutions
            if (r0 != 0) goto L35
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r2.mStreamConfigurationMapCompat
            r1 = 34
            android.util.Size[] r0 = r0.getOutputSizes(r1)
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.clone()
            android.util.Size[] r0 = (android.util.Size[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L1b
        L19:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L1b:
            r2.mSupportedResolutions = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mSupportedResolutions = "
            r0.append(r1)
            java.util.List<android.util.Size> r1 = r2.mSupportedResolutions
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CamcorderProfileResolutionQuirk"
            androidx.camera.core.Logger.d(r1, r0)
        L35:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<android.util.Size> r1 = r2.mSupportedResolutions
            r0.<init>(r1)
            return r0
    }
}
