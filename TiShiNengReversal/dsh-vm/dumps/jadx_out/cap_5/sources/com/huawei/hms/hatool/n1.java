package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n1 {
    private java.lang.String a;

    n1() {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getPath()
            r1.a = r0
            return
    }

    private java.lang.String b(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = "/hms/component/"
            java.lang.String r2 = "component"
            java.lang.String r4 = r1.replace(r2, r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void c(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.b(r6)
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r5.b(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "hianalytics_"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.<init>(r2, r6)
            boolean r6 = r0.exists()
            java.lang.String r2 = "hmsSdk"
            if (r6 != 0) goto L36
            boolean r6 = r0.mkdirs()
            if (r6 == 0) goto L36
            java.lang.String r6 = "file directory is mkdirs"
            com.huawei.hms.hatool.j1.h(r2, r6)
        L36:
            boolean r6 = r5.d(r1)
            if (r6 == 0) goto L40
            com.huawei.hms.hatool.i0.d(r1, r7)
            return
        L40:
            java.lang.String r6 = "refreshComponent():file is not found,and file is create failed"
            com.huawei.hms.hatool.j1.m(r2, r6)
            return
    }

    private boolean d(java.io.File r2) {
            r1 = this;
            boolean r0 = r2.exists()
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = r2.createNewFile()     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            java.lang.String r2 = "hmsSdk"
            java.lang.String r0 = "create new file error!"
            com.huawei.hms.hatool.j1.m(r2, r0)
            r2 = 0
            return r2
    }

    private char[] e(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r5 = this;
            byte[] r6 = c2.c.c(r6)
            byte[] r7 = c2.c.c(r7)
            byte[] r8 = c2.c.c(r8)
            byte[] r9 = c2.c.c(r9)
            int r0 = r6.length
            int r1 = r7.length
            if (r0 <= r1) goto L15
            int r0 = r7.length
        L15:
            int r1 = r8.length
            if (r0 <= r1) goto L19
            int r0 = r8.length
        L19:
            int r1 = r9.length
            if (r0 <= r1) goto L1d
            int r0 = r9.length
        L1d:
            char[] r1 = new char[r0]
            r2 = 0
        L20:
            if (r2 >= r0) goto L33
            r3 = r6[r2]
            r4 = r7[r2]
            r3 = r3 ^ r4
            r4 = r8[r2]
            r3 = r3 ^ r4
            r4 = r9[r2]
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L20
        L33:
            return r1
    }

    private java.lang.String f(java.lang.String r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.b(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hianalytics_"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r1, r5)
            boolean r5 = r4.d(r0)
            if (r5 == 0) goto L25
            java.lang.String r5 = com.huawei.hms.hatool.i0.a(r0)
            return r5
        L25:
            r5 = 128(0x80, float:1.8E-43)
            java.lang.String r5 = c2.b.e(r5)
            com.huawei.hms.hatool.i0.d(r0, r5)
            return r5
    }

    private boolean g() {
            r6 = this;
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r1 = "Privacy_MY"
            java.lang.String r2 = "assemblyFlash"
            r3 = -1
            long r0 = com.huawei.hms.hatool.l.a(r0, r1, r2, r3)
            r2 = 1
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L1b
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "First init components"
            com.huawei.hms.hatool.j1.h(r0, r1)
            return r2
        L1b:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L2a
            return r2
        L2a:
            r0 = 0
            return r0
    }

    private static boolean h(java.io.File r6) {
            r0 = 0
            if (r6 == 0) goto L57
            boolean r1 = r6.exists()
            if (r1 == 0) goto L57
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto L10
            goto L57
        L10:
            java.io.File[] r1 = r6.listFiles()
            if (r1 == 0) goto L57
            int r2 = r1.length
            if (r2 != 0) goto L1a
            goto L57
        L1a:
            int r2 = r1.length
        L1b:
            if (r0 >= r2) goto L52
            r3 = r1[r0]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L46
            boolean r4 = r3.delete()
            if (r4 != 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "delete file failed : "
            r4.append(r5)
            java.lang.String r3 = r3.getName()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r4, r3)
            goto L4f
        L46:
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L4f
            h(r3)
        L4f:
            int r0 = r0 + 1
            goto L1b
        L52:
            boolean r6 = r6.delete()
            return r6
        L57:
            return r0
    }

    public static boolean i() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = com.huawei.hms.hatool.y0.q()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = "hms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = h(r1)
            return r0
    }

    private java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc"
            return r0
    }

    public java.lang.String a() {
            r10 = this;
            java.lang.String r0 = r10.j()
            boolean r1 = r10.g()
            java.lang.String r2 = "maywnj"
            java.lang.String r3 = "marfil"
            java.lang.String r4 = "febdoc"
            java.lang.String r5 = "aprpap"
            if (r1 == 0) goto L47
            java.lang.String r1 = "hmsSdk"
            java.lang.String r6 = "refresh components"
            com.huawei.hms.hatool.j1.h(r1, r6)
            r1 = 128(0x80, float:1.8E-43)
            java.lang.String r6 = c2.b.e(r1)
            r10.c(r5, r6)
            java.lang.String r5 = c2.b.e(r1)
            r10.c(r4, r5)
            java.lang.String r4 = c2.b.e(r1)
            r10.c(r3, r4)
            java.lang.String r1 = c2.b.e(r1)
            r10.c(r2, r1)
            android.content.Context r2 = com.huawei.hms.hatool.y0.q()
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "Privacy_MY"
            java.lang.String r9 = "assemblyFlash"
            com.huawei.hms.hatool.l.f(r2, r3, r9, r7)
            goto L57
        L47:
            java.lang.String r6 = r10.f(r5)
            java.lang.String r5 = r10.f(r4)
            java.lang.String r4 = r10.f(r3)
            java.lang.String r1 = r10.f(r2)
        L57:
            char[] r0 = r10.e(r6, r5, r4, r0)
            byte[] r1 = c2.c.c(r1)
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 16
            byte[] r0 = y1.c.c(r0, r1, r2, r3)
            java.lang.String r0 = c2.c.b(r0)
            return r0
    }
}
