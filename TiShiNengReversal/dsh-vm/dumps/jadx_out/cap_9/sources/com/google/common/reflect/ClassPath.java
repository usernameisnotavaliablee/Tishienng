package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ClassPath {
    private static final java.lang.String CLASS_FILE_NAME_EXTENSION = ".class";
    private static final com.google.common.base.Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = null;
    private static final com.google.common.base.Predicate<com.google.common.reflect.ClassPath.ClassInfo> IS_TOP_LEVEL = null;
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> resources;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static final class ClassInfo extends com.google.common.reflect.ClassPath.ResourceInfo {
        private final java.lang.String className;

        ClassInfo(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r1 = com.google.common.reflect.ClassPath.getClassName(r1)
                r0.className = r1
                return
        }

        static /* synthetic */ java.lang.String access$000(com.google.common.reflect.ClassPath.ClassInfo r0) {
                java.lang.String r0 = r0.className
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.className
                return r0
        }

        public java.lang.String getPackageName() {
                r1 = this;
                java.lang.String r0 = r1.className
                java.lang.String r0 = com.google.common.reflect.Reflection.getPackageName(r0)
                return r0
        }

        public java.lang.String getSimpleName() {
                r2 = this;
                java.lang.String r0 = r2.className
                r1 = 36
                int r0 = r0.lastIndexOf(r1)
                r1 = -1
                if (r0 == r1) goto L1c
                java.lang.String r1 = r2.className
                int r0 = r0 + 1
                java.lang.String r0 = r1.substring(r0)
                com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.digit()
                java.lang.String r0 = r1.trimLeadingFrom(r0)
                return r0
            L1c:
                java.lang.String r0 = r2.getPackageName()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L29
                java.lang.String r0 = r2.className
                return r0
            L29:
                java.lang.String r1 = r2.className
                int r0 = r0.length()
                int r0 = r0 + 1
                java.lang.String r0 = r1.substring(r0)
                return r0
        }

        public java.lang.Class<?> load() {
                r2 = this;
                java.lang.ClassLoader r0 = r2.loader     // Catch: java.lang.ClassNotFoundException -> L9
                java.lang.String r1 = r2.className     // Catch: java.lang.ClassNotFoundException -> L9
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L9
                return r0
            L9:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.className
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static final class DefaultScanner extends com.google.common.reflect.ClassPath.Scanner {
        private final com.google.common.collect.SetMultimap<java.lang.ClassLoader, java.lang.String> resources;

        DefaultScanner() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r0 = com.google.common.collect.MultimapBuilder.hashKeys()
                com.google.common.collect.MultimapBuilder$SetMultimapBuilder r0 = r0.linkedHashSetValues()
                com.google.common.collect.SetMultimap r0 = r0.build()
                r1.resources = r0
                return
        }

        private void scanDirectory(java.io.File r6, java.lang.ClassLoader r7, java.lang.String r8, java.util.Set<java.io.File> r9) throws java.io.IOException {
                r5 = this;
                java.io.File[] r0 = r6.listFiles()
                if (r0 != 0) goto L1f
                java.util.logging.Logger r7 = com.google.common.reflect.ClassPath.access$100()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Cannot read directory "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                r7.warning(r6)
                return
            L1f:
                int r6 = r0.length
                r1 = 0
            L21:
                if (r1 >= r6) goto L77
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                boolean r4 = r2.isDirectory()
                if (r4 == 0) goto L54
                java.io.File r2 = r2.getCanonicalFile()
                boolean r4 = r9.add(r2)
                if (r4 == 0) goto L74
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r8)
                r4.append(r3)
                java.lang.String r3 = "/"
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r5.scanDirectory(r2, r7, r3, r9)
                r9.remove(r2)
                goto L74
            L54:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r8)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "META-INF/MANIFEST.MF"
                boolean r3 = r2.equals(r3)
                if (r3 != 0) goto L74
                com.google.common.collect.SetMultimap<java.lang.ClassLoader, java.lang.String> r3 = r5.resources
                java.util.Set r3 = r3.get(r7)
                r3.add(r2)
            L74:
                int r1 = r1 + 1
                goto L21
            L77:
                return
        }

        com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> getResources() {
                r4 = this;
                com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
                com.google.common.collect.SetMultimap<java.lang.ClassLoader, java.lang.String> r1 = r4.resources
                java.util.Set r1 = r1.entries()
                java.util.Iterator r1 = r1.iterator()
            Le:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getKey()
                java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
                com.google.common.reflect.ClassPath$ResourceInfo r2 = com.google.common.reflect.ClassPath.ResourceInfo.of(r3, r2)
                r0.add(r2)
                goto Le
            L2e:
                com.google.common.collect.ImmutableSet r0 = r0.build()
                return r0
        }

        @Override // com.google.common.reflect.ClassPath.Scanner
        protected void scanDirectory(java.lang.ClassLoader r3, java.io.File r4) throws java.io.IOException {
                r2 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.io.File r1 = r4.getCanonicalFile()
                r0.add(r1)
                java.lang.String r1 = ""
                r2.scanDirectory(r4, r3, r1, r0)
                return
        }

        @Override // com.google.common.reflect.ClassPath.Scanner
        protected void scanJarFile(java.lang.ClassLoader r4, java.util.jar.JarFile r5) {
                r3 = this;
                java.util.Enumeration r5 = r5.entries()
            L4:
                boolean r0 = r5.hasMoreElements()
                if (r0 == 0) goto L31
                java.lang.Object r0 = r5.nextElement()
                java.util.jar.JarEntry r0 = (java.util.jar.JarEntry) r0
                boolean r1 = r0.isDirectory()
                if (r1 != 0) goto L4
                java.lang.String r1 = r0.getName()
                java.lang.String r2 = "META-INF/MANIFEST.MF"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L23
                goto L4
            L23:
                com.google.common.collect.SetMultimap<java.lang.ClassLoader, java.lang.String> r1 = r3.resources
                java.util.Set r1 = r1.get(r4)
                java.lang.String r0 = r0.getName()
                r1.add(r0)
                goto L4
            L31:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static class ResourceInfo {
        final java.lang.ClassLoader loader;
        private final java.lang.String resourceName;

        ResourceInfo(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.resourceName = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
                r0.loader = r1
                return
        }

        static com.google.common.reflect.ClassPath.ResourceInfo of(java.lang.String r1, java.lang.ClassLoader r2) {
                java.lang.String r0 = ".class"
                boolean r0 = r1.endsWith(r0)
                if (r0 == 0) goto Le
                com.google.common.reflect.ClassPath$ClassInfo r0 = new com.google.common.reflect.ClassPath$ClassInfo
                r0.<init>(r1, r2)
                return r0
            Le:
                com.google.common.reflect.ClassPath$ResourceInfo r0 = new com.google.common.reflect.ClassPath$ResourceInfo
                r0.<init>(r1, r2)
                return r0
        }

        public final com.google.common.io.ByteSource asByteSource() {
                r1 = this;
                java.net.URL r0 = r1.url()
                com.google.common.io.ByteSource r0 = com.google.common.io.Resources.asByteSource(r0)
                return r0
        }

        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset r2) {
                r1 = this;
                java.net.URL r0 = r1.url()
                com.google.common.io.CharSource r2 = com.google.common.io.Resources.asCharSource(r0, r2)
                return r2
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.reflect.ClassPath.ResourceInfo
                r1 = 0
                if (r0 == 0) goto L19
                com.google.common.reflect.ClassPath$ResourceInfo r4 = (com.google.common.reflect.ClassPath.ResourceInfo) r4
                java.lang.String r0 = r3.resourceName
                java.lang.String r2 = r4.resourceName
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L19
                java.lang.ClassLoader r0 = r3.loader
                java.lang.ClassLoader r4 = r4.loader
                if (r0 != r4) goto L19
                r4 = 1
                return r4
            L19:
                return r1
        }

        public final java.lang.String getResourceName() {
                r1 = this;
                java.lang.String r0 = r1.resourceName
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.resourceName
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.resourceName
                return r0
        }

        public final java.net.URL url() {
                r2 = this;
                java.lang.ClassLoader r0 = r2.loader
                java.lang.String r1 = r2.resourceName
                java.net.URL r0 = r0.getResource(r1)
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = r2.resourceName
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class Scanner {
        private final java.util.Set<java.io.File> scannedUris;

        Scanner() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = com.google.common.collect.Sets.newHashSet()
                r1.scannedUris = r0
                return
        }

        private static com.google.common.collect.ImmutableList<java.net.URL> getClassLoaderUrls(java.lang.ClassLoader r1) {
                boolean r0 = r1 instanceof java.net.URLClassLoader
                if (r0 == 0) goto Lf
                java.net.URLClassLoader r1 = (java.net.URLClassLoader) r1
                java.net.URL[] r1 = r1.getURLs()
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
                return r1
            Lf:
                java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L1e
                com.google.common.collect.ImmutableList r1 = parseJavaClassPath()
                return r1
            L1e:
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
                return r1
        }

        @com.google.common.annotations.VisibleForTesting
        static com.google.common.collect.ImmutableMap<java.io.File, java.lang.ClassLoader> getClassPathEntries(java.lang.ClassLoader r5) {
                java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMap()
                java.lang.ClassLoader r1 = r5.getParent()
                if (r1 == 0) goto L11
                com.google.common.collect.ImmutableMap r1 = getClassPathEntries(r1)
                r0.putAll(r1)
            L11:
                com.google.common.collect.ImmutableList r1 = getClassLoaderUrls(r5)
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
            L19:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L3f
                java.lang.Object r2 = r1.next()
                java.net.URL r2 = (java.net.URL) r2
                java.lang.String r3 = r2.getProtocol()
                java.lang.String r4 = "file"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L19
                java.io.File r2 = com.google.common.reflect.ClassPath.toFile(r2)
                boolean r3 = r0.containsKey(r2)
                if (r3 != 0) goto L19
                r0.put(r2, r5)
                goto L19
            L3f:
                com.google.common.collect.ImmutableMap r5 = com.google.common.collect.ImmutableMap.copyOf(r0)
                return r5
        }

        @com.google.common.annotations.VisibleForTesting
        static java.net.URL getClassPathEntry(java.io.File r1, java.lang.String r2) throws java.net.MalformedURLException {
                java.net.URL r0 = new java.net.URL
                java.net.URI r1 = r1.toURI()
                java.net.URL r1 = r1.toURL()
                r0.<init>(r1, r2)
                return r0
        }

        @com.google.common.annotations.VisibleForTesting
        static com.google.common.collect.ImmutableSet<java.io.File> getClassPathFromManifest(java.io.File r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.jar.Manifest r6) {
                if (r6 != 0) goto L7
                com.google.common.collect.ImmutableSet r5 = com.google.common.collect.ImmutableSet.of()
                return r5
            L7:
                com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
                java.util.jar.Attributes r6 = r6.getMainAttributes()
                java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.CLASS_PATH
                java.lang.String r1 = r1.toString()
                java.lang.String r6 = r6.getValue(r1)
                if (r6 == 0) goto L64
                com.google.common.base.Splitter r1 = com.google.common.reflect.ClassPath.access$200()
                java.lang.Iterable r6 = r1.split(r6)
                java.util.Iterator r6 = r6.iterator()
            L27:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L64
                java.lang.Object r1 = r6.next()
                java.lang.String r1 = (java.lang.String) r1
                java.net.URL r1 = getClassPathEntry(r5, r1)     // Catch: java.net.MalformedURLException -> L4b
                java.lang.String r2 = r1.getProtocol()
                java.lang.String r3 = "file"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                java.io.File r1 = com.google.common.reflect.ClassPath.toFile(r1)
                r0.add(r1)
                goto L27
            L4b:
                java.util.logging.Logger r2 = com.google.common.reflect.ClassPath.access$100()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid Class-Path entry: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.warning(r1)
                goto L27
            L64:
                com.google.common.collect.ImmutableSet r5 = r0.build()
                return r5
        }

        @com.google.common.annotations.VisibleForTesting
        static com.google.common.collect.ImmutableList<java.net.URL> parseJavaClassPath() {
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.PATH_SEPARATOR
                java.lang.String r1 = r1.value()
                com.google.common.base.Splitter r1 = com.google.common.base.Splitter.on(r1)
                com.google.common.base.StandardSystemProperty r2 = com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH
                java.lang.String r2 = r2.value()
                java.lang.Iterable r1 = r1.split(r2)
                java.util.Iterator r1 = r1.iterator()
            L1c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L6b
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.io.File r3 = new java.io.File     // Catch: java.net.MalformedURLException -> L39 java.lang.SecurityException -> L3b
                r3.<init>(r2)     // Catch: java.net.MalformedURLException -> L39 java.lang.SecurityException -> L3b
                java.net.URI r3 = r3.toURI()     // Catch: java.net.MalformedURLException -> L39 java.lang.SecurityException -> L3b
                java.net.URL r3 = r3.toURL()     // Catch: java.net.MalformedURLException -> L39 java.lang.SecurityException -> L3b
                r0.add(r3)     // Catch: java.net.MalformedURLException -> L39 java.lang.SecurityException -> L3b
                goto L1c
            L39:
                r3 = move-exception
                goto L50
            L3b:
                java.net.URL r3 = new java.net.URL     // Catch: java.net.MalformedURLException -> L39
                java.lang.String r4 = "file"
                java.io.File r5 = new java.io.File     // Catch: java.net.MalformedURLException -> L39
                r5.<init>(r2)     // Catch: java.net.MalformedURLException -> L39
                java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.net.MalformedURLException -> L39
                r6 = 0
                r3.<init>(r4, r6, r5)     // Catch: java.net.MalformedURLException -> L39
                r0.add(r3)     // Catch: java.net.MalformedURLException -> L39
                goto L1c
            L50:
                java.util.logging.Logger r4 = com.google.common.reflect.ClassPath.access$100()
                java.util.logging.Level r5 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "malformed classpath entry: "
                r6.append(r7)
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r4.log(r5, r2, r3)
                goto L1c
            L6b:
                com.google.common.collect.ImmutableList r0 = r0.build()
                return r0
        }

        private void scanFrom(java.io.File r4, java.lang.ClassLoader r5) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4.exists()     // Catch: java.lang.SecurityException -> L15
                if (r0 != 0) goto L7
                return
            L7:
                boolean r0 = r4.isDirectory()
                if (r0 == 0) goto L11
                r3.scanDirectory(r5, r4)
                return
            L11:
                r3.scanJar(r4, r5)
                return
            L15:
                r5 = move-exception
                java.util.logging.Logger r0 = com.google.common.reflect.ClassPath.access$100()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot access "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ": "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.warning(r4)
                return
        }

        private void scanJar(java.io.File r3, java.lang.ClassLoader r4) throws java.io.IOException {
                r2 = this;
                java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.io.IOException -> L2e
                r0.<init>(r3)     // Catch: java.io.IOException -> L2e
                java.util.jar.Manifest r1 = r0.getManifest()     // Catch: java.lang.Throwable -> L21
                com.google.common.collect.ImmutableSet r3 = getClassPathFromManifest(r3, r1)     // Catch: java.lang.Throwable -> L21
                com.google.common.collect.UnmodifiableIterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L21
            L11:
                boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L21
                if (r1 == 0) goto L23
                java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L21
                java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L21
                r2.scan(r1, r4)     // Catch: java.lang.Throwable -> L21
                goto L11
            L21:
                r3 = move-exception
                goto L2a
            L23:
                r2.scanJarFile(r4, r0)     // Catch: java.lang.Throwable -> L21
                r0.close()     // Catch: java.io.IOException -> L29
            L29:
                return
            L2a:
                r0.close()     // Catch: java.io.IOException -> L2d
            L2d:
                throw r3
            L2e:
                return
        }

        @com.google.common.annotations.VisibleForTesting
        final void scan(java.io.File r3, java.lang.ClassLoader r4) throws java.io.IOException {
                r2 = this;
                java.util.Set<java.io.File> r0 = r2.scannedUris
                java.io.File r1 = r3.getCanonicalFile()
                boolean r0 = r0.add(r1)
                if (r0 == 0) goto Lf
                r2.scanFrom(r3, r4)
            Lf:
                return
        }

        public final void scan(java.lang.ClassLoader r3) throws java.io.IOException {
                r2 = this;
                com.google.common.collect.ImmutableMap r3 = getClassPathEntries(r3)
                com.google.common.collect.ImmutableSet r3 = r3.entrySet()
                com.google.common.collect.UnmodifiableIterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L28
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.io.File r1 = (java.io.File) r1
                java.lang.Object r0 = r0.getValue()
                java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
                r2.scan(r1, r0)
                goto Lc
            L28:
                return
        }

        protected abstract void scanDirectory(java.lang.ClassLoader r1, java.io.File r2) throws java.io.IOException;

        protected abstract void scanJarFile(java.lang.ClassLoader r1, java.util.jar.JarFile r2) throws java.io.IOException;
    }

    static {
            java.lang.Class<com.google.common.reflect.ClassPath> r0 = com.google.common.reflect.ClassPath.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.reflect.ClassPath.logger = r0
            com.google.common.reflect.ClassPath$1 r0 = new com.google.common.reflect.ClassPath$1
            r0.<init>()
            com.google.common.reflect.ClassPath.IS_TOP_LEVEL = r0
            java.lang.String r0 = " "
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r0 = r0.omitEmptyStrings()
            com.google.common.reflect.ClassPath.CLASS_PATH_ATTRIBUTE_SEPARATOR = r0
            return
    }

    private ClassPath(com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> r1) {
            r0 = this;
            r0.<init>()
            r0.resources = r1
            return
    }

    static /* synthetic */ java.util.logging.Logger access$100() {
            java.util.logging.Logger r0 = com.google.common.reflect.ClassPath.logger
            return r0
    }

    static /* synthetic */ com.google.common.base.Splitter access$200() {
            com.google.common.base.Splitter r0 = com.google.common.reflect.ClassPath.CLASS_PATH_ATTRIBUTE_SEPARATOR
            return r0
    }

    public static com.google.common.reflect.ClassPath from(java.lang.ClassLoader r1) throws java.io.IOException {
            com.google.common.reflect.ClassPath$DefaultScanner r0 = new com.google.common.reflect.ClassPath$DefaultScanner
            r0.<init>()
            r0.scan(r1)
            com.google.common.reflect.ClassPath r1 = new com.google.common.reflect.ClassPath
            com.google.common.collect.ImmutableSet r0 = r0.getResources()
            r1.<init>(r0)
            return r1
    }

    @com.google.common.annotations.VisibleForTesting
    static java.lang.String getClassName(java.lang.String r2) {
            int r0 = r2.length()
            int r0 = r0 + (-6)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            r0 = 47
            r1 = 46
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    @com.google.common.annotations.VisibleForTesting
    static java.io.File toFile(java.net.URL r2) {
            java.lang.String r0 = r2.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            java.io.File r0 = new java.io.File     // Catch: java.net.URISyntaxException -> L17
            java.net.URI r1 = r2.toURI()     // Catch: java.net.URISyntaxException -> L17
            r0.<init>(r1)     // Catch: java.net.URISyntaxException -> L17
            return r0
        L17:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.getPath()
            r0.<init>(r2)
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getAllClasses() {
            r2 = this;
            com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath$ResourceInfo> r0 = r2.resources
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
            java.lang.Class<com.google.common.reflect.ClassPath$ClassInfo> r1 = com.google.common.reflect.ClassPath.ClassInfo.class
            com.google.common.collect.FluentIterable r0 = r0.filter(r1)
            com.google.common.collect.ImmutableSet r0 = r0.toSet()
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> getResources() {
            r1 = this;
            com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath$ResourceInfo> r0 = r1.resources
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses() {
            r2 = this;
            com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath$ResourceInfo> r0 = r2.resources
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
            java.lang.Class<com.google.common.reflect.ClassPath$ClassInfo> r1 = com.google.common.reflect.ClassPath.ClassInfo.class
            com.google.common.collect.FluentIterable r0 = r0.filter(r1)
            com.google.common.base.Predicate<com.google.common.reflect.ClassPath$ClassInfo> r1 = com.google.common.reflect.ClassPath.IS_TOP_LEVEL
            com.google.common.collect.FluentIterable r0 = r0.filter(r1)
            com.google.common.collect.ImmutableSet r0 = r0.toSet()
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses(java.lang.String r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.ImmutableSet r1 = r4.getTopLevelClasses()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            com.google.common.reflect.ClassPath$ClassInfo r2 = (com.google.common.reflect.ClassPath.ClassInfo) r2
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lf
            r0.add(r2)
            goto Lf
        L29:
            com.google.common.collect.ImmutableSet r5 = r0.build()
            return r5
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClassesRecursive(java.lang.String r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.ImmutableSet r1 = r4.getTopLevelClasses()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            com.google.common.reflect.ClassPath$ClassInfo r2 = (com.google.common.reflect.ClassPath.ClassInfo) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L20
            r0.add(r2)
            goto L20
        L3a:
            com.google.common.collect.ImmutableSet r5 = r0.build()
            return r5
    }
}
