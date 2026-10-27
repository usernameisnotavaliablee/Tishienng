package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean cw() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L13
            r1 = 29
            if (r0 != r1) goto L11
            int r0 = com.bytedance.pangle.transform.c.a()
            if (r0 <= 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public static void j() {
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "start"
            java.lang.String r2 = "zeus_stage_flipped"
            r0.saveRecord(r2, r1)
            com.bytedance.pangle.flipped.cw r0 = xt()
            r0.invokeHiddenApiRestrictions()
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "finish"
            r0.saveRecord(r2, r1)
            return
    }

    private static boolean r() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L13
            r1 = 27
            if (r0 != r1) goto L11
            int r0 = com.bytedance.pangle.transform.c.a()
            if (r0 <= 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    private static com.bytedance.pangle.flipped.cw xt() {
            boolean r0 = cw()
            if (r0 == 0) goto Lc
            com.bytedance.pangle.flipped.FlippedV2Impl r0 = new com.bytedance.pangle.flipped.FlippedV2Impl
            r0.<init>()
            return r0
        Lc:
            boolean r0 = r()
            if (r0 == 0) goto L18
            com.bytedance.pangle.flipped.xt r0 = new com.bytedance.pangle.flipped.xt
            r0.<init>()
            return r0
        L18:
            com.bytedance.pangle.flipped.j r0 = new com.bytedance.pangle.flipped.j
            r0.<init>()
            return r0
    }
}
