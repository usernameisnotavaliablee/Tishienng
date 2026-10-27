package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface IObjectWrapper extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.huawei.hms.feature.dynamic.IObjectWrapper";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.feature.dynamic.IObjectWrapper {
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.feature.dynamic.IObjectWrapper {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Proxy implements com.huawei.hms.feature.dynamic.IObjectWrapper {
            public static com.huawei.hms.feature.dynamic.IObjectWrapper sDefaultImpl;
            public android.os.IBinder a;

            public Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.a
                    return r0
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.huawei.hms.feature.dynamic.IObjectWrapper"
                    return r0
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.feature.dynamic.IObjectWrapper"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.feature.dynamic.IObjectWrapper asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.feature.dynamic.IObjectWrapper"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.feature.dynamic.IObjectWrapper
                if (r1 == 0) goto L13
                com.huawei.hms.feature.dynamic.IObjectWrapper r0 = (com.huawei.hms.feature.dynamic.IObjectWrapper) r0
                return r0
            L13:
                com.huawei.hms.feature.dynamic.IObjectWrapper$Stub$Proxy r0 = new com.huawei.hms.feature.dynamic.IObjectWrapper$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.feature.dynamic.IObjectWrapper getDefaultImpl() {
                com.huawei.hms.feature.dynamic.IObjectWrapper r0 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.feature.dynamic.IObjectWrapper r1) {
                com.huawei.hms.feature.dynamic.IObjectWrapper r0 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.Proxy.sDefaultImpl = r1
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
        public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
                r1 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r2 == r0) goto La
                boolean r2 = super.onTransact(r2, r3, r4, r5)
                return r2
            La:
                java.lang.String r2 = "com.huawei.hms.feature.dynamic.IObjectWrapper"
                r4.writeString(r2)
                r2 = 1
                return r2
        }
    }
}
