package xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface ZTEIDInterface extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class up extends android.os.Binder implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class down implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface {
            private android.os.IBinder binder;

            public down(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.binder = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.binder
                    return r0
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface
            public boolean c() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r2 = 0
                    java.lang.String r3 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r3 = r5.binder     // Catch: java.lang.Throwable -> L25
                    r4 = 2
                    r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L25
                    r1.readException()     // Catch: java.lang.Throwable -> L25
                    int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L25
                    if (r3 != 0) goto L2b
                    r1.recycle()     // Catch: java.lang.Throwable -> L25
                    r0.recycle()     // Catch: java.lang.Throwable -> L25
                    r0 = 1
                    return r0
                L25:
                    r1.recycle()
                    r0.recycle()
                L2b:
                    return r2
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface
            public java.lang.String getOAID() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r2 = r5.binder     // Catch: java.lang.Throwable -> L1c
                    r3 = 3
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1c
                    r1.readException()     // Catch: java.lang.Throwable -> L1c
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L1c
                    goto L23
                L1c:
                    r1.recycle()
                    r0.recycle()
                    r2 = 0
                L23:
                    r1.recycle()
                    r0.recycle()
                    return r2
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface
            public boolean isSupported() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface
            public void shutDown() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r2 = r5.binder     // Catch: java.lang.Throwable -> L18
                    r3 = 6
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L1e
                L18:
                    r1.recycle()
                    r0.recycle()
                L1e:
                    r1.recycle()
                    r0.recycle()
                    return
            }
        }

        public up() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    boolean c();

    java.lang.String getOAID();

    boolean isSupported();

    void shutDown();
}
