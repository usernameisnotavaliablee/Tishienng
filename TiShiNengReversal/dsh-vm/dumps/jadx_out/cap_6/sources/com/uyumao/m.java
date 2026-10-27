package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    public static volatile com.uyumao.m a;
    public final android.content.SharedPreferences b;

    public m() {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = com.uyumao.e.a()
            java.lang.String r1 = "um_social_azx"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.b = r0
            return
    }

    public static com.uyumao.m a() {
            com.uyumao.m r0 = com.uyumao.m.a
            if (r0 != 0) goto L19
            java.lang.Class<com.uyumao.m> r0 = com.uyumao.m.class
            monitor-enter(r0)
            com.uyumao.m r1 = com.uyumao.m.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.uyumao.m r1 = new com.uyumao.m     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.uyumao.m.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.uyumao.m r0 = com.uyumao.m.a
            return r0
    }
}
