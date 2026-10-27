package xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface HWIDInterface extends android.os.IInterface {
    public static final java.lang.String TAG = "HWIDInterface";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class HWID implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.HWIDInterface {
        private android.os.IBinder iBinder;

        public HWID(android.os.IBinder r1) {
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

        @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.HWIDInterface
        public boolean getBoos() {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r0.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L1f
                android.os.IBinder r3 = r5.iBinder     // Catch: java.lang.Throwable -> L1f
                r4 = 1
                r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L1f
                r1.readException()     // Catch: java.lang.Throwable -> L1f
                int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L1f
                if (r3 != 0) goto L25
                r2 = 1
                goto L25
            L1f:
                r0.recycle()
                r1.recycle()
            L25:
                r0.recycle()
                r1.recycle()
                return r2
        }

        @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.HWIDInterface
        public java.lang.String getIDs() {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1c
                android.os.IBinder r2 = r5.iBinder     // Catch: java.lang.Throwable -> L1c
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1c
                r1.readException()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L1c
                goto L27
            L1c:
                r2 = move-exception
                r0.recycle()
                r1.recycle()
                xyz.adscope.common.v2.log.SDKLog.stack(r2)
                r2 = 0
            L27:
                r0.recycle()
                r1.recycle()
                return r2
        }
    }

    boolean getBoos();

    java.lang.String getIDs();
}
