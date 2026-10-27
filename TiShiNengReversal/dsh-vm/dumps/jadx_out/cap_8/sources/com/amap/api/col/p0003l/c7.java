package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c7 {

    /* renamed from: d, reason: collision with root package name */
    private static com.amap.api.col.p0003l.c7 f3096d = null;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f3097e = true;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f3098b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.List<java.lang.String> f3099c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f3100b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f3101c;

        public a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r1.f3100b = r2
                r1.f3101c = r3
                return
        }

        public a(java.net.URL r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getProtocol()
                r1.a = r0
                java.lang.String r0 = r2.getHost()
                r1.f3100b = r0
                java.lang.String r2 = r2.getPath()
                r1.f3101c = r2
                return
        }
    }

    static {
            return
    }

    public c7() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3098b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3099c = r0
            return
    }

    private static com.amap.api.col.3l.c7.a a(com.amap.api.col.3l.c7.a r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = r4.f3101c
            if (r0 != 0) goto L9
            goto L40
        L9:
            int r0 = r0.length()
            if (r0 != 0) goto L10
            goto L40
        L10:
            java.lang.String r0 = r4.f3101c
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 0
            r3 = 47
            if (r0 != r3) goto L2f
            java.lang.String r0 = r4.f3101c
            int r3 = r0.length()
            int r3 = r3 - r2
            java.lang.String r0 = r0.substring(r1, r3)
            r4.f3101c = r0
            goto L10
        L2f:
            java.lang.String r0 = r4.f3101c
            char r0 = r0.charAt(r1)
            if (r0 != r3) goto L40
            java.lang.String r0 = r4.f3101c
            java.lang.String r0 = r0.substring(r2)
            r4.f3101c = r0
            goto L2f
        L40:
            return r4
    }

    public static synchronized com.amap.api.col.p0003l.c7 b() {
            java.lang.Class<com.amap.api.col.3l.c7> r0 = com.amap.api.col.p0003l.c7.class
            monitor-enter(r0)
            com.amap.api.col.3l.c7 r1 = com.amap.api.col.p0003l.c7.f3096d     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.amap.api.col.3l.c7 r1 = new com.amap.api.col.3l.c7     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.p0003l.c7.f3096d = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.amap.api.col.3l.c7 r1 = com.amap.api.col.p0003l.c7.f3096d     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    private static boolean d(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "/"
            java.lang.String[] r4 = r4.split(r0)
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            int r1 = r4.length
            r2 = 0
            if (r0 >= r1) goto L10
            return r2
        L10:
            r0 = 0
        L11:
            int r1 = r4.length
            if (r0 >= r1) goto L2c
            r1 = r4[r0]
            java.lang.String r3 = "*"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            r1 = r4[r0]
            r3 = r5[r0]
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            int r0 = r0 + 1
            goto L11
        L2c:
            r4 = 1
            return r4
    }

    private static com.amap.api.col.3l.c7.a e(java.lang.String r6) {
            com.amap.api.col.3l.c7$a r0 = new com.amap.api.col.3l.c7$a     // Catch: java.net.MalformedURLException -> Lb
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lb
            r1.<init>(r6)     // Catch: java.net.MalformedURLException -> Lb
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> Lb
            return r0
        Lb:
            java.lang.String r0 = "://"
            boolean r0 = r6.contains(r0)
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            java.lang.String r0 = "/"
            boolean r2 = r6.startsWith(r0)
            r3 = 1
            if (r2 == 0) goto L24
            java.lang.String r6 = r6.substring(r3)
            goto L16
        L24:
            java.lang.String[] r6 = r6.split(r0)
            r2 = 0
            r4 = r6[r2]
            java.lang.String r5 = "."
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L36
            r1 = r6[r2]
            r2 = 1
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L3b:
            int r5 = r6.length
            if (r2 >= r5) goto L4f
            int r5 = r4.length()
            if (r5 <= 0) goto L47
            r4.append(r0)
        L47:
            r5 = r6[r2]
            r4.append(r5)
            int r2 = r2 + 1
            goto L3b
        L4f:
            int r6 = r4.length()
            if (r6 <= 0) goto L6a
            int r6 = r4.length()
            int r6 = r6 - r3
            char r6 = r4.charAt(r6)
            r0 = 47
            if (r6 != r0) goto L6a
            int r6 = r4.length()
            int r6 = r6 - r3
            r4.deleteCharAt(r6)
        L6a:
            java.lang.String r6 = r4.toString()
            com.amap.api.col.3l.c7$a r0 = new com.amap.api.col.3l.c7$a
            r0.<init>(r1, r6)
            return r0
    }

    private synchronized boolean f(com.amap.api.col.3l.c7.a r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L74
            java.lang.String r1 = r6.f3101c     // Catch: java.lang.Throwable -> L26
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto Ld
            goto L74
        Ld:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r5.f3098b     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r6.a     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r3 = r5.a     // Catch: java.lang.Throwable -> L26
            boolean r2 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r1 = r5.a     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r6.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L26
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r6 = move-exception
            goto L72
        L28:
            java.util.List<java.lang.String> r2 = r5.f3099c     // Catch: java.lang.Throwable -> L26
            boolean r3 = com.amap.api.col.p0003l.c7.f3097e     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L37
            if (r1 == 0) goto L31
            goto L37
        L31:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L26
            r6.<init>()     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L37:
            java.lang.String r4 = r6.f3100b     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L4a
            boolean r4 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L4a
            java.lang.String r2 = r6.f3100b     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L26
            r2 = r1
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L26
        L4a:
            if (r3 != 0) goto L55
            if (r2 == 0) goto L4f
            goto L55
        L4f:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L26
            r6.<init>()     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L55:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L26
        L59:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r6.f3101c     // Catch: java.lang.Throwable -> L26
            boolean r2 = d(r2, r3)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L59
            monitor-exit(r5)
            r6 = 1
            return r6
        L70:
            monitor-exit(r5)
            return r0
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        L74:
            monitor-exit(r5)
            return r0
    }

    public final boolean c(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1a
            int r1 = r3.length()
            if (r1 != 0) goto La
            goto L1a
        La:
            com.amap.api.col.3l.c7$a r3 = e(r3)
            com.amap.api.col.3l.c7$a r3 = a(r3)
            if (r3 != 0) goto L15
            return r0
        L15:
            boolean r3 = r2.f(r3)
            return r3
        L1a:
            return r0
    }
}
