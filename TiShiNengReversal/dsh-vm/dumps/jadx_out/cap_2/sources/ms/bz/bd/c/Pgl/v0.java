package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v0 {
    public v0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a() {
            ms.bz.bd.c.Pgl.o0 r0 = new ms.bz.bd.c.Pgl.o0
            r0.<init>()
            r1 = 65537(0x10001, float:9.1837E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.p0 r0 = new ms.bz.bd.c.Pgl.p0
            r0.<init>()
            r1 = 65538(0x10002, float:9.1838E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.q0 r0 = new ms.bz.bd.c.Pgl.q0
            r0.<init>()
            r1 = 65539(0x10003, float:9.184E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.r0 r0 = new ms.bz.bd.c.Pgl.r0
            r0.<init>()
            r1 = 65540(0x10004, float:9.1841E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.s0 r0 = new ms.bz.bd.c.Pgl.s0
            r0.<init>()
            r1 = 65541(0x10005, float:9.1843E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.t0 r0 = new ms.bz.bd.c.Pgl.t0
            r0.<init>()
            r1 = 65542(0x10006, float:9.1844E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.u0 r0 = new ms.bz.bd.c.Pgl.u0
            r0.<init>()
            r1 = 65543(0x10007, float:9.1845E-41)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            ms.bz.bd.c.Pgl.r1 r0 = new ms.bz.bd.c.Pgl.r1
            r0.<init>()
            r1 = 196609(0x30001, float:2.75508E-40)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            r1 = 196610(0x30002, float:2.75509E-40)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            r1 = 196611(0x30003, float:2.7551E-40)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            boolean r0 = ms.bz.bd.c.Pgl.pbli.a()
            if (r0 == 0) goto L70
            ms.bz.bd.c.Pgl.o1 r0 = new ms.bz.bd.c.Pgl.o1
            r0.<init>()
            goto L75
        L70:
            ms.bz.bd.c.Pgl.pblj r0 = new ms.bz.bd.c.Pgl.pblj
            r0.<init>()
        L75:
            ms.bz.bd.c.Pgl.pblw.f(r0)
            r1 = 131073(0x20001, float:1.83672E-40)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            r1 = 131074(0x20002, float:1.83674E-40)
            ms.bz.bd.c.Pgl.pbly.b(r1, r0)
            r0 = 25
            byte[] r6 = new byte[r0]
            r6 = {x0098: FILL_ARRAY_DATA , data: [119, 114, 64, 31, 28, 93, 111, 64, 74, 52, 124, 101, 66, 20, 26, 49, 99, 75, 102, 38, 97, 36, 76, 2, 72} // fill-array
            r3 = 0
            java.lang.String r5 = "cf6e7f"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            return
    }

    static /* synthetic */ boolean b(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = c(r0, r1, r2)
            return r0
    }

    private static boolean c(android.content.Context r16, java.lang.String r17, java.lang.String r18) {
            r0 = r17
            r1 = r18
            r2 = 0
            android.content.res.AssetManager r3 = r16.getAssets()     // Catch: java.lang.Exception -> L78
            java.lang.String[] r3 = r3.list(r0)     // Catch: java.lang.Exception -> L78
            int r4 = r3.length     // Catch: java.lang.Exception -> L78
            if (r4 <= 0) goto L74
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L78
            r4.<init>(r1)     // Catch: java.lang.Exception -> L78
            r4.mkdirs()     // Catch: java.lang.Exception -> L78
            int r4 = r3.length     // Catch: java.lang.Exception -> L78
            r5 = 0
        L1a:
            r6 = 1
            if (r5 >= r4) goto L73
            r7 = r3[r5]     // Catch: java.lang.Exception -> L78
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r8.<init>()     // Catch: java.lang.Exception -> L78
            r8.append(r0)     // Catch: java.lang.Exception -> L78
            java.lang.String r13 = "f7d399"
            byte[] r14 = new byte[r6]     // Catch: java.lang.Exception -> L78
            r9 = 56
            r14[r2] = r9     // Catch: java.lang.Exception -> L78
            r9 = 16777217(0x1000001, float:2.350989E-38)
            r10 = 0
            r11 = 0
            java.lang.Object r9 = com.volcengine.mobsecBiz.matrix.pgla.a(r9, r10, r11, r13, r14)     // Catch: java.lang.Exception -> L78
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L78
            r8.append(r9)     // Catch: java.lang.Exception -> L78
            r8.append(r7)     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L78
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r9.<init>()     // Catch: java.lang.Exception -> L78
            r9.append(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r14 = "5e96a0"
            byte[] r15 = new byte[r6]     // Catch: java.lang.Exception -> L78
            r6 = 107(0x6b, float:1.5E-43)
            r15[r2] = r6     // Catch: java.lang.Exception -> L78
            r10 = 16777217(0x1000001, float:2.350989E-38)
            r11 = 0
            r12 = 0
            java.lang.Object r6 = com.volcengine.mobsecBiz.matrix.pgla.a(r10, r11, r12, r14, r15)     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L78
            r9.append(r6)     // Catch: java.lang.Exception -> L78
            r9.append(r7)     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Exception -> L78
            r7 = r16
            c(r7, r8, r6)     // Catch: java.lang.Exception -> L78
            int r5 = r5 + 1
            goto L1a
        L73:
            return r6
        L74:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            throw r0     // Catch: java.lang.Exception -> L78
        L78:
            r0 = 3
            byte[] r8 = new byte[r0]
            r8 = {x008a: FILL_ARRAY_DATA , data: [118, 48, 67} // fill-array
            r5 = 0
            java.lang.String r7 = "d3691d"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            return r2
    }
}
