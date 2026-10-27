package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ThreadLocalCache {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BYTES_CACH_INIT_SIZE = 1024;
    public static final int BYTES_CACH_INIT_SIZE_EXP = 10;
    public static final int BYTES_CACH_MAX_SIZE = 131072;
    public static final int BYTES_CACH_MAX_SIZE_EXP = 17;
    public static final int CHARS_CACH_INIT_SIZE = 1024;
    public static final int CHARS_CACH_INIT_SIZE_EXP = 10;
    public static final int CHARS_CACH_MAX_SIZE = 131072;
    public static final int CHARS_CACH_MAX_SIZE_EXP = 17;
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> bytesBufLocal = null;
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<char[]>> charsBufLocal = null;
    private static final java.lang.ThreadLocal<java.nio.charset.CharsetDecoder> decoderLocal = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.util.ThreadLocalCache.charsBufLocal = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.util.ThreadLocalCache.decoderLocal = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.util.ThreadLocalCache.bytesBufLocal = r0
            return
    }

    public ThreadLocalCache() {
            r0 = this;
            r0.<init>()
            return
    }

    private static char[] allocate(int r2) {
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r2 <= r0) goto L7
            char[] r2 = new char[r2]
            return r2
        L7:
            r0 = 10
            r1 = 17
            int r2 = getAllocateLengthExp(r0, r1, r2)
            char[] r2 = new char[r2]
            java.lang.ThreadLocal<java.lang.ref.SoftReference<char[]>> r0 = com.alibaba.fastjson.util.ThreadLocalCache.charsBufLocal
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r2)
            r0.set(r1)
            return r2
    }

    private static byte[] allocateBytes(int r2) {
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r2 <= r0) goto L7
            byte[] r2 = new byte[r2]
            return r2
        L7:
            r0 = 10
            r1 = 17
            int r2 = getAllocateLengthExp(r0, r1, r2)
            byte[] r2 = new byte[r2]
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r0 = com.alibaba.fastjson.util.ThreadLocalCache.bytesBufLocal
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r2)
            r0.set(r1)
            return r2
    }

    public static void clearBytes() {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r0 = com.alibaba.fastjson.util.ThreadLocalCache.bytesBufLocal
            r1 = 0
            r0.set(r1)
            return
    }

    public static void clearChars() {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<char[]>> r0 = com.alibaba.fastjson.util.ThreadLocalCache.charsBufLocal
            r1 = 0
            r0.set(r1)
            return
    }

    private static int getAllocateLengthExp(int r1, int r2, int r3) {
            int r2 = r3 >>> r1
            r0 = 1
            if (r2 > 0) goto L8
            int r1 = r0 << r1
            return r1
        L8:
            int r3 = r3 - r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r1 = 32 - r1
            int r1 = r0 << r1
            return r1
    }

    public static byte[] getBytes(int r2) {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r0 = com.alibaba.fastjson.util.ThreadLocalCache.bytesBufLocal
            java.lang.Object r0 = r0.get()
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
            if (r0 != 0) goto Lf
            byte[] r2 = allocateBytes(r2)
            return r2
        Lf:
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L1c
            byte[] r2 = allocateBytes(r2)
            return r2
        L1c:
            int r1 = r0.length
            if (r1 >= r2) goto L24
            byte[] r2 = allocateBytes(r2)
            return r2
        L24:
            return r0
    }

    public static char[] getChars(int r2) {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<char[]>> r0 = com.alibaba.fastjson.util.ThreadLocalCache.charsBufLocal
            java.lang.Object r0 = r0.get()
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
            if (r0 != 0) goto Lf
            char[] r2 = allocate(r2)
            return r2
        Lf:
            java.lang.Object r0 = r0.get()
            char[] r0 = (char[]) r0
            if (r0 != 0) goto L1c
            char[] r2 = allocate(r2)
            return r2
        L1c:
            int r1 = r0.length
            if (r1 >= r2) goto L24
            char[] r2 = allocate(r2)
            return r2
        L24:
            return r0
    }

    public static java.nio.charset.CharsetDecoder getUTF8Decoder() {
            java.lang.ThreadLocal<java.nio.charset.CharsetDecoder> r0 = com.alibaba.fastjson.util.ThreadLocalCache.decoderLocal
            java.lang.Object r1 = r0.get()
            java.nio.charset.CharsetDecoder r1 = (java.nio.charset.CharsetDecoder) r1
            if (r1 != 0) goto L12
            com.alibaba.fastjson.util.UTF8Decoder r1 = new com.alibaba.fastjson.util.UTF8Decoder
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }
}
