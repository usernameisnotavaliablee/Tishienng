package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IRemoteDecoderCreator extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator {
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

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator
        public com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator";
        static final int TRANSACTION_newRemoteFrameDecoderDelegate = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator {
            public static com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator sDefaultImpl;
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
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator"
                    return r0
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator
            public com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r2 = r2.newRemoteFrameDecoderDelegate()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L40
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub.asInterface(r2)     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r0 = (com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r0 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r1) {
                com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r0 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator"
                r1 = 1
                if (r4 == r1) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r0)
                return r1
            L13:
                r5.enforceInterface(r0)
                com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r4 = r3.newRemoteFrameDecoderDelegate()
                r6.writeNoException()
                if (r4 == 0) goto L24
                android.os.IBinder r4 = r4.asBinder()
                goto L25
            L24:
                r4 = 0
            L25:
                r6.writeStrongBinder(r4)
                return r1
        }
    }

    com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate() throws android.os.RemoteException;
}
