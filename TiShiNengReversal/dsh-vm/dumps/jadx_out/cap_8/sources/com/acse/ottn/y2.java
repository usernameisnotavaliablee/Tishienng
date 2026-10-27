package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y2 {
    public static com.acse.ottn.y2 a;

    public y2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.y2 a() {
            com.acse.ottn.y2 r0 = com.acse.ottn.y2.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.y2> r0 = com.acse.ottn.y2.class
            monitor-enter(r0)
            com.acse.ottn.y2 r1 = com.acse.ottn.y2.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.y2 r1 = new com.acse.ottn.y2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.y2.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.y2 r0 = com.acse.ottn.y2.a
            return r0
    }

    public void a(android.content.Context r4) {
            r3 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "oaid_permission"
            r0.a(r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)
            r4.startActivity(r0)
            return
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.y2 r0 = com.acse.ottn.y2.a
            return r0
    }
}
