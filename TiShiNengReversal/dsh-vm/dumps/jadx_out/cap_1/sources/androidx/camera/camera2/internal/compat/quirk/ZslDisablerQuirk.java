package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ZslDisablerQuirk implements androidx.camera.core.impl.Quirk {
    public ZslDisablerQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isSamsungFold4() {
            java.lang.String r0 = "samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = android.os.Build.MODEL
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "SM-F936"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private static boolean isXiaoMiMi8() {
            java.lang.String r0 = "xiaomi"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1d
            java.lang.String r0 = android.os.Build.MODEL
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "MI 8"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1d
            r0 = 1
            return r0
        L1d:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isSamsungFold4()
            if (r0 != 0) goto Lf
            boolean r0 = isXiaoMiMi8()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
