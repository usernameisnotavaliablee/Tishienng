package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private static com.tencent.open.utils.j a;
    private volatile java.lang.ref.WeakReference<android.content.SharedPreferences> b;

    static {
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            return
    }

    public static synchronized com.tencent.open.utils.j a() {
            java.lang.Class<com.tencent.open.utils.j> r0 = com.tencent.open.utils.j.class
            monitor-enter(r0)
            com.tencent.open.utils.j r1 = com.tencent.open.utils.j.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.open.utils.j r1 = new com.tencent.open.utils.j     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.tencent.open.utils.j.a = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.tencent.open.utils.j r1 = com.tencent.open.utils.j.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public java.lang.String a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "openSDK_LOG.ServerSetting"
            java.lang.ref.WeakReference<android.content.SharedPreferences> r1 = r4.b
            if (r1 == 0) goto Le
            java.lang.ref.WeakReference<android.content.SharedPreferences> r1 = r4.b
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L1c
        Le:
            java.lang.String r1 = "ServerPrefs"
            r2 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r1, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r4.b = r1
        L1c:
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Exception -> L3c
            r5.<init>(r6)     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r5.getHost()     // Catch: java.lang.Exception -> L3c
            if (r5 != 0) goto L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r5.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = "Get host error. url="
            r5.append(r1)     // Catch: java.lang.Exception -> L3c
            r5.append(r6)     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L3c
            com.tencent.open.log.SLog.e(r0, r5)     // Catch: java.lang.Exception -> L3c
            return r6
        L3c:
            r5 = move-exception
            goto L8a
        L3e:
            java.lang.ref.WeakReference<android.content.SharedPreferences> r1 = r4.b     // Catch: java.lang.Exception -> L3c
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L3c
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Exception -> L3c
            r2 = 0
            java.lang.String r1 = r1.getString(r5, r2)     // Catch: java.lang.Exception -> L3c
            if (r1 == 0) goto L6d
            boolean r2 = r5.equals(r1)     // Catch: java.lang.Exception -> L3c
            if (r2 == 0) goto L54
            goto L6d
        L54:
            java.lang.String r6 = r6.replace(r5, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r5.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = "return environment url : "
            r5.append(r1)     // Catch: java.lang.Exception -> L3c
            r5.append(r6)     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L3c
            com.tencent.open.log.SLog.v(r0, r5)     // Catch: java.lang.Exception -> L3c
            return r6
        L6d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r2.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = "host="
            r2.append(r3)     // Catch: java.lang.Exception -> L3c
            r2.append(r5)     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = ", envHost="
            r2.append(r5)     // Catch: java.lang.Exception -> L3c
            r2.append(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L3c
            com.tencent.open.log.SLog.v(r0, r5)     // Catch: java.lang.Exception -> L3c
            return r6
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getEnvUrl url="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = "error.: "
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.tencent.open.log.SLog.e(r0, r5)
            return r6
    }
}
