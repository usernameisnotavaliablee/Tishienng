package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g1 {
    protected final java.util.HashSet a;
    protected final ms.bz.bd.c.Pgl.e1.pblb b;
    protected final ms.bz.bd.c.Pgl.e1.pgla c;

    protected g1(ms.bz.bd.c.Pgl.e1.pblb r2, ms.bz.bd.c.Pgl.pbld r3) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.a = r0
            r1.b = r2
            r1.c = r3
            return
    }

    private void b(android.content.Context r18, java.lang.String r19, java.lang.String r20) {
            r17 = this;
            r5 = r17
            r1 = r18
            r6 = r19
            r7 = r20
            java.util.HashSet r0 = r5.a
            boolean r0 = r0.contains(r6)
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L1e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r6
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "%s already loaded previously!"
            java.lang.String.format(r1, r2, r0)
            return
        L1e:
            r10 = 2
            ms.bz.bd.c.Pgl.e1$pblb r0 = r5.b     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            ms.bz.bd.c.Pgl.s1 r0 = (ms.bz.bd.c.Pgl.s1) r0     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            r0.getClass()     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            com.bytedance.sdk.openadsdk.l.m.j(r6)     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            java.util.HashSet r0 = r5.a     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            r0.add(r6)     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            r2[r9] = r6     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            r2[r8] = r7     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            java.lang.String.format(r3, r0, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            return
        L3c:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r9] = r0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Loading the library normally failed: %s"
            java.lang.String.format(r0, r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r9] = r6
            r2[r8] = r7
            java.lang.String r3 = "%s (%s) was not loaded normally, re-linking..."
            java.lang.String.format(r0, r3, r2)
            ms.bz.bd.c.Pgl.e1$pblb r0 = r5.b
            ms.bz.bd.c.Pgl.s1 r0 = (ms.bz.bd.c.Pgl.s1) r0
            r0.getClass()
            java.lang.String r0 = "lib"
            boolean r2 = r6.startsWith(r0)
            java.lang.String r3 = ".so"
            if (r2 == 0) goto L70
            boolean r2 = r6.endsWith(r3)
            if (r2 == 0) goto L70
            r2 = r6
            goto L74
        L70:
            java.lang.String r2 = java.lang.System.mapLibraryName(r6)
        L74:
            java.lang.String r4 = "."
            if (r7 == 0) goto L9a
            int r11 = r7.length()
            if (r11 == 0) goto L9a
            java.io.File r11 = new java.io.File
            java.io.File r12 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1, r0, r9)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r4)
            r13.append(r7)
            java.lang.String r2 = r13.toString()
            r11.<init>(r12, r2)
            goto La3
        L9a:
            java.io.File r11 = new java.io.File
            java.io.File r12 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1, r0, r9)
            r11.<init>(r12, r2)
        La3:
            boolean r2 = r11.exists()
            if (r2 != 0) goto L163
            java.io.File r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1, r0, r9)
            ms.bz.bd.c.Pgl.e1$pblb r12 = r5.b
            ms.bz.bd.c.Pgl.s1 r12 = (ms.bz.bd.c.Pgl.s1) r12
            r12.getClass()
            boolean r12 = r6.startsWith(r0)
            if (r12 == 0) goto Lc2
            boolean r12 = r6.endsWith(r3)
            if (r12 == 0) goto Lc2
            r12 = r6
            goto Lc6
        Lc2:
            java.lang.String r12 = java.lang.System.mapLibraryName(r6)
        Lc6:
            if (r7 == 0) goto Lea
            int r13 = r7.length()
            if (r13 == 0) goto Lea
            java.io.File r13 = new java.io.File
            java.io.File r14 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1, r0, r9)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            r13.<init>(r14, r4)
            goto Lf3
        Lea:
            java.io.File r13 = new java.io.File
            java.io.File r4 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1, r0, r9)
            r13.<init>(r4, r12)
        Lf3:
            ms.bz.bd.c.Pgl.e1$pblb r4 = r5.b
            ms.bz.bd.c.Pgl.s1 r4 = (ms.bz.bd.c.Pgl.s1) r4
            r4.getClass()
            boolean r4 = r6.startsWith(r0)
            if (r4 == 0) goto L108
            boolean r4 = r6.endsWith(r3)
            if (r4 == 0) goto L108
            r4 = r6
            goto L10c
        L108:
            java.lang.String r4 = java.lang.System.mapLibraryName(r6)
        L10c:
            ms.bz.bd.c.Pgl.f1 r12 = new ms.bz.bd.c.Pgl.f1
            r12.<init>(r4)
            java.io.File[] r2 = r2.listFiles(r12)
            if (r2 == 0) goto L134
            int r4 = r2.length
            r12 = 0
        L119:
            if (r12 >= r4) goto L134
            r14 = r2[r12]
            java.lang.String r15 = r14.getAbsolutePath()
            r16 = 1
            java.lang.String r8 = r13.getAbsolutePath()
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L130
            r14.delete()
        L130:
            int r12 = r12 + 1
            r8 = 1
            goto L119
        L134:
            r16 = 1
            ms.bz.bd.c.Pgl.e1$pgla r2 = r5.c
            ms.bz.bd.c.Pgl.e1$pblb r4 = r5.b
            ms.bz.bd.c.Pgl.s1 r4 = (ms.bz.bd.c.Pgl.s1) r4
            java.lang.String[] r4 = r4.a()
            ms.bz.bd.c.Pgl.e1$pblb r8 = r5.b
            ms.bz.bd.c.Pgl.s1 r8 = (ms.bz.bd.c.Pgl.s1) r8
            r8.getClass()
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L155
            boolean r0 = r6.endsWith(r3)
            if (r0 == 0) goto L155
            r3 = r6
            goto L15a
        L155:
            java.lang.String r0 = java.lang.System.mapLibraryName(r6)
            r3 = r0
        L15a:
            r0 = r2
            ms.bz.bd.c.Pgl.pbld r0 = (ms.bz.bd.c.Pgl.pbld) r0
            r2 = r4
            r4 = r11
            r0.b(r1, r2, r3, r4, r5)
            goto L166
        L163:
            r4 = r11
            r16 = 1
        L166:
            ms.bz.bd.c.Pgl.e1$pblb r0 = r5.b
            java.lang.String r1 = r4.getAbsolutePath()
            ms.bz.bd.c.Pgl.s1 r0 = (ms.bz.bd.c.Pgl.s1) r0
            r0.getClass()
            java.lang.System.load(r1)
            java.util.HashSet r0 = r5.a
            r0.add(r6)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r6
            r0[r16] = r7
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "%s (%s) was re-linked!"
            java.lang.String.format(r1, r2, r0)
            return
    }

    public final void a(android.content.Context r5) {
            r4 = this;
            if (r5 == 0) goto L16
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "Pglbizssdk_ml"
            r0[r1] = r2
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = "Beginning load of %s..."
            java.lang.String.format(r1, r3, r0)
            r0 = 0
            r4.b(r5, r2, r0)
            return
        L16:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given context is null"
            r5.<init>(r0)
            throw r5
    }
}
