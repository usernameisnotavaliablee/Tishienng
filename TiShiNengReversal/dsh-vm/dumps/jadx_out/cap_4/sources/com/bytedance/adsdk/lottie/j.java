package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static java.lang.Object[] ae;
    private static final int[] cw = null;

    /* renamed from: m, reason: collision with root package name */
    private static int f1766m;

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.Object[] f1767r = null;
    private static int tl;
    private static java.lang.Object[] up;
    private int[] g;
    java.lang.Object[] j;
    private com.bytedance.adsdk.lottie.az<E, E> oq;
    int xt;


    static {
            r0 = 0
            int[] r1 = new int[r0]
            com.bytedance.adsdk.lottie.j.cw = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.bytedance.adsdk.lottie.j.f1767r = r0
            return
    }

    public j() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public j(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = com.bytedance.adsdk.lottie.j.cw
            r0.g = r1
            java.lang.Object[] r1 = com.bytedance.adsdk.lottie.j.f1767r
            r0.j = r1
            goto L11
        Le:
            r0.r(r1)
        L11:
            r1 = 0
            r0.xt = r1
            return
    }

    private int j() {
            r4 = this;
            int r0 = r4.xt
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r4.g
            r2 = 0
            int r1 = com.bytedance.adsdk.lottie.xt.j(r1, r0, r2)
            if (r1 >= 0) goto L10
            goto L16
        L10:
            java.lang.Object[] r2 = r4.j
            r2 = r2[r1]
            if (r2 != 0) goto L17
        L16:
            return r1
        L17:
            int r2 = r1 + 1
        L19:
            if (r2 >= r0) goto L2b
            int[] r3 = r4.g
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            java.lang.Object[] r3 = r4.j
            r3 = r3[r2]
            if (r3 != 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            int r1 = r1 + (-1)
        L2d:
            if (r1 < 0) goto L3f
            int[] r0 = r4.g
            r0 = r0[r1]
            if (r0 != 0) goto L3f
            java.lang.Object[] r0 = r4.j
            r0 = r0[r1]
            if (r0 != 0) goto L3c
            return r1
        L3c:
            int r1 = r1 + (-1)
            goto L2d
        L3f:
            int r0 = ~r2
            return r0
    }

    private int j(java.lang.Object r5, int r6) {
            r4 = this;
            int r0 = r4.xt
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r4.g
            int r1 = com.bytedance.adsdk.lottie.xt.j(r1, r0, r6)
            if (r1 >= 0) goto Lf
            goto L19
        Lf:
            java.lang.Object[] r2 = r4.j
            r2 = r2[r1]
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.g
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.j
            r3 = r3[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.g
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.j
            r0 = r0[r1]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r5 = ~r2
            return r5
    }

    private static void j(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2d
            java.lang.Class<com.bytedance.adsdk.lottie.j> r0 = com.bytedance.adsdk.lottie.j.class
            monitor-enter(r0)
            int r1 = com.bytedance.adsdk.lottie.j.tl     // Catch: java.lang.Throwable -> L20
            if (r1 >= r5) goto L29
            java.lang.Object[] r1 = com.bytedance.adsdk.lottie.j.ae     // Catch: java.lang.Throwable -> L20
            r8[r4] = r1     // Catch: java.lang.Throwable -> L20
            r8[r6] = r7     // Catch: java.lang.Throwable -> L20
            int r9 = r9 - r6
        L19:
            if (r9 < r3) goto L22
            r8[r9] = r2     // Catch: java.lang.Throwable -> L20
            int r9 = r9 + (-1)
            goto L19
        L20:
            r7 = move-exception
            goto L2b
        L22:
            com.bytedance.adsdk.lottie.j.ae = r8     // Catch: java.lang.Throwable -> L20
            int r7 = com.bytedance.adsdk.lottie.j.tl     // Catch: java.lang.Throwable -> L20
            int r7 = r7 + r6
            com.bytedance.adsdk.lottie.j.tl = r7     // Catch: java.lang.Throwable -> L20
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r7
        L2d:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L53
            java.lang.Class<com.bytedance.adsdk.lottie.j> r0 = com.bytedance.adsdk.lottie.j.class
            monitor-enter(r0)
            int r1 = com.bytedance.adsdk.lottie.j.f1766m     // Catch: java.lang.Throwable -> L46
            if (r1 >= r5) goto L4f
            java.lang.Object[] r1 = com.bytedance.adsdk.lottie.j.up     // Catch: java.lang.Throwable -> L46
            r8[r4] = r1     // Catch: java.lang.Throwable -> L46
            r8[r6] = r7     // Catch: java.lang.Throwable -> L46
            int r9 = r9 - r6
        L3f:
            if (r9 < r3) goto L48
            r8[r9] = r2     // Catch: java.lang.Throwable -> L46
            int r9 = r9 + (-1)
            goto L3f
        L46:
            r7 = move-exception
            goto L51
        L48:
            com.bytedance.adsdk.lottie.j.up = r8     // Catch: java.lang.Throwable -> L46
            int r7 = com.bytedance.adsdk.lottie.j.f1766m     // Catch: java.lang.Throwable -> L46
            int r7 = r7 + r6
            com.bytedance.adsdk.lottie.j.f1766m = r7     // Catch: java.lang.Throwable -> L46
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r7
        L53:
            return
    }

    private void r(int r6) {
            r5 = this;
            r0 = 8
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 != r0) goto L2d
            java.lang.Class<com.bytedance.adsdk.lottie.j> r0 = com.bytedance.adsdk.lottie.j.class
            monitor-enter(r0)
            java.lang.Object[] r4 = com.bytedance.adsdk.lottie.j.ae     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            r5.j = r4     // Catch: java.lang.Throwable -> L27
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L27
            com.bytedance.adsdk.lottie.j.ae = r6     // Catch: java.lang.Throwable -> L27
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L27
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L27
            r5.g = r6     // Catch: java.lang.Throwable -> L27
            r4[r3] = r1     // Catch: java.lang.Throwable -> L27
            r4[r2] = r1     // Catch: java.lang.Throwable -> L27
            int r6 = com.bytedance.adsdk.lottie.j.tl     // Catch: java.lang.Throwable -> L27
            int r6 = r6 - r3
            com.bytedance.adsdk.lottie.j.tl = r6     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r6 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L56
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r6
        L2d:
            r0 = 4
            if (r6 != r0) goto L56
            java.lang.Class<com.bytedance.adsdk.lottie.j> r0 = com.bytedance.adsdk.lottie.j.class
            monitor-enter(r0)
            java.lang.Object[] r4 = com.bytedance.adsdk.lottie.j.up     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            r5.j = r4     // Catch: java.lang.Throwable -> L50
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L50
            com.bytedance.adsdk.lottie.j.up = r6     // Catch: java.lang.Throwable -> L50
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L50
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L50
            r5.g = r6     // Catch: java.lang.Throwable -> L50
            r4[r3] = r1     // Catch: java.lang.Throwable -> L50
            r4[r2] = r1     // Catch: java.lang.Throwable -> L50
            int r6 = com.bytedance.adsdk.lottie.j.f1766m     // Catch: java.lang.Throwable -> L50
            int r6 = r6 - r3
            com.bytedance.adsdk.lottie.j.f1766m = r6     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r6 = move-exception
            goto L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6
        L56:
            int[] r0 = new int[r6]
            r5.g = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.j = r6
            return
    }

    private com.bytedance.adsdk.lottie.az<E, E> xt() {
            r1 = this;
            com.bytedance.adsdk.lottie.az<E, E> r0 = r1.oq
            if (r0 != 0) goto Lb
            com.bytedance.adsdk.lottie.j$1 r0 = new com.bytedance.adsdk.lottie.j$1
            r0.<init>(r1)
            r1.oq = r0
        Lb:
            com.bytedance.adsdk.lottie.az<E, E> r0 = r1.oq
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L9
            int r1 = r8.j()
            r2 = 0
            goto L14
        L9:
            int r1 = r9.hashCode()
            int r2 = r8.j(r9, r1)
            r7 = r2
            r2 = r1
            r1 = r7
        L14:
            if (r1 < 0) goto L17
            return r0
        L17:
            int r1 = ~r1
            int r3 = r8.xt
            int[] r4 = r8.g
            int r5 = r4.length
            if (r3 < r5) goto L45
            r5 = 8
            if (r3 < r5) goto L27
            int r5 = r3 >> 1
            int r5 = r5 + r3
            goto L2c
        L27:
            r6 = 4
            if (r3 < r6) goto L2b
            goto L2c
        L2b:
            r5 = 4
        L2c:
            java.lang.Object[] r3 = r8.j
            r8.r(r5)
            int[] r5 = r8.g
            int r6 = r5.length
            if (r6 <= 0) goto L40
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r5, r0, r6)
            java.lang.Object[] r5 = r8.j
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r0, r5, r0, r6)
        L40:
            int r0 = r8.xt
            j(r4, r3, r0)
        L45:
            int r0 = r8.xt
            if (r1 >= r0) goto L59
            int[] r3 = r8.g
            int r4 = r1 + 1
            int r0 = r0 - r1
            java.lang.System.arraycopy(r3, r1, r3, r4, r0)
            java.lang.Object[] r0 = r8.j
            int r3 = r8.xt
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r3)
        L59:
            int[] r0 = r8.g
            r0[r1] = r2
            java.lang.Object[] r0 = r8.j
            r0[r1] = r9
            int r9 = r8.xt
            r0 = 1
            int r9 = r9 + r0
            r8.xt = r9
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            int r0 = r2.xt
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.j(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto Lf
        L1f:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            int r0 = r3.xt
            if (r0 == 0) goto L16
            int[] r1 = r3.g
            java.lang.Object[] r2 = r3.j
            j(r1, r2, r0)
            int[] r0 = com.bytedance.adsdk.lottie.j.cw
            r3.g = r0
            java.lang.Object[] r0 = com.bytedance.adsdk.lottie.j.f1767r
            r3.j = r0
            r0 = 0
            r3.xt = r0
        L16:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.j(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public E cw(int r9) {
            r8 = this;
            java.lang.Object[] r0 = r8.j
            r1 = r0[r9]
            int r2 = r8.xt
            r3 = 0
            r4 = 1
            if (r2 > r4) goto L1a
            int[] r9 = r8.g
            j(r9, r0, r2)
            int[] r9 = com.bytedance.adsdk.lottie.j.cw
            r8.g = r9
            java.lang.Object[] r9 = com.bytedance.adsdk.lottie.j.f1767r
            r8.j = r9
            r8.xt = r3
            return r1
        L1a:
            int[] r5 = r8.g
            int r6 = r5.length
            r7 = 8
            if (r6 <= r7) goto L55
            int r6 = r5.length
            int r6 = r6 / 3
            if (r2 >= r6) goto L55
            if (r2 <= r7) goto L2c
            int r6 = r2 >> 1
            int r7 = r2 + r6
        L2c:
            r8.r(r7)
            int r2 = r8.xt
            int r2 = r2 - r4
            r8.xt = r2
            if (r9 <= 0) goto L40
            int[] r2 = r8.g
            java.lang.System.arraycopy(r5, r3, r2, r3, r9)
            java.lang.Object[] r2 = r8.j
            java.lang.System.arraycopy(r0, r3, r2, r3, r9)
        L40:
            int r2 = r8.xt
            if (r9 >= r2) goto L54
            int r3 = r9 + 1
            int[] r4 = r8.g
            int r2 = r2 - r9
            java.lang.System.arraycopy(r5, r3, r4, r9, r2)
            java.lang.Object[] r2 = r8.j
            int r4 = r8.xt
            int r4 = r4 - r9
            java.lang.System.arraycopy(r0, r3, r2, r9, r4)
        L54:
            return r1
        L55:
            int r2 = r2 - r4
            r8.xt = r2
            if (r9 >= r2) goto L68
            int r0 = r9 + 1
            int r2 = r2 - r9
            java.lang.System.arraycopy(r5, r0, r5, r9, r2)
            java.lang.Object[] r2 = r8.j
            int r3 = r8.xt
            int r3 = r3 - r9
            java.lang.System.arraycopy(r2, r0, r2, r9, r3)
        L68:
            java.lang.Object[] r9 = r8.j
            int r0 = r8.xt
            r2 = 0
            r9[r0] = r2
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L2a
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L16
            return r2
        L16:
            r1 = 0
        L17:
            int r3 = r4.xt     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r3) goto L29
            java.lang.Object r3 = r4.xt(r1)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L17
        L29:
            return r0
        L2a:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r5 = this;
            int[] r0 = r5.g
            int r1 = r5.xt
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r1) goto Le
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        Le:
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.xt
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            com.bytedance.adsdk.lottie.az r0 = r1.xt()
            java.util.Set r0 = r0.r()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public int j(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.j()
            return r2
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.j(r2, r0)
            return r2
    }

    public void j(int r5) {
            r4 = this;
            int[] r0 = r4.g
            int r1 = r0.length
            if (r1 >= r5) goto L20
            java.lang.Object[] r1 = r4.j
            r4.r(r5)
            int r5 = r4.xt
            if (r5 <= 0) goto L1b
            int[] r2 = r4.g
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r5)
            java.lang.Object[] r5 = r4.j
            int r2 = r4.xt
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
        L1b:
            int r5 = r4.xt
            j(r0, r1, r5)
        L20:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.j(r1)
            if (r1 < 0) goto Lb
            r0.cw(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L5
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.xt
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L5:
            if (r0 < 0) goto L18
            java.lang.Object[] r3 = r4.j
            r3 = r3[r0]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L15
            r4.cw(r0)
            r2 = 1
        L15:
            int r0 = r0 + (-1)
            goto L5
        L18:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.xt
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.j
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.xt
            if (r0 >= r1) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r3.xt
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            java.lang.Object[] r0 = r3.j
            int r1 = r3.xt
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.xt
            if (r0 <= r1) goto L25
            r0 = 0
            r4[r1] = r0
        L25:
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.xt
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.xt
            if (r1 >= r2) goto L35
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r3.xt(r1)
            if (r2 == r3) goto L2d
            r0.append(r2)
            goto L32
        L2d:
            java.lang.String r2 = "(this Set)"
            r0.append(r2)
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public E xt(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.j
            r2 = r0[r2]
            return r2
    }
}
