package cn.bluemobi.dylan.http.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ProgressResponseBody extends okhttp3.ResponseBody {
    private okio.BufferedSource bufferedSource;
    private final cn.bluemobi.dylan.http.download.ProgressResponseListener progressListener;
    private final okhttp3.ResponseBody responseBody;


    public ProgressResponseBody(okhttp3.ResponseBody r1, cn.bluemobi.dylan.http.download.ProgressResponseListener r2) {
            r0 = this;
            r0.<init>()
            r0.responseBody = r1
            r0.progressListener = r2
            return
    }

    static /* synthetic */ okhttp3.ResponseBody access$000(cn.bluemobi.dylan.http.download.ProgressResponseBody r0) {
            okhttp3.ResponseBody r0 = r0.responseBody
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.http.download.ProgressResponseListener access$100(cn.bluemobi.dylan.http.download.ProgressResponseBody r0) {
            cn.bluemobi.dylan.http.download.ProgressResponseListener r0 = r0.progressListener
            return r0
    }

    private okio.Source source(okio.Source r2) {
            r1 = this;
            cn.bluemobi.dylan.http.download.ProgressResponseBody$1 r0 = new cn.bluemobi.dylan.http.download.ProgressResponseBody$1
            r0.<init>(r1, r2)
            return r0
    }

    public long contentLength() {
            r2 = this;
            okhttp3.ResponseBody r0 = r2.responseBody
            long r0 = r0.contentLength()
            return r0
    }

    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.responseBody
            okhttp3.MediaType r0 = r0.contentType()
            return r0
    }

    public okio.BufferedSource source() {
            r1 = this;
            okio.BufferedSource r0 = r1.bufferedSource
            if (r0 != 0) goto L14
            okhttp3.ResponseBody r0 = r1.responseBody
            okio.BufferedSource r0 = r0.source()
            okio.Source r0 = r1.source(r0)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            r1.bufferedSource = r0
        L14:
            okio.BufferedSource r0 = r1.bufferedSource
            return r0
    }
}
