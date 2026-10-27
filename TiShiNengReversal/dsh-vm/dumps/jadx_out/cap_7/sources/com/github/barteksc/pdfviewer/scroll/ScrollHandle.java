package com.github.barteksc.pdfviewer.scroll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface ScrollHandle {
    void destroyLayout();

    void hide();

    void hideDelayed();

    void setPageNum(int r1);

    void setScroll(float r1);

    void setupLayout(com.github.barteksc.pdfviewer.PDFView r1);

    void show();

    boolean shown();
}
