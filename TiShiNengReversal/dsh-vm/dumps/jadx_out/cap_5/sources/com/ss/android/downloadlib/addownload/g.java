package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> b;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public static class b {
        private static com.ss.android.downloadlib.addownload.g a;

        static {
                com.ss.android.downloadlib.addownload.g r0 = new com.ss.android.downloadlib.addownload.g
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.g.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.g a() {
                com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.b.a
                return r0
        }
    }

    private g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.b = r0
            return
    }

    /* synthetic */ g(com.ss.android.downloadlib.addownload.g.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(java.lang.String r5) {
            r4 = this;
            r0 = 0
            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r1.getLastPathSegment()     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = "https"
            boolean r2 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L25
            java.lang.String r2 = ".apk"
            boolean r2 = r1.endsWith(r2)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r4.a     // Catch: java.lang.Exception -> L23
            r2.put(r5, r1)     // Catch: java.lang.Exception -> L23
            return r1
        L23:
            r5 = move-exception
            goto L26
        L25:
            return r0
        L26:
            com.bytedance.sdk.component.utils.vl.j(r5)
            return r0
    }

    public static com.ss.android.downloadlib.addownload.g b() {
            com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.b.a()
            return r0
    }

    public java.lang.String c(com.ss.android.j.j.cw.b r3) {
            r2 = this;
            java.lang.String r0 = r3.j()
            java.lang.String r0 = r2.a(r0)
            if (r0 == 0) goto L32
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L11
            goto L32
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r3.s()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.up(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r2.b
            java.lang.String r3 = r3.j()
            r1.put(r3, r0)
            return r0
        L32:
            r3 = 0
            return r3
    }

    public java.lang.String d(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r4.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r4.b
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.lang.String r0 = r4.a(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r4.a
            boolean r1 = r1.containsValue(r0)
            if (r1 == 0) goto L67
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r4.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 == 0) goto L30
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r4.b
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r4.b
            r2.put(r5, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r4.a
            boolean r2 = r2.containsKey(r5)
            if (r2 != 0) goto L66
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r4.a
            r2.put(r5, r0)
        L66:
            return r1
        L67:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r4.b
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    public void e(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r1.b
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L1a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r1.b
            r0.put(r3, r2)
        L1a:
            return
    }

    public void f(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r3.b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto La
            r0.remove()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r3.a
            java.lang.Object r1 = r1.getKey()
            r2.remove(r1)
            goto La
        L2f:
            return
    }
}
