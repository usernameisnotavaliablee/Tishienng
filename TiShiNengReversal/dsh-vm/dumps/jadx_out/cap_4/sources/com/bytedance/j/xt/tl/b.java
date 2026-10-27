package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Thread a(java.lang.Runnable r1) {
            r0 = 0
            java.lang.Thread r1 = b(r1, r0)
            return r1
    }

    public static java.lang.Thread b(java.lang.Runnable r1, java.lang.String r2) {
            if (r1 == 0) goto L16
            if (r2 != 0) goto Lc
            com.bytedance.sdk.component.oq.r.cw r2 = new com.bytedance.sdk.component.oq.r.cw
            java.lang.String r0 = "hreadExecutor"
            r2.<init>(r1, r0)
            goto L12
        Lc:
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            r0.<init>(r1, r2)
            r2 = r0
        L12:
            r2.start()
            return r2
        L16:
            r1 = 0
            return r1
    }
}
