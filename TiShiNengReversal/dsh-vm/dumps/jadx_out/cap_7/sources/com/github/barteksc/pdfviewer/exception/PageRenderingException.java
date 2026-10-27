package com.github.barteksc.pdfviewer.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PageRenderingException extends java.lang.Exception {
    private final int page;

    public PageRenderingException(int r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r2)
            r0.page = r1
            return
    }

    public int getPage() {
            r1 = this;
            int r0 = r1.page
            return r0
    }
}
