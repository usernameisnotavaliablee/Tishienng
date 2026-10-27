package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void a(float r1);

        void b();
    }

    public u0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float a(long r0, long r2) {
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            return r0
    }

    public final long b(java.io.File r11, java.io.File r12, long r13, long r15, com.amap.api.col.3l.u0.a r17) {
            r10 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            if (r17 == 0) goto Lb
            r17.b()
        Lb:
            return r0
        Lc:
            r11.getAbsolutePath()
            r12.getAbsolutePath()
            boolean r0 = r11.isDirectory()     // Catch: java.lang.Exception -> L79
            r1 = 0
            java.lang.String r2 = "Cannot create dir "
            if (r0 == 0) goto L7f
            boolean r0 = r12.exists()     // Catch: java.lang.Exception -> L79
            if (r0 != 0) goto L44
            boolean r0 = r12.mkdirs()     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L28
            goto L44
        L28:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r0.<init>(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r12 = r12.getAbsolutePath()     // Catch: java.lang.Exception -> L3e
            r0.append(r12)     // Catch: java.lang.Exception -> L3e
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Exception -> L3e
            r11.<init>(r12)     // Catch: java.lang.Exception -> L3e
            throw r11     // Catch: java.lang.Exception -> L3e
        L3e:
            r3 = r13
            r7 = r17
            goto Le9
        L44:
            java.lang.String[] r8 = r11.list()     // Catch: java.lang.Exception -> L79
            if (r8 == 0) goto L78
            r3 = r13
            r9 = 0
        L4c:
            int r0 = r8.length     // Catch: java.lang.Exception -> L74
            if (r9 >= r0) goto L77
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L74
            r0 = r8[r9]     // Catch: java.lang.Exception -> L74
            r1.<init>(r11, r0)     // Catch: java.lang.Exception -> L74
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L74
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L74
            java.lang.String r5 = r11.getName()     // Catch: java.lang.Exception -> L74
            r0.<init>(r12, r5)     // Catch: java.lang.Exception -> L74
            r5 = r8[r9]     // Catch: java.lang.Exception -> L74
            r2.<init>(r0, r5)     // Catch: java.lang.Exception -> L74
            r0 = r10
            r5 = r15
            r7 = r17
            long r3 = r0.b(r1, r2, r3, r5, r7)     // Catch: java.lang.Exception -> L71
            int r9 = r9 + 1
            goto L4c
        L71:
            goto Le9
        L74:
            r7 = r17
            goto L71
        L77:
            return r3
        L78:
            return r13
        L79:
            r7 = r17
        L7b:
            r3 = r13
            goto Le9
        L7f:
            r5 = r15
            r7 = r17
            java.io.File r0 = r12.getParentFile()     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto Lab
            boolean r3 = r0.exists()     // Catch: java.lang.Exception -> L7b
            if (r3 != 0) goto Lab
            boolean r3 = r0.mkdirs()     // Catch: java.lang.Exception -> L7b
            if (r3 == 0) goto L95
            goto Lab
        L95:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Exception -> L7b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7b
            r12.<init>(r2)     // Catch: java.lang.Exception -> L7b
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L7b
            r12.append(r0)     // Catch: java.lang.Exception -> L7b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L7b
            r11.<init>(r12)     // Catch: java.lang.Exception -> L7b
            throw r11     // Catch: java.lang.Exception -> L7b
        Lab:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L7b
            r0.<init>(r11)     // Catch: java.lang.Exception -> L7b
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L7b
            r11.<init>(r12)     // Catch: java.lang.Exception -> L7b
            r12 = 1024(0x400, float:1.435E-42)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Exception -> L7b
            r2 = r13
        Lba:
            int r4 = r0.read(r12)     // Catch: java.lang.Exception -> Lcf
            if (r4 <= 0) goto Ld2
            r11.write(r12, r1, r4)     // Catch: java.lang.Exception -> Lcf
            long r8 = (long) r4     // Catch: java.lang.Exception -> Lcf
            long r2 = r2 + r8
            if (r7 == 0) goto Lba
            float r4 = a(r2, r5)     // Catch: java.lang.Exception -> Lcf
            r7.a(r4)     // Catch: java.lang.Exception -> Lcf
            goto Lba
        Lcf:
            r3 = r2
            goto Le9
        Ld2:
            r0.close()     // Catch: java.lang.Exception -> Lcf
            r11.flush()     // Catch: java.lang.Exception -> Lcf
            r11.close()     // Catch: java.lang.Exception -> Lcf
            if (r7 == 0) goto Le8
            r11 = 1
            long r11 = r5 - r11
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto Le8
            r7.a()     // Catch: java.lang.Exception -> Lcf
        Le8:
            return r2
        Le9:
            if (r7 == 0) goto Lee
            r7.b()
        Lee:
            return r3
    }
}
