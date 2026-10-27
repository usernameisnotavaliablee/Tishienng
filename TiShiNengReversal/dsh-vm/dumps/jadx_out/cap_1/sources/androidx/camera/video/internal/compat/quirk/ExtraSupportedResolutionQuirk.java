package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExtraSupportedResolutionQuirk implements androidx.camera.core.impl.Quirk {
    public ExtraSupportedResolutionQuirk() {
            r0 = this;
            r0.<init>()
            return
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
}
