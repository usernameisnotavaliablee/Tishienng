package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HttpRequest {
    private boolean canCancel;
    private java.lang.ref.WeakReference<android.content.Context> context;
    private cn.bluemobi.dylan.http.CustomResponse customResponse;
    private cn.bluemobi.dylan.http.HttpJsonKey httpJsonKey;
    private boolean isShowFailMessage;
    private boolean isShowLoadingDialog;
    private boolean isShowOtherStatusMessage;
    private boolean isShowSuccessMessage;
    private cn.bluemobi.dylan.http.dialog.LoadingDialog loadingDialog;
    private java.lang.String loadingMessage;
    private rx.e<? extends retrofit2.c0<okhttp3.ResponseBody>> observable;
    private cn.bluemobi.dylan.http.ResponseInterceptor responseInterceptor;




    public HttpRequest(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.isShowLoadingDialog = r0
            r1 = 0
            r2.loadingDialog = r1
            r2.isShowSuccessMessage = r0
            r2.isShowOtherStatusMessage = r0
            r2.isShowFailMessage = r0
            r2.canCancel = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.context = r0
            cn.bluemobi.dylan.http.JsonParse r3 = cn.bluemobi.dylan.http.JsonParse.getJsonParse()
            r2.httpJsonKey = r3
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.http.dialog.LoadingDialog access$000(cn.bluemobi.dylan.http.HttpRequest r0) {
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r0.loadingDialog
            return r0
    }

    static /* synthetic */ java.lang.String access$100(cn.bluemobi.dylan.http.HttpRequest r0) {
            java.lang.String r0 = r0.loadingMessage
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.http.CustomResponse access$200(cn.bluemobi.dylan.http.HttpRequest r0) {
            cn.bluemobi.dylan.http.CustomResponse r0 = r0.customResponse
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.http.ResponseInterceptor access$300(cn.bluemobi.dylan.http.HttpRequest r0) {
            cn.bluemobi.dylan.http.ResponseInterceptor r0 = r0.responseInterceptor
            return r0
    }

    static /* synthetic */ boolean access$400(cn.bluemobi.dylan.http.HttpRequest r0) {
            boolean r0 = r0.isShowFailMessage
            return r0
    }

    static /* synthetic */ java.util.Map access$500(cn.bluemobi.dylan.http.HttpRequest r0, okhttp3.Request r1) {
            java.util.Map r0 = r0.getRequestParement(r1)
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.http.HttpJsonKey access$600(cn.bluemobi.dylan.http.HttpRequest r0) {
            cn.bluemobi.dylan.http.HttpJsonKey r0 = r0.httpJsonKey
            return r0
    }

    static /* synthetic */ boolean access$700(cn.bluemobi.dylan.http.HttpRequest r0) {
            boolean r0 = r0.isShowSuccessMessage
            return r0
    }

    static /* synthetic */ boolean access$800(cn.bluemobi.dylan.http.HttpRequest r0) {
            boolean r0 = r0.isShowOtherStatusMessage
            return r0
    }

    static /* synthetic */ java.lang.ref.WeakReference access$900(cn.bluemobi.dylan.http.HttpRequest r0) {
            java.lang.ref.WeakReference<android.content.Context> r0 = r0.context
            return r0
    }

    private void addLifeCycle(android.content.Context r2, rx.m r3) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L13
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            com.bjtsn.dylan.lifecycleobserver.LifecycleObserver r0 = new com.bjtsn.dylan.lifecycleobserver.LifecycleObserver
            r0.<init>(r2)
            cn.bluemobi.dylan.http.HttpRequest$3 r2 = new cn.bluemobi.dylan.http.HttpRequest$3
            r2.<init>(r1, r3)
            r0.c(r2)
        L13:
            return
    }

    private java.lang.String convertFileSize(long r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            float r7 = (float) r7
            float r8 = (float) r2
            float r7 = r7 / r8
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "%.1f GB"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
        L1b:
            r2 = 1120403456(0x42c80000, float:100.0)
            r3 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L3d
            float r7 = (float) r7
            float r8 = (float) r3
            float r7 = r7 / r8
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L2e
            java.lang.String r8 = "%.0f MB"
            goto L30
        L2e:
            java.lang.String r8 = "%.1f MB"
        L30:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1)
            return r7
        L3d:
            r3 = 1024(0x400, double:5.06E-321)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            float r7 = (float) r7
            float r8 = (float) r3
            float r7 = r7 / r8
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L4d
            java.lang.String r8 = "%.0f KB"
            goto L4f
        L4d:
            java.lang.String r8 = "%.1f KB"
        L4f:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1)
            return r7
        L5c:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "%d B"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
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
            java.lang.String r4 = r3.convertFileSize(r0)     // Catch: java.lang.Exception -> L52
            return r4
        L52:
            java.lang.String r4 = ""
            return r4
    }

    private java.util.Map<java.lang.String, java.lang.Object> getRequestParement(okhttp3.Request r6) {
            r5 = this;
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            okhttp3.RequestBody r1 = r6.body()
            boolean r1 = r1 instanceof okhttp3.FormBody
            if (r1 == 0) goto L28
            okhttp3.RequestBody r6 = r6.body()
            okhttp3.FormBody r6 = (okhttp3.FormBody) r6
            r1 = 0
        L14:
            int r2 = r6.size()
            if (r1 >= r2) goto L66
            java.lang.String r2 = r6.name(r1)
            java.lang.String r3 = r6.value(r1)
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L14
        L28:
            okhttp3.RequestBody r1 = r6.body()
            boolean r1 = r1 instanceof okhttp3.MultipartBody
            if (r1 == 0) goto L66
            okhttp3.RequestBody r6 = r6.body()
            okhttp3.MultipartBody r6 = (okhttp3.MultipartBody) r6
            java.util.List r6 = r6.parts()
            java.util.Iterator r6 = r6.iterator()
        L3e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r6.next()
            okhttp3.MultipartBody$Part r1 = (okhttp3.MultipartBody.Part) r1
            java.lang.String r2 = r5.getPartHeaders(r1)
            java.lang.String r1 = r5.getRequestBody(r1)     // Catch: java.io.UnsupportedEncodingException -> L61
            java.lang.String r3 = "%(?![0-9a-fA-F]{2})"
            java.lang.String r4 = "%25"
            java.lang.String r1 = r1.replaceAll(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L61
            java.lang.String r3 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r3)     // Catch: java.io.UnsupportedEncodingException -> L61
            goto L62
        L61:
            r1 = 0
        L62:
            r0.put(r2, r1)
            goto L3e
        L66:
            return r0
    }

    public cn.bluemobi.dylan.http.dialog.LoadingDialog getLoadingDialog() {
            r1 = this;
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r1.loadingDialog
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest hideFailMessage() {
            r1 = this;
            r0 = 0
            r1.isShowFailMessage = r0
            return r1
    }

    public cn.bluemobi.dylan.http.HttpRequest hideLoadingDialog() {
            r1 = this;
            r0 = 0
            r1.isShowLoadingDialog = r0
            return r1
    }

    public cn.bluemobi.dylan.http.HttpRequest hideOtherStatusMessage() {
            r1 = this;
            r0 = 0
            r1.isShowOtherStatusMessage = r0
            return r1
    }

    public cn.bluemobi.dylan.http.HttpRequest hideSuccessMessage() {
            r1 = this;
            r0 = 0
            r1.isShowSuccessMessage = r0
            return r1
    }

    public boolean isShowFailMessage() {
            r1 = this;
            boolean r0 = r1.isShowFailMessage
            return r0
    }

    public boolean isShowOtherStatusMessage() {
            r1 = this;
            boolean r0 = r1.isShowOtherStatusMessage
            return r0
    }

    public boolean isShowSuccessMessage() {
            r1 = this;
            boolean r0 = r1.isShowSuccessMessage
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setCanCancel(boolean r1) {
            r0 = this;
            r0.canCancel = r1
            return r0
    }

    public void setCustomResponse(cn.bluemobi.dylan.http.CustomResponse r1) {
            r0 = this;
            r0.customResponse = r1
            return
    }

    public rx.m setDataListener(cn.bluemobi.dylan.http.HttpCallBack r5) {
            r4 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.context
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L1a
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isDestroyed()
            if (r1 == 0) goto L1a
            r5.netOnFinish()
            return r2
        L1a:
            cn.bluemobi.dylan.http.MessageManager r1 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            boolean r1 = r1.isUseEnglishLanguage()
            if (r1 == 0) goto L27
            java.lang.String r1 = "Network  unusual"
            goto L2a
        L27:
            java.lang.String r1 = "网络不可用"
        L2a:
            cn.bluemobi.dylan.http.CustomResponse r3 = r4.customResponse
            if (r3 != 0) goto L4a
            boolean r3 = cn.bluemobi.dylan.http.NetworkUtil.isNetworkAvailable(r0)
            if (r3 != 0) goto L4a
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
            if (r5 == 0) goto L49
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r5.netOnFailure(r0)
            r5.netOnFinish()
        L49:
            return r2
        L4a:
            boolean r1 = r4.isShowLoadingDialog
            if (r1 == 0) goto L5a
            cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = r4.loadingDialog
            if (r1 != 0) goto L5c
            cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            r1.<init>(r0)
            r4.loadingDialog = r1
            goto L5c
        L5a:
            r4.loadingDialog = r2
        L5c:
            rx.e<? extends retrofit2.c0<okhttp3.ResponseBody>> r1 = r4.observable
            rx.h r2 = rx.schedulers.c.e()
            rx.e r1 = r1.w5(r2)
            rx.h r2 = rx.android.schedulers.a.b()
            rx.e r1 = r1.I3(r2)
            cn.bluemobi.dylan.http.HttpRequest$1 r2 = new cn.bluemobi.dylan.http.HttpRequest$1
            r2.<init>(r4, r5, r0)
            rx.m r5 = r1.r5(r2)
            if (r5 == 0) goto L95
            cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = r4.loadingDialog
            if (r1 == 0) goto L92
            cn.bluemobi.dylan.http.dialog.DialogOnKeyListener r0 = new cn.bluemobi.dylan.http.dialog.DialogOnKeyListener
            boolean r2 = r4.canCancel
            r0.<init>(r1, r2)
            r1.setOnKeyListener(r0)
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r4.loadingDialog
            cn.bluemobi.dylan.http.dialog.DialogOnDismissListener r1 = new cn.bluemobi.dylan.http.dialog.DialogOnDismissListener
            r1.<init>(r5)
            r0.setOnDismissListener(r1)
            return r5
        L92:
            r4.addLifeCycle(r0, r5)
        L95:
            return r5
    }

    public rx.m setDataListener(cn.bluemobi.dylan.http.OriginalHttpResponse r5) {
            r4 = this;
            cn.bluemobi.dylan.http.MessageManager r0 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            boolean r0 = r0.isUseEnglishLanguage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "Network  unusual"
            goto L10
        Ld:
            java.lang.String r0 = "网络不可用"
        L10:
            cn.bluemobi.dylan.http.MessageManager r1 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            boolean r1 = r1.isUseEnglishLanguage()
            if (r1 == 0) goto L1d
            java.lang.String r1 = "Network  error"
            goto L25
        L1d:
            cn.bluemobi.dylan.http.MessageManager r1 = cn.bluemobi.dylan.http.MessageManager.getMessageManager()
            java.lang.String r1 = r1.getErrorMessage()
        L25:
            java.lang.ref.WeakReference<android.content.Context> r2 = r4.context
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = cn.bluemobi.dylan.http.NetworkUtil.isNetworkAvailable(r2)
            r3 = 0
            if (r2 != 0) goto L52
            java.lang.ref.WeakReference<android.content.Context> r1 = r4.context
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r0, r2)
            r1.show()
            if (r5 == 0) goto L51
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r5.netOnFailure(r1)
            r5.netOnFinish()
        L51:
            return r3
        L52:
            boolean r0 = r4.isShowLoadingDialog
            if (r0 == 0) goto L6a
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r4.loadingDialog
            if (r0 != 0) goto L6c
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            java.lang.ref.WeakReference<android.content.Context> r2 = r4.context
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            r0.<init>(r2)
            r4.loadingDialog = r0
            goto L6c
        L6a:
            r4.loadingDialog = r3
        L6c:
            rx.e<? extends retrofit2.c0<okhttp3.ResponseBody>> r0 = r4.observable
            rx.h r2 = rx.schedulers.c.e()
            rx.e r0 = r0.w5(r2)
            rx.h r2 = rx.android.schedulers.a.b()
            rx.e r0 = r0.I3(r2)
            cn.bluemobi.dylan.http.HttpRequest$2 r2 = new cn.bluemobi.dylan.http.HttpRequest$2
            r2.<init>(r4, r5, r1)
            rx.m r5 = r0.r5(r2)
            if (r5 == 0) goto Lad
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r4.loadingDialog
            if (r0 == 0) goto La2
            cn.bluemobi.dylan.http.dialog.DialogOnKeyListener r1 = new cn.bluemobi.dylan.http.dialog.DialogOnKeyListener
            boolean r2 = r4.canCancel
            r1.<init>(r0, r2)
            r0.setOnKeyListener(r1)
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r4.loadingDialog
            cn.bluemobi.dylan.http.dialog.DialogOnDismissListener r1 = new cn.bluemobi.dylan.http.dialog.DialogOnDismissListener
            r1.<init>(r5)
            r0.setOnDismissListener(r1)
            return r5
        La2:
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.context
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r4.addLifeCycle(r0, r5)
        Lad:
            return r5
    }

    public cn.bluemobi.dylan.http.HttpRequest setHttpJsonKey(cn.bluemobi.dylan.http.HttpJsonKey r1) {
            r0 = this;
            r0.httpJsonKey = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setLoadingMessage(java.lang.String r1) {
            r0 = this;
            r0.loadingMessage = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setObservable(rx.e<? extends retrofit2.c0<okhttp3.ResponseBody>> r1) {
            r0 = this;
            r0.observable = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setResponseInterceptor(cn.bluemobi.dylan.http.ResponseInterceptor r1) {
            r0 = this;
            r0.responseInterceptor = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setShowFailMessage(boolean r1) {
            r0 = this;
            r0.isShowFailMessage = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setShowLoadingDialog(boolean r1) {
            r0 = this;
            r0.isShowLoadingDialog = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setShowOtherStatusMessage(boolean r1) {
            r0 = this;
            r0.isShowOtherStatusMessage = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setShowSuccessMessage(boolean r1) {
            r0 = this;
            r0.isShowSuccessMessage = r1
            return r0
    }

    public cn.bluemobi.dylan.http.HttpRequest setTimeout(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            cn.bluemobi.dylan.http.RetrofitManager r0 = cn.bluemobi.dylan.http.RetrofitManager.getRetrofitManager()
            r0.setTimeout(r2, r4)
            return r1
    }
}
