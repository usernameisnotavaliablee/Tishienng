package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class az implements com.umeng.analytics.pro.av {
    private static final java.lang.String a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static final int b = 1;
    private static final int c = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.az$1, reason: invalid class name */
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

        /* synthetic */ a(com.umeng.analytics.pro.az.AnonymousClass1 r1) {
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements android.os.IInterface {
        private android.os.IBinder a;

        public b(android.os.IBinder r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.lang.String a() throws android.os.RemoteException {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
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

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.IBinder r0 = r1.a
                return r0
        }

        public boolean b() throws android.os.RemoteException {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L25
                android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L25
                r3 = 2
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L25
                r1.readException()     // Catch: java.lang.Throwable -> L25
                int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L25
                if (r2 == 0) goto L1e
                r4 = 1
            L1e:
                r1.recycle()
                r0.recycle()
                return r4
            L25:
                r2 = move-exception
                r1.recycle()
                r0.recycle()
                throw r2
        }
    }

    az() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r5) {
            r4 = this;
            com.umeng.analytics.pro.az$a r0 = new com.umeng.analytics.pro.az$a
            r1 = 0
            r0.<init>(r1)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.uodis.opendevice.OPENIDS_SERVICE"
            r2.<init>(r3)
            java.lang.String r3 = "com.huawei.hwid"
            r2.setPackage(r3)
            r3 = 1
            boolean r2 = r5.bindService(r2, r0, r3)
            if (r2 == 0) goto L32
            com.umeng.analytics.pro.az$b r2 = new com.umeng.analytics.pro.az$b     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2f
            android.os.IBinder r3 = r0.a()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2f
            java.lang.String r1 = r2.a()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2f
            r5.unbindService(r0)
            return r1
        L2a:
            r1 = move-exception
            r5.unbindService(r0)
            throw r1
        L2f:
            r5.unbindService(r0)
        L32:
            return r1
    }
}
