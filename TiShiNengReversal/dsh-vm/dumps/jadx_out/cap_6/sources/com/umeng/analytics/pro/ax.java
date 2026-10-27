package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ax implements com.umeng.analytics.pro.av {
    private static final java.lang.String a = "Coolpad";
    private static final java.lang.String b = "com.coolpad.deviceidsupport";
    private static final java.lang.String c = "com.coolpad.deviceidsupport.DeviceIdService";
    private static com.umeng.analytics.pro.a d;
    private java.lang.String e;
    private java.util.concurrent.CountDownLatch f;
    private android.content.Context g;
    private final android.content.ServiceConnection h;


    public ax() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.e = r0
            com.umeng.analytics.pro.ax$1 r0 = new com.umeng.analytics.pro.ax$1
            r0.<init>(r1)
            r1.h = r0
            return
    }

    static /* synthetic */ android.content.Context a(com.umeng.analytics.pro.ax r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.a a() {
            com.umeng.analytics.pro.a r0 = com.umeng.analytics.pro.ax.d
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.a a(com.umeng.analytics.pro.a r0) {
            com.umeng.analytics.pro.ax.d = r0
            return r0
    }

    static /* synthetic */ java.lang.String a(com.umeng.analytics.pro.ax r0, java.lang.String r1) {
            r0.e = r1
            return r1
    }

    static /* synthetic */ java.lang.String b(com.umeng.analytics.pro.ax r0) {
            java.lang.String r0 = r0.e
            return r0
    }

    private void b(android.content.Context r5) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "com.coolpad.deviceidsupport"
            java.lang.String r3 = "com.coolpad.deviceidsupport.DeviceIdService"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L18
            r0.setComponent(r1)     // Catch: java.lang.Throwable -> L18
            android.content.ServiceConnection r1 = r4.h     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r5.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r5 = move-exception
            r5.getMessage()
            java.util.concurrent.CountDownLatch r5 = r4.f
            r5.countDown()
            return
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch c(com.umeng.analytics.pro.ax r0) {
            java.util.concurrent.CountDownLatch r0 = r0.f
            return r0
    }

    private void c(android.content.Context r2) {
            r1 = this;
            android.content.ServiceConnection r0 = r1.h     // Catch: java.lang.Throwable -> L6
            r2.unbindService(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            r2.getMessage()
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = r6.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r5.g = r1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r1.<init>(r2)
            r5.f = r1
            r5.b(r6)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            java.util.concurrent.CountDownLatch r1 = r5.f     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            r3 = 500(0x1f4, double:2.47E-321)
            r1.await(r3, r2)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            java.lang.String r0 = r5.e     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            r5.c(r6)
            return r0
        L28:
            r0 = move-exception
            goto L32
        L2a:
            r1 = move-exception
            r1.getMessage()     // Catch: java.lang.Throwable -> L28
            r5.c(r6)
            return r0
        L32:
            r5.c(r6)
            throw r0
    }
}
