package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class FileUploadUtil {
    private FileUploadUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static int compareTo(io.netty.handler.codec.http.multipart.FileUpload r0, io.netty.handler.codec.http.multipart.FileUpload r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    static boolean equals(io.netty.handler.codec.http.multipart.FileUpload r0, io.netty.handler.codec.http.multipart.FileUpload r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    static int hashCode(io.netty.handler.codec.http.multipart.FileUpload r0) {
            java.lang.String r0 = r0.getName()
            int r0 = r0.hashCode()
            return r0
    }
}
