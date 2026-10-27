package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class t0 extends ms.bz.bd.c.Pgl.pbly.pgla {
    t0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r8, java.lang.String r10, java.lang.Object r11) throws java.lang.Throwable {
            r7 = this;
            r8 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            ms.bz.bd.c.Pgl.pblv r9 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r9 = r9.c()
            android.content.pm.PackageManager r10 = r9.getPackageManager()
            java.lang.String r9 = r9.getPackageName()
            r11 = 0
            android.content.pm.ApplicationInfo r9 = r10.getApplicationInfo(r9, r11)
            java.lang.String r10 = r9.sourceDir
            if (r10 != 0) goto L22
            java.lang.String r10 = r9.publicSourceDir
        L22:
            java.util.HashMap r9 = ms.bz.bd.c.Pgl.pblc.a(r10)
            java.lang.String r10 = ""
            if (r9 == 0) goto L37
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L37
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L38
        L37:
            r8 = r10
        L38:
            if (r8 == 0) goto L9a
            int r9 = r8.length()
            if (r9 <= 0) goto L9a
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>(r8)
            r8 = 18
            byte[] r5 = new byte[r8]
            r5 = {x00b6: FILL_ARRAY_DATA , data: [43, 55, 5, 23, 98, 96, 57, 20, 61, 53, 25, 49, 25, 23, 83, 123, 49, 29} // fill-array
            r2 = 0
            java.lang.String r4 = "70bbbb"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r9.getString(r8)     // Catch: org.json.JSONException -> L5f
            goto L60
        L5f:
            r8 = r10
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r8 = 1
            byte[] r6 = new byte[r8]
            r8 = 122(0x7a, float:1.71E-43)
            r6[r11] = r8
            r3 = 0
            java.lang.String r5 = "06e739"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
            r8 = 13
            byte[] r6 = new byte[r8]
            r6 = {x00c4: FILL_ARRAY_DATA , data: [102, 51, 78, 67, 90, 61, 99, 42, 98, 119, 125, 58, 70} // fill-array
            java.lang.String r5 = "e412d9"
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = r9.getString(r8)     // Catch: org.json.JSONException -> L93
        L93:
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L9a:
            int r8 = r10.length()
            if (r8 != 0) goto Lb5
            r8 = 4
            byte[] r5 = new byte[r8]
            r5 = {x00d0: FILL_ARRAY_DATA , data: [10, 62, 25, 69} // fill-array
            r2 = 0
            java.lang.String r4 = "53d452"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
        Lb5:
            return r10
    }
}
