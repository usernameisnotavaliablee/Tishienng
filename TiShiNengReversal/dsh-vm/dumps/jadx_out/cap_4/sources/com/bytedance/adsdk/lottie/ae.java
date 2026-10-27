package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae {
    private static final byte[] cw = null;
    private static final java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m>> j = null;
    private static final java.util.Set<java.lang.Object> xt = null;








    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.adsdk.lottie.ae.j = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bytedance.adsdk.lottie.ae.xt = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [80, 75, 3, 4} // fill-array
            com.bytedance.adsdk.lottie.ae.cw = r0
            return
    }

    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> cw(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "asset_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.vl r2 = cw(r2, r3, r0)
            return r2
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> cw(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = ".zip"
            boolean r0 = r3.endsWith(r0)     // Catch: java.io.IOException -> L30
            if (r0 != 0) goto L1e
            java.lang.String r0 = ".lottie"
            boolean r0 = r3.endsWith(r0)     // Catch: java.io.IOException -> L30
            if (r0 == 0) goto L11
            goto L1e
        L11:
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.io.IOException -> L30
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.io.IOException -> L30
            com.bytedance.adsdk.lottie.vl r2 = xt(r2, r4)     // Catch: java.io.IOException -> L30
            return r2
        L1e:
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch: java.io.IOException -> L30
            android.content.res.AssetManager r1 = r2.getAssets()     // Catch: java.io.IOException -> L30
            java.io.InputStream r3 = r1.open(r3)     // Catch: java.io.IOException -> L30
            r0.<init>(r3)     // Catch: java.io.IOException -> L30
            com.bytedance.adsdk.lottie.vl r2 = j(r2, r0, r4)     // Catch: java.io.IOException -> L30
            return r2
        L30:
            r2 = move-exception
            com.bytedance.adsdk.lottie.vl r3 = new com.bytedance.adsdk.lottie.vl
            r3.<init>(r2)
            return r3
    }

    private static java.lang.String cw(android.content.Context r2, @com.bytedance.component.sdk.annotation.RawRes int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rawRes"
            r0.<init>(r1)
            boolean r2 = j(r2)
            if (r2 == 0) goto L10
            java.lang.String r2 = "_night_"
            goto L12
        L10:
            java.lang.String r2 = "_day_"
        L12:
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static com.bytedance.adsdk.lottie.g j(com.bytedance.adsdk.lottie.m r2, java.lang.String r3) {
            java.util.Map r2 = r2.i()
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            com.bytedance.adsdk.lottie.g r0 = (com.bytedance.adsdk.lottie.g) r0
            java.lang.String r1 = r0.vl()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc
            return r0
        L23:
            r2 = 0
            return r2
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(android.content.Context r1, @com.bytedance.component.sdk.annotation.RawRes int r2) {
            java.lang.String r0 = cw(r1, r2)
            com.bytedance.adsdk.lottie.jy r1 = j(r1, r2, r0)
            return r1
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(android.content.Context r2, @com.bytedance.component.sdk.annotation.RawRes int r3, java.lang.String r4) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.bytedance.adsdk.lottie.ae$5 r1 = new com.bytedance.adsdk.lottie.ae$5
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.adsdk.lottie.jy r2 = j(r4, r1)
            return r2
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "url_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.jy r2 = j(r2, r3, r0)
            return r2
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            com.bytedance.adsdk.lottie.ae$1 r0 = new com.bytedance.adsdk.lottie.ae$1
            r0.<init>(r1, r2, r3)
            com.bytedance.adsdk.lottie.jy r1 = j(r3, r0)
            return r1
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(java.io.InputStream r1, java.lang.String r2) {
            com.bytedance.adsdk.lottie.ae$6 r0 = new com.bytedance.adsdk.lottie.ae$6
            r0.<init>(r1, r2)
            com.bytedance.adsdk.lottie.jy r1 = j(r2, r0)
            return r1
    }

    private static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(java.lang.String r3, java.util.concurrent.Callable<com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m>> r4) {
            if (r3 != 0) goto L4
            r0 = 0
            goto Lc
        L4:
            com.bytedance.adsdk.lottie.model.up r0 = com.bytedance.adsdk.lottie.model.up.j()
            com.bytedance.adsdk.lottie.m r0 = r0.j(r3)
        Lc:
            if (r0 == 0) goto L19
            com.bytedance.adsdk.lottie.jy r3 = new com.bytedance.adsdk.lottie.jy
            com.bytedance.adsdk.lottie.ae$7 r4 = new com.bytedance.adsdk.lottie.ae$7
            r4.<init>(r0)
            r3.<init>(r4)
            return r3
        L19:
            if (r3 == 0) goto L2a
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m>> r0 = com.bytedance.adsdk.lottie.ae.j
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L2a
            java.lang.Object r3 = r0.get(r3)
            com.bytedance.adsdk.lottie.jy r3 = (com.bytedance.adsdk.lottie.jy) r3
            return r3
        L2a:
            com.bytedance.adsdk.lottie.jy r0 = new com.bytedance.adsdk.lottie.jy
            r0.<init>(r4)
            if (r3 == 0) goto L5c
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r4.<init>(r1)
            com.bytedance.adsdk.lottie.ae$2 r2 = new com.bytedance.adsdk.lottie.ae$2
            r2.<init>(r3, r4)
            r0.j(r2)
            com.bytedance.adsdk.lottie.ae$3 r2 = new com.bytedance.adsdk.lottie.ae$3
            r2.<init>(r3, r4)
            r0.cw(r2)
            boolean r4 = r4.get()
            if (r4 != 0) goto L5c
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m>> r4 = com.bytedance.adsdk.lottie.ae.j
            r4.put(r3, r0)
            int r3 = r4.size()
            r4 = 1
            if (r3 != r4) goto L5c
            xt(r1)
        L5c:
            return r0
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(android.content.Context r0, java.util.zip.ZipInputStream r1, java.lang.String r2) {
            com.bytedance.adsdk.lottie.vl r0 = xt(r0, r1, r2)     // Catch: java.lang.Throwable -> L8
            com.bytedance.adsdk.lottie.up.g.j(r1)
            return r0
        L8:
            r0 = move-exception
            com.bytedance.adsdk.lottie.up.g.j(r1)
            throw r0
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(android.util.JsonReader r1, java.lang.String r2) {
            r0 = 1
            com.bytedance.adsdk.lottie.vl r1 = j(r1, r2, r0)
            return r1
    }

    private static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(android.util.JsonReader r2, java.lang.String r3, boolean r4) {
            com.bytedance.adsdk.lottie.m r0 = com.bytedance.adsdk.lottie.r.v.j(r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            com.bytedance.adsdk.lottie.model.up r1 = com.bytedance.adsdk.lottie.model.up.j()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r1.j(r3, r0)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            com.bytedance.adsdk.lottie.vl r3 = new com.bytedance.adsdk.lottie.vl     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            if (r4 == 0) goto L15
            j(r2)
        L15:
            return r3
        L16:
            r3 = move-exception
            goto L24
        L18:
            r3 = move-exception
            com.bytedance.adsdk.lottie.vl r0 = new com.bytedance.adsdk.lottie.vl     // Catch: java.lang.Throwable -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L23
            j(r2)
        L23:
            return r0
        L24:
            if (r4 == 0) goto L29
            j(r2)
        L29:
            throw r3
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> j(java.io.InputStream r2, java.lang.String r3, boolean r4) {
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.lang.Throwable -> L14
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            com.bytedance.adsdk.lottie.vl r3 = j(r0, r3)     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L13
            com.bytedance.adsdk.lottie.up.g.j(r2)
        L13:
            return r3
        L14:
            r3 = move-exception
            if (r4 == 0) goto L1a
            com.bytedance.adsdk.lottie.up.g.j(r2)
        L1a:
            throw r3
    }

    static /* synthetic */ java.util.Map j() {
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m>> r0 = com.bytedance.adsdk.lottie.ae.j
            return r0
    }

    public static void j(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Exception -> L5 java.lang.RuntimeException -> L6
        L5:
            return
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    static /* synthetic */ void j(boolean r0) {
            xt(r0)
            return
    }

    private static boolean j(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r0 = 32
            if (r1 != r0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> xt(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "asset_"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.jy r2 = xt(r2, r3, r0)
            return r2
    }

    public static com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> xt(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.bytedance.adsdk.lottie.ae$4 r0 = new com.bytedance.adsdk.lottie.ae$4
            r0.<init>(r1, r2, r3)
            com.bytedance.adsdk.lottie.jy r1 = j(r3, r0)
            return r1
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> xt(android.content.Context r1, @com.bytedance.component.sdk.annotation.RawRes int r2) {
            java.lang.String r0 = cw(r1, r2)
            com.bytedance.adsdk.lottie.vl r1 = xt(r1, r2, r0)
            return r1
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> xt(android.content.Context r0, @com.bytedance.component.sdk.annotation.RawRes int r1, java.lang.String r2) {
            android.content.res.Resources r2 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L11
            java.io.InputStream r2 = r2.openRawResource(r1)     // Catch: android.content.res.Resources.NotFoundException -> L11
            java.lang.String r0 = cw(r0, r1)     // Catch: android.content.res.Resources.NotFoundException -> L11
            com.bytedance.adsdk.lottie.vl r0 = xt(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L11
            return r0
        L11:
            r0 = move-exception
            com.bytedance.adsdk.lottie.vl r1 = new com.bytedance.adsdk.lottie.vl
            r1.<init>(r0)
            return r1
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> xt(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch: java.io.IOException -> L2bb
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L156
            java.lang.String r7 = r2.getName()     // Catch: java.io.IOException -> L2bb
            java.lang.String r8 = "__MACOSX"
            boolean r8 = r7.contains(r8)     // Catch: java.io.IOException -> L2bb
            if (r8 == 0) goto L25
            r13.closeEntry()     // Catch: java.io.IOException -> L2bb
            goto L150
        L25:
            java.lang.String r8 = r2.getName()     // Catch: java.io.IOException -> L2bb
            java.lang.String r9 = "manifest.json"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch: java.io.IOException -> L2bb
            if (r8 == 0) goto L36
            r13.closeEntry()     // Catch: java.io.IOException -> L2bb
            goto L150
        L36:
            java.lang.String r2 = r2.getName()     // Catch: java.io.IOException -> L2bb
            java.lang.String r8 = ".json"
            boolean r2 = r2.endsWith(r8)     // Catch: java.io.IOException -> L2bb
            if (r2 == 0) goto L59
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch: java.io.IOException -> L2bb
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L2bb
            r4.<init>(r13)     // Catch: java.io.IOException -> L2bb
            r2.<init>(r4)     // Catch: java.io.IOException -> L2bb
            com.bytedance.adsdk.lottie.vl r2 = j(r2, r3, r6)     // Catch: java.io.IOException -> L2bb
            java.lang.Object r2 = r2.j()     // Catch: java.io.IOException -> L2bb
            com.bytedance.adsdk.lottie.m r2 = (com.bytedance.adsdk.lottie.m) r2     // Catch: java.io.IOException -> L2bb
            r4 = r2
            goto L150
        L59:
            java.lang.String r2 = ".png"
            boolean r2 = r7.endsWith(r2)     // Catch: java.io.IOException -> L2bb
            java.lang.String r8 = "/"
            java.lang.String r9 = "../"
            if (r2 != 0) goto L132
            java.lang.String r2 = ".webp"
            boolean r2 = r7.endsWith(r2)     // Catch: java.io.IOException -> L2bb
            if (r2 != 0) goto L132
            java.lang.String r2 = ".jpg"
            boolean r2 = r7.endsWith(r2)     // Catch: java.io.IOException -> L2bb
            if (r2 != 0) goto L132
            java.lang.String r2 = ".jpeg"
            boolean r2 = r7.endsWith(r2)     // Catch: java.io.IOException -> L2bb
            if (r2 == 0) goto L7f
            goto L132
        L7f:
            java.lang.String r2 = ".ttf"
            boolean r2 = r7.endsWith(r2)     // Catch: java.io.IOException -> L2bb
            if (r2 != 0) goto L95
            java.lang.String r2 = ".otf"
            boolean r2 = r7.endsWith(r2)     // Catch: java.io.IOException -> L2bb
            if (r2 == 0) goto L90
            goto L95
        L90:
            r13.closeEntry()     // Catch: java.io.IOException -> L2bb
            goto L150
        L95:
            boolean r2 = r7.contains(r9)     // Catch: java.io.IOException -> L2bb
            if (r2 == 0) goto La4
            r13.closeEntry()     // Catch: java.io.IOException -> L2bb
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch: java.io.IOException -> L2bb
            goto L10
        La4:
            java.lang.String[] r2 = r7.split(r8)     // Catch: java.io.IOException -> L2bb
            int r7 = r2.length     // Catch: java.io.IOException -> L2bb
            int r7 = r7 - r5
            r2 = r2[r7]     // Catch: java.io.IOException -> L2bb
            java.lang.String r5 = "\\."
            java.lang.String[] r5 = r2.split(r5)     // Catch: java.io.IOException -> L2bb
            r5 = r5[r6]     // Catch: java.io.IOException -> L2bb
            java.io.File r7 = new java.io.File     // Catch: java.io.IOException -> L2bb
            java.io.File r8 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r12)     // Catch: java.io.IOException -> L2bb
            r7.<init>(r8, r2)     // Catch: java.io.IOException -> L2bb
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2bb
            r8.<init>(r7)     // Catch: java.io.IOException -> L2bb
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ldf
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Ldf
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> Ld6
        Lcb:
            int r10 = r13.read(r9)     // Catch: java.lang.Throwable -> Ld6
            r11 = -1
            if (r10 == r11) goto Ld8
            r8.write(r9, r6, r10)     // Catch: java.lang.Throwable -> Ld6
            goto Lcb
        Ld6:
            r6 = move-exception
            goto Le1
        Ld8:
            r8.flush()     // Catch: java.lang.Throwable -> Ld6
            r8.close()     // Catch: java.lang.Throwable -> Ldf
            goto L10a
        Ldf:
            r6 = move-exception
            goto Lec
        Le1:
            throw r6     // Catch: java.lang.Throwable -> Le2
        Le2:
            r9 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r8 = move-exception
            r6.addSuppressed(r8)     // Catch: java.lang.Throwable -> Ldf
        Leb:
            throw r9     // Catch: java.lang.Throwable -> Ldf
        Lec:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2bb
            java.lang.String r9 = "Unable to save font "
            r8.<init>(r9)     // Catch: java.io.IOException -> L2bb
            r8.append(r5)     // Catch: java.io.IOException -> L2bb
            java.lang.String r9 = " to the temporary file: "
            r8.append(r9)     // Catch: java.io.IOException -> L2bb
            r8.append(r2)     // Catch: java.io.IOException -> L2bb
            java.lang.String r2 = ". "
            r8.append(r2)     // Catch: java.io.IOException -> L2bb
            java.lang.String r2 = r8.toString()     // Catch: java.io.IOException -> L2bb
            com.bytedance.adsdk.lottie.up.up.j(r2, r6)     // Catch: java.io.IOException -> L2bb
        L10a:
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r7)     // Catch: java.io.IOException -> L2bb
            boolean r6 = r7.delete()     // Catch: java.io.IOException -> L2bb
            if (r6 != 0) goto L12e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2bb
            java.lang.String r8 = "Failed to delete temp font file "
            r6.<init>(r8)     // Catch: java.io.IOException -> L2bb
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.io.IOException -> L2bb
            r6.append(r7)     // Catch: java.io.IOException -> L2bb
            java.lang.String r7 = "."
            r6.append(r7)     // Catch: java.io.IOException -> L2bb
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L2bb
            com.bytedance.adsdk.lottie.up.up.xt(r6)     // Catch: java.io.IOException -> L2bb
        L12e:
            r1.put(r5, r2)     // Catch: java.io.IOException -> L2bb
            goto L150
        L132:
            boolean r2 = r7.contains(r9)     // Catch: java.io.IOException -> L2bb
            if (r2 == 0) goto L141
            r13.closeEntry()     // Catch: java.io.IOException -> L2bb
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch: java.io.IOException -> L2bb
            goto L10
        L141:
            java.lang.String[] r2 = r7.split(r8)     // Catch: java.io.IOException -> L2bb
            int r6 = r2.length     // Catch: java.io.IOException -> L2bb
            int r6 = r6 - r5
            r2 = r2[r6]     // Catch: java.io.IOException -> L2bb
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r13)     // Catch: java.io.IOException -> L2bb
            r0.put(r2, r5)     // Catch: java.io.IOException -> L2bb
        L150:
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch: java.io.IOException -> L2bb
            goto L10
        L156:
            if (r4 != 0) goto L165
            com.bytedance.adsdk.lottie.vl r12 = new com.bytedance.adsdk.lottie.vl
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Unable to parse composition"
            r13.<init>(r14)
            r12.<init>(r13)
            return r12
        L165:
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L16d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L19b
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r2 = r13.getKey()
            java.lang.String r2 = (java.lang.String) r2
            com.bytedance.adsdk.lottie.g r2 = j(r4, r2)
            if (r2 == 0) goto L16d
            java.lang.Object r13 = r13.getValue()
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            int r7 = r2.j()
            int r8 = r2.xt()
            android.graphics.Bitmap r13 = com.bytedance.adsdk.lottie.up.g.j(r13, r7, r8)
            r2.j(r13)
            goto L16d
        L19b:
            java.util.Set r12 = r1.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L1a3:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L200
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.util.Map r1 = r4.av()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L1bc:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L1e1
            java.lang.Object r7 = r1.next()
            com.bytedance.adsdk.lottie.model.cw r7 = (com.bytedance.adsdk.lottie.model.cw) r7
            java.lang.String r8 = r7.j()
            java.lang.Object r9 = r13.getKey()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L1bc
            java.lang.Object r2 = r13.getValue()
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            r7.j(r2)
            r2 = 1
            goto L1bc
        L1e1:
            if (r2 != 0) goto L1a3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parsed font for "
            r1.<init>(r2)
            java.lang.Object r13 = r13.getKey()
            java.lang.String r13 = (java.lang.String) r13
            r1.append(r13)
            java.lang.String r13 = " however it was not found in the animation."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r13)
            goto L1a3
        L200:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L265
            java.util.Map r12 = r4.i()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L212:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L265
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            com.bytedance.adsdk.lottie.g r13 = (com.bytedance.adsdk.lottie.g) r13
            if (r13 != 0) goto L227
            return r3
        L227:
            java.lang.String r0 = r13.vl()
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inScaled = r5
            r2 = 160(0xa0, float:2.24E-43)
            r1.inDensity = r2
            java.lang.String r2 = "data:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L212
            java.lang.String r2 = "base64,"
            int r2 = r0.indexOf(r2)
            if (r2 <= 0) goto L212
            r2 = 44
            int r2 = r0.indexOf(r2)     // Catch: java.lang.IllegalArgumentException -> L25e
            int r2 = r2 + r5
            java.lang.String r0 = r0.substring(r2)     // Catch: java.lang.IllegalArgumentException -> L25e
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L25e
            int r2 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r6, r2, r1)
            r13.j(r0)
            goto L212
        L25e:
            r12 = move-exception
            java.lang.String r13 = "data URL did not have correct base64 format."
            com.bytedance.adsdk.lottie.up.up.j(r13, r12)
            return r3
        L265:
            java.util.Map r12 = r4.i()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L271:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2ac
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r0 = r13.getValue()
            com.bytedance.adsdk.lottie.g r0 = (com.bytedance.adsdk.lottie.g) r0
            android.graphics.Bitmap r0 = r0.ws()
            if (r0 != 0) goto L271
            com.bytedance.adsdk.lottie.vl r12 = new com.bytedance.adsdk.lottie.vl
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "There is no image for "
            r0.<init>(r1)
            java.lang.Object r13 = r13.getValue()
            com.bytedance.adsdk.lottie.g r13 = (com.bytedance.adsdk.lottie.g) r13
            java.lang.String r13 = r13.vl()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            r12.<init>(r14)
            return r12
        L2ac:
            if (r14 == 0) goto L2b5
            com.bytedance.adsdk.lottie.model.up r12 = com.bytedance.adsdk.lottie.model.up.j()
            r12.j(r14, r4)
        L2b5:
            com.bytedance.adsdk.lottie.vl r12 = new com.bytedance.adsdk.lottie.vl
            r12.<init>(r4)
            return r12
        L2bb:
            r12 = move-exception
            com.bytedance.adsdk.lottie.vl r13 = new com.bytedance.adsdk.lottie.vl
            r13.<init>(r12)
            return r13
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    public static com.bytedance.adsdk.lottie.vl<com.bytedance.adsdk.lottie.m> xt(java.io.InputStream r1, java.lang.String r2) {
            r0 = 1
            com.bytedance.adsdk.lottie.vl r1 = j(r1, r2, r0)
            return r1
    }

    private static void xt(boolean r2) {
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set<java.lang.Object> r0 = com.bytedance.adsdk.lottie.ae.xt
            r2.<init>(r0)
            r0 = 0
        L8:
            int r1 = r2.size()
            if (r0 >= r1) goto L14
            r2.get(r0)
            int r0 = r0 + 1
            goto L8
        L14:
            return
    }
}
