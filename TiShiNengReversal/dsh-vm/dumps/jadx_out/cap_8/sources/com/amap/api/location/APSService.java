package com.amap.api.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class APSService extends android.app.Service {
    com.amap.api.col.p0003l.v3 a;

    /* renamed from: b, reason: collision with root package name */
    int f4952b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4953c;

    public APSService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4952b = r0
            r1.f4953c = r0
            return
    }

    private void a(android.content.Context r3) {
            r2 = this;
            com.amap.api.col.3l.v3 r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            com.amap.api.col.3l.v3 r0 = new com.amap.api.col.3l.v3     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lc
            r2.a = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r3 = move-exception
            goto L14
        Le:
            com.amap.api.col.3l.v3 r3 = r2.a     // Catch: java.lang.Throwable -> Lc
            r3.b()     // Catch: java.lang.Throwable -> Lc
            goto L1b
        L14:
            java.lang.String r0 = "APSService"
            java.lang.String r1 = "onCreate"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
        L1b:
            super.onCreate()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r3) {
            r2 = this;
            com.amap.api.col.3l.v3 r0 = r2.a     // Catch: java.lang.Throwable -> L7
            android.os.IBinder r3 = r0.a(r3)     // Catch: java.lang.Throwable -> L7
            return r3
        L7:
            r3 = move-exception
            java.lang.String r0 = "APSService"
            java.lang.String r1 = "onBind"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            r3 = 0
            return r3
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            r0.a(r0)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r3 = this;
            com.amap.api.col.3l.v3 r0 = r3.a     // Catch: java.lang.Throwable -> Le
            r0.d()     // Catch: java.lang.Throwable -> Le
            boolean r0 = r3.f4953c     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L16
            r0 = 1
            r3.stopForeground(r0)     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r0 = move-exception
            java.lang.String r1 = "APSService"
            java.lang.String r2 = "onDestroy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L16:
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            if (r5 == 0) goto L48
            java.lang.String r0 = "g"
            r1 = 0
            int r0 = r5.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L48
            r2 = 1
            if (r0 != r2) goto L29
            java.lang.String r0 = "i"
            int r0 = r5.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "h"
            android.os.Parcelable r1 = r5.getParcelableExtra(r1)     // Catch: java.lang.Throwable -> L48
            android.app.Notification r1 = (android.app.Notification) r1     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L48
            if (r1 == 0) goto L48
            r4.startForeground(r0, r1)     // Catch: java.lang.Throwable -> L48
            r4.f4953c = r2     // Catch: java.lang.Throwable -> L48
            int r0 = r4.f4952b     // Catch: java.lang.Throwable -> L48
            int r0 = r0 + r2
            r4.f4952b = r0     // Catch: java.lang.Throwable -> L48
            goto L48
        L29:
            r3 = 2
            if (r0 != r3) goto L48
            java.lang.String r0 = "j"
            boolean r0 = r5.getBooleanExtra(r0, r2)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L3b
            int r0 = r4.f4952b     // Catch: java.lang.Throwable -> L48
            if (r0 <= 0) goto L3b
            int r0 = r0 - r2
            r4.f4952b = r0     // Catch: java.lang.Throwable -> L48
        L3b:
            int r0 = r4.f4952b     // Catch: java.lang.Throwable -> L48
            if (r0 > 0) goto L45
            r4.stopForeground(r2)     // Catch: java.lang.Throwable -> L48
            r4.f4953c = r1     // Catch: java.lang.Throwable -> L48
            goto L48
        L45:
            r4.stopForeground(r1)     // Catch: java.lang.Throwable -> L48
        L48:
            com.amap.api.col.3l.v3 r0 = r4.a     // Catch: java.lang.Throwable -> L4f
            int r5 = r0.c()     // Catch: java.lang.Throwable -> L4f
            return r5
        L4f:
            r0 = move-exception
            java.lang.String r1 = "APSService"
            java.lang.String r2 = "onStartCommand"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            int r5 = super.onStartCommand(r5, r6, r7)
            return r5
    }
}
