package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class InvalidVideoProfilesQuirk implements androidx.camera.core.impl.Quirk {
    static final java.util.List<java.lang.String> AFFECTED_PIXEL_MODELS = null;

    static {
            java.lang.String r9 = "pixel 7"
            java.lang.String r10 = "pixel 7 pro"
            java.lang.String r0 = "pixel 4"
            java.lang.String r1 = "pixel 4a"
            java.lang.String r2 = "pixel 4a (5g)"
            java.lang.String r3 = "pixel 4 xl"
            java.lang.String r4 = "pixel 5"
            java.lang.String r5 = "pixel 5a"
            java.lang.String r6 = "pixel 6"
            java.lang.String r7 = "pixel 6a"
            java.lang.String r8 = "pixel 6 pro"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.AFFECTED_PIXEL_MODELS = r0
            return
    }

    public InvalidVideoProfilesQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isAffectedPixelBuild() {
            boolean r0 = isTp1aBuild()
            if (r0 != 0) goto Lf
            boolean r0 = isTd1aBuild()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private static boolean isAffectedPixelDevices() {
            boolean r0 = isAffectedPixelModel()
            if (r0 == 0) goto Le
            boolean r0 = isAffectedPixelBuild()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean isAffectedPixelModel() {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.AFFECTED_PIXEL_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static boolean isAffectedSamsungDevices() {
            java.lang.String r0 = "samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L12
            boolean r0 = isTp1aBuild()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    private static boolean isTd1aBuild() {
            java.lang.String r0 = android.os.Build.ID
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "td1a"
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    private static boolean isTp1aBuild() {
            java.lang.String r0 = android.os.Build.ID
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "tp1a"
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    static boolean load() {
            boolean r0 = isAffectedSamsungDevices()
            if (r0 != 0) goto Lf
            boolean r0 = isAffectedPixelDevices()
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
