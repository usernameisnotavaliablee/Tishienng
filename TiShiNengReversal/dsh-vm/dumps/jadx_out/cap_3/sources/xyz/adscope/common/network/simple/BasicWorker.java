package xyz.adscope.common.network.simple;

import xyz.adscope.common.network.simple.SimpleRequest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class BasicWorker<T extends xyz.adscope.common.network.simple.SimpleRequest, Succeed, Failed> implements java.util.concurrent.Callable<xyz.adscope.common.network.simple.SimpleResponse<Succeed, Failed>> {
    private static final long f = 0;
    private final T a;
    private final xyz.adscope.common.network.simple.cache.CacheStore b;
    private final xyz.adscope.common.network.simple.Converter c;
    private final java.lang.reflect.Type d;
    private final java.lang.reflect.Type e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.simple.BasicWorker$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                xyz.adscope.common.network.simple.cache.CacheMode[] r0 = xyz.adscope.common.network.simple.cache.CacheMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a = r0
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.HTTP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.HTTP_YES_THEN_WRITE_CACHE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_YES_THEN_HTTP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L3e
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_YES_THEN_WRITE_CACHE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L49
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_NO_THEN_READ_CACHE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L54
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L60
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE_NO_THEN_NETWORK     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L6c
                xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE_NO_THEN_HTTP     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 3153600000000(0x2de41353000, double:1.558085420725E-311)
            long r0 = r0 + r2
            xyz.adscope.common.network.simple.BasicWorker.f = r0
            return
    }

    BasicWorker(T r1, java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.d = r2
            r0.e = r3
            xyz.adscope.common.network.KalleConfig r2 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.simple.cache.CacheStore r2 = r2.getCacheStore()
            r0.b = r2
            xyz.adscope.common.network.simple.Converter r2 = r1.converter()
            if (r2 != 0) goto L22
            xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.simple.Converter r1 = r1.getConverter()
            goto L26
        L22:
            xyz.adscope.common.network.simple.Converter r1 = r1.converter()
        L26:
            r0.c = r1
            return
    }

    private xyz.adscope.common.network.Response a(int r4) {
            r3 = this;
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r3.a
            xyz.adscope.common.network.simple.cache.CacheMode r0 = r0.cacheMode()
            int[] r1 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L5e
            r1 = 2
            if (r0 == r1) goto L5e
            r1 = 6
            if (r0 == r1) goto L3f
            r1 = 9
            if (r0 == r1) goto L1e
            goto L7f
        L1e:
            if (r4 != r2) goto L7f
            xyz.adscope.common.network.simple.cache.CacheStore r4 = r3.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r3.a
            java.lang.String r0 = r0.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r4 = r4.get(r0)
            if (r4 == 0) goto L7f
            int r0 = r4.getCode()
            xyz.adscope.common.network.Headers r1 = r4.getHeaders()
            byte[] r4 = r4.getBody()
            xyz.adscope.common.network.Response r4 = r3.a(r0, r1, r4)
            return r4
        L3f:
            xyz.adscope.common.network.simple.cache.CacheStore r4 = r3.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r3.a
            java.lang.String r0 = r0.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r4 = r4.get(r0)
            if (r4 == 0) goto L7f
            int r0 = r4.getCode()
            xyz.adscope.common.network.Headers r1 = r4.getHeaders()
            byte[] r4 = r4.getBody()
            xyz.adscope.common.network.Response r4 = r3.a(r0, r1, r4)
            return r4
        L5e:
            if (r4 != r2) goto L7f
            xyz.adscope.common.network.simple.cache.CacheStore r4 = r3.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r3.a
            java.lang.String r0 = r0.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r4 = r4.get(r0)
            if (r4 == 0) goto L7f
            int r0 = r4.getCode()
            xyz.adscope.common.network.Headers r1 = r4.getHeaders()
            byte[] r4 = r4.getBody()
            xyz.adscope.common.network.Response r4 = r3.a(r0, r1, r4)
            return r4
        L7f:
            r4 = 0
            return r4
    }

    private xyz.adscope.common.network.Response a(int r2, xyz.adscope.common.network.Headers r3, byte[] r4) {
            r1 = this;
            xyz.adscope.common.network.Response$Builder r0 = xyz.adscope.common.network.Response.newBuilder()
            xyz.adscope.common.network.Response$Builder r2 = r0.code(r2)
            xyz.adscope.common.network.Response$Builder r2 = r2.headers(r3)
            xyz.adscope.common.network.simple.ByteArrayBody r0 = new xyz.adscope.common.network.simple.ByteArrayBody
            java.lang.String r3 = r3.getContentType()
            r0.<init>(r3, r4)
            xyz.adscope.common.network.Response$Builder r2 = r2.body(r0)
            xyz.adscope.common.network.Response r2 = r2.build()
            return r2
    }

    private xyz.adscope.common.network.Response a(int r2, xyz.adscope.common.network.Headers r3, byte[] r4, java.lang.String r5) {
            r1 = this;
            xyz.adscope.common.network.Response$Builder r0 = xyz.adscope.common.network.Response.newBuilder()
            xyz.adscope.common.network.Response$Builder r2 = r0.code(r2)
            xyz.adscope.common.network.Response$Builder r2 = r2.headers(r3)
            xyz.adscope.common.network.simple.ByteArrayBody r0 = new xyz.adscope.common.network.simple.ByteArrayBody
            java.lang.String r3 = r3.getContentType()
            r0.<init>(r3, r4)
            xyz.adscope.common.network.Response$Builder r2 = r2.body(r0)
            xyz.adscope.common.network.Response$Builder r2 = r2.locationUrl(r5)
            xyz.adscope.common.network.Response r2 = r2.build()
            return r2
    }

    private xyz.adscope.common.network.simple.SimpleResponse<Succeed, Failed> a(xyz.adscope.common.network.Response r4, boolean r5) {
            r3 = this;
            xyz.adscope.common.network.simple.Converter r0 = r3.c     // Catch: java.lang.Exception -> Lb java.io.IOException -> Ld
            java.lang.reflect.Type r1 = r3.d     // Catch: java.lang.Exception -> Lb java.io.IOException -> Ld
            java.lang.reflect.Type r2 = r3.e     // Catch: java.lang.Exception -> Lb java.io.IOException -> Ld
            xyz.adscope.common.network.simple.SimpleResponse r4 = r0.convert(r1, r2, r4, r5)     // Catch: java.lang.Exception -> Lb java.io.IOException -> Ld
            return r4
        Lb:
            r4 = move-exception
            goto Lf
        Ld:
            r4 = move-exception
            goto L17
        Lf:
            xyz.adscope.common.network.exception.ParseError r5 = new xyz.adscope.common.network.exception.ParseError
            java.lang.String r0 = "An exception occurred while parsing the data."
            r5.<init>(r0, r4)
            throw r5
        L17:
            throw r4
    }

    private void a() {
            r2 = this;
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r2.a
            xyz.adscope.common.network.simple.cache.CacheMode r0 = r0.cacheMode()
            int[] r1 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L15
            r1 = 2
            if (r0 == r1) goto L15
            goto L2a
        L15:
            xyz.adscope.common.network.simple.cache.CacheStore r0 = r2.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r1 = r2.a
            java.lang.String r1 = r1.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r0 = r0.get(r1)
            if (r0 == 0) goto L2a
            xyz.adscope.common.network.Headers r0 = r0.getHeaders()
            r2.a(r0)
        L2a:
            return
    }

    private void a(int r3, xyz.adscope.common.network.Headers r4, byte[] r5, long r6) {
            r2 = this;
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r2.a
            java.lang.String r0 = r0.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r1 = new xyz.adscope.common.network.simple.cache.Cache
            r1.<init>()
            r1.setKey(r0)
            r1.setCode(r3)
            r1.setHeaders(r4)
            r1.setBody(r5)
            r1.setExpires(r6)
            xyz.adscope.common.network.simple.cache.CacheStore r3 = r2.b
            r3.replace(r0, r1)
            return
    }

    private void a(xyz.adscope.common.network.Headers r6) {
            r5 = this;
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r5.a
            xyz.adscope.common.network.Headers r0 = r0.headers()
            java.lang.String r1 = r6.getETag()
            if (r1 == 0) goto L11
            java.lang.String r2 = "If-None-Match"
            r0.set2(r2, r1)
        L11:
            long r1 = r6.getLastModified()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L24
            java.lang.String r6 = xyz.adscope.common.network.Headers.formatMillisToGMT(r1)
            java.lang.String r1 = "If-Modified-Since"
            r0.set2(r1, r6)
        L24:
            return
    }

    private xyz.adscope.common.network.Response b() {
            r7 = this;
            T extends xyz.adscope.common.network.simple.SimpleRequest r0 = r7.a
            xyz.adscope.common.network.simple.cache.CacheMode r0 = r0.cacheMode()
            int[] r1 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L64
            r1 = 7
            if (r0 == r1) goto L3d
            r1 = 8
            if (r0 == r1) goto L1e
            r1 = 9
            if (r0 == r1) goto L1e
            goto L90
        L1e:
            xyz.adscope.common.network.simple.cache.CacheStore r0 = r7.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r1 = r7.a
            java.lang.String r1 = r1.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r0 = r0.get(r1)
            if (r0 == 0) goto L90
            int r1 = r0.getCode()
            xyz.adscope.common.network.Headers r2 = r0.getHeaders()
            byte[] r0 = r0.getBody()
            xyz.adscope.common.network.Response r0 = r7.a(r1, r2, r0)
            return r0
        L3d:
            xyz.adscope.common.network.simple.cache.CacheStore r0 = r7.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r1 = r7.a
            java.lang.String r1 = r1.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r0 = r0.get(r1)
            if (r0 == 0) goto L5c
            int r1 = r0.getCode()
            xyz.adscope.common.network.Headers r2 = r0.getHeaders()
            byte[] r0 = r0.getBody()
            xyz.adscope.common.network.Response r0 = r7.a(r1, r2, r0)
            return r0
        L5c:
            xyz.adscope.common.network.exception.NoCacheError r0 = new xyz.adscope.common.network.exception.NoCacheError
            java.lang.String r1 = "No cache found."
            r0.<init>(r1)
            throw r0
        L64:
            xyz.adscope.common.network.simple.cache.CacheStore r0 = r7.b
            T extends xyz.adscope.common.network.simple.SimpleRequest r1 = r7.a
            java.lang.String r1 = r1.cacheKey()
            xyz.adscope.common.network.simple.cache.Cache r0 = r0.get(r1)
            if (r0 != 0) goto L73
            return r2
        L73:
            long r3 = r0.getExpires()
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L90
            int r1 = r0.getCode()
            xyz.adscope.common.network.Headers r2 = r0.getHeaders()
            byte[] r0 = r0.getBody()
            xyz.adscope.common.network.Response r0 = r7.a(r1, r2, r0)
            return r0
        L90:
            return r2
    }

    private void b(int r9, xyz.adscope.common.network.Headers r10, byte[] r11) {
            r8 = this;
            T extends xyz.adscope.common.network.simple.SimpleRequest r1 = r8.a
            xyz.adscope.common.network.simple.cache.CacheMode r1 = r1.cacheMode()
            int[] r2 = xyz.adscope.common.network.simple.BasicWorker.AnonymousClass1.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L68
            r2 = 2
            if (r1 == r2) goto L5e
            r2 = 4
            if (r1 == r2) goto L45
            r2 = 5
            if (r1 == r2) goto L3b
            r2 = 9
            if (r1 == r2) goto L22
            goto L7e
        L22:
            r1 = r3
            long r4 = xyz.adscope.common.network.Headers.analysisCacheExpires(r10)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 > 0) goto L33
            long r6 = r10.getLastModified()
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L7e
        L33:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.a(r1, r2, r3, r4)
            return
        L3b:
            long r4 = xyz.adscope.common.network.simple.BasicWorker.f
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.a(r1, r2, r3, r4)
            return
        L45:
            r1 = r3
            long r4 = xyz.adscope.common.network.Headers.analysisCacheExpires(r10)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L56
            long r6 = r10.getLastModified()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
        L56:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.a(r1, r2, r3, r4)
            return
        L5e:
            long r4 = xyz.adscope.common.network.simple.BasicWorker.f
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.a(r1, r2, r3, r4)
            return
        L68:
            r1 = r3
            long r4 = xyz.adscope.common.network.Headers.analysisCacheExpires(r10)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L79
            long r6 = r10.getLastModified()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
        L79:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            goto L7f
        L7e:
            return
        L7f:
            r0.a(r1, r2, r3, r4)
            return
    }

    protected abstract xyz.adscope.common.network.Response a(T r1);

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
            r1 = this;
            xyz.adscope.common.network.simple.SimpleResponse r0 = r1.call()
            return r0
    }

    @Override // java.util.concurrent.Callable
    public final xyz.adscope.common.network.simple.SimpleResponse<Succeed, Failed> call() {
            r8 = this;
            xyz.adscope.common.network.Response r0 = r8.b()
            r1 = 1
            if (r0 == 0) goto Lc
            xyz.adscope.common.network.simple.SimpleResponse r0 = r8.a(r0, r1)
            return r0
        Lc:
            r8.a()
            r2 = -1
            T extends xyz.adscope.common.network.simple.SimpleRequest r3 = r8.a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.Response r0 = r8.a(r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r3 = r0.code()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r4 = 304(0x130, float:4.26E-43)
            r5 = 0
            if (r3 != r4) goto L39
            xyz.adscope.common.network.Response r3 = r8.a(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r3 == 0) goto L31
            xyz.adscope.common.network.simple.SimpleResponse r1 = r8.a(r3, r1)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return r1
        L2d:
            r1 = move-exception
            goto L74
        L2f:
            r3 = move-exception
            goto L65
        L31:
            xyz.adscope.common.network.simple.SimpleResponse r1 = r8.a(r0, r5)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return r1
        L39:
            xyz.adscope.common.network.Headers r4 = r0.headers()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = 204(0xcc, float:2.86E-43)
            if (r3 == r7) goto L4f
            r7 = 302(0x12e, float:4.23E-43)
            if (r3 == r7) goto L4f
            xyz.adscope.common.network.ResponseBody r6 = r0.body()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            byte[] r6 = r6.byteArray()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
        L4f:
            java.lang.String r7 = r0.locationUrl()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r8.b(r3, r4, r6)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.Response r0 = r8.a(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.simple.SimpleResponse r1 = r8.a(r0, r5)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return r1
        L65:
            xyz.adscope.common.network.Response r2 = r8.a(r2)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L73
            xyz.adscope.common.network.simple.SimpleResponse r1 = r8.a(r2, r1)     // Catch: java.lang.Throwable -> L2d
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return r1
        L73:
            throw r3     // Catch: java.lang.Throwable -> L2d
        L74:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            throw r1
    }

    public abstract void cancel();
}
