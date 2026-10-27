package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblp implements android.os.IInterface {
    private final android.os.IBinder a;

    public pblp(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.a
            return r0
    }

    public final java.lang.String j() {
            r9 = this;
            android.os.Parcel r1 = android.os.Parcel.obtain()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            java.lang.String r7 = "f0e422"
            r0 = 53
            byte[] r8 = new byte[r0]     // Catch: java.lang.Throwable -> L2f
            r8 = {x0042: FILL_ARRAY_DATA , data: [116, 61, 27, 14, 24, 42, 97, 24, 39, 42, 120, 34, 19, 78, 9, 32, 115, 24, 55, 97, 57, 51, 31, 68, 1, 107, 74, 1, 49, 106, 83, 55, 0, 73, 14, 32, 76, 21, 49, 106, 99, 59, 16, 73, 8, 55, 86, 20, 38, 114, 126, 49, 19} // fill-array     // Catch: java.lang.Throwable -> L2f
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2f
            r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L2f
            android.os.IBinder r0 = r9.a     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            r4 = 1
            r0.transact(r4, r1, r2, r3)     // Catch: java.lang.Throwable -> L2f
            r2.readException()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r2.readString()     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r0 = move-exception
            r1.recycle()
            r2.recycle()
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
        L3a:
            r1.recycle()
            r2.recycle()
            return r0
    }
}
