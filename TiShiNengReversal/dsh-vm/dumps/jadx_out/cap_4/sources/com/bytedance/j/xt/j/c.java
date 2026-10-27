package com.bytedance.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private static volatile com.bytedance.j.xt.j.c b;
    private final com.bytedance.j.xt.j.a a;

    private c(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.bytedance.j.xt.j.a r0 = new com.bytedance.j.xt.j.a
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public static com.bytedance.j.xt.j.c a(android.content.Context r2) {
            com.bytedance.j.xt.j.c r0 = com.bytedance.j.xt.j.c.b
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.j.xt.j.c> r0 = com.bytedance.j.xt.j.c.class
            monitor-enter(r0)
            com.bytedance.j.xt.j.c r1 = com.bytedance.j.xt.j.c.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.j.xt.j.c r1 = new com.bytedance.j.xt.j.c     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.bytedance.j.xt.j.c.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.j.xt.j.c r2 = com.bytedance.j.xt.j.c.b
            return r2
    }

    public void b() {
            r1 = this;
            com.bytedance.j.xt.j.a r0 = r1.a
            r0.c()
            return
    }
}
