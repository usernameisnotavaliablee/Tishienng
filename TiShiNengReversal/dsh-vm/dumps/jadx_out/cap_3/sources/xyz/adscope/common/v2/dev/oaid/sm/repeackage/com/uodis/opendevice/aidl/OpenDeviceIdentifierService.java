package xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface OpenDeviceIdentifierService extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService {
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

        @Override // xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService
        public java.lang.String getOaid() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService
        public boolean isOaidTrackLimited() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService {
        private static final java.lang.String DESCRIPTOR = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
        static final int TRANSACTION_getOaid = 1;
        static final int TRANSACTION_isOaidTrackLimited = 2;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService {
            public static xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService sDefaultImpl;
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
                    java.lang.String r0 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                    return r0
            }

            @Override // xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService
            public java.lang.String getOaid() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r2 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r2 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.getOaid()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L3c
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService
            public boolean isOaidTrackLimited() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r2 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r2 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    boolean r2 = r2.isOaidTrackLimited()     // Catch: java.lang.Throwable -> L2c
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
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r1.attachInterface(r1, r0)
                return
        }

        public static xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService
                if (r1 == 0) goto L13
                xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r0 = (xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService) r0
                return r0
            L13:
                xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService$Stub$Proxy r0 = new xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService getDefaultImpl() {
                xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r0 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r1) {
                xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService r0 = xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                xyz.adscope.common.v2.dev.oaid.sm.repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService.Stub.Proxy.sDefaultImpl = r1
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
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                java.lang.String r0 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
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
                boolean r4 = r3.isOaidTrackLimited()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L24:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.getOaid()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
        }
    }

    java.lang.String getOaid();

    boolean isOaidTrackLimited();
}
