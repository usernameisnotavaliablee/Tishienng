package androidx.multidex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MultiDex {
    private static final java.lang.String CODE_CACHE_NAME = "code_cache";
    private static final java.lang.String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final boolean IS_VM_MULTIDEX_CAPABLE = false;
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final java.lang.String NO_KEY_PREFIX = "";
    private static final java.lang.String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    static final java.lang.String TAG = "MultiDex";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final java.util.Set<java.io.File> installedApk = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final androidx.multidex.MultiDex.V14.ElementConstructor elementConstructor;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private interface ElementConstructor {
            java.lang.Object newInstance(java.io.File r1, dalvik.system.DexFile r2) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.io.IOException;
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class ICSElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            ICSElementConstructor(java.lang.Class<?> r5) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                    r4 = this;
                    r4.<init>()
                    r0 = 3
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    java.lang.Class<java.io.File> r1 = java.io.File.class
                    r2 = 0
                    r0[r2] = r1
                    r1 = 1
                    java.lang.Class<java.util.zip.ZipFile> r2 = java.util.zip.ZipFile.class
                    r0[r1] = r2
                    java.lang.Class<dalvik.system.DexFile> r2 = dalvik.system.DexFile.class
                    r3 = 2
                    r0[r3] = r2
                    java.lang.reflect.Constructor r5 = r5.getConstructor(r0)
                    r4.elementConstructor = r5
                    r5.setAccessible(r1)
                    return
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File r5, dalvik.system.DexFile r6) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.io.IOException {
                    r4 = this;
                    java.lang.reflect.Constructor<?> r0 = r4.elementConstructor
                    java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
                    r1.<init>(r5)
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r5
                    r5 = 1
                    r2[r5] = r1
                    r5 = 2
                    r2[r5] = r6
                    java.lang.Object r5 = r0.newInstance(r2)
                    return r5
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class JBMR11ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            JBMR11ElementConstructor(java.lang.Class<?> r5) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                    r4 = this;
                    r4.<init>()
                    r0 = 3
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    r1 = 0
                    java.lang.Class<java.io.File> r2 = java.io.File.class
                    r0[r1] = r2
                    r1 = 1
                    r0[r1] = r2
                    java.lang.Class<dalvik.system.DexFile> r2 = dalvik.system.DexFile.class
                    r3 = 2
                    r0[r3] = r2
                    java.lang.reflect.Constructor r5 = r5.getConstructor(r0)
                    r4.elementConstructor = r5
                    r5.setAccessible(r1)
                    return
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File r4, dalvik.system.DexFile r5) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                    r3 = this;
                    java.lang.reflect.Constructor<?> r0 = r3.elementConstructor
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r4
                    r2 = 1
                    r1[r2] = r4
                    r4 = 2
                    r1[r4] = r5
                    java.lang.Object r4 = r0.newInstance(r1)
                    return r4
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class JBMR2ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            JBMR2ElementConstructor(java.lang.Class<?> r5) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                    r4 = this;
                    r4.<init>()
                    r0 = 4
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    r1 = 0
                    java.lang.Class<java.io.File> r2 = java.io.File.class
                    r0[r1] = r2
                    r1 = 1
                    java.lang.Class r3 = java.lang.Boolean.TYPE
                    r0[r1] = r3
                    r3 = 2
                    r0[r3] = r2
                    java.lang.Class<dalvik.system.DexFile> r2 = dalvik.system.DexFile.class
                    r3 = 3
                    r0[r3] = r2
                    java.lang.reflect.Constructor r5 = r5.getConstructor(r0)
                    r4.elementConstructor = r5
                    r5.setAccessible(r1)
                    return
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File r5, dalvik.system.DexFile r6) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                    r4 = this;
                    java.lang.reflect.Constructor<?> r0 = r4.elementConstructor
                    r1 = 4
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r5
                    java.lang.Boolean r2 = java.lang.Boolean.FALSE
                    r3 = 1
                    r1[r3] = r2
                    r2 = 2
                    r1[r2] = r5
                    r5 = 3
                    r1[r5] = r6
                    java.lang.Object r5 = r0.newInstance(r1)
                    return r5
            }
        }

        static {
                return
        }

        private V14() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                androidx.multidex.MultiDex$V14$ICSElementConstructor r1 = new androidx.multidex.MultiDex$V14$ICSElementConstructor     // Catch: java.lang.NoSuchMethodException -> Lf
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> Lf
                goto L1a
            Lf:
                androidx.multidex.MultiDex$V14$JBMR11ElementConstructor r1 = new androidx.multidex.MultiDex$V14$JBMR11ElementConstructor     // Catch: java.lang.NoSuchMethodException -> L15
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L15
                goto L1a
            L15:
                androidx.multidex.MultiDex$V14$JBMR2ElementConstructor r1 = new androidx.multidex.MultiDex$V14$JBMR2ElementConstructor
                r1.<init>(r0)
            L1a:
                r2.elementConstructor = r1
                return
        }

        static void install(java.lang.ClassLoader r1, java.util.List<? extends java.io.File> r2) throws java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchFieldException {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = androidx.multidex.MultiDex.access$000(r1, r0)
                java.lang.Object r1 = r0.get(r1)
                androidx.multidex.MultiDex$V14 r0 = new androidx.multidex.MultiDex$V14
                r0.<init>()
                java.lang.Object[] r2 = r0.makeDexElements(r2)
                java.lang.String r0 = "dexElements"
                androidx.multidex.MultiDex.access$100(r1, r0, r2)     // Catch: java.lang.NoSuchFieldException -> L19
                return
            L19:
                java.lang.String r0 = "pathElements"
                androidx.multidex.MultiDex.access$100(r1, r0, r2)
                return
        }

        private java.lang.Object[] makeDexElements(java.util.List<? extends java.io.File> r9) throws java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                r8 = this;
                int r0 = r9.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 0
            L8:
                if (r3 >= r0) goto L27
                java.lang.Object r4 = r9.get(r3)
                java.io.File r4 = (java.io.File) r4
                androidx.multidex.MultiDex$V14$ElementConstructor r5 = r8.elementConstructor
                java.lang.String r6 = r4.getPath()
                java.lang.String r7 = optimizedPathFor(r4)
                dalvik.system.DexFile r6 = dalvik.system.DexFile.loadDex(r6, r7, r2)
                java.lang.Object r4 = r5.newInstance(r4, r6)
                r1[r3] = r4
                int r3 = r3 + 1
                goto L8
            L27:
                return r1
        }

        private static java.lang.String optimizedPathFor(java.io.File r4) {
                java.io.File r0 = r4.getParentFile()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r4.length()
                int r3 = androidx.multidex.MultiDex.V14.EXTRACTED_SUFFIX_LENGTH
                int r2 = r2 - r3
                r3 = 0
                java.lang.String r4 = r4.substring(r3, r2)
                r1.append(r4)
                java.lang.String r4 = ".dex"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                java.io.File r1 = new java.io.File
                r1.<init>(r0, r4)
                java.lang.String r4 = r1.getPath()
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class V19 {
        private V19() {
                r0 = this;
                r0.<init>()
                return
        }

        static void install(java.lang.ClassLoader r5, java.util.List<? extends java.io.File> r6, java.io.File r7) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = androidx.multidex.MultiDex.access$000(r5, r0)
                java.lang.Object r5 = r0.get(r5)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                java.lang.Object[] r6 = makeDexElements(r5, r1, r7, r0)
                java.lang.String r7 = "dexElements"
                androidx.multidex.MultiDex.access$100(r5, r7, r6)
                int r6 = r0.size()
                if (r6 <= 0) goto L78
                java.util.Iterator r6 = r0.iterator()
            L27:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L34
                java.lang.Object r7 = r6.next()
                java.io.IOException r7 = (java.io.IOException) r7
                goto L27
            L34:
                java.lang.String r6 = "dexElementsSuppressedExceptions"
                java.lang.reflect.Field r6 = androidx.multidex.MultiDex.access$000(r5, r6)
                java.lang.Object r7 = r6.get(r5)
                java.io.IOException[] r7 = (java.io.IOException[]) r7
                r1 = 0
                if (r7 != 0) goto L50
                int r7 = r0.size()
                java.io.IOException[] r7 = new java.io.IOException[r7]
                java.lang.Object[] r7 = r0.toArray(r7)
                java.io.IOException[] r7 = (java.io.IOException[]) r7
                goto L64
            L50:
                int r2 = r0.size()
                int r3 = r7.length
                int r2 = r2 + r3
                java.io.IOException[] r2 = new java.io.IOException[r2]
                r0.toArray(r2)
                int r3 = r0.size()
                int r4 = r7.length
                java.lang.System.arraycopy(r7, r1, r2, r3, r4)
                r7 = r2
            L64:
                r6.set(r5, r7)
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "I/O exception during makeDexElement"
                r5.<init>(r6)
                java.lang.Object r6 = r0.get(r1)
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                r5.initCause(r6)
                throw r5
            L78:
                return
        }

        private static java.lang.Object[] makeDexElements(java.lang.Object r6, java.util.ArrayList<java.io.File> r7, java.io.File r8, java.util.ArrayList<java.io.IOException> r9) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException {
                r0 = 3
                java.lang.Class[] r1 = new java.lang.Class[r0]
                r2 = 0
                java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
                r1[r2] = r3
                r4 = 1
                java.lang.Class<java.io.File> r5 = java.io.File.class
                r1[r4] = r5
                r5 = 2
                r1[r5] = r3
                java.lang.String r3 = "makeDexElements"
                java.lang.reflect.Method r1 = androidx.multidex.MultiDex.access$200(r6, r3, r1)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r7
                r0[r4] = r8
                r0[r5] = r9
                java.lang.Object r6 = r1.invoke(r6, r0)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class V4 {
        private V4() {
                r0 = this;
                r0.<init>()
                return
        }

        static void install(java.lang.ClassLoader r10, java.util.List<? extends java.io.File> r11) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException {
                int r0 = r11.size()
                java.lang.String r1 = "path"
                java.lang.reflect.Field r1 = androidx.multidex.MultiDex.access$000(r10, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.Object r3 = r1.get(r10)
                java.lang.String r3 = (java.lang.String) r3
                r2.<init>(r3)
                java.lang.String[] r3 = new java.lang.String[r0]
                java.io.File[] r4 = new java.io.File[r0]
                java.util.zip.ZipFile[] r5 = new java.util.zip.ZipFile[r0]
                dalvik.system.DexFile[] r0 = new dalvik.system.DexFile[r0]
                java.util.ListIterator r11 = r11.listIterator()
            L21:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto L61
                java.lang.Object r6 = r11.next()
                java.io.File r6 = (java.io.File) r6
                java.lang.String r7 = r6.getAbsolutePath()
                r8 = 58
                r2.append(r8)
                r2.append(r7)
                int r8 = r11.previousIndex()
                r3[r8] = r7
                r4[r8] = r6
                java.util.zip.ZipFile r9 = new java.util.zip.ZipFile
                r9.<init>(r6)
                r5[r8] = r9
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r7)
                java.lang.String r9 = ".dex"
                r6.append(r9)
                java.lang.String r6 = r6.toString()
                r9 = 0
                dalvik.system.DexFile r6 = dalvik.system.DexFile.loadDex(r7, r6, r9)
                r0[r8] = r6
                goto L21
            L61:
                java.lang.String r11 = r2.toString()
                r1.set(r10, r11)
                java.lang.String r11 = "mPaths"
                androidx.multidex.MultiDex.access$100(r10, r11, r3)
                java.lang.String r11 = "mFiles"
                androidx.multidex.MultiDex.access$100(r10, r11, r4)
                java.lang.String r11 = "mZips"
                androidx.multidex.MultiDex.access$100(r10, r11, r5)
                java.lang.String r11 = "mDexs"
                androidx.multidex.MultiDex.access$100(r10, r11, r0)
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.multidex.MultiDex.installedApk = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = isVMMultidexCapable(r0)
            androidx.multidex.MultiDex.IS_VM_MULTIDEX_CAPABLE = r0
            return
    }

    private MultiDex() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.reflect.Field access$000(java.lang.Object r0, java.lang.String r1) throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = findField(r0, r1)
            return r0
    }

    static /* synthetic */ void access$100(java.lang.Object r0, java.lang.String r1, java.lang.Object[] r2) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
            expandFieldArray(r0, r1, r2)
            return
    }

    static /* synthetic */ java.lang.reflect.Method access$200(java.lang.Object r0, java.lang.String r1, java.lang.Class[] r2) throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = findMethod(r0, r1, r2)
            return r0
    }

    private static void clearOldDexDir(android.content.Context r5) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r1 = "secondary-dexes"
            r0.<init>(r5, r1)
            boolean r5 = r0.isDirectory()
            if (r5 == 0) goto L47
            r0.getPath()
            java.io.File[] r5 = r0.listFiles()
            if (r5 != 0) goto L1e
            r0.getPath()
            return
        L1e:
            int r1 = r5.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L3a
            r3 = r5[r2]
            r3.getPath()
            r3.length()
            boolean r4 = r3.delete()
            if (r4 != 0) goto L34
            r3.getPath()
            goto L37
        L34:
            r3.getPath()
        L37:
            int r2 = r2 + 1
            goto L20
        L3a:
            boolean r5 = r0.delete()
            if (r5 != 0) goto L44
            r0.getPath()
            return
        L44:
            r0.getPath()
        L47:
            return
    }

    private static void doInstallation(android.content.Context r2, java.io.File r3, java.io.File r4, java.lang.String r5, java.lang.String r6, boolean r7) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
            java.util.Set<java.io.File> r0 = androidx.multidex.MultiDex.installedApk
            monitor-enter(r0)
            boolean r1 = r0.contains(r3)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            goto L51
        Ld:
            r0.add(r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "java.vm.version"
            java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.ClassLoader r1 = r2.getClassLoader()     // Catch: java.lang.Throwable -> Lb java.lang.RuntimeException -> L4f
            if (r1 != 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L1d:
            clearOldDexDir(r2)     // Catch: java.lang.Throwable -> L20
        L20:
            java.io.File r4 = getDexDir(r2, r4, r5)     // Catch: java.lang.Throwable -> Lb
            androidx.multidex.MultiDexExtractor r5 = new androidx.multidex.MultiDexExtractor     // Catch: java.lang.Throwable -> Lb
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lb
            r3 = 0
            java.util.List r3 = r5.load(r2, r6, r3)     // Catch: java.lang.Throwable -> L32
            installSecondaryDexes(r1, r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L3f
        L32:
            r2 = move-exception
            goto L4b
        L34:
            r3 = move-exception
            if (r7 == 0) goto L4a
            r3 = 1
            java.util.List r2 = r5.load(r2, r6, r3)     // Catch: java.lang.Throwable -> L32
            installSecondaryDexes(r1, r4, r2)     // Catch: java.lang.Throwable -> L32
        L3f:
            r5.close()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> L44
            r2 = 0
            goto L45
        L44:
            r2 = move-exception
        L45:
            if (r2 != 0) goto L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            goto L50
        L49:
            throw r2     // Catch: java.lang.Throwable -> Lb
        L4a:
            throw r3     // Catch: java.lang.Throwable -> L32
        L4b:
            r5.close()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> L4e
        L4e:
            throw r2     // Catch: java.lang.Throwable -> Lb
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
        L50:
            return
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    private static void expandFieldArray(java.lang.Object r4, java.lang.String r5, java.lang.Object[] r6) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
            java.lang.reflect.Field r5 = findField(r4, r5)
            java.lang.Object r0 = r5.get(r4)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            int r2 = r0.length
            int r3 = r6.length
            int r2 = r2 + r3
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r0.length
            int r2 = r6.length
            java.lang.System.arraycopy(r6, r3, r1, r0, r2)
            r5.set(r4, r1)
            return
    }

    private static java.lang.reflect.Field findField(java.lang.Object r3, java.lang.String r4) throws java.lang.NoSuchFieldException {
            java.lang.Class r0 = r3.getClass()
        L4:
            if (r0 == 0) goto L1a
            java.lang.reflect.Field r1 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L15
            boolean r2 = r1.isAccessible()     // Catch: java.lang.NoSuchFieldException -> L15
            if (r2 != 0) goto L14
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L15
        L14:
            return r1
        L15:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L1a:
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Field "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " not found in "
            r1.append(r4)
            java.lang.Class r3 = r3.getClass()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.reflect.Method findMethod(java.lang.Object r3, java.lang.String r4, java.lang.Class<?>... r5) throws java.lang.NoSuchMethodException {
            java.lang.Class r0 = r3.getClass()
        L4:
            if (r0 == 0) goto L1a
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L15
            boolean r2 = r1.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L15
            if (r2 != 0) goto L14
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L15
        L14:
            return r1
        L15:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L1a:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Method "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " with parameters "
            r1.append(r4)
            java.util.List r4 = java.util.Arrays.asList(r5)
            r1.append(r4)
            java.lang.String r4 = " not found in "
            r1.append(r4)
            java.lang.Class r3 = r3.getClass()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.RuntimeException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static java.io.File getDexDir(android.content.Context r2, java.io.File r3, java.lang.String r4) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "code_cache"
            r0.<init>(r3, r1)
            mkdirChecked(r0)     // Catch: java.io.IOException -> Lb
            goto L17
        Lb:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            r0.<init>(r2, r1)
            mkdirChecked(r0)
        L17:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r4)
            mkdirChecked(r2)
            return r2
    }

    public static void install(android.content.Context r7) {
            boolean r0 = androidx.multidex.MultiDex.IS_VM_MULTIDEX_CAPABLE
            if (r0 == 0) goto L5
            return
        L5:
            android.content.pm.ApplicationInfo r0 = getApplicationInfo(r7)     // Catch: java.lang.Exception -> L24
            if (r0 != 0) goto Lc
            return
        Lc:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = r0.sourceDir     // Catch: java.lang.Exception -> L24
            r2.<init>(r1)     // Catch: java.lang.Exception -> L24
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = r0.dataDir     // Catch: java.lang.Exception -> L24
            r3.<init>(r0)     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = "secondary-dexes"
            java.lang.String r5 = ""
            r6 = 1
            r1 = r7
            doInstallation(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L24
            return
        L24:
            r0 = move-exception
            r7 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MultiDex installation failed ("
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = ")."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public static void installInstrumentation(android.content.Context r14, android.content.Context r15) {
            boolean r0 = androidx.multidex.MultiDex.IS_VM_MULTIDEX_CAPABLE
            if (r0 == 0) goto L5
            return
        L5:
            android.content.pm.ApplicationInfo r0 = getApplicationInfo(r14)     // Catch: java.lang.Exception -> L5e
            if (r0 != 0) goto Lc
            return
        Lc:
            android.content.pm.ApplicationInfo r1 = getApplicationInfo(r15)     // Catch: java.lang.Exception -> L5e
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.String r14 = r14.getPackageName()     // Catch: java.lang.Exception -> L5e
            r2.append(r14)     // Catch: java.lang.Exception -> L5e
            java.lang.String r14 = "."
            r2.append(r14)     // Catch: java.lang.Exception -> L5e
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L5e
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L5e
            java.lang.String r14 = r1.dataDir     // Catch: java.lang.Exception -> L5e
            r5.<init>(r14)     // Catch: java.lang.Exception -> L5e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L5e
            java.lang.String r14 = r0.sourceDir     // Catch: java.lang.Exception -> L5e
            r4.<init>(r14)     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r14.<init>()     // Catch: java.lang.Exception -> L5e
            r14.append(r7)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = "secondary-dexes"
            r14.append(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.String r6 = r14.toString()     // Catch: java.lang.Exception -> L5e
            r8 = 0
            r3 = r15
            doInstallation(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L5e
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L5e
            java.lang.String r14 = r1.sourceDir     // Catch: java.lang.Exception -> L5e
            r9.<init>(r14)     // Catch: java.lang.Exception -> L5e
            java.lang.String r11 = "secondary-dexes"
            java.lang.String r12 = ""
            r13 = 0
            r8 = r3
            r10 = r5
            doInstallation(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L5e
            return
        L5e:
            r0 = move-exception
            r14 = r0
            java.lang.RuntimeException r15 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MultiDex installation failed ("
            r0.append(r1)
            java.lang.String r14 = r14.getMessage()
            r0.append(r14)
            java.lang.String r14 = ")."
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
    }

    private static void installSecondaryDexes(java.lang.ClassLoader r1, java.io.File r2, java.util.List<? extends java.io.File> r3) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9
            androidx.multidex.MultiDex.V19.install(r1, r3, r2)
        L9:
            return
    }

    static boolean isVMMultidexCapable(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L2c
            java.lang.String r1 = "(\\d+)\\.(\\d+)(\\.\\d+)?"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r4 = r1.matcher(r4)
            boolean r1 = r4.matches()
            if (r1 == 0) goto L2c
            r1 = 1
            java.lang.String r2 = r4.group(r1)     // Catch: java.lang.NumberFormatException -> L2c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2c
            r3 = 2
            java.lang.String r4 = r4.group(r3)     // Catch: java.lang.NumberFormatException -> L2c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L2c
            if (r2 > r3) goto L2b
            if (r2 != r3) goto L2c
            if (r4 < r1) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }

    private static void mkdirChecked(java.io.File r3) throws java.io.IOException {
            r3.mkdir()
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L40
            java.io.File r0 = r3.getParentFile()
            if (r0 != 0) goto L13
            r3.getPath()
            goto L25
        L13:
            r3.getPath()
            r0.isDirectory()
            r0.isFile()
            r0.exists()
            r0.canRead()
            r0.canWrite()
        L25:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create directory "
            r1.append(r2)
            java.lang.String r3 = r3.getPath()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L40:
            return
    }
}
