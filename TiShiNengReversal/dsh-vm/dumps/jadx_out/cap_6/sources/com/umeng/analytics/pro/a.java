package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface a extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.a$a, reason: collision with other inner class name */
    public static class C0041a implements com.umeng.analytics.pro.a {
        public C0041a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.a
        public java.lang.String a(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.analytics.pro.a
        public boolean a() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.umeng.analytics.pro.a
        public java.lang.String b() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.umeng.analytics.pro.a
        public java.lang.String b(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.analytics.pro.a
        public java.lang.String c(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.analytics.pro.a
        public java.lang.String d(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.analytics.pro.a
        public java.lang.String e(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b extends android.os.Binder implements com.umeng.analytics.pro.a {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;
        static final int e = 5;
        static final int f = 6;
        static final int g = 7;
        private static final java.lang.String h = "com.coolpad.deviceidsupport.IDeviceIdManager";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.umeng.analytics.pro.a$b$a, reason: collision with other inner class name */
        private static class C0042a implements com.umeng.analytics.pro.a {
            public static com.umeng.analytics.pro.a a;
            private android.os.IBinder b;

            C0042a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.b = r1
                    return
            }

            @Override // com.umeng.analytics.pro.a
            public java.lang.String a(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.umeng.analytics.pro.a
            public boolean a() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2c
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2c
                    boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L3f
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L38
                    r4 = 1
                L38:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L3f:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.b
                    return r0
            }

            @Override // com.umeng.analytics.pro.a
            public java.lang.String b() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2c
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.umeng.analytics.pro.a
            public java.lang.String b(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
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

            public java.lang.String c() {
                    r1 = this;
                    java.lang.String r0 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    return r0
            }

            @Override // com.umeng.analytics.pro.a
            public java.lang.String c(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.c(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.umeng.analytics.pro.a
            public java.lang.String d(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.d(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.umeng.analytics.pro.a
            public java.lang.String e(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.b     // Catch: java.lang.Throwable -> L2f
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.umeng.analytics.pro.a r2 = com.umeng.analytics.pro.a.b.c()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.e(r6)     // Catch: java.lang.Throwable -> L2f
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

        public b() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.umeng.analytics.pro.a a(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.umeng.analytics.pro.a
                if (r1 == 0) goto L13
                com.umeng.analytics.pro.a r0 = (com.umeng.analytics.pro.a) r0
                return r0
            L13:
                com.umeng.analytics.pro.a$b$a r0 = new com.umeng.analytics.pro.a$b$a
                r0.<init>(r2)
                return r0
        }

        public static boolean a(com.umeng.analytics.pro.a r1) {
                com.umeng.analytics.pro.a r0 = com.umeng.analytics.pro.a.b.C0042a.a
                if (r0 != 0) goto La
                if (r1 == 0) goto La
                com.umeng.analytics.pro.a.b.C0042a.a = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }

        public static com.umeng.analytics.pro.a c() {
                com.umeng.analytics.pro.a r0 = com.umeng.analytics.pro.a.b.C0042a.a
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
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                if (r4 == r0) goto L86
                switch(r4) {
                    case 1: goto L74;
                    case 2: goto L62;
                    case 3: goto L50;
                    case 4: goto L3e;
                    case 5: goto L2c;
                    case 6: goto L1e;
                    case 7: goto L10;
                    default: goto Lb;
                }
            Lb:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L10:
                r5.enforceInterface(r2)
                java.lang.String r4 = r3.b()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L1e:
                r5.enforceInterface(r2)
                boolean r4 = r3.a()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L2c:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.e(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L3e:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.d(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L50:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.c(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L62:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.b(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L74:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.a(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L86:
                r6.writeString(r2)
                return r1
        }
    }

    java.lang.String a(java.lang.String r1) throws android.os.RemoteException;

    boolean a() throws android.os.RemoteException;

    java.lang.String b() throws android.os.RemoteException;

    java.lang.String b(java.lang.String r1) throws android.os.RemoteException;

    java.lang.String c(java.lang.String r1) throws android.os.RemoteException;

    java.lang.String d(java.lang.String r1) throws android.os.RemoteException;

    java.lang.String e(java.lang.String r1) throws android.os.RemoteException;
}
