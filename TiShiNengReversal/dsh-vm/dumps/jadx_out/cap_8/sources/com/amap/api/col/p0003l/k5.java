package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k5 {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f3619b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f3620c = null;

    static {
            java.lang.String r0 = "SYmFja3Vwcw"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            com.amap.api.col.p0003l.k5.a = r0
            java.lang.String r0 = "SLmFkaXU"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            com.amap.api.col.p0003l.k5.f3619b = r0
            java.lang.String r0 = "JIw"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            com.amap.api.col.p0003l.k5.f3620c = r0
            return
    }

    public k5() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(android.content.Context r1) {
            java.io.File r0 = r1.getExternalCacheDir()     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto La
            java.io.File r0 = r1.getCacheDir()     // Catch: java.lang.Exception -> L11
        La:
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static synchronized void b(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.Class<com.amap.api.col.3l.k5> r0 = com.amap.api.col.p0003l.k5.class
            monitor-enter(r0)
            if (r3 == 0) goto Lb3
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)     // Catch: java.lang.Throwable -> L8f
            int r1 = r3.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L13
            goto Lb3
        L13:
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L8f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L1f
            monitor-exit(r0)
            return
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r1.<init>()     // Catch: java.lang.Throwable -> L8f
            r1.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = com.amap.api.col.p0003l.k5.f3620c     // Catch: java.lang.Throwable -> L8f
            r1.append(r4)     // Catch: java.lang.Throwable -> L8f
            r1.append(r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r5.<init>()     // Catch: java.lang.Throwable -> L8f
            r5.append(r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L8f
            r5.append(r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = com.amap.api.col.p0003l.k5.a     // Catch: java.lang.Throwable -> L8f
            r5.append(r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L8f
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L8f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L8f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = com.amap.api.col.p0003l.k5.f3619b     // Catch: java.lang.Throwable -> L8f
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            boolean r2 = r5.exists()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L65
            boolean r2 = r5.isDirectory()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L68
            goto L65
        L63:
            goto L9e
        L65:
            r5.mkdirs()     // Catch: java.lang.Throwable -> L63
        L68:
            r3.createNewFile()     // Catch: java.lang.Throwable -> L63
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "rws"
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L63
            java.nio.channels.FileChannel r3 = r5.getChannel()     // Catch: java.lang.Throwable -> L9b
            java.nio.channels.FileLock r1 = r3.tryLock()     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L89
            java.lang.String r2 = "UTF-8"
            byte[] r4 = r4.getBytes(r2)     // Catch: java.lang.Throwable -> L99
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch: java.lang.Throwable -> L99
            r3.write(r4)     // Catch: java.lang.Throwable -> L99
        L89:
            if (r1 == 0) goto L91
            r1.release()     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            goto L91
        L8f:
            r3 = move-exception
            goto Lb1
        L91:
            r3.close()     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L94
        L94:
            c(r5)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)
            return
        L99:
            goto La0
        L9b:
            r3 = r1
            goto La0
        L9e:
            r3 = r1
            r5 = r3
        La0:
            if (r1 == 0) goto La7
            r1.release()     // Catch: java.lang.Throwable -> L8f java.io.IOException -> La6
            goto La7
        La6:
        La7:
            if (r3 == 0) goto Lac
            r3.close()     // Catch: java.lang.Throwable -> L8f java.io.IOException -> Lac
        Lac:
            c(r5)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)
            return
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r3
        Lb3:
            monitor-exit(r0)
            return
    }

    private static void c(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }
}
