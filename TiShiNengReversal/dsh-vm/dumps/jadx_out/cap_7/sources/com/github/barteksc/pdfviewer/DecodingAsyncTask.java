package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class DecodingAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Throwable> {
    private boolean cancelled;
    private com.github.barteksc.pdfviewer.source.DocumentSource docSource;
    private java.lang.String password;
    private com.github.barteksc.pdfviewer.PdfFile pdfFile;
    private java.lang.ref.WeakReference<com.github.barteksc.pdfviewer.PDFView> pdfViewReference;
    private com.shockwave.pdfium.PdfiumCore pdfiumCore;
    private int[] userPages;

    DecodingAsyncTask(com.github.barteksc.pdfviewer.source.DocumentSource r1, java.lang.String r2, int[] r3, com.github.barteksc.pdfviewer.PDFView r4, com.shockwave.pdfium.PdfiumCore r5) {
            r0 = this;
            r0.<init>()
            r0.docSource = r1
            r0.userPages = r3
            r1 = 0
            r0.cancelled = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.pdfViewReference = r1
            r0.password = r2
            r0.pdfiumCore = r5
            return
    }

    private com.shockwave.pdfium.util.Size getViewSize(com.github.barteksc.pdfviewer.PDFView r3) {
            r2 = this;
            com.shockwave.pdfium.util.Size r0 = new com.shockwave.pdfium.util.Size
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ java.lang.Throwable doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            java.lang.Throwable r1 = r0.doInBackground2(r1)
            return r1
    }

    /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
    protected java.lang.Throwable doInBackground2(java.lang.Void... r15) {
            r14 = this;
            java.lang.ref.WeakReference<com.github.barteksc.pdfviewer.PDFView> r15 = r14.pdfViewReference     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r15 = r15.get()     // Catch: java.lang.Throwable -> L3d
            com.github.barteksc.pdfviewer.PDFView r15 = (com.github.barteksc.pdfviewer.PDFView) r15     // Catch: java.lang.Throwable -> L3d
            if (r15 == 0) goto L40
            com.github.barteksc.pdfviewer.source.DocumentSource r0 = r14.docSource     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r15.getContext()     // Catch: java.lang.Throwable -> L3d
            com.shockwave.pdfium.PdfiumCore r2 = r14.pdfiumCore     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r14.password     // Catch: java.lang.Throwable -> L3d
            com.shockwave.pdfium.PdfDocument r6 = r0.createDocument(r1, r2, r3)     // Catch: java.lang.Throwable -> L3d
            com.github.barteksc.pdfviewer.PdfFile r4 = new com.github.barteksc.pdfviewer.PdfFile     // Catch: java.lang.Throwable -> L3d
            com.shockwave.pdfium.PdfiumCore r5 = r14.pdfiumCore     // Catch: java.lang.Throwable -> L3d
            com.github.barteksc.pdfviewer.util.FitPolicy r7 = r15.getPageFitPolicy()     // Catch: java.lang.Throwable -> L3d
            com.shockwave.pdfium.util.Size r8 = r14.getViewSize(r15)     // Catch: java.lang.Throwable -> L3d
            int[] r9 = r14.userPages     // Catch: java.lang.Throwable -> L3d
            boolean r10 = r15.isSwipeVertical()     // Catch: java.lang.Throwable -> L3d
            int r11 = r15.getSpacingPx()     // Catch: java.lang.Throwable -> L3d
            boolean r12 = r15.isAutoSpacingEnabled()     // Catch: java.lang.Throwable -> L3d
            boolean r13 = r15.isFitEachPage()     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3d
            r14.pdfFile = r4     // Catch: java.lang.Throwable -> L3d
            r15 = 0
            return r15
        L3d:
            r0 = move-exception
            r15 = r0
            goto L47
        L40:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "pdfView == null"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L3d
        L47:
            return r15
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.onPostExecute2(r1)
            return
    }

    /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    protected void onPostExecute2(java.lang.Throwable r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.github.barteksc.pdfviewer.PDFView> r0 = r1.pdfViewReference
            java.lang.Object r0 = r0.get()
            com.github.barteksc.pdfviewer.PDFView r0 = (com.github.barteksc.pdfviewer.PDFView) r0
            if (r0 == 0) goto L19
            if (r2 == 0) goto L10
            r0.loadError(r2)
            return
        L10:
            boolean r2 = r1.cancelled
            if (r2 != 0) goto L19
            com.github.barteksc.pdfviewer.PdfFile r2 = r1.pdfFile
            r0.loadComplete(r2)
        L19:
            return
    }
}
