package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bx {
    private static java.lang.String a = "Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n";
    private static java.lang.String b = "Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n";

    static {
            java.lang.String r0 = "Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n"
            r1 = 2
            java.lang.String r0 = com.kuaishou.weapon.p0.c.b(r0, r1)
            com.kuaishou.weapon.p0.bx.a = r0
            java.lang.String r0 = com.kuaishou.weapon.p0.bx.b
            java.lang.String r0 = com.kuaishou.weapon.p0.c.b(r0, r1)
            com.kuaishou.weapon.p0.bx.b = r0
            return
    }

    public bx() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r5) {
            java.lang.String r0 = d(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "0"
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = c(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L28
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            b(r5, r3)
            return r0
    }

    public static void a(android.content.Context r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1e
            r1 = 23
            if (r0 < r1) goto L15
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L1e
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Exception -> L1e
            boolean r0 = com.amap.api.col.3l.h5.a(r0)     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto L15
            goto L1e
        L15:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = com.kuaishou.weapon.p0.bx.a     // Catch: java.lang.Exception -> L1e
            android.provider.Settings.System.putString(r2, r0, r3)     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    public static java.lang.String b(android.content.Context r3) {
            java.lang.String r0 = c(r3)
            java.lang.String r1 = d(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L15
            boolean r2 = android.text.TextUtils.equals(r0, r1)
            if (r2 == 0) goto L15
            return r0
        L15:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1f
            b(r3, r0)
            return r0
        L1f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L29
            a(r3, r1)
            return r1
        L29:
            java.lang.String r3 = ""
            return r3
    }

    public static void b(android.content.Context r0, java.lang.String r1) {
            com.kuaishou.weapon.p0.df r0 = com.kuaishou.weapon.p0.df.a(r0)
            r0.d(r1)
            return
    }

    public static java.lang.String c(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = com.kuaishou.weapon.p0.bx.a     // Catch: java.lang.Exception -> Lb
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r0)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String d(android.content.Context r0) {
            com.kuaishou.weapon.p0.df r0 = com.kuaishou.weapon.p0.df.a(r0)     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = r0.e()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }
}
