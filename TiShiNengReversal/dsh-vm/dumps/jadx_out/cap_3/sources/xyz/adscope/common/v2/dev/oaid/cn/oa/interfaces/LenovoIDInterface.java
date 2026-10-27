package xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface LenovoIDInterface extends android.os.IInterface {
    public static final java.lang.String TAG = "LenovoIDInterface";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class len_up extends android.os.Binder implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class len_down implements xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface {
            private android.os.IBinder iBinder;

            public len_down(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.iBinder = r1
                    return
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface
            public java.lang.String a() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.zui.deviceidservice.IDeviceidInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    android.os.IBinder r2 = r5.iBinder     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r3 = 1
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r1.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    goto L30
                L24:
                    r2 = move-exception
                    xyz.adscope.common.v2.log.SDKLog.stack(r2)     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    r0 = 0
                    return r0
                L30:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface
            public java.lang.String a(java.lang.String r5) {
                    r4 = this;
                    android.os.Parcel r5 = android.os.Parcel.obtain()
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.zui.deviceidservice.IDeviceidInterface"
                    r5.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    android.os.IBinder r1 = r4.iBinder     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r2 = 4
                    r3 = 0
                    r1.transact(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r0.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    java.lang.String r1 = r0.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r0.recycle()
                    r5.recycle()
                    return r1
                L22:
                    r1 = move-exception
                    goto L30
                L24:
                    r1 = move-exception
                    xyz.adscope.common.v2.log.SDKLog.stack(r1)     // Catch: java.lang.Throwable -> L22
                    r0.recycle()
                    r5.recycle()
                    r5 = 0
                    return r5
                L30:
                    r0.recycle()
                    r5.recycle()
                    throw r1
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface
            public java.lang.String b() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.zui.deviceidservice.IDeviceidInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    android.os.IBinder r2 = r5.iBinder     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r3 = 2
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r1.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    goto L30
                L24:
                    r2 = move-exception
                    xyz.adscope.common.v2.log.SDKLog.stack(r2)     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    r0 = 0
                    return r0
                L30:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface
            public java.lang.String b(java.lang.String r5) {
                    r4 = this;
                    android.os.Parcel r5 = android.os.Parcel.obtain()
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.zui.deviceidservice.IDeviceidInterface"
                    r5.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    android.os.IBinder r1 = r4.iBinder     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r2 = 5
                    r3 = 0
                    r1.transact(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r0.readException()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    java.lang.String r1 = r0.readString()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                    r0.recycle()
                    r5.recycle()
                    return r1
                L22:
                    r1 = move-exception
                    goto L30
                L24:
                    r1 = move-exception
                    xyz.adscope.common.v2.log.SDKLog.stack(r1)     // Catch: java.lang.Throwable -> L22
                    r0.recycle()
                    r5.recycle()
                    r5 = 0
                    return r5
                L30:
                    r0.recycle()
                    r5.recycle()
                    throw r1
            }

            @Override // xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface
            public boolean c() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r2 = 0
                    java.lang.String r3 = "com.zui.deviceidservice.IDeviceidInterface"
                    r0.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r3 = r5.iBinder     // Catch: java.lang.Throwable -> L25
                    r4 = 3
                    r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L25
                    r1.readException()     // Catch: java.lang.Throwable -> L25
                    int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L25
                    if (r3 == 0) goto L1e
                    r2 = 1
                L1e:
                    r1.recycle()     // Catch: java.lang.Throwable -> L25
                    r0.recycle()     // Catch: java.lang.Throwable -> L25
                    return r2
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
            }
        }

        public len_up() {
                r0 = this;
                r0.<init>()
                return
        }

        public static xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface getHelper(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.zui.deviceidservice.IDeviceidInterface"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface
                if (r1 != 0) goto L11
                goto L14
            L11:
                xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface r0 = (xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface) r0
                return r0
            L14:
                xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface$len_up$len_down r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface$len_up$len_down
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Binder
        protected boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.zui.deviceidservice.IDeviceidInterface"
                if (r4 == r0) goto L69
                if (r4 == r1) goto L5b
                r0 = 2
                if (r4 == r0) goto L4d
                r0 = 3
                if (r4 == r0) goto L3f
                r0 = 4
                if (r4 == r0) goto L2d
                r0 = 5
                if (r4 == r0) goto L1b
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1b:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.b(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L2d:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.a(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L3f:
                r5.enforceInterface(r2)
                boolean r4 = r3.c()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L4d:
                r5.enforceInterface(r2)
                java.lang.String r4 = r3.b()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L5b:
                r5.enforceInterface(r2)
                java.lang.String r4 = r3.a()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L69:
                r6.writeString(r2)
                return r1
        }
    }

    java.lang.String a();

    java.lang.String a(java.lang.String r1);

    java.lang.String b();

    java.lang.String b(java.lang.String r1);

    boolean c();
}
