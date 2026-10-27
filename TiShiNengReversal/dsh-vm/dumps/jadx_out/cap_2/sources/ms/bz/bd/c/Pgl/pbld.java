package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbld implements ms.bz.bd.c.Pgl.e1.pgla {

    private static class pgla {
        public java.util.zip.ZipFile a;
        public java.util.zip.ZipEntry b;

        public pgla(java.util.zip.ZipFile r1, java.util.zip.ZipEntry r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    public pbld() {
            r0 = this;
            r0.<init>()
            return
    }

    private static ms.bz.bd.c.Pgl.pbld.pgla a(android.content.Context r16, java.lang.String[] r17, java.lang.String r18, ms.bz.bd.c.Pgl.g1 r19) {
            r0 = r17
            android.content.pm.ApplicationInfo r1 = r16.getApplicationInfo()
            java.lang.String[] r2 = r1.splitSourceDirs
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            int r5 = r2.length
            if (r5 == 0) goto L1c
            int r5 = r2.length
            int r5 = r5 + r4
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r1 = r1.sourceDir
            r5[r3] = r1
            int r1 = r2.length
            java.lang.System.arraycopy(r2, r3, r5, r4, r1)
            goto L22
        L1c:
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r1 = r1.sourceDir
            r5[r3] = r1
        L22:
            int r1 = r5.length
            r2 = 0
        L24:
            r6 = 0
            if (r2 >= r1) goto L97
            r7 = r5[r2]
            r8 = 0
        L2a:
            int r9 = r8 + 1
            r10 = 5
            if (r8 >= r10) goto L3e
            java.util.zip.ZipFile r8 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L3b
            java.io.File r11 = new java.io.File     // Catch: java.io.IOException -> L3b
            r11.<init>(r7)     // Catch: java.io.IOException -> L3b
            r8.<init>(r11, r4)     // Catch: java.io.IOException -> L3b
            r6 = r8
            goto L3e
        L3b:
            r8 = r9
            goto L2a
        L3e:
            if (r6 == 0) goto L91
            r8 = 0
        L41:
            int r9 = r8 + 1
            if (r8 >= r10) goto L8b
            int r8 = r0.length
            r11 = 0
        L47:
            if (r11 >= r8) goto L87
            r12 = r0[r11]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "lib"
            r13.<init>(r14)
            char r14 = java.io.File.separatorChar
            r13.append(r14)
            r13.append(r12)
            r13.append(r14)
            r12 = r18
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r3] = r13
            r14[r4] = r7
            r19.getClass()
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r3 = "Looking for %s in APK %s..."
            java.lang.String.format(r15, r3, r14)
            java.util.zip.ZipEntry r3 = r6.getEntry(r13)
            if (r3 == 0) goto L83
            ms.bz.bd.c.Pgl.pbld$pgla r0 = new ms.bz.bd.c.Pgl.pbld$pgla
            r0.<init>(r6, r3)
            return r0
        L83:
            int r11 = r11 + 1
            r3 = 0
            goto L47
        L87:
            r12 = r18
            r8 = r9
            goto L41
        L8b:
            r12 = r18
            r6.close()     // Catch: java.io.IOException -> L93
            goto L93
        L91:
            r12 = r18
        L93:
            int r2 = r2 + 1
            r3 = 0
            goto L24
        L97:
            return r6
    }

    private static void c(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    private static java.lang.String[] d(android.content.Context r8, java.lang.String r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lib"
            r0.<init>(r1)
            char r1 = java.io.File.separatorChar
            r0.append(r1)
            java.lang.String r2 = "([^\\"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "]*)"
            r0.append(r2)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()
            java.lang.String[] r1 = r8.splitSourceDirs
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L46
            int r4 = r1.length
            if (r4 == 0) goto L46
            int r4 = r1.length
            int r4 = r4 + r3
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r8 = r8.sourceDir
            r4[r2] = r8
            int r8 = r1.length
            java.lang.System.arraycopy(r1, r2, r4, r3, r8)
            goto L4c
        L46:
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r8 = r8.sourceDir
            r4[r2] = r8
        L4c:
            int r8 = r4.length
            r1 = 0
        L4e:
            if (r2 >= r8) goto L86
            r5 = r4[r2]
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L83
            java.io.File r7 = new java.io.File     // Catch: java.io.IOException -> L83
            r7.<init>(r5)     // Catch: java.io.IOException -> L83
            r6.<init>(r7, r3)     // Catch: java.io.IOException -> L83
            java.util.Enumeration r1 = r6.entries()
        L60:
            boolean r5 = r1.hasMoreElements()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r1.nextElement()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            java.lang.String r5 = r5.getName()
            java.util.regex.Matcher r5 = r9.matcher(r5)
            boolean r7 = r5.matches()
            if (r7 == 0) goto L60
            java.lang.String r5 = r5.group(r3)
            r0.add(r5)
            goto L60
        L82:
            r1 = r6
        L83:
            int r2 = r2 + 1
            goto L4e
        L86:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L8b
        L8b:
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public final void b(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, ms.bz.bd.c.Pgl.g1 r15) {
            r10 = this;
            r0 = 0
            ms.bz.bd.c.Pgl.pbld$pgla r1 = a(r11, r12, r13, r15)     // Catch: java.lang.Throwable -> Lba
            if (r1 == 0) goto La6
            r11 = 0
            r12 = 0
        L9:
            int r2 = r12 + 1
            r3 = 5
            if (r12 >= r3) goto L9b
            java.lang.String r12 = "Found %s! Extracting..."
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2a
            r4[r11] = r13     // Catch: java.lang.Throwable -> L2a
            r15.getClass()     // Catch: java.lang.Throwable -> L2a
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L2a
            java.lang.String.format(r5, r12, r4)     // Catch: java.lang.Throwable -> L2a
            boolean r12 = r14.exists()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2e
            if (r12 != 0) goto L31
            boolean r12 = r14.createNewFile()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2e
            if (r12 == 0) goto L98
            goto L31
        L2a:
            r11 = move-exception
            r0 = r1
            goto Lbb
        L2e:
            goto L98
        L31:
            java.util.zip.ZipFile r12 = r1.a     // Catch: java.lang.Throwable -> L87 java.lang.Throwable -> L90
            java.util.zip.ZipEntry r4 = r1.b     // Catch: java.lang.Throwable -> L87 java.lang.Throwable -> L90
            java.io.InputStream r12 = r12.getInputStream(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Throwable -> L90
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L91
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L85 java.lang.Throwable -> L91
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92
            r6 = 0
        L44:
            int r8 = r12.read(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92
            r9 = -1
            if (r8 != r9) goto L7d
            r4.flush()     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92
            java.io.FileDescriptor r5 = r4.getFD()     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92
            r5.sync()     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92
            long r8 = r14.length()     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L64
            c(r12)     // Catch: java.lang.Throwable -> L2a
            c(r4)     // Catch: java.lang.Throwable -> L2a
            goto L98
        L64:
            c(r12)     // Catch: java.lang.Throwable -> L2a
            c(r4)     // Catch: java.lang.Throwable -> L2a
            r14.setReadable(r3, r11)     // Catch: java.lang.Throwable -> L2a
            r14.setExecutable(r3, r11)     // Catch: java.lang.Throwable -> L2a
            r14.setWritable(r3)     // Catch: java.lang.Throwable -> L2a
            java.util.zip.ZipFile r11 = r1.a     // Catch: java.io.IOException -> La5
            if (r11 == 0) goto La5
            r11.close()     // Catch: java.io.IOException -> La5
            goto La5
        L7b:
            r11 = move-exception
            goto L83
        L7d:
            r4.write(r5, r11, r8)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L92 java.lang.Throwable -> L92
            long r8 = (long) r8
            long r6 = r6 + r8
            goto L44
        L83:
            r0 = r4
            goto L89
        L85:
            r11 = move-exception
            goto L89
        L87:
            r11 = move-exception
            r12 = r0
        L89:
            c(r12)     // Catch: java.lang.Throwable -> L2a
            c(r0)     // Catch: java.lang.Throwable -> L2a
            throw r11     // Catch: java.lang.Throwable -> L2a
        L90:
            r12 = r0
        L91:
            r4 = r0
        L92:
            c(r12)     // Catch: java.lang.Throwable -> L2a
            c(r4)     // Catch: java.lang.Throwable -> L2a
        L98:
            r12 = r2
            goto L9
        L9b:
            r15.getClass()     // Catch: java.lang.Throwable -> L2a
            java.util.zip.ZipFile r11 = r1.a     // Catch: java.io.IOException -> La5
            if (r11 == 0) goto La5
            r11.close()     // Catch: java.io.IOException -> La5
        La5:
            return
        La6:
            java.lang.String[] r11 = d(r11, r13)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> Lab
            goto Lb4
        Lab:
            r11 = move-exception
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L2a
        Lb4:
            ms.bz.bd.c.Pgl.y0 r14 = new ms.bz.bd.c.Pgl.y0     // Catch: java.lang.Throwable -> L2a
            r14.<init>(r13, r12, r11)     // Catch: java.lang.Throwable -> L2a
            throw r14     // Catch: java.lang.Throwable -> L2a
        Lba:
            r11 = move-exception
        Lbb:
            if (r0 == 0) goto Lc4
            java.util.zip.ZipFile r12 = r0.a     // Catch: java.io.IOException -> Lc4
            if (r12 == 0) goto Lc4
            r12.close()     // Catch: java.io.IOException -> Lc4
        Lc4:
            throw r11
    }
}
