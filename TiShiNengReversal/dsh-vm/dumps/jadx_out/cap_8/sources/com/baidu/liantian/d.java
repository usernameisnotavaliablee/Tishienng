package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends android.os.FileObserver {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5988b;

    /* renamed from: c, reason: collision with root package name */
    private int f5989c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f5990d;


    public d(android.content.Context r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 4095(0xfff, float:5.738E-42)
            r1.<init>(r4, r0)
            r1.a = r4     // Catch: java.lang.Throwable -> L1b
            r1.f5988b = r5     // Catch: java.lang.Throwable -> L1b
            r1.f5989c = r3     // Catch: java.lang.Throwable -> L1b
            r1.f5990d = r2     // Catch: java.lang.Throwable -> L1b
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r1.a     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            r2.exists()     // Catch: java.lang.Throwable -> L1b
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            com.baidu.liantian.b.e.a()
            return
    }

    static /* synthetic */ java.lang.String a(com.baidu.liantian.d r0) {
            java.lang.String r0 = r0.a
            return r0
    }

    static /* synthetic */ java.lang.String b(com.baidu.liantian.d r0) {
            java.lang.String r0 = r0.f5988b
            return r0
    }

    static /* synthetic */ android.content.Context c(com.baidu.liantian.d r0) {
            android.content.Context r0 = r0.f5990d
            return r0
    }

    static /* synthetic */ int d(com.baidu.liantian.d r0) {
            int r0 = r0.f5989c
            return r0
    }

    public final boolean a() {
            r3 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f5988b     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L12
            boolean r0 = r1.delete()     // Catch: java.lang.Throwable -> L13
        L12:
            return r0
        L13:
            com.baidu.liantian.b.e.a()
            return r0
    }

    @Override // android.os.FileObserver
    public void onEvent(int r1, java.lang.String r2) {
            r0 = this;
            r2 = 2
            if (r1 == r2) goto L1b
            r2 = 4
            if (r1 == r2) goto L1b
            r2 = 64
            if (r1 == r2) goto L1b
            r2 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L1b
            r2 = 512(0x200, float:7.17E-43)
            if (r1 == r2) goto L1b
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 == r2) goto L1b
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 == r2) goto L1b
            return
        L1b:
            com.baidu.liantian.d$1 r1 = new com.baidu.liantian.d$1     // Catch: java.lang.Throwable -> L24
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r1.start()     // Catch: java.lang.Throwable -> L24
            return
        L24:
            com.baidu.liantian.b.e.a()
            return
    }
}
