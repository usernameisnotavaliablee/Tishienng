package cn.jiguang.commons.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements android.os.IInterface {
    private android.os.IBinder a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1178c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1179d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f1180e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f1181f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f1182g;

    public a(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = "bFWKQsRzI9d+ktdqxw44MA=="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1179d = r1
            java.lang.String r1 = "vWw3rdN6/HN94yy83HO8Lw=="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1180e = r1
            java.lang.String r1 = "Ha7IUc4OlbRIQFpw3FJeZw=="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1181f = r1
            java.lang.String r1 = "qFFOesfckPwVmbfqzGl5oBCLe9WD17E04n+Ic7C9fCw="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1182g = r1
            return
    }

    private java.lang.String a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = r3.f1182g     // Catch: java.lang.Throwable -> L2b
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
            r0.writeString(r4)     // Catch: java.lang.Throwable -> L2b
            r0.writeString(r5)     // Catch: java.lang.Throwable -> L2b
            r0.writeString(r6)     // Catch: java.lang.Throwable -> L2b
            android.os.IBinder r4 = r3.a     // Catch: java.lang.Throwable -> L2b
            r5 = 1
            r6 = 0
            r4.transact(r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L2b
            r1.readException()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L2b
            r1.recycle()
            r0.recycle()
            return r4
        L2b:
            r4 = move-exception
            java.lang.String r5 = "OppoAdvertisingInterface"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r6.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "getIdByType error: "
            r6.append(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L4f
            r6.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.f(r5, r4)     // Catch: java.lang.Throwable -> L4f
            r1.recycle()
            r0.recycle()
            java.lang.String r4 = ""
            return r4
        L4f:
            r4 = move-exception
            r1.recycle()
            r0.recycle()
            throw r4
    }

    private java.lang.String c(android.content.Context r4) {
            r3 = this;
            java.lang.String r4 = r3.f1178c
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L46
            android.content.pm.PackageInfo r4 = cn.jiguang.commons.L.t.a()
            java.lang.String r0 = "OppoAdvertisingInterface"
            if (r4 != 0) goto L18
            java.lang.String r4 = "package get sign failed"
            cn.jiguang.commons.w.a.f(r0, r4)
            java.lang.String r4 = r3.f1178c
            return r4
        L18:
            android.content.pm.Signature[] r4 = r4.signatures
            if (r4 == 0) goto L46
            int r1 = r4.length
            if (r1 <= 0) goto L46
            r1 = 0
            r4 = r4[r1]
            byte[] r4 = r4.toByteArray()
            java.lang.String r4 = cn.jiguang.commons.L.k.h(r4)     // Catch: java.lang.Throwable -> L2d
            r3.f1178c = r4     // Catch: java.lang.Throwable -> L2d
            goto L46
        L2d:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "package sign error: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
        L46:
            java.lang.String r4 = r3.f1178c
            return r4
    }

    public java.lang.String a(android.content.Context r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r3 = r2.c(r3)
            java.lang.String r1 = r2.f1179d
            java.lang.String r3 = r2.a(r0, r3, r1)
            return r3
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            r0 = 0
            return r0
    }
}
