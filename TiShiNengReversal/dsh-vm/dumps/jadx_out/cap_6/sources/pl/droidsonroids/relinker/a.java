package pl.droidsonroids.relinker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements pl.droidsonroids.relinker.c.a {
    private static final int a = 5;
    private static final int b = 4096;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: pl.droidsonroids.relinker.a$a, reason: collision with other inner class name */
    private static class C0090a {
        public java.util.zip.ZipFile a;
        public java.util.zip.ZipEntry b;

        public C0090a(java.util.zip.ZipFile r1, java.util.zip.ZipEntry r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private void b(java.io.Closeable r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    private long c(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r5 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
        L6:
            int r3 = r6.read(r0)
            r4 = -1
            if (r3 != r4) goto L11
            r7.flush()
            return r1
        L11:
            r4 = 0
            r7.write(r0, r4, r3)
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L6
    }

    private pl.droidsonroids.relinker.a.C0090a d(android.content.Context r17, java.lang.String[] r18, java.lang.String r19, pl.droidsonroids.relinker.d r20) {
            r16 = this;
            r0 = r18
            java.lang.String[] r1 = r16.f(r17)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L9:
            r5 = 0
            if (r4 >= r2) goto L84
            r6 = r1[r4]
            r7 = 0
        Lf:
            int r8 = r7 + 1
            r9 = 5
            r10 = 1
            if (r7 >= r9) goto L24
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L21
            java.io.File r11 = new java.io.File     // Catch: java.io.IOException -> L21
            r11.<init>(r6)     // Catch: java.io.IOException -> L21
            r7.<init>(r11, r10)     // Catch: java.io.IOException -> L21
            r5 = r7
            goto L24
        L21:
            r7 = r8
            goto Lf
        L24:
            if (r5 != 0) goto L2b
            r12 = r19
            r3 = r20
            goto L80
        L2b:
            r7 = 0
        L2c:
            int r8 = r7 + 1
            if (r7 >= r9) goto L79
            int r7 = r0.length
            r11 = 0
        L32:
            if (r11 >= r7) goto L72
            r12 = r0[r11]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "lib"
            r13.append(r14)
            char r14 = java.io.File.separatorChar
            r13.append(r14)
            r13.append(r12)
            r13.append(r14)
            r12 = r19
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r3] = r13
            r14[r10] = r6
            java.lang.String r15 = "Looking for %s in APK %s..."
            r3 = r20
            r3.m(r15, r14)
            java.util.zip.ZipEntry r13 = r5.getEntry(r13)
            if (r13 == 0) goto L6e
            pl.droidsonroids.relinker.a$a r0 = new pl.droidsonroids.relinker.a$a
            r0.<init>(r5, r13)
            return r0
        L6e:
            int r11 = r11 + 1
            r3 = 0
            goto L32
        L72:
            r12 = r19
            r3 = r20
            r7 = r8
            r3 = 0
            goto L2c
        L79:
            r12 = r19
            r3 = r20
            r5.close()     // Catch: java.io.IOException -> L80
        L80:
            int r4 = r4 + 1
            r3 = 0
            goto L9
        L84:
            return r5
    }

    private java.lang.String[] e(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lib"
            r0.append(r1)
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
            java.lang.String[] r8 = r7.f(r8)
            int r1 = r8.length
            r2 = 0
        L35:
            if (r2 >= r1) goto L6d
            r3 = r8[r2]
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L6a
            java.io.File r5 = new java.io.File     // Catch: java.io.IOException -> L6a
            r5.<init>(r3)     // Catch: java.io.IOException -> L6a
            r3 = 1
            r4.<init>(r5, r3)     // Catch: java.io.IOException -> L6a
            java.util.Enumeration r4 = r4.entries()
        L48:
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.nextElement()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            java.lang.String r5 = r5.getName()
            java.util.regex.Matcher r5 = r9.matcher(r5)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L48
            java.lang.String r5 = r5.group(r3)
            r0.add(r5)
            goto L48
        L6a:
            int r2 = r2 + 1
            goto L35
        L6d:
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    private java.lang.String[] f(android.content.Context r5) {
            r4 = this;
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            java.lang.String[] r0 = r5.splitSourceDirs
            if (r0 == 0) goto L1a
            int r1 = r0.length
            if (r1 == 0) goto L1a
            int r1 = r0.length
            r2 = 1
            int r1 = r1 + r2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r5 = r5.sourceDir
            r3 = 0
            r1[r3] = r5
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r2, r5)
            return r1
        L1a:
            java.lang.String r5 = r5.sourceDir
            java.lang.String[] r5 = new java.lang.String[]{r5}
            return r5
    }

    @Override // pl.droidsonroids.relinker.c.a
    public void a(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, pl.droidsonroids.relinker.d r15) {
            r10 = this;
            r0 = 0
            pl.droidsonroids.relinker.a$a r1 = r10.d(r11, r12, r13, r15)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L92
            r11 = 0
            r12 = 0
        L9:
            int r2 = r12 + 1
            r3 = 5
            if (r12 >= r3) goto L87
            java.lang.String r12 = "Found %s! Extracting..."
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L26
            r4[r11] = r13     // Catch: java.lang.Throwable -> L26
            r15.m(r12, r4)     // Catch: java.lang.Throwable -> L26
            boolean r12 = r14.exists()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            if (r12 != 0) goto L2d
            boolean r12 = r14.createNewFile()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            if (r12 != 0) goto L2d
            goto L85
        L26:
            r11 = move-exception
            r0 = r1
            goto La7
        L2a:
            goto L85
        L2d:
            java.util.zip.ZipFile r12 = r1.a     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78 java.io.FileNotFoundException -> L7b
            java.util.zip.ZipEntry r4 = r1.b     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78 java.io.FileNotFoundException -> L7b
            java.io.InputStream r12 = r12.getInputStream(r4)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78 java.io.FileNotFoundException -> L7b
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71 java.io.FileNotFoundException -> L73
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71 java.io.FileNotFoundException -> L73
            long r5 = r10.c(r12, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L6b
            java.io.FileDescriptor r7 = r4.getFD()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L6b
            r7.sync()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L6b
            long r7 = r14.length()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L6b
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L54
        L4d:
            r10.b(r12)     // Catch: java.lang.Throwable -> L26
            r10.b(r4)     // Catch: java.lang.Throwable -> L26
            goto L85
        L54:
            r10.b(r12)     // Catch: java.lang.Throwable -> L26
            r10.b(r4)     // Catch: java.lang.Throwable -> L26
            r14.setReadable(r3, r11)     // Catch: java.lang.Throwable -> L26
            r14.setExecutable(r3, r11)     // Catch: java.lang.Throwable -> L26
            r14.setWritable(r3)     // Catch: java.lang.Throwable -> L26
            java.util.zip.ZipFile r11 = r1.a     // Catch: java.io.IOException -> L91
            if (r11 == 0) goto L91
        L67:
            r11.close()     // Catch: java.io.IOException -> L91
            goto L91
        L6b:
            r11 = move-exception
        L6c:
            r0 = r12
            goto L7e
        L6e:
            r11 = move-exception
            r4 = r0
            goto L6c
        L71:
            r4 = r0
            goto L4d
        L73:
            r4 = r0
            goto L4d
        L75:
            r11 = move-exception
            r4 = r0
            goto L7e
        L78:
            r12 = r0
            r4 = r12
            goto L4d
        L7b:
            r12 = r0
            r4 = r12
            goto L4d
        L7e:
            r10.b(r0)     // Catch: java.lang.Throwable -> L26
            r10.b(r4)     // Catch: java.lang.Throwable -> L26
            throw r11     // Catch: java.lang.Throwable -> L26
        L85:
            r12 = r2
            goto L9
        L87:
            java.lang.String r11 = "FATAL! Couldn't extract the library from the APK!"
            r15.l(r11)     // Catch: java.lang.Throwable -> L26
            java.util.zip.ZipFile r11 = r1.a     // Catch: java.io.IOException -> L91
            if (r11 == 0) goto L91
            goto L67
        L91:
            return
        L92:
            java.lang.String[] r11 = r10.e(r11, r13)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L97
            goto La0
        L97:
            r11 = move-exception
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L26
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L26
        La0:
            pl.droidsonroids.relinker.MissingLibraryException r14 = new pl.droidsonroids.relinker.MissingLibraryException     // Catch: java.lang.Throwable -> L26
            r14.<init>(r13, r12, r11)     // Catch: java.lang.Throwable -> L26
            throw r14     // Catch: java.lang.Throwable -> L26
        La6:
            r11 = move-exception
        La7:
            if (r0 == 0) goto Lb0
            java.util.zip.ZipFile r12 = r0.a     // Catch: java.io.IOException -> Lb0
            if (r12 == 0) goto Lb0
            r12.close()     // Catch: java.io.IOException -> Lb0
        Lb0:
            throw r11
    }
}
