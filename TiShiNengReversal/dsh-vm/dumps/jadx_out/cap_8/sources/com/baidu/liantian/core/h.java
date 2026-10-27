package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5985b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f5986c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.IntentFilter f5987d;

    public h(java.lang.String r1, android.content.IntentFilter r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5987d = r2
            r0.f5985b = r3
            r0.f5986c = r4
            return
    }

    public final boolean a(com.baidu.liantian.core.h r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L4e
            java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L4b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L4e
            java.lang.String r1 = r4.f5985b     // Catch: java.lang.Throwable -> L4b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L4e
            java.lang.String r1 = r4.f5986c     // Catch: java.lang.Throwable -> L4b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L1c
            goto L4e
        L1c:
            java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4a
            java.lang.String r1 = r4.f5985b     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r3.f5985b     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4a
            java.lang.String r1 = r4.f5986c     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r3.f5986c     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L3b
            goto L4a
        L3b:
            android.content.IntentFilter r4 = r4.f5987d     // Catch: java.lang.Throwable -> L4b
            r1 = 1
            if (r4 == 0) goto L49
            android.content.IntentFilter r2 = r3.f5987d     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L45
            goto L49
        L45:
            if (r2 != r4) goto L48
            return r1
        L48:
            return r0
        L49:
            return r1
        L4a:
            return r0
        L4b:
            com.baidu.liantian.b.e.a()
        L4e:
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "PluginloaderIntentFilter:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L2b
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r3.f5985b     // Catch: java.lang.Throwable -> L2b
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r3.f5986c     // Catch: java.lang.Throwable -> L2b
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r0)     // Catch: java.lang.Throwable -> L2b
            android.content.IntentFilter r0 = r3.f5987d     // Catch: java.lang.Throwable -> L2b
            r1.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            return r0
        L2b:
            java.lang.String r0 = ""
            return r0
    }
}
