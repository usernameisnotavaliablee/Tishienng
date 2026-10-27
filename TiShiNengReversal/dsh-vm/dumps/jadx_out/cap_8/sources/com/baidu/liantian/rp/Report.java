package com.baidu.liantian.rp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Report {
    private static com.baidu.liantian.rp.Report a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f5997b;

    private Report(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.f5997b = r1
            return
    }

    public static synchronized com.baidu.liantian.rp.Report getInstance(android.content.Context r2) {
            java.lang.Class<com.baidu.liantian.rp.Report> r0 = com.baidu.liantian.rp.Report.class
            monitor-enter(r0)
            com.baidu.liantian.rp.Report r1 = com.baidu.liantian.rp.Report.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.baidu.liantian.rp.Report r1 = new com.baidu.liantian.rp.Report     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.baidu.liantian.rp.Report.a = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.baidu.liantian.rp.Report r2 = com.baidu.liantian.rp.Report.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public void fr() {
            r3 = this;
            android.content.Context r0 = r3.f5997b     // Catch: java.lang.Throwable -> L15
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.a(r0)     // Catch: java.lang.Throwable -> L15
            android.os.Message r1 = new android.os.Message     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 9
            r1.what = r2     // Catch: java.lang.Throwable -> L15
            com.baidu.liantian.rp.f.a r0 = r0.a     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            com.baidu.liantian.b.e.a()
            return
    }

    public void i(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            android.content.Context r0 = r6.f5997b     // Catch: java.lang.Throwable -> Lb
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.baidu.liantian.b.e.a(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            com.baidu.liantian.b.e.a()
            return
    }

    public void n() {
            r3 = this;
            android.content.Context r0 = r3.f5997b     // Catch: java.lang.Throwable -> L14
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.a(r0)     // Catch: java.lang.Throwable -> L14
            android.os.Message r1 = new android.os.Message     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            r2 = 6
            r1.what = r2     // Catch: java.lang.Throwable -> L14
            com.baidu.liantian.rp.f.a r0 = r0.a     // Catch: java.lang.Throwable -> L14
            r0.a(r1)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            com.baidu.liantian.b.e.a()
            return
    }

    public void r(boolean r1) {
            r0 = this;
            android.content.Context r1 = r0.f5997b     // Catch: java.lang.Throwable -> La
            com.baidu.liantian.b.f r1 = com.baidu.liantian.b.f.a(r1)     // Catch: java.lang.Throwable -> La
            r1.a()     // Catch: java.lang.Throwable -> La
            return
        La:
            com.baidu.liantian.b.e.a()
            return
    }

    public void s(java.lang.String r2) {
            r1 = this;
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L9
            android.content.Context r0 = r1.f5997b     // Catch: java.lang.Throwable -> L9
            com.baidu.liantian.b.e.c(r0, r2)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            com.baidu.liantian.b.e.a()
            return
    }

    public void sr(java.lang.String r4) {
            r3 = this;
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a
            android.content.Context r0 = r3.f5997b     // Catch: java.lang.Throwable -> L1a
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.a(r0)     // Catch: java.lang.Throwable -> L1a
            android.os.Message r1 = new android.os.Message     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            r2 = 11
            r1.what = r2     // Catch: java.lang.Throwable -> L1a
            r1.obj = r4     // Catch: java.lang.Throwable -> L1a
            com.baidu.liantian.rp.f.a r4 = r0.a     // Catch: java.lang.Throwable -> L1a
            r4.a(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            com.baidu.liantian.b.e.a()
            return
    }

    public void w(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.f5997b     // Catch: java.lang.Throwable -> L6
            com.baidu.liantian.b.e.d(r0, r2)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            com.baidu.liantian.b.e.a()
            return
    }
}
