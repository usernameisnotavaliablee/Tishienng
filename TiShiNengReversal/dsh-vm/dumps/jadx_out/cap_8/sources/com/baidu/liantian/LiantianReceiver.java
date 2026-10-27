package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LiantianReceiver extends android.content.BroadcastReceiver {
    com.baidu.liantian.ac.Callback a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5895b;

    /* renamed from: c, reason: collision with root package name */
    private long f5896c;



    public LiantianReceiver() {
            r2 = this;
            r2.<init>()
            com.baidu.liantian.LiantianReceiver$1 r0 = new com.baidu.liantian.LiantianReceiver$1
            r0.<init>(r2)
            r2.a = r0
            r0 = 0
            r2.f5895b = r0
            r0 = 0
            r2.f5896c = r0
            return
    }

    static /* synthetic */ void a(java.lang.ClassLoader r7, android.content.Intent r8, android.content.Context r9) {
            java.lang.String r0 = "target_class"
            java.lang.String r0 = r8.getStringExtra(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Class r7 = r7.loadClass(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r7.newInstance()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "target_method"
            java.lang.String r1 = r8.getStringExtra(r1)     // Catch: java.lang.Throwable -> L37
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L37
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L37
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L37
            android.content.Context r9 = r9.getApplicationContext()     // Catch: java.lang.Throwable -> L37
            android.content.Context r9 = com.stub.StubApp.getOrigApplicationContext(r9)     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L37
            r1[r5] = r9     // Catch: java.lang.Throwable -> L37
            r1[r6] = r8     // Catch: java.lang.Throwable -> L37
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r7 = move-exception
            r7.getMessage()
            com.baidu.liantian.b.b()
            return
    }

    public final com.baidu.liantian.LiantianReceiver a() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La
            r2.f5896c = r0     // Catch: java.lang.Throwable -> La
            r0 = 1
            r2.f5895b = r0     // Catch: java.lang.Throwable -> La
            return r2
        La:
            com.baidu.liantian.b.e.a()
            return r2
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            if (r7 != 0) goto L3
            goto L14
        L3:
            boolean r0 = r5.f5895b     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L15
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2a
            long r2 = r5.f5896c     // Catch: java.lang.Throwable -> L2a
            long r0 = r0 - r2
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L15
        L14:
            return
        L15:
            r7.toString()     // Catch: java.lang.Throwable -> L2a
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r5.f5895b     // Catch: java.lang.Throwable -> L2a
            com.baidu.liantian.b.r r1 = com.baidu.liantian.b.r.a()     // Catch: java.lang.Throwable -> L2a
            com.baidu.liantian.LiantianReceiver$2 r2 = new com.baidu.liantian.LiantianReceiver$2     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r7, r6, r0)     // Catch: java.lang.Throwable -> L2a
            r1.a(r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            com.baidu.liantian.b.e.a()
            return
    }
}
