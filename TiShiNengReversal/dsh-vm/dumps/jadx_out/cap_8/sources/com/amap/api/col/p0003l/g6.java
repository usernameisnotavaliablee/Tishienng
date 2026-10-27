package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g6 extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3411b = true;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3412c;
    private com.amap.api.col.p0003l.e6 a;

    static {
            return
    }

    public g6(android.content.Context r2, java.lang.String r3, int r4, com.amap.api.col.p0003l.e6 r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            r1.a = r5
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.amap.api.col.3l.e6 r0 = r1.a
            r0.a(r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            com.amap.api.col.3l.e6 r3 = r0.a
            r3.a(r1, r2)
            return
    }
}
