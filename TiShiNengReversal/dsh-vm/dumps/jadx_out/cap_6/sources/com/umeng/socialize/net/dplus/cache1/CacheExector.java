package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CacheExector {
    private static final java.lang.String a = "CacheExector";
    private final int b;
    private final int c;
    private final int d;
    private java.lang.String e;


    static {
            return
    }

    public CacheExector(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 32
            r1.b = r0
            r0 = 5120(0x1400, float:7.175E-42)
            r1.c = r0
            r0 = 8
            r1.d = r0
            r1.e = r2
            return
    }

    private double a(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            r4 = 0
            return r4
        L9:
            double r4 = (double) r4
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r4 = r4 / r0
            return r4
    }

    private <T extends com.umeng.socialize.net.dplus.cache1.IReader> T a(java.lang.String r5, java.lang.Class<T> r6) {
            r4 = this;
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L17
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Constructor r6 = r6.getConstructor(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L17
            r0[r3] = r5     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = r6.newInstance(r0)     // Catch: java.lang.Throwable -> L17
            com.umeng.socialize.net.dplus.cache1.IReader r5 = (com.umeng.socialize.net.dplus.cache1.IReader) r5     // Catch: java.lang.Throwable -> L17
            return r5
        L17:
            r5 = move-exception
            java.lang.String r6 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r6, r5)
            r5 = 0
            return r5
    }

    private java.io.File a() {
            r3 = this;
            java.lang.String r0 = r3.e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r3.e
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L1e
            boolean r2 = r0.mkdirs()
            if (r2 != 0) goto L1e
            return r1
        L1e:
            return r0
    }

    private java.io.File a(java.io.File r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L13
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L9
            goto L13
        L9:
            java.lang.String r3 = r1.a(r3)
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            return r0
        L13:
            r2 = 0
            return r2
    }

    private java.lang.String a(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void a(java.io.Closeable r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            r2.close()     // Catch: java.lang.Exception -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
        Lc:
            return
    }

    private java.io.File[] a(java.io.File r2) {
            r1 = this;
            if (r2 == 0) goto L15
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L9
            goto L15
        L9:
            java.io.File[] r2 = r2.listFiles()
            java.util.Comparator r0 = r1.b()
            java.util.Arrays.sort(r2, r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    private java.io.File b(java.io.File r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L24
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L9
            goto L24
        L9:
            java.lang.String[] r0 = r2.list()
            if (r0 == 0) goto L1f
            int r0 = r0.length
            if (r0 > 0) goto L13
            goto L1f
        L13:
            java.io.File r0 = r1.c(r2, r3)
            if (r0 != 0) goto L1e
            java.io.File r2 = r1.a(r2, r3)
            return r2
        L1e:
            return r0
        L1f:
            java.io.File r2 = r1.a(r2, r3)
            return r2
        L24:
            r2 = 0
            return r2
    }

    private java.util.Comparator<java.io.File> b() {
            r1 = this;
            com.umeng.socialize.net.dplus.cache1.CacheExector$1 r0 = new com.umeng.socialize.net.dplus.cache1.CacheExector$1
            r0.<init>(r1)
            return r0
    }

    private java.io.File c(java.io.File r6, java.lang.String r7) {
            r5 = this;
            java.io.File[] r6 = r5.a(r6)
            r7 = 0
            if (r6 == 0) goto L21
            int r0 = r6.length
            if (r0 > 0) goto Lb
            goto L21
        Lb:
            int r0 = r6.length
            if (r0 <= 0) goto L21
            r0 = 0
            r6 = r6[r0]
            long r0 = r6.length()
            double r0 = r5.a(r0)
            r2 = 4629700416936869888(0x4040000000000000, double:32.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L20
            return r7
        L20:
            return r6
        L21:
            return r7
    }

    private java.io.File d(java.io.File r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L19
            boolean r1 = r3.isDirectory()
            if (r1 != 0) goto La
            goto L19
        La:
            java.lang.String[] r1 = r3.list()
            if (r1 == 0) goto L19
            int r1 = r1.length
            if (r1 > 0) goto L14
            goto L19
        L14:
            java.io.File r3 = r2.e(r3, r4)
            return r3
        L19:
            return r0
    }

    private java.io.File e(java.io.File r9, java.lang.String r10) {
            r8 = this;
            java.io.File[] r9 = r8.a(r9)
            r0 = 0
            if (r9 == 0) goto L38
            int r1 = r9.length
            if (r1 > 0) goto Lb
            goto L38
        Lb:
            r1 = 0
        Lc:
            int r2 = r9.length
            if (r1 >= r2) goto L38
            r2 = r9[r1]
            long r3 = r2.length()
            double r3 = r8.a(r3)
            r5 = 40
            double r5 = (double) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L2b
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.endsWith(r10)
            if (r3 == 0) goto L2b
            return r2
        L2b:
            r2.length()
            java.lang.String r2 = r2.getName()
            r8.deleteFile(r2)
            int r1 = r1 + 1
            goto Lc
        L38:
            return r0
    }

    public double checkSize(java.lang.String r7) {
            r6 = this;
            java.io.File r0 = r6.a()
            r1 = 0
            if (r0 == 0) goto L33
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto Lf
            goto L33
        Lf:
            java.io.File[] r0 = r0.listFiles()
            r3 = 0
        L14:
            int r4 = r0.length
            if (r3 >= r4) goto L33
            r4 = r0[r3]
            if (r4 == 0) goto L30
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L30
            r4 = r0[r3]
            long r4 = r4.length()
            double r4 = r6.a(r4)
            double r1 = r1 + r4
        L30:
            int r3 = r3 + 1
            goto L14
        L33:
            return r1
    }

    public boolean deleteFile(java.lang.String r5) {
            r4 = this;
            java.io.File r0 = r4.a()
            java.io.File[] r0 = r0.listFiles()
            r1 = 0
            r2 = 0
        La:
            int r3 = r0.length
            if (r1 >= r3) goto L24
            r3 = r0[r1]
            if (r3 == 0) goto L21
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L21
            r2 = r0[r1]
            boolean r2 = r2.delete()
        L21:
            int r1 = r1 + 1
            goto La
        L24:
            return r2
    }

    public <T extends com.umeng.socialize.net.dplus.cache1.IReader> T readFile(java.lang.String r7, java.lang.Class<T> r8) {
            r6 = this;
            java.io.File r0 = r6.a()
            java.io.File r7 = r6.d(r0, r7)
            r0 = 0
            if (r7 != 0) goto Lc
            return r0
        Lc:
            com.umeng.socialize.net.dplus.cache1.AtomicFile r1 = new com.umeng.socialize.net.dplus.cache1.AtomicFile
            r1.<init>(r7)
            java.io.FileInputStream r1 = r1.openRead()     // Catch: java.io.IOException -> L16
            goto L24
        L16:
            r1 = move-exception
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r2, r1)
            java.lang.String r1 = r7.getName()
            r6.deleteFile(r1)
            r1 = r0
        L24:
            if (r1 != 0) goto L27
            return r0
        L27:
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            com.umeng.socialize.net.dplus.cache1.IReader r7 = r6.a(r7, r8)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
        L3e:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
            if (r4 == 0) goto L5a
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
            if (r5 != 0) goto L3e
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            goto L3e
        L4e:
            r7 = move-exception
        L4f:
            r0 = r8
            goto L88
        L51:
            r4 = move-exception
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
            com.umeng.socialize.utils.SLog.error(r5, r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
            goto L3e
        L58:
            r7 = move-exception
            goto L79
        L5a:
            if (r7 == 0) goto L63
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
            r7.create(r3)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L58
        L63:
            r6.a(r1)
            r6.a(r8)
            r6.a(r2)
            return r7
        L6d:
            r7 = move-exception
            r2 = r0
            goto L4f
        L70:
            r7 = move-exception
            r2 = r0
            goto L79
        L73:
            r7 = move-exception
            r2 = r0
            goto L88
        L76:
            r7 = move-exception
            r8 = r0
            r2 = r8
        L79:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE     // Catch: java.lang.Throwable -> L4e
            com.umeng.socialize.utils.SLog.error(r3, r7)     // Catch: java.lang.Throwable -> L4e
            r6.a(r1)
            r6.a(r8)
            r6.a(r2)
            return r0
        L88:
            r6.a(r1)
            r6.a(r0)
            r6.a(r2)
            throw r7
    }

    public boolean save(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.io.File r0 = r6.a()
            java.io.File r8 = r6.b(r0, r8)
            r0 = 0
            if (r8 != 0) goto Lc
            return r0
        Lc:
            com.umeng.socialize.net.dplus.cache1.AtomicFile r1 = new com.umeng.socialize.net.dplus.cache1.AtomicFile
            r1.<init>(r8)
            r2 = 1
            r3 = 0
            java.io.FileOutputStream r8 = r1.startWrite(r2)     // Catch: java.io.IOException -> L18
            goto L26
        L18:
            r4 = move-exception
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r5, r4)
            java.lang.String r8 = r8.getName()
            r6.deleteFile(r8)
            r8 = r3
        L26:
            if (r8 != 0) goto L29
            return r0
        L29:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            if (r4 != 0) goto L58
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r5.write(r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r5.newLine()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r5.flush()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r1.finishWrite(r8)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r3 = r5
            r0 = 1
            goto L59
        L48:
            r7 = move-exception
            r3 = r5
            goto L6d
        L4b:
            r7 = move-exception
            r3 = r5
            goto L63
        L4e:
            r7 = move-exception
            goto L6d
        L50:
            r7 = move-exception
            goto L63
        L52:
            r7 = move-exception
            r4 = r3
            goto L6d
        L55:
            r7 = move-exception
            r4 = r3
            goto L63
        L58:
            r4 = r3
        L59:
            r6.a(r3)
            r6.a(r4)
            r6.a(r8)
            goto L6c
        L63:
            r1.failWrite(r8)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE     // Catch: java.lang.Throwable -> L4e
            com.umeng.socialize.utils.SLog.error(r1, r7)     // Catch: java.lang.Throwable -> L4e
            goto L59
        L6c:
            return r0
        L6d:
            r6.a(r3)
            r6.a(r4)
            r6.a(r8)
            throw r7
    }
}
