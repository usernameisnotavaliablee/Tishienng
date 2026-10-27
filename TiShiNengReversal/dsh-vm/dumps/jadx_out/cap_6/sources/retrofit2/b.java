package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface b<T> extends java.lang.Cloneable {
    void cancel();

    /* renamed from: clone */
    retrofit2.b<T> mo216clone();

    retrofit2.c0<T> execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    void j(retrofit2.d<T> r1);

    okhttp3.Request request();

    okio.Timeout timeout();
}
