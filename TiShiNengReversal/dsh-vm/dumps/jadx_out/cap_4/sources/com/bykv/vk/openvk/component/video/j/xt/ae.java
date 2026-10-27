package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class ae extends com.bykv.vk.openvk.component.video.j.xt.j {
    private volatile com.bykv.vk.openvk.component.video.j.xt.xt av;
    private final com.bykv.vk.openvk.component.video.j.xt.r az;
    private volatile boolean i;
    private final java.net.Socket jy;
    private final com.bykv.vk.openvk.component.video.j.xt.ae.cw ws;



    public interface cw {
        void j(com.bykv.vk.openvk.component.video.j.xt.ae r1);

        void xt(com.bykv.vk.openvk.component.video.j.xt.ae r1);
    }

    static final class j {
        java.net.Socket cw;
        com.bykv.vk.openvk.component.video.j.xt.j.j j;

        /* renamed from: r, reason: collision with root package name */
        com.bykv.vk.openvk.component.video.j.xt.ae.cw f1708r;
        com.bykv.vk.openvk.component.video.j.xt.xt.cw xt;

        j() {
                r0 = this;
                r0.<init>()
                return
        }

        com.bykv.vk.openvk.component.video.j.xt.ae.j j(com.bykv.vk.openvk.component.video.j.xt.ae.cw r1) {
                r0 = this;
                r0.f1708r = r1
                return r0
        }

        com.bykv.vk.openvk.component.video.j.xt.ae.j j(com.bykv.vk.openvk.component.video.j.xt.xt.cw r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.xt = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "db == null"
                r2.<init>(r0)
                throw r2
        }

        com.bykv.vk.openvk.component.video.j.xt.ae.j j(java.net.Socket r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.cw = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "socket == null"
                r2.<init>(r0)
                throw r2
        }

        com.bykv.vk.openvk.component.video.j.xt.ae j() {
                r1 = this;
                com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = r1.xt
                if (r0 == 0) goto Le
                java.net.Socket r0 = r1.cw
                if (r0 == 0) goto Le
                com.bykv.vk.openvk.component.video.j.xt.ae r0 = new com.bykv.vk.openvk.component.video.j.xt.ae
                r0.<init>(r1)
                return r0
            Le:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }
    }

    private static class xt {
        private boolean cw;
        private final java.io.OutputStream j;
        private int xt;

        xt(java.io.OutputStream r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }

        void j(byte[] r2, int r3, int r4) throws com.bykv.vk.openvk.component.video.j.xt.cw.r {
                r1 = this;
                boolean r0 = r1.cw
                if (r0 != 0) goto L14
                java.io.OutputStream r0 = r1.j     // Catch: java.io.IOException -> Ld
                r0.write(r2, r3, r4)     // Catch: java.io.IOException -> Ld
                r2 = 1
                r1.cw = r2     // Catch: java.io.IOException -> Ld
                return
            Ld:
                r2 = move-exception
                com.bykv.vk.openvk.component.video.j.xt.cw.r r3 = new com.bykv.vk.openvk.component.video.j.xt.cw.r
                r3.<init>(r2)
                throw r3
            L14:
                return
        }

        boolean j() {
                r1 = this;
                boolean r0 = r1.cw
                return r0
        }

        int xt() {
                r1 = this;
                int r0 = r1.xt
                return r0
        }

        void xt(byte[] r2, int r3, int r4) throws com.bykv.vk.openvk.component.video.j.xt.cw.r {
                r1 = this;
                java.io.OutputStream r0 = r1.j     // Catch: java.io.IOException -> Lb
                r0.write(r2, r3, r4)     // Catch: java.io.IOException -> Lb
                int r2 = r1.xt     // Catch: java.io.IOException -> Lb
                int r2 = r2 + r4
                r1.xt = r2     // Catch: java.io.IOException -> Lb
                return
            Lb:
                r2 = move-exception
                com.bykv.vk.openvk.component.video.j.xt.cw.r r3 = new com.bykv.vk.openvk.component.video.j.xt.cw.r
                r3.<init>(r2)
                throw r3
        }
    }

    ae(com.bykv.vk.openvk.component.video.j.xt.ae.j r3) {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r3.j
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r1 = r3.xt
            r2.<init>(r0, r1)
            r0 = 1
            r2.i = r0
            java.net.Socket r0 = r3.cw
            r2.jy = r0
            com.bykv.vk.openvk.component.video.j.xt.ae$cw r3 = r3.f1708r
            r2.ws = r3
            com.bykv.vk.openvk.component.video.j.xt.r r3 = com.bykv.vk.openvk.component.video.j.xt.r.cw()
            r2.az = r3
            return
    }

    private void cw(com.bykv.vk.openvk.component.video.j.xt.ae.xt r9, com.bykv.vk.openvk.component.video.j.xt.vl.j r10) throws com.bykv.vk.openvk.component.video.j.xt.tl.j, com.bykv.vk.openvk.component.video.j.xt.cw.r, java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.cw.j, com.bykv.vk.openvk.component.video.j.xt.cw.xt {
            r8 = this;
            boolean r0 = r8.i
            if (r0 == 0) goto L48
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r8.j
            java.lang.String r1 = r8.tl
            java.io.File r0 = r0.cw(r1)
            long r1 = r0.length()
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r3 = r8.xt
            java.lang.String r4 = r8.tl
            com.bykv.vk.openvk.component.video.j.xt.g r5 = r8.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r5 = r5.cw
            int r5 = r5.j
            com.bykv.vk.openvk.component.video.j.xt.xt.j r3 = r3.query(r4, r5)
            int r4 = r9.xt()
            int r5 = r9.xt()
            long r5 = (long) r5
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L48
            boolean r5 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r5 == 0) goto L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "cache hit, remainSize: "
            r5.<init>(r6)
            long r6 = (long) r4
            long r1 = r1 - r6
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            com.bytedance.sdk.component.utils.vl.j(r2, r1)
        L44:
            r8.j(r3, r0, r9, r10)
            return
        L48:
            r8.r(r9, r10)
            return
    }

    private void g() {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.xt.xt r0 = r2.av
            r1 = 0
            r2.av = r1
            if (r0 == 0) goto La
            r0.j()
        La:
            return
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.r j(com.bykv.vk.openvk.component.video.j.xt.ae r0) {
            com.bykv.vk.openvk.component.video.j.xt.r r0 = r0.az
            return r0
    }

    private void j(com.bykv.vk.openvk.component.video.j.xt.ae.xt r3, com.bykv.vk.openvk.component.video.j.xt.vl.j r4) throws com.bykv.vk.openvk.component.video.j.xt.cw.r, java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.tl.j, com.bykv.vk.openvk.component.video.j.xt.cw.j, com.bykv.vk.openvk.component.video.j.xt.cw.xt {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.xt.g r0 = r2.g
            com.bykv.vk.openvk.component.video.j.xt.g$cw r0 = r0.j
            java.lang.String r0 = r0.j
            java.lang.String r1 = "HEAD"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L12
            r2.xt(r3, r4)
            return
        L12:
            r2.cw(r3, r4)
            return
    }

    private void j(com.bykv.vk.openvk.component.video.j.xt.xt.j r8, java.io.File r9, com.bykv.vk.openvk.component.video.j.xt.ae.xt r10, com.bykv.vk.openvk.component.video.j.xt.vl.j r11) throws java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.cw.r, com.bykv.vk.openvk.component.video.j.xt.tl.j, com.bykv.vk.openvk.component.video.j.xt.cw.j, com.bykv.vk.openvk.component.video.j.xt.cw.xt {
            r7 = this;
            boolean r0 = r10.j()
            r1 = 0
            if (r0 != 0) goto L16
            byte[] r0 = r7.j(r8, r10, r11)
            r7.up()
            if (r0 != 0) goto L12
            goto L1bd
        L12:
            int r2 = r0.length
            r10.j(r0, r1, r2)
        L16:
            r0 = 0
            if (r8 != 0) goto L66
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r8 = r7.xt
            java.lang.String r2 = r7.tl
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r7.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r3 = r3.cw
            int r3 = r3.j
            com.bykv.vk.openvk.component.video.j.xt.xt.j r8 = r8.query(r2, r3)
            if (r8 != 0) goto L66
            boolean r8 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r8 == 0) goto L34
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info from db"
            com.bytedance.sdk.component.utils.vl.r(r8, r2)
        L34:
            r7.j(r0, r10, r11)
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r8 = r7.xt
            java.lang.String r2 = r7.tl
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r7.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r3 = r3.cw
            int r3 = r3.j
            com.bykv.vk.openvk.component.video.j.xt.xt.j r8 = r8.query(r2, r3)
            if (r8 == 0) goto L48
            goto L66
        L48:
            com.bykv.vk.openvk.component.video.j.xt.cw.cw r8 = new com.bykv.vk.openvk.component.video.j.xt.cw.cw
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "failed to get header, rawKey: "
            r9.<init>(r10)
            java.lang.String r10 = r7.ae
            r9.append(r10)
            java.lang.String r10 = ", url: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L66:
            long r2 = r9.length()
            int r4 = r8.cw
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto Le2
            com.bykv.vk.openvk.component.video.j.xt.xt r2 = r7.av
            if (r2 == 0) goto L81
            boolean r3 = r2.xt()
            if (r3 != 0) goto L81
            boolean r2 = r2.r()
            if (r2 == 0) goto Le2
        L81:
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = new com.bykv.vk.openvk.component.video.j.xt.xt$j
            r2.<init>()
            com.bykv.vk.openvk.component.video.j.xt.j.j r3 = r7.j
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r3 = r7.xt
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            java.lang.String r3 = r7.ae
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            java.lang.String r3 = r7.tl
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.xt(r3)
            com.bykv.vk.openvk.component.video.j.xt.vl r3 = new com.bykv.vk.openvk.component.video.j.xt.vl
            java.lang.String r4 = r11.j
            r3.<init>(r4)
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r3 = r7.f1711m
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r7.g
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            com.bykv.vk.openvk.component.video.j.xt.ae$1 r3 = new com.bykv.vk.openvk.component.video.j.xt.ae$1
            r3.<init>(r7)
            com.bykv.vk.openvk.component.video.j.xt.xt$j r2 = r2.j(r3)
            com.bykv.vk.openvk.component.video.j.xt.xt r2 = r2.j()
            r7.av = r2
            com.bytedance.sdk.component.oq.tl r3 = new com.bytedance.sdk.component.oq.tl
            r4 = 10
            r5 = 1
            r3.<init>(r2, r0, r4, r5)
            com.bykv.vk.openvk.component.video.j.xt.ae$2 r2 = new com.bykv.vk.openvk.component.video.j.xt.ae$2
            java.lang.String r4 = "processCacheNetWorkConcurrent"
            r2.<init>(r7, r4, r3)
            com.bytedance.sdk.component.oq.ae.xt(r2)
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto Le3
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r4 = "fire download in process cache task"
            com.bytedance.sdk.component.utils.vl.r(r2, r4)
            goto Le3
        Le2:
            r3 = r0
        Le3:
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
            com.bykv.vk.openvk.component.video.j.xt.tl r4 = new com.bykv.vk.openvk.component.video.j.xt.tl     // Catch: java.lang.Throwable -> L1be
            java.lang.String r5 = "r"
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L1be
            int r9 = r10.xt()     // Catch: java.lang.Throwable -> L10b
            long r5 = (long) r9     // Catch: java.lang.Throwable -> L10b
            r4.j(r5)     // Catch: java.lang.Throwable -> L10b
            com.bykv.vk.openvk.component.video.j.xt.g r9 = r7.g     // Catch: java.lang.Throwable -> L10b
            com.bykv.vk.openvk.component.video.j.xt.g$j r9 = r9.cw     // Catch: java.lang.Throwable -> L10b
            int r9 = r9.up     // Catch: java.lang.Throwable -> L10b
            if (r9 <= 0) goto L10f
            int r8 = r8.cw     // Catch: java.lang.Throwable -> L10b
            com.bykv.vk.openvk.component.video.j.xt.g r9 = r7.g     // Catch: java.lang.Throwable -> L10b
            com.bykv.vk.openvk.component.video.j.xt.g$j r9 = r9.cw     // Catch: java.lang.Throwable -> L10b
            int r9 = r9.up     // Catch: java.lang.Throwable -> L10b
            int r8 = java.lang.Math.min(r8, r9)     // Catch: java.lang.Throwable -> L10b
            goto L111
        L10b:
            r8 = move-exception
            r0 = r4
            goto L1bf
        L10f:
            int r8 = r8.cw     // Catch: java.lang.Throwable -> L10b
        L111:
            int r9 = r10.xt()     // Catch: java.lang.Throwable -> L10b
            if (r9 >= r8) goto L18a
            r7.up()     // Catch: java.lang.Throwable -> L10b
            int r9 = r4.j(r2)     // Catch: java.lang.Throwable -> L10b
            if (r9 > 0) goto L183
            com.bykv.vk.openvk.component.video.j.xt.xt r9 = r7.av     // Catch: java.lang.Throwable -> L10b
            if (r9 == 0) goto L133
            com.bykv.vk.openvk.component.video.j.xt.cw.xt r0 = r9.g()     // Catch: java.lang.Throwable -> L10b
            if (r0 != 0) goto L132
            com.bykv.vk.openvk.component.video.j.xt.tl$j r0 = r9.tl()     // Catch: java.lang.Throwable -> L10b
            if (r0 != 0) goto L131
            goto L133
        L131:
            throw r0     // Catch: java.lang.Throwable -> L10b
        L132:
            throw r0     // Catch: java.lang.Throwable -> L10b
        L133:
            if (r9 == 0) goto L15a
            boolean r0 = r9.xt()     // Catch: java.lang.Throwable -> L10b
            if (r0 != 0) goto L15a
            boolean r0 = r9.r()     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto L142
            goto L15a
        L142:
            r7.up()     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r0 = r9.jy     // Catch: java.lang.Throwable -> L10b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r9 = r9.jy     // Catch: java.lang.Throwable -> L150 java.lang.InterruptedException -> L152
            r5 = 1000(0x3e8, double:4.94E-321)
            r9.wait(r5)     // Catch: java.lang.Throwable -> L150 java.lang.InterruptedException -> L152
            goto L156
        L150:
            r8 = move-exception
            goto L158
        L152:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)     // Catch: java.lang.Throwable -> L150
        L156:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L150
            goto L186
        L158:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L150
            throw r8     // Catch: java.lang.Throwable -> L10b
        L15a:
            boolean r8 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L10b
            if (r8 == 0) goto L165
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r9 = "download task has finished!!!"
            com.bytedance.sdk.component.utils.vl.r(r8, r9)     // Catch: java.lang.Throwable -> L10b
        L165:
            com.bykv.vk.openvk.component.video.j.xt.cw.cw r8 = new com.bykv.vk.openvk.component.video.j.xt.cw.cw     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            java.lang.String r10 = "illegal state download task has finished, rawKey: "
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r10 = r7.ae     // Catch: java.lang.Throwable -> L10b
            r9.append(r10)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r10 = ", url: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L10b
            r9.append(r11)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L10b
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L10b
            throw r8     // Catch: java.lang.Throwable -> L10b
        L183:
            r10.xt(r2, r1, r9)     // Catch: java.lang.Throwable -> L10b
        L186:
            r7.up()     // Catch: java.lang.Throwable -> L10b
            goto L111
        L18a:
            boolean r9 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L10b
            if (r9 == 0) goto L1ad
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            java.lang.String r0 = "read cache file complete: "
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L10b
            int r10 = r10.xt()     // Catch: java.lang.Throwable -> L10b
            r11.append(r10)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r10 = ", "
            r11.append(r10)     // Catch: java.lang.Throwable -> L10b
            r11.append(r8)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L10b
            com.bytedance.sdk.component.utils.vl.j(r9, r8)     // Catch: java.lang.Throwable -> L10b
        L1ad:
            r7.cw()     // Catch: java.lang.Throwable -> L10b
            r4.j()
            if (r3 == 0) goto L1bd
            r3.get()     // Catch: java.lang.Throwable -> L1b9
            goto L1bd
        L1b9:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)
        L1bd:
            return
        L1be:
            r8 = move-exception
        L1bf:
            if (r0 == 0) goto L1c4
            r0.j()
        L1c4:
            if (r3 == 0) goto L1ce
            r3.get()     // Catch: java.lang.Throwable -> L1ca
            goto L1ce
        L1ca:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)
        L1ce:
            throw r8
    }

    private boolean j(com.bykv.vk.openvk.component.video.j.xt.ae.xt r5) throws com.bykv.vk.openvk.component.video.j.xt.cw.j {
            r4 = this;
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
        L2:
            com.bykv.vk.openvk.component.video.j.xt.vl r1 = r4.oq
            boolean r1 = r1.j()
            r2 = 0
            if (r1 == 0) goto L8a
            r4.up()
            com.bykv.vk.openvk.component.video.j.xt.vl r1 = r4.oq
            com.bykv.vk.openvk.component.video.j.xt.vl$j r1 = r1.xt()
            r3 = 1
            r4.j(r5, r1)     // Catch: java.lang.Exception -> L19 com.bykv.vk.openvk.component.video.j.xt.cw.xt -> L26 com.bykv.vk.openvk.component.video.j.xt.tl.j -> L33 com.bykv.vk.openvk.component.video.j.xt.cw.r -> L45 java.io.IOException -> L52 com.bykv.vk.openvk.component.video.j.xt.cw.cw -> L82
            return r3
        L19:
            r1 = move-exception
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto L2
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            goto L2
        L26:
            r5 = move-exception
            boolean r1 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r1 == 0) goto L32
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            com.bytedance.sdk.component.utils.vl.r(r0, r5)
        L32:
            return r2
        L33:
            r1 = move-exception
            boolean r3 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r3 == 0) goto L3f
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
        L3f:
            r4.i = r2
            r4.ae()
            goto L2
        L45:
            r5 = move-exception
            boolean r1 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r1 == 0) goto L51
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            com.bytedance.sdk.component.utils.vl.r(r0, r5)
        L51:
            return r3
        L52:
            r2 = move-exception
            boolean r3 = r2 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L5a
            r1.xt()
        L5a:
            boolean r1 = r4.xt()
            if (r1 == 0) goto L7e
            boolean r1 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r1 == 0) goto L2
            java.lang.String r1 = "Canceled"
            java.lang.String r3 = r2.getMessage()
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L76
            java.lang.String r1 = "okhttp call canceled"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
            goto L2
        L76:
            java.lang.String r1 = android.util.Log.getStackTraceString(r2)
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            goto L2
        L7e:
            r4.ae()
            goto L2
        L82:
            r1.j()
            r4.ae()
            goto L2
        L8a:
            return r2
    }

    private byte[] j(com.bykv.vk.openvk.component.video.j.xt.xt.j r4, com.bykv.vk.openvk.component.video.j.xt.ae.xt r5, com.bykv.vk.openvk.component.video.j.xt.vl.j r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            if (r4 == 0) goto L1c
            boolean r6 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r6 == 0) goto Ld
            java.lang.String r6 = "get header from db"
            com.bytedance.sdk.component.utils.vl.j(r0, r6)
        Ld:
            int r5 = r5.xt()
            java.lang.String r4 = com.bykv.vk.openvk.component.video.j.cw.j.j(r4, r5)
            java.nio.charset.Charset r5 = com.bykv.vk.openvk.component.video.j.cw.j.j
            byte[] r4 = r4.getBytes(r5)
            return r4
        L1c:
            r4 = -1
            java.lang.String r1 = "HEAD"
            r2 = 0
            com.bykv.vk.openvk.component.video.j.xt.up.j r4 = r3.j(r6, r2, r4, r1)
            if (r4 != 0) goto L28
            r4 = 0
            return r4
        L28:
            java.lang.String r1 = com.bykv.vk.openvk.component.video.j.cw.j.j(r4, r2, r2)     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L5e
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r6 = r3.xt     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r3.tl     // Catch: java.lang.Throwable -> L46
            com.bykv.vk.openvk.component.video.j.xt.g r2 = r3.g     // Catch: java.lang.Throwable -> L46
            com.bykv.vk.openvk.component.video.j.xt.g$j r2 = r2.cw     // Catch: java.lang.Throwable -> L46
            int r2 = r2.j     // Catch: java.lang.Throwable -> L46
            com.bykv.vk.openvk.component.video.j.xt.xt.j r6 = com.bykv.vk.openvk.component.video.j.cw.j.j(r4, r6, r1, r2)     // Catch: java.lang.Throwable -> L46
            boolean r1 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L48
            java.lang.String r1 = "get header from network"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r5 = move-exception
            goto L82
        L48:
            int r5 = r5.xt()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = com.bykv.vk.openvk.component.video.j.cw.j.j(r6, r5)     // Catch: java.lang.Throwable -> L46
            java.nio.charset.Charset r6 = com.bykv.vk.openvk.component.video.j.cw.j.j     // Catch: java.lang.Throwable -> L46
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L46
            java.io.InputStream r4 = r4.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r4)
            return r5
        L5e:
            com.bykv.vk.openvk.component.video.j.xt.cw.cw r5 = new com.bykv.vk.openvk.component.video.j.xt.cw.cw     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            r0.append(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = ", rawKey: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r3.ae     // Catch: java.lang.Throwable -> L46
            r0.append(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = ", url: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L46
            r0.append(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L46
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L46
            throw r5     // Catch: java.lang.Throwable -> L46
        L82:
            java.io.InputStream r4 = r4.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r4)
            throw r5
    }

    private void r(com.bykv.vk.openvk.component.video.j.xt.ae.xt r13, com.bykv.vk.openvk.component.video.j.xt.vl.j r14) throws com.bykv.vk.openvk.component.video.j.xt.cw.r, java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.cw.j, com.bykv.vk.openvk.component.video.j.xt.cw.xt {
            r12 = this;
            r12.g()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r13.xt()
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r12.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r3 = r3.cw
            int r3 = r3.up
            java.lang.String r4 = "GET"
            com.bykv.vk.openvk.component.video.j.xt.up.j r3 = r12.j(r14, r2, r3, r4)
            if (r3 != 0) goto L1a
            return
        L1a:
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r4 = com.bykv.vk.openvk.component.video.j.cw.j.j(r3, r6, r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = ", rawKey: "
            if (r4 != 0) goto L1d3
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r4 = r12.xt     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = r12.tl     // Catch: java.lang.Throwable -> L67
            int r9 = r12.m()     // Catch: java.lang.Throwable -> L67
            com.bykv.vk.openvk.component.video.j.xt.xt.j r4 = r4.query(r8, r9)     // Catch: java.lang.Throwable -> L67
            int r8 = com.bykv.vk.openvk.component.video.j.cw.j.j(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            if (r4 == 0) goto La2
            int r10 = r4.cw     // Catch: java.lang.Throwable -> L67
            if (r10 == r8) goto La2
            boolean r13 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L67
            if (r13 == 0) goto L6a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = "Content-Length not match, old: "
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L67
            int r2 = r4.cw     // Catch: java.lang.Throwable -> L67
            r13.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", "
            r13.append(r2)     // Catch: java.lang.Throwable -> L67
            r13.append(r8)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", key: "
            r13.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r12.tl     // Catch: java.lang.Throwable -> L67
            r13.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L67
            com.bytedance.sdk.component.utils.vl.r(r9, r13)     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r13 = move-exception
            goto L1f5
        L6a:
            com.bykv.vk.openvk.component.video.j.xt.cw.xt r13 = new com.bykv.vk.openvk.component.video.j.xt.cw.xt     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r9 = "Content-Length not match, old length: "
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L67
            int r9 = r4.cw     // Catch: java.lang.Throwable -> L67
            r2.append(r9)     // Catch: java.lang.Throwable -> L67
            java.lang.String r9 = ", new length: "
            r2.append(r9)     // Catch: java.lang.Throwable -> L67
            r2.append(r8)     // Catch: java.lang.Throwable -> L67
            r2.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r12.ae     // Catch: java.lang.Throwable -> L67
            r2.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = ", currentUrl: "
            r2.append(r7)     // Catch: java.lang.Throwable -> L67
            r2.append(r14)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = ", previousInfo: "
            r2.append(r14)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = r4.up     // Catch: java.lang.Throwable -> L67
            r2.append(r14)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L67
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L67
            throw r13     // Catch: java.lang.Throwable -> L67
        La2:
            boolean r14 = r13.j()     // Catch: java.lang.Throwable -> L67
            if (r14 != 0) goto Lb9
            java.lang.String r14 = com.bykv.vk.openvk.component.video.j.cw.j.j(r3, r2)     // Catch: java.lang.Throwable -> L67
            r12.up()     // Catch: java.lang.Throwable -> L67
            java.nio.charset.Charset r2 = com.bykv.vk.openvk.component.video.j.cw.j.j     // Catch: java.lang.Throwable -> L67
            byte[] r14 = r14.getBytes(r2)     // Catch: java.lang.Throwable -> L67
            int r2 = r14.length     // Catch: java.lang.Throwable -> L67
            r13.j(r14, r6, r2)     // Catch: java.lang.Throwable -> L67
        Lb9:
            r12.up()     // Catch: java.lang.Throwable -> L67
            com.bykv.vk.openvk.component.video.j.xt.j.j r14 = r12.j     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r12.tl     // Catch: java.lang.Throwable -> L67
            java.io.File r14 = r14.r(r2)     // Catch: java.lang.Throwable -> L67
            boolean r2 = r12.i     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = ", from: "
            if (r2 == 0) goto L126
            if (r14 == 0) goto L126
            long r7 = r14.length()     // Catch: java.lang.Throwable -> L67
            int r2 = r13.xt()     // Catch: java.lang.Throwable -> L67
            long r10 = (long) r2     // Catch: java.lang.Throwable -> L67
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 < 0) goto L126
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r2 = r12.xt     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r12.tl     // Catch: java.lang.Throwable -> L67
            com.bykv.vk.openvk.component.video.j.xt.g r8 = r12.g     // Catch: java.lang.Throwable -> L67
            com.bykv.vk.openvk.component.video.j.xt.g$j r8 = r8.cw     // Catch: java.lang.Throwable -> L67
            int r8 = r8.j     // Catch: java.lang.Throwable -> L67
            com.bykv.vk.openvk.component.video.j.cw.j.j(r3, r2, r7, r8)     // Catch: java.lang.Throwable -> L67
            com.bykv.vk.openvk.component.video.j.xt.tl r2 = new com.bykv.vk.openvk.component.video.j.xt.tl     // Catch: java.lang.Throwable -> L67 com.bykv.vk.openvk.component.video.j.xt.tl.j -> Lfc
            java.lang.String r7 = "rwd"
            r2.<init>(r14, r7)     // Catch: java.lang.Throwable -> L67 com.bykv.vk.openvk.component.video.j.xt.tl.j -> Lfc
            int r7 = r13.xt()     // Catch: java.lang.Throwable -> Lf6 com.bykv.vk.openvk.component.video.j.xt.tl.j -> Lfa
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Lf6 com.bykv.vk.openvk.component.video.j.xt.tl.j -> Lfa
            r2.j(r7)     // Catch: java.lang.Throwable -> Lf6 com.bykv.vk.openvk.component.video.j.xt.tl.j -> Lfa
            goto L102
        Lf6:
            r13 = move-exception
            r5 = r2
            goto L1f5
        Lfa:
            r7 = move-exception
            goto Lfe
        Lfc:
            r7 = move-exception
            r2 = r5
        Lfe:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> Lf6
            r2 = r5
        L102:
            boolean r7 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> Lf6
            if (r7 == 0) goto L14a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r8 = "can write to cache file in network task, cache file size: "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lf6
            long r10 = r14.length()     // Catch: java.lang.Throwable -> Lf6
            r7.append(r10)     // Catch: java.lang.Throwable -> Lf6
            r7.append(r4)     // Catch: java.lang.Throwable -> Lf6
            int r14 = r13.xt()     // Catch: java.lang.Throwable -> Lf6
            r7.append(r14)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r14 = r7.toString()     // Catch: java.lang.Throwable -> Lf6
            com.bytedance.sdk.component.utils.vl.j(r9, r14)     // Catch: java.lang.Throwable -> Lf6
            goto L14a
        L126:
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L149
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = "can't write to cache file in network task, cache file size: "
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L67
            long r7 = r14.length()     // Catch: java.lang.Throwable -> L67
            r2.append(r7)     // Catch: java.lang.Throwable -> L67
            r2.append(r4)     // Catch: java.lang.Throwable -> L67
            int r14 = r13.xt()     // Catch: java.lang.Throwable -> L67
            r2.append(r14)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L67
            com.bytedance.sdk.component.utils.vl.xt(r9, r14)     // Catch: java.lang.Throwable -> L67
        L149:
            r2 = r5
        L14a:
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r14 = r12.xt     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r4 = r12.tl     // Catch: java.lang.Throwable -> Lf6
            int r7 = r12.m()     // Catch: java.lang.Throwable -> Lf6
            com.bykv.vk.openvk.component.video.j.xt.xt.j r14 = r14.query(r4, r7)     // Catch: java.lang.Throwable -> Lf6
            if (r14 != 0) goto L15a
            r14 = 0
            goto L15c
        L15a:
            int r14 = r14.cw     // Catch: java.lang.Throwable -> Lf6
        L15c:
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> Lf6
            java.io.InputStream r7 = r3.r()     // Catch: java.lang.Throwable -> Lf6
            r8 = 0
        L165:
            int r10 = r7.read(r4)     // Catch: java.lang.Throwable -> L19d
            if (r10 < 0) goto L1ab
            r12.up()     // Catch: java.lang.Throwable -> L19d
            if (r10 <= 0) goto L1a7
            r13.xt(r4, r6, r10)     // Catch: java.lang.Throwable -> L19d
            int r8 = r8 + r10
            if (r2 == 0) goto L1a0
            r2.j(r4, r6, r10)     // Catch: java.lang.Throwable -> L17a
            goto L1a0
        L17a:
            r10 = move-exception
            r2.j()     // Catch: java.lang.Throwable -> L19d
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L198
            if (r2 == 0) goto L19b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L198
            java.lang.String r11 = "append to cache file error in network task!!! "
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L198
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch: java.lang.Throwable -> L198
            r2.append(r10)     // Catch: java.lang.Throwable -> L198
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L198
            com.bytedance.sdk.component.utils.vl.r(r9, r2)     // Catch: java.lang.Throwable -> L198
            goto L19b
        L198:
            r13 = move-exception
        L199:
            r6 = r8
            goto L1f5
        L19b:
            r2 = r5
            goto L1a0
        L19d:
            r13 = move-exception
            r5 = r2
            goto L199
        L1a0:
            int r10 = r13.xt()     // Catch: java.lang.Throwable -> L19d
            r12.j(r14, r10)     // Catch: java.lang.Throwable -> L19d
        L1a7:
            r12.up()     // Catch: java.lang.Throwable -> L19d
            goto L165
        L1ab:
            boolean r13 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L19d
            if (r13 == 0) goto L1b4
            java.lang.String r13 = "read from net complete!"
            com.bytedance.sdk.component.utils.vl.j(r9, r13)     // Catch: java.lang.Throwable -> L19d
        L1b4:
            r12.cw()     // Catch: java.lang.Throwable -> L19d
            java.io.InputStream r13 = r3.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r13)
            if (r2 == 0) goto L1c3
            r2.j()
        L1c3:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.cw
            r13.addAndGet(r8)
            java.util.concurrent.atomic.AtomicLong r13 = r12.f1712r
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r13.addAndGet(r2)
            return
        L1d3:
            com.bykv.vk.openvk.component.video.j.xt.cw.cw r13 = new com.bykv.vk.openvk.component.video.j.xt.cw.cw     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Throwable -> L67
            r2.append(r4)     // Catch: java.lang.Throwable -> L67
            r2.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r12.ae     // Catch: java.lang.Throwable -> L67
            r2.append(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = ", url: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L67
            r2.append(r14)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L67
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L67
            throw r13     // Catch: java.lang.Throwable -> L67
        L1f5:
            java.io.InputStream r14 = r3.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r14)
            if (r5 == 0) goto L201
            r5.j()
        L201:
            java.util.concurrent.atomic.AtomicInteger r14 = r12.cw
            r14.addAndGet(r6)
            java.util.concurrent.atomic.AtomicLong r14 = r12.f1712r
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r14.addAndGet(r2)
            throw r13
    }

    private com.bykv.vk.openvk.component.video.j.xt.ae.xt tl() {
            r5 = this;
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            r1 = 0
            java.net.Socket r2 = r5.jy     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.io.InputStream r2 = r2.getInputStream()     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r2 = com.bykv.vk.openvk.component.video.j.xt.g.j(r2)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r5.g = r2     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.net.Socket r2 = r5.jy     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g$j r3 = r3.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            int r3 = r3.j     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r4 = 1
            if (r3 != r4) goto L25
            com.bykv.vk.openvk.component.video.j.xt.j.xt r3 = com.bykv.vk.openvk.component.video.j.xt.up.j     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            goto L27
        L21:
            r2 = move-exception
            goto L7f
        L23:
            r2 = move-exception
            goto L97
        L25:
            com.bykv.vk.openvk.component.video.j.xt.j.cw r3 = com.bykv.vk.openvk.component.video.j.xt.up.xt     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
        L27:
            if (r3 != 0) goto L33
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L32
            java.lang.String r2 = "cache is null"
            com.bytedance.sdk.component.utils.vl.r(r0, r2)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
        L32:
            return r1
        L33:
            r5.j = r3     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g$j r3 = r3.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.lang.String r3 = r3.xt     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r5.ae = r3     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g$j r3 = r3.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.lang.String r3 = r3.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r5.tl = r3     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.vl r3 = new com.bykv.vk.openvk.component.video.j.xt.vl     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r4 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g$j r4 = r4.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.util.List<java.lang.String> r4 = r4.ae     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r3.<init>(r4)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r5.oq = r3     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r3 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r3 = r3.xt     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r5.f1711m = r3     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            boolean r3 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            if (r3 == 0) goto L73
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.lang.String r4 = "request from MediaPlayer:    "
            r3.<init>(r4)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r4 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.lang.String r4 = r4.toString()     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r3.append(r4)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            java.lang.String r3 = r3.toString()     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bytedance.sdk.component.utils.vl.j(r0, r3)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
        L73:
            com.bykv.vk.openvk.component.video.j.xt.ae$xt r3 = new com.bykv.vk.openvk.component.video.j.xt.ae$xt     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g r4 = r5.g     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            com.bykv.vk.openvk.component.video.j.xt.g$j r4 = r4.cw     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            int r4 = r4.f1710r     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            r3.<init>(r2, r4)     // Catch: com.bykv.vk.openvk.component.video.j.xt.g.r -> L21 java.io.IOException -> L23
            return r3
        L7f:
            java.net.Socket r3 = r5.jy
            com.bykv.vk.openvk.component.video.j.cw.j.j(r3)
            boolean r3 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r3 == 0) goto L8f
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            com.bytedance.sdk.component.utils.vl.r(r0, r2)
        L8f:
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r5.j
            if (r0 == 0) goto Lae
            r5.ae()
            goto Lae
        L97:
            java.net.Socket r3 = r5.jy
            com.bykv.vk.openvk.component.video.j.cw.j.j(r3)
            boolean r3 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r3 == 0) goto La7
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            com.bytedance.sdk.component.utils.vl.r(r0, r2)
        La7:
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r5.j
            if (r0 == 0) goto Lae
            r5.ae()
        Lae:
            return r1
    }

    private void xt(com.bykv.vk.openvk.component.video.j.xt.ae.xt r4, com.bykv.vk.openvk.component.video.j.xt.vl.j r5) throws java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.cw.r {
            r3 = this;
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = r3.xt
            java.lang.String r1 = r3.tl
            com.bykv.vk.openvk.component.video.j.xt.g r2 = r3.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r2 = r2.cw
            int r2 = r2.j
            com.bykv.vk.openvk.component.video.j.xt.xt.j r0 = r0.query(r1, r2)
            byte[] r5 = r3.j(r0, r4, r5)
            if (r5 != 0) goto L15
            return
        L15:
            r0 = 0
            int r1 = r5.length
            r4.j(r5, r0, r1)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.j
    public void j() {
            r0 = this;
            super.j()
            r0.g()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            com.bykv.vk.openvk.component.video.j.xt.ae$xt r1 = r7.tl()
            if (r1 != 0) goto La
            goto L87
        La:
            com.bykv.vk.openvk.component.video.j.xt.ae$cw r2 = r7.ws
            if (r2 == 0) goto L11
            r2.j(r7)
        L11:
            com.bykv.vk.openvk.component.video.j.xt.j.j r2 = r7.j
            java.lang.String r3 = r7.tl
            r2.j(r3)
            int r2 = com.bykv.vk.openvk.component.video.j.xt.up.tl
            if (r2 == 0) goto L4a
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r2 = r7.xt
            java.lang.String r3 = r7.tl
            com.bykv.vk.openvk.component.video.j.xt.g r4 = r7.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r4 = r4.cw
            int r4 = r4.j
            com.bykv.vk.openvk.component.video.j.xt.xt.j r2 = r2.query(r3, r4)
            if (r2 == 0) goto L3f
            com.bykv.vk.openvk.component.video.j.xt.j.j r3 = r7.j
            java.lang.String r4 = r7.tl
            java.io.File r3 = r3.cw(r4)
            long r3 = r3.length()
            int r2 = r2.cw
            long r5 = (long) r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L4a
        L3f:
            com.bykv.vk.openvk.component.video.j.xt.r r2 = r7.az
            boolean r3 = r7.ae()
            java.lang.String r4 = r7.tl
            r2.j(r3, r4)
        L4a:
            r7.j(r1)     // Catch: java.lang.Throwable -> L4e com.bykv.vk.openvk.component.video.j.xt.cw.j -> L5b
            goto L67
        L4e:
            r1 = move-exception
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto L67
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            goto L67
        L5b:
            r1 = move-exception
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto L67
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
        L67:
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r7.j
            java.lang.String r1 = r7.tl
            r0.xt(r1)
            com.bykv.vk.openvk.component.video.j.xt.r r0 = r7.az
            boolean r1 = r7.ae()
            r2 = 0
            r0.j(r1, r2)
            r7.j()
            java.net.Socket r0 = r7.jy
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            com.bykv.vk.openvk.component.video.j.xt.ae$cw r0 = r7.ws
            if (r0 == 0) goto L87
            r0.xt(r7)
        L87:
            return
    }
}
