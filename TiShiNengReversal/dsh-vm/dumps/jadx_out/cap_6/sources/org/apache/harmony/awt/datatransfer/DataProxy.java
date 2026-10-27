package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DataProxy implements java.awt.datatransfer.Transferable {
    public static final java.lang.Class[] charsetTextClasses = null;
    public static final java.lang.Class[] unicodeTextClasses = null;
    private final org.apache.harmony.awt.datatransfer.DataProvider data;
    private final java.awt.datatransfer.SystemFlavorMap flavorMap;

    static {
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r2 = 1
            java.lang.Class<java.io.Reader> r3 = java.io.Reader.class
            r0[r2] = r3
            r3 = 2
            java.lang.Class<java.nio.CharBuffer> r4 = java.nio.CharBuffer.class
            r0[r3] = r4
            r4 = 3
            java.lang.Class<char[]> r5 = char[].class
            r0[r4] = r5
            org.apache.harmony.awt.datatransfer.DataProxy.unicodeTextClasses = r0
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<byte[]> r4 = byte[].class
            r0[r1] = r4
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r0[r2] = r1
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r0[r3] = r1
            org.apache.harmony.awt.datatransfer.DataProxy.charsetTextClasses = r0
            return
    }

    public DataProxy(org.apache.harmony.awt.datatransfer.DataProvider r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            java.awt.datatransfer.FlavorMap r1 = java.awt.datatransfer.SystemFlavorMap.getDefaultFlavorMap()
            java.awt.datatransfer.SystemFlavorMap r1 = (java.awt.datatransfer.SystemFlavorMap) r1
            r0.flavorMap = r1
            return
    }

    private java.awt.image.BufferedImage createBufferedImage(org.apache.harmony.awt.datatransfer.RawBitmap r17) {
            r16 = this;
            r0 = r17
            r1 = 0
            if (r0 == 0) goto Lef
            java.lang.Object r2 = r0.buffer
            if (r2 == 0) goto Lef
            int r3 = r0.width
            if (r3 <= 0) goto Lef
            int r3 = r0.height
            if (r3 > 0) goto L13
            goto Lef
        L13:
            int r3 = r0.bits
            r4 = 32
            r5 = 0
            r6 = 24
            if (r3 != r4) goto L59
            boolean r4 = r2 instanceof int[]
            if (r4 == 0) goto L59
            boolean r2 = r16.isRGB(r17)
            if (r2 != 0) goto L2d
            boolean r2 = r16.isBGR(r17)
            if (r2 != 0) goto L2d
            return r1
        L2d:
            int r2 = r0.rMask
            int r3 = r0.gMask
            int r4 = r0.bMask
            int[] r11 = new int[]{r2, r3, r4}
            java.lang.Object r2 = r0.buffer
            int[] r2 = (int[]) r2
            java.awt.image.DirectColorModel r3 = new java.awt.image.DirectColorModel
            int r4 = r0.rMask
            int r7 = r0.gMask
            int r8 = r0.bMask
            r3.<init>(r6, r4, r7, r8)
            java.awt.image.DataBufferInt r7 = new java.awt.image.DataBufferInt
            int r4 = r2.length
            r7.<init>(r2, r4)
            int r8 = r0.width
            int r9 = r0.height
            int r10 = r0.stride
            r12 = 0
            java.awt.image.WritableRaster r0 = java.awt.image.Raster.createPackedRaster(r7, r8, r9, r10, r11, r12)
            goto Le4
        L59:
            if (r3 != r6) goto Lab
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto Lab
            r2 = 8
            int[] r8 = new int[]{r2, r2, r2}
            boolean r2 = r16.isRGB(r17)
            r3 = 3
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L76
            int[] r2 = new int[r3]
            r2[r6] = r6
            r2[r4] = r4
        L74:
            r14 = r2
            goto L83
        L76:
            boolean r2 = r16.isBGR(r17)
            if (r2 == 0) goto Laa
            int[] r2 = new int[r3]
            r2[r5] = r4
            r2[r6] = r6
            goto L74
        L83:
            java.lang.Object r2 = r0.buffer
            byte[] r2 = (byte[]) r2
            java.awt.image.ComponentColorModel r6 = new java.awt.image.ComponentColorModel
            r3 = 1000(0x3e8, float:1.401E-42)
            java.awt.color.ColorSpace r7 = java.awt.color.ColorSpace.getInstance(r3)
            r11 = 1
            r12 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.awt.image.DataBufferByte r9 = new java.awt.image.DataBufferByte
            int r3 = r2.length
            r9.<init>(r2, r3)
            int r10 = r0.width
            int r11 = r0.height
            int r12 = r0.stride
            r13 = 3
            r15 = 0
            java.awt.image.WritableRaster r0 = java.awt.image.Raster.createInterleavedRaster(r9, r10, r11, r12, r13, r14, r15)
            r3 = r6
            goto Le4
        Laa:
            return r1
        Lab:
            r4 = 16
            if (r3 == r4) goto Lb3
            r4 = 15
            if (r3 != r4) goto Le2
        Lb3:
            boolean r3 = r2 instanceof short[]
            if (r3 == 0) goto Le2
            int r3 = r0.rMask
            int r4 = r0.gMask
            int r6 = r0.bMask
            int[] r11 = new int[]{r3, r4, r6}
            short[] r2 = (short[]) r2
            java.awt.image.DirectColorModel r3 = new java.awt.image.DirectColorModel
            int r4 = r0.bits
            int r6 = r0.rMask
            int r7 = r0.gMask
            int r8 = r0.bMask
            r3.<init>(r4, r6, r7, r8)
            java.awt.image.DataBufferUShort r7 = new java.awt.image.DataBufferUShort
            int r4 = r2.length
            r7.<init>(r2, r4)
            int r8 = r0.width
            int r9 = r0.height
            int r10 = r0.stride
            r12 = 0
            java.awt.image.WritableRaster r0 = java.awt.image.Raster.createPackedRaster(r7, r8, r9, r10, r11, r12)
            goto Le4
        Le2:
            r0 = r1
            r3 = r0
        Le4:
            if (r3 == 0) goto Lef
            if (r0 != 0) goto Le9
            goto Lef
        Le9:
            java.awt.image.BufferedImage r2 = new java.awt.image.BufferedImage
            r2.<init>(r3, r0, r5, r1)
            return r2
        Lef:
            return r1
    }

    private java.lang.String getCharset(java.awt.datatransfer.DataFlavor r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            java.lang.String r2 = r2.getParameter(r0)
            return r2
    }

    private java.lang.Object getFileList(java.awt.datatransfer.DataFlavor r3) throws java.io.IOException, java.awt.datatransfer.UnsupportedFlavorException {
            r2 = this;
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.String r1 = "application/x-java-file-list"
            boolean r0 = r0.isNativeFormatAvailable(r1)
            if (r0 == 0) goto L23
            org.apache.harmony.awt.datatransfer.DataProvider r3 = r2.data
            java.lang.String[] r3 = r3.getFileList()
            if (r3 == 0) goto L17
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "awt.4F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
        L23:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r3)
            throw r0
    }

    private java.lang.Object getHTML(java.awt.datatransfer.DataFlavor r3) throws java.io.IOException, java.awt.datatransfer.UnsupportedFlavorException {
            r2 = this;
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.String r1 = "text/html"
            boolean r0 = r0.isNativeFormatAvailable(r1)
            if (r0 == 0) goto L23
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.String r0 = r0.getHTML()
            if (r0 == 0) goto L17
            java.lang.Object r3 = r2.getTextRepresentation(r0, r3)
            return r3
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "awt.4F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
        L23:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r3)
            throw r0
    }

    private java.awt.Image getImage(java.awt.datatransfer.DataFlavor r3) throws java.io.IOException, java.awt.datatransfer.UnsupportedFlavorException {
            r2 = this;
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.String r1 = "image/x-java-image"
            boolean r0 = r0.isNativeFormatAvailable(r1)
            if (r0 == 0) goto L23
            org.apache.harmony.awt.datatransfer.DataProvider r3 = r2.data
            org.apache.harmony.awt.datatransfer.RawBitmap r3 = r3.getRawBitmap()
            if (r3 == 0) goto L17
            java.awt.image.BufferedImage r3 = r2.createBufferedImage(r3)
            return r3
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "awt.4F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
        L23:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r3)
            throw r0
    }

    private java.lang.Object getPlainText(java.awt.datatransfer.DataFlavor r3) throws java.io.IOException, java.awt.datatransfer.UnsupportedFlavorException {
            r2 = this;
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.String r1 = "text/plain"
            boolean r0 = r0.isNativeFormatAvailable(r1)
            if (r0 == 0) goto L23
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L17
            java.lang.Object r3 = r2.getTextRepresentation(r0, r3)
            return r3
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "awt.4F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
        L23:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r3)
            throw r0
    }

    private java.lang.Object getSerializedObject(java.awt.datatransfer.DataFlavor r3) throws java.io.IOException, java.awt.datatransfer.UnsupportedFlavorException {
            r2 = this;
            java.lang.String r0 = java.awt.datatransfer.SystemFlavorMap.encodeDataFlavor(r3)
            if (r0 == 0) goto L40
            org.apache.harmony.awt.datatransfer.DataProvider r1 = r2.data
            boolean r0 = r1.isNativeFormatAvailable(r0)
            if (r0 == 0) goto L40
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r2.data
            java.lang.Class r3 = r3.getRepresentationClass()
            byte[] r3 = r0.getSerializedObject(r3)
            if (r3 == 0) goto L34
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L29
            r3.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L29
            java.lang.Object r3 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L29
            return r3
        L29:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            throw r0
        L34:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "awt.4F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
        L40:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r3)
            throw r0
    }

    private java.lang.Object getTextRepresentation(java.lang.String r4, java.awt.datatransfer.DataFlavor r5) throws java.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r3 = this;
            java.lang.Class r0 = r5.getRepresentationClass()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L9
            return r4
        L9:
            boolean r0 = r5.isRepresentationClassReader()
            if (r0 == 0) goto L15
            java.io.StringReader r5 = new java.io.StringReader
            r5.<init>(r4)
            return r5
        L15:
            boolean r0 = r5.isRepresentationClassCharBuffer()
            if (r0 == 0) goto L20
            java.nio.CharBuffer r4 = java.nio.CharBuffer.wrap(r4)
            return r4
        L20:
            java.lang.Class r0 = r5.getRepresentationClass()
            java.lang.Class<char[]> r1 = char[].class
            if (r0 != r1) goto L37
            int r5 = r4.length()
            char[] r5 = new char[r5]
            int r0 = r4.length()
            r1 = 0
            r4.getChars(r1, r0, r5, r1)
            return r5
        L37:
            java.lang.String r0 = r3.getCharset(r5)
            java.lang.Class r1 = r5.getRepresentationClass()
            java.lang.Class<byte[]> r2 = byte[].class
            if (r1 != r2) goto L48
            byte[] r4 = r4.getBytes(r0)
            return r4
        L48:
            boolean r1 = r5.isRepresentationClassByteBuffer()
            if (r1 == 0) goto L57
            byte[] r4 = r4.getBytes(r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            return r4
        L57:
            boolean r1 = r5.isRepresentationClassInputStream()
            if (r1 == 0) goto L67
            byte[] r4 = r4.getBytes(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r4)
            return r5
        L67:
            java.awt.datatransfer.UnsupportedFlavorException r4 = new java.awt.datatransfer.UnsupportedFlavorException
            r4.<init>(r5)
            throw r4
    }

    private java.lang.Object getURL(java.awt.datatransfer.DataFlavor r4) throws java.io.IOException, java.awt.datatransfer.UnsupportedFlavorException {
            r3 = this;
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r3.data
            java.lang.String r1 = "application/x-java-url"
            boolean r0 = r0.isNativeFormatAvailable(r1)
            if (r0 == 0) goto L45
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r3.data
            java.lang.String r0 = r0.getURL()
            if (r0 == 0) goto L39
            java.net.URL r1 = new java.net.URL
            r1.<init>(r0)
            java.lang.Class r0 = r4.getRepresentationClass()
            java.lang.Class<java.net.URL> r2 = java.net.URL.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L24
            return r1
        L24:
            boolean r0 = r4.isFlavorTextType()
            if (r0 == 0) goto L33
            java.lang.String r0 = r1.toString()
            java.lang.Object r4 = r3.getTextRepresentation(r0, r4)
            return r4
        L33:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r4)
            throw r0
        L39:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "awt.4F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r4.<init>(r0)
            throw r4
        L45:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r4)
            throw r0
    }

    private boolean isBGR(org.apache.harmony.awt.datatransfer.RawBitmap r3) {
            r2 = this;
            int r0 = r3.rMask
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L15
            int r0 = r3.gMask
            r1 = 65280(0xff00, float:9.1477E-41)
            if (r0 != r1) goto L15
            int r3 = r3.bMask
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            if (r3 != r0) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    private boolean isRGB(org.apache.harmony.awt.datatransfer.RawBitmap r3) {
            r2 = this;
            int r0 = r3.rMask
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            if (r0 != r1) goto L15
            int r0 = r3.gMask
            r1 = 65280(0xff00, float:9.1477E-41)
            if (r0 != r1) goto L15
            int r3 = r3.bMask
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    public org.apache.harmony.awt.datatransfer.DataProvider getDataProvider() {
            r1 = this;
            org.apache.harmony.awt.datatransfer.DataProvider r0 = r1.data
            return r0
    }

    public java.lang.Object getTransferData(java.awt.datatransfer.DataFlavor r3) throws java.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.getPrimaryType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r3.getSubType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = r3.isFlavorTextType()
            if (r1 == 0) goto L42
            java.lang.String r1 = "text/html"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L30
            java.lang.Object r3 = r2.getHTML(r3)
            return r3
        L30:
            java.lang.String r1 = "text/uri-list"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3d
            java.lang.Object r3 = r2.getURL(r3)
            return r3
        L3d:
            java.lang.Object r3 = r2.getPlainText(r3)
            return r3
        L42:
            boolean r1 = r3.isFlavorJavaFileListType()
            if (r1 == 0) goto L4d
            java.lang.Object r3 = r2.getFileList(r3)
            return r3
        L4d:
            boolean r1 = r3.isFlavorSerializedObjectType()
            if (r1 == 0) goto L58
            java.lang.Object r3 = r2.getSerializedObject(r3)
            return r3
        L58:
            java.awt.datatransfer.DataFlavor r1 = org.apache.harmony.awt.datatransfer.DataProvider.urlFlavor
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L65
            java.lang.Object r3 = r2.getURL(r3)
            return r3
        L65:
            java.lang.String r1 = "image/x-java-image"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L7e
            java.lang.Class<java.awt.Image> r0 = java.awt.Image.class
            java.lang.Class r1 = r3.getRepresentationClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L7e
            java.awt.Image r3 = r2.getImage(r3)
            return r3
        L7e:
            java.awt.datatransfer.UnsupportedFlavorException r0 = new java.awt.datatransfer.UnsupportedFlavorException
            r0.<init>(r3)
            throw r0
    }

    public java.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.harmony.awt.datatransfer.DataProvider r1 = r6.data
            java.lang.String[] r1 = r1.getNativeFormats()
            r2 = 0
        Lc:
            int r3 = r1.length
            if (r2 < r3) goto L1c
            int r1 = r0.size()
            java.awt.datatransfer.DataFlavor[] r1 = new java.awt.datatransfer.DataFlavor[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.awt.datatransfer.DataFlavor[] r0 = (java.awt.datatransfer.DataFlavor[]) r0
            return r0
        L1c:
            java.awt.datatransfer.SystemFlavorMap r3 = r6.flavorMap
            r4 = r1[r2]
            java.util.List r3 = r3.getFlavorsForNative(r4)
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L31
            int r2 = r2 + 1
            goto Lc
        L31:
            java.lang.Object r4 = r3.next()
            java.awt.datatransfer.DataFlavor r4 = (java.awt.datatransfer.DataFlavor) r4
            boolean r5 = r0.contains(r4)
            if (r5 != 0) goto L28
            r0.add(r4)
            goto L28
    }

    public boolean isDataFlavorSupported(java.awt.datatransfer.DataFlavor r5) {
            r4 = this;
            java.awt.datatransfer.DataFlavor[] r0 = r4.getTransferDataFlavors()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.length
            if (r2 < r3) goto La
            return r1
        La:
            r3 = r0[r2]
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L14
            r5 = 1
            return r5
        L14:
            int r2 = r2 + 1
            goto L6
    }
}
