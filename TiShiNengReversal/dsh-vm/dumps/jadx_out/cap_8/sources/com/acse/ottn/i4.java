package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i4 {
    public static com.acse.ottn.i4 a;

    public i4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.i4 a() {
            com.acse.ottn.i4 r0 = com.acse.ottn.i4.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.i4> r0 = com.acse.ottn.i4.class
            monitor-enter(r0)
            com.acse.ottn.i4 r1 = com.acse.ottn.i4.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.i4 r1 = new com.acse.ottn.i4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.i4.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.i4 r0 = com.acse.ottn.i4.a
            return r0
    }

    public static void a(android.content.Context r2, android.net.Uri r3, java.lang.String r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SEND"
            r0.<init>(r1)
            java.lang.String r1 = "image/png"
            r0.setType(r1)
            java.lang.String r1 = "android.intent.extra.STREAM"
            r0.putExtra(r1, r3)
            android.content.Intent r3 = android.content.Intent.createChooser(r0, r4)
            r2.startActivity(r3)
            return
    }

    public void a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SEND"
            r0.<init>(r1)
            java.lang.String r1 = "text/plain"
            r0.setType(r1)
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r4)
            android.content.Intent r4 = android.content.Intent.createChooser(r0, r4)
            r3.startActivity(r4)
            return
    }
}
