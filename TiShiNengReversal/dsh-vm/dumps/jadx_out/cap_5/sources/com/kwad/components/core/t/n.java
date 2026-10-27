package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n {
    public static final java.lang.String TAG = "n";
    private static final java.lang.String Ze = "com.kwad.components.core.t.n";
    private static volatile com.kwad.components.core.t.n Zf;
    private boolean Zg;
    private com.kwad.sdk.core.config.item.q.a Zh;

    static {
            return
    }

    private n() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Zg = r0
            return
    }

    private static void O(long r4) {
            java.lang.String r0 = com.kwad.components.core.t.n.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkBySuper end:"
            r1.<init>(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r4
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            com.kwad.sdk.core.d.c.d(r0, r4)
            return
    }

    private static boolean a(java.util.List<java.lang.String> r6, java.lang.Class r7) {
            r0 = 0
            r1 = 0
        L2:
            if (r7 == 0) goto L34
            java.lang.String r2 = r7.getName()
            java.lang.String r3 = "java.lang.Object"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L34
            java.util.Iterator r2 = r6.iterator()
        L14:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = r7.getName()
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L14
            return r4
        L2c:
            java.lang.Class r7 = r7.getSuperclass()
            int r1 = r1 + r4
            r2 = 4
            if (r1 < r2) goto L2
        L34:
            return r0
    }

    private boolean a(java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L44
            int r1 = r7.size()
            if (r1 > 0) goto La
            goto L44
        La:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            int r2 = r1.length
        L13:
            if (r0 >= r2) goto L38
            r3 = r1[r0]
            java.lang.String r3 = r3.getClassName()
            if (r3 == 0) goto L35
            java.util.Iterator r4 = r7.iterator()
        L21:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L35
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L21
            r7 = 1
            return r7
        L35:
            int r0 = r0 + 1
            goto L13
        L38:
            com.kwad.sdk.n.b r7 = com.kwad.sdk.n.b.OQ()
            r7.c(r1)
            boolean r7 = r6.a(r8, r1)
            return r7
        L44:
            return r0
    }

    private boolean a(java.util.List<java.lang.String> r10, java.lang.StackTraceElement[] r11) {
            r9 = this;
            java.lang.String r0 = "$"
            r1 = 0
            if (r10 == 0) goto L74
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto Lc
            goto L74
        Lc:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r4 = com.kwad.components.core.t.n.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "checkBySuper begin:"
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.kwad.sdk.core.d.c.d(r4, r5)
            int r4 = r11.length
            r5 = 0
        L25:
            if (r5 >= r4) goto L71
            r6 = r11[r5]
            java.lang.String r6 = r6.getClassName()
            if (r6 == 0) goto L6e
            boolean r7 = aI(r6)
            if (r7 == 0) goto L6e
            boolean r7 = aJ(r6)
            if (r7 == 0) goto L6e
            r7 = 1
            java.lang.Class r8 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.Throwable -> L4e
            boolean r8 = a(r10, r8)     // Catch: java.lang.Throwable -> L4e
            if (r8 == 0) goto L4e
            O(r2)     // Catch: java.lang.Throwable -> L4e
            return r7
        L4e:
            boolean r8 = r6.contains(r0)     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L6e
            int r8 = r6.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.substring(r1, r8)     // Catch: java.lang.Throwable -> L6e
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L6e
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.Throwable -> L6e
            boolean r6 = a(r10, r6)     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L6e
            O(r2)     // Catch: java.lang.Throwable -> L6e
            return r7
        L6e:
            int r5 = r5 + 1
            goto L25
        L71:
            O(r2)
        L74:
            return r1
    }

    private static boolean aI(java.lang.String r1) {
            java.lang.String r0 = "android"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = "java"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = "dalvik"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = "com.android"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = com.kwad.components.core.t.n.Ze
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = "androidx"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L32
            r1 = 1
            return r1
        L32:
            r1 = 0
            return r1
    }

    private static boolean aJ(java.lang.String r1) {
            java.lang.String r0 = "com.kwad"
            boolean r1 = r1.startsWith(r0)
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static boolean aK(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    public static com.kwad.components.core.t.n tn() {
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.Zf
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.t.n> r0 = com.kwad.components.core.t.n.class
            monitor-enter(r0)
            com.kwad.components.core.t.n r1 = com.kwad.components.core.t.n.Zf     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.t.n r1 = new com.kwad.components.core.t.n     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.t.n.Zf = r1     // Catch: java.lang.Throwable -> L13
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
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.Zf
            return r0
    }

    private void tp() {
            r4 = this;
            com.kwad.sdk.core.config.item.q$a r0 = r4.Zh
            if (r0 != 0) goto L5
            goto L32
        L5:
            boolean r1 = r4.Zg
            if (r1 != 0) goto L2e
            java.util.List<java.lang.String> r0 = r0.aCv
            int r0 = r0.size()
            if (r0 <= 0) goto L2e
            com.kwad.sdk.core.config.item.q$a r0 = r4.Zh
            java.util.List<java.lang.String> r0 = r0.aCv
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = aK(r1)
            r4.Zg = r1
            if (r1 != 0) goto L2e
            goto L19
        L2e:
            boolean r0 = r4.Zg
            if (r0 != 0) goto L33
        L32:
            return
        L33:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.sdk.core.config.item.q$a r1 = r4.Zh
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r1.aCs
            int r1 = r1.size()
            if (r1 <= 0) goto L6e
            com.kwad.sdk.core.config.item.q$a r1 = r4.Zh
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r1.aCs
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = aK(r3)
            if (r3 == 0) goto L4e
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L4e
        L6e:
            com.kwad.sdk.core.config.item.q$a r1 = r4.Zh
            java.util.List<java.lang.String> r2 = r1.aCt
            java.util.List<java.lang.String> r1 = r1.aCu
            boolean r1 = r4.a(r2, r1)
            com.kwad.components.core.p.a r2 = com.kwad.components.core.p.a.se()
            r2.a(r1, r0)
            return
    }

    public final boolean b(com.kwad.sdk.internal.api.SceneImpl r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.Zg
            if (r0 == 0) goto Lf
            com.kwad.sdk.core.config.item.q$a r0 = r2.Zh
            java.util.List<java.lang.String> r1 = r0.aCt
            java.util.List<java.lang.String> r0 = r0.aCu
            boolean r0 = r2.a(r1, r0)
            goto L10
        Lf:
            r0 = 0
        L10:
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            r1.a(r3, r0, r4)
            return r0
    }

    public final void init() {
            r1 = this;
            com.kwad.sdk.core.config.item.q r0 = com.kwad.sdk.core.config.c.azv
            java.lang.Object r0 = com.kwad.sdk.core.config.e.b(r0)
            com.kwad.sdk.core.config.item.q$a r0 = (com.kwad.sdk.core.config.item.q.a) r0
            r1.Zh = r0
            if (r0 == 0) goto Lf
            r1.tp()
        Lf:
            return
    }

    public final int to() {
            r1 = this;
            com.kwad.sdk.core.config.item.q$a r0 = r1.Zh
            if (r0 == 0) goto L7
            int r0 = r0.aCw
            return r0
        L7:
            r0 = 0
            return r0
    }
}
