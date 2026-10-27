package com.beizi.fusion.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface c extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a extends android.os.Binder implements com.beizi.fusion.d.b.c {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.fusion.d.b.c$a$a, reason: collision with other inner class name */
        public static class C0127a implements com.beizi.fusion.d.b.c {
            private android.os.IBinder a;

            public C0127a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            @Override // com.beizi.fusion.d.b.c
            public java.lang.String a() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.zui.deviceidservice.IDeviceidInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r3 = 1
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r1.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
                L2a:
                    r1.recycle()
                    r0.recycle()
                    r0 = 0
                    return r0
            }

            @Override // com.beizi.fusion.d.b.c
            public java.lang.String a(java.lang.String r5) {
                    r4 = this;
                    android.os.Parcel r5 = android.os.Parcel.obtain()
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.zui.deviceidservice.IDeviceidInterface"
                    r5.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    android.os.IBinder r1 = r4.a     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r2 = 4
                    r3 = 0
                    r1.transact(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r0.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    java.lang.String r1 = r0.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r0.recycle()
                    r5.recycle()
                    return r1
                L22:
                    r1 = move-exception
                    r0.recycle()
                    r5.recycle()
                    throw r1
                L2a:
                    r0.recycle()
                    r5.recycle()
                    r5 = 0
                    return r5
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // com.beizi.fusion.d.b.c
            public java.lang.String b() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.zui.deviceidservice.IDeviceidInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r3 = 2
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r1.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
                L2a:
                    r1.recycle()
                    r0.recycle()
                    r0 = 0
                    return r0
            }

            @Override // com.beizi.fusion.d.b.c
            public java.lang.String b(java.lang.String r5) {
                    r4 = this;
                    android.os.Parcel r5 = android.os.Parcel.obtain()
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.zui.deviceidservice.IDeviceidInterface"
                    r5.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    android.os.IBinder r1 = r4.a     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r2 = 5
                    r3 = 0
                    r1.transact(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r0.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    java.lang.String r1 = r0.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L2a
                    r0.recycle()
                    r5.recycle()
                    return r1
                L22:
                    r1 = move-exception
                    r0.recycle()
                    r5.recycle()
                    throw r1
                L2a:
                    r0.recycle()
                    r5.recycle()
                    r5 = 0
                    return r5
            }

            @Override // com.beizi.fusion.d.b.c
            public boolean c() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r2 = 0
                    java.lang.String r3 = "com.zui.deviceidservice.IDeviceidInterface"
                    r0.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r3 = r5.a     // Catch: java.lang.Throwable -> L25
                    r4 = 3
                    r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L25
                    r1.readException()     // Catch: java.lang.Throwable -> L25
                    int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L25
                    if (r3 == 0) goto L1e
                    r2 = 1
                L1e:
                    r1.recycle()     // Catch: java.lang.Throwable -> L25
                    r0.recycle()     // Catch: java.lang.Throwable -> L25
                    return r2
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
            }
        }

        @Override // android.os.Binder
        protected boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = "com.zui.deviceidservice.IDeviceidInterface"
                r1 = 1
                if (r4 == r1) goto L5f
                r2 = 2
                if (r4 == r2) goto L51
                r2 = 3
                if (r4 == r2) goto L43
                r2 = 4
                if (r4 == r2) goto L31
                r2 = 5
                if (r4 == r2) goto L1f
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L1b
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1b:
                r6.writeString(r0)
                return r1
            L1f:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.b(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L31:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.a(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L43:
                r5.enforceInterface(r0)
                boolean r4 = r3.c()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L51:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.b()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L5f:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.a()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
        }
    }

    java.lang.String a();

    java.lang.String a(java.lang.String r1);

    java.lang.String b();

    java.lang.String b(java.lang.String r1);

    boolean c();
}
