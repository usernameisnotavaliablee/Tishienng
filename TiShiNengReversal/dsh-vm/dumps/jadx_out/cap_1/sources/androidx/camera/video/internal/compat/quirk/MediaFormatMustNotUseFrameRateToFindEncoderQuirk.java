package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MediaFormatMustNotUseFrameRateToFindEncoderQuirk implements androidx.camera.core.impl.Quirk {
    public MediaFormatMustNotUseFrameRateToFindEncoderQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
