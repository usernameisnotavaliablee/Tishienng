package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExcludedSupportedSizesQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String TAG = "ExcludedSupportedSizesQuirk";
    private static final int UNKNOWN_IMAGE_FORMAT = -1;

    public ExcludedSupportedSizesQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getHuaweiP20LiteExcludedSizes(@androidx.annotation.NonNull java.lang.String r3, int r4, @androidx.annotation.Nullable java.lang.Class<?> r5) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "0"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L2b
            r3 = 34
            if (r4 == r3) goto L17
            r3 = 35
            if (r4 == r3) goto L17
            if (r5 == 0) goto L2b
        L17:
            android.util.Size r3 = new android.util.Size
            r4 = 720(0x2d0, float:1.009E-42)
            r3.<init>(r4, r4)
            r0.add(r3)
            android.util.Size r3 = new android.util.Size
            r4 = 400(0x190, float:5.6E-43)
            r3.<init>(r4, r4)
            r0.add(r3)
        L2b:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getOnePlus6ExcludedSizes(@androidx.annotation.NonNull java.lang.String r3, int r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "0"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L29
            r3 = 256(0x100, float:3.59E-43)
            if (r4 != r3) goto L29
            android.util.Size r3 = new android.util.Size
            r4 = 4160(0x1040, float:5.83E-42)
            r1 = 3120(0xc30, float:4.372E-42)
            r3.<init>(r4, r1)
            r0.add(r3)
            android.util.Size r3 = new android.util.Size
            r4 = 4000(0xfa0, float:5.605E-42)
            r1 = 3000(0xbb8, float:4.204E-42)
            r3.<init>(r4, r1)
            r0.add(r3)
        L29:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getOnePlus6TExcludedSizes(@androidx.annotation.NonNull java.lang.String r3, int r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "0"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L29
            r3 = 256(0x100, float:3.59E-43)
            if (r4 != r3) goto L29
            android.util.Size r3 = new android.util.Size
            r4 = 4160(0x1040, float:5.83E-42)
            r1 = 3120(0xc30, float:4.372E-42)
            r3.<init>(r4, r1)
            r0.add(r3)
            android.util.Size r3 = new android.util.Size
            r4 = 4000(0xfa0, float:5.605E-42)
            r1 = 3000(0xbb8, float:4.204E-42)
            r3.<init>(r4, r1)
            r0.add(r3)
        L29:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getRedmiNote9ProExcludedSizes(@androidx.annotation.NonNull java.lang.String r3, int r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "0"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L1d
            r3 = 256(0x100, float:3.59E-43)
            if (r4 != r3) goto L1d
            android.util.Size r3 = new android.util.Size
            r4 = 9280(0x2440, float:1.3004E-41)
            r1 = 6944(0x1b20, float:9.73E-42)
            r3.<init>(r4, r1)
            r0.add(r3)
        L1d:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getSamsungJ7Api27AboveExcludedSizes(@androidx.annotation.NonNull java.lang.String r10, int r11, @androidx.annotation.Nullable java.lang.Class<?> r12) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "0"
            boolean r1 = r10.equals(r1)
            r2 = 35
            r3 = 34
            r4 = 1080(0x438, float:1.513E-42)
            r5 = 1152(0x480, float:1.614E-42)
            r6 = 1536(0x600, float:2.152E-42)
            r7 = 1920(0x780, float:2.69E-42)
            r8 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L8a
            if (r11 == r3) goto L3b
            if (r12 == 0) goto L20
            goto L3b
        L20:
            if (r11 != r2) goto Ld0
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r6)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r5)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r7, r4)
            r0.add(r10)
            return r0
        L3b:
            android.util.Size r10 = new android.util.Size
            r11 = 3096(0xc18, float:4.338E-42)
            r12 = 4128(0x1020, float:5.785E-42)
            r10.<init>(r12, r11)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r11 = 2322(0x912, float:3.254E-42)
            r10.<init>(r12, r11)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r11 = 3088(0xc10, float:4.327E-42)
            r10.<init>(r11, r11)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r11 = 2448(0x990, float:3.43E-42)
            r12 = 3264(0xcc0, float:4.574E-42)
            r10.<init>(r12, r11)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r11 = 1836(0x72c, float:2.573E-42)
            r10.<init>(r12, r11)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r6)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r5)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r7, r4)
            r0.add(r10)
            return r0
        L8a:
            java.lang.String r1 = "1"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Ld0
            if (r11 == r3) goto L98
            if (r11 == r2) goto L98
            if (r12 == 0) goto Ld0
        L98:
            android.util.Size r10 = new android.util.Size
            r11 = 2576(0xa10, float:3.61E-42)
            r12 = 1932(0x78c, float:2.707E-42)
            r10.<init>(r11, r12)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r11 = 2560(0xa00, float:3.587E-42)
            r12 = 1440(0x5a0, float:2.018E-42)
            r10.<init>(r11, r12)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r7, r7)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r6)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r8, r5)
            r0.add(r10)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r7, r4)
            r0.add(r10)
        Ld0:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<android.util.Size> getSamsungJ7PrimeApi27AboveExcludedSizes(@androidx.annotation.NonNull java.lang.String r16, int r17, @androidx.annotation.Nullable java.lang.Class<?> r18) {
            r15 = this;
            r0 = r16
            r1 = r17
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "0"
            boolean r3 = r0.equals(r3)
            r4 = 35
            r5 = 34
            r6 = 1080(0x438, float:1.513E-42)
            r7 = 1152(0x480, float:1.614E-42)
            r8 = 1536(0x600, float:2.152E-42)
            r9 = 1836(0x72c, float:2.573E-42)
            r10 = 1920(0x780, float:2.69E-42)
            r11 = 2448(0x990, float:3.43E-42)
            r12 = 2048(0x800, float:2.87E-42)
            r13 = 3264(0xcc0, float:4.574E-42)
            if (r3 == 0) goto Lae
            r0 = 2322(0x912, float:3.254E-42)
            r3 = 4128(0x1020, float:5.785E-42)
            r14 = 3088(0xc10, float:4.327E-42)
            if (r1 == r5) goto L6b
            if (r18 == 0) goto L30
            goto L6b
        L30:
            if (r1 != r4) goto Lf4
            android.util.Size r1 = new android.util.Size
            r1.<init>(r3, r0)
            r2.add(r1)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r14, r14)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r13, r11)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r13, r9)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r8)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r7)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r10, r6)
            r2.add(r0)
            return r2
        L6b:
            android.util.Size r1 = new android.util.Size
            r4 = 3096(0xc18, float:4.338E-42)
            r1.<init>(r3, r4)
            r2.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r3, r0)
            r2.add(r1)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r14, r14)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r13, r11)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r13, r9)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r8)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r7)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r10, r6)
            r2.add(r0)
            return r2
        Lae:
            java.lang.String r3 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lf4
            if (r1 == r5) goto Lbc
            if (r1 == r4) goto Lbc
            if (r18 == 0) goto Lf4
        Lbc:
            android.util.Size r0 = new android.util.Size
            r0.<init>(r13, r11)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r13, r9)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r11, r11)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r10, r10)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r8)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r12, r7)
            r2.add(r0)
            android.util.Size r0 = new android.util.Size
            r0.<init>(r10, r6)
            r2.add(r0)
        Lf4:
            return r2
    }

    private static boolean isHuaweiP20Lite() {
            java.lang.String r0 = "HUAWEI"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "HWANE"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isOnePlus6() {
            java.lang.String r0 = "OnePlus"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "OnePlus6"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isOnePlus6T() {
            java.lang.String r0 = "OnePlus"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "OnePlus6T"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isRedmiNote9Pro() {
            java.lang.String r0 = "REDMI"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "joyeuse"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ7Api27Above() {
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "J7XELTE"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "ON7XELTE"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isOnePlus6()
            if (r0 != 0) goto L27
            boolean r0 = isOnePlus6T()
            if (r0 != 0) goto L27
            boolean r0 = isHuaweiP20Lite()
            if (r0 != 0) goto L27
            boolean r0 = isSamsungJ7PrimeApi27Above()
            if (r0 != 0) goto L27
            boolean r0 = isSamsungJ7Api27Above()
            if (r0 != 0) goto L27
            boolean r0 = isRedmiNote9Pro()
            if (r0 == 0) goto L25
            goto L27
        L25:
            r0 = 0
            return r0
        L27:
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getExcludedSizes(@androidx.annotation.NonNull java.lang.String r3, int r4) {
            r2 = this;
            boolean r0 = isOnePlus6()
            if (r0 == 0) goto Lb
            java.util.List r3 = r2.getOnePlus6ExcludedSizes(r3, r4)
            return r3
        Lb:
            boolean r0 = isOnePlus6T()
            if (r0 == 0) goto L16
            java.util.List r3 = r2.getOnePlus6TExcludedSizes(r3, r4)
            return r3
        L16:
            boolean r0 = isHuaweiP20Lite()
            r1 = 0
            if (r0 == 0) goto L22
            java.util.List r3 = r2.getHuaweiP20LiteExcludedSizes(r3, r4, r1)
            return r3
        L22:
            boolean r0 = isSamsungJ7PrimeApi27Above()
            if (r0 == 0) goto L2d
            java.util.List r3 = r2.getSamsungJ7PrimeApi27AboveExcludedSizes(r3, r4, r1)
            return r3
        L2d:
            boolean r0 = isSamsungJ7Api27Above()
            if (r0 == 0) goto L38
            java.util.List r3 = r2.getSamsungJ7Api27AboveExcludedSizes(r3, r4, r1)
            return r3
        L38:
            boolean r0 = isRedmiNote9Pro()
            if (r0 == 0) goto L43
            java.util.List r3 = r2.getRedmiNote9ProExcludedSizes(r3, r4)
            return r3
        L43:
            java.lang.String r3 = "ExcludedSupportedSizesQuirk"
            java.lang.String r4 = "Cannot retrieve list of supported sizes to exclude on this device."
            androidx.camera.core.Logger.w(r3, r4)
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getExcludedSizes(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<?> r4) {
            r2 = this;
            boolean r0 = isHuaweiP20Lite()
            r1 = -1
            if (r0 == 0) goto Lc
            java.util.List r3 = r2.getHuaweiP20LiteExcludedSizes(r3, r1, r4)
            return r3
        Lc:
            boolean r0 = isSamsungJ7PrimeApi27Above()
            if (r0 == 0) goto L17
            java.util.List r3 = r2.getSamsungJ7PrimeApi27AboveExcludedSizes(r3, r1, r4)
            return r3
        L17:
            boolean r0 = isSamsungJ7Api27Above()
            if (r0 == 0) goto L22
            java.util.List r3 = r2.getSamsungJ7Api27AboveExcludedSizes(r3, r1, r4)
            return r3
        L22:
            java.lang.String r3 = "ExcludedSupportedSizesQuirk"
            java.lang.String r4 = "Cannot retrieve list of supported sizes to exclude on this device."
            androidx.camera.core.Logger.w(r3, r4)
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }
}
