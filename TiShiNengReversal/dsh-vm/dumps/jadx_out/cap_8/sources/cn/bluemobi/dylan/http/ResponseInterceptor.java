package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ResponseInterceptor {
    void onError(android.content.Context r1, java.lang.Throwable r2);

    boolean onResponse(android.content.Context r1, int r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String r5);

    boolean onResponseStart(android.content.Context r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3, java.lang.String r4, int r5);
}
