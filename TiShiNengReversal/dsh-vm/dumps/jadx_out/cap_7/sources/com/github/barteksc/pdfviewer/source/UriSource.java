package com.github.barteksc.pdfviewer.source;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class UriSource implements com.github.barteksc.pdfviewer.source.DocumentSource {
    private android.net.Uri uri;

    public UriSource(android.net.Uri r1) {
            r0 = this;
            r0.<init>()
            r0.uri = r1
            return
    }

    @Override // com.github.barteksc.pdfviewer.source.DocumentSource
    public com.shockwave.pdfium.PdfDocument createDocument(android.content.Context r3, com.shockwave.pdfium.PdfiumCore r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            android.content.ContentResolver r3 = r3.getContentResolver()
            android.net.Uri r0 = r2.uri
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r0, r1)
            com.shockwave.pdfium.PdfDocument r3 = r4.o(r3, r5)
            return r3
    }
}
