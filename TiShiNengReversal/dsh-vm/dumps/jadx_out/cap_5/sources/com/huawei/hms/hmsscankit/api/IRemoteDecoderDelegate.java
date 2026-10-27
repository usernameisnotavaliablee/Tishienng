package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IRemoteDecoderDelegate extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate {
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

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
        public com.huawei.hms.feature.dynamic.IObjectWrapper buildBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
        public void buildBitmapLog(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
        public com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
        public com.huawei.hms.ml.scan.HmsScanResult decodeWithBuffer(byte[] r1, int r2, int r3, com.huawei.hms.feature.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
        public com.huawei.hms.feature.dynamic.IObjectWrapper queryDeepLinkInfo(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate";
        static final int TRANSACTION_buildBitmap = 4;
        static final int TRANSACTION_buildBitmapLog = 3;
        static final int TRANSACTION_decodeWithBitmap = 1;
        static final int TRANSACTION_decodeWithBuffer = 2;
        static final int TRANSACTION_queryDeepLinkInfo = 5;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate {
            public static com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
            public com.huawei.hms.feature.dynamic.IObjectWrapper buildBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L4b
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    com.huawei.hms.feature.dynamic.IObjectWrapper r6 = r2.buildBitmap(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return r6
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L14
                    com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return r6
                L4b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
            public void buildBitmapLog(com.huawei.hms.feature.dynamic.IObjectWrapper r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L42
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L38
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L38
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r2.buildBitmapLog(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L42:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
            public com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r6, com.huawei.hms.feature.dynamic.IObjectWrapper r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
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
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    if (r2 == 0) goto L43
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.ml.scan.HmsScan[] r6 = r2.decodeWithBitmap(r6, r7)     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r6
                L43:
                    r1.readException()     // Catch: java.lang.Throwable -> L15
                    android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan> r6 = com.huawei.hms.ml.scan.HmsScan.CREATOR     // Catch: java.lang.Throwable -> L15
                    java.lang.Object[] r6 = r1.createTypedArray(r6)     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.ml.scan.HmsScan[] r6 = (com.huawei.hms.ml.scan.HmsScan[]) r6     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r6
                L55:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
            public com.huawei.hms.ml.scan.HmsScanResult decodeWithBuffer(byte[] r7, int r8, int r9, com.huawei.hms.feature.dynamic.IObjectWrapper r10) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1e
                    r0.writeByteArray(r7)     // Catch: java.lang.Throwable -> L1e
                    r0.writeInt(r8)     // Catch: java.lang.Throwable -> L1e
                    r0.writeInt(r9)     // Catch: java.lang.Throwable -> L1e
                    r2 = 0
                    if (r10 == 0) goto L20
                    android.os.IBinder r3 = r10.asBinder()     // Catch: java.lang.Throwable -> L1e
                    goto L21
                L1e:
                    r7 = move-exception
                    goto L5c
                L20:
                    r3 = r2
                L21:
                    r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L1e
                    android.os.IBinder r3 = r6.mRemote     // Catch: java.lang.Throwable -> L1e
                    r4 = 2
                    r5 = 0
                    boolean r3 = r3.transact(r4, r0, r1, r5)     // Catch: java.lang.Throwable -> L1e
                    if (r3 != 0) goto L43
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r3 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L1e
                    if (r3 == 0) goto L43
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L1e
                    com.huawei.hms.ml.scan.HmsScanResult r7 = r2.decodeWithBuffer(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1e
                    r1.recycle()
                    r0.recycle()
                    return r7
                L43:
                    r1.readException()     // Catch: java.lang.Throwable -> L1e
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L1e
                    if (r7 == 0) goto L55
                    android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScanResult> r7 = com.huawei.hms.ml.scan.HmsScanResult.CREATOR     // Catch: java.lang.Throwable -> L1e
                    java.lang.Object r7 = r7.createFromParcel(r1)     // Catch: java.lang.Throwable -> L1e
                    r2 = r7
                    com.huawei.hms.ml.scan.HmsScanResult r2 = (com.huawei.hms.ml.scan.HmsScanResult) r2     // Catch: java.lang.Throwable -> L1e
                L55:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L5c:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                    return r0
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
            public com.huawei.hms.feature.dynamic.IObjectWrapper queryDeepLinkInfo(com.huawei.hms.feature.dynamic.IObjectWrapper r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L4b
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    com.huawei.hms.feature.dynamic.IObjectWrapper r6 = r2.queryDeepLinkInfo(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return r6
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L14
                    com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return r6
                L4b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r0 = (com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1) {
                com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub.Proxy.sDefaultImpl = r1
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
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate"
                if (r5 == r0) goto Lb0
                if (r5 == r1) goto L92
                r0 = 2
                if (r5 == r0) goto L66
                r0 = 3
                if (r5 == r0) goto L54
                r0 = 4
                r3 = 0
                if (r5 == r0) goto L38
                r0 = 5
                if (r5 == r0) goto L1c
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L1c:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = r4.queryDeepLinkInfo(r5)
                r7.writeNoException()
                if (r5 == 0) goto L34
                android.os.IBinder r3 = r5.asBinder()
            L34:
                r7.writeStrongBinder(r3)
                return r1
            L38:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = r4.buildBitmap(r5)
                r7.writeNoException()
                if (r5 == 0) goto L50
                android.os.IBinder r3 = r5.asBinder()
            L50:
                r7.writeStrongBinder(r3)
                return r1
            L54:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                r4.buildBitmapLog(r5)
                r7.writeNoException()
                return r1
            L66:
                r6.enforceInterface(r2)
                byte[] r5 = r6.createByteArray()
                int r8 = r6.readInt()
                int r0 = r6.readInt()
                android.os.IBinder r6 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)
                com.huawei.hms.ml.scan.HmsScanResult r5 = r4.decodeWithBuffer(r5, r8, r0, r6)
                r7.writeNoException()
                if (r5 == 0) goto L8d
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L91
            L8d:
                r5 = 0
                r7.writeInt(r5)
            L91:
                return r1
            L92:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                android.os.IBinder r6 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)
                com.huawei.hms.ml.scan.HmsScan[] r5 = r4.decodeWithBitmap(r5, r6)
                r7.writeNoException()
                r7.writeTypedArray(r5, r1)
                return r1
            Lb0:
                r7.writeString(r2)
                return r1
        }
    }

    com.huawei.hms.feature.dynamic.IObjectWrapper buildBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    void buildBitmapLog(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2) throws android.os.RemoteException;

    com.huawei.hms.ml.scan.HmsScanResult decodeWithBuffer(byte[] r1, int r2, int r3, com.huawei.hms.feature.dynamic.IObjectWrapper r4) throws android.os.RemoteException;

    com.huawei.hms.feature.dynamic.IObjectWrapper queryDeepLinkInfo(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException;
}
