package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface CustomResponse {
    void onError(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.http.HttpRequest r2, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.http.HttpResponse r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4);

    void onNext(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.http.HttpRequest r2, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.http.HttpResponse r3, @org.jetbrains.annotations.Nullable retrofit2.c0<okhttp3.ResponseBody> r4);
}
