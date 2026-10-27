package com.kwad.framework.filedownloader.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private com.kwad.framework.filedownloader.services.c ank;
    private com.kwad.framework.filedownloader.f.c.a anl;
    private com.kwad.framework.filedownloader.f.c.b anm;
    private com.kwad.framework.filedownloader.f.c.e ann;
    private volatile com.kwad.framework.filedownloader.b.a ano;
    private com.kwad.framework.filedownloader.f.c.d anp;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.framework.filedownloader.download.b anq = null;

        static {
                com.kwad.framework.filedownloader.download.b r0 = new com.kwad.framework.filedownloader.download.b
                r0.<init>()
                com.kwad.framework.filedownloader.download.b.a.anq = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.download.b yl() {
                com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.a.anq
                return r0
        }
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(com.kwad.framework.filedownloader.b.a.InterfaceC0111a r29) {
            r1 = r29
            java.lang.String r2 = "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d"
            java.lang.Class<com.kwad.framework.filedownloader.b.a> r3 = com.kwad.framework.filedownloader.b.a.class
            java.util.Iterator r0 = r1.iterator()
            com.kwad.framework.filedownloader.download.b r4 = yc()
            com.kwad.framework.filedownloader.f.c$d r4 = r4.yd()
            long r5 = java.lang.System.currentTimeMillis()
            r9 = 0
            r11 = 0
            r13 = 0
        L1c:
            r16 = 0
            r17 = 0
            r7 = 3
            boolean r19 = r0.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r19 == 0) goto L146
            java.lang.Object r19 = r0.next()     // Catch: java.lang.Throwable -> L56
            r15 = r19
            com.kwad.framework.filedownloader.d.c r15 = (com.kwad.framework.filedownloader.d.c) r15     // Catch: java.lang.Throwable -> L56
            byte r8 = r15.wJ()     // Catch: java.lang.Throwable -> L56
            r21 = r0
            r0 = -2
            if (r8 == r7) goto L5b
            byte r8 = r15.wJ()     // Catch: java.lang.Throwable -> L56
            r7 = 2
            if (r8 == r7) goto L5b
            byte r7 = r15.wJ()     // Catch: java.lang.Throwable -> L56
            r8 = -1
            if (r7 == r8) goto L5b
            byte r7 = r15.wJ()     // Catch: java.lang.Throwable -> L56
            r8 = 1
            if (r7 != r8) goto L5e
            long r7 = r15.yZ()     // Catch: java.lang.Throwable -> L56
            int r23 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r23 <= 0) goto L5e
            goto L5b
        L56:
            r0 = move-exception
            r25 = r5
            goto L181
        L5b:
            r15.d(r0)     // Catch: java.lang.Throwable -> L56
        L5e:
            java.lang.String r7 = r15.getTargetFilePath()     // Catch: java.lang.Throwable -> L56
            r23 = 1
            if (r7 != 0) goto L6a
            r25 = r5
            goto Lec
        L6a:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L56
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L56
            byte r7 = r15.wJ()     // Catch: java.lang.Throwable -> L56
            if (r7 != r0) goto Lc9
            int r0 = r15.getId()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r15.getPath()     // Catch: java.lang.Throwable -> L56
            r25 = r5
            r5 = 0
            boolean r0 = com.kwad.framework.filedownloader.f.f.a(r0, r15, r7, r5)     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto Lcb
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = r15.yr()     // Catch: java.lang.Throwable -> Lc6
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lc6
            boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> Lc6
            if (r5 != 0) goto Lcb
            boolean r5 = r8.exists()     // Catch: java.lang.Throwable -> Lc6
            if (r5 == 0) goto Lcb
            boolean r5 = r8.renameTo(r0)     // Catch: java.lang.Throwable -> Lc6
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto Lcb
            java.lang.String r6 = "resume from the old no-temp-file architecture [%B], [%s]->[%s]"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r7 = r8.getPath()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> Lc6
            r28 = r0
            r27 = r5
            r5 = 3
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lc6
            r0[r16] = r27     // Catch: java.lang.Throwable -> Lc6
            r20 = 1
            r0[r20] = r7     // Catch: java.lang.Throwable -> Lc6
            r19 = 2
            r0[r19] = r28     // Catch: java.lang.Throwable -> Lc6
            com.kwad.framework.filedownloader.f.d.c(r3, r6, r0)     // Catch: java.lang.Throwable -> Lc6
            goto Lcb
        Lc6:
            r0 = move-exception
            goto L181
        Lc9:
            r25 = r5
        Lcb:
            byte r0 = r15.wJ()     // Catch: java.lang.Throwable -> Lc6
            r5 = 1
            if (r0 != r5) goto Ldb
            long r5 = r15.yZ()     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 > 0) goto Ldb
            goto Lec
        Ldb:
            int r0 = r15.getId()     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = com.kwad.framework.filedownloader.f.f.b(r0, r15)     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto Le6
            goto Lec
        Le6:
            boolean r0 = r8.exists()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto Lf7
        Lec:
            r21.remove()     // Catch: java.lang.Throwable -> Lc6
            long r11 = r11 + r23
            r0 = r21
            r5 = r25
            goto L1c
        Lf7:
            int r0 = r15.getId()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = r15.getUrl()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r15.getPath()     // Catch: java.lang.Throwable -> Lc6
            boolean r7 = r15.wF()     // Catch: java.lang.Throwable -> Lc6
            int r5 = r4.f(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc6
            if (r5 == r0) goto L137
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto L12c
            java.lang.String r6 = "the id is changed on restoring from db: old[%d] -> new[%d]"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lc6
            r27 = r4
            r28 = r7
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lc6
            r7[r16] = r28     // Catch: java.lang.Throwable -> Lc6
            r20 = 1
            r7[r20] = r8     // Catch: java.lang.Throwable -> Lc6
            com.kwad.framework.filedownloader.f.d.c(r3, r6, r7)     // Catch: java.lang.Throwable -> Lc6
            goto L12e
        L12c:
            r27 = r4
        L12e:
            r15.setId(r5)     // Catch: java.lang.Throwable -> Lc6
            r1.a(r0, r15)     // Catch: java.lang.Throwable -> Lc6
            long r13 = r13 + r23
            goto L139
        L137:
            r27 = r4
        L139:
            r1.c(r15)     // Catch: java.lang.Throwable -> Lc6
            long r9 = r9 + r23
            r0 = r21
            r5 = r25
            r4 = r27
            goto L1c
        L146:
            r25 = r5
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            com.kwad.framework.filedownloader.f.f.aK(r0)
            r1.xU()
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L180
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r25
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r16] = r0
            r20 = 1
            r6[r20] = r1
            r19 = 2
            r6[r19] = r4
            r22 = 3
            r6[r22] = r5
            com.kwad.framework.filedownloader.f.d.c(r3, r2, r6)
        L180:
            return
        L181:
            android.content.Context r4 = com.kwad.framework.filedownloader.f.c.zz()
            com.kwad.framework.filedownloader.f.f.aK(r4)
            r1.xU()
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            if (r1 == 0) goto L1b9
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r25
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r16] = r1
            r20 = 1
            r7[r20] = r4
            r19 = 2
            r7[r19] = r5
            r22 = 3
            r7[r22] = r6
            com.kwad.framework.filedownloader.f.d.c(r3, r2, r7)
        L1b9:
            throw r0
    }

    public static com.kwad.framework.filedownloader.download.b yc() {
            com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.a.yl()
            return r0
    }

    private com.kwad.framework.filedownloader.f.c.a yh() {
            r1 = this;
            com.kwad.framework.filedownloader.f.c$a r0 = r1.anl
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r1)
            com.kwad.framework.filedownloader.f.c$a r0 = r1.anl     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            com.kwad.framework.filedownloader.services.c r0 = r1.yk()     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$a r0 = r0.zi()     // Catch: java.lang.Throwable -> L15
            r1.anl = r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1b
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$a r0 = r1.anl
            return r0
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    private com.kwad.framework.filedownloader.f.c.b yi() {
            r1 = this;
            com.kwad.framework.filedownloader.f.c$b r0 = r1.anm
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r1)
            com.kwad.framework.filedownloader.f.c$b r0 = r1.anm     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            com.kwad.framework.filedownloader.services.c r0 = r1.yk()     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$b r0 = r0.zh()     // Catch: java.lang.Throwable -> L15
            r1.anm = r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1b
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$b r0 = r1.anm
            return r0
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    private com.kwad.framework.filedownloader.f.c.e yj() {
            r1 = this;
            com.kwad.framework.filedownloader.f.c$e r0 = r1.ann
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r1)
            com.kwad.framework.filedownloader.f.c$e r0 = r1.ann     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            com.kwad.framework.filedownloader.services.c r0 = r1.yk()     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$e r0 = r0.zg()     // Catch: java.lang.Throwable -> L15
            r1.ann = r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1b
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$e r0 = r1.ann
            return r0
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    private com.kwad.framework.filedownloader.services.c yk() {
            r1 = this;
            com.kwad.framework.filedownloader.services.c r0 = r1.ank
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r1)
            com.kwad.framework.filedownloader.services.c r0 = r1.ank     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.kwad.framework.filedownloader.services.c r0 = new com.kwad.framework.filedownloader.services.c     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            r1.ank = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L18
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            com.kwad.framework.filedownloader.services.c r0 = r1.ank
            return r0
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public final int a(int r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            com.kwad.framework.filedownloader.f.c$a r1 = r0.yh()
            int r1 = r1.V(r4)
            return r1
    }

    public final void a(com.kwad.framework.filedownloader.services.c.b r2) {
            r1 = this;
            monitor-enter(r1)
            com.kwad.framework.filedownloader.services.c r0 = new com.kwad.framework.filedownloader.services.c     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r1.ank = r0     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r1.anm = r2     // Catch: java.lang.Throwable -> L13
            r1.ann = r2     // Catch: java.lang.Throwable -> L13
            r1.ano = r2     // Catch: java.lang.Throwable -> L13
            r1.anp = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public final com.kwad.framework.filedownloader.e.a b(java.io.File r2) {
            r1 = this;
            com.kwad.framework.filedownloader.f.c$e r0 = r1.yj()
            com.kwad.framework.filedownloader.e.a r2 = r0.c(r2)
            return r2
    }

    public final void b(com.kwad.framework.filedownloader.services.c.b r2) {
            r1 = this;
            monitor-enter(r1)
            com.kwad.framework.filedownloader.services.c r0 = new com.kwad.framework.filedownloader.services.c     // Catch: java.lang.Throwable -> La
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La
            r1.ank = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public final com.kwad.framework.filedownloader.a.b br(java.lang.String r2) {
            r1 = this;
            com.kwad.framework.filedownloader.f.c$b r0 = r1.yi()     // Catch: java.lang.Throwable -> L9
            com.kwad.framework.filedownloader.a.b r2 = r0.bo(r2)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            com.kwad.framework.filedownloader.a.c$b r0 = new com.kwad.framework.filedownloader.a.c$b
            r0.<init>()
            r1.anm = r0
            com.kwad.framework.filedownloader.a.b r2 = r0.bo(r2)
            return r2
    }

    public final com.kwad.framework.filedownloader.f.c.d yd() {
            r1 = this;
            com.kwad.framework.filedownloader.f.c$d r0 = r1.anp
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r1)
            com.kwad.framework.filedownloader.f.c$d r0 = r1.anp     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            com.kwad.framework.filedownloader.services.c r0 = r1.yk()     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$d r0 = r0.zj()     // Catch: java.lang.Throwable -> L15
            r1.anp = r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1b
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            com.kwad.framework.filedownloader.f.c$d r0 = r1.anp
            return r0
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final synchronized com.kwad.framework.filedownloader.b.a ye() {
            r1 = this;
            monitor-enter(r1)
            com.kwad.framework.filedownloader.b.a r0 = r1.ano     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            com.kwad.framework.filedownloader.b.a r0 = r1.ano     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            goto L22
        Lb:
            com.kwad.framework.filedownloader.services.c r0 = r1.yk()     // Catch: java.lang.Throwable -> L9
            com.kwad.framework.filedownloader.b.a r0 = r0.zf()     // Catch: java.lang.Throwable -> L9
            r1.ano = r0     // Catch: java.lang.Throwable -> L9
            com.kwad.framework.filedownloader.b.a r0 = r1.ano     // Catch: java.lang.Throwable -> L9
            com.kwad.framework.filedownloader.b.a$a r0 = r0.xT()     // Catch: java.lang.Throwable -> L9
            a(r0)     // Catch: java.lang.Throwable -> L9
            com.kwad.framework.filedownloader.b.a r0 = r1.ano     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final int yf() {
            r1 = this;
            com.kwad.framework.filedownloader.services.c r0 = r1.yk()
            int r0 = r0.yf()
            return r0
    }

    public final boolean yg() {
            r1 = this;
            r1.yj()
            r0 = 1
            return r0
    }
}
