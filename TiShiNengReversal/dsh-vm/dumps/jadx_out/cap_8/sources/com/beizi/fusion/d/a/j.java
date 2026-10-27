package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f7600b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7601c;

    public j(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7601c = r0
            r0 = 0
            r1.a = r0
            r1.f7600b = r2
            return
    }

    public java.lang.String a() {
            r7 = this;
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r7.f7600b
            android.content.ContentResolver r1 = r0.getContentResolver()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L27
            java.lang.String r1 = "value"
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r1 = r0.getString(r1)
        L27:
            r0.close()
        L2a:
            return r1
    }
}
