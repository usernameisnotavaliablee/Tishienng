package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PreviewDelayWhenVideoCaptureIsBoundQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> HUAWEI_DEVICE_LIST = null;
    private static final java.util.Set<java.lang.String> HUAWEI_MODEL_LIST = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r6 = "HWCOL"
            java.lang.String r7 = "HWPAR"
            java.lang.String r1 = "HWELE"
            java.lang.String r2 = "HW-02L"
            java.lang.String r3 = "HWVOG"
            java.lang.String r4 = "HWYAL"
            java.lang.String r5 = "HWLYA"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.HUAWEI_DEVICE_LIST = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "ELS-NX9"
            java.lang.String r2 = "ELS-N04"
            java.lang.String r3 = "ELS-AN00"
            java.lang.String r4 = "ELS-TN00"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.HUAWEI_MODEL_LIST = r0
            return
    }

    public PreviewDelayWhenVideoCaptureIsBoundQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.lang.String r0 = "Huawei"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2a
            java.util.Set<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.HUAWEI_DEVICE_LIST
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L28
            java.util.Set<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.HUAWEI_MODEL_LIST
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
    }
}
