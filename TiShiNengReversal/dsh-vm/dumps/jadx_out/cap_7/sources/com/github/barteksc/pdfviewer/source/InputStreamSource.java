package com.github.barteksc.pdfviewer.source;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class InputStreamSource implements com.github.barteksc.pdfviewer.source.DocumentSource {
    private java.io.InputStream inputStream;

    public InputStreamSource(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.inputStream = r1
            return
    }

    @Override // com.github.barteksc.pdfviewer.source.DocumentSource
    public com.shockwave.pdfium.PdfDocument createDocument(android.content.Context r1, com.shockwave.pdfium.PdfiumCore r2, java.lang.String r3) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r0.inputStream
            byte[] r1 = com.github.barteksc.pdfviewer.util.Util.toByteArray(r1)
            com.shockwave.pdfium.PdfDocument r1 = r2.q(r1, r3)
            return r1
    }
}
