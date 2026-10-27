package com.beizi.fusion.sm.repeackage.com.heytap.openid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IOpenID extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID {
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

        @Override // com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID
        public java.lang.String getSerID(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID {
        private static final java.lang.String DESCRIPTOR = "com.heytap.openid.IOpenID";
        static final int TRANSACTION_getSerID = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID {
            public static com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID sDefaultImpl;
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
                    java.lang.String r0 = "com.heytap.openid.IOpenID"
                    return r0
            }

            @Override // com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID
            public java.lang.String getSerID(java.lang.String r6, java.lang.String r7, java.lang.String r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.heytap.openid.IOpenID"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L35
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L35
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L35
                    r0.writeString(r8)     // Catch: java.lang.Throwable -> L35
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L35
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L35
                    if (r2 != 0) goto L37
                    com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r2 = com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L35
                    if (r2 == 0) goto L37
                    com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r2 = com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L35
                    java.lang.String r6 = r2.getSerID(r6, r7, r8)     // Catch: java.lang.Throwable -> L35
                L2e:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L35:
                    r6 = move-exception
                    goto L3f
                L37:
                    r1.readException()     // Catch: java.lang.Throwable -> L35
                    java.lang.String r6 = r1.readString()     // Catch: java.lang.Throwable -> L35
                    goto L2e
                L3f:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.heytap.openid.IOpenID"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.heytap.openid.IOpenID"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID
                if (r1 == 0) goto L13
                com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r0 = (com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID) r0
                return r0
            L13:
                com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID$Stub$Proxy r0 = new com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID getDefaultImpl() {
                com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r0 = com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r1) {
                com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID r0 = com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto La
                if (r1 == 0) goto La
                com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID.Stub.Proxy.sDefaultImpl = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = "com.heytap.openid.IOpenID"
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
                java.lang.String r4 = r5.readString()
                java.lang.String r7 = r5.readString()
                java.lang.String r5 = r5.readString()
                java.lang.String r4 = r3.getSerID(r4, r7, r5)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
        }
    }

    java.lang.String getSerID(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws android.os.RemoteException;
}
