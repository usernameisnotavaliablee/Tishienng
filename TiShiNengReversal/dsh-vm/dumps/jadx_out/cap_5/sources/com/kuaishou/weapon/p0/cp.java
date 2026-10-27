package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cp {


    public cp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            r1 = 1
            r2 = 0
            a(r3, r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r0.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.a     // Catch: java.lang.Throwable -> L99
            r0.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.e     // Catch: java.lang.Throwable -> L99
            r0.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = com.kuaishou.weapon.p0.cv.a(r3)     // Catch: java.lang.Throwable -> L99
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L56
            boolean r2 = com.kuaishou.weapon.p0.cu.a()     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L42
            if (r5 == 0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            r2.append(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "?logId="
            r2.append(r0)     // Catch: java.lang.Throwable -> L99
            r2.append(r5)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "&"
            r2.append(r0)     // Catch: java.lang.Throwable -> L99
            r2.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L99
            goto L56
        L42:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            r2.append(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "?"
            r2.append(r0)     // Catch: java.lang.Throwable -> L99
            r2.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L99
        L56:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L5d
            goto L99
        L5d:
            if (r7 == 0) goto L79
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L99
            r7.<init>()     // Catch: java.lang.Throwable -> L99
            com.kuaishou.weapon.p0.bn r1 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Throwable -> L99
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r4 = r1.c(r4)     // Catch: java.lang.Throwable -> L99
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L7e
            java.lang.String r1 = "data"
            r7.put(r1, r4)     // Catch: java.lang.Throwable -> L99
            goto L7e
        L79:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L99
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L99
        L7e:
            com.kuaishou.weapon.p0.l r4 = com.kuaishou.weapon.p0.l.a(r3)     // Catch: java.lang.Throwable -> L99
            com.kuaishou.weapon.p0.m r1 = new com.kuaishou.weapon.p0.m     // Catch: java.lang.Throwable -> L99
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = com.kuaishou.weapon.p0.WeaponHI.cookieData     // Catch: java.lang.Throwable -> L99
            r1.a(r7)     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = com.kuaishou.weapon.p0.WeaponHI.encryENV     // Catch: java.lang.Throwable -> L99
            r1.b(r7)     // Catch: java.lang.Throwable -> L99
            com.kuaishou.weapon.p0.cp$1 r7 = new com.kuaishou.weapon.p0.cp$1     // Catch: java.lang.Throwable -> L99
            r7.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L99
            r4.b(r1, r7)     // Catch: java.lang.Throwable -> L99
        L99:
            return
    }
}
