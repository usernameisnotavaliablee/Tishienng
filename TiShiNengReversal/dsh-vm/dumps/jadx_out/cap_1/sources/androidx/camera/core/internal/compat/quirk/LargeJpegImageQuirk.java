package androidx.camera.core.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LargeJpegImageQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> DEVICE_MODELS = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r22 = "SM-S901B/DS"
            java.lang.String r23 = "SM-S906B"
            java.lang.String r1 = "SM-A520F"
            java.lang.String r2 = "SM-A520L"
            java.lang.String r3 = "SM-A520K"
            java.lang.String r4 = "SM-A520S"
            java.lang.String r5 = "SM-A520X"
            java.lang.String r6 = "SM-A520W"
            java.lang.String r7 = "SM-A525F"
            java.lang.String r8 = "SM-A525M"
            java.lang.String r9 = "SM-A705F"
            java.lang.String r10 = "SM-A705FN"
            java.lang.String r11 = "SM-A705GM"
            java.lang.String r12 = "SM-A705MN"
            java.lang.String r13 = "SM-A7050"
            java.lang.String r14 = "SM-A705W"
            java.lang.String r15 = "SM-A705YN"
            java.lang.String r16 = "SM-A705U"
            java.lang.String r17 = "SM-A725F"
            java.lang.String r18 = "SM-A725M"
            java.lang.String r19 = "SM-G930T"
            java.lang.String r20 = "SM-G930V"
            java.lang.String r21 = "SM-S901B"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.DEVICE_MODELS = r0
            return
    }

    public LargeJpegImageQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.util.Set<java.lang.String> r0 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.DEVICE_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            return r0
    }
}
