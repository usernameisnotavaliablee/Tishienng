package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblt implements android.os.IInterface {
    private final android.os.IBinder a;

    public pblt(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String j() {
            r9 = this;
            android.os.Parcel r1 = android.os.Parcel.obtain()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            java.lang.String r7 = "d68e76"
            r0 = 42
            byte[] r8 = new byte[r0]     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r8 = {x004a: FILL_ARRAY_DATA , data: [118, 59, 70, 95, 18, 52, 110, 89, 109, 48, 99, 61, 72, 20, 1, 37, 116, 18, 123, 35, 124, 55, 78, 95, 33, 5, 98, 1, 96, 54, 112, 61, 79, 56, 6, 53, 98, 5, 111, 52, 118, 49} // fill-array     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            android.os.IBinder r0 = r9.a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r3 = 0
            r4 = 1
            r0.transact(r4, r1, r2, r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r2.readException()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r2.recycle()
            r1.recycle()
            return r0
        L35:
            r0 = move-exception
            goto L43
        L37:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L35
            r2.recycle()
            r1.recycle()
            r0 = 0
            return r0
        L43:
            r2.recycle()
            r1.recycle()
            throw r0
    }
}
