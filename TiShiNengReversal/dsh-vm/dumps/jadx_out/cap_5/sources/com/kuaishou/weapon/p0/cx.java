package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cx {
    private static volatile com.kuaishou.weapon.p0.cx b;
    private android.content.Context a;


    private cx(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ android.content.Context a(com.kuaishou.weapon.p0.cx r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    public static com.kuaishou.weapon.p0.cx a(android.content.Context r2) {
            com.kuaishou.weapon.p0.cx r0 = com.kuaishou.weapon.p0.cx.b
            if (r0 != 0) goto L19
            java.lang.Class<com.kuaishou.weapon.p0.cx> r0 = com.kuaishou.weapon.p0.cx.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.cx r1 = com.kuaishou.weapon.p0.cx.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kuaishou.weapon.p0.cx r1 = new com.kuaishou.weapon.p0.cx     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.cx.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.kuaishou.weapon.p0.cx r2 = com.kuaishou.weapon.p0.cx.b
            return r2
    }

    public void a(int r3) {
            r2 = this;
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a()
            com.kuaishou.weapon.p0.cx$1 r1 = new com.kuaishou.weapon.p0.cx$1
            r1.<init>(r2, r3)
            r0.a(r1)
            return
    }
}
