package xyz.adscope.amps.ad.unified.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSRootInsertHelper {
    private AMPSRootInsertHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Utility class"
            r0.<init>(r1)
            throw r0
    }

    public static void insertRootView(xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r0, android.view.ViewGroup r1) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            r0.insertChannelSpecifiedContainer(r1)
        L7:
            return
    }
}
