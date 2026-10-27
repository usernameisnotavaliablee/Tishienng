package androidx.camera.core.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CaptureFailedRetryQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> FAILED_RETRY_ALLOW_LIST = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "SAMSUNG"
            java.lang.String r2 = "SM-G981U1"
            android.util.Pair r1 = android.util.Pair.create(r1, r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.FAILED_RETRY_ALLOW_LIST = r0
            return
    }

    public CaptureFailedRetryQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.lang.String r0 = android.os.Build.BRAND
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r1 = r2.toUpperCase(r1)
            java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> r2 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.FAILED_RETRY_ALLOW_LIST
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            boolean r0 = r2.contains(r0)
            return r0
    }

    public int getRetryCount() {
            r1 = this;
            r0 = 1
            return r0
    }
}
