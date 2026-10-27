package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class xt extends com.bykv.vk.openvk.component.video.j.xt.j {
    private final com.bykv.vk.openvk.component.video.j.xt.xt.InterfaceC0181xt av;
    private final int az;
    private volatile com.bykv.vk.openvk.component.video.j.xt.tl.j i;
    final java.lang.Object jy;

    /* renamed from: w, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.j.xt.cw.xt f1731w;
    final java.lang.Object ws;

    static final class j {
        int ae;
        com.bykv.vk.openvk.component.video.j.xt.vl cw;
        com.bykv.vk.openvk.component.video.j.xt.xt.InterfaceC0181xt g;
        java.lang.String j;

        /* renamed from: m, reason: collision with root package name */
        java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> f1734m;
        java.lang.Object oq;

        /* renamed from: r, reason: collision with root package name */
        com.bykv.vk.openvk.component.video.j.xt.j.j f1735r;
        com.bykv.vk.openvk.component.video.j.xt.g tl;
        com.bykv.vk.openvk.component.video.j.xt.xt.cw up;
        java.lang.String xt;

        j() {
                r0 = this;
                r0.<init>()
                return
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(int r1) {
                r0 = this;
                r0.ae = r1
                return r0
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(com.bykv.vk.openvk.component.video.j.xt.g r1) {
                r0 = this;
                r0.tl = r1
                return r0
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(com.bykv.vk.openvk.component.video.j.xt.j.j r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.f1735r = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "cache == null"
                r2.<init>(r0)
                throw r2
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(com.bykv.vk.openvk.component.video.j.xt.vl r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.cw = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "urls is empty"
                r2.<init>(r0)
                throw r2
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(com.bykv.vk.openvk.component.video.j.xt.xt.InterfaceC0181xt r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(com.bykv.vk.openvk.component.video.j.xt.xt.cw r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.up = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "db == null"
                r2.<init>(r0)
                throw r2
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(java.lang.Object r1) {
                r0 = this;
                r0.oq = r1
                return r0
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L9
                r1.j = r2
                return r1
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "rawKey == null"
                r2.<init>(r0)
                throw r2
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j j(java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> r1) {
                r0 = this;
                r0.f1734m = r1
                return r0
        }

        com.bykv.vk.openvk.component.video.j.xt.xt j() {
                r1 = this;
                com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r1.f1735r
                if (r0 == 0) goto L22
                com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = r1.up
                if (r0 == 0) goto L22
                java.lang.String r0 = r1.j
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L22
                java.lang.String r0 = r1.xt
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L22
                com.bykv.vk.openvk.component.video.j.xt.vl r0 = r1.cw
                if (r0 == 0) goto L22
                com.bykv.vk.openvk.component.video.j.xt.xt r0 = new com.bykv.vk.openvk.component.video.j.xt.xt
                r0.<init>(r1)
                return r0
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        com.bykv.vk.openvk.component.video.j.xt.xt.j xt(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L9
                r1.xt = r2
                return r1
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "key == null"
                r2.<init>(r0)
                throw r2
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.j.xt.xt$xt, reason: collision with other inner class name */
    public interface InterfaceC0181xt {
        void j(com.bykv.vk.openvk.component.video.j.xt.xt r1);
    }

    xt(com.bykv.vk.openvk.component.video.j.xt.xt.j r3) {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r3.f1735r
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r1 = r3.up
            r2.<init>(r0, r1)
            int r0 = r3.ae
            r2.az = r0
            com.bykv.vk.openvk.component.video.j.xt.xt$xt r0 = r3.g
            r2.av = r0
            r2.jy = r2
            java.lang.String r0 = r3.j
            r2.ae = r0
            java.lang.String r0 = r3.xt
            r2.tl = r0
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r0 = r3.f1734m
            r2.f1711m = r0
            com.bykv.vk.openvk.component.video.j.xt.vl r0 = r3.cw
            r2.oq = r0
            com.bykv.vk.openvk.component.video.j.xt.g r0 = r3.tl
            r2.g = r0
            java.lang.Object r3 = r3.oq
            r2.ws = r3
            return
    }

    private void j(com.bykv.vk.openvk.component.video.j.xt.vl.j r13) throws java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.tl.j, com.bykv.vk.openvk.component.video.j.xt.cw.j, com.bykv.vk.openvk.component.video.j.xt.cw.xt {
            r12 = this;
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r12.j
            java.lang.String r1 = r12.tl
            java.io.File r0 = r0.cw(r1)
            long r1 = r0.length()
            int r3 = r12.az
            if (r3 <= 0) goto L41
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L41
            boolean r13 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r13 == 0) goto L1b4
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "no necessary to download for "
            r0.<init>(r3)
            java.lang.String r3 = r12.tl
            r0.append(r3)
            java.lang.String r3 = ", cache file size: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", max: "
            r0.append(r1)
            int r1 = r12.az
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r13, r0)
            return
        L41:
            int r3 = r12.m()
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r4 = r12.xt
            java.lang.String r5 = r12.tl
            com.bykv.vk.openvk.component.video.j.xt.xt.j r4 = r4.query(r5, r3)
            if (r4 == 0) goto L70
            int r5 = r4.cw
            long r5 = (long) r5
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L70
            boolean r13 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r13 == 0) goto L1b4
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "file download complete, key: "
            r0.<init>(r1)
            java.lang.String r1 = r12.tl
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r13, r0)
            return
        L70:
            r12.up()
            int r5 = (int) r1
            int r6 = r12.az
            java.lang.String r7 = "GET"
            com.bykv.vk.openvk.component.video.j.xt.up.j r6 = r12.j(r13, r5, r6, r7)
            if (r6 != 0) goto L80
            goto L1b4
        L80:
            r7 = 1
            r8 = 0
            r12.up()     // Catch: java.lang.Throwable -> L90
            com.bykv.vk.openvk.component.video.j.xt.g r9 = r12.g     // Catch: java.lang.Throwable -> L90
            r10 = 0
            if (r9 != 0) goto L93
            boolean r9 = com.bykv.vk.openvk.component.video.j.xt.up.up     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L93
            r9 = 1
            goto L94
        L90:
            r13 = move-exception
            goto L1fb
        L93:
            r9 = 0
        L94:
            java.lang.String r9 = com.bykv.vk.openvk.component.video.j.cw.j.j(r6, r9, r7)     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L1d7
            int r9 = com.bykv.vk.openvk.component.video.j.cw.j.j(r6)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L109
            int r11 = r4.cw     // Catch: java.lang.Throwable -> L90
            if (r11 == r9) goto L109
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lcf
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Content-Length not match, old: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L90
            int r2 = r4.cw     // Catch: java.lang.Throwable -> L90
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r12.tl     // Catch: java.lang.Throwable -> L90
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            com.bytedance.sdk.component.utils.vl.r(r0, r1)     // Catch: java.lang.Throwable -> L90
        Lcf:
            com.bykv.vk.openvk.component.video.j.xt.cw.xt r0 = new com.bykv.vk.openvk.component.video.j.xt.cw.xt     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Content-Length not match, old length: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L90
            int r2 = r4.cw     // Catch: java.lang.Throwable -> L90
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", new length: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r12.ae     // Catch: java.lang.Throwable -> L90
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", currentUrl: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = ", previousInfo: "
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = r4.up     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L109:
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r13 = r12.xt     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r12.tl     // Catch: java.lang.Throwable -> L90
            com.bykv.vk.openvk.component.video.j.cw.j.j(r6, r13, r4, r3)     // Catch: java.lang.Throwable -> L90
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r13 = r12.xt     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r12.tl     // Catch: java.lang.Throwable -> L90
            com.bykv.vk.openvk.component.video.j.xt.xt.j r13 = r13.query(r4, r3)     // Catch: java.lang.Throwable -> L90
            if (r13 != 0) goto L11c
            r13 = 0
            goto L11e
        L11c:
            int r13 = r13.cw     // Catch: java.lang.Throwable -> L90
        L11e:
            java.io.InputStream r3 = r6.r()     // Catch: java.lang.Throwable -> L90
            com.bykv.vk.openvk.component.video.j.xt.tl r4 = new com.bykv.vk.openvk.component.video.j.xt.tl     // Catch: java.lang.Throwable -> L90
            boolean r9 = com.bykv.vk.openvk.component.video.j.xt.up.f1727r     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L12b
            java.lang.String r9 = "rwd"
            goto L12d
        L12b:
            java.lang.String r9 = "rw"
        L12d:
            r4.<init>(r0, r9)     // Catch: java.lang.Throwable -> L90
            r4.j(r1)     // Catch: java.lang.Throwable -> L147
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L147
            if (r0 == 0) goto L14b
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.String r8 = "preload start from: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L147
            java.lang.String r1 = r8.concat(r1)     // Catch: java.lang.Throwable -> L147
            com.bytedance.sdk.component.utils.vl.j(r0, r1)     // Catch: java.lang.Throwable -> L147
            goto L14b
        L147:
            r13 = move-exception
            r8 = r4
            goto L1fb
        L14b:
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L147
        L14f:
            int r1 = r3.read(r0)     // Catch: java.lang.Throwable -> L147
            if (r1 < 0) goto L1b9
            r12.up()     // Catch: java.lang.Throwable -> L147
            if (r1 <= 0) goto L177
            r4.j(r0, r10, r1)     // Catch: java.lang.Throwable -> L147
            int r5 = r5 + r1
            com.bykv.vk.openvk.component.video.j.xt.g r2 = r12.g     // Catch: java.lang.Throwable -> L147
            if (r2 == 0) goto L16f
            java.lang.Object r2 = r12.jy     // Catch: java.lang.Throwable -> L147
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L147
            java.lang.Object r8 = r12.jy     // Catch: java.lang.Throwable -> L16c
            r8.notifyAll()     // Catch: java.lang.Throwable -> L16c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16c
            goto L16f
        L16c:
            r13 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16c
            throw r13     // Catch: java.lang.Throwable -> L147
        L16f:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.cw     // Catch: java.lang.Throwable -> L147
            r2.addAndGet(r1)     // Catch: java.lang.Throwable -> L147
            r12.j(r13, r5)     // Catch: java.lang.Throwable -> L147
        L177:
            int r1 = r12.az     // Catch: java.lang.Throwable -> L147
            if (r1 <= 0) goto L1b5
            if (r5 < r1) goto L1b5
            boolean r13 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L147
            if (r13 == 0) goto L19e
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L147
            java.lang.String r2 = "download, more data received, currentCacheFileSize: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L147
            r1.append(r5)     // Catch: java.lang.Throwable -> L147
            java.lang.String r2 = ", max: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L147
            int r2 = r12.az     // Catch: java.lang.Throwable -> L147
            r1.append(r2)     // Catch: java.lang.Throwable -> L147
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L147
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)     // Catch: java.lang.Throwable -> L147
        L19e:
            java.io.InputStream r0 = r6.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            r4.j()
            r12.j()
            if (r13 == 0) goto L1b4
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "cancel call"
            com.bytedance.sdk.component.utils.vl.xt(r13, r0)
        L1b4:
            return
        L1b5:
            r12.up()     // Catch: java.lang.Throwable -> L147
            goto L14f
        L1b9:
            r12.cw()     // Catch: java.lang.Throwable -> L1c8
            boolean r13 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L1c8
            if (r13 == 0) goto L1cc
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "download succeed, no need to cancel call"
            com.bytedance.sdk.component.utils.vl.j(r13, r0)     // Catch: java.lang.Throwable -> L1c8
            goto L1cc
        L1c8:
            r13 = move-exception
            r8 = r4
            r7 = 0
            goto L1fb
        L1cc:
            java.io.InputStream r13 = r6.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r13)
            r4.j()
            return
        L1d7:
            com.bykv.vk.openvk.component.video.j.xt.cw.cw r0 = new com.bykv.vk.openvk.component.video.j.xt.cw.cw     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r1.append(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r12.ae     // Catch: java.lang.Throwable -> L90
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = ", url: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L1fb:
            java.io.InputStream r0 = r6.r()
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            if (r8 == 0) goto L207
            r8.j()
        L207:
            if (r7 == 0) goto L217
            r12.j()
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r0 == 0) goto L217
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.String r1 = "cancel call"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
        L217:
            throw r13
    }

    private boolean oq() throws com.bykv.vk.openvk.component.video.j.xt.cw.j {
            r2 = this;
        L0:
            com.bykv.vk.openvk.component.video.j.xt.vl r0 = r2.oq
            boolean r0 = r0.j()
            r1 = 0
            if (r0 == 0) goto L3c
            r2.up()
            com.bykv.vk.openvk.component.video.j.xt.vl r0 = r2.oq
            com.bykv.vk.openvk.component.video.j.xt.vl$j r0 = r0.xt()
            r2.j(r0)     // Catch: java.lang.Throwable -> L17 com.bykv.vk.openvk.component.video.j.xt.cw.xt -> L18 com.bykv.vk.openvk.component.video.j.xt.tl.j -> L1c java.io.IOException -> L23 com.bykv.vk.openvk.component.video.j.xt.cw.cw -> L35
            r0 = 1
            return r0
        L17:
            return r1
        L18:
            r0 = move-exception
            r2.f1731w = r0
            return r1
        L1c:
            r0 = move-exception
            r2.i = r0
            r2.ae()
            return r1
        L23:
            r1 = move-exception
            boolean r1 = r1 instanceof java.net.SocketTimeoutException
            if (r1 == 0) goto L2b
            r0.xt()
        L2b:
            boolean r0 = r2.xt()
            if (r0 != 0) goto L0
            r2.ae()
            goto L0
        L35:
            r0.j()
            r2.ae()
            goto L0
        L3c:
            return r1
    }

    com.bykv.vk.openvk.component.video.j.xt.cw.xt g() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.cw.xt r0 = r1.f1731w
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r5.j
            java.lang.String r1 = r5.tl
            r0.j(r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.oq()     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
        L10:
            java.util.concurrent.atomic.AtomicLong r2 = r5.f1712r
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r0
            r2.set(r3)
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r5.j
            java.lang.String r1 = r5.tl
            r0.xt(r1)
            com.bykv.vk.openvk.component.video.j.xt.xt$xt r0 = r5.av
            if (r0 == 0) goto L28
            r0.j(r5)
        L28:
            return
    }

    com.bykv.vk.openvk.component.video.j.xt.tl.j tl() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.tl$j r0 = r1.i
            return r0
    }
}
