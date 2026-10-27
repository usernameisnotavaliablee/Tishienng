package com.ss.android.socialbase.appdownloader.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.ss.android.socialbase.appdownloader.j.d {
    private final org.json.JSONObject d;

    public b(android.content.Context r1, com.ss.android.socialbase.downloader.jy.j r2, java.lang.String r3, org.json.JSONObject r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.d = r4
            return
    }

    private static void b(@androidx.annotation.NonNull android.content.Intent r3, org.json.JSONObject r4, org.json.JSONObject r5) {
            if (r4 == 0) goto L2d
            if (r5 == 0) goto L2d
            int r0 = r4.length()
            int r1 = r5.length()
            if (r0 != r1) goto L2d
            if (r3 != 0) goto L11
            goto L2d
        L11:
            java.util.Iterator r0 = r4.keys()
            if (r0 == 0) goto L2d
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r5.optString(r1)
            if (r2 == 0) goto L17
            c(r4, r1, r2, r3)
            goto L17
        L2d:
            return
    }

    private static void c(org.json.JSONObject r2, java.lang.String r3, java.lang.String r4, android.content.Intent r5) {
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = -1
            switch(r0) {
                case -1325958191: goto L38;
                case -891985903: goto L2d;
                case 104431: goto L22;
                case 3327612: goto L17;
                case 64711720: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L42
        Lc:
            java.lang.String r0 = "boolean"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L15
            goto L42
        L15:
            r1 = 4
            goto L42
        L17:
            java.lang.String r0 = "long"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L20
            goto L42
        L20:
            r1 = 3
            goto L42
        L22:
            java.lang.String r0 = "int"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2b
            goto L42
        L2b:
            r1 = 2
            goto L42
        L2d:
            java.lang.String r0 = "string"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L36
            goto L42
        L36:
            r1 = 1
            goto L42
        L38:
            java.lang.String r0 = "double"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L41
            goto L42
        L41:
            r1 = 0
        L42:
            switch(r1) {
                case 0: goto L66;
                case 1: goto L5e;
                case 2: goto L56;
                case 3: goto L4e;
                case 4: goto L46;
                default: goto L45;
            }
        L45:
            return
        L46:
            boolean r2 = r2.optBoolean(r3)
            r5.putExtra(r3, r2)
            return
        L4e:
            long r0 = r2.optLong(r3)
            r5.putExtra(r3, r0)
            return
        L56:
            int r2 = r2.optInt(r3)
            r5.putExtra(r3, r2)
            return
        L5e:
            java.lang.String r2 = r2.optString(r3)
            r5.putExtra(r3, r2)
            return
        L66:
            double r0 = r2.optDouble(r3)
            r5.putExtra(r3, r0)
            return
    }

    @Override // com.ss.android.socialbase.appdownloader.j.k
    public android.content.Intent xt() {
            r9 = this;
            org.json.JSONObject r0 = r9.d
            java.lang.String r1 = "action"
            java.lang.String r0 = r0.optString(r1)
            org.json.JSONObject r1 = r9.d
            java.lang.String r2 = "category"
            java.lang.String r1 = r1.optString(r2)
            org.json.JSONObject r2 = r9.d
            java.lang.String r3 = "flags"
            r4 = 1342210048(0x50008000, float:8.623489E9)
            int r2 = r2.optInt(r3, r4)
            org.json.JSONObject r3 = r9.d
            java.lang.String r4 = "path_extra_key"
            java.lang.String r3 = r3.optString(r4)
            org.json.JSONObject r4 = r9.d
            java.lang.String r5 = "path_data_key"
            java.lang.String r4 = r4.optString(r5)
            org.json.JSONObject r5 = r9.d
            java.lang.String r6 = "extra"
            org.json.JSONObject r5 = r5.optJSONObject(r6)
            org.json.JSONObject r6 = r9.d
            java.lang.String r7 = "extra_type"
            org.json.JSONObject r6 = r6.optJSONObject(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto L43
            r0 = 0
            return r0
        L43:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L51
            r7.addCategory(r1)
        L51:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L6c
            java.lang.String r0 = r9.c     // Catch: java.lang.Throwable -> L6b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6b
            r8 = 0
            r1[r8] = r0     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L6b
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L6b
            r7.setData(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
        L6c:
            r7.setFlags(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L7a
            java.lang.String r0 = r9.c
            r7.putExtra(r3, r0)
        L7a:
            b(r7, r5, r6)
            return r7
    }
}
