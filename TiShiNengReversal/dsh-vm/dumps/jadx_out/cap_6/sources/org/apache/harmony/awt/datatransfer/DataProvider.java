package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DataProvider {
    public static final java.lang.String FORMAT_FILE_LIST = "application/x-java-file-list";
    public static final java.lang.String FORMAT_HTML = "text/html";
    public static final java.lang.String FORMAT_IMAGE = "image/x-java-image";
    public static final java.lang.String FORMAT_TEXT = "text/plain";
    public static final java.lang.String FORMAT_URL = "application/x-java-url";
    public static final java.lang.String TYPE_FILELIST = "application/x-java-file-list";
    public static final java.lang.String TYPE_HTML = "text/html";
    public static final java.lang.String TYPE_IMAGE = "image/x-java-image";
    public static final java.lang.String TYPE_PLAINTEXT = "text/plain";
    public static final java.lang.String TYPE_SERIALIZED = "application/x-java-serialized-object";
    public static final java.lang.String TYPE_TEXTENCODING = "application/x-java-text-encoding";
    public static final java.lang.String TYPE_URILIST = "text/uri-list";
    public static final java.lang.String TYPE_URL = "application/x-java-url";
    public static final java.awt.datatransfer.DataFlavor uriFlavor = null;
    public static final java.awt.datatransfer.DataFlavor urlFlavor = null;

    static {
            java.awt.datatransfer.DataFlavor r0 = new java.awt.datatransfer.DataFlavor
            java.lang.String r1 = "application/x-java-url;class=java.net.URL"
            java.lang.String r2 = "URL"
            r0.<init>(r1, r2)
            org.apache.harmony.awt.datatransfer.DataProvider.urlFlavor = r0
            java.awt.datatransfer.DataFlavor r0 = new java.awt.datatransfer.DataFlavor
            java.lang.String r1 = "text/uri-list"
            java.lang.String r2 = "URI"
            r0.<init>(r1, r2)
            org.apache.harmony.awt.datatransfer.DataProvider.uriFlavor = r0
            return
    }

    java.lang.String[] getFileList();

    java.lang.String getHTML();

    java.lang.String[] getNativeFormats();

    org.apache.harmony.awt.datatransfer.RawBitmap getRawBitmap();

    byte[] getSerializedObject(java.lang.Class<?> r1);

    java.lang.String getText();

    java.lang.String getURL();

    boolean isNativeFormatAvailable(java.lang.String r1);
}
