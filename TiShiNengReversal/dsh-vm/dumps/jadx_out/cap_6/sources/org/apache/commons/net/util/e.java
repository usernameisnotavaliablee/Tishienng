package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(javax.net.ssl.SSLSocket r9) {
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            r1 = 0
            java.lang.String r2 = "javax.net.ssl.SSLParameters"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "setEndpointIdentificationAlgorithm"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L44
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "getSSLParameters"
            r6 = 0
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = "setSSLParameters"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L44
            r8[r1] = r2     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L44
            if (r5 == 0) goto L44
            if (r0 == 0) goto L44
            java.lang.Object r2 = r5.invoke(r9, r6)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L44
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "HTTPS"
            r5[r1] = r6     // Catch: java.lang.Throwable -> L44
            r3.invoke(r2, r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L44
            r3[r1] = r2     // Catch: java.lang.Throwable -> L44
            r0.invoke(r9, r3)     // Catch: java.lang.Throwable -> L44
            return r4
        L44:
            return r1
    }
}
