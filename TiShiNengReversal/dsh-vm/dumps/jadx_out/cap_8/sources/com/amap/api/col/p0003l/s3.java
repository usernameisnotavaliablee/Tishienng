package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s3 implements android.view.View.OnClickListener {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f3949b;

    /* renamed from: c, reason: collision with root package name */
    private android.widget.TextView f3950c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.TextView f3951d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.ImageView f3952e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.TextView f3953f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapManager f3954g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapCity f3955h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3956i;

    /* renamed from: j, reason: collision with root package name */
    private android.os.Handler f3957j;

    /* renamed from: k, reason: collision with root package name */
    private android.view.View f3958k;
    private com.amap.api.maps.offlinemap.DownloadProgressView l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.s3 a;

        a(com.amap.api.col.p0003l.s3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r3) {
                r2 = this;
                super.handleMessage(r3)
                int r0 = r3.arg1
                int r3 = r3.arg2
                com.amap.api.col.3l.s3 r1 = r2.a     // Catch: java.lang.Exception -> Lc
                com.amap.api.col.p0003l.s3.d(r1, r0, r3)     // Catch: java.lang.Exception -> Lc
            Lc:
                return
        }
    }

    public s3(android.content.Context r2, com.amap.api.maps.offlinemap.OfflineMapManager r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f3956i = r0
            com.amap.api.col.3l.s3$a r0 = new com.amap.api.col.3l.s3$a
            r0.<init>(r1)
            r1.f3957j = r0
            r1.f3949b = r2
            r1.f()
            r1.f3954g = r3
            return
    }

    private void c(int r6, int r7) throws java.lang.Exception {
            r5 = this;
            int r0 = r5.a
            r1 = 8
            r2 = 3
            r3 = 2
            if (r0 != r3) goto L1a
            if (r7 <= r2) goto L1a
            r0 = 100
            if (r7 >= r0) goto L1a
            com.amap.api.maps.offlinemap.DownloadProgressView r0 = r5.l
            r4 = 0
            r0.setVisibility(r4)
            com.amap.api.maps.offlinemap.DownloadProgressView r0 = r5.l
            r0.setProgress(r7)
            goto L1f
        L1a:
            com.amap.api.maps.offlinemap.DownloadProgressView r7 = r5.l
            r7.setVisibility(r1)
        L1f:
            r7 = -1
            if (r6 == r7) goto L74
            r7 = 1
            if (r6 == 0) goto L54
            if (r6 == r7) goto L50
            if (r6 == r3) goto L4c
            if (r6 == r2) goto L48
            r7 = 4
            if (r6 == r7) goto L44
            r7 = 6
            if (r6 == r7) goto L40
            r7 = 7
            if (r6 == r7) goto L3c
            switch(r6) {
                case 101: goto L38;
                case 102: goto L38;
                case 103: goto L38;
                default: goto L37;
            }
        L37:
            return
        L38:
            r5.k()
            return
        L3c:
            r5.i()
            return
        L40:
            r5.h()
            return
        L44:
            r5.m()
            return
        L48:
            r5.l()
            return
        L4c:
            r5.j()
            return
        L50:
            r5.n()
            return
        L54:
            int r6 = r5.a
            if (r6 != r7) goto L70
            android.widget.ImageView r6 = r5.f3952e
            r6.setVisibility(r1)
            android.widget.TextView r6 = r5.f3953f
            java.lang.String r7 = "下载中"
            r6.setText(r7)
            android.widget.TextView r6 = r5.f3953f
            java.lang.String r7 = "#4287ff"
            int r7 = android.graphics.Color.parseColor(r7)
            r6.setTextColor(r7)
            return
        L70:
            r5.o()
            return
        L74:
            r5.k()
            return
    }

    static /* synthetic */ void d(com.amap.api.col.p0003l.s3 r0, int r1, int r2) throws java.lang.Exception {
            r0.c(r1, r2)
            return
    }

    private void f() {
            r2 = this;
            android.content.Context r0 = r2.f3949b
            r1 = 2130903042(0x7f030002, float:1.741289E38)
            android.view.View r0 = com.amap.api.col.p0003l.x3.d(r0, r1)
            r2.f3958k = r0
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            android.view.View r0 = r0.findViewById(r1)
            com.amap.api.maps.offlinemap.DownloadProgressView r0 = (com.amap.api.maps.offlinemap.DownloadProgressView) r0
            r2.l = r0
            android.view.View r0 = r2.f3958k
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3950c = r0
            android.view.View r0 = r2.f3958k
            r1 = 2131165199(0x7f07000f, float:1.7944608E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3951d = r0
            android.view.View r0 = r2.f3958k
            r1 = 2131165198(0x7f07000e, float:1.7944606E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.f3952e = r0
            android.view.View r0 = r2.f3958k
            r1 = 2131165197(0x7f07000d, float:1.7944604E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3953f = r0
            android.widget.ImageView r0 = r2.f3952e
            r0.setOnClickListener(r2)
            return
    }

    private void g(int r2, int r3) {
            r1 = this;
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = r1.f3955h
            if (r0 == 0) goto Lc
            r0.setState(r2)
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = r1.f3955h
            r0.setCompleteCode(r3)
        Lc:
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r0.arg1 = r2
            r0.arg2 = r3
            android.os.Handler r2 = r1.f3957j
            r2.sendMessage(r0)
            return
    }

    private void h() {
            r2 = this;
            android.widget.TextView r0 = r2.f3953f
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 2130837506(0x7f020002, float:1.7279968E38)
            r0.setImageResource(r1)
            return
    }

    private void i() {
            r2 = this;
            android.widget.TextView r0 = r2.f3953f
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 2130837506(0x7f020002, float:1.7279968E38)
            r0.setImageResource(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "已下载-有更新"
            r0.setText(r1)
            return
    }

    private void j() {
            r6 = this;
            int r0 = r6.a
            r1 = 1
            java.lang.String r2 = "#4287ff"
            java.lang.String r3 = "等待中"
            r4 = 0
            r5 = 8
            if (r0 != r1) goto L25
            android.widget.ImageView r0 = r6.f3952e
            r0.setVisibility(r5)
            android.widget.TextView r0 = r6.f3953f
            r0.setVisibility(r4)
            android.widget.TextView r0 = r6.f3953f
            r0.setText(r3)
            android.widget.TextView r0 = r6.f3953f
            int r1 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r1)
            return
        L25:
            android.widget.TextView r0 = r6.f3953f
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r6.f3952e
            r0.setVisibility(r5)
            android.widget.TextView r0 = r6.f3953f
            int r1 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r6.f3953f
            r0.setText(r3)
            return
    }

    private void k() {
            r2 = this;
            android.widget.TextView r0 = r2.f3953f
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.f3953f
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "下载出现异常"
            r0.setText(r1)
            return
    }

    private void l() {
            r2 = this;
            android.widget.TextView r0 = r2.f3953f
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.f3953f
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "暂停"
            r0.setText(r1)
            return
    }

    private void m() {
            r2 = this;
            android.widget.TextView r0 = r2.f3953f
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "已下载"
            r0.setText(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "#898989"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            return
    }

    private void n() {
            r2 = this;
            int r0 = r2.a
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            android.widget.TextView r0 = r2.f3953f
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "解压中"
            r0.setText(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "#898989"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            return
    }

    private void o() {
            r2 = this;
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = r2.f3955h
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r0 = r2.f3953f
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "下载中"
            r0.setText(r1)
            android.widget.ImageView r0 = r2.f3952e
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.f3953f
            java.lang.String r1 = "#4287ff"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            return
    }

    private synchronized void p() {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r1.f3954g     // Catch: java.lang.Throwable -> Ld
            r0.pause()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r1.f3954g     // Catch: java.lang.Throwable -> Ld
            r0.restart()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    private synchronized boolean q() {
            r3 = this;
            monitor-enter(r3)
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r3.f3954g     // Catch: java.lang.Throwable -> Lf com.amap.api.maps.AMapException -> L11
            com.amap.api.maps.offlinemap.OfflineMapCity r1 = r3.f3955h     // Catch: java.lang.Throwable -> Lf com.amap.api.maps.AMapException -> L11
            java.lang.String r1 = r1.getCity()     // Catch: java.lang.Throwable -> Lf com.amap.api.maps.AMapException -> L11
            r0.downloadByCityName(r1)     // Catch: java.lang.Throwable -> Lf com.amap.api.maps.AMapException -> L11
            monitor-exit(r3)
            r0 = 1
            return r0
        Lf:
            r0 = move-exception
            goto L22
        L11:
            r0 = move-exception
            android.content.Context r1 = r3.f3949b     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.getErrorMessage()     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)     // Catch: java.lang.Throwable -> Lf
            r0.show()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r2
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public final android.view.View a() {
            r1 = this;
            android.view.View r0 = r1.f3958k
            return r0
    }

    public final void b(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void e(com.amap.api.maps.offlinemap.OfflineMapCity r5) {
            r4 = this;
            if (r5 == 0) goto L46
            r4.f3955h = r5
            android.widget.TextView r0 = r4.f3950c
            java.lang.String r1 = r5.getCity()
            r0.setText(r1)
            long r0 = r5.getSize()
            double r0 = (double) r0
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r2
            double r0 = r0 / r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r5 = (int) r0
            double r0 = (double) r5
            double r0 = r0 / r2
            android.widget.TextView r5 = r4.f3951d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.append(r0)
            java.lang.String r0 = " M"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.setText(r0)
            com.amap.api.maps.offlinemap.OfflineMapCity r5 = r4.f3955h
            int r5 = r5.getState()
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = r4.f3955h
            int r0 = r0.getcompleteCode()
            r4.g(r5, r0)
        L46:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.content.Context r3 = r2.f3949b     // Catch: java.lang.Exception -> L3e
            boolean r3 = com.amap.api.col.p0003l.b3.h0(r3)     // Catch: java.lang.Exception -> L3e
            if (r3 != 0) goto L15
            android.content.Context r3 = r2.f3949b     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "无网络连接"
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)     // Catch: java.lang.Exception -> L3e
            r3.show()     // Catch: java.lang.Exception -> L3e
            return
        L15:
            com.amap.api.maps.offlinemap.OfflineMapCity r3 = r2.f3955h     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L3e
            int r3 = r3.getState()     // Catch: java.lang.Exception -> L3e
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = r2.f3955h     // Catch: java.lang.Exception -> L3e
            r0.getcompleteCode()     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L38
            r0 = 1
            if (r3 == r0) goto L3e
            r0 = 4
            if (r3 == r0) goto L3e
            boolean r3 = r2.q()     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L34
            r2.j()     // Catch: java.lang.Exception -> L3e
            return
        L34:
            r2.k()     // Catch: java.lang.Exception -> L3e
            return
        L38:
            r2.p()     // Catch: java.lang.Exception -> L3e
            r2.l()     // Catch: java.lang.Exception -> L3e
        L3e:
            return
    }
}
