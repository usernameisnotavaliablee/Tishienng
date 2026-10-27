package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j {
    private android.net.wifi.WifiInfo a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5768b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5769c;

    /* renamed from: d, reason: collision with root package name */
    private int f5770d;

    public j(android.net.wifi.WifiInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f5770d = r0
            r1.a = r2
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f5769c
            if (r0 != 0) goto Lc
            android.net.wifi.WifiInfo r0 = r1.a
            java.lang.String r0 = com.autonavi.aps.amapapi.restruct.h.a(r0)
            r1.f5769c = r0
        Lc:
            java.lang.String r0 = r1.f5769c
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f5768b
            if (r0 != 0) goto Lc
            android.net.wifi.WifiInfo r0 = r1.a
            java.lang.String r0 = com.autonavi.aps.amapapi.restruct.h.b(r0)
            r1.f5768b = r0
        Lc:
            java.lang.String r0 = r1.f5768b
            return r0
    }

    public final int c() {
            r2 = this;
            int r0 = r2.f5770d
            r1 = -1
            if (r0 != r1) goto Ld
            android.net.wifi.WifiInfo r0 = r2.a
            int r0 = com.autonavi.aps.amapapi.restruct.h.c(r0)
            r2.f5770d = r0
        Ld:
            int r0 = r2.f5770d
            return r0
    }

    public final boolean d() {
            r2 = this;
            android.net.wifi.WifiInfo r0 = r2.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r2.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.String r0 = r2.a()
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            r0 = 1
            return r0
    }
}
