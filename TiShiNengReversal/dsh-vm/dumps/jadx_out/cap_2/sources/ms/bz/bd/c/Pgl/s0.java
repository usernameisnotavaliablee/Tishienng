package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class s0 extends ms.bz.bd.c.Pgl.pbly.pgla {
    s0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    protected final java.lang.Object b(long r17, java.lang.String r19, java.lang.Object r20) throws java.lang.Throwable {
            r16 = this;
            r0 = r19
            ms.bz.bd.c.Pgl.pblv r1 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r1 = r1.c()
            android.content.res.AssetManager r1 = r1.getAssets()
            r2 = 1
            byte[] r8 = new byte[r2]
            r3 = 108(0x6c, float:1.51E-43)
            r9 = 0
            r8[r9] = r3
            r5 = 0
            java.lang.String r7 = "31170c"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            byte[] r15 = new byte[r2]
            r2 = 60
            r15[r9] = r2
            r12 = 0
            java.lang.String r14 = "c9bff5"
            r10 = 16777217(0x1000001, float:2.350989E-38)
            r11 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r10, r11, r12, r14, r15)
            java.lang.String r2 = (java.lang.String) r2
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L4d:
            r2 = r0
            java.lang.String r3 = ""
            java.lang.String[] r4 = r1.list(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
        L5a:
            int r0 = r4.length
            if (r6 >= r0) goto Ld8
            r0 = r4[r6]
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto Ld5
            r0 = r4[r6]
            r7 = 5
            byte[] r15 = new byte[r7]
            r15 = {x00e0: FILL_ARRAY_DATA , data: [37, 32, 20, 13, 25} // fill-array
            r12 = 0
            java.lang.String r14 = "91ba27"
            r10 = 16777217(0x1000001, float:2.350989E-38)
            r11 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r10, r11, r12, r14, r15)
            java.lang.String r7 = (java.lang.String) r7
            java.io.File r7 = java.io.File.createTempFile(r7, r3)
            java.lang.String r7 = r7.getAbsolutePath()
            r8 = 0
            java.io.InputStream r10 = r1.open(r0)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc1
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lba java.io.IOException -> Lbc
            r11.<init>(r7)     // Catch: java.lang.Throwable -> Lba java.io.IOException -> Lbc
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> La1 java.io.IOException -> La3
            r14 = 0
        L93:
            int r8 = r10.read(r0)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> La3
            if (r8 <= 0) goto La5
            r11.write(r0, r9, r8)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> La3
            r17 = 0
            long r12 = (long) r8     // Catch: java.lang.Throwable -> La1 java.io.IOException -> La3
            long r14 = r14 + r12
            goto L93
        La1:
            r0 = move-exception
            goto Lce
        La3:
            r0 = move-exception
            goto Lb8
        La5:
            r17 = 0
            r11.flush()     // Catch: java.lang.Throwable -> La1 java.io.IOException -> La3
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 <= 0) goto Lb1
            r5.add(r7)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> La3
        Lb1:
            ms.bz.bd.c.Pgl.pbln.a(r10)
            ms.bz.bd.c.Pgl.pbln.a(r11)
            goto Ld5
        Lb8:
            r8 = r11
            goto Lc3
        Lba:
            r0 = move-exception
            goto Lcd
        Lbc:
            r0 = move-exception
            goto Lc3
        Lbe:
            r0 = move-exception
            r10 = r8
            goto Lcd
        Lc1:
            r0 = move-exception
            r10 = r8
        Lc3:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> Lba
            ms.bz.bd.c.Pgl.pbln.a(r10)
            ms.bz.bd.c.Pgl.pbln.a(r8)
            goto Ld5
        Lcd:
            r11 = r8
        Lce:
            ms.bz.bd.c.Pgl.pbln.a(r10)
            ms.bz.bd.c.Pgl.pbln.a(r11)
            throw r0
        Ld5:
            int r6 = r6 + 1
            goto L5a
        Ld8:
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r0 = r5.toArray(r0)
            return r0
    }
}
