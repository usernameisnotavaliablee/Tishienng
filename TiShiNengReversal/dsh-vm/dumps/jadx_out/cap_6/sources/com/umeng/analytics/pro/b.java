package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface b extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.umeng.analytics.pro.b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.b
        public java.lang.String a() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.umeng.analytics.pro.b
        public java.lang.String a(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.umeng.analytics.pro.b
        public java.lang.String b(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0043b extends android.os.Binder implements com.umeng.analytics.pro.b {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        private static final java.lang.String d = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.umeng.analytics.pro.b$b$a */
        private static class a implements com.umeng.analytics.pro.b {
            public static com.umeng.analytics.pro.b a;
            private android.os.IBinder b;

            a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.b = r1
                    return
            }

            @Override // com.umeng.analytics.pro.b
            public java.lang.String a() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.samsung.android.deviceidservice.IDeviceIdService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2c
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.b()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.b()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.a()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L36
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L36:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.umeng.analytics.pro.b
            public java.lang.String a(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.samsung.android.deviceidservice.IDeviceIdService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.b()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.b()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.a(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L39
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r1.readString()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L39:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.b
                    return r0
            }

            public java.lang.String b() {
                    r1 = this;
                    java.lang.String r0 = "com.samsung.android.deviceidservice.IDeviceIdService"
                    return r0
            }

            @Override // com.umeng.analytics.pro.b
            public java.lang.String b(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.samsung.android.deviceidservice.IDeviceIdService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.b()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.b r2 = com.umeng.analytics.pro.b.AbstractBinderC0043b.b()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.b(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L39
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r1.readString()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L39:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public AbstractBinderC0043b() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.samsung.android.deviceidservice.IDeviceIdService"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.umeng.analytics.pro.b a(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.samsung.android.deviceidservice.IDeviceIdService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.umeng.analytics.pro.b
                if (r1 == 0) goto L13
                com.umeng.analytics.pro.b r0 = (com.umeng.analytics.pro.b) r0
                return r0
            L13:
                com.umeng.analytics.pro.b$b$a r0 = new com.umeng.analytics.pro.b$b$a
                r0.<init>(r2)
                return r0
        }

        public static boolean a(com.umeng.analytics.pro.b r1) {
                com.umeng.analytics.pro.b r0 = com.umeng.analytics.pro.b.AbstractBinderC0043b.a.a
                if (r0 != 0) goto La
                if (r1 == 0) goto La
                com.umeng.analytics.pro.b.AbstractBinderC0043b.a.a = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }

        public static com.umeng.analytics.pro.b b() {
                com.umeng.analytics.pro.b r0 = com.umeng.analytics.pro.b.AbstractBinderC0043b.a.a
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = "com.samsung.android.deviceidservice.IDeviceIdService"
                r1 = 1
                if (r4 == r1) goto L3d
                r2 = 2
                if (r4 == r2) goto L2b
                r2 = 3
                if (r4 == r2) goto L19
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L15
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L15:
                r6.writeString(r0)
                return r1
            L19:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.b(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L2b:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.a(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L3d:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.a()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
        }
    }

    java.lang.String a() throws android.os.RemoteException;

    java.lang.String a(java.lang.String r1) throws android.os.RemoteException;

    java.lang.String b(java.lang.String r1) throws android.os.RemoteException;
}
