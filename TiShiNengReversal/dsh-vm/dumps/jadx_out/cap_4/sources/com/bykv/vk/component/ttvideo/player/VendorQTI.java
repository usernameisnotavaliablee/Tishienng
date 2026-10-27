package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VendorQTI {
    private static final int LEVEL_HIGH = 2;
    private static final int LEVEL_LITE = 0;
    private static final int LEVEL_MIDIUM = 1;
    private static final java.lang.String TAG = "VendorQTI";

    public VendorQTI() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void debugEffect(android.media.MediaFormat r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "vendor.qti-ext-vpp-demo.process-percent"
            r1 = 50
            r2.setInteger(r0, r1)
            return
    }

    public static void enableLowLatency(android.media.MediaFormat r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "vendor.qti-ext-dec-low-latency.enable"
            r1 = 1
            r2.setInteger(r0, r1)
            return
    }

    @android.annotation.TargetApi(16)
    public static void setupVpp(android.media.MediaFormat r7, int r8) {
            if (r7 != 0) goto L3
            goto L1e
        L3:
            java.lang.String r0 = "vendor.qti-ext-vpp.mode"
            java.lang.String r1 = "HQV_MODE_MANUAL"
            r7.setString(r0, r1)
            r0 = 50
            java.lang.String r1 = "vendor.qti-ext-vpp-aie.ltm-ace-str"
            java.lang.String r2 = "vendor.qti-ext-vpp-aie.ltm-sat-offset"
            java.lang.String r3 = "vendor.qti-ext-vpp-aie.ltm-sat-gain"
            java.lang.String r4 = "vendor.qti-ext-vpp-cade.cade-level"
            r5 = 20
            if (r8 == 0) goto L30
            r6 = 1
            if (r8 == r6) goto L30
            r6 = 2
            if (r8 == r6) goto L1f
        L1e:
            return
        L1f:
            r8 = 15
            r7.setInteger(r4, r8)
            r8 = 70
            r7.setInteger(r3, r8)
            r7.setInteger(r2, r8)
            r7.setInteger(r1, r0)
            goto L47
        L30:
            if (r8 != 0) goto L35
            r8 = 10
            goto L37
        L35:
            r8 = 20
        L37:
            r7.setInteger(r4, r8)
            r8 = 65
            r7.setInteger(r3, r8)
            r8 = 60
            r7.setInteger(r2, r8)
            r7.setInteger(r1, r0)
        L47:
            java.lang.String r8 = "vendor.qti-ext-vpp-aie.ltm-ace-brightness-low"
            r7.setInteger(r8, r5)
            java.lang.String r8 = "vendor.qti-ext-vpp-aie.ltm-ace-brightness-high"
            r7.setInteger(r8, r5)
            return
    }
}
