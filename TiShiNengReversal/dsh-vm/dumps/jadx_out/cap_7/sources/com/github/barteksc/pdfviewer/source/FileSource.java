package com.github.barteksc.pdfviewer.source;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class FileSource implements com.github.barteksc.pdfviewer.source.DocumentSource {
    private java.io.File file;

    public FileSource(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.file = r1
            return
    }

    @Override // com.github.barteksc.pdfviewer.source.DocumentSource
    public com.shockwave.pdfium.PdfDocument createDocument(android.content.Context r2, com.shockwave.pdfium.PdfiumCore r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            java.io.File r2 = r1.file
            r0 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r0)
            com.shockwave.pdfium.PdfDocument r2 = r3.o(r2, r4)
            return r2
    }
}
