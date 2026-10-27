package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Session {
    private static javax.mail.Session defaultSession;
    private final java.util.Properties addressMap;
    private final java.util.Hashtable authTable;
    private final javax.mail.Authenticator authenticator;
    private boolean debug;
    private java.io.PrintStream out;
    private final java.util.Properties props;
    private final java.util.Vector providers;
    private final java.util.Hashtable providersByClassName;
    private final java.util.Hashtable providersByProtocol;








    static {
            return
    }

    private Session(java.util.Properties r2, javax.mail.Authenticator r3) {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.authTable = r0
            r0 = 0
            r1.debug = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.providers = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.providersByProtocol = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.providersByClassName = r0
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1.addressMap = r0
            r1.props = r2
            r1.authenticator = r3
            java.lang.String r0 = "mail.debug"
            java.lang.String r2 = r2.getProperty(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L40
            r2 = 1
            r1.debug = r2
        L40:
            boolean r2 = r1.debug
            if (r2 == 0) goto L49
            java.lang.String r2 = "DEBUG: JavaMail version 1.4.1"
            r1.pr(r2)
        L49:
            if (r3 == 0) goto L50
            java.lang.Class r2 = r3.getClass()
            goto L52
        L50:
            java.lang.Class<javax.mail.Session> r2 = javax.mail.Session.class
        L52:
            r1.loadProviders(r2)
            r1.loadAddressMap(r2)
            return
    }

    static /* synthetic */ void access$0(javax.mail.Session r0, java.io.InputStream r1) throws java.io.IOException {
            r0.loadProvidersFromStream(r1)
            return
    }

    static /* synthetic */ java.util.Properties access$1(javax.mail.Session r0) {
            java.util.Properties r0 = r0.addressMap
            return r0
    }

    private static java.lang.ClassLoader getContextClassLoader() {
            javax.mail.Session$3 r0 = new javax.mail.Session$3
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    public static javax.mail.Session getDefaultInstance(java.util.Properties r1) {
            r0 = 0
            javax.mail.Session r1 = getDefaultInstance(r1, r0)
            return r1
    }

    public static synchronized javax.mail.Session getDefaultInstance(java.util.Properties r2, javax.mail.Authenticator r3) {
            java.lang.Class<javax.mail.Session> r0 = javax.mail.Session.class
            monitor-enter(r0)
            javax.mail.Session r1 = javax.mail.Session.defaultSession     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            javax.mail.Session r1 = new javax.mail.Session     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            javax.mail.Session.defaultSession = r1     // Catch: java.lang.Throwable -> Lf
            goto L2c
        Lf:
            r2 = move-exception
            goto L38
        L11:
            javax.mail.Authenticator r2 = r1.authenticator     // Catch: java.lang.Throwable -> Lf
            if (r2 != r3) goto L16
            goto L2c
        L16:
            if (r2 == 0) goto L30
            if (r3 == 0) goto L30
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> Lf
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> Lf
            if (r2 != r3) goto L30
        L2c:
            javax.mail.Session r2 = javax.mail.Session.defaultSession     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L30:
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Access to default session denied"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public static javax.mail.Session getInstance(java.util.Properties r2) {
            javax.mail.Session r0 = new javax.mail.Session
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static javax.mail.Session getInstance(java.util.Properties r1, javax.mail.Authenticator r2) {
            javax.mail.Session r0 = new javax.mail.Session
            r0.<init>(r1, r2)
            return r0
    }

    private static java.io.InputStream getResourceAsStream(java.lang.Class r1, java.lang.String r2) throws java.io.IOException {
            javax.mail.Session$4 r0 = new javax.mail.Session$4     // Catch: java.security.PrivilegedActionException -> Lc
            r0.<init>(r1, r2)     // Catch: java.security.PrivilegedActionException -> Lc
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Lc
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.security.PrivilegedActionException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.Exception r1 = r1.getException()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    private static java.net.URL[] getResources(java.lang.ClassLoader r1, java.lang.String r2) {
            javax.mail.Session$5 r0 = new javax.mail.Session$5
            r0.<init>(r1, r2)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.net.URL[] r1 = (java.net.URL[]) r1
            return r1
    }

    private java.lang.Object getService(javax.mail.Provider r8, javax.mail.URLName r9) throws javax.mail.NoSuchProviderException {
            r7 = this;
            if (r8 == 0) goto L87
            if (r9 != 0) goto L13
            javax.mail.URLName r0 = new javax.mail.URLName
            java.lang.String r1 = r8.getProtocol()
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = -1
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = r0
        L13:
            javax.mail.Authenticator r0 = r7.authenticator
            java.lang.Class<javax.mail.Session> r1 = javax.mail.Session.class
            if (r0 == 0) goto L22
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            goto L26
        L22:
            java.lang.ClassLoader r0 = r1.getClassLoader()
        L26:
            java.lang.ClassLoader r2 = getContextClassLoader()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L35
            java.lang.String r3 = r8.getClassName()     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L41
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L41
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 != 0) goto L49
            java.lang.String r2 = r8.getClassName()     // Catch: java.lang.Exception -> L41
            java.lang.Class r2 = r0.loadClass(r2)     // Catch: java.lang.Exception -> L41
            goto L49
        L41:
            java.lang.String r0 = r8.getClassName()     // Catch: java.lang.Exception -> L75
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L75
        L49:
            r0 = 2
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L63
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Exception -> L63
            java.lang.Class<javax.mail.URLName> r1 = javax.mail.URLName.class
            r5 = 1
            r3[r5] = r1     // Catch: java.lang.Exception -> L63
            java.lang.reflect.Constructor r1 = r2.getConstructor(r3)     // Catch: java.lang.Exception -> L63
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L63
            r0[r4] = r7     // Catch: java.lang.Exception -> L63
            r0[r5] = r9     // Catch: java.lang.Exception -> L63
            java.lang.Object r8 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L63
            return r8
        L63:
            boolean r9 = r7.debug
            if (r9 == 0) goto L6b
            r7.getDebugOut()
        L6b:
            javax.mail.NoSuchProviderException r9 = new javax.mail.NoSuchProviderException
            java.lang.String r8 = r8.getProtocol()
            r9.<init>(r8)
            throw r9
        L75:
            boolean r9 = r7.debug
            if (r9 == 0) goto L7d
            r7.getDebugOut()
        L7d:
            javax.mail.NoSuchProviderException r9 = new javax.mail.NoSuchProviderException
            java.lang.String r8 = r8.getProtocol()
            r9.<init>(r8)
            throw r9
        L87:
            javax.mail.NoSuchProviderException r8 = new javax.mail.NoSuchProviderException
            java.lang.String r9 = "null"
            r8.<init>(r9)
            throw r8
    }

    private javax.mail.Store getStore(javax.mail.Provider r3, javax.mail.URLName r4) throws javax.mail.NoSuchProviderException {
            r2 = this;
            if (r3 == 0) goto L19
            javax.mail.Provider$Type r0 = r3.getType()
            javax.mail.Provider$Type r1 = javax.mail.Provider.Type.STORE
            if (r0 != r1) goto L19
            java.lang.Object r3 = r2.getService(r3, r4)     // Catch: java.lang.ClassCastException -> L11
            javax.mail.Store r3 = (javax.mail.Store) r3     // Catch: java.lang.ClassCastException -> L11
            return r3
        L11:
            javax.mail.NoSuchProviderException r3 = new javax.mail.NoSuchProviderException
            java.lang.String r4 = "incorrect class"
            r3.<init>(r4)
            throw r3
        L19:
            javax.mail.NoSuchProviderException r3 = new javax.mail.NoSuchProviderException
            java.lang.String r4 = "invalid provider"
            r3.<init>(r4)
            throw r3
    }

    private static java.net.URL[] getSystemResources(java.lang.String r1) {
            javax.mail.Session$6 r0 = new javax.mail.Session$6
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.net.URL[] r1 = (java.net.URL[]) r1
            return r1
    }

    private javax.mail.Transport getTransport(javax.mail.Provider r3, javax.mail.URLName r4) throws javax.mail.NoSuchProviderException {
            r2 = this;
            if (r3 == 0) goto L19
            javax.mail.Provider$Type r0 = r3.getType()
            javax.mail.Provider$Type r1 = javax.mail.Provider.Type.TRANSPORT
            if (r0 != r1) goto L19
            java.lang.Object r3 = r2.getService(r3, r4)     // Catch: java.lang.ClassCastException -> L11
            javax.mail.Transport r3 = (javax.mail.Transport) r3     // Catch: java.lang.ClassCastException -> L11
            return r3
        L11:
            javax.mail.NoSuchProviderException r3 = new javax.mail.NoSuchProviderException
            java.lang.String r4 = "incorrect class"
            r3.<init>(r4)
            throw r3
        L19:
            javax.mail.NoSuchProviderException r3 = new javax.mail.NoSuchProviderException
            java.lang.String r4 = "invalid provider"
            r3.<init>(r4)
            throw r3
    }

    private void loadAddressMap(java.lang.Class r4) {
            r3 = this;
            javax.mail.Session$2 r0 = new javax.mail.Session$2
            r0.<init>(r3)
            java.lang.String r1 = "/META-INF/javamail.default.address.map"
            r3.loadResource(r1, r4, r0)
            java.lang.String r1 = "META-INF/javamail.address.map"
            r3.loadAllResources(r1, r4, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L38
            java.lang.String r1 = "java.home"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.SecurityException -> L38
            r4.<init>(r1)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.SecurityException -> L38
            r4.append(r1)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r2 = "lib"
            r4.append(r2)     // Catch: java.lang.SecurityException -> L38
            r4.append(r1)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r1 = "javamail.address.map"
            r4.append(r1)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r4 = r4.toString()     // Catch: java.lang.SecurityException -> L38
            r3.loadFile(r4, r0)     // Catch: java.lang.SecurityException -> L38
            goto L4e
        L38:
            r4 = move-exception
            boolean r0 = r3.debug
            if (r0 == 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DEBUG: can't get java.home: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.pr(r4)
        L4e:
            java.util.Properties r4 = r3.addressMap
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L68
            boolean r4 = r3.debug
            if (r4 == 0) goto L5f
            java.lang.String r4 = "DEBUG: failed to load address map, using defaults"
            r3.pr(r4)
        L5f:
            java.util.Properties r4 = r3.addressMap
            java.lang.String r0 = "rfc822"
            java.lang.String r1 = "smtp"
            r4.put(r0, r1)
        L68:
            return
    }

    private void loadAllResources(java.lang.String r9, java.lang.Class r10, javax.mail.StreamLoader r11) {
            r8 = this;
            java.lang.String r0 = "DEBUG: "
            r1 = 0
            java.lang.ClassLoader r2 = getContextClassLoader()     // Catch: java.lang.Exception -> Le
            if (r2 != 0) goto L11
            java.lang.ClassLoader r2 = r10.getClassLoader()     // Catch: java.lang.Exception -> Le
            goto L11
        Le:
            r2 = move-exception
            goto Lb9
        L11:
            if (r2 == 0) goto L18
            java.net.URL[] r2 = getResources(r2, r9)     // Catch: java.lang.Exception -> Le
            goto L1c
        L18:
            java.net.URL[] r2 = getSystemResources(r9)     // Catch: java.lang.Exception -> Le
        L1c:
            if (r2 == 0) goto Lcc
            r3 = 0
        L1f:
            int r4 = r2.length     // Catch: java.lang.Exception -> L3d
            if (r1 < r4) goto L25
            r1 = r3
            goto Lcc
        L25:
            r4 = r2[r1]     // Catch: java.lang.Exception -> L3d
            boolean r5 = r8.debug     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = "DEBUG: URL "
            r5.<init>(r6)     // Catch: java.lang.Exception -> L3d
            r5.append(r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L3d
            r8.pr(r5)     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r2 = move-exception
            r1 = r3
            goto Lb9
        L41:
            r5 = 0
            java.io.InputStream r5 = openStream(r4)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            if (r5 == 0) goto L68
            r11.load(r5)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            r3 = 1
            boolean r6 = r8.debug     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            if (r6 == 0) goto L7d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            java.lang.String r7 = "DEBUG: successfully loaded resource: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            r6.append(r4)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            r8.pr(r4)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            goto L7d
        L62:
            r1 = move-exception
            goto Lb3
        L64:
            r4 = move-exception
            goto L83
        L66:
            r4 = move-exception
            goto L99
        L68:
            boolean r6 = r8.debug     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            if (r6 == 0) goto L7d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            java.lang.String r7 = "DEBUG: not loading resource: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            r6.append(r4)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
            r8.pr(r4)     // Catch: java.lang.Throwable -> L62 java.lang.SecurityException -> L64 java.io.IOException -> L66
        L7d:
            if (r5 == 0) goto Laf
        L7f:
            r5.close()     // Catch: java.lang.Exception -> L3d java.io.IOException -> Laf
            goto Laf
        L83:
            boolean r6 = r8.debug     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62
            r6.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L62
            r8.pr(r4)     // Catch: java.lang.Throwable -> L62
        L96:
            if (r5 == 0) goto Laf
            goto L7f
        L99:
            boolean r6 = r8.debug     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto Lac
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62
            r6.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L62
            r8.pr(r4)     // Catch: java.lang.Throwable -> L62
        Lac:
            if (r5 == 0) goto Laf
            goto L7f
        Laf:
            int r1 = r1 + 1
            goto L1f
        Lb3:
            if (r5 == 0) goto Lb8
            r5.close()     // Catch: java.lang.Exception -> L3d java.io.IOException -> Lb8
        Lb8:
            throw r1     // Catch: java.lang.Exception -> L3d
        Lb9:
            boolean r3 = r8.debug
            if (r3 == 0) goto Lcc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r8.pr(r0)
        Lcc:
            if (r1 != 0) goto Le8
            boolean r0 = r8.debug
            if (r0 == 0) goto Ld7
            java.lang.String r0 = "DEBUG: !anyLoaded"
            r8.pr(r0)
        Ld7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.loadResource(r9, r10, r11)
        Le8:
            return
    }

    private void loadFile(java.lang.String r6, javax.mail.StreamLoader r7) {
            r5 = this;
            java.lang.String r0 = "DEBUG: "
            java.lang.String r1 = "DEBUG: not loading file: "
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37 java.io.IOException -> L39
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37 java.io.IOException -> L39
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37 java.io.IOException -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37 java.io.IOException -> L39
            r7.load(r3)     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            boolean r7 = r5.debug     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            if (r7 == 0) goto L31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            java.lang.String r2 = "DEBUG: successfully loaded file: "
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            r7.append(r6)     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            r5.pr(r7)     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L2b java.io.IOException -> L2e
            goto L31
        L28:
            r6 = move-exception
            r2 = r3
            goto L89
        L2b:
            r7 = move-exception
            r2 = r3
            goto L3b
        L2e:
            r7 = move-exception
            r2 = r3
            goto L63
        L31:
            r3.close()     // Catch: java.io.IOException -> L88
            return
        L35:
            r6 = move-exception
            goto L89
        L37:
            r7 = move-exception
            goto L3b
        L39:
            r7 = move-exception
            goto L63
        L3b:
            boolean r3 = r5.debug     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r3.append(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L35
            r5.pr(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            r5.pr(r6)     // Catch: java.lang.Throwable -> L35
        L5d:
            if (r2 == 0) goto L88
        L5f:
            r2.close()     // Catch: java.io.IOException -> L88
            goto L88
        L63:
            boolean r3 = r5.debug     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L85
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r3.append(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L35
            r5.pr(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            r5.pr(r6)     // Catch: java.lang.Throwable -> L35
        L85:
            if (r2 == 0) goto L88
            goto L5f
        L88:
            return
        L89:
            if (r2 == 0) goto L8e
            r2.close()     // Catch: java.io.IOException -> L8e
        L8e:
            throw r6
    }

    private void loadProviders(java.lang.Class r10) {
            r9 = this;
            javax.mail.Session$1 r1 = new javax.mail.Session$1
            r1.<init>(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r2 = "java.home"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.SecurityException -> L2e
            r0.<init>(r2)     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.SecurityException -> L2e
            r0.append(r2)     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r3 = "lib"
            r0.append(r3)     // Catch: java.lang.SecurityException -> L2e
            r0.append(r2)     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r2 = "javamail.providers"
            r0.append(r2)     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.SecurityException -> L2e
            r9.loadFile(r0, r1)     // Catch: java.lang.SecurityException -> L2e
            goto L44
        L2e:
            r0 = move-exception
            boolean r2 = r9.debug
            if (r2 == 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DEBUG: can't get java.home: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.pr(r0)
        L44:
            java.lang.String r0 = "META-INF/javamail.providers"
            r9.loadAllResources(r0, r10, r1)
            java.lang.String r0 = "/META-INF/javamail.default.providers"
            r9.loadResource(r0, r10, r1)
            java.util.Vector r10 = r9.providers
            int r10 = r10.size()
            if (r10 != 0) goto Lc6
            boolean r10 = r9.debug
            if (r10 == 0) goto L5f
            java.lang.String r10 = "DEBUG: failed to load any providers, using defaults"
            r9.pr(r10)
        L5f:
            javax.mail.Provider r0 = new javax.mail.Provider
            javax.mail.Provider$Type r2 = javax.mail.Provider.Type.STORE
            java.lang.String r4 = "Sun Microsystems, Inc."
            java.lang.String r5 = "1.4.1"
            r1 = r2
            java.lang.String r2 = "imap"
            java.lang.String r3 = "com.sun.mail.imap.IMAPStore"
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r1
            r9.addProvider(r0)
            javax.mail.Provider r1 = new javax.mail.Provider
            java.lang.String r5 = "Sun Microsystems, Inc."
            java.lang.String r6 = "1.4.1"
            java.lang.String r3 = "imaps"
            java.lang.String r4 = "com.sun.mail.imap.IMAPSSLStore"
            r1.<init>(r2, r3, r4, r5, r6)
            r9.addProvider(r1)
            javax.mail.Provider r1 = new javax.mail.Provider
            java.lang.String r5 = "Sun Microsystems, Inc."
            java.lang.String r6 = "1.4.1"
            java.lang.String r3 = "pop3"
            java.lang.String r4 = "com.sun.mail.pop3.POP3Store"
            r1.<init>(r2, r3, r4, r5, r6)
            r9.addProvider(r1)
            javax.mail.Provider r1 = new javax.mail.Provider
            java.lang.String r5 = "Sun Microsystems, Inc."
            java.lang.String r6 = "1.4.1"
            java.lang.String r3 = "pop3s"
            java.lang.String r4 = "com.sun.mail.pop3.POP3SSLStore"
            r1.<init>(r2, r3, r4, r5, r6)
            r9.addProvider(r1)
            javax.mail.Provider r2 = new javax.mail.Provider
            javax.mail.Provider$Type r3 = javax.mail.Provider.Type.TRANSPORT
            java.lang.String r6 = "Sun Microsystems, Inc."
            java.lang.String r7 = "1.4.1"
            java.lang.String r4 = "smtp"
            java.lang.String r5 = "com.sun.mail.smtp.SMTPTransport"
            r2.<init>(r3, r4, r5, r6, r7)
            r9.addProvider(r2)
            r4 = r3
            javax.mail.Provider r3 = new javax.mail.Provider
            java.lang.String r7 = "Sun Microsystems, Inc."
            java.lang.String r8 = "1.4.1"
            java.lang.String r5 = "smtps"
            java.lang.String r6 = "com.sun.mail.smtp.SMTPSSLTransport"
            r3.<init>(r4, r5, r6, r7, r8)
            r9.addProvider(r3)
        Lc6:
            boolean r10 = r9.debug
            if (r10 == 0) goto Lfd
            java.lang.String r10 = "DEBUG: Tables of loaded providers"
            r9.pr(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "DEBUG: Providers Listed By Class Name: "
            r10.<init>(r0)
            java.util.Hashtable r0 = r9.providersByClassName
            java.lang.String r0 = r0.toString()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.pr(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "DEBUG: Providers Listed By Protocol: "
            r10.<init>(r0)
            java.util.Hashtable r0 = r9.providersByProtocol
            java.lang.String r0 = r0.toString()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.pr(r10)
        Lfd:
            return
    }

    private void loadProvidersFromStream(java.io.InputStream r11) throws java.io.IOException {
            r10 = this;
            if (r11 == 0) goto Lce
            com.sun.mail.util.LineInputStream r0 = new com.sun.mail.util.LineInputStream
            r0.<init>(r11)
        L7:
            java.lang.String r11 = r0.readLine()
            if (r11 != 0) goto Lf
            goto Lce
        Lf:
            java.lang.String r1 = "#"
            boolean r1 = r11.startsWith(r1)
            if (r1 == 0) goto L18
            goto L7
        L18:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = ";"
            r1.<init>(r11, r2)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L25:
            boolean r2 = r1.hasMoreTokens()
            if (r2 != 0) goto L5d
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            if (r6 == 0) goto L47
            int r1 = r5.length()
            if (r1 <= 0) goto L47
            int r1 = r6.length()
            if (r1 > 0) goto L3e
            goto L47
        L3e:
            javax.mail.Provider r3 = new javax.mail.Provider
            r3.<init>(r4, r5, r6, r7, r8)
            r10.addProvider(r3)
            goto L7
        L47:
            boolean r1 = r10.debug
            if (r1 == 0) goto L7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DEBUG: Bad provider entry: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.pr(r11)
            goto L7
        L5d:
            java.lang.String r2 = r1.nextToken()
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "="
            int r3 = r2.indexOf(r3)
            java.lang.String r9 = "protocol="
            boolean r9 = r2.startsWith(r9)
            if (r9 == 0) goto L7a
            int r3 = r3 + 1
            java.lang.String r5 = r2.substring(r3)
            goto L25
        L7a:
            java.lang.String r9 = "type="
            boolean r9 = r2.startsWith(r9)
            if (r9 == 0) goto L9e
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "store"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L93
            javax.mail.Provider$Type r4 = javax.mail.Provider.Type.STORE
            goto L25
        L93:
            java.lang.String r3 = "transport"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L25
            javax.mail.Provider$Type r4 = javax.mail.Provider.Type.TRANSPORT
            goto L25
        L9e:
            java.lang.String r9 = "class="
            boolean r9 = r2.startsWith(r9)
            if (r9 == 0) goto Lae
            int r3 = r3 + 1
            java.lang.String r6 = r2.substring(r3)
            goto L25
        Lae:
            java.lang.String r9 = "vendor="
            boolean r9 = r2.startsWith(r9)
            if (r9 == 0) goto Lbe
            int r3 = r3 + 1
            java.lang.String r7 = r2.substring(r3)
            goto L25
        Lbe:
            java.lang.String r9 = "version="
            boolean r9 = r2.startsWith(r9)
            if (r9 == 0) goto L25
            int r3 = r3 + 1
            java.lang.String r8 = r2.substring(r3)
            goto L25
        Lce:
            return
    }

    private void loadResource(java.lang.String r3, java.lang.Class r4, javax.mail.StreamLoader r5) {
            r2 = this;
            java.lang.String r0 = "DEBUG: "
            r1 = 0
            java.io.InputStream r1 = getResourceAsStream(r4, r3)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            if (r1 == 0) goto L28
            r5.load(r1)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            boolean r4 = r2.debug     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            if (r4 == 0) goto L3d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            java.lang.String r5 = "DEBUG: successfully loaded resource: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            r4.append(r3)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            r2.pr(r3)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            goto L3d
        L22:
            r3 = move-exception
            goto L73
        L24:
            r3 = move-exception
            goto L43
        L26:
            r3 = move-exception
            goto L5c
        L28:
            boolean r4 = r2.debug     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            if (r4 == 0) goto L3d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            java.lang.String r5 = "DEBUG: not loading resource: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            r4.append(r3)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
            r2.pr(r3)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24 java.io.IOException -> L26
        L3d:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.io.IOException -> L72
            return
        L43:
            boolean r4 = r2.debug     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L56
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L22
            r2.pr(r3)     // Catch: java.lang.Throwable -> L22
        L56:
            if (r1 == 0) goto L72
        L58:
            r1.close()     // Catch: java.io.IOException -> L72
            goto L72
        L5c:
            boolean r4 = r2.debug     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L22
            r2.pr(r3)     // Catch: java.lang.Throwable -> L22
        L6f:
            if (r1 == 0) goto L72
            goto L58
        L72:
            return
        L73:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L78
        L78:
            throw r3
    }

    private static java.io.InputStream openStream(java.net.URL r1) throws java.io.IOException {
            javax.mail.Session$7 r0 = new javax.mail.Session$7     // Catch: java.security.PrivilegedActionException -> Lc
            r0.<init>(r1)     // Catch: java.security.PrivilegedActionException -> Lc
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Lc
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.security.PrivilegedActionException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.Exception r1 = r1.getException()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    private void pr(java.lang.String r1) {
            r0 = this;
            java.io.PrintStream r1 = r0.getDebugOut()
            r1.getClass()
            return
    }

    public synchronized void addProvider(javax.mail.Provider r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Vector r0 = r2.providers     // Catch: java.lang.Throwable -> L25
            r0.addElement(r3)     // Catch: java.lang.Throwable -> L25
            java.util.Hashtable r0 = r2.providersByClassName     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r3.getClassName()     // Catch: java.lang.Throwable -> L25
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L25
            java.util.Hashtable r0 = r2.providersByProtocol     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r3.getProtocol()     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            java.util.Hashtable r0 = r2.providersByProtocol     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r3.getProtocol()     // Catch: java.lang.Throwable -> L25
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r3 = move-exception
            goto L29
        L27:
            monitor-exit(r2)
            return
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public synchronized boolean getDebug() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.debug     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized java.io.PrintStream getDebugOut() {
            r1 = this;
            monitor-enter(r1)
            java.io.PrintStream r0 = r1.out     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto Lb
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return r0
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public javax.mail.Folder getFolder(javax.mail.URLName r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.Store r0 = r1.getStore(r2)
            r0.connect()
            javax.mail.Folder r2 = r0.getFolder(r2)
            return r2
    }

    public javax.mail.PasswordAuthentication getPasswordAuthentication(javax.mail.URLName r2) {
            r1 = this;
            java.util.Hashtable r0 = r1.authTable
            java.lang.Object r2 = r0.get(r2)
            javax.mail.PasswordAuthentication r2 = (javax.mail.PasswordAuthentication) r2
            return r2
    }

    public java.util.Properties getProperties() {
            r1 = this;
            java.util.Properties r0 = r1.props
            return r0
    }

    public java.lang.String getProperty(java.lang.String r2) {
            r1 = this;
            java.util.Properties r0 = r1.props
            java.lang.String r2 = r0.getProperty(r2)
            return r2
    }

    public synchronized javax.mail.Provider getProvider(java.lang.String r4) throws javax.mail.NoSuchProviderException {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L8b
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L42
            if (r0 <= 0) goto L8b
            java.util.Properties r0 = r3.props     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r1.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = ".class"
            r1.append(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.getProperty(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L4d
            boolean r1 = r3.debug     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "DEBUG: mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r1.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = ".class property exists and points to "
            r1.append(r2)     // Catch: java.lang.Throwable -> L42
            r1.append(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L42
            r3.pr(r1)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r4 = move-exception
            goto L93
        L44:
            java.util.Hashtable r1 = r3.providersByClassName     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L42
            javax.mail.Provider r0 = (javax.mail.Provider) r0     // Catch: java.lang.Throwable -> L42
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L52
            monitor-exit(r3)
            return r0
        L52:
            java.util.Hashtable r0 = r3.providersByProtocol     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L42
            javax.mail.Provider r0 = (javax.mail.Provider) r0     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            boolean r4 = r3.debug     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "DEBUG: getProvider() returning "
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r4.append(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L42
            r3.pr(r4)     // Catch: java.lang.Throwable -> L42
        L75:
            monitor-exit(r3)
            return r0
        L77:
            javax.mail.NoSuchProviderException r0 = new javax.mail.NoSuchProviderException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "No provider for "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r1.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L42
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L42
        L8b:
            javax.mail.NoSuchProviderException r4 = new javax.mail.NoSuchProviderException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Invalid protocol: null"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L93:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r4
    }

    public synchronized javax.mail.Provider[] getProviders() {
            r2 = this;
            monitor-enter(r2)
            java.util.Vector r0 = r2.providers     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            javax.mail.Provider[] r0 = new javax.mail.Provider[r0]     // Catch: java.lang.Throwable -> L10
            java.util.Vector r1 = r2.providers     // Catch: java.lang.Throwable -> L10
            r1.copyInto(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public javax.mail.Store getStore() throws javax.mail.NoSuchProviderException {
            r1 = this;
            java.lang.String r0 = "mail.store.protocol"
            java.lang.String r0 = r1.getProperty(r0)
            javax.mail.Store r0 = r1.getStore(r0)
            return r0
    }

    public javax.mail.Store getStore(java.lang.String r8) throws javax.mail.NoSuchProviderException {
            r7 = this;
            javax.mail.URLName r0 = new javax.mail.URLName
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = -1
            r4 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            javax.mail.Store r8 = r7.getStore(r0)
            return r8
    }

    public javax.mail.Store getStore(javax.mail.Provider r2) throws javax.mail.NoSuchProviderException {
            r1 = this;
            r0 = 0
            javax.mail.Store r2 = r1.getStore(r2, r0)
            return r2
    }

    public javax.mail.Store getStore(javax.mail.URLName r2) throws javax.mail.NoSuchProviderException {
            r1 = this;
            java.lang.String r0 = r2.getProtocol()
            javax.mail.Provider r0 = r1.getProvider(r0)
            javax.mail.Store r2 = r1.getStore(r0, r2)
            return r2
    }

    public javax.mail.Transport getTransport() throws javax.mail.NoSuchProviderException {
            r1 = this;
            java.lang.String r0 = "mail.transport.protocol"
            java.lang.String r0 = r1.getProperty(r0)
            javax.mail.Transport r0 = r1.getTransport(r0)
            return r0
    }

    public javax.mail.Transport getTransport(java.lang.String r8) throws javax.mail.NoSuchProviderException {
            r7 = this;
            javax.mail.URLName r0 = new javax.mail.URLName
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = -1
            r4 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            javax.mail.Transport r8 = r7.getTransport(r0)
            return r8
    }

    public javax.mail.Transport getTransport(javax.mail.Address r4) throws javax.mail.NoSuchProviderException {
            r3 = this;
            java.util.Properties r0 = r3.addressMap
            java.lang.String r1 = r4.getType()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L13
            javax.mail.Transport r4 = r3.getTransport(r0)
            return r4
        L13:
            javax.mail.NoSuchProviderException r0 = new javax.mail.NoSuchProviderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No provider for Address type: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getType()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public javax.mail.Transport getTransport(javax.mail.Provider r2) throws javax.mail.NoSuchProviderException {
            r1 = this;
            r0 = 0
            javax.mail.Transport r2 = r1.getTransport(r2, r0)
            return r2
    }

    public javax.mail.Transport getTransport(javax.mail.URLName r2) throws javax.mail.NoSuchProviderException {
            r1 = this;
            java.lang.String r0 = r2.getProtocol()
            javax.mail.Provider r0 = r1.getProvider(r0)
            javax.mail.Transport r2 = r1.getTransport(r0, r2)
            return r2
    }

    public javax.mail.PasswordAuthentication requestPasswordAuthentication(java.net.InetAddress r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            javax.mail.Authenticator r0 = r6.authenticator
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            javax.mail.PasswordAuthentication r7 = r0.requestPasswordAuthentication(r1, r2, r3, r4, r5)
            return r7
        Le:
            r7 = 0
            return r7
    }

    public synchronized void setDebug(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.debug = r1     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            java.lang.String r1 = "DEBUG: setDebug: JavaMail version 1.4.1"
            r0.pr(r1)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto Lf
        Ld:
            monitor-exit(r0)
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public synchronized void setDebugOut(java.io.PrintStream r1) {
            r0 = this;
            monitor-enter(r0)
            r0.out = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public void setPasswordAuthentication(javax.mail.URLName r2, javax.mail.PasswordAuthentication r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.Hashtable r3 = r1.authTable
            r3.remove(r2)
            return
        L8:
            java.util.Hashtable r0 = r1.authTable
            r0.put(r2, r3)
            return
    }

    public synchronized void setProtocolForAddress(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto Lb
            java.util.Properties r3 = r1.addressMap     // Catch: java.lang.Throwable -> L9
            r3.remove(r2)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r2 = move-exception
            goto L12
        Lb:
            java.util.Properties r0 = r1.addressMap     // Catch: java.lang.Throwable -> L9
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L9
        L10:
            monitor-exit(r1)
            return
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public synchronized void setProvider(javax.mail.Provider r4) throws javax.mail.NoSuchProviderException {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L30
            java.util.Hashtable r0 = r3.providersByProtocol     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r4.getProtocol()     // Catch: java.lang.Throwable -> L2e
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L2e
            java.util.Properties r0 = r3.props     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "mail."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r4.getProtocol()     // Catch: java.lang.Throwable -> L2e
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = ".class"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.getClassName()     // Catch: java.lang.Throwable -> L2e
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return
        L2e:
            r4 = move-exception
            goto L38
        L30:
            javax.mail.NoSuchProviderException r4 = new javax.mail.NoSuchProviderException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Can't set null provider"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r4
    }
}
