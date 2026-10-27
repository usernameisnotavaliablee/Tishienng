package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private static volatile com.bykv.vk.openvk.component.video.j.xt.r up;
    private volatile com.bykv.vk.openvk.component.video.j.xt.j.cw ae;
    private final com.bykv.vk.openvk.component.video.j.xt.r.xt<java.lang.Runnable> cw;
    private final java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r.j> g;
    private volatile int j;
    private volatile java.lang.String jy;

    /* renamed from: m, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.j.xt.xt.cw f1721m;
    private final com.bykv.vk.openvk.component.video.j.xt.xt.InterfaceC0181xt oq;
    private volatile com.bykv.vk.openvk.component.video.j.xt.cw qv;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f1722r;
    private volatile com.bykv.vk.openvk.component.video.j.xt.j.xt tl;
    private volatile com.bykv.vk.openvk.component.video.j.xt.cw vl;
    private volatile boolean ws;
    private final android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> xt;






    private static final class j {
        final int cw;
        final boolean j;

        /* renamed from: m, reason: collision with root package name */
        final java.lang.String[] f1724m;

        /* renamed from: r, reason: collision with root package name */
        final java.lang.String f1725r;
        final java.util.Map<java.lang.String, java.lang.String> up;
        final boolean xt;

        j(boolean r1, boolean r2, int r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String[] r6) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                r0.f1725r = r4
                r0.up = r5
                r0.f1724m = r6
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L30
                java.lang.Class<com.bykv.vk.openvk.component.video.j.xt.r$j> r1 = com.bykv.vk.openvk.component.video.j.xt.r.j.class
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L10
                goto L30
            L10:
                com.bykv.vk.openvk.component.video.j.xt.r$j r4 = (com.bykv.vk.openvk.component.video.j.xt.r.j) r4
                boolean r1 = r3.j
                boolean r2 = r4.j
                if (r1 == r2) goto L19
                return r0
            L19:
                boolean r1 = r3.xt
                boolean r2 = r4.xt
                if (r1 == r2) goto L20
                return r0
            L20:
                int r1 = r3.cw
                int r2 = r4.cw
                if (r1 == r2) goto L27
                return r0
            L27:
                java.lang.String r0 = r3.f1725r
                java.lang.String r4 = r4.f1725r
                boolean r4 = r0.equals(r4)
                return r4
            L30:
                return r0
        }

        public int hashCode() {
                r2 = this;
                boolean r0 = r2.j
                int r0 = r0 * 31
                boolean r1 = r2.xt
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.cw
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.f1725r
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    private static final class xt<T> extends java.util.concurrent.LinkedBlockingDeque<T> {
        private java.util.concurrent.ThreadPoolExecutor j;

        private xt() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ xt(com.bykv.vk.openvk.component.video.j.xt.r.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void j(java.util.concurrent.ThreadPoolExecutor r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.concurrent.ThreadPoolExecutor r0 = r1.j     // Catch: java.lang.Throwable -> Lb
                if (r0 != 0) goto L15
                if (r2 == 0) goto Ld
                r1.j = r2     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                return
            Lb:
                r2 = move-exception
                goto L1d
            Ld:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lb
                java.lang.String r0 = "executor argument can't be null!"
                r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb
                throw r2     // Catch: java.lang.Throwable -> Lb
            L15:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb
                java.lang.String r0 = "You can only call setExecutor() once!"
                r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb
                throw r2     // Catch: java.lang.Throwable -> Lb
            L1d:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r2
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T r4) {
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.j     // Catch: java.lang.Throwable -> L23
                int r0 = r0.getPoolSize()     // Catch: java.lang.Throwable -> L23
                java.util.concurrent.ThreadPoolExecutor r1 = r3.j     // Catch: java.lang.Throwable -> L23
                int r1 = r1.getActiveCount()     // Catch: java.lang.Throwable -> L23
                java.util.concurrent.ThreadPoolExecutor r2 = r3.j     // Catch: java.lang.Throwable -> L23
                int r2 = r2.getMaximumPoolSize()     // Catch: java.lang.Throwable -> L23
                if (r1 < r0) goto L28
                if (r0 >= r2) goto L28
                boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L23
                if (r4 == 0) goto L25
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                com.bytedance.sdk.component.utils.vl.j(r4, r0)     // Catch: java.lang.Throwable -> L23
                goto L25
            L23:
                r4 = move-exception
                goto L2e
            L25:
                r4 = 0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                return r4
            L28:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                boolean r4 = r3.offerFirst(r4)
                return r4
            L2e:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                throw r4
        }
    }

    private r() {
            r3 = this;
            r3.<init>()
            r0 = 163840(0x28000, float:2.29589E-40)
            r3.j = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 2
            r0.<init>(r1)
            r3.xt = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.g = r1
            com.bykv.vk.openvk.component.video.j.xt.r$1 r1 = new com.bykv.vk.openvk.component.video.j.xt.r$1
            r1.<init>(r3)
            r3.oq = r1
            com.bykv.vk.openvk.component.video.j.xt.r$xt r1 = new com.bykv.vk.openvk.component.video.j.xt.r$xt
            r2 = 0
            r1.<init>(r2)
            r3.cw = r1
            java.util.concurrent.ExecutorService r2 = j(r1)
            r3.f1722r = r2
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            r1.j(r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r0.put(r2, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 1
            r0.put(r2, r1)
            return
    }

    public static com.bykv.vk.openvk.component.video.j.xt.r cw() {
            com.bykv.vk.openvk.component.video.j.xt.r r0 = com.bykv.vk.openvk.component.video.j.xt.r.up
            if (r0 != 0) goto L19
            java.lang.Class<com.bykv.vk.openvk.component.video.j.xt.r> r0 = com.bykv.vk.openvk.component.video.j.xt.r.class
            monitor-enter(r0)
            com.bykv.vk.openvk.component.video.j.xt.r r1 = com.bykv.vk.openvk.component.video.j.xt.r.up     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.openvk.component.video.j.xt.r r1 = new com.bykv.vk.openvk.component.video.j.xt.r     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.openvk.component.video.j.xt.r.up = r1     // Catch: java.lang.Throwable -> L13
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
            com.bykv.vk.openvk.component.video.j.xt.r r0 = com.bykv.vk.openvk.component.video.j.xt.r.up
            return r0
    }

    static /* synthetic */ android.util.SparseArray j(com.bykv.vk.openvk.component.video.j.xt.r r0) {
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r0 = r0.xt
            return r0
    }

    private static java.util.concurrent.ExecutorService j(com.bykv.vk.openvk.component.video.j.xt.r.xt<java.lang.Runnable> r11) {
            int r0 = com.bykv.vk.openvk.component.video.j.cw.j.j()
            if (r0 > 0) goto L9
            r0 = 1
            r4 = 1
            goto Lf
        L9:
            r1 = 4
            if (r0 <= r1) goto Le
            r4 = 4
            goto Lf
        Le:
            r4 = r0
        Lf:
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            com.bykv.vk.openvk.component.video.j.xt.r$4 r9 = new com.bykv.vk.openvk.component.video.j.xt.r$4
            r9.<init>()
            com.bykv.vk.openvk.component.video.j.xt.r$5 r10 = new com.bykv.vk.openvk.component.video.j.xt.r$5
            r10.<init>(r11)
            r3 = 0
            r5 = 60
            r8 = r11
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            return r2
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.r.xt xt(com.bykv.vk.openvk.component.video.j.xt.r r0) {
            com.bykv.vk.openvk.component.video.j.xt.r$xt<java.lang.Runnable> r0 = r0.cw
            return r0
    }

    com.bykv.vk.openvk.component.video.j.xt.cw j() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.cw r0 = r1.qv
            return r0
    }

    public void j(int r2) {
            r1 = this;
            if (r2 <= 0) goto L4
            r1.j = r2
        L4:
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r0 == 0) goto L17
            java.lang.String r0 = "MaxPreloadSize: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "TAG_PROXY_Preloader"
            com.bytedance.sdk.component.utils.vl.j(r0, r2)
        L17:
            return
    }

    void j(com.bykv.vk.openvk.component.video.j.xt.j.cw r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    void j(com.bykv.vk.openvk.component.video.j.xt.xt.cw r1) {
            r0 = this;
            r0.f1721m = r1
            return
    }

    public void j(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.j(r0, r0, r2)
            return
    }

    void j(boolean r9, java.lang.String r10) {
            r8 = this;
            r8.jy = r10
            r8.ws = r9
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r0 == 0) goto L17
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r1 = "setCurrentPlayKey, "
            java.lang.String r2 = java.lang.String.valueOf(r10)
            java.lang.String r1 = r1.concat(r2)
            com.bytedance.sdk.component.utils.vl.j(r0, r1)
        L17:
            r0 = 0
            if (r10 != 0) goto L7e
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r1 = r8.g
            monitor-enter(r1)
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r9 = r8.g     // Catch: java.lang.Throwable -> L77
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r9 != 0) goto L36
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L32
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r9 = r8.g     // Catch: java.lang.Throwable -> L32
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L32
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r9 = r8.g     // Catch: java.lang.Throwable -> L32
            r9.clear()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L7a
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L74
            java.util.Iterator r9 = r0.iterator()
        L3d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L74
            java.lang.Object r10 = r9.next()
            com.bykv.vk.openvk.component.video.j.xt.r$j r10 = (com.bykv.vk.openvk.component.video.j.xt.r.j) r10
            boolean r2 = r10.j
            boolean r3 = r10.xt
            int r4 = r10.cw
            java.lang.String r5 = r10.f1725r
            java.util.Map<java.lang.String, java.lang.String> r6 = r10.up
            java.lang.String[] r7 = r10.f1724m
            r1 = r8
            r1.j(r2, r3, r4, r5, r6, r7)
            r2 = r1
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r0 == 0) goto L3d
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "setCurrentPlayKey, resume preload: "
            r1.<init>(r3)
            java.lang.String r10 = r10.f1725r
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.bytedance.sdk.component.utils.vl.j(r0, r10)
            goto L3d
        L74:
            r2 = r8
            goto L148
        L77:
            r0 = move-exception
            r2 = r8
        L79:
            r9 = r0
        L7a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7c
            throw r9
        L7c:
            r0 = move-exception
            goto L79
        L7e:
            r2 = r8
            int r1 = com.bykv.vk.openvk.component.video.j.xt.up.tl
            r3 = 3
            if (r1 == r3) goto Lb0
            r4 = 2
            if (r1 != r4) goto L88
            goto Lb0
        L88:
            r3 = 1
            if (r1 != r3) goto L148
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r1 = r2.xt
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r3 = r2.xt     // Catch: java.lang.Throwable -> La4
            int r9 = com.bykv.vk.openvk.component.video.j.xt.xt.xt.j(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r9 = r3.get(r9)     // Catch: java.lang.Throwable -> La4
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Throwable -> La4
            if (r9 == 0) goto La7
            java.lang.Object r9 = r9.remove(r10)     // Catch: java.lang.Throwable -> La4
            r0 = r9
            com.bykv.vk.openvk.component.video.j.xt.xt r0 = (com.bykv.vk.openvk.component.video.j.xt.xt) r0     // Catch: java.lang.Throwable -> La4
            goto La7
        La4:
            r0 = move-exception
            r9 = r0
            goto Lae
        La7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L148
            r0.j()
            return
        Lae:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            throw r9
        Lb0:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r9 = r2.xt
            monitor-enter(r9)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r10 = r2.xt     // Catch: java.lang.Throwable -> Lde
            int r10 = r10.size()     // Catch: java.lang.Throwable -> Lde
            r4 = 0
        Lba:
            if (r4 >= r10) goto Lea
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r5 = r2.xt     // Catch: java.lang.Throwable -> Lde
            int r6 = r5.keyAt(r4)     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Lde
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> Lde
            if (r5 == 0) goto Le7
            java.util.Collection r6 = r5.values()     // Catch: java.lang.Throwable -> Lde
            if (r6 == 0) goto Le4
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> Lde
            if (r7 != 0) goto Le4
            if (r0 != 0) goto Le1
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lde
            r0.<init>()     // Catch: java.lang.Throwable -> Lde
            goto Le1
        Lde:
            r0 = move-exception
            r10 = r0
            goto L149
        Le1:
            r0.addAll(r6)     // Catch: java.lang.Throwable -> Lde
        Le4:
            r5.clear()     // Catch: java.lang.Throwable -> Lde
        Le7:
            int r4 = r4 + 1
            goto Lba
        Lea:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto L148
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L148
            java.util.Iterator r9 = r0.iterator()
        Lf7:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L120
            java.lang.Object r10 = r9.next()
            com.bykv.vk.openvk.component.video.j.xt.xt r10 = (com.bykv.vk.openvk.component.video.j.xt.xt) r10
            r10.j()
            boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r4 == 0) goto Lf7
            java.lang.String r4 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "setCurrentPlayKey, cancel preload: "
            r5.<init>(r6)
            java.lang.String r10 = r10.ae
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            com.bytedance.sdk.component.utils.vl.j(r4, r10)
            goto Lf7
        L120:
            if (r1 != r3) goto L148
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r9 = r2.g
            monitor-enter(r9)
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L141
        L129:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L141
            if (r0 == 0) goto L144
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L141
            com.bykv.vk.openvk.component.video.j.xt.xt r0 = (com.bykv.vk.openvk.component.video.j.xt.xt) r0     // Catch: java.lang.Throwable -> L141
            java.lang.Object r0 = r0.ws     // Catch: java.lang.Throwable -> L141
            com.bykv.vk.openvk.component.video.j.xt.r$j r0 = (com.bykv.vk.openvk.component.video.j.xt.r.j) r0     // Catch: java.lang.Throwable -> L141
            if (r0 == 0) goto L129
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r1 = r2.g     // Catch: java.lang.Throwable -> L141
            r1.add(r0)     // Catch: java.lang.Throwable -> L141
            goto L129
        L141:
            r0 = move-exception
            r10 = r0
            goto L146
        L144:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L141
            return
        L146:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L141
            throw r10
        L148:
            return
        L149:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lde
            throw r10
    }

    public void j(boolean r17, boolean r18, int r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21, java.lang.String... r22) {
            r16 = this;
            r1 = r16
            r3 = r17
            r8 = r22
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r3 == 0) goto Le
            com.bykv.vk.openvk.component.video.j.xt.j.xt r2 = r1.tl
        Lc:
            r9 = r2
            goto L11
        Le:
            com.bykv.vk.openvk.component.video.j.xt.j.cw r2 = r1.ae
            goto Lc
        L11:
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r10 = r1.f1721m
            if (r9 == 0) goto L191
            if (r10 != 0) goto L19
            goto L191
        L19:
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            if (r2 != 0) goto L19a
            if (r8 == 0) goto L19a
            int r2 = r8.length
            if (r2 > 0) goto L26
            goto L19a
        L26:
            if (r19 > 0) goto L2c
            int r2 = r1.j
            r5 = r2
            goto L2e
        L2c:
            r5 = r19
        L2e:
            if (r18 == 0) goto L33
            r11 = r20
            goto L38
        L33:
            java.lang.String r2 = com.bykv.vk.openvk.component.video.api.m.xt.j(r20)
            r11 = r2
        L38:
            java.io.File r2 = r9.r(r11)
            if (r2 == 0) goto L69
            long r6 = r2.length()
            long r12 = (long) r5
            int r4 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r4 < 0) goto L69
            if (r0 == 0) goto L19a
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "no need preload, file size: "
            r3.<init>(r4)
            long r6 = r2.length()
            r3.append(r6)
            java.lang.String r2 = ", need preload size: "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.bytedance.sdk.component.utils.vl.j(r0, r2)
            return
        L69:
            com.bykv.vk.openvk.component.video.j.xt.m r2 = com.bykv.vk.openvk.component.video.j.xt.m.j()
            int r4 = com.bykv.vk.openvk.component.video.j.xt.xt.xt.j(r3)
            boolean r2 = r2.j(r4, r11)
            if (r2 == 0) goto L89
            if (r0 == 0) goto L19a
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "has running proxy task, skip preload for key: "
            java.lang.String r3 = java.lang.String.valueOf(r20)
            java.lang.String r2 = r2.concat(r3)
            com.bytedance.sdk.component.utils.vl.xt(r0, r2)
            return
        L89:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r12 = r1.xt
            monitor-enter(r12)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.j.xt.xt>> r2 = r1.xt     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L9d
            r13 = r2
            java.util.Map r13 = (java.util.Map) r13     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r13.containsKey(r11)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto La0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9d
            return
        L9d:
            r0 = move-exception
            goto L18f
        La0:
            com.bykv.vk.openvk.component.video.j.xt.r$j r2 = new com.bykv.vk.openvk.component.video.j.xt.r$j     // Catch: java.lang.Throwable -> L9d
            r4 = r18
            r6 = r20
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = r1.jy     // Catch: java.lang.Throwable -> L9d
            if (r4 == 0) goto L11b
            int r7 = com.bykv.vk.openvk.component.video.j.xt.up.tl     // Catch: java.lang.Throwable -> L9d
            r8 = 3
            if (r7 != r8) goto Ldc
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r3 = r1.g     // Catch: java.lang.Throwable -> L9d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L9d
            java.util.HashSet<com.bykv.vk.openvk.component.video.j.xt.r$j> r4 = r1.g     // Catch: java.lang.Throwable -> Ld9
            r4.add(r2)     // Catch: java.lang.Throwable -> Ld9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto Ld7
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "cancel preload: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            r2.append(r6)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = ", add to pending queue"
            r2.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9d
            com.bytedance.sdk.component.utils.vl.xt(r0, r2)     // Catch: java.lang.Throwable -> L9d
        Ld7:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9d
            return
        Ld9:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld9
            throw r0     // Catch: java.lang.Throwable -> L9d
        Ldc:
            r8 = 2
            if (r7 != r8) goto Lf2
            if (r0 == 0) goto Lf0
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "cancel preload: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L9d
            com.bytedance.sdk.component.utils.vl.xt(r0, r2)     // Catch: java.lang.Throwable -> L9d
        Lf0:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9d
            return
        Lf2:
            r8 = 1
            if (r7 != r8) goto L11b
            boolean r7 = r1.ws     // Catch: java.lang.Throwable -> L9d
            if (r7 != r3) goto L11b
            boolean r3 = r4.equals(r11)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L11b
            if (r0 == 0) goto L119
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "cancel preload: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            r2.append(r6)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = ", it is playing"
            r2.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9d
            com.bytedance.sdk.component.utils.vl.xt(r0, r2)     // Catch: java.lang.Throwable -> L9d
        L119:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9d
            return
        L11b:
            java.util.List r0 = com.bykv.vk.openvk.component.video.j.cw.j.j(r21)     // Catch: java.lang.Throwable -> L9d
            java.util.List r0 = com.bykv.vk.openvk.component.video.j.cw.j.j(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L14c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9d
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L9d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L9d
            r7 = 0
        L133:
            if (r7 >= r4) goto L14d
            java.lang.Object r8 = r0.get(r7)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.g$xt r8 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r8     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L149
            com.bykv.vk.openvk.component.video.j.xt.g$xt r14 = new com.bykv.vk.openvk.component.video.j.xt.g$xt     // Catch: java.lang.Throwable -> L9d
            java.lang.String r15 = r8.j     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = r8.xt     // Catch: java.lang.Throwable -> L9d
            r14.<init>(r15, r8)     // Catch: java.lang.Throwable -> L9d
            r3.add(r14)     // Catch: java.lang.Throwable -> L9d
        L149:
            int r7 = r7 + 1
            goto L133
        L14c:
            r3 = 0
        L14d:
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = new com.bykv.vk.openvk.component.video.j.xt.xt$j     // Catch: java.lang.Throwable -> L9d
            r0.<init>()     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r9)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r10)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r6)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.xt(r11)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.vl r4 = new com.bykv.vk.openvk.component.video.j.xt.vl     // Catch: java.lang.Throwable -> L9d
            java.util.List r6 = com.bykv.vk.openvk.component.video.j.cw.j.j(r22)     // Catch: java.lang.Throwable -> L9d
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r4)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r3)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r5)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$xt r3 = r1.oq     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r3)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt$j r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L9d
            com.bykv.vk.openvk.component.video.j.xt.xt r0 = r0.j()     // Catch: java.lang.Throwable -> L9d
            r13.put(r11, r0)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9d
            java.util.concurrent.ExecutorService r2 = r1.f1722r
            r2.execute(r0)
            return
        L18f:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9d
            throw r0
        L191:
            if (r0 == 0) goto L19a
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "cache or videoProxyDB null in Preloader!!!"
            com.bytedance.sdk.component.utils.vl.r(r0, r2)
        L19a:
            return
    }

    public void j(boolean r8, boolean r9, int r10, java.lang.String r11, java.lang.String... r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.j(r1, r2, r3, r4, r5, r6)
            return
    }

    public void j(boolean r8, boolean r9, java.lang.String r10) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L7
            return
        L7:
            com.bykv.vk.openvk.component.video.j.xt.r$2 r1 = new com.bykv.vk.openvk.component.video.j.xt.r$2
            java.lang.String r3 = "cancel b b S"
            r2 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            com.bykv.vk.openvk.component.video.j.cw.j.j(r1)
            return
    }

    public void r() {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.xt.r$3 r0 = new com.bykv.vk.openvk.component.video.j.xt.r$3
            java.lang.String r1 = "cancelAll"
            r0.<init>(r2, r1)
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            return
    }

    com.bykv.vk.openvk.component.video.j.xt.cw xt() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.cw r0 = r1.vl
            return r0
    }
}
