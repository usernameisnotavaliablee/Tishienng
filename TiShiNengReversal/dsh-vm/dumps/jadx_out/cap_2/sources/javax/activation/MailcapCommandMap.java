package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MailcapCommandMap extends javax.activation.CommandMap {
    private static final int PROG = 0;
    private static com.sun.activation.registries.c defDB;
    private com.sun.activation.registries.c[] DB;

    static {
            return
    }

    public MailcapCommandMap() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r1 = 0
            r0.add(r1)
            java.lang.String r1 = "MailcapCommandMap: load HOME"
            com.sun.activation.registries.b.b(r1)
            java.lang.String r1 = "user.home"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L36
            if (r1 == 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L36
            r2.<init>(r1)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.SecurityException -> L36
            r2.append(r1)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = ".mailcap"
            r2.append(r1)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = r2.toString()     // Catch: java.lang.SecurityException -> L36
            com.sun.activation.registries.c r1 = r4.loadFile(r1)     // Catch: java.lang.SecurityException -> L36
            if (r1 == 0) goto L36
            r0.add(r1)     // Catch: java.lang.SecurityException -> L36
        L36:
            java.lang.String r1 = "MailcapCommandMap: load SYS"
            com.sun.activation.registries.b.b(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L69
            java.lang.String r2 = "java.home"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L69
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.SecurityException -> L69
            r1.<init>(r2)     // Catch: java.lang.SecurityException -> L69
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.SecurityException -> L69
            r1.append(r2)     // Catch: java.lang.SecurityException -> L69
            java.lang.String r3 = "lib"
            r1.append(r3)     // Catch: java.lang.SecurityException -> L69
            r1.append(r2)     // Catch: java.lang.SecurityException -> L69
            java.lang.String r2 = "mailcap"
            r1.append(r2)     // Catch: java.lang.SecurityException -> L69
            java.lang.String r1 = r1.toString()     // Catch: java.lang.SecurityException -> L69
            com.sun.activation.registries.c r1 = r4.loadFile(r1)     // Catch: java.lang.SecurityException -> L69
            if (r1 == 0) goto L69
            r0.add(r1)     // Catch: java.lang.SecurityException -> L69
        L69:
            java.lang.String r1 = "MailcapCommandMap: load JAR"
            com.sun.activation.registries.b.b(r1)
            java.lang.String r1 = "mailcap"
            r4.loadAllResources(r0, r1)
            java.lang.String r1 = "MailcapCommandMap: load DEF"
            com.sun.activation.registries.b.b(r1)
            java.lang.Class<javax.activation.MailcapCommandMap> r1 = javax.activation.MailcapCommandMap.class
            monitor-enter(r1)
            com.sun.activation.registries.c r2 = javax.activation.MailcapCommandMap.defDB     // Catch: java.lang.Throwable -> L88
            if (r2 != 0) goto L8a
            java.lang.String r2 = "mailcap.default"
            com.sun.activation.registries.c r2 = r4.loadResource(r2)     // Catch: java.lang.Throwable -> L88
            javax.activation.MailcapCommandMap.defDB = r2     // Catch: java.lang.Throwable -> L88
            goto L8a
        L88:
            r0 = move-exception
            goto La3
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            com.sun.activation.registries.c r1 = javax.activation.MailcapCommandMap.defDB
            if (r1 == 0) goto L92
            r0.add(r1)
        L92:
            int r1 = r0.size()
            com.sun.activation.registries.c[] r1 = new com.sun.activation.registries.c[r1]
            r4.DB = r1
            java.lang.Object[] r0 = r0.toArray(r1)
            com.sun.activation.registries.c[] r0 = (com.sun.activation.registries.c[]) r0
            r4.DB = r0
            return
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            throw r0
    }

    public MailcapCommandMap(java.io.InputStream r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "MailcapCommandMap: load PROG"
            com.sun.activation.registries.b.b(r0)
            com.sun.activation.registries.c[] r0 = r3.DB
            r1 = 0
            r2 = r0[r1]
            if (r2 != 0) goto L16
            com.sun.activation.registries.c r2 = new com.sun.activation.registries.c     // Catch: java.io.IOException -> L16
            r2.<init>(r4)     // Catch: java.io.IOException -> L16
            r0[r1] = r2     // Catch: java.io.IOException -> L16
        L16:
            return
    }

    public MailcapCommandMap(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MailcapCommandMap: load PROG from "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.sun.activation.registries.b.b(r0)
        L1a:
            com.sun.activation.registries.c[] r0 = r3.DB
            r1 = 0
            r2 = r0[r1]
            if (r2 != 0) goto L28
            com.sun.activation.registries.c r2 = new com.sun.activation.registries.c
            r2.<init>(r4)
            r0[r1] = r2
        L28:
            return
    }

    private void appendCmdsToList(java.util.Map r6, java.util.List r7) {
            r5 = this;
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lf
            return
        Lf:
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L26
            goto L8
        L26:
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            javax.activation.CommandInfo r4 = new javax.activation.CommandInfo
            r4.<init>(r1, r3)
            r7.add(r4)
            goto L1f
    }

    private void appendPrefCmdsToList(java.util.Map r5, java.util.List r6) {
            r4 = this;
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lf
            return
        Lf:
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4.checkForVerb(r6, r1)
            if (r2 != 0) goto L8
            java.lang.Object r2 = r5.get(r1)
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            javax.activation.CommandInfo r3 = new javax.activation.CommandInfo
            r3.<init>(r1, r2)
            r6.add(r3)
            goto L8
    }

    private boolean checkForVerb(java.util.List r2, java.lang.String r3) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.Object r0 = r2.next()
            javax.activation.CommandInfo r0 = (javax.activation.CommandInfo) r0
            java.lang.String r0 = r0.getCommandName()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4
            r2 = 1
            return r2
    }

    private javax.activation.DataContentHandler getDataContentHandler(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "Can't load DCH "
            boolean r1 = com.sun.activation.registries.b.a()
            if (r1 == 0) goto Ld
            java.lang.String r1 = "    got content-handler"
            com.sun.activation.registries.b.b(r1)
        Ld:
            boolean r1 = com.sun.activation.registries.b.a()
            if (r1 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "      class "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.sun.activation.registries.b.b(r1)
        L24:
            java.lang.ClassLoader r1 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.IllegalAccessException -> L37
            if (r1 != 0) goto L39
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.IllegalAccessException -> L37
            goto L39
        L33:
            r1 = move-exception
            goto L4b
        L35:
            r1 = move-exception
            goto L61
        L37:
            r1 = move-exception
            goto L77
        L39:
            java.lang.Class r1 = r1.loadClass(r4)     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.IllegalAccessException -> L37
        L42:
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.IllegalAccessException -> L37
            javax.activation.DataContentHandler r1 = (javax.activation.DataContentHandler) r1     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.IllegalAccessException -> L37
            return r1
        L4b:
            boolean r2 = com.sun.activation.registries.b.a()
            if (r2 == 0) goto L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.sun.activation.registries.b.c(r4, r1)
            goto L8c
        L61:
            boolean r2 = com.sun.activation.registries.b.a()
            if (r2 == 0) goto L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.sun.activation.registries.b.c(r4, r1)
            goto L8c
        L77:
            boolean r2 = com.sun.activation.registries.b.a()
            if (r2 == 0) goto L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.sun.activation.registries.b.c(r4, r1)
        L8c:
            r4 = 0
            return r4
    }

    private void loadAllResources(java.util.List r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "MailcapCommandMap: can't load "
            r1 = 0
            java.lang.ClassLoader r2 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch: java.lang.Exception -> L12
            if (r2 != 0) goto L15
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Exception -> L12
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L12
            goto L15
        L12:
            r2 = move-exception
            goto Ld7
        L15:
            if (r2 == 0) goto L1c
            java.net.URL[] r2 = javax.activation.SecuritySupport.getResources(r2, r10)     // Catch: java.lang.Exception -> L12
            goto L20
        L1c:
            java.net.URL[] r2 = javax.activation.SecuritySupport.getSystemResources(r10)     // Catch: java.lang.Exception -> L12
        L20:
            if (r2 == 0) goto Lec
            boolean r3 = com.sun.activation.registries.b.a()     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L2d
            java.lang.String r3 = "MailcapCommandMap: getResources"
            com.sun.activation.registries.b.b(r3)     // Catch: java.lang.Exception -> L12
        L2d:
            r3 = 0
        L2e:
            int r4 = r2.length     // Catch: java.lang.Exception -> L4e
            if (r1 < r4) goto L34
            r1 = r3
            goto Lec
        L34:
            r4 = r2[r1]     // Catch: java.lang.Exception -> L4e
            boolean r5 = com.sun.activation.registries.b.a()     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            java.lang.String r6 = "MailcapCommandMap: URL "
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4e
            r5.append(r4)     // Catch: java.lang.Exception -> L4e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4e
            com.sun.activation.registries.b.b(r5)     // Catch: java.lang.Exception -> L4e
            goto L52
        L4e:
            r2 = move-exception
            r1 = r3
            goto Ld7
        L52:
            r5 = 0
            java.io.InputStream r5 = javax.activation.SecuritySupport.openStream(r4)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            if (r5 == 0) goto L80
            com.sun.activation.registries.c r6 = new com.sun.activation.registries.c     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r9.add(r6)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r3 = 1
            boolean r6 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            if (r6 == 0) goto L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            java.lang.String r7 = "MailcapCommandMap: successfully loaded mailcap file from URL: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r6.append(r4)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            com.sun.activation.registries.b.b(r6)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            goto L97
        L7a:
            r1 = move-exception
            goto Ld1
        L7c:
            r6 = move-exception
            goto L9a
        L7e:
            r6 = move-exception
            goto Lb5
        L80:
            boolean r6 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            if (r6 == 0) goto L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            java.lang.String r7 = "MailcapCommandMap: not loading mailcap file from URL: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r6.append(r4)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            com.sun.activation.registries.b.b(r6)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
        L97:
            if (r5 == 0) goto Lcd
            goto Lb1
        L9a:
            boolean r7 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto Laf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            r7.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L7a
            com.sun.activation.registries.b.c(r4, r6)     // Catch: java.lang.Throwable -> L7a
        Laf:
            if (r5 == 0) goto Lcd
        Lb1:
            r5.close()     // Catch: java.lang.Exception -> L4e java.io.IOException -> Lcd
            goto Lcd
        Lb5:
            boolean r7 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto Lca
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            r7.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L7a
            com.sun.activation.registries.b.c(r4, r6)     // Catch: java.lang.Throwable -> L7a
        Lca:
            if (r5 == 0) goto Lcd
            goto Lb1
        Lcd:
            int r1 = r1 + 1
            goto L2e
        Ld1:
            if (r5 == 0) goto Ld6
            r5.close()     // Catch: java.lang.Exception -> L4e java.io.IOException -> Ld6
        Ld6:
            throw r1     // Catch: java.lang.Exception -> L4e
        Ld7:
            boolean r3 = com.sun.activation.registries.b.a()
            if (r3 == 0) goto Lec
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r10)
            java.lang.String r0 = r3.toString()
            com.sun.activation.registries.b.c(r0, r2)
        Lec:
            if (r1 != 0) goto L110
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto Lf9
            java.lang.String r0 = "MailcapCommandMap: !anyLoaded"
            com.sun.activation.registries.b.b(r0)
        Lf9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.sun.activation.registries.c r10 = r8.loadResource(r10)
            if (r10 == 0) goto L110
            r9.add(r10)
        L110:
            return
    }

    private com.sun.activation.registries.c loadFile(java.lang.String r2) {
            r1 = this;
            com.sun.activation.registries.c r0 = new com.sun.activation.registries.c     // Catch: java.io.IOException -> L6
            r0.<init>(r2)     // Catch: java.io.IOException -> L6
            return r0
        L6:
            r2 = 0
            return r2
    }

    private com.sun.activation.registries.c loadResource(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "MailcapCommandMap: can't load "
            r1 = 0
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L52 java.lang.SecurityException -> L54 java.io.IOException -> L57
            java.io.InputStream r2 = javax.activation.SecuritySupport.getResourceAsStream(r2, r7)     // Catch: java.lang.Throwable -> L52 java.lang.SecurityException -> L54 java.io.IOException -> L57
            if (r2 == 0) goto L35
            com.sun.activation.registries.c r3 = new com.sun.activation.registries.c     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            boolean r4 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            java.lang.String r5 = "MailcapCommandMap: successfully loaded mailcap file: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            r4.append(r7)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            com.sun.activation.registries.b.b(r4)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            goto L31
        L2a:
            r7 = move-exception
            r1 = r2
            goto L8b
        L2d:
            r3 = move-exception
            goto L5a
        L2f:
            r3 = move-exception
            goto L72
        L31:
            r2.close()     // Catch: java.io.IOException -> L34
        L34:
            return r3
        L35:
            boolean r3 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            if (r3 == 0) goto L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            java.lang.String r4 = "MailcapCommandMap: not loading mailcap file: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            r3.append(r7)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            com.sun.activation.registries.b.b(r3)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
        L4c:
            if (r2 == 0) goto L8a
        L4e:
            r2.close()     // Catch: java.io.IOException -> L8a
            goto L8a
        L52:
            r7 = move-exception
            goto L8b
        L54:
            r3 = move-exception
            r2 = r1
            goto L5a
        L57:
            r3 = move-exception
            r2 = r1
            goto L72
        L5a:
            boolean r4 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r4.append(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            com.sun.activation.registries.b.c(r7, r3)     // Catch: java.lang.Throwable -> L2a
        L6f:
            if (r2 == 0) goto L8a
            goto L4e
        L72:
            boolean r4 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L87
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r4.append(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            com.sun.activation.registries.b.c(r7, r3)     // Catch: java.lang.Throwable -> L2a
        L87:
            if (r2 == 0) goto L8a
            goto L4e
        L8a:
            return r1
        L8b:
            if (r1 == 0) goto L90
            r1.close()     // Catch: java.io.IOException -> L90
        L90:
            throw r7
    }

    public synchronized void addMailcap(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "MailcapCommandMap: add to PROG"
            com.sun.activation.registries.b.b(r0)     // Catch: java.lang.Throwable -> L15
            com.sun.activation.registries.c[] r0 = r3.DB     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            com.sun.activation.registries.c r2 = new com.sun.activation.registries.c     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            r0[r1] = r2     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L20
        L17:
            com.sun.activation.registries.c[] r0 = r3.DB     // Catch: java.lang.Throwable -> L15
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L15
            r0.a(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        L20:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    @Override // javax.activation.CommandMap
    public synchronized javax.activation.DataContentHandler createDataContentHandler(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "MailcapCommandMap: createDataContentHandler for "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            r0.append(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L19
            com.sun.activation.registries.b.b(r0)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r5 = move-exception
            goto Lb7
        L1c:
            if (r5 == 0) goto L24
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.Throwable -> L19
        L24:
            r0 = 0
            r1 = 0
        L26:
            com.sun.activation.registries.c[] r2 = r4.DB     // Catch: java.lang.Throwable -> L19
            int r3 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r1 < r3) goto L75
            r1 = 0
        L2c:
            com.sun.activation.registries.c[] r2 = r4.DB     // Catch: java.lang.Throwable -> L19
            int r3 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r1 < r3) goto L34
            monitor-exit(r4)
            r5 = 0
            return r5
        L34:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L39
            goto L72
        L39:
            boolean r2 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "  search fallback DB #"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r2.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19
            com.sun.activation.registries.b.b(r2)     // Catch: java.lang.Throwable -> L19
        L50:
            com.sun.activation.registries.c[] r2 = r4.DB     // Catch: java.lang.Throwable -> L19
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            java.util.Map r2 = r2.b(r5)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L72
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L19
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L72
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L19
            javax.activation.DataContentHandler r2 = r4.getDataContentHandler(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L72
            monitor-exit(r4)
            return r2
        L72:
            int r1 = r1 + 1
            goto L2c
        L75:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L7a
            goto Lb3
        L7a:
            boolean r2 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "  search DB #"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r2.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19
            com.sun.activation.registries.b.b(r2)     // Catch: java.lang.Throwable -> L19
        L91:
            com.sun.activation.registries.c[] r2 = r4.DB     // Catch: java.lang.Throwable -> L19
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L19
            java.util.Map r2 = r2.c(r5)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lb3
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L19
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L19
            javax.activation.DataContentHandler r2 = r4.getDataContentHandler(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lb3
            monitor-exit(r4)
            return r2
        Lb3:
            int r1 = r1 + 1
            goto L26
        Lb7:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r5
    }

    @Override // javax.activation.CommandMap
    public synchronized javax.activation.CommandInfo[] getAllCommands(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L11
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = r6.toLowerCase(r1)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r6 = move-exception
            goto L4d
        L11:
            r1 = 0
            r2 = 0
        L13:
            com.sun.activation.registries.c[] r3 = r5.DB     // Catch: java.lang.Throwable -> Lf
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lf
            if (r2 < r4) goto L3c
        L18:
            com.sun.activation.registries.c[] r2 = r5.DB     // Catch: java.lang.Throwable -> Lf
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lf
            if (r1 < r3) goto L2b
            int r6 = r0.size()     // Catch: java.lang.Throwable -> Lf
            javax.activation.CommandInfo[] r6 = new javax.activation.CommandInfo[r6]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch: java.lang.Throwable -> Lf
            javax.activation.CommandInfo[] r6 = (javax.activation.CommandInfo[]) r6     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            return r6
        L2b:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L30
            goto L39
        L30:
            java.util.Map r2 = r2.b(r6)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L39
            r5.appendCmdsToList(r2, r0)     // Catch: java.lang.Throwable -> Lf
        L39:
            int r1 = r1 + 1
            goto L18
        L3c:
            r3 = r3[r2]     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L41
            goto L4a
        L41:
            java.util.Map r3 = r3.c(r6)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L4a
            r5.appendCmdsToList(r3, r0)     // Catch: java.lang.Throwable -> Lf
        L4a:
            int r2 = r2 + 1
            goto L13
        L4d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }

    @Override // javax.activation.CommandMap
    public synchronized javax.activation.CommandInfo getCommand(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto Lc
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r5 = move-exception
            goto L66
        Lc:
            r0 = 0
            r1 = 0
        Le:
            com.sun.activation.registries.c[] r2 = r4.DB     // Catch: java.lang.Throwable -> La
            int r3 = r2.length     // Catch: java.lang.Throwable -> La
            if (r1 < r3) goto L41
            r1 = 0
        L14:
            com.sun.activation.registries.c[] r2 = r4.DB     // Catch: java.lang.Throwable -> La
            int r3 = r2.length     // Catch: java.lang.Throwable -> La
            if (r1 < r3) goto L1c
            monitor-exit(r4)
            r5 = 0
            return r5
        L1c:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L21
            goto L3e
        L21:
            java.util.Map r2 = r2.b(r5)     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> La
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L3e
            javax.activation.CommandInfo r5 = new javax.activation.CommandInfo     // Catch: java.lang.Throwable -> La
            r5.<init>(r6, r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return r5
        L3e:
            int r1 = r1 + 1
            goto L14
        L41:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L46
            goto L63
        L46:
            java.util.Map r2 = r2.c(r5)     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L63
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> La
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L63
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L63
            javax.activation.CommandInfo r5 = new javax.activation.CommandInfo     // Catch: java.lang.Throwable -> La
            r5.<init>(r6, r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return r5
        L63:
            int r1 = r1 + 1
            goto Le
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La
            throw r5
    }

    @Override // javax.activation.CommandMap
    public synchronized java.lang.String[] getMimeTypes() {
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            r2 = 0
        L8:
            com.sun.activation.registries.c[] r3 = r6.DB     // Catch: java.lang.Throwable -> L1b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L1b
            if (r2 < r4) goto L1d
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1b
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L1b
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r6)
            return r0
        L1b:
            r0 = move-exception
            goto L40
        L1d:
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L22
            goto L3d
        L22:
            java.lang.String[] r3 = r3.d()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L3d
            r4 = 0
        L29:
            int r5 = r3.length     // Catch: java.lang.Throwable -> L1b
            if (r4 < r5) goto L2d
            goto L3d
        L2d:
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L1b
            boolean r5 = r0.contains(r5)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3a
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L1b
            r0.add(r5)     // Catch: java.lang.Throwable -> L1b
        L3a:
            int r4 = r4 + 1
            goto L29
        L3d:
            int r2 = r2 + 1
            goto L8
        L40:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    public synchronized java.lang.String[] getNativeCommands(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L11
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r7.toLowerCase(r1)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r7 = move-exception
            goto L49
        L11:
            r1 = 0
            r2 = 0
        L13:
            com.sun.activation.registries.c[] r3 = r6.DB     // Catch: java.lang.Throwable -> Lf
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lf
            if (r2 < r4) goto L26
            int r7 = r0.size()     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object[] r7 = r0.toArray(r7)     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            return r7
        L26:
            r3 = r3[r2]     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            goto L46
        L2b:
            java.lang.String[] r3 = r3.e(r7)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L46
            r4 = 0
        L32:
            int r5 = r3.length     // Catch: java.lang.Throwable -> Lf
            if (r4 < r5) goto L36
            goto L46
        L36:
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lf
            boolean r5 = r0.contains(r5)     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L43
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lf
            r0.add(r5)     // Catch: java.lang.Throwable -> Lf
        L43:
            int r4 = r4 + 1
            goto L32
        L46:
            int r2 = r2 + 1
            goto L13
        L49:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf
            throw r7
    }

    @Override // javax.activation.CommandMap
    public synchronized javax.activation.CommandInfo[] getPreferredCommands(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L11
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = r6.toLowerCase(r1)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r6 = move-exception
            goto L4d
        L11:
            r1 = 0
            r2 = 0
        L13:
            com.sun.activation.registries.c[] r3 = r5.DB     // Catch: java.lang.Throwable -> Lf
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lf
            if (r2 < r4) goto L3c
        L18:
            com.sun.activation.registries.c[] r2 = r5.DB     // Catch: java.lang.Throwable -> Lf
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lf
            if (r1 < r3) goto L2b
            int r6 = r0.size()     // Catch: java.lang.Throwable -> Lf
            javax.activation.CommandInfo[] r6 = new javax.activation.CommandInfo[r6]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch: java.lang.Throwable -> Lf
            javax.activation.CommandInfo[] r6 = (javax.activation.CommandInfo[]) r6     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            return r6
        L2b:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L30
            goto L39
        L30:
            java.util.Map r2 = r2.b(r6)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L39
            r5.appendPrefCmdsToList(r2, r0)     // Catch: java.lang.Throwable -> Lf
        L39:
            int r1 = r1 + 1
            goto L18
        L3c:
            r3 = r3[r2]     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L41
            goto L4a
        L41:
            java.util.Map r3 = r3.c(r6)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L4a
            r5.appendPrefCmdsToList(r3, r0)     // Catch: java.lang.Throwable -> Lf
        L4a:
            int r2 = r2 + 1
            goto L13
        L4d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }
}
