package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$a, reason: collision with other inner class name */
    private static final class C0050a {
        private final java.lang.String a;
        private final boolean b;

        C0050a(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        static /* synthetic */ java.lang.String a(com.umeng.commonsdk.statistics.common.a.C0050a r0) {
                java.lang.String r0 = r0.b()
                return r0
        }

        private java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean a() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements android.content.ServiceConnection {
        boolean a;
        private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> b;

        private b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
                r1 = 1
                r0.<init>(r1)
                r2.b = r0
                return
        }

        /* synthetic */ b(com.umeng.commonsdk.statistics.common.a.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public android.os.IBinder a() throws java.lang.InterruptedException {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto L10
                r0 = 1
                r1.a = r0
                java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r1.b
                java.lang.Object r0 = r0.take()
                android.os.IBinder r0 = (android.os.IBinder) r0
                return r0
            L10:
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements android.os.IInterface {
        private android.os.IBinder a;

        public c(android.os.IBinder r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.lang.String a() throws android.os.RemoteException {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L22
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                r1.readException()     // Catch: java.lang.Throwable -> L22
                java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                r1.recycle()
                r0.recycle()
                return r2
            L22:
                r2 = move-exception
                r1.recycle()
                r0.recycle()
                throw r2
        }

        public boolean a(boolean r5) throws android.os.RemoteException {
                r4 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                r0.writeInt(r5)     // Catch: java.lang.Throwable -> L28
                android.os.IBinder r5 = r4.a     // Catch: java.lang.Throwable -> L28
                r2 = 2
                r3 = 0
                r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L28
                r1.readException()     // Catch: java.lang.Throwable -> L28
                int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L28
                if (r5 == 0) goto L21
                r3 = 1
            L21:
                r1.recycle()
                r0.recycle()
                return r3
            L28:
                r5 = move-exception
                r1.recycle()
                r0.recycle()
                throw r5
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.IBinder r0 = r1.a
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            r0 = 0
            com.umeng.commonsdk.statistics.common.a$a r2 = c(r2)     // Catch: java.lang.Exception -> L13
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r1 = r2.a()     // Catch: java.lang.Exception -> L13
            if (r1 != 0) goto L13
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.a.C0050a.a(r2)     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            return r0
    }

    public static java.lang.String b(android.content.Context r1) {
            r0 = 0
            com.umeng.commonsdk.statistics.common.a$a r1 = c(r1)     // Catch: java.lang.Exception -> Ld
            if (r1 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.a.C0050a.a(r1)     // Catch: java.lang.Exception -> Ld
            return r1
        Ld:
            return r0
    }

    private static com.umeng.commonsdk.statistics.common.a.C0050a c(android.content.Context r4) throws java.lang.Exception {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 != r1) goto Lc
            return r2
        Lc:
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a()
            java.lang.String r1 = "com.android.vending"
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.a(r4, r1, r3)
            if (r0 != 0) goto L1a
            return r2
        L1a:
            com.umeng.commonsdk.statistics.common.a$b r0 = new com.umeng.commonsdk.statistics.common.a$b
            r0.<init>(r2)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.ads.identifier.service.START"
            r1.<init>(r2)
            java.lang.String r2 = "com.google.android.gms"
            r1.setPackage(r2)
            r2 = 1
            boolean r1 = r4.bindService(r1, r0, r2)
            if (r1 == 0) goto L5a
            com.umeng.commonsdk.statistics.common.a$c r1 = new com.umeng.commonsdk.statistics.common.a$c     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            android.os.IBinder r3 = r0.a()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            boolean r2 = r1.a(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r3 = ""
            if (r2 != 0) goto L4c
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            goto L4c
        L48:
            r1 = move-exception
            goto L56
        L4a:
            r1 = move-exception
            goto L55
        L4c:
            com.umeng.commonsdk.statistics.common.a$a r1 = new com.umeng.commonsdk.statistics.common.a$a     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r4.unbindService(r0)
            return r1
        L55:
            throw r1     // Catch: java.lang.Throwable -> L48
        L56:
            r4.unbindService(r0)
            throw r1
        L5a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Google Play connection failed"
            r4.<init>(r0)
            throw r4
    }
}
