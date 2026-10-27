package pl.droidsonroids.relinker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private static final java.lang.String g = "lib";
    protected final java.util.Set<java.lang.String> a;
    protected final pl.droidsonroids.relinker.c.b b;
    protected final pl.droidsonroids.relinker.c.a c;
    protected boolean d;
    protected boolean e;
    protected pl.droidsonroids.relinker.c.d f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ pl.droidsonroids.relinker.c.InterfaceC0091c d;
        final /* synthetic */ pl.droidsonroids.relinker.d e;

        a(pl.droidsonroids.relinker.d r1, android.content.Context r2, java.lang.String r3, java.lang.String r4, pl.droidsonroids.relinker.c.InterfaceC0091c r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                pl.droidsonroids.relinker.d r0 = r4.e     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                android.content.Context r1 = r4.a     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                java.lang.String r2 = r4.b     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                java.lang.String r3 = r4.c     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                pl.droidsonroids.relinker.d.a(r0, r1, r2, r3)     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                pl.droidsonroids.relinker.c$c r0 = r4.d     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                r0.success()     // Catch: pl.droidsonroids.relinker.MissingLibraryException -> L11 java.lang.UnsatisfiedLinkError -> L13
                return
            L11:
                r0 = move-exception
                goto L15
            L13:
                r0 = move-exception
                goto L1b
            L15:
                pl.droidsonroids.relinker.c$c r1 = r4.d
                r1.a(r0)
                goto L20
            L1b:
                pl.droidsonroids.relinker.c$c r1 = r4.d
                r1.a(r0)
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.io.FilenameFilter {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ pl.droidsonroids.relinker.d b;

        b(pl.droidsonroids.relinker.d r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = r0.a
                boolean r1 = r2.startsWith(r1)
                return r1
        }
    }

    protected d() {
            r2 = this;
            pl.droidsonroids.relinker.e r0 = new pl.droidsonroids.relinker.e
            r0.<init>()
            pl.droidsonroids.relinker.a r1 = new pl.droidsonroids.relinker.a
            r1.<init>()
            r2.<init>(r0, r1)
            return
    }

    protected d(pl.droidsonroids.relinker.c.b r2, pl.droidsonroids.relinker.c.a r3) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.a = r0
            if (r2 == 0) goto L1b
            if (r3 == 0) goto L13
            r1.b = r2
            r1.c = r3
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot pass null library installer"
            r2.<init>(r3)
            throw r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot pass null library loader"
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ void a(pl.droidsonroids.relinker.d r0, android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0.j(r1, r2, r3)
            return
    }

    private void j(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.util.Set<java.lang.String> r0 = r11.a
            boolean r0 = r0.contains(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            boolean r0 = r11.d
            if (r0 != 0) goto L18
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r1] = r13
            java.lang.String r13 = "%s already loaded previously!"
            r11.m(r13, r12)
            return
        L18:
            r3 = 2
            pl.droidsonroids.relinker.c$b r0 = r11.b     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r0.loadLibrary(r13)     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            java.util.Set<java.lang.String> r0 = r11.a     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r0.add(r13)     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r4[r1] = r13     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r4[r2] = r14     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r11.m(r0, r4)     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            return
        L2f:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r0
            java.lang.String r0 = "Loading the library normally failed: %s"
            r11.m(r0, r4)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r13
            r0[r2] = r14
            java.lang.String r4 = "%s (%s) was not loaded normally, re-linking..."
            r11.m(r4, r0)
            java.io.File r9 = r11.e(r12, r13, r14)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L5a
            boolean r0 = r11.d
            if (r0 == 0) goto L57
            goto L5a
        L57:
            r10 = r11
            r6 = r12
            goto L7f
        L5a:
            boolean r0 = r11.d
            if (r0 == 0) goto L69
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r13
            r0[r2] = r14
            java.lang.String r4 = "Forcing a re-link of %s (%s)..."
            r11.m(r4, r0)
        L69:
            r11.b(r12, r13, r14)
            pl.droidsonroids.relinker.c$a r5 = r11.c
            pl.droidsonroids.relinker.c$b r0 = r11.b
            java.lang.String[] r7 = r0.b()
            pl.droidsonroids.relinker.c$b r0 = r11.b
            java.lang.String r8 = r0.d(r13)
            r10 = r11
            r6 = r12
            r5.a(r6, r7, r8, r9, r10)
        L7f:
            boolean r12 = r10.e     // Catch: java.io.IOException -> Lb4
            if (r12 == 0) goto Lb4
            r12 = 0
            pl.droidsonroids.relinker.elf.f r4 = new pl.droidsonroids.relinker.elf.f     // Catch: java.lang.Throwable -> Lad
            r4.<init>(r9)     // Catch: java.lang.Throwable -> Lad
            java.util.List r12 = r4.c()     // Catch: java.lang.Throwable -> Laa
            r4.close()     // Catch: java.io.IOException -> Lb4
            java.util.Iterator r12 = r12.iterator()     // Catch: java.io.IOException -> Lb4
        L94:
            boolean r0 = r12.hasNext()     // Catch: java.io.IOException -> Lb4
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r12.next()     // Catch: java.io.IOException -> Lb4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> Lb4
            pl.droidsonroids.relinker.c$b r4 = r10.b     // Catch: java.io.IOException -> Lb4
            java.lang.String r0 = r4.a(r0)     // Catch: java.io.IOException -> Lb4
            r11.f(r6, r0)     // Catch: java.io.IOException -> Lb4
            goto L94
        Laa:
            r0 = move-exception
        Lab:
            r12 = r0
            goto Lb0
        Lad:
            r0 = move-exception
            r4 = r12
            goto Lab
        Lb0:
            r4.close()     // Catch: java.io.IOException -> Lb4
            throw r12     // Catch: java.io.IOException -> Lb4
        Lb4:
            pl.droidsonroids.relinker.c$b r12 = r10.b
            java.lang.String r0 = r9.getAbsolutePath()
            r12.c(r0)
            java.util.Set<java.lang.String> r12 = r10.a
            r12.add(r13)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r1] = r13
            r12[r2] = r14
            java.lang.String r13 = "%s (%s) was re-linked!"
            r11.m(r13, r12)
            return
    }

    protected void b(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            java.io.File r0 = r4.d(r5)
            java.io.File r5 = r4.e(r5, r6, r7)
            pl.droidsonroids.relinker.c$b r7 = r4.b
            java.lang.String r6 = r7.d(r6)
            pl.droidsonroids.relinker.d$b r7 = new pl.droidsonroids.relinker.d$b
            r7.<init>(r4, r6)
            java.io.File[] r6 = r0.listFiles(r7)
            if (r6 != 0) goto L1a
            goto L38
        L1a:
            int r7 = r6.length
            r0 = 0
        L1c:
            if (r0 >= r7) goto L38
            r1 = r6[r0]
            boolean r2 = r4.d
            if (r2 != 0) goto L32
            java.lang.String r2 = r1.getAbsolutePath()
            java.lang.String r3 = r5.getAbsolutePath()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
        L32:
            r1.delete()
        L35:
            int r0 = r0 + 1
            goto L1c
        L38:
            return
    }

    public pl.droidsonroids.relinker.d c() {
            r1 = this;
            r0 = 1
            r1.d = r0
            return r1
    }

    protected java.io.File d(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "lib"
            r1 = 0
            java.io.File r3 = r3.getDir(r0, r1)
            return r3
    }

    protected java.io.File e(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            pl.droidsonroids.relinker.c$b r0 = r2.b
            java.lang.String r4 = r0.d(r4)
            boolean r0 = pl.droidsonroids.relinker.f.a(r5)
            if (r0 == 0) goto L16
            java.io.File r5 = new java.io.File
            java.io.File r3 = r2.d(r3)
            r5.<init>(r3, r4)
            return r5
        L16:
            java.io.File r0 = new java.io.File
            java.io.File r3 = r2.d(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            return r0
    }

    public void f(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.h(r2, r3, r0, r0)
            return
    }

    public void g(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.h(r2, r3, r4, r0)
            return
    }

    public void h(android.content.Context r8, java.lang.String r9, java.lang.String r10, pl.droidsonroids.relinker.c.InterfaceC0091c r11) {
            r7 = this;
            if (r8 == 0) goto L34
            boolean r0 = pl.droidsonroids.relinker.f.a(r9)
            if (r0 != 0) goto L2c
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            java.lang.String r1 = "Beginning load of %s..."
            r7.m(r1, r0)
            if (r11 != 0) goto L19
            r7.j(r8, r9, r10)
            return
        L19:
            java.lang.Thread r0 = new java.lang.Thread
            pl.droidsonroids.relinker.d$a r1 = new pl.droidsonroids.relinker.d$a
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            r0.start()
            return
        L2c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Given library is either null or empty"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Given context is null"
            r8.<init>(r9)
            throw r8
    }

    public void i(android.content.Context r2, java.lang.String r3, pl.droidsonroids.relinker.c.InterfaceC0091c r4) {
            r1 = this;
            r0 = 0
            r1.h(r2, r3, r0, r4)
            return
    }

    public pl.droidsonroids.relinker.d k(pl.droidsonroids.relinker.c.d r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    public void l(java.lang.String r2) {
            r1 = this;
            pl.droidsonroids.relinker.c$d r0 = r1.f
            if (r0 == 0) goto L7
            r0.log(r2)
        L7:
            return
    }

    public void m(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            r1.l(r2)
            return
    }

    public pl.droidsonroids.relinker.d n() {
            r1 = this;
            r0 = 1
            r1.e = r0
            return r1
    }
}
