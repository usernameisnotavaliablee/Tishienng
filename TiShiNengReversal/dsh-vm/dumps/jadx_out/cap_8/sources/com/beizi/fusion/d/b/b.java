package com.beizi.fusion.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface b extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.beizi.fusion.d.b.b {
        private android.os.IBinder a;

        public a(android.os.IBinder r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.lang.String a() {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1c
                android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L1c
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1c
                r1.readException()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L1c
                goto L23
            L1c:
                r0.recycle()
                r1.recycle()
                r2 = 0
            L23:
                r0.recycle()
                r1.recycle()
                return r2
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.IBinder r0 = r1.a
                return r0
        }

        public boolean b() {
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"
                r0.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L1f
                android.os.IBinder r3 = r5.a     // Catch: java.lang.Throwable -> L1f
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
    }
}
