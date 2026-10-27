package myjava.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DataFlavor implements java.io.Externalizable, java.lang.Cloneable {
    public static final myjava.awt.datatransfer.DataFlavor javaFileListFlavor = null;
    public static final java.lang.String javaJVMLocalObjectMimeType = "application/x-java-jvm-local-objectref";
    public static final java.lang.String javaRemoteObjectMimeType = "application/x-java-remote-object";
    public static final java.lang.String javaSerializedObjectMimeType = "application/x-java-serialized-object";

    @java.lang.Deprecated
    public static final myjava.awt.datatransfer.DataFlavor plainTextFlavor = null;
    private static myjava.awt.datatransfer.DataFlavor plainUnicodeFlavor = null;
    private static final long serialVersionUID = 8367026044764648243L;
    private static final java.lang.String[] sortedTextFlavors = null;
    public static final myjava.awt.datatransfer.DataFlavor stringFlavor = null;
    private java.lang.String humanPresentableName;
    private myjava.awt.datatransfer.MimeTypeProcessor.MimeType mimeInfo;
    private java.lang.Class<?> representationClass;

    static {
            myjava.awt.datatransfer.DataFlavor r0 = new myjava.awt.datatransfer.DataFlavor
            java.lang.String r1 = "text/plain; charset=unicode; class=java.io.InputStream"
            java.lang.String r2 = "Plain Text"
            r0.<init>(r1, r2)
            myjava.awt.datatransfer.DataFlavor.plainTextFlavor = r0
            myjava.awt.datatransfer.DataFlavor r0 = new myjava.awt.datatransfer.DataFlavor
            java.lang.String r1 = "application/x-java-serialized-object; class=java.lang.String"
            java.lang.String r2 = "Unicode String"
            r0.<init>(r1, r2)
            myjava.awt.datatransfer.DataFlavor.stringFlavor = r0
            myjava.awt.datatransfer.DataFlavor r0 = new myjava.awt.datatransfer.DataFlavor
            java.lang.String r1 = "application/x-java-file-list; class=java.util.List"
            java.lang.String r2 = "application/x-java-file-list"
            r0.<init>(r1, r2)
            myjava.awt.datatransfer.DataFlavor.javaFileListFlavor = r0
            java.lang.String r17 = "application/x-java-serialized-object"
            java.lang.String r18 = "text/plain"
            java.lang.String r3 = "text/sgml"
            java.lang.String r4 = "text/xml"
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "text/rtf"
            java.lang.String r7 = "text/enriched"
            java.lang.String r8 = "text/richtext"
            java.lang.String r9 = "text/uri-list"
            java.lang.String r10 = "text/tab-separated-values"
            java.lang.String r11 = "text/t140"
            java.lang.String r12 = "text/rfc822-headers"
            java.lang.String r13 = "text/parityfec"
            java.lang.String r14 = "text/directory"
            java.lang.String r15 = "text/css"
            java.lang.String r16 = "text/calendar"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            myjava.awt.datatransfer.DataFlavor.sortedTextFlavors = r0
            r0 = 0
            myjava.awt.datatransfer.DataFlavor.plainUnicodeFlavor = r0
            return
    }

    public DataFlavor() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mimeInfo = r0
            r1.humanPresentableName = r0
            r1.representationClass = r0
            return
    }

    public DataFlavor(java.lang.Class<?> r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = new myjava.awt.datatransfer.MimeTypeProcessor$MimeType
            java.lang.String r1 = "application"
            java.lang.String r2 = "x-java-serialized-object"
            r0.<init>(r1, r2)
            r3.mimeInfo = r0
            if (r5 == 0) goto L13
            r3.humanPresentableName = r5
            goto L17
        L13:
            java.lang.String r5 = "application/x-java-serialized-object"
            r3.humanPresentableName = r5
        L17:
            java.lang.String r5 = "class"
            java.lang.String r1 = r4.getName()
            r0.addParameter(r5, r1)
            r3.representationClass = r4
            return
    }

    public DataFlavor(java.lang.String r2) throws java.lang.ClassNotFoundException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.init(r2, r0, r0)
            return
    }

    public DataFlavor(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.init(r3, r4, r0)     // Catch: java.lang.ClassNotFoundException -> L8
            return
        L8:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r2.mimeInfo
            java.lang.String r1 = "class"
            java.lang.String r0 = r0.getParameter(r1)
            java.lang.String r1 = "awt.16C"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r1, r0)
            r4.<init>(r0, r3)
            throw r4
    }

    public DataFlavor(java.lang.String r1, java.lang.String r2, java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException {
            r0 = this;
            r0.<init>()
            r0.init(r1, r2, r3)
            return
    }

    private static java.util.List<myjava.awt.datatransfer.DataFlavor> fetchTextFlavors(java.util.List<myjava.awt.datatransfer.DataFlavor> r3, java.lang.String r4) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L18
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L17
            r3 = 0
            return r3
        L17:
            return r0
        L18:
            java.lang.Object r1 = r3.next()
            myjava.awt.datatransfer.DataFlavor r1 = (myjava.awt.datatransfer.DataFlavor) r1
            boolean r2 = r1.isFlavorTextType()
            if (r2 == 0) goto L3d
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = r1.mimeInfo
            java.lang.String r2 = r2.getFullType()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L9
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L39
            r0.add(r1)
        L39:
            r3.remove()
            goto L9
        L3d:
            r3.remove()
            goto L9
    }

    private java.lang.String getCharset() {
            r3 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r3.mimeInfo
            java.lang.String r1 = ""
            if (r0 == 0) goto L30
            boolean r0 = r3.isCharsetRedundant()
            if (r0 == 0) goto Ld
            goto L30
        Ld:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r3.mimeInfo
            java.lang.String r2 = "charset"
            java.lang.String r0 = r0.getParameter(r2)
            boolean r2 = r3.isCharsetRequired()
            if (r2 == 0) goto L2c
            if (r0 == 0) goto L23
            int r2 = r0.length()
            if (r2 != 0) goto L2c
        L23:
            org.apache.harmony.awt.datatransfer.DTK r0 = org.apache.harmony.awt.datatransfer.DTK.getDTK()
            java.lang.String r0 = r0.getDefaultCharset()
            return r0
        L2c:
            if (r0 != 0) goto L2f
            return r1
        L2f:
            return r0
        L30:
            return r1
    }

    private static java.util.List<myjava.awt.datatransfer.DataFlavor> getFlavors(java.util.List<myjava.awt.datatransfer.DataFlavor> r4, java.lang.Class<?> r5) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L17
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L16
            r4 = 0
        L16:
            return r4
        L17:
            java.lang.Object r2 = r1.next()
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            java.lang.Class<?> r3 = r2.representationClass
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L9
            r0.add(r2)
            goto L9
    }

    private static java.util.List<myjava.awt.datatransfer.DataFlavor> getFlavors(java.util.List<myjava.awt.datatransfer.DataFlavor> r7, java.lang.String[] r8) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L17
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L16
            r7 = 0
        L16:
            return r7
        L17:
            java.lang.Object r2 = r1.next()
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            java.lang.String r3 = r2.getCharset()
            boolean r3 = isCharsetSupported(r3)
            if (r3 == 0) goto L46
            int r3 = r8.length
            r4 = 0
        L29:
            if (r4 < r3) goto L2c
            goto L9
        L2c:
            r5 = r8[r4]
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            java.lang.String r6 = r2.getCharset()
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L43
            r0.add(r2)
        L43:
            int r4 = r4 + 1
            goto L29
        L46:
            r1.remove()
            goto L9
    }

    private java.lang.String getKeyInfo() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r1 = r3.mimeInfo
            java.lang.String r1 = r1.getFullType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ";class="
            r0.append(r1)
            java.lang.Class<?> r1 = r3.representationClass
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r1 = r3.mimeInfo
            java.lang.String r1 = r1.getPrimaryType()
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L53
            boolean r1 = r3.isUnicodeFlavor()
            if (r1 == 0) goto L36
            goto L53
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            java.lang.String r0 = ";charset="
            r1.append(r0)
            java.lang.String r0 = r3.getCharset()
            java.lang.String r0 = r0.toLowerCase()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L53:
            return r0
    }

    public static final myjava.awt.datatransfer.DataFlavor getTextPlainUnicodeFlavor() {
            myjava.awt.datatransfer.DataFlavor r0 = myjava.awt.datatransfer.DataFlavor.plainUnicodeFlavor
            if (r0 != 0) goto L28
            myjava.awt.datatransfer.DataFlavor r0 = new myjava.awt.datatransfer.DataFlavor
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "text/plain; charset="
            r1.<init>(r2)
            org.apache.harmony.awt.datatransfer.DTK r2 = org.apache.harmony.awt.datatransfer.DTK.getDTK()
            java.lang.String r2 = r2.getDefaultCharset()
            r1.append(r2)
            java.lang.String r2 = "; class=java.io.InputStream"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Plain Text"
            r0.<init>(r1, r2)
            myjava.awt.datatransfer.DataFlavor.plainUnicodeFlavor = r0
        L28:
            myjava.awt.datatransfer.DataFlavor r0 = myjava.awt.datatransfer.DataFlavor.plainUnicodeFlavor
            return r0
    }

    private void init(java.lang.String r2, java.lang.String r3, java.lang.ClassLoader r4) throws java.lang.ClassNotFoundException {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = myjava.awt.datatransfer.MimeTypeProcessor.parse(r2)     // Catch: java.lang.IllegalArgumentException -> L4c
            r1.mimeInfo = r0     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r3 == 0) goto Lb
            r1.humanPresentableName = r3
            goto L2c
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = r0.getPrimaryType()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r3 = 47
            r2.append(r3)
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r3 = r1.mimeInfo
            java.lang.String r3 = r3.getSubType()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.humanPresentableName = r2
        L2c:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = r1.mimeInfo
            java.lang.String r3 = "class"
            java.lang.String r2 = r2.getParameter(r3)
            if (r2 != 0) goto L3e
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = r1.mimeInfo
            java.lang.String r0 = "java.io.InputStream"
            r2.addParameter(r3, r0)
            r2 = r0
        L3e:
            if (r4 != 0) goto L45
            java.lang.Class r2 = java.lang.Class.forName(r2)
            goto L49
        L45:
            java.lang.Class r2 = r4.loadClass(r2)
        L49:
            r1.representationClass = r2
            return
        L4c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "awt.16D"
            java.lang.String r2 = org.apache.harmony.awt.internal.nls.Messages.getString(r4, r2)
            r3.<init>(r2)
            throw r3
    }

    private boolean isByteCodeFlavor() {
            r2 = this;
            java.lang.Class<?> r0 = r2.representationClass
            if (r0 == 0) goto L22
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            java.lang.Class<?> r0 = r2.representationClass
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            java.lang.Class<?> r0 = r2.representationClass
            java.lang.Class<byte[]> r1 = byte[].class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    private boolean isCharsetRedundant() {
            r2 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r2.mimeInfo
            java.lang.String r0 = r0.getFullType()
            java.lang.String r1 = "text/rtf"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "text/tab-separated-values"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "text/t140"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "text/rfc822-headers"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "text/parityfec"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            r0 = 0
            return r0
        L30:
            r0 = 1
            return r0
    }

    private boolean isCharsetRequired() {
            r2 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r2.mimeInfo
            java.lang.String r0 = r0.getFullType()
            java.lang.String r1 = "text/sgml"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/xml"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/html"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/enriched"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/richtext"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/uri-list"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/directory"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/css"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/calendar"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "application/x-java-serialized-object"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "text/plain"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L60
            r0 = 0
            return r0
        L60:
            r0 = 1
            return r0
    }

    private static boolean isCharsetSupported(java.lang.String r0) {
            boolean r0 = java.nio.charset.Charset.isSupported(r0)     // Catch: java.nio.charset.IllegalCharsetNameException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private boolean isUnicodeFlavor() {
            r2 = this;
            java.lang.Class<?> r0 = r2.representationClass
            if (r0 == 0) goto L2c
            java.lang.Class<java.io.Reader> r1 = java.io.Reader.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.Class<?> r0 = r2.representationClass
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.Class<?> r0 = r2.representationClass
            java.lang.Class<java.nio.CharBuffer> r1 = java.nio.CharBuffer.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.Class<?> r0 = r2.representationClass
            java.lang.Class<char[]> r1 = char[].class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
        L2a:
            r0 = 1
            return r0
        L2c:
            r0 = 0
            return r0
    }

    private static java.util.List<myjava.awt.datatransfer.DataFlavor> selectBestByAlphabet(java.util.List<myjava.awt.datatransfer.DataFlavor> r6) {
            int r0 = r6.size()
            java.lang.String[] r1 = new java.lang.String[r0]
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = 0
            r4 = 0
        Ld:
            if (r4 < r0) goto L3d
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.util.Arrays.sort(r1, r0)
            java.util.Iterator r5 = r6.iterator()
        L18:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L27
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L26
            r6 = 0
            return r6
        L26:
            return r2
        L27:
            java.lang.Object r6 = r5.next()
            myjava.awt.datatransfer.DataFlavor r6 = (myjava.awt.datatransfer.DataFlavor) r6
            r0 = r1[r3]
            java.lang.String r4 = r6.getCharset()
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L18
            r2.add(r6)
            goto L18
        L3d:
            java.lang.Object r5 = r6.get(r4)
            myjava.awt.datatransfer.DataFlavor r5 = (myjava.awt.datatransfer.DataFlavor) r5
            java.lang.String r5 = r5.getCharset()
            r1[r4] = r5
            int r4 = r4 + 1
            goto Ld
    }

    private static myjava.awt.datatransfer.DataFlavor selectBestByCharset(java.util.List<myjava.awt.datatransfer.DataFlavor> r4) {
            java.lang.String r0 = "UTF-16BE"
            java.lang.String r1 = "UTF-16LE"
            java.lang.String r2 = "UTF-16"
            java.lang.String r3 = "UTF-8"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = getFlavors(r4, r0)
            if (r0 != 0) goto L34
            org.apache.harmony.awt.datatransfer.DTK r0 = org.apache.harmony.awt.datatransfer.DTK.getDTK()
            java.lang.String r0 = r0.getDefaultCharset()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = getFlavors(r4, r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "US-ASCII"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = getFlavors(r4, r0)
            if (r0 != 0) goto L34
            java.util.List r0 = selectBestByAlphabet(r4)
        L34:
            if (r0 == 0) goto L4a
            int r4 = r0.size()
            r1 = 1
            if (r4 != r1) goto L45
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            myjava.awt.datatransfer.DataFlavor r4 = (myjava.awt.datatransfer.DataFlavor) r4
            return r4
        L45:
            myjava.awt.datatransfer.DataFlavor r4 = selectBestFlavorWOCharset(r0)
            return r4
        L4a:
            r4 = 0
            return r4
    }

    private static myjava.awt.datatransfer.DataFlavor selectBestFlavorWCharset(java.util.List<myjava.awt.datatransfer.DataFlavor> r2) {
            java.lang.Class<java.io.Reader> r0 = java.io.Reader.class
            java.util.List r0 = getFlavors(r2, r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L10:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.util.List r0 = getFlavors(r2, r0)
            if (r0 == 0) goto L1f
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L1f:
            java.lang.Class<java.nio.CharBuffer> r0 = java.nio.CharBuffer.class
            java.util.List r0 = getFlavors(r2, r0)
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L2e:
            java.lang.Class<char[]> r0 = char[].class
            java.util.List r0 = getFlavors(r2, r0)
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L3d:
            myjava.awt.datatransfer.DataFlavor r2 = selectBestByCharset(r2)
            return r2
    }

    private static myjava.awt.datatransfer.DataFlavor selectBestFlavorWOCharset(java.util.List<myjava.awt.datatransfer.DataFlavor> r2) {
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.util.List r0 = getFlavors(r2, r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L10:
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.util.List r0 = getFlavors(r2, r0)
            if (r0 == 0) goto L1f
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L1f:
            java.lang.Class<byte[]> r0 = byte[].class
            java.util.List r0 = getFlavors(r2, r0)
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r0.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
        L2e:
            java.lang.Object r2 = r2.get(r1)
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            return r2
    }

    public static final myjava.awt.datatransfer.DataFlavor selectBestTextFlavor(myjava.awt.datatransfer.DataFlavor[] r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.LinkedList r1 = new java.util.LinkedList
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.<init>(r3)
            java.util.List r3 = sortTextFlavorsByType(r1)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L18
            return r0
        L18:
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r3 = r3.get(r0)
            myjava.awt.datatransfer.DataFlavor r3 = (myjava.awt.datatransfer.DataFlavor) r3
            return r3
        L2d:
            java.lang.Object r0 = r3.get(r0)
            myjava.awt.datatransfer.DataFlavor r0 = (myjava.awt.datatransfer.DataFlavor) r0
            java.lang.String r0 = r0.getCharset()
            int r0 = r0.length()
            if (r0 != 0) goto L42
            myjava.awt.datatransfer.DataFlavor r3 = selectBestFlavorWOCharset(r3)
            return r3
        L42:
            myjava.awt.datatransfer.DataFlavor r3 = selectBestFlavorWCharset(r3)
            return r3
    }

    private static java.util.List<java.util.List<myjava.awt.datatransfer.DataFlavor>> sortTextFlavorsByType(java.util.List<myjava.awt.datatransfer.DataFlavor> r5) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String[] r1 = myjava.awt.datatransfer.DataFlavor.sortedTextFlavors
            int r2 = r1.length
            r3 = 0
        L9:
            if (r3 < r2) goto L15
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L14
            r0.addLast(r5)
        L14:
            return r0
        L15:
            r4 = r1[r3]
            java.util.List r4 = fetchTextFlavors(r5, r4)
            if (r4 == 0) goto L20
            r0.addLast(r4)
        L20:
            int r3 = r3 + 1
            goto L9
    }

    protected static final java.lang.Class<?> tryToLoadClass(java.lang.String r1, java.lang.ClassLoader r2) throws java.lang.ClassNotFoundException {
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            return r1
        L5:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.ClassNotFoundException -> Le
            java.lang.Class r1 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> Le
            return r1
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 == 0) goto L1e
            java.lang.Class r1 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L1e
            return r1
        L1e:
            java.lang.Class r1 = r2.loadClass(r1)
            return r1
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r2 = this;
            myjava.awt.datatransfer.DataFlavor r0 = new myjava.awt.datatransfer.DataFlavor
            r0.<init>()
            java.lang.String r1 = r2.humanPresentableName
            r0.humanPresentableName = r1
            java.lang.Class<?> r1 = r2.representationClass
            r0.representationClass = r1
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r1 = r2.mimeInfo
            if (r1 == 0) goto L18
            java.lang.Object r1 = r1.clone()
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r1 = (myjava.awt.datatransfer.MimeTypeProcessor.MimeType) r1
            goto L19
        L18:
            r1 = 0
        L19:
            r0.mimeInfo = r1
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Le
            boolean r0 = r2 instanceof myjava.awt.datatransfer.DataFlavor
            if (r0 != 0) goto L7
            goto Le
        L7:
            myjava.awt.datatransfer.DataFlavor r2 = (myjava.awt.datatransfer.DataFlavor) r2
            boolean r2 = r1.equals(r2)
            return r2
        Le:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public boolean equals(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r1 = r0.isMimeTypeEqual(r1)
            return r1
    }

    public boolean equals(myjava.awt.datatransfer.DataFlavor r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = r4.mimeInfo
            if (r2 != 0) goto L12
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r5 = r5.mimeInfo
            if (r5 != 0) goto L11
            return r0
        L11:
            return r1
        L12:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r3 = r5.mimeInfo
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L62
            java.lang.Class<?> r2 = r4.representationClass
            java.lang.Class<?> r3 = r5.representationClass
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25
            goto L62
        L25:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r1 = r4.mimeInfo
            java.lang.String r1 = r1.getPrimaryType()
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            boolean r1 = r4.isUnicodeFlavor()
            if (r1 == 0) goto L3a
            goto L61
        L3a:
            java.lang.String r0 = r4.getCharset()
            java.lang.String r5 = r5.getCharset()
            boolean r1 = isCharsetSupported(r0)
            if (r1 == 0) goto L5c
            boolean r1 = isCharsetSupported(r5)
            if (r1 != 0) goto L4f
            goto L5c
        L4f:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            boolean r5 = r0.equals(r5)
            return r5
        L5c:
            boolean r5 = r0.equalsIgnoreCase(r5)
            return r5
        L61:
            return r0
        L62:
            return r1
    }

    public final java.lang.Class<?> getDefaultRepresentationClass() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    public final java.lang.String getDefaultRepresentationClassAsString() {
            r1 = this;
            java.lang.Class r0 = r1.getDefaultRepresentationClass()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public java.lang.String getHumanPresentableName() {
            r1 = this;
            java.lang.String r0 = r1.humanPresentableName
            return r0
    }

    myjava.awt.datatransfer.MimeTypeProcessor.MimeType getMimeInfo() {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo
            return r0
    }

    public java.lang.String getMimeType() {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = myjava.awt.datatransfer.MimeTypeProcessor.assemble(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String getParameter(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r0 = "humanpresentablename"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r2 = r1.humanPresentableName
            return r2
        Lf:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo
            if (r0 == 0) goto L18
            java.lang.String r2 = r0.getParameter(r2)
            return r2
        L18:
            r2 = 0
            return r2
    }

    public java.lang.String getPrimaryType() {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getPrimaryType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.io.Reader getReaderForText(myjava.awt.datatransfer.Transferable r3) throws myjava.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r2 = this;
            java.lang.Object r3 = r3.getTransferData(r2)
            if (r3 == 0) goto L81
            boolean r0 = r3 instanceof java.io.Reader
            if (r0 == 0) goto L10
            java.io.Reader r3 = (java.io.Reader) r3
            r3.reset()
            return r3
        L10:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L1c
            java.io.StringReader r0 = new java.io.StringReader
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r3)
            return r0
        L1c:
            boolean r0 = r3 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L2c
            java.io.CharArrayReader r0 = new java.io.CharArrayReader
            java.nio.CharBuffer r3 = (java.nio.CharBuffer) r3
            char[] r3 = r3.array()
            r0.<init>(r3)
            return r0
        L2c:
            boolean r0 = r3 instanceof char[]
            if (r0 == 0) goto L38
            java.io.CharArrayReader r0 = new java.io.CharArrayReader
            char[] r3 = (char[]) r3
            r0.<init>(r3)
            return r0
        L38:
            java.lang.String r0 = r2.getCharset()
            boolean r1 = r3 instanceof java.io.InputStream
            if (r1 == 0) goto L46
            java.io.InputStream r3 = (java.io.InputStream) r3
            r3.reset()
            goto L63
        L46:
            boolean r1 = r3 instanceof java.nio.ByteBuffer
            if (r1 == 0) goto L57
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            byte[] r3 = r3.array()
            r1.<init>(r3)
        L55:
            r3 = r1
            goto L63
        L57:
            boolean r1 = r3 instanceof byte[]
            if (r1 == 0) goto L75
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r3 = (byte[]) r3
            r1.<init>(r3)
            goto L55
        L63:
            int r1 = r0.length()
            if (r1 != 0) goto L6f
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r3)
            return r0
        L6f:
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r3, r0)
            return r1
        L75:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "awt.16F"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
        L81:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "awt.16E"
            java.lang.String r0 = org.apache.harmony.awt.internal.nls.Messages.getString(r0)
            r3.<init>(r0)
            throw r3
    }

    public java.lang.Class<?> getRepresentationClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.representationClass
            return r0
    }

    public java.lang.String getSubType() {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getSubType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getKeyInfo()
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isFlavorJavaFileListType() {
            r2 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Class<?> r1 = r2.representationClass
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L14
            myjava.awt.datatransfer.DataFlavor r0 = myjava.awt.datatransfer.DataFlavor.javaFileListFlavor
            boolean r0 = r2.isMimeTypeEqual(r0)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public boolean isFlavorRemoteObjectType() {
            r1 = this;
            java.lang.String r0 = "application/x-java-remote-object"
            boolean r0 = r1.isMimeTypeEqual(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.isRepresentationClassRemote()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean isFlavorSerializedObjectType() {
            r1 = this;
            boolean r0 = r1.isMimeTypeSerializedObject()
            if (r0 == 0) goto Le
            boolean r0 = r1.isRepresentationClassSerializable()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public boolean isFlavorTextType() {
            r3 = this;
            myjava.awt.datatransfer.DataFlavor r0 = myjava.awt.datatransfer.DataFlavor.stringFlavor
            boolean r0 = r3.equals(r0)
            r1 = 1
            if (r0 != 0) goto L3f
            myjava.awt.datatransfer.DataFlavor r0 = myjava.awt.datatransfer.DataFlavor.plainTextFlavor
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            goto L3f
        L12:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r3.mimeInfo
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.getPrimaryType()
            java.lang.String r2 = "text"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L24
            r0 = 0
            return r0
        L24:
            java.lang.String r0 = r3.getCharset()
            boolean r2 = r3.isByteCodeFlavor()
            if (r2 == 0) goto L3a
            int r2 = r0.length()
            if (r2 == 0) goto L39
            boolean r0 = isCharsetSupported(r0)
            return r0
        L39:
            return r1
        L3a:
            boolean r0 = r3.isUnicodeFlavor()
            return r0
        L3f:
            return r1
    }

    public boolean isMimeTypeEqual(java.lang.String r2) {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo     // Catch: java.lang.IllegalArgumentException -> Lb
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = myjava.awt.datatransfer.MimeTypeProcessor.parse(r2)     // Catch: java.lang.IllegalArgumentException -> Lb
            boolean r2 = r0.equals(r2)     // Catch: java.lang.IllegalArgumentException -> Lb
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public final boolean isMimeTypeEqual(myjava.awt.datatransfer.DataFlavor r2) {
            r1 = this;
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo
            if (r0 == 0) goto Lb
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = r2.mimeInfo
            boolean r2 = r0.equals(r2)
            return r2
        Lb:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = r2.mimeInfo
            if (r2 != 0) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public boolean isMimeTypeSerializedObject() {
            r1 = this;
            java.lang.String r0 = "application/x-java-serialized-object"
            boolean r0 = r1.isMimeTypeEqual(r0)
            return r0
    }

    public boolean isRepresentationClassByteBuffer() {
            r2 = this;
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class<?> r1 = r2.representationClass
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public boolean isRepresentationClassCharBuffer() {
            r2 = this;
            java.lang.Class<java.nio.CharBuffer> r0 = java.nio.CharBuffer.class
            java.lang.Class<?> r1 = r2.representationClass
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public boolean isRepresentationClassInputStream() {
            r2 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class<?> r1 = r2.representationClass
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public boolean isRepresentationClassReader() {
            r2 = this;
            java.lang.Class<java.io.Reader> r0 = java.io.Reader.class
            java.lang.Class<?> r1 = r2.representationClass
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public boolean isRepresentationClassRemote() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isRepresentationClassSerializable() {
            r2 = this;
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            java.lang.Class<?> r1 = r2.representationClass
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public boolean match(myjava.awt.datatransfer.DataFlavor r1) {
            r0 = this;
            boolean r1 = r0.equals(r1)
            return r1
    }

    @java.lang.Deprecated
    protected java.lang.String normalizeMimeType(java.lang.String r1) {
            r0 = this;
            return r1
    }

    @java.lang.Deprecated
    protected java.lang.String normalizeMimeTypeParameter(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return r2
    }

    @Override // java.io.Externalizable
    public synchronized void readExternal(java.io.ObjectInput r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r2.readObject()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1e
            r1.humanPresentableName = r0     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.readObject()     // Catch: java.lang.Throwable -> L1e
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r2 = (myjava.awt.datatransfer.MimeTypeProcessor.MimeType) r2     // Catch: java.lang.Throwable -> L1e
            r1.mimeInfo = r2     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            java.lang.String r0 = "class"
            java.lang.String r2 = r2.getParameter(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r2 = 0
        L21:
            r1.representationClass = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            return
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }

    public void setHumanPresentableName(java.lang.String r1) {
            r0 = this;
            r0.humanPresentableName = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            java.lang.String r1 = "[MimeType=("
            r0.append(r1)
            java.lang.String r1 = r2.getMimeType()
            r0.append(r1)
            java.lang.String r1 = ");humanPresentableName="
            r0.append(r1)
            java.lang.String r1 = r2.humanPresentableName
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.io.Externalizable
    public synchronized void writeExternal(java.io.ObjectOutput r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.humanPresentableName     // Catch: java.lang.Throwable -> Ld
            r2.writeObject(r0)     // Catch: java.lang.Throwable -> Ld
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = r1.mimeInfo     // Catch: java.lang.Throwable -> Ld
            r2.writeObject(r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }
}
