package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DataSnapshot implements org.apache.harmony.awt.datatransfer.DataProvider {
    private final java.lang.String[] fileList;
    private final java.lang.String html;
    private final java.lang.String[] nativeFormats;
    private final org.apache.harmony.awt.datatransfer.RawBitmap rawBitmap;
    private final java.util.Map<java.lang.Class<?>, byte[]> serializedObjects;
    private final java.lang.String text;
    private final java.lang.String url;

    public DataSnapshot(org.apache.harmony.awt.datatransfer.DataProvider r5) {
            r4 = this;
            r4.<init>()
            java.lang.String[] r0 = r5.getNativeFormats()
            r4.nativeFormats = r0
            java.lang.String r0 = r5.getText()
            r4.text = r0
            java.lang.String[] r0 = r5.getFileList()
            r4.fileList = r0
            java.lang.String r0 = r5.getURL()
            r4.url = r0
            java.lang.String r0 = r5.getHTML()
            r4.html = r0
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r5.getRawBitmap()
            r4.rawBitmap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r4.serializedObjects = r0
            r0 = 0
        L33:
            java.lang.String[] r1 = r4.nativeFormats
            int r2 = r1.length
            if (r0 < r2) goto L39
            return
        L39:
            r1 = r1[r0]     // Catch: java.lang.ClassNotFoundException -> L40
            java.awt.datatransfer.DataFlavor r1 = java.awt.datatransfer.SystemFlavorMap.decodeDataFlavor(r1)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L52
            java.lang.Class r1 = r1.getRepresentationClass()
            byte[] r2 = r5.getSerializedObject(r1)
            if (r2 == 0) goto L52
            java.util.Map<java.lang.Class<?>, byte[]> r3 = r4.serializedObjects
            r3.put(r1, r2)
        L52:
            int r0 = r0 + 1
            goto L33
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String[] getFileList() {
            r1 = this;
            java.lang.String[] r0 = r1.fileList
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String getHTML() {
            r1 = this;
            java.lang.String r0 = r1.html
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String[] getNativeFormats() {
            r1 = this;
            java.lang.String[] r0 = r1.nativeFormats
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public org.apache.harmony.awt.datatransfer.RawBitmap getRawBitmap() {
            r1 = this;
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r1.rawBitmap
            return r0
    }

    public short[] getRawBitmapBuffer16() {
            r2 = this;
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r2.rawBitmap
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.buffer
            boolean r1 = r0 instanceof short[]
            if (r1 == 0) goto Ld
            short[] r0 = (short[]) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int[] getRawBitmapBuffer32() {
            r2 = this;
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r2.rawBitmap
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.buffer
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto Ld
            int[] r0 = (int[]) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public byte[] getRawBitmapBuffer8() {
            r2 = this;
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r2.rawBitmap
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.buffer
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto Ld
            byte[] r0 = (byte[]) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int[] getRawBitmapHeader() {
            r1 = this;
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r1.rawBitmap
            if (r0 == 0) goto L9
            int[] r0 = r0.getHeader()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public byte[] getSerializedObject(java.lang.Class<?> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, byte[]> r0 = r1.serializedObjects
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            return r2
    }

    public byte[] getSerializedObject(java.lang.String r1) {
            r0 = this;
            java.awt.datatransfer.DataFlavor r1 = java.awt.datatransfer.SystemFlavorMap.decodeDataFlavor(r1)     // Catch: java.lang.Exception -> Ld
            java.lang.Class r1 = r1.getRepresentationClass()     // Catch: java.lang.Exception -> Ld
            byte[] r1 = r0.getSerializedObject(r1)     // Catch: java.lang.Exception -> Ld
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.text
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String getURL() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public boolean isNativeFormatAvailable(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "text/plain"
            boolean r1 = r4.equals(r1)
            r2 = 1
            if (r1 == 0) goto L13
            java.lang.String r4 = r3.text
            if (r4 == 0) goto L12
            return r2
        L12:
            return r0
        L13:
            java.lang.String r1 = "application/x-java-file-list"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L21
            java.lang.String[] r4 = r3.fileList
            if (r4 == 0) goto L20
            return r2
        L20:
            return r0
        L21:
            java.lang.String r1 = "application/x-java-url"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L2f
            java.lang.String r4 = r3.url
            if (r4 == 0) goto L2e
            return r2
        L2e:
            return r0
        L2f:
            java.lang.String r1 = "text/html"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L3d
            java.lang.String r4 = r3.html
            if (r4 == 0) goto L3c
            return r2
        L3c:
            return r0
        L3d:
            java.lang.String r1 = "image/x-java-image"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L4b
            org.apache.harmony.awt.datatransfer.RawBitmap r4 = r3.rawBitmap
            if (r4 == 0) goto L4a
            return r2
        L4a:
            return r0
        L4b:
            java.awt.datatransfer.DataFlavor r4 = java.awt.datatransfer.SystemFlavorMap.decodeDataFlavor(r4)     // Catch: java.lang.Exception -> L5a
            java.util.Map<java.lang.Class<?>, byte[]> r1 = r3.serializedObjects     // Catch: java.lang.Exception -> L5a
            java.lang.Class r4 = r4.getRepresentationClass()     // Catch: java.lang.Exception -> L5a
            boolean r4 = r1.containsKey(r4)     // Catch: java.lang.Exception -> L5a
            return r4
        L5a:
            return r0
    }
}
