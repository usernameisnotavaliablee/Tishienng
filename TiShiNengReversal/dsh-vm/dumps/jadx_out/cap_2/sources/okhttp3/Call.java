package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Call extends java.lang.Cloneable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Factory {
        @org.jetbrains.annotations.NotNull
        okhttp3.Call newCall(@org.jetbrains.annotations.NotNull okhttp3.Request r1);
    }

    void cancel();

    @org.jetbrains.annotations.NotNull
    okhttp3.Call clone();

    void enqueue(@org.jetbrains.annotations.NotNull okhttp3.Callback r1);

    @org.jetbrains.annotations.NotNull
    okhttp3.Response execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    @org.jetbrains.annotations.NotNull
    okhttp3.Request request();

    @org.jetbrains.annotations.Nullable
    <T> T tag(@org.jetbrains.annotations.NotNull java.lang.Class<? extends T> r1);

    @org.jetbrains.annotations.NotNull
    <T> T tag(@org.jetbrains.annotations.NotNull java.lang.Class<T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2);

    @org.jetbrains.annotations.Nullable
    <T> T tag(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1);

    @org.jetbrains.annotations.NotNull
    <T> T tag(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2);

    @org.jetbrains.annotations.NotNull
    okio.Timeout timeout();
}
