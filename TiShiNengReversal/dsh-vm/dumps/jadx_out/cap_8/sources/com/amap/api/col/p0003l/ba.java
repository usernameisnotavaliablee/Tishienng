package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ba {
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba.a> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a<T> {
        public java.util.List<T> a;

        /* renamed from: b, reason: collision with root package name */
        public T f3023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ba f3024c;

        public a(com.amap.api.col.p0003l.ba r1) {
                r0 = this;
                r0.f3024c = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = java.util.Collections.synchronizedList(r1)
                r0.a = r1
                r1 = 0
                r0.f3023b = r1
                return
        }
    }

    public ba() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public final <T> java.util.List<T> a(int r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r1.a     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.ba$a r2 = (com.amap.api.col.3l.ba.a) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L11
            java.util.List<T> r2 = r2.a     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final <T> void b() {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r3.a
            if (r0 != 0) goto L5
            goto L2d
        L5:
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        Ld:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2d
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2d
            com.amap.api.col.3l.ba$a r1 = (com.amap.api.col.3l.ba.a) r1     // Catch: java.lang.Throwable -> L2d
            java.util.List<T> r2 = r1.a     // Catch: java.lang.Throwable -> L2d
            r2.clear()     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r1.f3023b = r2     // Catch: java.lang.Throwable -> L2d
            goto Ld
        L28:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r3.a     // Catch: java.lang.Throwable -> L2d
            r0.clear()     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    public final <T> void c(int r4, T r5) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r3.a
            if (r0 != 0) goto L5
            goto L36
        L5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L36
            com.amap.api.col.3l.ba$a r0 = (com.amap.api.col.3l.ba.a) r0     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1f
            com.amap.api.col.3l.ba$a r0 = new com.amap.api.col.3l.ba$a     // Catch: java.lang.Throwable -> L36
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r1 = r3.a     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            r1.putIfAbsent(r2, r0)     // Catch: java.lang.Throwable -> L36
        L1f:
            T r1 = r0.f3023b     // Catch: java.lang.Throwable -> L36
            if (r1 != r5) goto L24
            goto L36
        L24:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            T r2 = r0.f3023b     // Catch: java.lang.Throwable -> L36
            r3.f(r1, r2)     // Catch: java.lang.Throwable -> L36
            r0.f3023b = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            r3.e(r4, r5)     // Catch: java.lang.Throwable -> L36
        L36:
            return
    }

    public final <T> void d(java.lang.Integer r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r1.a     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r1.a     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.ba$a r2 = (com.amap.api.col.3l.ba.a) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            java.util.List<T> r2 = r2.a     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2.clear()     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public final <T> void e(java.lang.Integer r3, T r4) {
            r2 = this;
            if (r4 == 0) goto L28
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r2.a
            if (r0 != 0) goto L7
            goto L28
        L7:
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L28
            com.amap.api.col.3l.ba$a r0 = (com.amap.api.col.3l.ba.a) r0     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L19
            com.amap.api.col.3l.ba$a r0 = new com.amap.api.col.3l.ba$a     // Catch: java.lang.Throwable -> L28
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r1 = r2.a     // Catch: java.lang.Throwable -> L28
            r1.putIfAbsent(r3, r0)     // Catch: java.lang.Throwable -> L28
        L19:
            java.util.List<T> r3 = r0.a     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L28
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L28
            java.util.List<T> r3 = r0.a     // Catch: java.lang.Throwable -> L28
            r3.add(r4)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    public final <T> void f(java.lang.Integer r2, T r3) {
            r1 = this;
            if (r3 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r1.a
            if (r0 != 0) goto L7
            goto L26
        L7:
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3l.ba$a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L26
            com.amap.api.col.3l.ba$a r2 = (com.amap.api.col.3l.ba.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L26
            java.util.List<T> r0 = r2.a     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            java.util.List<T> r2 = r2.a     // Catch: java.lang.Throwable -> L26
            r2.remove(r3)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }
}
