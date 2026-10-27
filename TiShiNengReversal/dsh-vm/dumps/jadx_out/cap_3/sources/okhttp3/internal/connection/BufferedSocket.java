package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface BufferedSocket extends okio.Socket {
    @org.jetbrains.annotations.NotNull
    /* renamed from: getSink */
    okio.BufferedSink mo9getSink();

    @org.jetbrains.annotations.NotNull
    /* renamed from: getSource */
    okio.BufferedSource mo11getSource();
}
