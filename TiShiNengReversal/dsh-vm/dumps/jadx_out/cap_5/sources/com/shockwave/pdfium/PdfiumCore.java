package com.shockwave.pdfium;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PdfiumCore {
    private static final java.lang.String b = "com.shockwave.pdfium.PdfiumCore";
    private static final java.lang.Class c = null;
    private static final java.lang.String d = "descriptor";
    private static final java.lang.Object e = null;
    private static java.lang.reflect.Field f;
    private int a;

    static {
            java.lang.Class<java.io.FileDescriptor> r0 = java.io.FileDescriptor.class
            com.shockwave.pdfium.PdfiumCore.c = r0
            java.lang.String r0 = "c++_shared"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1e
            java.lang.String r0 = "modpng"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1e
            java.lang.String r0 = "modft2"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1e
            java.lang.String r0 = "modpdfium"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1e
            java.lang.String r0 = "jniPdfium"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1e
            goto L22
        L1e:
            r0 = move-exception
            r0.toString()
        L22:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.shockwave.pdfium.PdfiumCore.e = r0
            r0 = 0
            com.shockwave.pdfium.PdfiumCore.f = r0
            return
    }

    public PdfiumCore(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            r0.a = r1
            return
    }

    public static int c(android.os.ParcelFileDescriptor r3) {
            r0 = -1
            java.lang.reflect.Field r1 = com.shockwave.pdfium.PdfiumCore.f     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L13
            java.lang.Class r1 = com.shockwave.pdfium.PdfiumCore.c     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "descriptor"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1e
            com.shockwave.pdfium.PdfiumCore.f = r1     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1e
        L13:
            java.lang.reflect.Field r1 = com.shockwave.pdfium.PdfiumCore.f     // Catch: java.lang.Throwable -> L1e
            java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L1e
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L1e
            return r3
        L1e:
            return r0
    }

    private native void nativeCloseDocument(long r1);

    private native void nativeClosePage(long r1);

    private native void nativeClosePages(long[] r1);

    private native long nativeGetBookmarkDestIndex(long r1, long r3);

    private native java.lang.String nativeGetBookmarkTitle(long r1);

    private native java.lang.Integer nativeGetDestPageIndex(long r1, long r3);

    private native java.lang.String nativeGetDocumentMetaText(long r1, java.lang.String r3);

    private native java.lang.Long nativeGetFirstChildBookmark(long r1, java.lang.Long r3);

    private native android.graphics.RectF nativeGetLinkRect(long r1);

    private native java.lang.String nativeGetLinkURI(long r1, long r3);

    private native int nativeGetPageCount(long r1);

    private native int nativeGetPageHeightPixel(long r1, int r3);

    private native int nativeGetPageHeightPoint(long r1);

    private native long[] nativeGetPageLinks(long r1);

    private native com.shockwave.pdfium.util.Size nativeGetPageSizeByIndex(long r1, int r3, int r4);

    private native int nativeGetPageWidthPixel(long r1, int r3);

    private native int nativeGetPageWidthPoint(long r1);

    private native java.lang.Long nativeGetSiblingBookmark(long r1, long r3);

    private native long nativeLoadPage(long r1, int r3);

    private native long[] nativeLoadPages(long r1, int r3, int r4);

    private native long nativeOpenDocument(int r1, java.lang.String r2);

    private native long nativeOpenMemDocument(byte[] r1, java.lang.String r2);

    private native android.graphics.Point nativePageCoordsToDevice(long r1, int r3, int r4, int r5, int r6, int r7, double r8, double r10);

    private native void nativeRenderPage(long r1, android.view.Surface r3, int r4, int r5, int r6, int r7, int r8, boolean r9);

    private native void nativeRenderPageBitmap(long r1, android.graphics.Bitmap r3, int r4, int r5, int r6, int r7, int r8, boolean r9);

    private void t(java.util.List<com.shockwave.pdfium.PdfDocument.Bookmark> r5, com.shockwave.pdfium.PdfDocument r6, long r7) {
            r4 = this;
            com.shockwave.pdfium.PdfDocument$Bookmark r0 = new com.shockwave.pdfium.PdfDocument$Bookmark
            r0.<init>()
            r0.d = r7
            java.lang.String r1 = r4.nativeGetBookmarkTitle(r7)
            r0.b = r1
            long r1 = r6.a
            long r1 = r4.nativeGetBookmarkDestIndex(r1, r7)
            r0.c = r1
            r5.add(r0)
            long r1 = r6.a
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.Long r1 = r4.nativeGetFirstChildBookmark(r1, r3)
            if (r1 == 0) goto L2f
            java.util.List r0 = r0.a()
            long r1 = r1.longValue()
            r4.t(r0, r6, r1)
        L2f:
            long r0 = r6.a
            java.lang.Long r7 = r4.nativeGetSiblingBookmark(r0, r7)
            if (r7 == 0) goto L3e
            long r7 = r7.longValue()
            r4.t(r5, r6, r7)
        L3e:
            return
    }

    public void a(com.shockwave.pdfium.PdfDocument r5) {
            r4 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r5.c     // Catch: java.lang.Throwable -> L29
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L29
            java.util.Map<java.lang.Integer, java.lang.Long> r3 = r5.c     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L29
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L29
            r4.nativeClosePage(r2)     // Catch: java.lang.Throwable -> L29
            goto Ld
        L29:
            r5 = move-exception
            goto L41
        L2b:
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r5.c     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            long r1 = r5.a     // Catch: java.lang.Throwable -> L29
            r4.nativeCloseDocument(r1)     // Catch: java.lang.Throwable -> L29
            android.os.ParcelFileDescriptor r1 = r5.b     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L3c
        L3c:
            r1 = 0
            r5.b = r1     // Catch: java.lang.Throwable -> L29
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
    }

    public com.shockwave.pdfium.PdfDocument.Meta b(com.shockwave.pdfium.PdfDocument r6) {
            r5 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            com.shockwave.pdfium.PdfDocument$Meta r1 = new com.shockwave.pdfium.PdfDocument$Meta     // Catch: java.lang.Throwable -> L5a
            r1.<init>()     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Title"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.a = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Author"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.b = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Subject"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.c = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Keywords"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.d = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Creator"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.e = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Producer"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.f = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "CreationDate"
            java.lang.String r2 = r5.nativeGetDocumentMetaText(r2, r4)     // Catch: java.lang.Throwable -> L5a
            r1.g = r2     // Catch: java.lang.Throwable -> L5a
            long r2 = r6.a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "ModDate"
            java.lang.String r6 = r5.nativeGetDocumentMetaText(r2, r6)     // Catch: java.lang.Throwable -> L5a
            r1.h = r6     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return r1
        L5a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r6
    }

    public int d(com.shockwave.pdfium.PdfDocument r4) {
            r3 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            long r1 = r4.a     // Catch: java.lang.Throwable -> Lb
            int r4 = r3.nativeGetPageCount(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r4
        Lb:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    public int e(com.shockwave.pdfium.PdfDocument r3, int r4) {
            r2 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Long> r3 = r3.c     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L1d
            int r1 = r2.a     // Catch: java.lang.Throwable -> L1d
            int r3 = r2.nativeGetPageHeightPixel(r3, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            r3 = move-exception
            goto L22
        L1f:
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public int f(com.shockwave.pdfium.PdfDocument r2, int r3) {
            r1 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r2.c     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.nativeGetPageHeightPoint(r2)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r2 = move-exception
            goto L20
        L1d:
            r2 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public java.util.List<com.shockwave.pdfium.PdfDocument.Link> g(com.shockwave.pdfium.PdfDocument r10, int r11) {
            r9 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r10.c     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r11 = r2.get(r11)     // Catch: java.lang.Throwable -> L18
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> L18
            if (r11 != 0) goto L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r10 = move-exception
            goto L4b
        L1a:
            long r2 = r11.longValue()     // Catch: java.lang.Throwable -> L18
            long[] r11 = r9.nativeGetPageLinks(r2)     // Catch: java.lang.Throwable -> L18
            int r2 = r11.length     // Catch: java.lang.Throwable -> L18
            r3 = 0
        L24:
            if (r3 >= r2) goto L49
            r4 = r11[r3]     // Catch: java.lang.Throwable -> L18
            long r6 = r10.a     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r6 = r9.nativeGetDestPageIndex(r6, r4)     // Catch: java.lang.Throwable -> L18
            long r7 = r10.a     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r9.nativeGetLinkURI(r7, r4)     // Catch: java.lang.Throwable -> L18
            android.graphics.RectF r4 = r9.nativeGetLinkRect(r4)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L46
            if (r6 != 0) goto L3e
            if (r7 == 0) goto L46
        L3e:
            com.shockwave.pdfium.PdfDocument$Link r5 = new com.shockwave.pdfium.PdfDocument$Link     // Catch: java.lang.Throwable -> L18
            r5.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L18
            r1.add(r5)     // Catch: java.lang.Throwable -> L18
        L46:
            int r3 = r3 + 1
            goto L24
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r10
    }

    public com.shockwave.pdfium.util.Size h(com.shockwave.pdfium.PdfDocument r4, int r5) {
            r3 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            long r1 = r4.a     // Catch: java.lang.Throwable -> Ld
            int r4 = r3.a     // Catch: java.lang.Throwable -> Ld
            com.shockwave.pdfium.util.Size r4 = r3.nativeGetPageSizeByIndex(r1, r5, r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r4
        Ld:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    public int i(com.shockwave.pdfium.PdfDocument r3, int r4) {
            r2 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Long> r3 = r3.c     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L1d
            int r1 = r2.a     // Catch: java.lang.Throwable -> L1d
            int r3 = r2.nativeGetPageWidthPixel(r3, r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            r3 = move-exception
            goto L22
        L1f:
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public int j(com.shockwave.pdfium.PdfDocument r2, int r3) {
            r1 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r2.c     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.nativeGetPageWidthPoint(r2)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r2 = move-exception
            goto L20
        L1d:
            r2 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public java.util.List<com.shockwave.pdfium.PdfDocument.Bookmark> k(com.shockwave.pdfium.PdfDocument r6) {
            r5 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            long r2 = r6.a     // Catch: java.lang.Throwable -> L19
            r4 = 0
            java.lang.Long r2 = r5.nativeGetFirstChildBookmark(r2, r4)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1b
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L19
            r5.t(r1, r6, r2)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r6 = move-exception
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r6
    }

    public android.graphics.Point l(com.shockwave.pdfium.PdfDocument r13, int r14, int r15, int r16, int r17, int r18, int r19, double r20, double r22) {
            r12 = this;
            java.util.Map<java.lang.Integer, java.lang.Long> r13 = r13.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r13.get(r14)
            java.lang.Long r13 = (java.lang.Long) r13
            long r1 = r13.longValue()
            r0 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            android.graphics.Point r13 = r0.nativePageCoordsToDevice(r1, r3, r4, r5, r6, r7, r8, r10)
            return r13
    }

    public android.graphics.RectF m(com.shockwave.pdfium.PdfDocument r15, int r16, int r17, int r18, int r19, int r20, int r21, android.graphics.RectF r22) {
            r14 = this;
            r0 = r22
            float r1 = r0.left
            double r10 = (double) r1
            float r1 = r0.top
            double r12 = (double) r1
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            android.graphics.Point r1 = r2.l(r3, r4, r5, r6, r7, r8, r9, r10, r12)
            float r2 = r0.right
            double r10 = (double) r2
            float r0 = r0.bottom
            double r12 = (double) r0
            r2 = r14
            android.graphics.Point r15 = r2.l(r3, r4, r5, r6, r7, r8, r9, r10, r12)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r2 = r1.x
            float r2 = (float) r2
            int r1 = r1.y
            float r1 = (float) r1
            int r3 = r15.x
            float r3 = (float) r3
            int r15 = r15.y
            float r15 = (float) r15
            r0.<init>(r2, r1, r3, r15)
            return r0
    }

    public com.shockwave.pdfium.PdfDocument n(android.os.ParcelFileDescriptor r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            com.shockwave.pdfium.PdfDocument r2 = r1.o(r2, r0)
            return r2
    }

    public com.shockwave.pdfium.PdfDocument o(android.os.ParcelFileDescriptor r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            com.shockwave.pdfium.PdfDocument r0 = new com.shockwave.pdfium.PdfDocument
            r0.<init>()
            r0.b = r3
            java.lang.Object r1 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r1)
            int r3 = c(r3)     // Catch: java.lang.Throwable -> L16
            long r3 = r2.nativeOpenDocument(r3, r4)     // Catch: java.lang.Throwable -> L16
            r0.a = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public com.shockwave.pdfium.PdfDocument p(byte[] r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            com.shockwave.pdfium.PdfDocument r2 = r1.q(r2, r0)
            return r2
    }

    public com.shockwave.pdfium.PdfDocument q(byte[] r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            com.shockwave.pdfium.PdfDocument r0 = new com.shockwave.pdfium.PdfDocument
            r0.<init>()
            java.lang.Object r1 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r1)
            long r3 = r2.nativeOpenMemDocument(r3, r4)     // Catch: java.lang.Throwable -> L10
            r0.a = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public long r(com.shockwave.pdfium.PdfDocument r5, int r6) {
            r4 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            long r1 = r5.a     // Catch: java.lang.Throwable -> L18
            long r1 = r4.nativeLoadPage(r1, r6)     // Catch: java.lang.Throwable -> L18
            java.util.Map<java.lang.Integer, java.lang.Long> r5 = r5.c     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L18
            r5.put(r6, r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r5
    }

    public long[] s(com.shockwave.pdfium.PdfDocument r9, int r10, int r11) {
            r8 = this;
            java.lang.Object r0 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r0)
            long r1 = r9.a     // Catch: java.lang.Throwable -> L24
            long[] r1 = r8.nativeLoadPages(r1, r10, r11)     // Catch: java.lang.Throwable -> L24
            int r2 = r1.length     // Catch: java.lang.Throwable -> L24
            r3 = 0
        Lb:
            if (r3 >= r2) goto L26
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L24
            if (r10 <= r11) goto L12
            goto L26
        L12:
            java.util.Map<java.lang.Integer, java.lang.Long> r6 = r9.c     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L24
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            r6.put(r7, r4)     // Catch: java.lang.Throwable -> L24
            int r10 = r10 + 1
            int r3 = r3 + 1
            goto Lb
        L24:
            r9 = move-exception
            goto L28
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r1
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r9
    }

    public void u(com.shockwave.pdfium.PdfDocument r10, android.view.Surface r11, int r12, int r13, int r14, int r15, int r16) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.v(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void v(com.shockwave.pdfium.PdfDocument r13, android.view.Surface r14, int r15, int r16, int r17, int r18, int r19, boolean r20) {
            r12 = this;
            java.lang.Object r1 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.Long> r13 = r13.c     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            java.lang.Object r13 = r13.get(r15)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            long r3 = r13.longValue()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            int r6 = r12.a     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            r2 = r12
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r2.nativeRenderPage(r3, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            goto L28
        L25:
            r0 = move-exception
            r13 = r0
            goto L2a
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r13
    }

    public void w(com.shockwave.pdfium.PdfDocument r10, android.graphics.Bitmap r11, int r12, int r13, int r14, int r15, int r16) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.x(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void x(com.shockwave.pdfium.PdfDocument r13, android.graphics.Bitmap r14, int r15, int r16, int r17, int r18, int r19, boolean r20) {
            r12 = this;
            java.lang.Object r1 = com.shockwave.pdfium.PdfiumCore.e
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.Long> r13 = r13.c     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            java.lang.Object r13 = r13.get(r15)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            long r3 = r13.longValue()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            int r6 = r12.a     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            r2 = r12
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r2.nativeRenderPageBitmap(r3, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L28
            goto L28
        L25:
            r0 = move-exception
            r13 = r0
            goto L2a
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r13
    }
}
