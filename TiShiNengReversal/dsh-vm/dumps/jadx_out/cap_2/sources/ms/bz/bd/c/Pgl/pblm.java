package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblm {
    private static final java.lang.String a = null;

    static {
            r0 = 5
            byte[] r6 = new byte[r0]
            r6 = {x0028: FILL_ARRAY_DATA , data: [73, 108, 2, 25, 49} // fill-array
            r3 = 0
            java.lang.String r5 = "c20335"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            byte[] r12 = new byte[r0]
            r12 = {x0030: FILL_ARRAY_DATA , data: [99, 114, 47, 30, 3} // fill-array
            r9 = 0
            java.lang.String r11 = "fdcd86"
            r7 = 16777217(0x1000001, float:2.350989E-38)
            r8 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r7, r8, r9, r11, r12)
            java.lang.String r0 = (java.lang.String) r0
            ms.bz.bd.c.Pgl.pblm.a = r0
            return
    }

    public pblm() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r11) {
            java.lang.Class<ms.bz.bd.c.Pgl.pblm> r1 = ms.bz.bd.c.Pgl.pblm.class
            monitor-enter(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r0.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.io.File r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r11)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ldd
            r0.append(r2)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "a92395"
            r2 = 1
            byte[] r8 = new byte[r2]     // Catch: java.lang.Throwable -> Ldd
            r9 = 0
            r3 = 63
            r8[r9] = r3     // Catch: java.lang.Throwable -> Ldd
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ldd
            r0.append(r3)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = ms.bz.bd.c.Pgl.pblm.a     // Catch: java.lang.Throwable -> Ldd
            r0.append(r3)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldd
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ldd
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Ldd
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L4e
            java.lang.String r4 = c(r0)     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L4e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> Ldd
            if (r5 <= 0) goto L4e
            monitor-exit(r1)
            return r4
        L4e:
            android.content.res.Resources r11 = r11.getResources()     // Catch: java.lang.Throwable -> Ldd
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> Ldd
            java.io.InputStream r11 = r11.open(r3)     // Catch: java.lang.Throwable -> Ldd
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Ldd
            r3.<init>()     // Catch: java.lang.Throwable -> Ldd
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> Ldd
        L63:
            int r6 = r11.read(r5, r9, r4)     // Catch: java.lang.Throwable -> Ldd
            r7 = -1
            if (r6 == r7) goto L6e
            r3.write(r5, r9, r6)     // Catch: java.lang.Throwable -> Ldd
            goto L63
        L6e:
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ldd
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ldd
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Throwable -> Ldd
            r11.write(r3)     // Catch: java.lang.Throwable -> Ldd
            r11.close()     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r11.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "11bcdb"
            r3 = 10
            byte[] r8 = new byte[r3]     // Catch: java.lang.Throwable -> Ldd
            r8 = {x0118: FILL_ARRAY_DATA , data: [35, 59, 28, 24, 95, 53, 101, 71, 100, 115} // fill-array     // Catch: java.lang.Throwable -> Ldd
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ldd
            r11.append(r3)     // Catch: java.lang.Throwable -> Ldd
            r11.append(r0)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Ldd
            c(r11)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r11 = c(r0)     // Catch: java.lang.Throwable -> Ldd
            if (r11 == 0) goto Lb0
            int r3 = r11.length()     // Catch: java.lang.Throwable -> Ldd
            if (r3 != 0) goto Lf2
        Lb0:
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "929bda"
            r10 = 2
            byte[] r8 = new byte[r10]     // Catch: java.lang.Throwable -> Ldd
            r8 = {x0122: FILL_ARRAY_DATA , data: [58, 39} // fill-array     // Catch: java.lang.Throwable -> Ldd
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ldd
            r11.<init>(r0, r3)     // Catch: java.lang.Throwable -> Ldd
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Ldd
            r2[r9] = r10     // Catch: java.lang.Throwable -> Ldd
            r3 = 16
            r11.seek(r3)     // Catch: java.lang.Throwable -> Ldd
            r11.write(r2)     // Catch: java.lang.Throwable -> Ldd
            r11.close()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r11 = c(r0)     // Catch: java.lang.Throwable -> Ldd
            goto Lf2
        Ldd:
            r11 = 20
            byte[] r7 = new byte[r11]     // Catch: java.lang.Throwable -> Lfb
            r7 = {x0128: FILL_ARRAY_DATA , data: [39, 14, 26, 4, 80, 73, 64, 46, 71, 68, 71, 1, 111, 106, 32, 79, 57, 87, 58, 92} // fill-array     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r6 = "f7511c"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r11 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Lfb
        Lf2:
            if (r11 == 0) goto Lfe
            int r0 = r11.length()     // Catch: java.lang.Throwable -> Lfb
            if (r0 != 0) goto L113
            goto Lfe
        Lfb:
            r0 = move-exception
            r11 = r0
            goto L115
        Lfe:
            r11 = 16
            byte[] r7 = new byte[r11]     // Catch: java.lang.Throwable -> Lfb
            r7 = {x0136: FILL_ARRAY_DATA , data: [119, 13, 74, 0, 3, 18, 16, 39, 6, 74, 21, 13, 74, 0, 3, 18} // fill-array     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r6 = "64e5b8"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r11 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Lfb
        L113:
            monitor-exit(r1)
            return r11
        L115:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lfb
            throw r11
    }

    private static java.lang.String b(java.io.BufferedInputStream r9) {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L9:
            int r3 = r9.read(r1)     // Catch: java.lang.Exception -> L1b
            if (r3 <= 0) goto L18
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L1b
            r5 = 0
            r4.<init>(r1, r5, r3)     // Catch: java.lang.Exception -> L1b
            r2.append(r4)     // Catch: java.lang.Exception -> L1b
        L18:
            if (r3 >= r0) goto L9
            goto L2c
        L1b:
            r9 = 3
            byte[] r8 = new byte[r9]
            r8 = {x0032: FILL_ARRAY_DATA , data: [44, 50, 17} // fill-array
            r5 = 0
            java.lang.String r7 = "89a04e"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
        L2c:
            java.lang.String r9 = r2.toString()
            return r9
    }

    private static java.lang.String c(java.lang.String r18) {
            r1 = 5
            r2 = 0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            java.lang.String r7 = "131454"
            r3 = 2
            byte[] r8 = new byte[r3]     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            r8 = {x0104: FILL_ARRAY_DATA , data: [51, 57} // fill-array     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            java.lang.Process r3 = r0.exec(r3)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            java.io.OutputStream r0 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L85
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7b
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7b
            byte[] r0 = r18.getBytes()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            r4.write(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            r0 = 10
            r4.write(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            r4.flush()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            r4.close()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            r3.waitFor()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            java.lang.String r2 = b(r5)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L87
            r4.close()     // Catch: java.io.IOException -> L4d
            goto L5d
        L4d:
            byte[] r11 = new byte[r1]
            r11 = {x010a: FILL_ARRAY_DATA , data: [113, 58, 68, 46, 94} // fill-array
            r8 = 0
            java.lang.String r10 = "e14ed4"
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)
        L5d:
            r5.close()     // Catch: java.io.IOException -> L62
            goto Lc8
        L62:
            byte[] r0 = new byte[r1]
            r0 = {x0112: FILL_ARRAY_DATA , data: [36, 111, 21, 114, 89} // fill-array
            r14 = 0
            java.lang.String r16 = "0de9c8"
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r17 = r0
            com.volcengine.mobsecBiz.matrix.pgla.a(r12, r13, r14, r16, r17)
            goto Lc8
        L75:
            r0 = move-exception
        L76:
            r2 = r5
            goto Ld0
        L79:
            r0 = move-exception
            goto Ld0
        L7b:
            r5 = r2
            goto L87
        L7d:
            r0 = move-exception
            r5 = r2
            goto Lce
        L80:
            r0 = move-exception
            r3 = r2
            r5 = r3
            goto Lce
        L84:
            r3 = r2
        L85:
            r4 = r2
            r5 = r4
        L87:
            java.lang.String r10 = "e4c833"
            byte[] r11 = new byte[r1]     // Catch: java.lang.Throwable -> Lcc
            r11 = {x011a: FILL_ARRAY_DATA , data: [113, 63, 19, 115, 9} // fill-array     // Catch: java.lang.Throwable -> Lcc
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lcc
            if (r4 == 0) goto Laf
            r4.close()     // Catch: java.io.IOException -> L9d
            goto Laf
        L9d:
            byte[] r0 = new byte[r1]
            r0 = {x0122: FILL_ARRAY_DATA , data: [45, 56, 70, 126, 91} // fill-array
            r14 = 0
            java.lang.String r16 = "9365a9"
            r12 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r17 = r0
            com.volcengine.mobsecBiz.matrix.pgla.a(r12, r13, r14, r16, r17)
        Laf:
            if (r5 == 0) goto Lc5
            r5.close()     // Catch: java.io.IOException -> Lb5
            goto Lc5
        Lb5:
            byte[] r11 = new byte[r1]
            r11 = {x012a: FILL_ARRAY_DATA , data: [44, 60, 22, 42, 94} // fill-array
            r8 = 0
            java.lang.String r10 = "87fad2"
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)
        Lc5:
            if (r3 != 0) goto Lc8
            goto Lcb
        Lc8:
            r3.destroy()
        Lcb:
            return r2
        Lcc:
            r0 = move-exception
            r2 = r4
        Lce:
            r4 = r2
            goto L76
        Ld0:
            if (r4 == 0) goto Le6
            r4.close()     // Catch: java.io.IOException -> Ld6
            goto Le6
        Ld6:
            byte[] r10 = new byte[r1]
            r10 = {x0132: FILL_ARRAY_DATA , data: [113, 104, 64, 125, 2} // fill-array
            r7 = 0
            java.lang.String r9 = "ec068a"
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)
        Le6:
            if (r2 == 0) goto Lfe
            r2.close()     // Catch: java.io.IOException -> Lec
            goto Lfe
        Lec:
            byte[] r1 = new byte[r1]
            r1 = {x013a: FILL_ARRAY_DATA , data: [112, 50, 71, 122, 11} // fill-array
            r13 = 0
            java.lang.String r15 = "d97117"
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r16 = r1
            com.volcengine.mobsecBiz.matrix.pgla.a(r11, r12, r13, r15, r16)
        Lfe:
            if (r3 == 0) goto L103
            r3.destroy()
        L103:
            throw r0
    }
}
