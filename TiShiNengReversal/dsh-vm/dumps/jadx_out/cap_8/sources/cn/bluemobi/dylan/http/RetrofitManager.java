package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RetrofitManager {
    private static volatile cn.bluemobi.dylan.http.RetrofitManager singleton;
    java.lang.String TAG;
    private final int TIMEOUT;
    private java.lang.Object apiService;
    private long currentTimeout;
    private java.util.concurrent.TimeUnit currentTimeoutUnit;
    private boolean debugMode;
    private long defaultTimeout;
    private java.util.concurrent.TimeUnit defaultTimeoutUnit;
    private javax.net.ssl.SSLSocketFactory factory;
    private java.util.List<okhttp3.Interceptor> interceptorList;
    private okhttp3.OkHttpClient mOkHttpClient;
    private okhttp3.OkHttpClient.Builder okhttpBuilder;
    private boolean overlockCard;
    private retrofit2.d0 retrofit;
    private retrofit2.d0.b retrofitBuilder;
    private java.lang.String secret;






    private RetrofitManager() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "Http"
            r4.TAG = r0
            r0 = 15
            r4.TIMEOUT = r0
            r0 = 1
            r4.debugMode = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.interceptorList = r1
            r1 = 30
            r4.defaultTimeout = r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r4.defaultTimeoutUnit = r3
            r4.currentTimeout = r1
            r4.currentTimeoutUnit = r3
            r4.overlockCard = r0
            return
    }

    static /* synthetic */ java.lang.String access$000(cn.bluemobi.dylan.http.RetrofitManager r0) {
            java.lang.String r0 = r0.secret
            return r0
    }

    static /* synthetic */ java.lang.String access$100(cn.bluemobi.dylan.http.RetrofitManager r0, okhttp3.MultipartBody.Part r1) {
            java.lang.String r0 = r0.getPartHeaders(r1)
            return r0
    }

    static /* synthetic */ java.lang.String access$200(cn.bluemobi.dylan.http.RetrofitManager r0, okhttp3.MultipartBody.Part r1) {
            java.lang.String r0 = r0.getRequestBody(r1)
            return r0
    }

    public static java.lang.String convertFileSize(long r6) {
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            float r6 = (float) r6
            float r7 = (float) r2
            float r6 = r6 / r7
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            java.lang.String r6 = "%.1f GB"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            return r6
        L1b:
            r2 = 1120403456(0x42c80000, float:100.0)
            r3 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 < 0) goto L3d
            float r6 = (float) r6
            float r7 = (float) r3
            float r6 = r6 / r7
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 <= 0) goto L2e
            java.lang.String r7 = "%.0f MB"
            goto L30
        L2e:
            java.lang.String r7 = "%.1f MB"
        L30:
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.String r6 = java.lang.String.format(r7, r1)
            return r6
        L3d:
            r3 = 1024(0x400, double:5.06E-321)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            float r6 = (float) r6
            float r7 = (float) r3
            float r6 = r6 / r7
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 <= 0) goto L4d
            java.lang.String r7 = "%.0f KB"
            goto L4f
        L4d:
            java.lang.String r7 = "%.1f KB"
        L4f:
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.String r6 = java.lang.String.format(r7, r1)
            return r6
        L5c:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            java.lang.String r6 = "%d B"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            return r6
    }

    public static java.lang.String formatDuring(long r6) {
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "ms"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        L18:
            r2 = 60000(0xea60, double:2.9644E-319)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r6 = r6 % r2
            long r6 = r6 / r0
            r4.append(r6)
            java.lang.String r6 = "s"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            return r6
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 % r4
            long r6 = r6 / r2
            r0.append(r6)
            java.lang.String r6 = "min"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    private java.lang.String getPartHeaders(okhttp3.MultipartBody.Part r4) {
            r3 = this;
            java.lang.String r0 = ""
            java.lang.Class r1 = r4.getClass()
            java.lang.String r2 = "headers"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            r2 = 1
            r1.setAccessible(r2)
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L35
            okhttp3.Headers r4 = (okhttp3.Headers) r4     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "content-disposition"
            java.lang.String r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = ";"
            java.lang.String[] r4 = r4.split(r1)     // Catch: java.lang.Throwable -> L35
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "="
            java.lang.String[] r4 = r4.split(r1)     // Catch: java.lang.Throwable -> L35
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "\""
            java.lang.String r4 = r4.replace(r1, r0)     // Catch: java.lang.Throwable -> L35
            return r4
        L35:
            return r0
    }

    private java.lang.String getRequestBody(okhttp3.MultipartBody.Part r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = "body"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Exception -> L52
            okhttp3.RequestBody r4 = (okhttp3.RequestBody) r4     // Catch: java.lang.Exception -> L52
            okhttp3.MediaType r0 = r4.contentType()     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r0.type()     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "multipart"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L3d
            okio.Buffer r1 = new okio.Buffer     // Catch: java.lang.Exception -> L52
            r1.<init>()     // Catch: java.lang.Exception -> L52
            r4.writeTo(r1)     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.lang.Exception -> L52
            java.nio.charset.Charset r4 = r0.charset(r4)     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = r1.readString(r4)     // Catch: java.lang.Exception -> L52
            return r4
        L3d:
            java.lang.String r0 = r0.type()     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "image"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            long r0 = r4.contentLength()     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = convertFileSize(r0)     // Catch: java.lang.Exception -> L52
            return r4
        L52:
            java.lang.String r4 = ""
            return r4
    }

    public static cn.bluemobi.dylan.http.RetrofitManager getRetrofitManager() {
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.singleton
            if (r0 != 0) goto L19
            java.lang.Class<cn.bluemobi.dylan.http.RetrofitManager> r0 = cn.bluemobi.dylan.http.RetrofitManager.class
            monitor-enter(r0)
            cn.bluemobi.dylan.http.RetrofitManager r1 = cn.bluemobi.dylan.http.RetrofitManager.singleton     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.bluemobi.dylan.http.RetrofitManager r1 = new cn.bluemobi.dylan.http.RetrofitManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.bluemobi.dylan.http.RetrofitManager.singleton = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.singleton
            return r0
    }

    private javax.net.ssl.SSLContext overlockCard() {
            r4 = this;
            cn.bluemobi.dylan.http.RetrofitManager$5 r0 = new cn.bluemobi.dylan.http.RetrofitManager$5
            r0.<init>(r4)
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            java.lang.String r2 = "SSL"
            javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch: java.lang.Exception -> L1b
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L1b
            r3.<init>()     // Catch: java.lang.Exception -> L1b
            r2.init(r0, r1, r3)     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            return r0
    }

    private javax.net.ssl.SSLSocketFactory setCertificates(java.io.InputStream... r10) {
            r9 = this;
            r0 = 0
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = java.security.KeyStore.getDefaultType()     // Catch: java.lang.Exception -> L51
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch: java.lang.Exception -> L51
            r2.load(r0)     // Catch: java.lang.Exception -> L51
            int r3 = r10.length     // Catch: java.lang.Exception -> L51
            r4 = 0
            r5 = 0
        L15:
            if (r4 >= r3) goto L2f
            r6 = r10[r4]     // Catch: java.lang.Exception -> L51
            int r7 = r5 + 1
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Exception -> L51
            java.security.cert.Certificate r8 = r1.generateCertificate(r6)     // Catch: java.lang.Exception -> L51
            r2.setCertificateEntry(r5, r8)     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L2b
            r6.close()     // Catch: java.io.IOException -> L2b java.lang.Exception -> L51
        L2b:
            int r4 = r4 + 1
            r5 = r7
            goto L15
        L2f:
            java.lang.String r10 = "TLS"
            javax.net.ssl.SSLContext r10 = javax.net.ssl.SSLContext.getInstance(r10)     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Exception -> L51
            javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)     // Catch: java.lang.Exception -> L51
            r1.init(r2)     // Catch: java.lang.Exception -> L51
            javax.net.ssl.TrustManager[] r1 = r1.getTrustManagers()     // Catch: java.lang.Exception -> L51
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            r10.init(r0, r1, r2)     // Catch: java.lang.Exception -> L51
            javax.net.ssl.SSLSocketFactory r10 = r10.getSocketFactory()     // Catch: java.lang.Exception -> L51
            return r10
        L51:
            return r0
    }

    public void addInterceptor(okhttp3.Interceptor r2) {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.interceptorList
            r0.add(r2)
            return
    }

    public void changeBaseUrl(java.lang.String r2) {
            r1 = this;
            retrofit2.d0$b r0 = r1.retrofitBuilder
            retrofit2.d0$b r2 = r0.c(r2)
            retrofit2.d0 r2 = r2.f()
            r1.retrofit = r2
            return
    }

    public <T> T getApiService() {
            r1 = this;
            java.lang.Object r0 = r1.apiService
            return r0
    }

    public <T> T getApiService(java.lang.Class<T> r6) {
            r5 = this;
            long r0 = r5.defaultTimeout
            long r2 = r5.currentTimeout
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            java.util.concurrent.TimeUnit r0 = r5.currentTimeoutUnit
            java.util.concurrent.TimeUnit r1 = r5.defaultTimeoutUnit
            if (r0 == r1) goto Lf
            goto L16
        Lf:
            retrofit2.d0 r0 = r5.retrofit
            java.lang.Object r6 = r0.g(r6)
            return r6
        L16:
            okhttp3.OkHttpClient$Builder r0 = r5.okhttpBuilder
            java.util.concurrent.TimeUnit r1 = r5.currentTimeoutUnit
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r2, r1)
            long r1 = r5.currentTimeout
            java.util.concurrent.TimeUnit r3 = r5.currentTimeoutUnit
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            long r1 = r5.currentTimeout
            java.util.concurrent.TimeUnit r3 = r5.currentTimeoutUnit
            r0.writeTimeout(r1, r3)
            retrofit2.d0$b r0 = r5.retrofitBuilder
            okhttp3.OkHttpClient$Builder r1 = r5.okhttpBuilder
            okhttp3.OkHttpClient r1 = r1.build()
            retrofit2.d0$b r0 = r0.j(r1)
            retrofit2.d0 r0 = r0.f()
            r5.retrofit = r0
            java.lang.Object r6 = r0.g(r6)
            okhttp3.OkHttpClient$Builder r0 = r5.okhttpBuilder
            long r1 = r5.defaultTimeout
            java.util.concurrent.TimeUnit r3 = r5.defaultTimeoutUnit
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r1, r3)
            long r1 = r5.defaultTimeout
            java.util.concurrent.TimeUnit r3 = r5.defaultTimeoutUnit
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            long r1 = r5.defaultTimeout
            java.util.concurrent.TimeUnit r3 = r5.defaultTimeoutUnit
            r0.writeTimeout(r1, r3)
            retrofit2.d0$b r0 = r5.retrofitBuilder
            okhttp3.OkHttpClient$Builder r1 = r5.okhttpBuilder
            okhttp3.OkHttpClient r1 = r1.build()
            retrofit2.d0$b r0 = r0.j(r1)
            retrofit2.d0 r0 = r0.f()
            r5.retrofit = r0
            long r0 = r5.defaultTimeout
            r5.currentTimeout = r0
            java.util.concurrent.TimeUnit r0 = r5.defaultTimeoutUnit
            r5.currentTimeoutUnit = r0
            return r6
    }

    public <T> void initRetrofit(java.lang.Class<T> r7, java.lang.String r8) {
            r6 = this;
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r6.mOkHttpClient = r0
            cn.bluemobi.dylan.http.RetrofitManager$1 r0 = new cn.bluemobi.dylan.http.RetrofitManager$1
            r0.<init>(r6)
            cn.bluemobi.dylan.http.RetrofitManager$2 r1 = new cn.bluemobi.dylan.http.RetrofitManager$2
            r1.<init>(r6)
            okhttp3.OkHttpClient$Builder r2 = new okhttp3.OkHttpClient$Builder
            r2.<init>()
            r6.okhttpBuilder = r2
            long r3 = r6.defaultTimeout
            java.util.concurrent.TimeUnit r5 = r6.defaultTimeoutUnit
            okhttp3.OkHttpClient$Builder r2 = r2.readTimeout(r3, r5)
            long r3 = r6.defaultTimeout
            java.util.concurrent.TimeUnit r5 = r6.defaultTimeoutUnit
            okhttp3.OkHttpClient$Builder r2 = r2.connectTimeout(r3, r5)
            long r3 = r6.defaultTimeout
            java.util.concurrent.TimeUnit r5 = r6.defaultTimeoutUnit
            r2.writeTimeout(r3, r5)
            java.util.List<okhttp3.Interceptor> r2 = r6.interceptorList
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()
            okhttp3.Interceptor r3 = (okhttp3.Interceptor) r3
            okhttp3.OkHttpClient$Builder r4 = r6.okhttpBuilder
            r4.addInterceptor(r3)
            goto L35
        L47:
            okhttp3.OkHttpClient$Builder r2 = r6.okhttpBuilder
            r2.addInterceptor(r0)
            boolean r0 = r6.debugMode
            if (r0 == 0) goto L55
            okhttp3.OkHttpClient$Builder r0 = r6.okhttpBuilder
            r0.addInterceptor(r1)
        L55:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L95
            r1 = 21
            if (r0 <= r1) goto L95
            cn.bluemobi.dylan.http.RetrofitManager$3 r0 = new cn.bluemobi.dylan.http.RetrofitManager$3     // Catch: java.lang.Throwable -> L95
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "SSL"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Throwable -> L95
            r2 = 1
            javax.net.ssl.TrustManager[] r2 = new javax.net.ssl.TrustManager[r2]     // Catch: java.lang.Throwable -> L95
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L95
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L95
            r4 = 0
            r1.init(r4, r2, r3)     // Catch: java.lang.Throwable -> L95
            javax.net.ssl.SSLSocketFactory r1 = r1.getSocketFactory()     // Catch: java.lang.Throwable -> L95
            boolean r2 = r6.overlockCard     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L8c
            okhttp3.OkHttpClient$Builder r2 = r6.okhttpBuilder     // Catch: java.lang.Throwable -> L95
            okhttp3.OkHttpClient$Builder r0 = r2.sslSocketFactory(r1, r0)     // Catch: java.lang.Throwable -> L95
            cn.bluemobi.dylan.http.RetrofitManager$4 r1 = new cn.bluemobi.dylan.http.RetrofitManager$4     // Catch: java.lang.Throwable -> L95
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L95
            r0.hostnameVerifier(r1)     // Catch: java.lang.Throwable -> L95
            goto L95
        L8c:
            javax.net.ssl.SSLSocketFactory r1 = r6.factory     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L95
            okhttp3.OkHttpClient$Builder r2 = r6.okhttpBuilder     // Catch: java.lang.Throwable -> L95
            r2.sslSocketFactory(r1, r0)     // Catch: java.lang.Throwable -> L95
        L95:
            okhttp3.OkHttpClient$Builder r0 = r6.okhttpBuilder
            okhttp3.OkHttpClient r0 = r0.build()
            r6.mOkHttpClient = r0
            retrofit2.d0$b r0 = new retrofit2.d0$b
            r0.<init>()
            r6.retrofitBuilder = r0
            retrofit2.d0$b r8 = r0.c(r8)
            retrofit2.adapter.rxjava.h r0 = retrofit2.adapter.rxjava.h.d()
            retrofit2.d0$b r8 = r8.a(r0)
            okhttp3.OkHttpClient r0 = r6.mOkHttpClient
            retrofit2.d0$b r8 = r8.j(r0)
            retrofit2.d0 r8 = r8.f()
            r6.retrofit = r8
            java.lang.Object r7 = r8.g(r7)
            r6.apiService = r7
            return
    }

    public void setDebugMode(boolean r1) {
            r0 = this;
            r0.debugMode = r1
            return
    }

    public void setDefaultTimeout(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            r1.defaultTimeout = r2
            r1.defaultTimeoutUnit = r4
            retrofit2.d0$b r0 = r1.retrofitBuilder
            if (r0 == 0) goto L2f
            okhttp3.OkHttpClient$Builder r0 = r1.okhttpBuilder
            okhttp3.OkHttpClient$Builder r2 = r0.readTimeout(r2, r4)
            long r3 = r1.defaultTimeout
            java.util.concurrent.TimeUnit r0 = r1.defaultTimeoutUnit
            okhttp3.OkHttpClient$Builder r2 = r2.connectTimeout(r3, r0)
            long r3 = r1.defaultTimeout
            java.util.concurrent.TimeUnit r0 = r1.defaultTimeoutUnit
            r2.writeTimeout(r3, r0)
            retrofit2.d0$b r2 = r1.retrofitBuilder
            okhttp3.OkHttpClient$Builder r3 = r1.okhttpBuilder
            okhttp3.OkHttpClient r3 = r3.build()
            retrofit2.d0$b r2 = r2.j(r3)
            retrofit2.d0 r2 = r2.f()
            r1.retrofit = r2
        L2f:
            return
    }

    public void setOverlockCard(boolean r1) {
            r0 = this;
            r0.overlockCard = r1
            return
    }

    public void setSSLSocketFactory(java.io.InputStream... r1) {
            r0 = this;
            javax.net.ssl.SSLSocketFactory r1 = r0.setCertificates(r1)
            r0.factory = r1
            return
    }

    public void setSecret(java.lang.String r1) {
            r0 = this;
            r0.secret = r1
            return
    }

    public void setTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.currentTimeout = r1
            r0.currentTimeoutUnit = r3
            return
    }
}
