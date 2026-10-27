package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o {
    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kuaishou.weapon.p0.s a(org.json.JSONObject r17) {
            com.kuaishou.weapon.p0.p r0 = b(r17)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r0.a()
            java.lang.String r5 = r0.l()
            java.lang.String r6 = r0.j()
            int r1 = r0.d()
            r9 = 1
            if (r1 != r9) goto L1d
            r10 = 1
            goto L1e
        L1d:
            r10 = 0
        L1e:
            int r1 = r0.h()
            if (r1 != r9) goto L26
            r11 = 1
            goto L27
        L26:
            r11 = 0
        L27:
            int r12 = r0.e()
            java.lang.String r7 = r0.c()
            java.lang.String r4 = r0.f()
            java.lang.String r1 = r0.b()
            android.content.pm.PackageInfo r2 = new android.content.pm.PackageInfo
            r2.<init>()
            r2.packageName = r4     // Catch: java.lang.Throwable -> L7c
            r2.versionName = r5     // Catch: java.lang.Throwable -> L7c
            android.content.pm.ApplicationInfo r13 = new android.content.pm.ApplicationInfo     // Catch: java.lang.Throwable -> L7c
            r13.<init>()     // Catch: java.lang.Throwable -> L7c
            boolean r14 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L7c
            if (r14 != 0) goto L7e
            boolean r14 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7c
            if (r14 != 0) goto L7e
            java.lang.String r14 = "."
            boolean r14 = r1.startsWith(r14)     // Catch: java.lang.Throwable -> L7c
            if (r14 == 0) goto L7e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r14.<init>()     // Catch: java.lang.Throwable -> L7c
            r14.append(r4)     // Catch: java.lang.Throwable -> L7c
            r14.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L7c
            r13.name = r14     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r14.<init>()     // Catch: java.lang.Throwable -> L7c
            r14.append(r4)     // Catch: java.lang.Throwable -> L7c
            r14.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r14.toString()     // Catch: java.lang.Throwable -> L7c
            r13.className = r1     // Catch: java.lang.Throwable -> L7c
            goto L7e
        L7c:
            goto Le9
        L7e:
            int r1 = r0.i()     // Catch: java.lang.Throwable -> L7c
            r13.theme = r1     // Catch: java.lang.Throwable -> L7c
            r2.applicationInfo = r13     // Catch: java.lang.Throwable -> L7c
            java.util.List r1 = r0.m()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto Le9
            int r13 = r1.size()     // Catch: java.lang.Throwable -> L7c
            if (r13 <= 0) goto Le9
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r13.<init>()     // Catch: java.lang.Throwable -> L7c
            r14 = 0
        L98:
            int r15 = r1.size()     // Catch: java.lang.Throwable -> L7c
            if (r14 >= r15) goto Ld5
            android.content.pm.ActivityInfo r15 = new android.content.pm.ActivityInfo     // Catch: java.lang.Throwable -> L7c
            r15.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r16 = r1.get(r14)     // Catch: java.lang.Throwable -> L7c
            com.kuaishou.weapon.p0.p$a r16 = (com.kuaishou.weapon.p0.p.a) r16     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = r16.c()     // Catch: java.lang.Throwable -> L7c
            r15.name = r8     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r1.get(r14)     // Catch: java.lang.Throwable -> L7c
            com.kuaishou.weapon.p0.p$a r8 = (com.kuaishou.weapon.p0.p.a) r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r8.b()     // Catch: java.lang.Throwable -> L7c
            r15.theme = r8     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r1.get(r14)     // Catch: java.lang.Throwable -> L7c
            com.kuaishou.weapon.p0.p$a r8 = (com.kuaishou.weapon.p0.p.a) r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r8.a()     // Catch: java.lang.Throwable -> L7c
            r15.labelRes = r8     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = r15.name     // Catch: java.lang.Throwable -> L7c
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L7c
            if (r8 != 0) goto Ld2
            r13.add(r15)     // Catch: java.lang.Throwable -> L7c
        Ld2:
            int r14 = r14 + 1
            goto L98
        Ld5:
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L7c
            if (r1 <= 0) goto Le9
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L7c
            android.content.pm.ActivityInfo[] r1 = new android.content.pm.ActivityInfo[r1]     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r1 = r13.toArray(r1)     // Catch: java.lang.Throwable -> L7c
            android.content.pm.ActivityInfo[] r1 = (android.content.pm.ActivityInfo[]) r1     // Catch: java.lang.Throwable -> L7c
            r2.activities = r1     // Catch: java.lang.Throwable -> L7c
        Le9:
            com.kuaishou.weapon.p0.s r1 = new com.kuaishou.weapon.p0.s
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.v = r10
            r1.x = r12
            com.kuaishou.weapon.p0.p$b r2 = r0.k()
            if (r2 != 0) goto Lfa
            r2 = 0
            goto L102
        Lfa:
            com.kuaishou.weapon.p0.p$b r2 = r0.k()
            int r2 = r2.a()
        L102:
            com.kuaishou.weapon.p0.p$b r3 = r0.k()
            if (r3 != 0) goto L10a
            r3 = -1
            goto L112
        L10a:
            com.kuaishou.weapon.p0.p$b r3 = r0.k()
            int r3 = r3.b()
        L112:
            r1.t = r2
            r1.u = r3
            long r2 = java.lang.System.currentTimeMillis()
            r1.s = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 <= r3) goto L12e
            if (r11 != r9) goto L12e
            int r0 = r0.g()
            if (r0 != r9) goto L12c
            r8 = 1
            goto L12d
        L12c:
            r8 = 0
        L12d:
            r11 = r8
        L12e:
            r1.y = r11
            return r1
    }

    private static com.kuaishou.weapon.p0.p b(org.json.JSONObject r8) {
            r0 = 0
            com.kuaishou.weapon.p0.p r1 = new com.kuaishou.weapon.p0.p     // Catch: java.lang.Exception -> Lcd
            r1.<init>()     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wk"
            int r2 = r8.optInt(r2)     // Catch: java.lang.Exception -> Lcd
            r1.a(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wan"
            java.lang.String r2 = r8.optString(r2)     // Catch: java.lang.Exception -> Lcd
            r1.a(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wm"
            java.lang.String r2 = r8.optString(r2)     // Catch: java.lang.Exception -> Lcd
            r1.b(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wo"
            int r2 = r8.optInt(r2)     // Catch: java.lang.Exception -> Lcd
            r1.b(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wpr"
            int r2 = r8.optInt(r2)     // Catch: java.lang.Exception -> Lcd
            r1.c(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wp"
            java.lang.String r2 = r8.optString(r2)     // Catch: java.lang.Exception -> Lcd
            r1.c(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "ws"
            r3 = 1
            int r2 = r8.optInt(r2, r3)     // Catch: java.lang.Exception -> Lcd
            r1.e(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wh"
            r3 = 0
            int r2 = r8.optInt(r2, r3)     // Catch: java.lang.Exception -> Lcd
            r1.d(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wt"
            int r2 = r8.optInt(r2)     // Catch: java.lang.Exception -> Lcd
            r1.f(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wu"
            java.lang.String r2 = r8.optString(r2)     // Catch: java.lang.Exception -> Lcd
            r1.d(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wv"
            java.lang.String r2 = r8.optString(r2)     // Catch: java.lang.Exception -> Lcd
            r1.e(r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r2 = "wa"
            org.json.JSONArray r2 = r8.getJSONArray(r2)     // Catch: java.lang.Exception -> Lcd
            r4 = r0
        L72:
            int r5 = r2.length()     // Catch: java.lang.Exception -> Lcd
            if (r3 >= r5) goto La9
            com.kuaishou.weapon.p0.p$a r5 = new com.kuaishou.weapon.p0.p$a     // Catch: java.lang.Exception -> Lcd
            r5.<init>()     // Catch: java.lang.Exception -> Lcd
            org.json.JSONObject r6 = r2.getJSONObject(r3)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r7 = "r"
            int r7 = r6.optInt(r7)     // Catch: java.lang.Exception -> Lcd
            r5.a(r7)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r7 = "t"
            int r7 = r6.optInt(r7)     // Catch: java.lang.Exception -> Lcd
            r5.b(r7)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r7 = "n"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Exception -> Lcd
            r5.a(r6)     // Catch: java.lang.Exception -> Lcd
            if (r4 != 0) goto La3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lcd
            r4.<init>()     // Catch: java.lang.Exception -> Lcd
        La3:
            r4.add(r5)     // Catch: java.lang.Exception -> Lcd
            int r3 = r3 + 1
            goto L72
        La9:
            r1.a(r4)     // Catch: java.lang.Exception -> Lcd
            com.kuaishou.weapon.p0.p$b r2 = new com.kuaishou.weapon.p0.p$b     // Catch: java.lang.Exception -> Lcd
            r2.<init>()     // Catch: java.lang.Exception -> Lcd
            java.lang.String r3 = "we"
            org.json.JSONObject r8 = r8.getJSONObject(r3)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r3 = "duration"
            int r3 = r8.optInt(r3)     // Catch: java.lang.Exception -> Lcd
            r2.a(r3)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r3 = "network"
            int r8 = r8.optInt(r3)     // Catch: java.lang.Exception -> Lcd
            r2.b(r8)     // Catch: java.lang.Exception -> Lcd
            r1.a(r2)     // Catch: java.lang.Exception -> Lcd
            return r1
        Lcd:
            return r0
    }
}
