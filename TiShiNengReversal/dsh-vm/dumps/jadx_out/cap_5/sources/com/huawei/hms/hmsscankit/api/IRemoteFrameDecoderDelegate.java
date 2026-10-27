package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IRemoteFrameDecoderDelegate extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate {
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

        @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
        public com.huawei.hms.scankit.p.s6[] decode(byte[] r1, int r2, int r3, int r4, int r5, com.huawei.hms.feature.dynamic.IObjectWrapper r6) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate";
        static final int TRANSACTION_decode = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate {
            public static com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
            public com.huawei.hms.scankit.p.s6[] decode(byte[] r11, int r12, int r13, int r14, int r15, com.huawei.hms.feature.dynamic.IObjectWrapper r16) throws android.os.RemoteException {
                    r10 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L23
                    r1.writeByteArray(r11)     // Catch: java.lang.Throwable -> L23
                    r1.writeInt(r12)     // Catch: java.lang.Throwable -> L23
                    r1.writeInt(r13)     // Catch: java.lang.Throwable -> L23
                    r1.writeInt(r14)     // Catch: java.lang.Throwable -> L23
                    r1.writeInt(r15)     // Catch: java.lang.Throwable -> L23
                    if (r16 == 0) goto L26
                    android.os.IBinder r0 = r16.asBinder()     // Catch: java.lang.Throwable -> L23
                    goto L27
                L23:
                    r0 = move-exception
                    r11 = r0
                    goto L62
                L26:
                    r0 = 0
                L27:
                    r1.writeStrongBinder(r0)     // Catch: java.lang.Throwable -> L23
                    android.os.IBinder r0 = r10.mRemote     // Catch: java.lang.Throwable -> L23
                    r3 = 1
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L23
                    if (r0 != 0) goto L50
                    com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L23
                    if (r0 == 0) goto L50
                    com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r3 = com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L23
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r7 = r14
                    r8 = r15
                    r9 = r16
                    com.huawei.hms.scankit.p.s6[] r11 = r3.decode(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23
                    r2.recycle()
                    r1.recycle()
                    return r11
                L50:
                    r2.readException()     // Catch: java.lang.Throwable -> L23
                    android.os.Parcelable$Creator<com.huawei.hms.scankit.p.s6> r11 = com.huawei.hms.scankit.p.s6.CREATOR     // Catch: java.lang.Throwable -> L23
                    java.lang.Object[] r11 = r2.createTypedArray(r11)     // Catch: java.lang.Throwable -> L23
                    com.huawei.hms.scankit.p.s6[] r11 = (com.huawei.hms.scankit.p.s6[]) r11     // Catch: java.lang.Throwable -> L23
                    r2.recycle()
                    r1.recycle()
                    return r11
                L62:
                    r2.recycle()
                    r1.recycle()
                    throw r11
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate"
                    return r0
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r0 = (com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r1) {
                com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub.Proxy.sDefaultImpl = r1
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
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
                r9 = this;
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate"
                r1 = 1
                if (r10 == r1) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r10 == r2) goto Lf
                boolean r10 = super.onTransact(r10, r11, r12, r13)
                return r10
            Lf:
                r12.writeString(r0)
                return r1
            L13:
                r11.enforceInterface(r0)
                byte[] r3 = r11.createByteArray()
                int r4 = r11.readInt()
                int r5 = r11.readInt()
                int r6 = r11.readInt()
                int r7 = r11.readInt()
                android.os.IBinder r10 = r11.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r8 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r10)
                r2 = r9
                com.huawei.hms.scankit.p.s6[] r10 = r2.decode(r3, r4, r5, r6, r7, r8)
                r12.writeNoException()
                r12.writeTypedArray(r10, r1)
                return r1
        }
    }

    com.huawei.hms.scankit.p.s6[] decode(byte[] r1, int r2, int r3, int r4, int r5, com.huawei.hms.feature.dynamic.IObjectWrapper r6) throws android.os.RemoteException;
}
