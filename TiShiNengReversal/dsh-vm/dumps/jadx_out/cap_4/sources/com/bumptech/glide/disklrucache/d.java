package com.bumptech.glide.disklrucache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class d {
    static final java.nio.charset.Charset a = null;
    static final java.nio.charset.Charset b = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bumptech.glide.disklrucache.d.a = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bumptech.glide.disklrucache.d.b = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(java.io.Closeable r0) {
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

    static void b(java.io.File r4) throws java.io.IOException {
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L36
            int r4 = r0.length
            r1 = 0
        L8:
            if (r1 >= r4) goto L35
            r2 = r0[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L15
            b(r2)
        L15:
            boolean r3 = r2.delete()
            if (r3 == 0) goto L1e
            int r1 = r1 + 1
            goto L8
        L1e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to delete file: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L35:
            return
        L36:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not a readable directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    static java.lang.String c(java.io.Reader r4) throws java.io.IOException {
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L15
        L9:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L15
            r3 = -1
            if (r2 == r3) goto L17
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L15
            goto L9
        L15:
            r0 = move-exception
            goto L1f
        L17:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15
            r4.close()
            return r0
        L1f:
            r4.close()
            throw r0
    }
}
