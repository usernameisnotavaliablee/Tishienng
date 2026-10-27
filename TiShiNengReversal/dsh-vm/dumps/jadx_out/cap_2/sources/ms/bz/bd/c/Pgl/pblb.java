package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblb implements android.os.IInterface {
    private final android.os.IBinder a;

    public pblb(android.os.IBinder r1) {
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
            r8 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r6 = "6d8a6e"
            r2 = 47
            byte[] r7 = new byte[r2]     // Catch: java.lang.Throwable -> L2f
            r7 = {x003e: FILL_ARRAY_DATA , data: [36, 105, 70, 91, 8, 97, 32, 86, 39, 60, 52, 103, 5, 38, 28, 98, 37, 73, 108, 60, 34, 104, 95, 20, 27, 107, 17, 108, 77, 127, 14, 66, 66, 17, 40, 123, 49, 73, 64, 63, 51, 99, 89, 19, 8, 113, 48} // fill-array     // Catch: java.lang.Throwable -> L2f
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2f
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
            android.os.IBinder r2 = r8.a     // Catch: java.lang.Throwable -> L2f
            r3 = 3
            r4 = 0
            r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
            r1.readException()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r0.recycle()
            r1.recycle()
            r2 = 0
        L36:
            r0.recycle()
            r1.recycle()
            return r2
    }
}
