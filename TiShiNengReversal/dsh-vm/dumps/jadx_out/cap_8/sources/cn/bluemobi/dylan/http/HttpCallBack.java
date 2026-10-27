package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class HttpCallBack implements cn.bluemobi.dylan.http.HttpResponse {
    public HttpCallBack() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnFailure(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnFinish() {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnOtherStatus(int r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnOtherStatus(int r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnStart() {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.HttpResponse
    public void netOnSuccessServerError(int r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // cn.bluemobi.dylan.http.download.ProgressResponseListener
    public void onResponseProgress(long r1, long r3, boolean r5) {
            r0 = this;
            return
    }
}
