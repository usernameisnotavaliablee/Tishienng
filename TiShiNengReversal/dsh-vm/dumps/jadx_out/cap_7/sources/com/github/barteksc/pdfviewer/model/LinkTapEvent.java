package com.github.barteksc.pdfviewer.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class LinkTapEvent {
    private float documentX;
    private float documentY;
    private com.shockwave.pdfium.PdfDocument.Link link;
    private android.graphics.RectF mappedLinkRect;
    private float originalX;
    private float originalY;

    public LinkTapEvent(float r1, float r2, float r3, float r4, android.graphics.RectF r5, com.shockwave.pdfium.PdfDocument.Link r6) {
            r0 = this;
            r0.<init>()
            r0.originalX = r1
            r0.originalY = r2
            r0.documentX = r3
            r0.documentY = r4
            r0.mappedLinkRect = r5
            r0.link = r6
            return
    }

    public float getDocumentX() {
            r1 = this;
            float r0 = r1.documentX
            return r0
    }

    public float getDocumentY() {
            r1 = this;
            float r0 = r1.documentY
            return r0
    }

    public com.shockwave.pdfium.PdfDocument.Link getLink() {
            r1 = this;
            com.shockwave.pdfium.PdfDocument$Link r0 = r1.link
            return r0
    }

    public android.graphics.RectF getMappedLinkRect() {
            r1 = this;
            android.graphics.RectF r0 = r1.mappedLinkRect
            return r0
    }

    public float getOriginalX() {
            r1 = this;
            float r0 = r1.originalX
            return r0
    }

    public float getOriginalY() {
            r1 = this;
            float r0 = r1.originalY
            return r0
    }
}
