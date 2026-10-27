package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface tl extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.pangle.tl {

        /* renamed from: com.bytedance.pangle.tl$j$j, reason: collision with other inner class name */
        private static class C0014j implements com.bytedance.pangle.tl {
            public static com.bytedance.pangle.tl j;
            private android.os.IBinder xt;

            C0014j(android.os.IBinder r1) {
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

            @Override // com.bytedance.pangle.tl
            public int j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.ServiceConnection"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.bytedance.pangle.tl r2 = com.bytedance.pangle.tl.j.xt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.bytedance.pangle.tl r2 = com.bytedance.pangle.tl.j.xt()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r2.j()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L36
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L36:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.bytedance.pangle.tl
            public void j(android.content.ComponentName r6, android.os.IBinder r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.ServiceConnection"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L40
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    r0.writeStrongBinder(r7)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r4 = r5.xt     // Catch: java.lang.Throwable -> L18
                    boolean r2 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3c
                    com.bytedance.pangle.tl r2 = com.bytedance.pangle.tl.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3c
                    com.bytedance.pangle.tl r2 = com.bytedance.pangle.tl.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L18
                L35:
                    r1.recycle()
                    r0.recycle()
                    return
                L3c:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L35
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.bytedance.pangle.ServiceConnection"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.bytedance.pangle.tl j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.bytedance.pangle.ServiceConnection"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.pangle.tl
                if (r1 == 0) goto L13
                com.bytedance.pangle.tl r0 = (com.bytedance.pangle.tl) r0
                return r0
            L13:
                com.bytedance.pangle.tl$j$j r0 = new com.bytedance.pangle.tl$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.bytedance.pangle.tl xt() {
                com.bytedance.pangle.tl r0 = com.bytedance.pangle.tl.j.C0014j.j
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
                java.lang.String r0 = "com.bytedance.pangle.ServiceConnection"
                r1 = 1
                if (r4 == r1) goto L24
                r2 = 2
                if (r4 == r2) goto L16
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L12
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L12:
                r6.writeString(r0)
                return r1
            L16:
                r5.enforceInterface(r0)
                int r4 = r3.j()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L24:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                if (r4 == 0) goto L36
                android.os.Parcelable$Creator r4 = android.content.ComponentName.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                goto L37
            L36:
                r4 = 0
            L37:
                android.os.IBinder r5 = r5.readStrongBinder()
                r3.j(r4, r5)
                r6.writeNoException()
                return r1
        }
    }

    int j() throws android.os.RemoteException;

    void j(android.content.ComponentName r1, android.os.IBinder r2) throws android.os.RemoteException;
}
