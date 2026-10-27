package com.github.barteksc.pdfviewer.link;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class DefaultLinkHandler implements com.github.barteksc.pdfviewer.link.LinkHandler {
    private static final java.lang.String TAG = "DefaultLinkHandler";
    private com.github.barteksc.pdfviewer.PDFView pdfView;

    static {
            return
    }

    public DefaultLinkHandler(com.github.barteksc.pdfviewer.PDFView r1) {
            r0 = this;
            r0.<init>()
            r0.pdfView = r1
            return
    }

    private void handlePage(int r2) {
            r1 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r1.pdfView
            r0.jumpTo(r2)
            return
    }

    private void handleUri(java.lang.String r3) {
            r2 = this;
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
            com.github.barteksc.pdfviewer.PDFView r3 = r2.pdfView
            android.content.Context r3 = r3.getContext()
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            if (r1 == 0) goto L1e
            r3.startActivity(r0)
        L1e:
            return
    }

    @Override // com.github.barteksc.pdfviewer.link.LinkHandler
    public void handleLinkEvent(com.github.barteksc.pdfviewer.model.LinkTapEvent r3) {
            r2 = this;
            com.shockwave.pdfium.PdfDocument$Link r0 = r3.getLink()
            java.lang.String r0 = r0.c()
            com.shockwave.pdfium.PdfDocument$Link r3 = r3.getLink()
            java.lang.Integer r3 = r3.b()
            if (r0 == 0) goto L1c
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1c
            r2.handleUri(r0)
            return
        L1c:
            if (r3 == 0) goto L25
            int r3 = r3.intValue()
            r2.handlePage(r3)
        L25:
            return
    }
}
