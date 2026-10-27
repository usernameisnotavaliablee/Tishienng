package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DataSource implements org.apache.harmony.awt.datatransfer.DataProvider {
    protected final java.awt.datatransfer.Transferable contents;
    private java.awt.datatransfer.DataFlavor[] flavors;
    private java.util.List<java.lang.String> nativeFormats;

    public DataSource(java.awt.datatransfer.Transferable r1) {
            r0 = this;
            r0.<init>()
            r0.contents = r1
            return
    }

    private org.apache.harmony.awt.datatransfer.RawBitmap getImageBitmap(java.awt.Image r6) {
            r5 = this;
            boolean r0 = r6 instanceof java.awt.image.BufferedImage
            r1 = 1
            if (r0 == 0) goto L13
            r0 = r6
            java.awt.image.BufferedImage r0 = (java.awt.image.BufferedImage) r0
            int r2 = r0.getType()
            if (r2 != r1) goto L13
            org.apache.harmony.awt.datatransfer.RawBitmap r6 = r5.getImageBitmap32(r0)
            return r6
        L13:
            r0 = 0
            int r2 = r6.getWidth(r0)
            int r3 = r6.getHeight(r0)
            if (r2 <= 0) goto L36
            if (r3 > 0) goto L21
            goto L36
        L21:
            java.awt.image.BufferedImage r4 = new java.awt.image.BufferedImage
            r4.<init>(r2, r3, r1)
            java.awt.Graphics r1 = r4.getGraphics()
            r2 = 0
            r1.drawImage(r6, r2, r2, r0)
            r1.dispose()
            org.apache.harmony.awt.datatransfer.RawBitmap r6 = r5.getImageBitmap32(r4)
            return r6
        L36:
            return r0
    }

    private org.apache.harmony.awt.datatransfer.RawBitmap getImageBitmap32(java.awt.image.BufferedImage r11) {
            r10 = this;
            int r0 = r11.getWidth()
            int r1 = r11.getHeight()
            int r0 = r0 * r1
            int[] r9 = new int[r0]
            java.awt.image.WritableRaster r0 = r11.getRaster()
            java.awt.image.DataBuffer r0 = r0.getDataBuffer()
            java.awt.image.DataBufferInt r0 = (java.awt.image.DataBufferInt) r0
            int r1 = r0.getNumBanks()
            int[] r2 = r0.getOffsets()
            r3 = 0
            r4 = 0
        L20:
            if (r3 < r1) goto L3d
            org.apache.harmony.awt.datatransfer.RawBitmap r1 = new org.apache.harmony.awt.datatransfer.RawBitmap
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            int r4 = r11.getWidth()
            r7 = 65280(0xff00, float:9.1477E-41)
            r8 = 255(0xff, float:3.57E-43)
            r5 = 32
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L3d:
            int[] r5 = r0.getData(r3)
            r6 = r2[r3]
            int r7 = r5.length
            int r7 = r7 - r6
            java.lang.System.arraycopy(r5, r6, r9, r4, r7)
            int r5 = r5.length
            r6 = r2[r3]
            int r5 = r5 - r6
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L20
    }

    private static java.util.List<java.lang.String> getNativesForFlavors(java.awt.datatransfer.DataFlavor[] r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.awt.datatransfer.FlavorMap r1 = java.awt.datatransfer.SystemFlavorMap.getDefaultFlavorMap()
            java.awt.datatransfer.SystemFlavorMap r1 = (java.awt.datatransfer.SystemFlavorMap) r1
            r2 = 0
        Lc:
            int r3 = r6.length
            if (r2 < r3) goto L10
            return r0
        L10:
            r3 = r6[r2]
            java.util.List r3 = r1.getNativesForFlavor(r3)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L23
            int r2 = r2 + 1
            goto Lc
        L23:
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r0.contains(r4)
            if (r5 != 0) goto L1a
            r0.add(r4)
            goto L1a
    }

    private java.lang.String getText(boolean r6) {
            r5 = this;
            java.awt.datatransfer.Transferable r0 = r5.contents
            java.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()
            r1 = 0
        L7:
            int r2 = r0.length
            if (r1 < r2) goto Lc
            r6 = 0
            return r6
        Lc:
            r2 = r0[r1]
            boolean r3 = r2.isFlavorTextType()
            if (r3 != 0) goto L15
            goto L3e
        L15:
            if (r6 == 0) goto L1e
            boolean r3 = r5.isHtmlFlavor(r2)
            if (r3 != 0) goto L1e
            goto L3e
        L1e:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = r2.getRepresentationClass()     // Catch: java.lang.Exception -> L3e
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L33
            java.awt.datatransfer.Transferable r3 = r5.contents     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = r3.getTransferData(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L3e
            return r2
        L33:
            java.awt.datatransfer.Transferable r3 = r5.contents     // Catch: java.lang.Exception -> L3e
            java.io.Reader r2 = r2.getReaderForText(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r6 = r5.getTextFromReader(r2)     // Catch: java.lang.Exception -> L3e
            return r6
        L3e:
            int r1 = r1 + 1
            goto L7
    }

    private java.lang.String getTextFromReader(java.io.Reader r5) throws java.io.IOException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]
        L9:
            int r2 = r5.read(r1)
            if (r2 > 0) goto L14
            java.lang.String r5 = r0.toString()
            return r5
        L14:
            r3 = 0
            r0.append(r1, r3, r2)
            goto L9
    }

    private boolean isHtmlFlavor(java.awt.datatransfer.DataFlavor r2) {
            r1 = this;
            java.lang.String r0 = "html"
            java.lang.String r2 = r2.getSubType()
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    protected java.awt.datatransfer.DataFlavor[] getDataFlavors() {
            r1 = this;
            java.awt.datatransfer.DataFlavor[] r0 = r1.flavors
            if (r0 != 0) goto Lc
            java.awt.datatransfer.Transferable r0 = r1.contents
            java.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()
            r1.flavors = r0
        Lc:
            java.awt.datatransfer.DataFlavor[] r0 = r1.flavors
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String[] getFileList() {
            r2 = this;
            java.awt.datatransfer.Transferable r0 = r2.contents     // Catch: java.lang.Exception -> L17
            java.awt.datatransfer.DataFlavor r1 = java.awt.datatransfer.DataFlavor.javaFileListFlavor     // Catch: java.lang.Exception -> L17
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Exception -> L17
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L17
            int r1 = r0.size()     // Catch: java.lang.Exception -> L17
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L17
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Exception -> L17
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Exception -> L17
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String getHTML() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.getText(r0)
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String[] getNativeFormats() {
            r2 = this;
            java.util.List r0 = r2.getNativeFormatsList()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.util.List<java.lang.String> getNativeFormatsList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.nativeFormats
            if (r0 != 0) goto Le
            java.awt.datatransfer.DataFlavor[] r0 = r1.getDataFlavors()
            java.util.List r0 = getNativesForFlavors(r0)
            r1.nativeFormats = r0
        Le:
            java.util.List<java.lang.String> r0 = r1.nativeFormats
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public org.apache.harmony.awt.datatransfer.RawBitmap getRawBitmap() {
            r5 = this;
            java.awt.datatransfer.Transferable r0 = r5.contents
            java.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()
            r1 = 0
        L7:
            int r2 = r0.length
            if (r1 < r2) goto Lc
            r0 = 0
            return r0
        Lc:
            r2 = r0[r1]
            java.lang.Class r3 = r2.getRepresentationClass()
            if (r3 == 0) goto L37
            java.lang.Class<java.awt.Image> r4 = java.awt.Image.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L37
            java.awt.datatransfer.DataFlavor r3 = java.awt.datatransfer.DataFlavor.imageFlavor
            boolean r3 = r2.isMimeTypeEqual(r3)
            if (r3 != 0) goto L2a
            boolean r3 = r2.isFlavorSerializedObjectType()
            if (r3 == 0) goto L37
        L2a:
            java.awt.datatransfer.Transferable r3 = r5.contents     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r3.getTransferData(r2)     // Catch: java.lang.Throwable -> L37
            java.awt.Image r2 = (java.awt.Image) r2     // Catch: java.lang.Throwable -> L37
            org.apache.harmony.awt.datatransfer.RawBitmap r0 = r5.getImageBitmap(r2)     // Catch: java.lang.Throwable -> L37
            return r0
        L37:
            int r1 = r1 + 1
            goto L7
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public byte[] getSerializedObject(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            java.awt.datatransfer.DataFlavor r1 = new java.awt.datatransfer.DataFlavor     // Catch: java.lang.Throwable -> L20
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L20
            java.awt.datatransfer.Transferable r4 = r3.contents     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.getTransferData(r1)     // Catch: java.lang.Throwable -> L20
            java.io.Serializable r4 = (java.io.Serializable) r4     // Catch: java.lang.Throwable -> L20
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r2.writeObject(r4)     // Catch: java.lang.Throwable -> L20
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L20
            return r4
        L20:
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String getText() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getText(r0)
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public java.lang.String getURL() {
            r2 = this;
            java.awt.datatransfer.Transferable r0 = r2.contents     // Catch: java.lang.Exception -> Lf
            java.awt.datatransfer.DataFlavor r1 = org.apache.harmony.awt.datatransfer.DataProvider.urlFlavor     // Catch: java.lang.Exception -> Lf
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Exception -> Lf
            java.net.URL r0 = (java.net.URL) r0     // Catch: java.lang.Exception -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            java.awt.datatransfer.Transferable r0 = r2.contents     // Catch: java.lang.Exception -> L1e
            java.awt.datatransfer.DataFlavor r1 = org.apache.harmony.awt.datatransfer.DataProvider.uriFlavor     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r0.getTransferData(r1)     // Catch: java.lang.Exception -> L1e
            java.net.URL r0 = (java.net.URL) r0     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1e
            return r0
        L1e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = r2.getText()     // Catch: java.lang.Exception -> L2c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            r0 = 0
            return r0
    }

    @Override // org.apache.harmony.awt.datatransfer.DataProvider
    public boolean isNativeFormatAvailable(java.lang.String r2) {
            r1 = this;
            java.util.List r0 = r1.getNativeFormatsList()
            boolean r2 = r0.contains(r2)
            return r2
    }
}
