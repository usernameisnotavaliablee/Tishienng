package cn.jiguang.commons.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements android.os.IInterface {
    private android.os.IBinder a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1165c;

    public a(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = "axDZqud6H+CDQBXA/yBXOryhAsxzPh1PgN4N991nACfTSsXdCfZsE70k+cjPDPVB6dhHsO0zfFF8mVkwxeVKdQ=="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1165c = r1
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
            java.lang.String r2 = r6.f1165c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            android.os.IBinder r2 = r6.a     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r3 = 1
            r4 = 0
            r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r1.readException()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            goto L3b
        L1c:
            r2 = move-exception
            goto L42
        L1e:
            r2 = move-exception
            java.lang.String r3 = "HuaweiAdvertisingInterface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r4.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "getIds error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1c
            r4.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L1c
            cn.jiguang.commons.w.a.f(r3, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = ""
        L3b:
            r1.recycle()
            r0.recycle()
            return r2
        L42:
            r1.recycle()
            r0.recycle()
            throw r2
    }
}
