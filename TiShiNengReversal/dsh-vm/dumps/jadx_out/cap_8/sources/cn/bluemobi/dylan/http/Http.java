package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Http {
    private static cn.bluemobi.dylan.http.CustomResponse customResponse;
    private static volatile cn.bluemobi.dylan.http.Http http;
    private static cn.bluemobi.dylan.http.ResponseInterceptor responseInterceptor;
    private final java.lang.String TAG;
    private boolean debugMode;
    private java.lang.Integer loadingDialogLayoutId;

    static {
            return
    }

    private Http() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "HTTP"
            r1.TAG = r0
            r0 = 0
            r1.loadingDialogLayoutId = r0
            return
    }

    public static void changeBaseUrl(java.lang.String r1) {
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.changeBaseUrl(r1)
            return
    }

    public static <T> T getApiService(java.lang.Class<T> r1) {
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            java.lang.Object r1 = r0.getApiService(r1)
            return r1
    }

    public static cn.bluemobi.dylan.http.Http getHttp() {
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.http
            if (r0 != 0) goto L19
            java.lang.Class<cn.bluemobi.dylan.http.Http> r0 = cn.bluemobi.dylan.http.Http.class
            monitor-enter(r0)
            cn.bluemobi.dylan.http.Http r1 = cn.bluemobi.dylan.http.Http.http     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.bluemobi.dylan.http.Http r1 = new cn.bluemobi.dylan.http.Http     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.bluemobi.dylan.http.Http.http = r1     // Catch: java.lang.Throwable -> L13
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
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.http
            return r0
    }

    public static cn.bluemobi.dylan.http.HttpRequest with(android.content.Context r1) {
            cn.bluemobi.dylan.http.HttpRequest r0 = new cn.bluemobi.dylan.http.HttpRequest
            r0.<init>(r1)
            cn.bluemobi.dylan.http.ResponseInterceptor r1 = cn.bluemobi.dylan.http.Http.responseInterceptor
            if (r1 == 0) goto Lc
            r0.setResponseInterceptor(r1)
        Lc:
            cn.bluemobi.dylan.http.CustomResponse r1 = cn.bluemobi.dylan.http.Http.customResponse
            if (r1 == 0) goto L13
            r0.setCustomResponse(r1)
        L13:
            return r0
    }

    public cn.bluemobi.dylan.http.Http addInterceptor(okhttp3.Interceptor r2) {
            r1 = this;
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.addInterceptor(r2)
            return r1
    }

    public java.lang.Integer getLoadingDialogLayoutId() {
            r1 = this;
            java.lang.Integer r0 = r1.loadingDialogLayoutId
            return r0
    }

    public <T> cn.bluemobi.dylan.http.Http init(java.lang.Class<T> r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r1 = this;
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.initRetrofit(r2, r3)
            cn.bluemobi.dylan.http.JsonParse r2 = cn.bluemobi.dylan.http.JsonParse.getJsonParse()
            r2.initJson(r4, r5, r6, r7)
            cn.bluemobi.dylan.http.Http r2 = cn.bluemobi.dylan.http.Http.http
            return r2
    }

    public boolean isDebugMode() {
            r1 = this;
            boolean r0 = r1.debugMode
            return r0
    }

    public void setCustomResponse(cn.bluemobi.dylan.http.CustomResponse r1) {
            r0 = this;
            cn.bluemobi.dylan.http.Http.customResponse = r1
            return
    }

    public cn.bluemobi.dylan.http.Http setDebugMode(boolean r2) {
            r1 = this;
            r1.debugMode = r2
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.setDebugMode(r2)
            cn.bluemobi.dylan.http.Http r2 = cn.bluemobi.dylan.http.Http.http
            return r2
    }

    public cn.bluemobi.dylan.http.Http setDefaultTimeout(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.setDefaultTimeout(r2, r4)
            return r1
    }

    public cn.bluemobi.dylan.http.Http setErrorMessage(java.lang.String r2) {
            r1 = this;
            cn.bluemobi.dylan.http.MessageManager r0 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            r0.setErrorMessage(r2)
            cn.bluemobi.dylan.http.Http r2 = cn.bluemobi.dylan.http.Http.http
            return r2
    }

    public void setLoadingDialog(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.loadingDialogLayoutId = r1
            return
    }

    public void setResponseInterceptor(cn.bluemobi.dylan.http.ResponseInterceptor r1) {
            r0 = this;
            cn.bluemobi.dylan.http.Http.responseInterceptor = r1
            return
    }

    public cn.bluemobi.dylan.http.Http setSecret(java.lang.String r2) {
            r1 = this;
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.setSecret(r2)
            return r1
    }

    public cn.bluemobi.dylan.http.Http setShowMessageModel(cn.bluemobi.dylan.http.MessageManager.MessageModel r2) {
            r1 = this;
            cn.bluemobi.dylan.http.MessageManager r0 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            r0.setShowMessageModel(r2)
            cn.bluemobi.dylan.http.Http r2 = cn.bluemobi.dylan.http.Http.http
            return r2
    }

    public cn.bluemobi.dylan.http.Http setUseEnglishLanguage(boolean r2) {
            r1 = this;
            cn.bluemobi.dylan.http.MessageManager r0 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            r0.setUseEnglishLanguage(r2)
            cn.bluemobi.dylan.http.Http r2 = cn.bluemobi.dylan.http.Http.http
            return r2
    }
}
