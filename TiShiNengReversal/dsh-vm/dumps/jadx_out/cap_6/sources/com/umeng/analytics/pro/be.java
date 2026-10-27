package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class be implements com.umeng.analytics.pro.av {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.be$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements android.content.ServiceConnection {
        boolean a;
        private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;

        private a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
                r0.<init>()
                r1.b = r0
                return
        }

        /* synthetic */ a(com.umeng.analytics.pro.be.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public android.os.IBinder a() throws java.lang.InterruptedException {
                r4 = this;
                boolean r0 = r4.a
                if (r0 != 0) goto L14
                r0 = 1
                r4.a = r0
                java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.b
                r1 = 5
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                java.lang.Object r0 = r0.poll(r1, r3)
                android.os.IBinder r0 = (android.os.IBinder) r0
                return r0
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r1 = r0.b     // Catch: java.lang.InterruptedException -> L5
                r1.put(r2)     // Catch: java.lang.InterruptedException -> L5
            L5:
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                return
        }
    }

    public be() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r6) {
            r5 = this;
            com.umeng.analytics.pro.be$a r0 = new com.umeng.analytics.pro.be$a
            r1 = 0
            r0.<init>(r1)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.samsung.android.deviceidservice"
            java.lang.String r4 = "com.samsung.android.deviceidservice.DeviceIdService"
            r2.setClassName(r3, r4)
            r3 = 1
            boolean r2 = r6.bindService(r2, r0, r3)
            if (r2 == 0) goto L31
            android.os.IBinder r2 = r0.a()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.a(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.lang.String r1 = r2.a()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            r6.unbindService(r0)
            return r1
        L29:
            r1 = move-exception
            r6.unbindService(r0)
            throw r1
        L2e:
            r6.unbindService(r0)
        L31:
            return r1
    }
}
