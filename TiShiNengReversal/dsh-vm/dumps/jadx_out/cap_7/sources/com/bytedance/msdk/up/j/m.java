package com.bytedance.msdk.up.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m extends com.bytedance.msdk.up.j.ae {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile com.bytedance.msdk.up.j.m j;

    private m(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.bytedance.msdk.up.j.m j(android.content.Context r2) {
            com.bytedance.msdk.up.j.m r0 = com.bytedance.msdk.up.j.m.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.up.j.m> r0 = com.bytedance.msdk.up.j.m.class
            monitor-enter(r0)
            com.bytedance.msdk.up.j.m r1 = com.bytedance.msdk.up.j.m.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.up.j.m r1 = new com.bytedance.msdk.up.j.m     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.up.j.m.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.bytedance.msdk.up.j.m r2 = com.bytedance.msdk.up.j.m.j
            return r2
    }
}
