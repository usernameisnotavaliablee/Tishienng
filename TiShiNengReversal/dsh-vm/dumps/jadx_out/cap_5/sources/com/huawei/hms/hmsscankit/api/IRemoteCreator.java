package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IRemoteCreator extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IRemoteCreator {
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

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate newRemoteDecoderDelegate() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public com.huawei.hms.hmsscankit.api.IRemoteViewDelegate newRemoteViewDelegate(com.huawei.hms.feature.dynamic.IObjectWrapper r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IRemoteCreator {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteCreator";
        static final int TRANSACTION_newRemoteDecoderDelegate = 2;
        static final int TRANSACTION_newRemoteHmsDecoderDelegate = 3;
        static final int TRANSACTION_newRemoteViewDelegate = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IRemoteCreator {
            public static com.huawei.hms.hmsscankit.api.IRemoteCreator sDefaultImpl;
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
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                    return r0
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate newRemoteDecoderDelegate() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = r2.newRemoteDecoderDelegate()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L40
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.asInterface(r2)     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = r2.newRemoteHmsDecoderDelegate()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L40
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.asInterface(r2)     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public com.huawei.hms.hmsscankit.api.IRemoteViewDelegate newRemoteViewDelegate(com.huawei.hms.feature.dynamic.IObjectWrapper r6, com.huawei.hms.feature.dynamic.IObjectWrapper r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L15
                    r2 = 0
                    if (r6 == 0) goto L17
                    android.os.IBinder r3 = r6.asBinder()     // Catch: java.lang.Throwable -> L15
                    goto L18
                L15:
                    r6 = move-exception
                    goto L55
                L17:
                    r3 = r2
                L18:
                    r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L15
                    if (r7 == 0) goto L21
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L15
                L21:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L15
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L15
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L15
                    if (r2 != 0) goto L43
                    com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    if (r2 == 0) goto L43
                    com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r6 = r2.newRemoteViewDelegate(r6, r7)     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r6
                L43:
                    r1.readException()     // Catch: java.lang.Throwable -> L15
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r6 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.asInterface(r6)     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r6
                L55:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteCreator asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IRemoteCreator
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IRemoteCreator r0 = (com.huawei.hms.hmsscankit.api.IRemoteCreator) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IRemoteCreator$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IRemoteCreator$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteCreator getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IRemoteCreator r0 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IRemoteCreator r1) {
                com.huawei.hms.hmsscankit.api.IRemoteCreator r0 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.Proxy.sDefaultImpl = r1
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
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                r0 = 0
                java.lang.String r1 = "com.huawei.hms.hmsscankit.api.IRemoteCreator"
                r2 = 1
                if (r5 == r2) goto L42
                r3 = 2
                if (r5 == r3) goto L2e
                r3 = 3
                if (r5 == r3) goto L1a
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L16
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L16:
                r7.writeString(r1)
                return r2
            L1a:
                r6.enforceInterface(r1)
                com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r5 = r4.newRemoteHmsDecoderDelegate()
                r7.writeNoException()
                if (r5 == 0) goto L2a
                android.os.IBinder r0 = r5.asBinder()
            L2a:
                r7.writeStrongBinder(r0)
                return r2
            L2e:
                r6.enforceInterface(r1)
                com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r5 = r4.newRemoteDecoderDelegate()
                r7.writeNoException()
                if (r5 == 0) goto L3e
                android.os.IBinder r0 = r5.asBinder()
            L3e:
                r7.writeStrongBinder(r0)
                return r2
            L42:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                android.os.IBinder r6 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r5 = r4.newRemoteViewDelegate(r5, r6)
                r7.writeNoException()
                if (r5 == 0) goto L62
                android.os.IBinder r0 = r5.asBinder()
            L62:
                r7.writeStrongBinder(r0)
                return r2
        }
    }

    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate newRemoteDecoderDelegate() throws android.os.RemoteException;

    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws android.os.RemoteException;

    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate newRemoteViewDelegate(com.huawei.hms.feature.dynamic.IObjectWrapper r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2) throws android.os.RemoteException;
}
