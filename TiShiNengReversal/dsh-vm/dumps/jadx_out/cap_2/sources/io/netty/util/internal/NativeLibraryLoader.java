package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NativeLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DELETE_NATIVE_LIB_AFTER_LOADING = false;
    private static final java.lang.String NATIVE_RESOURCE_HOME = "META-INF/native/";
    private static final boolean TRY_TO_PATCH_SHADED_ID = false;
    private static final byte[] UNIQUE_ID_BYTES = null;
    private static final java.io.File WORKDIR = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NoexecVolumeDetector {
        private NoexecVolumeDetector() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ boolean access$000(java.io.File r0) throws java.io.IOException {
                boolean r0 = canExecuteExecutable(r0)
                return r0
        }

        private static boolean canExecuteExecutable(java.io.File r5) throws java.io.IOException {
                int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
                r1 = 7
                r2 = 1
                if (r0 >= r1) goto L9
                return r2
            L9:
                boolean r0 = r5.canExecute()
                if (r0 == 0) goto L10
                return r2
            L10:
                java.nio.file.Path r0 = cn.jiguang.av.c0.a(r5)
                r1 = 0
                java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
                java.util.Set r0 = io.netty.util.internal.b.a(r0, r2)
                java.nio.file.attribute.PosixFilePermission r2 = io.netty.util.internal.c.a()
                java.nio.file.attribute.PosixFilePermission r3 = io.netty.util.internal.d.a()
                java.nio.file.attribute.PosixFilePermission r4 = io.netty.util.internal.e.a()
                java.util.EnumSet r2 = java.util.EnumSet.of(r2, r3, r4)
                boolean r3 = r0.containsAll(r2)
                if (r3 == 0) goto L32
                return r1
            L32:
                java.util.EnumSet r0 = java.util.EnumSet.copyOf(r0)
                r0.addAll(r2)
                java.nio.file.Path r1 = cn.jiguang.av.c0.a(r5)
                io.netty.util.internal.f.a(r1, r0)
                boolean r5 = r5.canExecute()
                return r5
        }
    }

    static {
            java.lang.Class<io.netty.util.internal.NativeLibraryLoader> r0 = io.netty.util.internal.NativeLibraryLoader.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.NativeLibraryLoader.logger = r0
            java.lang.String r1 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r1 = r1.getBytes(r2)
            io.netty.util.internal.NativeLibraryLoader.UNIQUE_ID_BYTES = r1
            java.lang.String r1 = "io.netty.native.workdir"
            java.lang.String r1 = io.netty.util.internal.SystemPropertyUtil.get(r1)
            java.lang.String r2 = "-Dio.netty.native.workdir: "
            if (r1 == 0) goto L3f
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.mkdirs()
            java.io.File r0 = r0.getAbsoluteFile()     // Catch: java.lang.Exception -> L28
        L28:
            io.netty.util.internal.NativeLibraryLoader.WORKDIR = r0
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.NativeLibraryLoader.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.debug(r0)
            goto L5c
        L3f:
            java.io.File r1 = io.netty.util.internal.PlatformDependent.tmpdir()
            io.netty.util.internal.NativeLibraryLoader.WORKDIR = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " (io.netty.tmpdir)"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.debug(r1)
        L5c:
            java.lang.String r0 = "io.netty.native.deleteLibAfterLoading"
            r1 = 1
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            io.netty.util.internal.NativeLibraryLoader.DELETE_NATIVE_LIB_AFTER_LOADING = r0
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.internal.NativeLibraryLoader.logger
            java.lang.String r3 = "-Dio.netty.native.deleteLibAfterLoading: {}"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.debug(r3, r0)
            java.lang.String r0 = "io.netty.native.tryPatchShadedId"
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            io.netty.util.internal.NativeLibraryLoader.TRY_TO_PATCH_SHADED_ID = r0
            java.lang.String r1 = "-Dio.netty.native.tryPatchShadedId: {}"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.debug(r1, r0)
            return
    }

    private NativeLibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String calculatePackagePrefix() {
            java.lang.Class<io.netty.util.internal.NativeLibraryLoader> r0 = io.netty.util.internal.NativeLibraryLoader.class
            java.lang.String r0 = r0.getName()
            r1 = 33
            r2 = 46
            java.lang.String r3 = "io!netty!util!internal!NativeLibraryLoader"
            java.lang.String r1 = r3.replace(r1, r2)
            boolean r2 = r0.endsWith(r1)
            r3 = 0
            if (r2 == 0) goto L25
            int r2 = r0.length()
            int r1 = r1.length()
            int r2 = r2 - r1
            java.lang.String r0 = r0.substring(r3, r2)
            return r0
        L25:
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r1
            r1 = 1
            r4[r1] = r0
            java.lang.String r0 = "Could not find prefix added to %s to get %s. When shading, only adding a package prefix is supported"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r2.<init>(r0)
            throw r2
    }

    private static byte[] classToByteArray(java.lang.Class<?> r5) throws java.lang.ClassNotFoundException {
            java.lang.String r0 = r5.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L12
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".class"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.net.URL r0 = r5.getResource(r0)
            if (r0 == 0) goto L65
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r3 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r3)
            r3 = 0
            java.io.InputStream r3 = r0.openStream()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
        L39:
            int r0 = r3.read(r1)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            r4 = -1
            if (r0 == r4) goto L49
            r4 = 0
            r2.write(r1, r4, r0)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            goto L39
        L45:
            r5 = move-exception
            goto L5e
        L47:
            r0 = move-exception
            goto L54
        L49:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            closeQuietly(r3)
            closeQuietly(r2)
            return r5
        L54:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L45
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L5e:
            closeQuietly(r3)
            closeQuietly(r2)
            throw r5
        L65:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            java.lang.String r5 = r5.getName()
            r0.<init>(r5)
            throw r0
    }

    private static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void load(java.lang.String r11, java.lang.ClassLoader r12) {
            java.lang.String r0 = ".jnilib"
            java.lang.String r1 = calculatePackagePrefix()
            r2 = 95
            r3 = 46
            java.lang.String r1 = r1.replace(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            loadLibrary(r12, r2, r5)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r6 = move-exception
            r4.add(r6)
            io.netty.util.internal.logging.InternalLogger r7 = io.netty.util.internal.NativeLibraryLoader.logger
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r2
            java.io.File r9 = io.netty.util.internal.NativeLibraryLoader.WORKDIR
            r10 = 1
            r8[r10] = r9
            r9 = 2
            r8[r9] = r6
            java.lang.String r6 = "{} cannot be loaded from java.library.path, now trying export to -Dio.netty.native.workdir: {}"
            r7.debug(r6, r8)
            java.lang.String r6 = java.lang.System.mapLibraryName(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "META-INF/native/"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            if (r12 != 0) goto L5b
            java.net.URL r8 = java.lang.ClassLoader.getSystemResource(r7)
            goto L5f
        L5b:
            java.net.URL r8 = r12.getResource(r7)
        L5f:
            r9 = 0
            if (r8 != 0) goto Lc8
            boolean r8 = io.netty.util.internal.PlatformDependent.isOsx()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            if (r8 == 0) goto Lbf
            boolean r7 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.lang.String r8 = "META-INF/native/lib"
            if (r7 == 0) goto L94
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r0.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r0.append(r8)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.lang.String r7 = ".dynlib"
            r0.append(r7)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            goto La6
        L85:
            r11 = move-exception
            r0 = r9
            r6 = r0
            goto L18f
        L8a:
            r11 = move-exception
            r0 = r9
            r6 = r0
            goto L13a
        L8f:
            r11 = move-exception
            r3 = r9
            r6 = r3
            goto L159
        L94:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r7.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r7.append(r8)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r7.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r7.append(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
        La6:
            if (r12 != 0) goto Lae
            java.net.URL r7 = java.lang.ClassLoader.getSystemResource(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
        Lac:
            r8 = r7
            goto Lb3
        Lae:
            java.net.URL r7 = r12.getResource(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            goto Lac
        Lb3:
            if (r8 == 0) goto Lb6
            goto Lc8
        Lb6:
            java.io.FileNotFoundException r11 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            io.netty.util.internal.ThrowableUtil.addSuppressedAndClear(r11, r4)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            throw r11     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
        Lbf:
            java.io.FileNotFoundException r11 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            r11.<init>(r7)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            io.netty.util.internal.ThrowableUtil.addSuppressedAndClear(r11, r4)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            throw r11     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
        Lc8:
            int r0 = r6.lastIndexOf(r3)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.lang.String r3 = r6.substring(r5, r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.lang.String r0 = r6.substring(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.io.File r6 = io.netty.util.internal.NativeLibraryLoader.WORKDIR     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.io.File r0 = java.io.File.createTempFile(r3, r0, r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a java.lang.UnsatisfiedLinkError -> L8f
            java.io.InputStream r3 = r8.openStream()     // Catch: java.lang.Throwable -> L130 java.lang.Exception -> L133 java.lang.UnsatisfiedLinkError -> L136
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L127 java.lang.Exception -> L12a java.lang.UnsatisfiedLinkError -> L12d
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L127 java.lang.Exception -> L12a java.lang.UnsatisfiedLinkError -> L12d
            boolean r1 = shouldShadedLibraryIdBePatched(r1)     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
            if (r1 == 0) goto Lf8
            patchShadedLibraryId(r3, r6, r11, r2)     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
            goto L106
        Led:
            r11 = move-exception
        Lee:
            r9 = r3
            goto L18f
        Lf1:
            r11 = move-exception
        Lf2:
            r9 = r3
            goto L13a
        Lf4:
            r11 = move-exception
        Lf5:
            r9 = r0
            goto L159
        Lf8:
            r11 = 8192(0x2000, float:1.148E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
        Lfc:
            int r1 = r3.read(r11)     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
            if (r1 <= 0) goto L106
            r6.write(r11, r5, r1)     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
            goto Lfc
        L106:
            r6.flush()     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
            closeQuietly(r6)     // Catch: java.lang.Throwable -> Led java.lang.Exception -> Lf1 java.lang.UnsatisfiedLinkError -> Lf4
            java.lang.String r11 = r0.getPath()     // Catch: java.lang.Throwable -> L127 java.lang.Exception -> L12a java.lang.UnsatisfiedLinkError -> L12d
            loadLibrary(r12, r11, r10)     // Catch: java.lang.Throwable -> L127 java.lang.Exception -> L12a java.lang.UnsatisfiedLinkError -> L12d
            closeQuietly(r3)
            closeQuietly(r9)
            boolean r11 = io.netty.util.internal.NativeLibraryLoader.DELETE_NATIVE_LIB_AFTER_LOADING
            if (r11 == 0) goto L123
            boolean r11 = r0.delete()
            if (r11 != 0) goto L126
        L123:
            r0.deleteOnExit()
        L126:
            return
        L127:
            r11 = move-exception
            r6 = r9
            goto Lee
        L12a:
            r11 = move-exception
            r6 = r9
            goto Lf2
        L12d:
            r11 = move-exception
            r6 = r9
            goto Lf5
        L130:
            r11 = move-exception
            r6 = r9
            goto L18f
        L133:
            r11 = move-exception
            r6 = r9
            goto L13a
        L136:
            r11 = move-exception
            r3 = r9
            r6 = r3
            goto Lf5
        L13a:
            java.lang.UnsatisfiedLinkError r12 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L157
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L157
            r1.<init>()     // Catch: java.lang.Throwable -> L157
            java.lang.String r3 = "could not load a native library: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L157
            r1.append(r2)     // Catch: java.lang.Throwable -> L157
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L157
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L157
            r12.initCause(r11)     // Catch: java.lang.Throwable -> L157
            io.netty.util.internal.ThrowableUtil.addSuppressedAndClear(r12, r4)     // Catch: java.lang.Throwable -> L157
            throw r12     // Catch: java.lang.Throwable -> L157
        L157:
            r11 = move-exception
            goto L18f
        L159:
            if (r9 == 0) goto L18b
            boolean r12 = r9.isFile()     // Catch: java.lang.Throwable -> L17b
            if (r12 == 0) goto L18b
            boolean r12 = r9.canRead()     // Catch: java.lang.Throwable -> L17b
            if (r12 == 0) goto L18b
            boolean r12 = io.netty.util.internal.NativeLibraryLoader.NoexecVolumeDetector.access$000(r9)     // Catch: java.lang.Throwable -> L17b
            if (r12 != 0) goto L18b
            io.netty.util.internal.logging.InternalLogger r12 = io.netty.util.internal.NativeLibraryLoader.logger     // Catch: java.lang.Throwable -> L17b
            java.lang.String r0 = "{} exists but cannot be executed even when execute permissions set; check volume for \"noexec\" flag; use -D{}=[path] to set native working directory separately."
            java.lang.String r1 = r9.getPath()     // Catch: java.lang.Throwable -> L17b
            java.lang.String r2 = "io.netty.native.workdir"
            r12.info(r0, r1, r2)     // Catch: java.lang.Throwable -> L17b
            goto L18b
        L17b:
            r12 = move-exception
            r4.add(r12)     // Catch: java.lang.Throwable -> L187
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.NativeLibraryLoader.logger     // Catch: java.lang.Throwable -> L187
            java.lang.String r1 = "Error checking if {} is on a file store mounted with noexec"
            r0.debug(r1, r9, r12)     // Catch: java.lang.Throwable -> L187
            goto L18b
        L187:
            r11 = move-exception
            r0 = r9
            goto Lee
        L18b:
            io.netty.util.internal.ThrowableUtil.addSuppressedAndClear(r11, r4)     // Catch: java.lang.Throwable -> L187
            throw r11     // Catch: java.lang.Throwable -> L187
        L18f:
            closeQuietly(r9)
            closeQuietly(r6)
            if (r0 == 0) goto L1a4
            boolean r12 = io.netty.util.internal.NativeLibraryLoader.DELETE_NATIVE_LIB_AFTER_LOADING
            if (r12 == 0) goto L1a1
            boolean r12 = r0.delete()
            if (r12 != 0) goto L1a4
        L1a1:
            r0.deleteOnExit()
        L1a4:
            throw r11
    }

    public static void loadFirstAvailable(java.lang.ClassLoader r7, java.lang.String... r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1d
            r3 = r8[r2]
            load(r3, r7)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            r0.add(r4)
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.internal.NativeLibraryLoader.logger
            java.lang.String r6 = "Unable to load the library '{}', trying next name..."
            r5.debug(r6, r3, r4)
            int r2 = r2 + 1
            goto L7
        L1d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to load any of the given libraries: "
            r1.append(r2)
            java.lang.String r8 = java.util.Arrays.toString(r8)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            io.netty.util.internal.ThrowableUtil.addSuppressedAndClear(r7, r0)
            throw r7
    }

    private static void loadLibrary(java.lang.ClassLoader r3, java.lang.String r4, boolean r5) {
            java.lang.String r0 = "Unable to load the library '{}', trying other loading mechanism."
            java.lang.String r1 = "Successfully loaded the library {}"
            java.lang.Class<io.netty.util.internal.NativeLibraryUtil> r2 = io.netty.util.internal.NativeLibraryUtil.class
            java.lang.Class r3 = tryToLoadClass(r3, r2)     // Catch: java.lang.Exception -> L13 java.lang.UnsatisfiedLinkError -> L15
            loadLibraryByHelper(r3, r4, r5)     // Catch: java.lang.Exception -> L13 java.lang.UnsatisfiedLinkError -> L15
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.internal.NativeLibraryLoader.logger     // Catch: java.lang.Exception -> L13 java.lang.UnsatisfiedLinkError -> L15
            r3.debug(r1, r4)     // Catch: java.lang.Exception -> L13 java.lang.UnsatisfiedLinkError -> L15
            return
        L13:
            r3 = move-exception
            goto L17
        L15:
            r3 = move-exception
            goto L1f
        L17:
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.internal.NativeLibraryLoader.logger     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            r2.debug(r0, r4, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            goto L24
        L1d:
            r4 = move-exception
            goto L2d
        L1f:
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.internal.NativeLibraryLoader.logger     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            r2.debug(r0, r4, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
        L24:
            io.netty.util.internal.NativeLibraryUtil.loadLibrary(r4, r5)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.internal.NativeLibraryLoader.logger     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            r5.debug(r1, r4)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            return
        L2d:
            io.netty.util.internal.ThrowableUtil.addSuppressed(r4, r3)
            throw r4
    }

    private static void loadLibraryByHelper(java.lang.Class<?> r1, java.lang.String r2, boolean r3) throws java.lang.UnsatisfiedLinkError {
            io.netty.util.internal.NativeLibraryLoader$1 r0 = new io.netty.util.internal.NativeLibraryLoader$1
            r0.<init>(r1, r2, r3)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L27
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Throwable r2 = r1.getCause()
            boolean r3 = r2 instanceof java.lang.UnsatisfiedLinkError
            if (r3 == 0) goto L1a
            java.lang.UnsatisfiedLinkError r2 = (java.lang.UnsatisfiedLinkError) r2
            throw r2
        L1a:
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError
            java.lang.String r3 = r1.getMessage()
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
        L27:
            return
    }

    static boolean patchShadedLibraryId(java.io.InputStream r5, java.io.OutputStream r6, java.lang.String r7, java.lang.String r8) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r2 = r5.available()
            r1.<init>(r2)
        Ld:
            int r2 = r5.read(r0)
            r3 = 0
            if (r2 <= 0) goto L18
            r1.write(r0, r3, r2)
            goto Ld
        L18:
            r1.flush()
            byte[] r5 = r1.toByteArray()
            r1.close()
            boolean r0 = patchShadedLibraryId(r5, r7, r8)
            if (r0 != 0) goto L61
            java.lang.String r0 = io.netty.util.internal.PlatformDependent.normalizedOs()
            java.lang.String r1 = io.netty.util.internal.PlatformDependent.normalizedArch()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "_"
            r2.append(r4)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            boolean r1 = r7.endsWith(r0)
            if (r1 == 0) goto L5f
            int r1 = r7.length()
            int r0 = r0.length()
            int r1 = r1 - r0
            java.lang.String r7 = r7.substring(r3, r1)
            boolean r7 = patchShadedLibraryId(r5, r7, r8)
            goto L62
        L5f:
            r7 = 0
            goto L62
        L61:
            r7 = 1
        L62:
            int r8 = r5.length
            r6.write(r5, r3, r8)
            return r7
    }

    private static boolean patchShadedLibraryId(byte[] r8, java.lang.String r9, java.lang.String r10) {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            byte[] r0 = r9.getBytes(r0)
            r1 = 0
            r2 = 0
        L8:
            int r3 = r8.length
            r4 = -1
            if (r2 >= r3) goto L2b
            int r3 = r8.length
            int r3 = r3 - r2
            int r5 = r0.length
            if (r3 < r5) goto L2b
            r5 = r2
            r3 = 0
        L13:
            int r6 = r0.length
            if (r3 >= r6) goto L28
            int r6 = r5 + 1
            r5 = r8[r5]
            int r7 = r3 + 1
            r3 = r0[r3]
            if (r5 == r3) goto L21
            goto L28
        L21:
            int r3 = r0.length
            if (r7 != r3) goto L25
            goto L2c
        L25:
            r5 = r6
            r3 = r7
            goto L13
        L28:
            int r2 = r2 + 1
            goto L8
        L2b:
            r2 = -1
        L2c:
            if (r2 != r4) goto L36
            io.netty.util.internal.logging.InternalLogger r8 = io.netty.util.internal.NativeLibraryLoader.logger
            java.lang.String r9 = "Was not able to find the ID of the shaded native library {}, can't adjust it."
            r8.debug(r9, r10)
            return r1
        L36:
            r3 = 0
        L37:
            int r4 = r0.length
            if (r3 >= r4) goto L4e
            int r4 = r2 + r3
            byte[] r5 = io.netty.util.internal.NativeLibraryLoader.UNIQUE_ID_BYTES
            java.util.Random r6 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            int r7 = r5.length
            int r6 = r6.nextInt(r7)
            r5 = r5[r6]
            r8[r4] = r5
            int r3 = r3 + 1
            goto L37
        L4e:
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.internal.NativeLibraryLoader.logger
            boolean r4 = r3.isDebugEnabled()
            r5 = 1
            if (r4 == 0) goto L6e
            java.lang.String r4 = new java.lang.String
            int r0 = r0.length
            java.nio.charset.Charset r6 = io.netty.util.CharsetUtil.UTF_8
            r4.<init>(r8, r2, r0, r6)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r10
            r8[r5] = r9
            r9 = 2
            r8[r9] = r4
            java.lang.String r9 = "Found the ID of the shaded native library {}. Replacing ID part {} with {}"
            r3.debug(r9, r8)
        L6e:
            return r5
    }

    private static boolean shouldShadedLibraryIdBePatched(java.lang.String r1) {
            boolean r0 = io.netty.util.internal.NativeLibraryLoader.TRY_TO_PATCH_SHADED_ID
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent.isOsx()
            if (r0 == 0) goto L12
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private static java.lang.Class<?> tryToLoadClass(java.lang.ClassLoader r3, java.lang.Class<?> r4) throws java.lang.ClassNotFoundException {
            java.lang.String r0 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> La
            r1 = 0
            java.lang.Class r3 = java.lang.Class.forName(r0, r1, r3)     // Catch: java.lang.ClassNotFoundException -> La
            return r3
        La:
            r0 = move-exception
            if (r3 == 0) goto L2f
            byte[] r1 = classToByteArray(r4)     // Catch: java.lang.Error -> L1d java.lang.RuntimeException -> L1f java.lang.ClassNotFoundException -> L21
            io.netty.util.internal.NativeLibraryLoader$2 r2 = new io.netty.util.internal.NativeLibraryLoader$2     // Catch: java.lang.Error -> L1d java.lang.RuntimeException -> L1f java.lang.ClassNotFoundException -> L21
            r2.<init>(r3, r4, r1)     // Catch: java.lang.Error -> L1d java.lang.RuntimeException -> L1f java.lang.ClassNotFoundException -> L21
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.Error -> L1d java.lang.RuntimeException -> L1f java.lang.ClassNotFoundException -> L21
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Error -> L1d java.lang.RuntimeException -> L1f java.lang.ClassNotFoundException -> L21
            return r3
        L1d:
            r3 = move-exception
            goto L23
        L1f:
            r3 = move-exception
            goto L27
        L21:
            r3 = move-exception
            goto L2b
        L23:
            io.netty.util.internal.ThrowableUtil.addSuppressed(r3, r0)
            throw r3
        L27:
            io.netty.util.internal.ThrowableUtil.addSuppressed(r3, r0)
            throw r3
        L2b:
            io.netty.util.internal.ThrowableUtil.addSuppressed(r3, r0)
            throw r3
        L2f:
            throw r0
    }
}
