package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface OriginalHttpResponse {
    void netOnFailure(java.lang.Throwable r1);

    void netOnFinish();

    void netOnStart();

    void netOnSuccess(java.lang.String r1);
}
