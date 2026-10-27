package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class FileTypeMap {
    private static javax.activation.FileTypeMap defaultMap;

    static {
            return
    }

    public FileTypeMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.activation.FileTypeMap getDefaultFileTypeMap() {
            javax.activation.FileTypeMap r0 = javax.activation.FileTypeMap.defaultMap
            if (r0 != 0) goto Lb
            javax.activation.MimetypesFileTypeMap r0 = new javax.activation.MimetypesFileTypeMap
            r0.<init>()
            javax.activation.FileTypeMap.defaultMap = r0
        Lb:
            javax.activation.FileTypeMap r0 = javax.activation.FileTypeMap.defaultMap
            return r0
    }

    public static void setDefaultFileTypeMap(javax.activation.FileTypeMap r3) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L1d
            r0.checkSetFactory()     // Catch: java.lang.SecurityException -> La
            goto L1d
        La:
            r0 = move-exception
            java.lang.Class<javax.activation.FileTypeMap> r1 = javax.activation.FileTypeMap.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class r2 = r3.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r1 != r2) goto L1c
            goto L1d
        L1c:
            throw r0
        L1d:
            javax.activation.FileTypeMap.defaultMap = r3
            return
    }

    public abstract java.lang.String getContentType(java.io.File r1);

    public abstract java.lang.String getContentType(java.lang.String r1);
}
