package com.bykv.vk.openvk.component.video.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j implements com.bykv.vk.openvk.component.video.api.j.xt {
    private java.lang.String ae;
    private java.lang.String cw;
    private java.lang.String g;
    private java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f1689m;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f1690r;
    private java.lang.String tl;
    private java.lang.String up;
    private java.lang.String xt;


    public j() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "video_reward_full"
            r1.j = r0
            java.lang.String r0 = "video_brand"
            r1.xt = r0
            java.lang.String r0 = "video_splash"
            r1.cw = r0
            java.lang.String r0 = "video_default"
            r1.f1690r = r0
            r0 = 0
            r1.up = r0
            r1.f1689m = r0
            r1.ae = r0
            r1.tl = r0
            r1.g = r0
            return
    }

    private java.util.Set<java.lang.String> ae() {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j> r1 = com.bykv.vk.openvk.component.video.j.j.j.j
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            com.bykv.vk.openvk.component.video.j.j.j r2 = (com.bykv.vk.openvk.component.video.j.j.j) r2
            if (r2 == 0) goto Lf
            com.bykv.vk.openvk.component.video.api.cw.r r3 = r2.j()
            if (r3 == 0) goto Lf
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r2.j()
            java.lang.String r3 = r2.up()
            java.lang.String r4 = r2.i()
            java.io.File r3 = com.bykv.vk.openvk.component.video.j.up.cw.xt(r3, r4)
            java.lang.String r3 = r3.getAbsolutePath()
            r0.add(r3)
            java.lang.String r3 = r2.up()
            java.lang.String r2 = r2.i()
            java.io.File r2 = com.bykv.vk.openvk.component.video.j.up.cw.cw(r3, r2)
            java.lang.String r2 = r2.getAbsolutePath()
            r0.add(r2)
            goto Lf
        L4e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.xt.xt> r1 = com.bykv.vk.openvk.component.video.j.j.xt.cw.j
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            com.bykv.vk.openvk.component.video.j.j.xt.xt r2 = (com.bykv.vk.openvk.component.video.j.j.xt.xt) r2
            if (r2 == 0) goto L58
            com.bykv.vk.openvk.component.video.api.cw.r r3 = r2.j()
            if (r3 == 0) goto L58
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r2.j()
            java.lang.String r3 = r2.up()
            java.lang.String r4 = r2.i()
            java.io.File r3 = com.bykv.vk.openvk.component.video.j.up.cw.xt(r3, r4)
            java.lang.String r3 = r3.getAbsolutePath()
            r0.add(r3)
            java.lang.String r3 = r2.up()
            java.lang.String r2 = r2.i()
            java.io.File r2 = com.bykv.vk.openvk.component.video.j.up.cw.cw(r3, r2)
            java.lang.String r2 = r2.getAbsolutePath()
            r0.add(r2)
            goto L58
        L97:
            return r0
    }

    private static void j(java.io.File[] r1, int r2, java.util.Set<java.lang.String> r3) {
            if (r2 >= 0) goto L3
            goto L3c
        L3:
            if (r1 == 0) goto L3c
            int r0 = r1.length     // Catch: java.lang.Throwable -> L38
            if (r0 <= r2) goto L3c
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L38
            com.bykv.vk.openvk.component.video.j.j.j.j$1 r0 = new com.bykv.vk.openvk.component.video.j.j.j.j$1     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.Collections.sort(r1, r0)     // Catch: java.lang.Throwable -> L38
        L14:
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L38
            if (r2 >= r0) goto L3c
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L38
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L35
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L38
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L35
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L38
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L38
            r0.delete()     // Catch: java.lang.Throwable -> L38
        L35:
            int r2 = r2 + 1
            goto L14
        L38:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L3c:
            return
    }

    private java.util.List<com.bykv.vk.openvk.component.video.api.j.j> m() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r4.j()
            r1.<init>(r2)
            java.io.File[] r1 = r1.listFiles()
            com.bykv.vk.openvk.component.video.api.j.j r2 = new com.bykv.vk.openvk.component.video.api.j.j
            int r3 = com.bykv.vk.openvk.component.video.j.j.cw()
            r2.<init>(r1, r3)
            r0.add(r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r4.cw()
            r1.<init>(r2)
            java.io.File[] r1 = r1.listFiles()
            com.bykv.vk.openvk.component.video.api.j.j r2 = new com.bykv.vk.openvk.component.video.api.j.j
            int r3 = com.bykv.vk.openvk.component.video.j.j.xt()
            r2.<init>(r1, r3)
            r0.add(r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r4.xt()
            r1.<init>(r2)
            java.io.File[] r1 = r1.listFiles()
            com.bykv.vk.openvk.component.video.api.j.j r2 = new com.bykv.vk.openvk.component.video.api.j.j
            int r3 = com.bykv.vk.openvk.component.video.j.j.r()
            r2.<init>(r1, r3)
            r0.add(r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r4.r()
            r1.<init>(r2)
            java.io.File[] r1 = r1.listFiles()
            com.bykv.vk.openvk.component.video.api.j.j r2 = new com.bykv.vk.openvk.component.video.api.j.j
            int r3 = com.bykv.vk.openvk.component.video.j.j.up()
            r2.<init>(r1, r3)
            r0.add(r2)
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public java.lang.String cw() {
            r2 = this;
            java.lang.String r0 = r2.tl
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.up
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r2.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.tl = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.tl
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2e
            r0.mkdirs()
        L2e:
            java.lang.String r0 = r2.tl
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public java.lang.String j() {
            r2 = this;
            java.lang.String r0 = r2.f1689m
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.up
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r2.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.f1689m = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.f1689m
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2e
            r0.mkdirs()
        L2e:
            java.lang.String r0 = r2.f1689m
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public void j(java.lang.String r1) {
            r0 = this;
            r0.up = r1
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public boolean j(com.bykv.vk.openvk.component.video.api.cw.r r3) {
            r2 = this;
            java.lang.String r0 = r3.up()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = r3.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            goto L27
        L15:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.up()
            java.lang.String r3 = r3.i()
            r0.<init>(r1, r3)
            boolean r3 = r0.exists()
            return r3
        L27:
            r3 = 0
            return r3
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public java.lang.String r() {
            r2 = this;
            java.lang.String r0 = r2.g
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.up
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r2.f1690r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.g = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.g
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2e
            r0.mkdirs()
        L2e:
            java.lang.String r0 = r2.g
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public synchronized void up() {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "Exec clear video cache "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r5.up     // Catch: java.lang.Throwable -> L3a
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0)     // Catch: java.lang.Throwable -> L3a
            java.util.List r0 = r5.m()     // Catch: java.lang.Throwable -> L3a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3a
            r2 = 23
            if (r1 < r2) goto L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3a
            r1 = 0
        L1a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3a
            com.bykv.vk.openvk.component.video.api.j.j r2 = (com.bykv.vk.openvk.component.video.api.j.j) r2     // Catch: java.lang.Throwable -> L3a
            java.io.File[] r3 = r2.j()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L1a
            int r3 = r3.length     // Catch: java.lang.Throwable -> L3a
            int r4 = r2.xt()     // Catch: java.lang.Throwable -> L3a
            if (r3 < r4) goto L1a
            if (r1 != 0) goto L3c
            java.util.Set r1 = r5.ae()     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r0 = move-exception
            goto L4f
        L3c:
            int r3 = r2.xt()     // Catch: java.lang.Throwable -> L3a
            int r3 = r3 + (-2)
            if (r3 >= 0) goto L45
            r3 = 0
        L45:
            java.io.File[] r2 = r2.j()     // Catch: java.lang.Throwable -> L3a
            j(r2, r3, r1)     // Catch: java.lang.Throwable -> L3a
            goto L1a
        L4d:
            monitor-exit(r5)
            return
        L4f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3a
            throw r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public long xt(com.bykv.vk.openvk.component.video.api.cw.r r3) {
            r2 = this;
            java.lang.String r0 = r3.up()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = r3.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            goto L22
        L15:
            java.lang.String r0 = r3.up()
            java.lang.String r3 = r3.i()
            long r0 = com.bykv.vk.openvk.component.video.j.up.cw.j(r0, r3)
            return r0
        L22:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j.xt
    public java.lang.String xt() {
            r2 = this;
            java.lang.String r0 = r2.ae
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.up
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r2.xt
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.ae = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.ae
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2e
            r0.mkdirs()
        L2e:
            java.lang.String r0 = r2.ae
            return r0
    }
}
