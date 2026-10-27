package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblf {
    private static final java.lang.String a = null;

    static {
            r0 = 6
            byte[] r6 = new byte[r0]
            r6 = {x0018: FILL_ARRAY_DATA , data: [46, 101, 5, 79, 22, 45} // fill-array
            r3 = 0
            java.lang.String r5 = "1f8836"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            ms.bz.bd.c.Pgl.pblf.a = r0
            return
    }

    public pblf() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r10) {
            r0 = 255(0xff, float:3.57E-43)
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            java.io.File r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r10)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "661864"
            r3 = 1
            byte[] r9 = new byte[r3]     // Catch: java.lang.Throwable -> L45
            r3 = 0
            r4 = 104(0x68, float:1.46E-43)
            r9[r3] = r4     // Catch: java.lang.Throwable -> L45
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L45
            r2.append(r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = ms.bz.bd.c.Pgl.pblf.a     // Catch: java.lang.Throwable -> L45
            r2.append(r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L45
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L45
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            r0 = 2
            r5.delete()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r10 = r1
            goto L93
        L47:
            android.content.res.Resources r10 = r10.getResources()     // Catch: java.lang.Throwable -> L45
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch: java.lang.Throwable -> L45
            java.io.InputStream r10 = r10.open(r4)     // Catch: java.lang.Throwable -> L45
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L92
        L5c:
            int r6 = r10.read(r5, r3, r1)     // Catch: java.lang.Throwable -> L92
            r7 = -1
            if (r6 == r7) goto L67
            r4.write(r5, r3, r6)     // Catch: java.lang.Throwable -> L92
            goto L5c
        L67:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L92
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L92
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L92
            r1.write(r5)     // Catch: java.lang.Throwable -> L92
            r1.close()     // Catch: java.lang.Throwable -> L92
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L92
            if (r1 > 0) goto L7e
            r3 = 3
            goto L8b
        L7e:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L92
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L92
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r0
        L8b:
            r10.close()     // Catch: java.lang.Throwable -> L8e
        L8e:
            r4.close()     // Catch: java.lang.Throwable -> Lb1
            goto Lb1
        L92:
            r1 = r4
        L93:
            java.lang.String r6 = "db1183"
            r2 = 4
            byte[] r7 = new byte[r2]     // Catch: java.lang.Throwable -> Lb2
            r7 = {x00c0: FILL_ARRAY_DATA , data: [116, 99, 125, 66} // fill-array     // Catch: java.lang.Throwable -> Lb2
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lb2
            if (r10 == 0) goto Lab
            r10.close()     // Catch: java.lang.Throwable -> Laa
            goto Lab
        Laa:
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r3 = r0
        Lb1:
            return r3
        Lb2:
            r0 = move-exception
            if (r10 == 0) goto Lba
            r10.close()     // Catch: java.lang.Throwable -> Lb9
            goto Lba
        Lb9:
        Lba:
            if (r1 == 0) goto Lbf
            r1.close()     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            throw r0
    }
}
