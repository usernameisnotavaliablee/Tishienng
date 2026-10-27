package com.beizi.fusion.sm.repeackage.com.bun.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface MsaIdInterface extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
        public java.lang.String getOAID() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
        public boolean isDataArrived() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
        public boolean isSupported() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
        public void shutDown() throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface {
        private static final java.lang.String DESCRIPTOR = "com.bun.lib.MsaIdInterface";
        static final int TRANSACTION_getOAID = 3;
        static final int TRANSACTION_isDataArrived = 2;
        static final int TRANSACTION_isSupported = 1;
        static final int TRANSACTION_shutDown = 6;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface {
            public static com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface sDefaultImpl;
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.bun.lib.MsaIdInterface"
                    return r0
            }

            @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
            public java.lang.String getOAID() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.getOAID()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
            public boolean isDataArrived() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    boolean r2 = r2.isDataArrived()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
            public boolean isSupported() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 0
                    r4 = 1
                    boolean r2 = r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    boolean r2 = r2.isSupported()     // Catch: java.lang.Throwable -> L2c
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
                    r3 = 1
                L38:
                    r1.recycle()
                    r0.recycle()
                    return r3
                L3f:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
            public void shutDown() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r2 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    r2.shutDown()     // Catch: java.lang.Throwable -> L2b
                L24:
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L31
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    goto L24
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.bun.lib.MsaIdInterface"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.bun.lib.MsaIdInterface"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface
                if (r1 == 0) goto L13
                com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r0 = (com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface) r0
                return r0
            L13:
                com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface$Stub$Proxy r0 = new com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface getDefaultImpl() {
                com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r0 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r1) {
                com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface r0 = com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.beizi.fusion.sm.repeackage.com.bun.lib.MsaIdInterface.Stub.Proxy.sDefaultImpl = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
            Lc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "setDefaultImpl() called twice"
                r1.<init>(r0)
                throw r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = "com.bun.lib.MsaIdInterface"
                r1 = 1
                if (r4 == r1) goto L42
                r2 = 2
                if (r4 == r2) goto L34
                r2 = 3
                if (r4 == r2) goto L26
                r2 = 6
                if (r4 == r2) goto L1c
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L18
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L18:
                r6.writeString(r0)
                return r1
            L1c:
                r5.enforceInterface(r0)
                r3.shutDown()
                r6.writeNoException()
                return r1
            L26:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.getOAID()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L34:
                r5.enforceInterface(r0)
                boolean r4 = r3.isDataArrived()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L42:
                r5.enforceInterface(r0)
                boolean r4 = r3.isSupported()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
        }
    }

    java.lang.String getOAID() throws android.os.RemoteException;

    boolean isDataArrived() throws android.os.RemoteException;

    boolean isSupported() throws android.os.RemoteException;

    void shutDown() throws android.os.RemoteException;
}
