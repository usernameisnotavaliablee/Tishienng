package com.kwad.library.solder.lib.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(java.io.File r3, java.lang.String r4, java.io.File r5) {
            java.lang.String r0 = com.kwad.library.solder.lib.d.a.Az()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lib"
            r1.<init>(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L48
            java.io.File r3 = new java.io.File
            r3.<init>(r5, r4)
            boolean r4 = r1.renameTo(r3)
            if (r4 == 0) goto L40
            r1.getAbsolutePath()
            r3.getAbsolutePath()
            goto L49
        L40:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Rename soLib fail."
            r3.<init>(r4)
            throw r3
        L48:
            r3 = 0
        L49:
            return r3
    }

    public static java.util.Set<java.lang.String> b(java.io.File r9, java.io.File r10) {
            if (r9 == 0) goto L10b
            boolean r0 = r9.exists()
            if (r0 == 0) goto L10b
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 4
            r0.<init>(r1)
            com.kwad.sdk.utils.w.Y(r10)
            r10.getAbsolutePath()
            r9.getName()
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lda java.io.IOException -> Lde
            r2.<init>(r9)     // Catch: java.lang.Throwable -> Lda java.io.IOException -> Lde
            java.util.Enumeration r9 = r2.entries()     // Catch: java.lang.Throwable -> Ld3 java.io.IOException -> Ld6
            r3 = r1
        L22:
            boolean r4 = r9.hasMoreElements()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r4 == 0) goto Lc9
            java.lang.Object r4 = r9.nextElement()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r5 == 0) goto L22
            java.lang.String r6 = "../"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r6 != 0) goto L22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r7 = "lib"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r7 = java.io.File.separator     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r6.append(r7)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r6 == 0) goto L22
            boolean r6 = r4.isDirectory()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r6 == 0) goto L6c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r4.<init>(r10, r5)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            com.kwad.sdk.utils.w.Y(r4)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            goto L22
        L64:
            r9 = move-exception
            goto L101
        L67:
            r9 = move-exception
        L68:
            r7 = r1
        L69:
            r1 = r2
            goto Le1
        L6c:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r6.<init>(r10, r5)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            com.kwad.sdk.utils.w.Z(r6)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.io.FileDescriptor r3 = r7.getFD()     // Catch: java.lang.Throwable -> Lc3 java.io.IOException -> Lc6
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lc3 java.io.IOException -> Lc6
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Lc3 java.io.IOException -> Lc6
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc0
            java.io.InputStream r4 = r2.getInputStream(r4)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc0
            r7.<init>(r4)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc0
        L92:
            int r1 = r7.read(r5)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            r4 = -1
            if (r1 == r4) goto La7
            r4 = 0
            r8.write(r5, r4, r1)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            goto L92
        L9e:
            r9 = move-exception
            r1 = r7
        La0:
            r3 = r8
            goto L101
        La3:
            r9 = move-exception
        La4:
            r1 = r2
            r3 = r8
            goto Le1
        La7:
            r8.flush()     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            r3.sync()     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            com.kwad.sdk.crash.utils.b.closeQuietly(r7)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            com.kwad.sdk.crash.utils.b.closeQuietly(r8)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            r0.add(r1)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La3
            r1 = r7
            r3 = r8
            goto L22
        Lbe:
            r9 = move-exception
            goto La0
        Lc0:
            r9 = move-exception
            r7 = r1
            goto La4
        Lc3:
            r9 = move-exception
            r3 = r7
            goto L101
        Lc6:
            r9 = move-exception
            r3 = r7
            goto L68
        Lc9:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            com.kwad.sdk.crash.utils.b.closeQuietly(r3)
            com.kwad.sdk.crash.utils.b.closeQuietly(r2)
            return r0
        Ld3:
            r9 = move-exception
            r3 = r1
            goto L101
        Ld6:
            r9 = move-exception
            r3 = r1
            r7 = r3
            goto L69
        Lda:
            r9 = move-exception
            r2 = r1
            r3 = r2
            goto L101
        Lde:
            r9 = move-exception
            r3 = r1
            r7 = r3
        Le1:
            java.lang.String r10 = "plugin.so"
            com.kwad.library.solder.lib.a.e(r10, r9)     // Catch: java.lang.Throwable -> Lfe
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> Lfe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r2 = "Unzip soLibs fail:"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r2 = r9.getMessage()     // Catch: java.lang.Throwable -> Lfe
            r0.append(r2)     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lfe
            r10.<init>(r0, r9)     // Catch: java.lang.Throwable -> Lfe
            throw r10     // Catch: java.lang.Throwable -> Lfe
        Lfe:
            r9 = move-exception
            r2 = r1
            r1 = r7
        L101:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            com.kwad.sdk.crash.utils.b.closeQuietly(r3)
            com.kwad.sdk.crash.utils.b.closeQuietly(r2)
            throw r9
        L10b:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Apk file not found."
            r9.<init>(r10)
            throw r9
    }
}
