package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    private static com.beizi.ad.internal.h.t f6920d;
    private java.util.concurrent.ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.LruCache<java.lang.String, java.lang.String> f6921b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Handler f6922c;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void a(java.lang.String r1);
    }

    public t() {
            r2 = this;
            r2.<init>()
            r0 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.a = r0
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0.<init>(r1)
            r2.f6921b = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.f6922c = r0
            return
    }

    static /* synthetic */ android.os.Handler a(com.beizi.ad.internal.h.t r0) {
            android.os.Handler r0 = r0.f6922c
            return r0
    }

    public static com.beizi.ad.internal.h.t a() {
            com.beizi.ad.internal.h.t r0 = b()
            return r0
    }

    static /* synthetic */ androidx.collection.LruCache b(com.beizi.ad.internal.h.t r0) {
            androidx.collection.LruCache<java.lang.String, java.lang.String> r0 = r0.f6921b
            return r0
    }

    private static com.beizi.ad.internal.h.t b() {
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.f6920d
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.ad.internal.h.t> r0 = com.beizi.ad.internal.h.t.class
            monitor-enter(r0)
            com.beizi.ad.internal.h.t r1 = com.beizi.ad.internal.h.t.f6920d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.ad.internal.h.t r1 = new com.beizi.ad.internal.h.t     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.ad.internal.h.t.f6920d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.f6920d
            return r0
    }

    private boolean c() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void a(android.content.Context r7, java.lang.String r8, com.beizi.ad.internal.h.t.a r9) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return
        L7:
            androidx.collection.LruCache<java.lang.String, java.lang.String> r0 = r6.f6921b
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L19
            r9.a(r0)
            return
        L19:
            java.lang.String r0 = "/"
            int r0 = r8.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r8.substring(r0)
            java.io.File r1 = new java.io.File
            java.io.File r2 = com.beizi.ad.lance.a.h.d(r7)
            java.lang.String r0 = com.beizi.ad.internal.h.f.a(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L47
            long r2 = r1.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L47
            java.lang.String r0 = r1.getAbsolutePath()
            goto L48
        L47:
            r0 = 0
        L48:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L57
            androidx.collection.LruCache<java.lang.String, java.lang.String> r7 = r6.f6921b
            r7.put(r8, r0)
            r9.a(r0)
            return
        L57:
            java.util.concurrent.ExecutorService r0 = r6.a
            com.beizi.ad.internal.h.t$1 r1 = new com.beizi.ad.internal.h.t$1
            r1.<init>(r6, r8, r7, r9)
            r0.submit(r1)
            return
    }

    public void a(android.content.Context r8, java.lang.String r9, boolean r10, com.beizi.ad.internal.h.t.a r11) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L8
            goto L85
        L8:
            androidx.collection.LruCache<java.lang.String, java.lang.String> r0 = r7.f6921b
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L33
            if (r10 == 0) goto L2f
            boolean r8 = r7.c()
            if (r8 == 0) goto L22
            r11.a(r0)
            return
        L22:
            android.os.Handler r8 = r7.f6922c
            if (r8 == 0) goto L85
            com.beizi.ad.internal.h.t$2 r9 = new com.beizi.ad.internal.h.t$2
            r9.<init>(r7, r11, r0)
            r8.post(r9)
            return
        L2f:
            r11.a(r0)
            return
        L33:
            java.lang.String r0 = "/"
            int r0 = r9.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r9.substring(r0)
            java.io.File r1 = new java.io.File
            java.io.File r2 = com.beizi.ad.lance.a.h.d(r8)
            java.lang.String r0 = com.beizi.ad.internal.h.f.a(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L61
            long r2 = r1.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            java.lang.String r0 = r1.getAbsolutePath()
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8a
            androidx.collection.LruCache<java.lang.String, java.lang.String> r8 = r7.f6921b
            r8.put(r9, r0)
            if (r10 == 0) goto L86
            boolean r8 = r7.c()
            if (r8 == 0) goto L79
            r11.a(r0)
            return
        L79:
            android.os.Handler r8 = r7.f6922c
            if (r8 == 0) goto L85
            com.beizi.ad.internal.h.t$3 r9 = new com.beizi.ad.internal.h.t$3
            r9.<init>(r7, r11, r0)
            r8.post(r9)
        L85:
            return
        L86:
            r11.a(r0)
            return
        L8a:
            java.util.concurrent.ExecutorService r0 = r7.a
            com.beizi.ad.internal.h.t$4 r1 = new com.beizi.ad.internal.h.t$4
            r2 = r7
            r4 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.submit(r1)
            return
    }
}
