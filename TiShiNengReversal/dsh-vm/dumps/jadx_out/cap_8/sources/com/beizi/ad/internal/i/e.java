package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class e extends com.beizi.ad.internal.i.l {
    private final com.beizi.ad.internal.i.h a;

    /* renamed from: b, reason: collision with root package name */
    private final com.beizi.ad.internal.i.a.b f6964b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.internal.i.b f6965c;

    public e(com.beizi.ad.internal.i.h r1, com.beizi.ad.internal.i.a.b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f6964b = r2
            r0.a = r1
            return
    }

    private void a(java.io.OutputStream r5, long r6) throws com.beizi.ad.internal.i.m, java.io.IOException {
            r4 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]
        L4:
            int r2 = r4.a(r1, r6, r0)
            r3 = -1
            if (r2 == r3) goto L12
            r3 = 0
            r5.write(r1, r3, r2)
            long r2 = (long) r2
            long r6 = r6 + r2
            goto L4
        L12:
            r5.flush()
            return
    }

    private boolean a(com.beizi.ad.internal.i.d r8) throws com.beizi.ad.internal.i.m {
            r7 = this;
            com.beizi.ad.internal.i.h r0 = r7.a
            int r0 = r0.a()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            com.beizi.ad.internal.i.a.b r4 = r7.f6964b
            int r4 = r4.a()
            if (r3 == 0) goto L2a
            boolean r3 = r8.f6963c
            if (r3 == 0) goto L2a
            long r5 = r8.f6962b
            float r8 = (float) r5
            float r3 = (float) r4
            float r0 = (float) r0
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r4
            float r3 = r3 + r0
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            return r2
    }

    private java.lang.String b(com.beizi.ad.internal.i.d r12) throws java.io.IOException, com.beizi.ad.internal.i.m {
            r11 = this;
            com.beizi.ad.internal.i.h r0 = r11.a
            java.lang.String r0 = r0.c()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            com.beizi.ad.internal.i.a.b r2 = r11.f6964b
            boolean r2 = r2.d()
            if (r2 == 0) goto L19
            com.beizi.ad.internal.i.a.b r2 = r11.f6964b
            int r2 = r2.a()
            goto L1f
        L19:
            com.beizi.ad.internal.i.h r2 = r11.a
            int r2 = r2.a()
        L1f:
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            boolean r6 = r12.f6963c
            long r7 = (long) r2
            if (r6 == 0) goto L2e
            long r9 = r12.f6962b
            long r7 = r7 - r9
        L2e:
            if (r5 == 0) goto L34
            if (r6 == 0) goto L34
            r6 = 1
            goto L35
        L34:
            r6 = 0
        L35:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            boolean r10 = r12.f6963c
            if (r10 == 0) goto L41
            java.lang.String r10 = "HTTP/1.1 206 PARTIAL CONTENT\n"
            goto L43
        L41:
            java.lang.String r10 = "HTTP/1.1 200 OK\n"
        L43:
            r9.append(r10)
            java.lang.String r10 = "Accept-Ranges: bytes\n"
            r9.append(r10)
            java.lang.String r10 = ""
            if (r5 == 0) goto L5e
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r5
            java.lang.String r5 = "Content-Length: %d\n"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            goto L5f
        L5e:
            r5 = r10
        L5f:
            r9.append(r5)
            if (r6 == 0) goto L85
            long r5 = r12.f6962b
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            int r5 = r2 + (-1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r12
            r6[r4] = r5
            r12 = 2
            r6[r12] = r2
            java.lang.String r12 = "Content-Range: bytes %d-%d/%d\n"
            java.lang.String r12 = java.lang.String.format(r12, r6)
            goto L86
        L85:
            r12 = r10
        L86:
            r9.append(r12)
            if (r1 != 0) goto L95
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r3] = r0
            java.lang.String r0 = "Content-Type: %s\n"
            java.lang.String r10 = java.lang.String.format(r0, r12)
        L95:
            r9.append(r10)
            java.lang.String r12 = "\n"
            r9.append(r12)
            java.lang.String r12 = r9.toString()
            return r12
    }

    private void b(java.io.OutputStream r3, long r4) throws com.beizi.ad.internal.i.m, java.io.IOException {
            r2 = this;
            com.beizi.ad.internal.i.h r0 = new com.beizi.ad.internal.i.h
            com.beizi.ad.internal.i.h r1 = r2.a
            r0.<init>(r1)
            int r5 = (int) r4
            r0.a(r5)     // Catch: java.lang.Throwable -> L1b
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1b
        Lf:
            int r5 = r0.a(r4)     // Catch: java.lang.Throwable -> L1b
            r1 = -1
            if (r5 == r1) goto L1d
            r1 = 0
            r3.write(r4, r1, r5)     // Catch: java.lang.Throwable -> L1b
            goto Lf
        L1b:
            r3 = move-exception
            goto L24
        L1d:
            r3.flush()     // Catch: java.lang.Throwable -> L1b
            r0.b()
            return
        L24:
            r0.b()
            throw r3
    }

    @Override // com.beizi.ad.internal.i.l
    protected void a(int r4) {
            r3 = this;
            com.beizi.ad.internal.i.b r0 = r3.f6965c
            if (r0 == 0) goto L11
            com.beizi.ad.internal.i.a.b r1 = r3.f6964b
            java.io.File r1 = r1.a
            com.beizi.ad.internal.i.h r2 = r3.a
            java.lang.String r2 = r2.d()
            r0.a(r1, r2, r4)
        L11:
            return
    }

    public void a(com.beizi.ad.internal.i.b r1) {
            r0 = this;
            r0.f6965c = r1
            return
    }

    public void a(com.beizi.ad.internal.i.d r4, java.net.Socket r5) throws java.io.IOException, com.beizi.ad.internal.i.m {
            r3 = this;
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r5 = r5.getOutputStream()
            r0.<init>(r5)
            java.lang.String r5 = r3.b(r4)
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)
            r0.write(r5)
            long r1 = r4.f6962b
            boolean r4 = r3.a(r4)
            if (r4 == 0) goto L22
            r3.a(r0, r1)
            return
        L22:
            r3.b(r0, r1)
            return
    }
}
