package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface vl extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.embedapplog.vl {

        /* renamed from: com.bytedance.embedapplog.vl$j$j, reason: collision with other inner class name */
        static class C0208j implements com.bytedance.embedapplog.vl {
            public static com.bytedance.embedapplog.vl j;
            private android.os.IBinder xt;

            C0208j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.bytedance.embedapplog.vl
            public java.lang.String cw(java.lang.String r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.cw(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.bytedance.embedapplog.vl
            public java.lang.String j(java.lang.String r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.bytedance.embedapplog.vl
            public boolean j() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2c
                    boolean r2 = r2.j()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.bytedance.embedapplog.vl
            public java.lang.String r(java.lang.String r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.r(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.bytedance.embedapplog.vl
            public java.lang.String up(java.lang.String r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.up(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.bytedance.embedapplog.vl
            public java.lang.String xt() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.xt()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.bytedance.embedapplog.vl
            public java.lang.String xt(java.lang.String r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.embedapplog.vl r2 = com.bytedance.embedapplog.vl.j.cw()     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
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

        public static com.bytedance.embedapplog.vl cw() {
                com.bytedance.embedapplog.vl r0 = com.bytedance.embedapplog.vl.j.C0208j.j
                return r0
        }

        public static com.bytedance.embedapplog.vl j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.coolpad.deviceidsupport.IDeviceIdManager"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.embedapplog.vl
                if (r1 == 0) goto L13
                com.bytedance.embedapplog.vl r0 = (com.bytedance.embedapplog.vl) r0
                return r0
            L13:
                com.bytedance.embedapplog.vl$j$j r0 = new com.bytedance.embedapplog.vl$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
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
                java.lang.String r4 = r3.xt()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L1e:
                r5.enforceInterface(r2)
                boolean r4 = r3.j()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L2c:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.up(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L3e:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.r(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L50:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.cw(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L62:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.xt(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L74:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.j(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L86:
                r6.writeString(r2)
                return r1
        }
    }

    java.lang.String cw(java.lang.String r1);

    java.lang.String j(java.lang.String r1);

    boolean j();

    java.lang.String r(java.lang.String r1);

    java.lang.String up(java.lang.String r1);

    java.lang.String xt();

    java.lang.String xt(java.lang.String r1);
}
