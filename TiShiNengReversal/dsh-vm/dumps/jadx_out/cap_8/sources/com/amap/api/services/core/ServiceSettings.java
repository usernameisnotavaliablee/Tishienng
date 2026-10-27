package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ServiceSettings {
    public static final java.lang.String CHINESE = "zh-CN";
    public static final java.lang.String ENGLISH = "en";
    public static final int HTTP = 1;
    public static final int HTTPS = 2;

    /* renamed from: c, reason: collision with root package name */
    private static com.amap.api.services.core.ServiceSettings f5163c;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5164b;

    /* renamed from: d, reason: collision with root package name */
    private int f5165d;

    /* renamed from: e, reason: collision with root package name */
    private int f5166e;

    private ServiceSettings() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "zh-CN"
            r1.a = r0
            r0 = 1
            r1.f5164b = r0
            r0 = 20000(0x4e20, float:2.8026E-41)
            r1.f5165d = r0
            r1.f5166e = r0
            return
    }

    public static com.amap.api.services.core.ServiceSettings getInstance() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.f5163c
            if (r0 != 0) goto Lb
            com.amap.api.services.core.ServiceSettings r0 = new com.amap.api.services.core.ServiceSettings
            r0.<init>()
            com.amap.api.services.core.ServiceSettings.f5163c = r0
        Lb:
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.f5163c
            return r0
    }

    public static synchronized void updatePrivacyAgree(android.content.Context r2, boolean r3) {
            java.lang.Class<com.amap.api.services.core.ServiceSettings> r0 = com.amap.api.services.core.ServiceSettings.class
            monitor-enter(r0)
            r1 = 0
            com.amap.api.col.s.i1 r1 = com.amap.api.col.s.i4.a(r1)     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.cf.i(r2, r3, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static synchronized void updatePrivacyShow(android.content.Context r2, boolean r3, boolean r4) {
            java.lang.Class<com.amap.api.services.core.ServiceSettings> r0 = com.amap.api.services.core.ServiceSettings.class
            monitor-enter(r0)
            r1 = 0
            com.amap.api.col.s.i1 r1 = com.amap.api.col.s.i4.a(r1)     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.cf.j(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public void destroyInnerAsynThreadPool() {
            r3 = this;
            com.amap.api.col.s.y.c()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "ServiceSettings"
            java.lang.String r2 = "destroyInnerAsynThreadPool"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            return
    }

    public int getConnectionTimeOut() {
            r1 = this;
            int r0 = r1.f5165d
            return r0
    }

    public java.lang.String getLanguage() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int getProtocol() {
            r1 = this;
            int r0 = r1.f5164b
            return r0
    }

    public int getSoTimeOut() {
            r1 = this;
            int r0 = r1.f5166e
            return r0
    }

    public void setApiKey(java.lang.String r1) {
            r0 = this;
            com.amap.api.col.s.z0.a(r1)
            return
    }

    public void setConnectionTimeOut(int r2) {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 >= r0) goto L7
            r1.f5165d = r0
            return
        L7:
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r2 <= r0) goto Le
            r1.f5165d = r0
            return
        Le:
            r1.f5165d = r2
            return
    }

    public void setLanguage(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setProtocol(int r3) {
            r2 = this;
            r2.f5164b = r3
            com.amap.api.col.s.e1 r3 = com.amap.api.col.s.e1.a()
            int r0 = r2.f5164b
            r1 = 2
            if (r0 != r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r3.e(r0)
            return
    }

    public void setSoTimeOut(int r2) {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 >= r0) goto L7
            r1.f5166e = r0
            return
        L7:
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r2 <= r0) goto Le
            r1.f5166e = r0
            return
        Le:
            r1.f5166e = r2
            return
    }
}
