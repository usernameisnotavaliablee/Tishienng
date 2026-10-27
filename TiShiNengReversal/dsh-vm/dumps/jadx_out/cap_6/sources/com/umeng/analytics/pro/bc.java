package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class bc implements com.umeng.analytics.pro.av {
    private static final java.lang.String a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    bc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "content://cn.nubia.provider.deviceid.dataid/oaid"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            android.content.ContentResolver r2 = r9.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L2b
            boolean r1 = r9.moveToNext()
            if (r1 == 0) goto L28
            java.lang.String r0 = "device_ids_grndid"
            int r0 = r9.getColumnIndex(r0)
            java.lang.String r0 = r9.getString(r0)
        L28:
            r9.close()
        L2b:
            return r0
    }
}
