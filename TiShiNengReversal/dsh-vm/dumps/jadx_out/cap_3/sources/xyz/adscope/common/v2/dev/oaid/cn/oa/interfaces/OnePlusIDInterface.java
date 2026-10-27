package xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface OnePlusIDInterface extends android.os.IInterface {
    public static final java.lang.String TAG = "OnePlusIDInterface";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class up extends android.os.Binder implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class down implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface {
            public android.os.IBinder iBinder;

            public down(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.iBinder = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.iBinder
                    return r0
            }

            public java.lang.String getSerID(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.heytap.openid.IOpenID"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    android.os.IBinder r4 = r3.iBinder     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    r5 = 1
                    r6 = 0
                    r4.transact(r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    r1.readException()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                    r0.recycle()
                    r1.recycle()
                    return r4
                L2b:
                    r4 = move-exception
                    goto L39
                L2d:
                    r4 = move-exception
                    xyz.adscope.common.v2.log.SDKLog.stack(r4)     // Catch: java.lang.Throwable -> L2b
                    r0.recycle()
                    r1.recycle()
                    r4 = 0
                    return r4
                L39:
                    r0.recycle()
                    r1.recycle()
                    throw r4
            }
        }

        public up() {
                r0 = this;
                r0.<init>()
                return
        }

        public static xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface genInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.heytap.openid.IOpenID"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface
                if (r1 != 0) goto L11
                goto L14
            L11:
                xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface r0 = (xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface) r0
                return r0
            L14:
                xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface$up$down r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OnePlusIDInterface$up$down
                r0.<init>(r2)
                return r0
        }
    }
}
