package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class t {
    public static com.bxkj.base.util.t b;
    private com.bxkj.base.util.t.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void b();
    }

    public t() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bxkj.base.util.t a() {
            com.bxkj.base.util.t r0 = com.bxkj.base.util.t.b
            if (r0 != 0) goto L19
            java.lang.Class<com.bxkj.base.util.t> r0 = com.bxkj.base.util.t.class
            monitor-enter(r0)
            com.bxkj.base.util.t r1 = com.bxkj.base.util.t.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bxkj.base.util.t r1 = new com.bxkj.base.util.t     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bxkj.base.util.t.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.bxkj.base.util.t r0 = com.bxkj.base.util.t.b
            return r0
    }

    public void b(android.app.Activity r5, int r6) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = r5.getPackageName()
            r2 = 0
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            r0.setData(r1)
            r5.startActivityForResult(r0, r6)
            return
    }

    @androidx.annotation.RequiresApi(api = 19)
    public boolean c(android.content.Context r1) {
            r0 = this;
            androidx.core.app.NotificationManagerCompat r1 = androidx.core.app.NotificationManagerCompat.from(r1)
            boolean r1 = r1.areNotificationsEnabled()
            return r1
    }

    @androidx.annotation.RequiresApi(api = 19)
    public void d(android.content.Context r1, com.bxkj.base.util.t.a r2) {
            r0 = this;
            boolean r1 = r0.c(r1)
            if (r1 != 0) goto Lc
            if (r2 == 0) goto L11
            r2.b()
            return
        Lc:
            if (r2 == 0) goto L11
            r2.a()
        L11:
            return
    }

    public void e(com.bxkj.base.util.t.a r1) {
            r0 = this;
            com.bxkj.base.util.t$a r1 = r0.a
            r0.a = r1
            return
    }
}
