package cn.jiguang.commons.t;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements cn.jiguang.commons.t.e {
    private android.os.IBinder a;

    public d(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // cn.jiguang.commons.t.e
    public java.lang.String a() {
            r6 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "Halo+/ex0XYuOCl75w4mzBmlg/ol+vqLiEURlblgA+0="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Throwable -> L20
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L20
            android.os.IBinder r2 = r6.a     // Catch: java.lang.Throwable -> L20
            r3 = 3
            r4 = 0
            r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L20
            r1.readException()     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L20
            goto L3c
        L20:
            r2 = move-exception
            java.lang.String r3 = "ZTEOAID"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "getOAID obtain exception:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L43
            r4.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L43
            cn.jiguang.commons.w.a.f(r3, r2)     // Catch: java.lang.Throwable -> L43
            r2 = 0
        L3c:
            r1.recycle()
            r0.recycle()
            return r2
        L43:
            r2 = move-exception
            r1.recycle()
            r0.recycle()
            throw r2
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.a
            return r0
    }

    @Override // cn.jiguang.commons.t.e
    public boolean c() {
            r7 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r2 = 0
            java.lang.String r3 = "Halo+/ex0XYuOCl75w4mzBmlg/ol+vqLiEURlblgA+0="
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)     // Catch: java.lang.Throwable -> L29
            r0.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L29
            android.os.IBinder r3 = r7.a     // Catch: java.lang.Throwable -> L29
            r4 = 1
            r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L29
            r1.readException()     // Catch: java.lang.Throwable -> L29
            int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L22
            r2 = 1
        L22:
            r1.recycle()
            r0.recycle()
            return r2
        L29:
            r3 = move-exception
            java.lang.String r4 = "ZTEOAID"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r5.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "isSupported obtain exception:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L45
            r5.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L45
            cn.jiguang.commons.w.a.f(r4, r3)     // Catch: java.lang.Throwable -> L45
            goto L22
        L45:
            r2 = move-exception
            r1.recycle()
            r0.recycle()
            throw r2
    }
}
