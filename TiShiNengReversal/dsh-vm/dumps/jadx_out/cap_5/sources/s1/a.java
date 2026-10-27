package s1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final javax.net.ssl.HostnameVerifier a = null;

    static {
            e2.b r0 = new e2.b
            r0.<init>()
            s1.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static javax.net.ssl.HostnameVerifier a() {
            javax.net.ssl.HostnameVerifier r0 = s1.a.a
            return r0
    }

    public static javax.net.ssl.SSLSocketFactory b(android.content.Context r3) {
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            r0.<init>()     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            com.huawei.hms.framework.network.grs.GrsApp r1 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            java.lang.String r2 = "/"
            java.lang.String r1 = r1.getBrand(r2)     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            r0.append(r1)     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            java.lang.String r1 = "grs_sp.bks"
            r0.append(r1)     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            java.lang.String r0 = r0.toString()     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            java.io.InputStream r3 = r3.open(r0)     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            com.huawei.secure.android.common.ssl.k r0 = new com.huawei.secure.android.common.ssl.k     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            java.lang.String r1 = ""
            r0.<init>(r3, r1)     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            com.huawei.secure.android.common.ssl.i r3 = new com.huawei.secure.android.common.ssl.i     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            r3.<init>(r0)     // Catch: java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L34
            return r3
        L30:
            r3 = move-exception
            goto L35
        L32:
            r3 = move-exception
            goto L35
        L34:
            r3 = move-exception
        L35:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r3)
            throw r0
    }
}
