package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface x extends com.kwad.framework.filedownloader.s.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean a(com.kwad.framework.filedownloader.message.MessageSnapshot r1);

        boolean b(com.kwad.framework.filedownloader.message.MessageSnapshot r1);

        boolean c(com.kwad.framework.filedownloader.message.MessageSnapshot r1);

        boolean d(com.kwad.framework.filedownloader.message.MessageSnapshot r1);

        com.kwad.framework.filedownloader.message.MessageSnapshot g(java.lang.Throwable r1);

        com.kwad.framework.filedownloader.t xh();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void start();
    }

    void free();

    long getStatusUpdateTime();

    long getTotalBytes();

    boolean pause();

    void reset();

    byte wJ();

    java.lang.Throwable wL();

    int wN();

    boolean wP();

    void xi();

    long xj();
}
