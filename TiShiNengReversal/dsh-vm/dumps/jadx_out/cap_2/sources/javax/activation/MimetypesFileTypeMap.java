package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimetypesFileTypeMap extends javax.activation.FileTypeMap {
    private static final int PROG = 0;
    private static com.sun.activation.registries.f defDB = null;
    private static java.lang.String defaultType = "application/octet-stream";
    private com.sun.activation.registries.f[] DB;

    static {
            return
    }

    public MimetypesFileTypeMap() {
            r4 = this;
            r4.<init>()
            java.util.Vector r0 = new java.util.Vector
            r1 = 5
            r0.<init>(r1)
            r1 = 0
            r0.addElement(r1)
            java.lang.String r1 = "MimetypesFileTypeMap: load HOME"
            com.sun.activation.registries.b.b(r1)
            java.lang.String r1 = "user.home"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L36
            if (r1 == 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L36
            r2.<init>(r1)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.SecurityException -> L36
            r2.append(r1)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = ".mime.types"
            r2.append(r1)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = r2.toString()     // Catch: java.lang.SecurityException -> L36
            com.sun.activation.registries.f r1 = r4.loadFile(r1)     // Catch: java.lang.SecurityException -> L36
            if (r1 == 0) goto L36
            r0.addElement(r1)     // Catch: java.lang.SecurityException -> L36
        L36:
            java.lang.String r1 = "MimetypesFileTypeMap: load SYS"
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
            java.lang.String r2 = "mime.types"
            r1.append(r2)     // Catch: java.lang.SecurityException -> L69
            java.lang.String r1 = r1.toString()     // Catch: java.lang.SecurityException -> L69
            com.sun.activation.registries.f r1 = r4.loadFile(r1)     // Catch: java.lang.SecurityException -> L69
            if (r1 == 0) goto L69
            r0.addElement(r1)     // Catch: java.lang.SecurityException -> L69
        L69:
            java.lang.String r1 = "MimetypesFileTypeMap: load JAR"
            com.sun.activation.registries.b.b(r1)
            java.lang.String r1 = "mime.types"
            r4.loadAllResources(r0, r1)
            java.lang.String r1 = "MimetypesFileTypeMap: load DEF"
            com.sun.activation.registries.b.b(r1)
            java.lang.Class<javax.activation.MimetypesFileTypeMap> r1 = javax.activation.MimetypesFileTypeMap.class
            monitor-enter(r1)
            com.sun.activation.registries.f r2 = javax.activation.MimetypesFileTypeMap.defDB     // Catch: java.lang.Throwable -> L88
            if (r2 != 0) goto L8a
            java.lang.String r2 = "/mimetypes.default"
            com.sun.activation.registries.f r2 = r4.loadResource(r2)     // Catch: java.lang.Throwable -> L88
            javax.activation.MimetypesFileTypeMap.defDB = r2     // Catch: java.lang.Throwable -> L88
            goto L8a
        L88:
            r0 = move-exception
            goto L9e
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            com.sun.activation.registries.f r1 = javax.activation.MimetypesFileTypeMap.defDB
            if (r1 == 0) goto L92
            r0.addElement(r1)
        L92:
            int r1 = r0.size()
            com.sun.activation.registries.f[] r1 = new com.sun.activation.registries.f[r1]
            r4.DB = r1
            r0.copyInto(r1)
            return
        L9e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            throw r0
    }

    public MimetypesFileTypeMap(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            com.sun.activation.registries.f[] r0 = r2.DB     // Catch: java.io.IOException -> Ld
            com.sun.activation.registries.f r1 = new com.sun.activation.registries.f     // Catch: java.io.IOException -> Ld
            r1.<init>(r3)     // Catch: java.io.IOException -> Ld
            r3 = 0
            r0[r3] = r1     // Catch: java.io.IOException -> Ld
        Ld:
            return
    }

    public MimetypesFileTypeMap(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.sun.activation.registries.f[] r0 = r2.DB
            com.sun.activation.registries.f r1 = new com.sun.activation.registries.f
            r1.<init>(r3)
            r3 = 0
            r0[r3] = r1
            return
    }

    private void loadAllResources(java.util.Vector r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "MimetypesFileTypeMap: can't load "
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
            java.lang.String r3 = "MimetypesFileTypeMap: getResources"
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
            java.lang.String r6 = "MimetypesFileTypeMap: URL "
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
            com.sun.activation.registries.f r6 = new com.sun.activation.registries.f     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r9.addElement(r6)     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            r3 = 1
            boolean r6 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            if (r6 == 0) goto L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a java.lang.SecurityException -> L7c java.io.IOException -> L7e
            java.lang.String r7 = "MimetypesFileTypeMap: successfully loaded mime types from URL: "
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
            java.lang.String r7 = "MimetypesFileTypeMap: not loading mime types from URL: "
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
            if (r1 != 0) goto L10a
            java.lang.String r0 = "MimetypesFileTypeMap: !anyLoaded"
            com.sun.activation.registries.b.b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.sun.activation.registries.f r10 = r8.loadResource(r10)
            if (r10 == 0) goto L10a
            r9.addElement(r10)
        L10a:
            return
    }

    private com.sun.activation.registries.f loadFile(java.lang.String r2) {
            r1 = this;
            com.sun.activation.registries.f r0 = new com.sun.activation.registries.f     // Catch: java.io.IOException -> L6
            r0.<init>(r2)     // Catch: java.io.IOException -> L6
            return r0
        L6:
            r2 = 0
            return r2
    }

    private com.sun.activation.registries.f loadResource(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "MimetypesFileTypeMap: can't load "
            r1 = 0
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L52 java.lang.SecurityException -> L54 java.io.IOException -> L57
            java.io.InputStream r2 = javax.activation.SecuritySupport.getResourceAsStream(r2, r7)     // Catch: java.lang.Throwable -> L52 java.lang.SecurityException -> L54 java.io.IOException -> L57
            if (r2 == 0) goto L35
            com.sun.activation.registries.f r3 = new com.sun.activation.registries.f     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            boolean r4 = com.sun.activation.registries.b.a()     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.lang.SecurityException -> L2d java.io.IOException -> L2f
            java.lang.String r5 = "MimetypesFileTypeMap: successfully loaded mime types file: "
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
            java.lang.String r4 = "MimetypesFileTypeMap: not loading mime types file: "
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

    public synchronized void addMimeTypes(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            com.sun.activation.registries.f[] r0 = r3.DB     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L12
            com.sun.activation.registries.f r2 = new com.sun.activation.registries.f     // Catch: java.lang.Throwable -> L10
            r2.<init>()     // Catch: java.lang.Throwable -> L10
            r0[r1] = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r4 = move-exception
            goto L1b
        L12:
            com.sun.activation.registries.f[] r0 = r3.DB     // Catch: java.lang.Throwable -> L10
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L10
            r0.a(r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)
            return
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r4
    }

    @Override // javax.activation.FileTypeMap
    public java.lang.String getContentType(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = r0.getContentType(r1)
            return r1
    }

    @Override // javax.activation.FileTypeMap
    public synchronized java.lang.String getContentType(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "."
            int r0 = r4.lastIndexOf(r0)     // Catch: java.lang.Throwable -> Ld
            if (r0 >= 0) goto Lf
            java.lang.String r4 = javax.activation.MimetypesFileTypeMap.defaultType     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        Ld:
            r4 = move-exception
            goto L39
        Lf:
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)     // Catch: java.lang.Throwable -> Ld
            int r0 = r4.length()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L1f
            java.lang.String r4 = javax.activation.MimetypesFileTypeMap.defaultType     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        L1f:
            r0 = 0
        L20:
            com.sun.activation.registries.f[] r1 = r3.DB     // Catch: java.lang.Throwable -> Ld
            int r2 = r1.length     // Catch: java.lang.Throwable -> Ld
            if (r0 < r2) goto L29
            java.lang.String r4 = javax.activation.MimetypesFileTypeMap.defaultType     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        L29:
            r1 = r1[r0]     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L2e
            goto L36
        L2e:
            java.lang.String r1 = r1.b(r4)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L36
            monitor-exit(r3)
            return r1
        L36:
            int r0 = r0 + 1
            goto L20
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }
}
