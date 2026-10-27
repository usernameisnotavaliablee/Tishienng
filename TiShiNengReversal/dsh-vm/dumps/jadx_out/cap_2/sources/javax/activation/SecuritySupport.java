package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class SecuritySupport {






    private SecuritySupport() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.ClassLoader getContextClassLoader() {
            javax.activation.SecuritySupport$1 r0 = new javax.activation.SecuritySupport$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    public static java.io.InputStream getResourceAsStream(java.lang.Class r1, java.lang.String r2) throws java.io.IOException {
            javax.activation.SecuritySupport$2 r0 = new javax.activation.SecuritySupport$2     // Catch: java.security.PrivilegedActionException -> Lc
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

    public static java.net.URL[] getResources(java.lang.ClassLoader r1, java.lang.String r2) {
            javax.activation.SecuritySupport$3 r0 = new javax.activation.SecuritySupport$3
            r0.<init>(r1, r2)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.net.URL[] r1 = (java.net.URL[]) r1
            return r1
    }

    public static java.net.URL[] getSystemResources(java.lang.String r1) {
            javax.activation.SecuritySupport$4 r0 = new javax.activation.SecuritySupport$4
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.net.URL[] r1 = (java.net.URL[]) r1
            return r1
    }

    public static java.io.InputStream openStream(java.net.URL r1) throws java.io.IOException {
            javax.activation.SecuritySupport$5 r0 = new javax.activation.SecuritySupport$5     // Catch: java.security.PrivilegedActionException -> Lc
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
}
