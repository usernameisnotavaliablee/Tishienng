package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bk {
    private static final java.lang.String a = "/proc/cpuinfo";

    public bk() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            r2.append(r0)     // Catch: java.lang.Throwable -> L43
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = ";"
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L43
            r0.append(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43
            r2.append(r0)     // Catch: java.lang.Throwable -> L43
        L23:
            java.lang.String r0 = "ro.product.cpu.abilist"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> L43
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L43
            r1.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L43
            r2.append(r0)     // Catch: java.lang.Throwable -> L43
        L3e:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L43
            return r0
        L43:
            java.lang.String r0 = ""
            return r0
    }

    public static com.kuaishou.weapon.p0.bj b() {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L99
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L99
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L95
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L95
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L92
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L92
            com.kuaishou.weapon.p0.bj r4 = new com.kuaishou.weapon.p0.bj     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            r5 = 0
        L1d:
            java.lang.String r6 = r3.readLine()     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L85
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L1d
            java.lang.String r7 = "Processor"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r8 = ":"
            r9 = 1
            if (r7 == 0) goto L4c
            java.lang.String[] r7 = r6.split(r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L1d
            r7 = r7[r9]     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L4a
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L4a
            if (r10 != 0) goto L4c
            r4.b(r7)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            goto L9d
        L4c:
            java.lang.String r7 = "processor"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L6b
            java.lang.String[] r7 = r6.split(r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L1d
            r7 = r7[r9]     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L4a
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L4a
            if (r10 != 0) goto L6b
            int r5 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L4a
            int r5 = r5 + r9
        L6b:
            java.lang.String r7 = "Hardware"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L1d
            java.lang.String[] r6 = r6.split(r8)     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L1d
            r6 = r6[r9]     // Catch: java.lang.Throwable -> L4a
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L1d
            r4.a(r6)     // Catch: java.lang.Throwable -> L4a
            goto L1d
        L85:
            r4.a(r5)     // Catch: java.lang.Throwable -> L4a
            r3.close()
            r1.close()
            r2.close()
            return r4
        L92:
            r3 = r0
            goto L9d
        L95:
            r1 = r0
            r3 = r1
            goto L9d
        L99:
            r1 = r0
            r2 = r1
            r3 = r2
        L9d:
            if (r3 == 0) goto La2
            r3.close()
        La2:
            if (r1 == 0) goto La7
            r1.close()
        La7:
            if (r2 == 0) goto Lac
            r2.close()
        Lac:
            return r0
    }
}
