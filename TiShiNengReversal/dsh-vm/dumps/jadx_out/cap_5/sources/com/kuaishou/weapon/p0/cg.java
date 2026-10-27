package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cg {


    public cg() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r0.<init>(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = "result"
            r1 = 0
            int r4 = r0.optInt(r4, r1)     // Catch: java.lang.Exception -> L37
            r1 = 1
            if (r4 != r1) goto L37
            java.lang.String r4 = "dataRsp"
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Exception -> L37
            com.kuaishou.weapon.p0.bn r0 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Exception -> L37
            r0.<init>(r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r0.a(r4)     // Catch: java.lang.Exception -> L37
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r0.<init>(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = "conjure"
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "status"
            int r0 = r0.getInt(r2)     // Catch: java.lang.Exception -> L37
            if (r0 != r1) goto L37
            com.kuaishou.weapon.p0.bx.a(r3, r4)     // Catch: java.lang.Exception -> L37
            com.kuaishou.weapon.p0.bx.b(r3, r4)     // Catch: java.lang.Exception -> L37
        L37:
            return
    }

    public static void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.a     // Catch: java.lang.Exception -> L98
            r0.append(r1)     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.f     // Catch: java.lang.Exception -> L98
            r0.append(r1)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = com.kuaishou.weapon.p0.cv.a(r8)     // Catch: java.lang.Exception -> L98
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L98
            if (r2 != 0) goto L41
            boolean r2 = com.kuaishou.weapon.p0.cu.a()     // Catch: java.lang.Exception -> L98
            if (r2 == 0) goto L43
            if (r10 == 0) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r2.<init>()     // Catch: java.lang.Exception -> L98
            r2.append(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "?logId="
            r2.append(r0)     // Catch: java.lang.Exception -> L98
            r2.append(r10)     // Catch: java.lang.Exception -> L98
            java.lang.String r10 = "&"
            r2.append(r10)     // Catch: java.lang.Exception -> L98
            r2.append(r1)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L98
        L41:
            r5 = r0
            goto L58
        L43:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r10.<init>()     // Catch: java.lang.Exception -> L98
            r10.append(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "?"
            r10.append(r0)     // Catch: java.lang.Exception -> L98
            r10.append(r1)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Exception -> L98
            goto L41
        L58:
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L98
            if (r10 == 0) goto L5f
            goto L98
        L5f:
            if (r11 == 0) goto L7c
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L98
            r10.<init>()     // Catch: java.lang.Exception -> L98
            com.kuaishou.weapon.p0.bn r11 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Exception -> L98
            r11.<init>(r8)     // Catch: java.lang.Exception -> L98
            java.lang.String r9 = r11.c(r9)     // Catch: java.lang.Exception -> L98
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L98
            if (r11 != 0) goto L7a
            java.lang.String r11 = "data"
            r10.put(r11, r9)     // Catch: java.lang.Exception -> L98
        L7a:
            r6 = r10
            goto L82
        L7c:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L98
            r10.<init>(r9)     // Catch: java.lang.Exception -> L98
            goto L7a
        L82:
            com.kuaishou.weapon.p0.n r9 = com.kuaishou.weapon.p0.n.a()     // Catch: java.lang.Exception -> L98
            com.kuaishou.weapon.p0.k r1 = new com.kuaishou.weapon.p0.k     // Catch: java.lang.Exception -> L98
            java.lang.String r3 = com.kuaishou.weapon.p0.WeaponHI.cookieData     // Catch: java.lang.Exception -> L98
            java.lang.String r4 = com.kuaishou.weapon.p0.WeaponHI.encryENV     // Catch: java.lang.Exception -> L98
            com.kuaishou.weapon.p0.cg$1 r7 = new com.kuaishou.weapon.p0.cg$1     // Catch: java.lang.Exception -> L98
            r7.<init>(r8)     // Catch: java.lang.Exception -> L98
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L98
            r9.a(r1)     // Catch: java.lang.Exception -> L98
        L98:
            return
    }
}
