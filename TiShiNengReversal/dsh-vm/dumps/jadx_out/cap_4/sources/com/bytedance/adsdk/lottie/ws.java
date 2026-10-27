package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ws<K, V> {
    private int ae;
    private int cw;
    private final java.util.LinkedHashMap<K, V> j;

    /* renamed from: m, reason: collision with root package name */
    private int f1903m;

    /* renamed from: r, reason: collision with root package name */
    private int f1904r;
    private int tl;
    private int up;
    private int xt;

    public ws(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.cw = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r2 = 0
            r4.<init>(r2, r0, r1)
            r3.j = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    private int cw(K r4, V r5) {
            r3 = this;
            int r0 = r3.xt(r4, r5)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative size: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final V j(K r4) {
            r3 = this;
            if (r4 == 0) goto L52
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.j     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            int r4 = r3.ae     // Catch: java.lang.Throwable -> L13
            int r4 = r4 + 1
            r3.ae = r4     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r4 = move-exception
            goto L50
        L15:
            int r0 = r3.tl     // Catch: java.lang.Throwable -> L13
            int r0 = r0 + 1
            r3.tl = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r3.xt(r4)
            if (r0 != 0) goto L24
            r4 = 0
            return r4
        L24:
            monitor-enter(r3)
            int r1 = r3.up     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + 1
            r3.up = r1     // Catch: java.lang.Throwable -> L39
            java.util.LinkedHashMap<K, V> r1 = r3.j     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.put(r4, r0)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3b
            java.util.LinkedHashMap<K, V> r2 = r3.j     // Catch: java.lang.Throwable -> L39
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L39
            goto L44
        L39:
            r4 = move-exception
            goto L4e
        L3b:
            int r2 = r3.xt     // Catch: java.lang.Throwable -> L39
            int r4 = r3.cw(r4, r0)     // Catch: java.lang.Throwable -> L39
            int r2 = r2 + r4
            r3.xt = r2     // Catch: java.lang.Throwable -> L39
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L48
            return r1
        L48:
            int r4 = r3.cw
            r3.j(r4)
            return r0
        L4e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r4
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r4
        L52:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r4.<init>(r0)
            throw r4
    }

    public final V j(K r3, V r4) {
            r2 = this;
            if (r3 == 0) goto L31
            if (r4 == 0) goto L31
            monitor-enter(r2)
            int r0 = r2.f1904r     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + 1
            r2.f1904r = r0     // Catch: java.lang.Throwable -> L26
            int r0 = r2.xt     // Catch: java.lang.Throwable -> L26
            int r1 = r2.cw(r3, r4)     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + r1
            r2.xt = r0     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashMap<K, V> r0 = r2.j     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            int r0 = r2.xt     // Catch: java.lang.Throwable -> L26
            int r3 = r2.cw(r3, r4)     // Catch: java.lang.Throwable -> L26
            int r0 = r0 - r3
            r2.xt = r0     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r3 = move-exception
            goto L2f
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            int r3 = r2.cw
            r2.j(r3)
            return r4
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3
        L31:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
    }

    public void j(int r4) {
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.xt     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.j     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.xt     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.xt     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.j     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.j     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.j     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.xt     // Catch: java.lang.Throwable -> L12
            int r0 = r3.cw(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.xt = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.f1903m     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.f1903m = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    public final synchronized java.lang.String toString() {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.ae     // Catch: java.lang.Throwable -> Ld
            int r1 = r8.tl     // Catch: java.lang.Throwable -> Ld
            int r1 = r1 + r0
            r2 = 0
            if (r1 == 0) goto Lf
            int r0 = r0 * 100
            int r0 = r0 / r1
            goto L10
        Ld:
            r0 = move-exception
            goto L3e
        Lf:
            r0 = 0
        L10:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            int r4 = r8.cw     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Ld
            int r5 = r8.ae     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Ld
            int r6 = r8.tl     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Ld
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Ld
            r7[r2] = r4     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            r7[r2] = r5     // Catch: java.lang.Throwable -> Ld
            r2 = 2
            r7[r2] = r6     // Catch: java.lang.Throwable -> Ld
            r2 = 3
            r7[r2] = r0     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = java.lang.String.format(r1, r3, r7)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r8)
            return r0
        L3e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    protected int xt(K r1, V r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    protected V xt(K r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
