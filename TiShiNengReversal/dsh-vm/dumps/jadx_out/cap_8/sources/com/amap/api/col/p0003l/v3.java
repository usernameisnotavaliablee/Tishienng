package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v3 {
    com.amap.api.col.p0003l.e3 a;

    /* renamed from: b, reason: collision with root package name */
    android.content.Context f4049b;

    /* renamed from: c, reason: collision with root package name */
    android.os.Messenger f4050c;

    public v3(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f4049b = r0
            r1.f4050c = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.f4049b = r2
            com.amap.api.col.3l.e3 r2 = new com.amap.api.col.3l.e3
            android.content.Context r0 = r1.f4049b
            r2.<init>(r0)
            r1.a = r2
            return
    }

    public final android.os.IBinder a(android.content.Intent r2) {
            r1 = this;
            com.amap.api.col.3l.e3 r0 = r1.a
            r0.w(r2)
            com.amap.api.col.3l.e3 r0 = r1.a
            r0.d(r2)
            android.os.Messenger r2 = new android.os.Messenger
            com.amap.api.col.3l.e3 r0 = r1.a
            android.os.Handler r0 = r0.s()
            r2.<init>(r0)
            r1.f4050c = r2
            android.os.IBinder r2 = r2.getBinder()
            return r2
    }

    public final void b() {
            r3 = this;
            com.amap.api.col.p0003l.e3.E()     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.e3 r0 = r3.a     // Catch: java.lang.Throwable -> L19
            long r1 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L19
            r0.q = r1     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.e3 r0 = r3.a     // Catch: java.lang.Throwable -> L19
            long r1 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L19
            r0.r = r1     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.e3 r0 = r3.a     // Catch: java.lang.Throwable -> L19
            r0.c()     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r0 = move-exception
            java.lang.String r1 = "ApsServiceCore"
            java.lang.String r2 = "onCreate"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final int c() {
            r1 = this;
            com.amap.api.col.3l.e3 r0 = r1.a
            if (r0 == 0) goto Le
            com.amap.api.location.AMapLocationClientOption r0 = r0.z
            boolean r0 = r0.isSelfStartServiceEnable()
            if (r0 != 0) goto Le
            r0 = 2
            return r0
        Le:
            r0 = 3
            return r0
    }

    public final void d() {
            r3 = this;
            com.amap.api.col.3l.e3 r0 = r3.a     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            android.os.Handler r0 = r0.s()     // Catch: java.lang.Throwable -> Le
            r1 = 11
            r0.sendEmptyMessage(r1)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L11
        L10:
            return
        L11:
            java.lang.String r1 = "ApsServiceCore"
            java.lang.String r2 = "onDestroy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }
}
