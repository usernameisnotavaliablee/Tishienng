package cn.jiguang.commons.l;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ai implements android.os.IInterface {
    private android.os.IBinder a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1163c;

    public ai(android.os.IBinder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f1163c = r0
            r1.a = r2
            java.lang.String r2 = "+Fc+/S0DV5xukan0E/9N4RvXQpEI8h8+6y3k9NAvwjKewmlEeKVcapnVp59DHSw2ZuSa3pDDty/LQ1R0HbmN4Tu7alH/m3nVMfORBLpozB8="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)
            r1.f1163c = r2
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String d() {
            r6 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = r6.f1163c     // Catch: java.lang.Throwable -> L1c
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1c
            android.os.IBinder r2 = r6.a     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            r4 = 0
            r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1c
            r1.readException()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L1c
            goto L39
        L1c:
            r2 = move-exception
            java.lang.String r3 = "AdvertisingInterface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r4.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "getId error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L40
            r4.append(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L40
            cn.jiguang.commons.w.a.f(r3, r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = ""
        L39:
            r1.recycle()
            r0.recycle()
            return r2
        L40:
            r2 = move-exception
            r1.recycle()
            r0.recycle()
            throw r2
    }
}
