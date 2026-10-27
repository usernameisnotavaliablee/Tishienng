package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {

    public interface j {
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(android.content.Context r0, android.content.Intent r1, com.bytedance.msdk.tl.r.j r2) {
            if (r0 == 0) goto L8
            if (r1 != 0) goto L5
            goto L8
        L5:
            r0.startActivity(r1)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }
}
