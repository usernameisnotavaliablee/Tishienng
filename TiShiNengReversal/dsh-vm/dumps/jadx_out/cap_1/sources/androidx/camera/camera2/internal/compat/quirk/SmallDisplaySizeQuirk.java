package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SmallDisplaySizeQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Map<java.lang.String, android.util.Size> MODEL_TO_DISPLAY_SIZE_MAP = null;
    private static final java.lang.String TAG = "SmallDisplaySizeQuirk";

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP = r0
            android.util.Size r1 = new android.util.Size
            r2 = 1080(0x438, float:1.513E-42)
            r3 = 2340(0x924, float:3.279E-42)
            r1.<init>(r2, r3)
            java.lang.String r4 = "REDMI NOTE 8"
            r0.put(r4, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r2, r3)
            java.lang.String r4 = "REDMI NOTE 7"
            r0.put(r4, r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1560(0x618, float:2.186E-42)
            r5 = 720(0x2d0, float:1.009E-42)
            r1.<init>(r5, r4)
            java.lang.String r4 = "SM-A207M"
            r0.put(r4, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r2, r3)
            java.lang.String r4 = "REDMI NOTE 7S"
            r0.put(r4, r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1600(0x640, float:2.242E-42)
            r1.<init>(r5, r4)
            java.lang.String r6 = "SM-A127F"
            r0.put(r6, r1)
            android.util.Size r1 = new android.util.Size
            r6 = 2400(0x960, float:3.363E-42)
            r1.<init>(r2, r6)
            java.lang.String r7 = "SM-A536E"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r7 = "220233L2I"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r7 = "V2149"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r2, r3)
            java.lang.String r3 = "VIVO 1920"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r2, r6)
            java.lang.String r3 = "CPH2223"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r3 = "V2029"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1520(0x5f0, float:2.13E-42)
            r1.<init>(r5, r3)
            java.lang.String r7 = "CPH1901"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r3)
            java.lang.String r7 = "REDMI Y3"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r7 = "SM-A045M"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r7 = 2408(0x968, float:3.374E-42)
            r1.<init>(r2, r7)
            java.lang.String r8 = "SM-A146U"
            r0.put(r8, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r3)
            java.lang.String r8 = "CPH1909"
            r0.put(r8, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r3)
            java.lang.String r8 = "NOKIA 4.2"
            r0.put(r8, r1)
            android.util.Size r1 = new android.util.Size
            r8 = 1440(0x5a0, float:2.018E-42)
            r9 = 2960(0xb90, float:4.148E-42)
            r1.<init>(r8, r9)
            java.lang.String r8 = "SM-G960U1"
            r0.put(r8, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r2, r7)
            java.lang.String r7 = "SM-A137F"
            r0.put(r7, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r3)
            java.lang.String r3 = "VIVO 1816"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1612(0x64c, float:2.259E-42)
            r1.<init>(r5, r3)
            java.lang.String r3 = "INFINIX X6817"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r3 = "SM-A037F"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r3 = "NOKIA 2.4"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r5, r4)
            java.lang.String r3 = "SM-A125M"
            r0.put(r3, r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r2, r6)
            java.lang.String r2 = "INFINIX X670"
            r0.put(r2, r1)
            return
    }

    public SmallDisplaySizeQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.util.Map<java.lang.String, android.util.Size> r0 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Size getDisplaySize() {
            r3 = this;
            java.util.Map<java.lang.String, android.util.Size> r0 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.Object r0 = r0.get(r1)
            android.util.Size r0 = (android.util.Size) r0
            return r0
    }
}
