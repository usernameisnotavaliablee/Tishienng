package com.bykv.vk.openvk.component.video.j.xt.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public static final boolean j = false;
    private com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j cw;
    private java.util.HashMap<java.lang.String, java.lang.Boolean> xt;

    /* renamed from: com.bykv.vk.openvk.component.video.j.xt.m.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.j.xt.m.j$j, reason: collision with other inner class name */
    class C0179j extends com.bytedance.sdk.component.oq.r.cw {
        private boolean cw;
        final /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.m.j j;

        /* renamed from: r, reason: collision with root package name */
        private final java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j> f1717r;
        private java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j> up;
        private java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j> xt;

        /* renamed from: com.bykv.vk.openvk.component.video.j.xt.m.j$j$j, reason: collision with other inner class name */
        private class C0180j {
            final /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j ae;
            public java.lang.String[] cw;
            public int j;

            /* renamed from: m, reason: collision with root package name */
            public com.bykv.vk.openvk.component.video.api.cw.r f1718m;

            /* renamed from: r, reason: collision with root package name */
            public int f1719r;
            public java.lang.String up;
            public java.lang.String xt;

            public C0180j(com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j r1) {
                    r0 = this;
                    r0.ae = r1
                    r0.<init>()
                    return
            }
        }

        public C0179j(com.bykv.vk.openvk.component.video.j.xt.m.j r2) {
                r1 = this;
                r1.j = r2
                java.lang.String r2 = "VideoCachePreloader$PreLoadThread"
                r1.<init>(r2)
                java.util.concurrent.ArrayBlockingQueue r2 = new java.util.concurrent.ArrayBlockingQueue
                r0 = 10
                r2.<init>(r0)
                r1.f1717r = r2
                java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
                r2.<init>()
                r1.xt = r2
                r2 = 1
                r1.cw = r2
                java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
                r2.<init>()
                r1.up = r2
                return
        }

        private void cw(com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r1.xt
                r0.offer(r2)
                r1.notify()
                return
        }

        private com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j j(int r2, com.bykv.vk.openvk.component.video.api.cw.r r3) {
                r1 = this;
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r1.f1717r
                r0.size()
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r1.f1717r
                java.lang.Object r0 = r0.poll()
                com.bykv.vk.openvk.component.video.j.xt.m.j$j$j r0 = (com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j) r0
                if (r0 != 0) goto L14
                com.bykv.vk.openvk.component.video.j.xt.m.j$j$j r0 = new com.bykv.vk.openvk.component.video.j.xt.m.j$j$j
                r0.<init>(r1)
            L14:
                r0.j = r2
                r0.f1718m = r3
                return r0
        }

        private void j() {
                r2 = this;
            L0:
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r2.up
                java.lang.Object r0 = r0.poll()
                com.bykv.vk.openvk.component.video.j.xt.m.j$j$j r0 = (com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j) r0
                if (r0 == 0) goto L52
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                java.lang.String r1 = r1.av()
                r0.xt = r1
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                java.lang.String r1 = r1.av()
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r0.cw = r1
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                int r1 = r1.xt()
                if (r1 <= 0) goto L27
                goto L2d
            L27:
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                int r1 = r1.m()
            L2d:
                r0.f1719r = r1
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                java.lang.String r1 = r1.i()
                r0.up = r1
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                java.lang.String r1 = r1.i()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L4b
                com.bykv.vk.openvk.component.video.api.cw.r r1 = r0.f1718m
                java.lang.String r1 = r1.i()
                r0.xt = r1
            L4b:
                r1 = 0
                r0.f1718m = r1
                r2.cw(r0)
                goto L0
            L52:
                return
        }

        private void j(com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j r3) {
                r2 = this;
                r0 = 0
                r3.cw = r0
                r3.xt = r0
                r1 = -1
                r3.j = r1
                r3.f1718m = r0
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r2.f1717r
                r0.offer(r3)
                return
        }

        private synchronized void xt(com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r1.up     // Catch: java.lang.Throwable -> Lb
                r0.add(r2)     // Catch: java.lang.Throwable -> Lb
                r1.notify()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r2
        }

        public void j(com.bykv.vk.openvk.component.video.api.cw.r r2) {
                r1 = this;
                r0 = 0
                com.bykv.vk.openvk.component.video.j.xt.m.j$j$j r2 = r1.j(r0, r2)
                r1.xt(r2)
                return
        }

        public void run() {
                r10 = this;
            L0:
                boolean r0 = r10.cw
                if (r0 == 0) goto Lca
                monitor-enter(r10)
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r10.up     // Catch: java.lang.Throwable -> L11
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto L14
                r10.j()     // Catch: java.lang.Throwable -> L11
                goto L14
            L11:
                r0 = move-exception
                goto Lc8
            L14:
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r10.xt     // Catch: java.lang.Throwable -> L11
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto Lbd
                java.util.Queue<com.bykv.vk.openvk.component.video.j.xt.m.j$j$j> r0 = r10.xt     // Catch: java.lang.Throwable -> L11
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L11
                com.bykv.vk.openvk.component.video.j.xt.m.j$j$j r0 = (com.bykv.vk.openvk.component.video.j.xt.m.j.C0179j.C0180j) r0     // Catch: java.lang.Throwable -> L11
                if (r0 == 0) goto L14
                int r1 = r0.j     // Catch: java.lang.Throwable -> L11
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L78
                if (r1 == r3) goto L6e
                r3 = 2
                if (r1 == r3) goto L66
                r3 = 3
                if (r1 == r3) goto L44
                r3 = 4
                if (r1 == r3) goto L39
                goto Lb8
            L39:
                com.bykv.vk.openvk.component.video.j.xt.r r1 = com.bykv.vk.openvk.component.video.j.xt.r.cw()     // Catch: java.lang.Throwable -> L11
                r1.r()     // Catch: java.lang.Throwable -> L11
                r10.cw = r2     // Catch: java.lang.Throwable -> L11
                goto Lb8
            L44:
                com.bykv.vk.openvk.component.video.j.xt.r r1 = com.bykv.vk.openvk.component.video.j.xt.r.cw()     // Catch: java.lang.Throwable -> L11
                r1.r()     // Catch: java.lang.Throwable -> L11
                com.bykv.vk.openvk.component.video.j.xt.j.xt r1 = com.bykv.vk.openvk.component.video.j.xt.up.xt()     // Catch: java.lang.Throwable -> L11
                if (r1 == 0) goto L58
                com.bykv.vk.openvk.component.video.j.xt.j.xt r1 = com.bykv.vk.openvk.component.video.j.xt.up.xt()     // Catch: java.lang.Throwable -> L11
                r1.j()     // Catch: java.lang.Throwable -> L11
            L58:
                com.bykv.vk.openvk.component.video.j.xt.j.cw r1 = com.bykv.vk.openvk.component.video.j.xt.up.j()     // Catch: java.lang.Throwable -> L11
                if (r1 == 0) goto Lb8
                com.bykv.vk.openvk.component.video.j.xt.j.cw r1 = com.bykv.vk.openvk.component.video.j.xt.up.j()     // Catch: java.lang.Throwable -> L11
                r1.j()     // Catch: java.lang.Throwable -> L11
                goto Lb8
            L66:
                com.bykv.vk.openvk.component.video.j.xt.r r1 = com.bykv.vk.openvk.component.video.j.xt.r.cw()     // Catch: java.lang.Throwable -> L11
                r1.r()     // Catch: java.lang.Throwable -> L11
                goto Lb8
            L6e:
                com.bykv.vk.openvk.component.video.j.xt.r r1 = com.bykv.vk.openvk.component.video.j.xt.r.cw()     // Catch: java.lang.Throwable -> L11
                java.lang.String r2 = r0.xt     // Catch: java.lang.Throwable -> L11
                r1.j(r2)     // Catch: java.lang.Throwable -> L11
                goto Lb8
            L78:
                java.lang.String[] r1 = r0.cw     // Catch: java.lang.Throwable -> L11
                if (r1 == 0) goto Lb8
                int r1 = r1.length     // Catch: java.lang.Throwable -> L11
                if (r1 <= 0) goto Lb8
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
                r1.<init>()     // Catch: java.lang.Throwable -> L11
                java.lang.String[] r4 = r0.cw     // Catch: java.lang.Throwable -> L11
                int r5 = r4.length     // Catch: java.lang.Throwable -> L11
            L87:
                if (r2 >= r5) goto L97
                r6 = r4[r2]     // Catch: java.lang.Throwable -> L11
                boolean r7 = com.bykv.vk.openvk.component.video.j.cw.j.j(r6)     // Catch: java.lang.Throwable -> L11
                if (r7 == 0) goto L94
                r1.add(r6)     // Catch: java.lang.Throwable -> L11
            L94:
                int r2 = r2 + 1
                goto L87
            L97:
                int r2 = r1.size()     // Catch: java.lang.Throwable -> L11
                java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L11
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.lang.Throwable -> L11
                r9 = r1
                java.lang.String[] r9 = (java.lang.String[]) r9     // Catch: java.lang.Throwable -> L11
                java.lang.String r1 = r0.up     // Catch: java.lang.Throwable -> L11
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L11
                r6 = r1 ^ 1
                com.bykv.vk.openvk.component.video.j.xt.r r4 = com.bykv.vk.openvk.component.video.j.xt.r.cw()     // Catch: java.lang.Throwable -> L11
                int r7 = r0.f1719r     // Catch: java.lang.Throwable -> L11
                java.lang.String r8 = r0.xt     // Catch: java.lang.Throwable -> L11
                r5 = 0
                r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11
            Lb8:
                r10.j(r0)     // Catch: java.lang.Throwable -> L11
                goto L14
            Lbd:
                r10.wait()     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> Lc1
                goto Lc5
            Lc1:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L11
            Lc5:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L11
                goto L0
            Lc8:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L11
                throw r0
            Lca:
                return
        }
    }

    private static class xt {
        private static final com.bykv.vk.openvk.component.video.j.xt.m.j j = null;

        static {
                com.bykv.vk.openvk.component.video.j.xt.m.j r0 = new com.bykv.vk.openvk.component.video.j.xt.m.j
                r1 = 0
                r0.<init>(r1)
                com.bykv.vk.openvk.component.video.j.xt.m.j.xt.j = r0
                return
        }

        public xt() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.m.j j() {
                com.bykv.vk.openvk.component.video.j.xt.m.j r0 = com.bykv.vk.openvk.component.video.j.xt.m.j.xt.j
                return r0
        }
    }

    static {
            boolean r0 = com.bykv.vk.openvk.component.video.api.m.cw.xt()
            com.bykv.vk.openvk.component.video.j.xt.m.j.j = r0
            return
    }

    private j() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.xt = r0
            r1.xt()
            return
    }

    /* synthetic */ j(com.bykv.vk.openvk.component.video.j.xt.m.j.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.bykv.vk.openvk.component.video.j.xt.j.cw cw() {
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.bykv.vk.openvk.component.video.api.cw.getContext()
            java.io.File r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r1)
            java.lang.String r2 = "proxy_cache"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L18
            r0.mkdirs()
        L18:
            r1 = 0
            com.bykv.vk.openvk.component.video.j.xt.j.cw r2 = new com.bykv.vk.openvk.component.video.j.xt.j.cw     // Catch: java.io.IOException -> L28
            r2.<init>(r0)     // Catch: java.io.IOException -> L28
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            r2.j(r0)     // Catch: java.io.IOException -> L25
            return r2
        L25:
            r0 = move-exception
            r1 = r2
            goto L29
        L28:
            r0 = move-exception
        L29:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r1
    }

    public static com.bykv.vk.openvk.component.video.j.xt.m.j j() {
            com.bykv.vk.openvk.component.video.j.xt.m.j r0 = com.bykv.vk.openvk.component.video.j.xt.m.j.xt.j()
            return r0
    }

    public boolean j(com.bykv.vk.openvk.component.video.api.cw.r r2) {
            r1 = this;
            boolean r0 = r1.xt()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.j.xt.m.j$j r0 = r1.cw
            r0.j(r2)
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public java.lang.String xt(com.bykv.vk.openvk.component.video.api.cw.r r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.String r0 = r5.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = r0 ^ 1
            if (r0 != 0) goto L15
            java.lang.String r0 = r5.i()
            goto L19
        L15:
            java.lang.String r0 = r5.av()
        L19:
            com.bykv.vk.openvk.component.video.j.xt.m r2 = com.bykv.vk.openvk.component.video.j.xt.m.j()
            java.lang.String r5 = r5.av()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r3 = 0
            java.lang.String r5 = r2.j(r3, r1, r0, r5)
            return r5
    }

    public boolean xt() {
            r5 = this;
            com.bykv.vk.openvk.component.video.j.xt.m.j$j r0 = r5.cw
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            com.bykv.vk.openvk.component.video.j.xt.j.cw r0 = cw()
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            com.bykv.vk.openvk.component.video.j.xt.up.j(r1)
            com.bykv.vk.openvk.component.video.j.xt.up.xt(r1)
            com.bykv.vk.openvk.component.video.j.xt.up.j(r1)
            com.bykv.vk.openvk.component.video.j.xt.m r3 = com.bykv.vk.openvk.component.video.j.xt.m.j()
            r3.r()
            com.bykv.vk.openvk.component.video.j.xt.m.j$j r3 = new com.bykv.vk.openvk.component.video.j.xt.m.j$j     // Catch: java.lang.Exception -> L44
            r3.<init>(r5)     // Catch: java.lang.Exception -> L44
            r5.cw = r3     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = "csj_video_cache_preloader"
            r3.setName(r4)     // Catch: java.lang.Exception -> L44
            com.bykv.vk.openvk.component.video.j.xt.m.j$j r3 = r5.cw     // Catch: java.lang.Exception -> L44
            r3.start()     // Catch: java.lang.Exception -> L44
            android.content.Context r3 = com.bykv.vk.openvk.component.video.api.cw.getContext()     // Catch: java.lang.Exception -> L44
            com.bykv.vk.openvk.component.video.j.xt.up.j(r0, r3)     // Catch: java.lang.Exception -> L44
            com.bykv.vk.openvk.component.video.j.xt.r.cw()     // Catch: java.lang.Exception -> L44
            com.bykv.vk.openvk.component.video.j.xt.r r0 = com.bykv.vk.openvk.component.video.j.xt.r.cw()
            r2 = 10485759(0x9fffff, float:1.4693678E-38)
            r0.j(r2)
            return r1
        L44:
            return r2
    }
}
