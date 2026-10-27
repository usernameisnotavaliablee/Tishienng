package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExtraSupportedOutputSizeQuirk implements androidx.camera.core.impl.Quirk {
    public ExtraSupportedOutputSizeQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private android.util.Size[] getMotoE5PlayExtraSupportedResolutions() {
            r8 = this;
            android.util.Size r0 = new android.util.Size
            r1 = 1920(0x780, float:2.69E-42)
            r2 = 1080(0x438, float:1.513E-42)
            r0.<init>(r1, r2)
            android.util.Size r1 = new android.util.Size
            r3 = 1440(0x5a0, float:2.018E-42)
            r1.<init>(r3, r2)
            android.util.Size r2 = new android.util.Size
            r3 = 1280(0x500, float:1.794E-42)
            r4 = 720(0x2d0, float:1.009E-42)
            r2.<init>(r3, r4)
            android.util.Size r3 = new android.util.Size
            r5 = 960(0x3c0, float:1.345E-42)
            r3.<init>(r5, r4)
            android.util.Size r5 = new android.util.Size
            r6 = 864(0x360, float:1.211E-42)
            r7 = 480(0x1e0, float:6.73E-43)
            r5.<init>(r6, r7)
            android.util.Size r6 = new android.util.Size
            r6.<init>(r4, r7)
            r4 = 6
            android.util.Size[] r4 = new android.util.Size[r4]
            r7 = 0
            r4[r7] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            r0 = 4
            r4[r0] = r5
            r0 = 5
            r4[r0] = r6
            return r4
    }

    private static boolean isMotoE5Play() {
            java.lang.String r0 = "motorola"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "moto e5 play"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isMotoE5Play()
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Size[] getExtraSupportedResolutions(int r2) {
            r1 = this;
            r0 = 34
            if (r2 != r0) goto Lf
            boolean r2 = isMotoE5Play()
            if (r2 == 0) goto Lf
            android.util.Size[] r2 = r1.getMotoE5PlayExtraSupportedResolutions()
            return r2
        Lf:
            r2 = 0
            android.util.Size[] r2 = new android.util.Size[r2]
            return r2
    }

    @androidx.annotation.NonNull
    public <T> android.util.Size[] getExtraSupportedResolutions(@androidx.annotation.NonNull java.lang.Class<T> r1) {
            r0 = this;
            boolean r1 = android.hardware.camera2.params.StreamConfigurationMap.isOutputSupportedFor(r1)
            if (r1 == 0) goto L11
            boolean r1 = isMotoE5Play()
            if (r1 == 0) goto L11
            android.util.Size[] r1 = r0.getMotoE5PlayExtraSupportedResolutions()
            return r1
        L11:
            r1 = 0
            android.util.Size[] r1 = new android.util.Size[r1]
            return r1
    }
}
