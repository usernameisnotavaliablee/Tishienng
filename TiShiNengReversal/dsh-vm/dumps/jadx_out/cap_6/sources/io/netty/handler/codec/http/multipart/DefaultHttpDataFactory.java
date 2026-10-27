package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttpDataFactory implements io.netty.handler.codec.http.multipart.HttpDataFactory {
    public static final long MAXSIZE = -1;
    public static final long MINSIZE = 16384;
    private java.nio.charset.Charset charset;
    private final boolean checkSize;
    private long maxSize;
    private long minSize;
    private final java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> requestFileDeleteMap;
    private final boolean useDisk;

    public DefaultHttpDataFactory() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxSize = r0
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r2.charset = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.requestFileDeleteMap = r0
            r0 = 0
            r2.useDisk = r0
            r0 = 1
            r2.checkSize = r0
            r0 = 16384(0x4000, double:8.095E-320)
            r2.minSize = r0
            return
    }

    public DefaultHttpDataFactory(long r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxSize = r0
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r2.charset = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.requestFileDeleteMap = r0
            r0 = 0
            r2.useDisk = r0
            r0 = 1
            r2.checkSize = r0
            r2.minSize = r3
            return
    }

    public DefaultHttpDataFactory(long r1, java.nio.charset.Charset r3) {
            r0 = this;
            r0.<init>(r1)
            r0.charset = r3
            return
    }

    public DefaultHttpDataFactory(java.nio.charset.Charset r1) {
            r0 = this;
            r0.<init>()
            r0.charset = r1
            return
    }

    public DefaultHttpDataFactory(boolean r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxSize = r0
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r2.charset = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.requestFileDeleteMap = r0
            r2.useDisk = r3
            r3 = 0
            r2.checkSize = r3
            return
    }

    public DefaultHttpDataFactory(boolean r1, java.nio.charset.Charset r2) {
            r0 = this;
            r0.<init>(r1)
            r0.charset = r2
            return
    }

    private static void checkHttpDataSize(io.netty.handler.codec.http.multipart.HttpData r2) {
            long r0 = r2.length()     // Catch: java.io.IOException -> L8
            r2.checkSize(r0)     // Catch: java.io.IOException -> L8
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attribute bigger than maxSize allowed"
            r2.<init>(r0)
            throw r2
    }

    private java.util.List<io.netty.handler.codec.http.multipart.HttpData> getList(io.netty.handler.codec.http.HttpRequest r3) {
            r2 = this;
            java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> r0 = r2.requestFileDeleteMap
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> r1 = r2.requestFileDeleteMap
            r1.put(r3, r0)
        L14:
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public void cleanAllHttpData() {
            r3 = this;
            java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> r0 = r3.requestFileDeleteMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            io.netty.handler.codec.http.multipart.HttpData r2 = (io.netty.handler.codec.http.multipart.HttpData) r2
            r2.release()
            goto L20
        L30:
            r0.remove()
            goto La
        L34:
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public void cleanAllHttpDatas() {
            r0 = this;
            r0.cleanAllHttpData()
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public void cleanRequestHttpData(io.netty.handler.codec.http.HttpRequest r2) {
            r1 = this;
            java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> r0 = r1.requestFileDeleteMap
            java.lang.Object r2 = r0.remove(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L1e
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            io.netty.handler.codec.http.multipart.HttpData r0 = (io.netty.handler.codec.http.multipart.HttpData) r0
            r0.release()
            goto Le
        L1e:
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public void cleanRequestHttpDatas(io.netty.handler.codec.http.HttpRequest r1) {
            r0 = this;
            r0.cleanRequestHttpData(r1)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public io.netty.handler.codec.http.multipart.Attribute createAttribute(io.netty.handler.codec.http.HttpRequest r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.useDisk
            if (r0 == 0) goto L18
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            java.nio.charset.Charset r1 = r4.charset
            r0.<init>(r6, r1)
            long r1 = r4.maxSize
            r0.setMaxSize(r1)
            java.util.List r5 = r4.getList(r5)
            r5.add(r0)
            return r0
        L18:
            boolean r0 = r4.checkSize
            if (r0 == 0) goto L32
            io.netty.handler.codec.http.multipart.MixedAttribute r0 = new io.netty.handler.codec.http.multipart.MixedAttribute
            long r1 = r4.minSize
            java.nio.charset.Charset r3 = r4.charset
            r0.<init>(r6, r1, r3)
            long r1 = r4.maxSize
            r0.setMaxSize(r1)
            java.util.List r5 = r4.getList(r5)
            r5.add(r0)
            return r0
        L32:
            io.netty.handler.codec.http.multipart.MemoryAttribute r5 = new io.netty.handler.codec.http.multipart.MemoryAttribute
            r5.<init>(r6)
            long r0 = r4.maxSize
            r5.setMaxSize(r0)
            return r5
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public io.netty.handler.codec.http.multipart.Attribute createAttribute(io.netty.handler.codec.http.HttpRequest r9, java.lang.String r10, long r11) {
            r8 = this;
            boolean r0 = r8.useDisk
            if (r0 == 0) goto L18
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            java.nio.charset.Charset r1 = r8.charset
            r0.<init>(r10, r11, r1)
            long r10 = r8.maxSize
            r0.setMaxSize(r10)
            java.util.List r9 = r8.getList(r9)
            r9.add(r0)
            return r0
        L18:
            boolean r0 = r8.checkSize
            if (r0 == 0) goto L34
            io.netty.handler.codec.http.multipart.MixedAttribute r1 = new io.netty.handler.codec.http.multipart.MixedAttribute
            long r5 = r8.minSize
            java.nio.charset.Charset r7 = r8.charset
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r5, r7)
            long r10 = r8.maxSize
            r1.setMaxSize(r10)
            java.util.List r9 = r8.getList(r9)
            r9.add(r1)
            return r1
        L34:
            r2 = r10
            r3 = r11
            io.netty.handler.codec.http.multipart.MemoryAttribute r9 = new io.netty.handler.codec.http.multipart.MemoryAttribute
            r9.<init>(r2, r3)
            long r10 = r8.maxSize
            r9.setMaxSize(r10)
            return r9
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public io.netty.handler.codec.http.multipart.Attribute createAttribute(io.netty.handler.codec.http.HttpRequest r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            boolean r0 = r9.useDisk
            if (r0 == 0) goto L2d
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute     // Catch: java.io.IOException -> L11
            java.nio.charset.Charset r1 = r9.charset     // Catch: java.io.IOException -> L11
            r0.<init>(r11, r12, r1)     // Catch: java.io.IOException -> L11
            long r1 = r9.maxSize     // Catch: java.io.IOException -> L11
            r0.setMaxSize(r1)     // Catch: java.io.IOException -> L11
            goto L22
        L11:
            io.netty.handler.codec.http.multipart.MixedAttribute r3 = new io.netty.handler.codec.http.multipart.MixedAttribute
            long r6 = r9.minSize
            java.nio.charset.Charset r8 = r9.charset
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8)
            long r11 = r9.maxSize
            r3.setMaxSize(r11)
            r0 = r3
        L22:
            checkHttpDataSize(r0)
            java.util.List r10 = r9.getList(r10)
            r10.add(r0)
            return r0
        L2d:
            r2 = r11
            r3 = r12
            boolean r11 = r9.checkSize
            if (r11 == 0) goto L4c
            io.netty.handler.codec.http.multipart.MixedAttribute r1 = new io.netty.handler.codec.http.multipart.MixedAttribute
            long r4 = r9.minSize
            java.nio.charset.Charset r6 = r9.charset
            r1.<init>(r2, r3, r4, r6)
            long r11 = r9.maxSize
            r1.setMaxSize(r11)
            checkHttpDataSize(r1)
            java.util.List r10 = r9.getList(r10)
            r10.add(r1)
            return r1
        L4c:
            io.netty.handler.codec.http.multipart.MemoryAttribute r10 = new io.netty.handler.codec.http.multipart.MemoryAttribute     // Catch: java.io.IOException -> L5c
            java.nio.charset.Charset r11 = r9.charset     // Catch: java.io.IOException -> L5c
            r10.<init>(r2, r3, r11)     // Catch: java.io.IOException -> L5c
            long r11 = r9.maxSize     // Catch: java.io.IOException -> L5c
            r10.setMaxSize(r11)     // Catch: java.io.IOException -> L5c
            checkHttpDataSize(r10)     // Catch: java.io.IOException -> L5c
            return r10
        L5c:
            r0 = move-exception
            r10 = r0
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r10)
            throw r11
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public io.netty.handler.codec.http.multipart.FileUpload createFileUpload(io.netty.handler.codec.http.HttpRequest r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.nio.charset.Charset r18, long r19) {
            r12 = this;
            boolean r0 = r12.useDisk
            if (r0 == 0) goto L23
            io.netty.handler.codec.http.multipart.DiskFileUpload r1 = new io.netty.handler.codec.http.multipart.DiskFileUpload
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            long r14 = r12.maxSize
            r1.setMaxSize(r14)
            checkHttpDataSize(r1)
            java.util.List r13 = r12.getList(r13)
            r13.add(r1)
            return r1
        L23:
            boolean r0 = r12.checkSize
            if (r0 == 0) goto L48
            io.netty.handler.codec.http.multipart.MixedFileUpload r2 = new io.netty.handler.codec.http.multipart.MixedFileUpload
            long r10 = r12.minSize
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            long r14 = r12.maxSize
            r2.setMaxSize(r14)
            checkHttpDataSize(r2)
            java.util.List r13 = r12.getList(r13)
            r13.add(r2)
            return r2
        L48:
            io.netty.handler.codec.http.multipart.MemoryFileUpload r2 = new io.netty.handler.codec.http.multipart.MemoryFileUpload
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            long r13 = r12.maxSize
            r2.setMaxSize(r13)
            checkHttpDataSize(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public void removeHttpDataFromClean(io.netty.handler.codec.http.HttpRequest r4, io.netty.handler.codec.http.multipart.InterfaceHttpData r5) {
            r3 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.multipart.HttpData
            if (r0 != 0) goto L5
            goto L30
        L5:
            java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> r0 = r3.requestFileDeleteMap
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L10
            goto L30
        L10:
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            io.netty.handler.codec.http.multipart.HttpData r2 = (io.netty.handler.codec.http.multipart.HttpData) r2
            if (r2 != r5) goto L14
            r1.remove()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L30
            java.util.Map<io.netty.handler.codec.http.HttpRequest, java.util.List<io.netty.handler.codec.http.multipart.HttpData>> r5 = r3.requestFileDeleteMap
            r5.remove(r4)
        L30:
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpDataFactory
    public void setMaxLimit(long r1) {
            r0 = this;
            r0.maxSize = r1
            return
    }
}
