package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q3 extends com.amap.api.col.p0003l.r3 implements android.view.View.OnClickListener {
    private com.amap.api.maps.offlinemap.OfflineMapManager a;

    /* renamed from: b, reason: collision with root package name */
    private android.view.View f3818b;

    /* renamed from: c, reason: collision with root package name */
    private android.widget.TextView f3819c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.TextView f3820d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.TextView f3821e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.TextView f3822f;

    /* renamed from: g, reason: collision with root package name */
    private int f3823g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f3824h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.amap.api.col.p0003l.q3 a;

        a(com.amap.api.col.p0003l.q3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r1) {
                r0 = this;
                com.amap.api.col.3l.q3 r1 = r0.a
                r1.dismiss()
                return
        }
    }

    public q3(android.content.Context r1, com.amap.api.maps.offlinemap.OfflineMapManager r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r2
            return
    }

    @Override // com.amap.api.col.p0003l.r3
    protected final void a() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 2130903041(0x7f030001, float:1.7412889E38)
            android.view.View r0 = com.amap.api.col.p0003l.x3.d(r0, r1)
            r2.f3818b = r0
            r2.setContentView(r0)
            android.view.View r0 = r2.f3818b
            com.amap.api.col.3l.q3$a r1 = new com.amap.api.col.3l.q3$a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.view.View r0 = r2.f3818b
            r1 = 2131165191(0x7f070007, float:1.7944592E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3819c = r0
            android.view.View r0 = r2.f3818b
            r1 = 2131165192(0x7f070008, float:1.7944594E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3820d = r0
            java.lang.String r1 = "暂停下载"
            r0.setText(r1)
            android.view.View r0 = r2.f3818b
            r1 = 2131165193(0x7f070009, float:1.7944596E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3821e = r0
            android.view.View r0 = r2.f3818b
            r1 = 2131165194(0x7f07000a, float:1.7944598E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f3822f = r0
            android.widget.TextView r0 = r2.f3820d
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f3821e
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f3822f
            r0.setOnClickListener(r2)
            return
    }

    public final void c(int r6, java.lang.String r7) {
            r5 = this;
            android.widget.TextView r0 = r5.f3819c
            r0.setText(r7)
            java.lang.String r0 = "取消下载"
            r1 = 0
            if (r6 != 0) goto L1b
            android.widget.TextView r2 = r5.f3820d
            java.lang.String r3 = "暂停下载"
            r2.setText(r3)
            android.widget.TextView r2 = r5.f3820d
            r2.setVisibility(r1)
            android.widget.TextView r2 = r5.f3821e
            r2.setText(r0)
        L1b:
            r2 = 2
            r3 = 8
            if (r6 != r2) goto L2b
            android.widget.TextView r1 = r5.f3820d
            r1.setVisibility(r3)
            android.widget.TextView r1 = r5.f3821e
            r1.setText(r0)
            goto L6a
        L2b:
            r2 = -1
            java.lang.String r4 = "继续下载"
            if (r6 == r2) goto L60
            r2 = 101(0x65, float:1.42E-43)
            if (r6 == r2) goto L60
            r2 = 102(0x66, float:1.43E-43)
            if (r6 == r2) goto L60
            r2 = 103(0x67, float:1.44E-43)
            if (r6 != r2) goto L3d
            goto L60
        L3d:
            r2 = 3
            if (r6 != r2) goto L50
            android.widget.TextView r2 = r5.f3820d
            r2.setVisibility(r1)
            android.widget.TextView r1 = r5.f3820d
            r1.setText(r4)
            android.widget.TextView r1 = r5.f3821e
            r1.setText(r0)
            goto L6a
        L50:
            r0 = 4
            if (r6 != r0) goto L6a
            android.widget.TextView r0 = r5.f3821e
            java.lang.String r1 = "删除"
            r0.setText(r1)
            android.widget.TextView r0 = r5.f3820d
            r0.setVisibility(r3)
            goto L6a
        L60:
            android.widget.TextView r0 = r5.f3820d
            r0.setText(r4)
            android.widget.TextView r0 = r5.f3820d
            r0.setVisibility(r1)
        L6a:
            r5.f3823g = r6
            r5.f3824h = r7
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()     // Catch: java.lang.Exception -> L60
            r0 = 2131165192(0x7f070008, float:1.7944594E38)
            if (r2 != r0) goto L40
            int r2 = r1.f3823g     // Catch: java.lang.Exception -> L60
            if (r2 != 0) goto L1c
            android.widget.TextView r2 = r1.f3820d     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "继续下载"
            r2.setText(r0)     // Catch: java.lang.Exception -> L60
            com.amap.api.maps.offlinemap.OfflineMapManager r2 = r1.a     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r1.f3824h     // Catch: java.lang.Exception -> L60
            r2.pauseByName(r0)     // Catch: java.lang.Exception -> L60
            goto L3c
        L1c:
            r0 = 3
            if (r2 == r0) goto L2e
            r0 = -1
            if (r2 == r0) goto L2e
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L2e
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L2e
            r0 = 103(0x67, float:1.44E-43)
            if (r2 != r0) goto L3c
        L2e:
            android.widget.TextView r2 = r1.f3820d     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "暂停下载"
            r2.setText(r0)     // Catch: java.lang.Exception -> L60
            com.amap.api.maps.offlinemap.OfflineMapManager r2 = r1.a     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r1.f3824h     // Catch: java.lang.Exception -> L60
            r2.downloadByCityName(r0)     // Catch: java.lang.Exception -> L60
        L3c:
            r1.dismiss()     // Catch: java.lang.Exception -> L60
            return
        L40:
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            if (r2 != r0) goto L58
            java.lang.String r2 = r1.f3824h     // Catch: java.lang.Exception -> L60
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L60
            if (r2 != 0) goto L60
            com.amap.api.maps.offlinemap.OfflineMapManager r2 = r1.a     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r1.f3824h     // Catch: java.lang.Exception -> L60
            r2.remove(r0)     // Catch: java.lang.Exception -> L60
            r1.dismiss()     // Catch: java.lang.Exception -> L60
            return
        L58:
            r0 = 2131165194(0x7f07000a, float:1.7944598E38)
            if (r2 != r0) goto L60
            r1.dismiss()     // Catch: java.lang.Exception -> L60
        L60:
            return
    }
}
