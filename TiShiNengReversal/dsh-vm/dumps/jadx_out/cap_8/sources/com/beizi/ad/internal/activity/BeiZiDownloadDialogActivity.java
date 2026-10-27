package com.beizi.ad.internal.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BeiZiDownloadDialogActivity extends android.app.Activity {
    private android.widget.FrameLayout a;

    /* renamed from: b, reason: collision with root package name */
    private android.widget.TextView f6547b;

    /* renamed from: c, reason: collision with root package name */
    private android.widget.TextView f6548c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.TextView f6549d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.ImageView f6550e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.ImageView f6551f;

    /* renamed from: g, reason: collision with root package name */
    private android.widget.ExpandableListView f6552g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.LinearLayout f6553h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.LinearLayout f6554i;

    /* renamed from: j, reason: collision with root package name */
    private android.widget.TextView f6555j;

    /* renamed from: k, reason: collision with root package name */
    private android.widget.TextView f6556k;
    private com.beizi.ad.lance.ApkBean l;
    private int m;
    private int n;
    private java.util.List<java.lang.String> o;
    private java.lang.String p;
    private boolean q;
    private boolean r;
    private java.lang.String s;
    private int t;







    static {
            r0 = 13012(0x32d4, float:1.8234E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public BeiZiDownloadDialogActivity() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.m = r0
            r0 = 1
            r1.n = r0
            return
    }

    static /* synthetic */ android.widget.ExpandableListView a(com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity r0) {
            android.widget.ExpandableListView r0 = r0.f6552g
            return r0
    }

    private void a() {
            r10 = this;
            java.lang.String r0 = "webDeepLink"
            java.lang.String r1 = "deeplinkUrl"
            java.lang.String r2 = "isDownload"
            java.lang.String r3 = "isCanJump"
            java.lang.String r4 = "landingPageUrl"
            java.lang.String r5 = "openList"
            java.lang.String r6 = "type"
            java.lang.String r7 = "apkBean"
            android.content.Intent r8 = r10.getIntent()     // Catch: java.lang.Exception -> L80
            java.lang.String r9 = "data"
            android.os.Bundle r8 = r8.getBundleExtra(r9)     // Catch: java.lang.Exception -> L80
            if (r8 != 0) goto L1d
            goto L80
        L1d:
            boolean r9 = r8.containsKey(r7)     // Catch: java.lang.Exception -> L80
            if (r9 == 0) goto L2b
            java.io.Serializable r7 = r8.getSerializable(r7)     // Catch: java.lang.Exception -> L80
            com.beizi.ad.lance.ApkBean r7 = (com.beizi.ad.lance.ApkBean) r7     // Catch: java.lang.Exception -> L80
            r10.l = r7     // Catch: java.lang.Exception -> L80
        L2b:
            boolean r7 = r8.containsKey(r6)     // Catch: java.lang.Exception -> L80
            if (r7 == 0) goto L37
            int r6 = r8.getInt(r6)     // Catch: java.lang.Exception -> L80
            r10.n = r6     // Catch: java.lang.Exception -> L80
        L37:
            boolean r6 = r8.containsKey(r5)     // Catch: java.lang.Exception -> L80
            if (r6 == 0) goto L43
            java.util.ArrayList r5 = r8.getStringArrayList(r5)     // Catch: java.lang.Exception -> L80
            r10.o = r5     // Catch: java.lang.Exception -> L80
        L43:
            boolean r5 = r8.containsKey(r4)     // Catch: java.lang.Exception -> L80
            if (r5 == 0) goto L4f
            java.lang.String r4 = r8.getString(r4)     // Catch: java.lang.Exception -> L80
            r10.p = r4     // Catch: java.lang.Exception -> L80
        L4f:
            boolean r4 = r8.containsKey(r3)     // Catch: java.lang.Exception -> L80
            r5 = 0
            if (r4 == 0) goto L5c
            boolean r3 = r8.getBoolean(r3, r5)     // Catch: java.lang.Exception -> L80
            r10.q = r3     // Catch: java.lang.Exception -> L80
        L5c:
            boolean r3 = r8.containsKey(r2)     // Catch: java.lang.Exception -> L80
            if (r3 == 0) goto L68
            boolean r2 = r8.getBoolean(r2, r5)     // Catch: java.lang.Exception -> L80
            r10.r = r2     // Catch: java.lang.Exception -> L80
        L68:
            boolean r2 = r8.containsKey(r1)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L74
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Exception -> L80
            r10.s = r1     // Catch: java.lang.Exception -> L80
        L74:
            boolean r1 = r8.containsKey(r0)     // Catch: java.lang.Exception -> L80
            if (r1 == 0) goto L80
            int r0 = r8.getInt(r0)     // Catch: java.lang.Exception -> L80
            r10.t = r0     // Catch: java.lang.Exception -> L80
        L80:
            return
    }

    private void b() {
            r2 = this;
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_container_fl     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch: java.lang.Exception -> L78
            r2.a = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_close_iv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch: java.lang.Exception -> L78
            r2.f6550e = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_icon_iv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch: java.lang.Exception -> L78
            r2.f6551f = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_name_tv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L78
            r2.f6547b = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_version_tv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L78
            r2.f6548c = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_developer_tv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L78
            r2.f6549d = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_expand_lv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.ExpandableListView r0 = (android.widget.ExpandableListView) r0     // Catch: java.lang.Exception -> L78
            r2.f6552g = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_download_container_ll     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L78
            r2.f6553h = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_market_container_ll     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L78
            r2.f6554i = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_market_cancel_tv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L78
            r2.f6555j = r0     // Catch: java.lang.Exception -> L78
            int r0 = com.beizi.fusion.R.id.beizi_download_dialog_market_confirm_tv     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L78
            r2.f6556k = r0     // Catch: java.lang.Exception -> L78
            android.widget.ExpandableListView r0 = r2.f6552g     // Catch: java.lang.Exception -> L78
            com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$1 r1 = new com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$1     // Catch: java.lang.Exception -> L78
            r1.<init>(r2)     // Catch: java.lang.Exception -> L78
            r0.setOnGroupClickListener(r1)     // Catch: java.lang.Exception -> L78
        L78:
            return
    }

    static /* synthetic */ void b(com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity r0) {
            r0.d()
            return
    }

    private void c() {
            r7 = this;
            com.beizi.ad.lance.ApkBean r0 = r7.l     // Catch: java.lang.Exception -> L196
            if (r0 != 0) goto L6
            goto L196
        L6:
            int r0 = r7.n     // Catch: java.lang.Exception -> L196
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != r1) goto L32
            android.widget.ImageView r0 = r7.f6550e     // Catch: java.lang.Exception -> L196
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> L196
            android.widget.ImageView r0 = r7.f6550e     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$2 r1 = new com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$2     // Catch: java.lang.Exception -> L196
            r1.<init>(r7)     // Catch: java.lang.Exception -> L196
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> L196
            android.widget.LinearLayout r0 = r7.f6553h     // Catch: java.lang.Exception -> L196
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> L196
            android.widget.LinearLayout r0 = r7.f6553h     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$3 r1 = new com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$3     // Catch: java.lang.Exception -> L196
            r1.<init>(r7)     // Catch: java.lang.Exception -> L196
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> L196
            android.widget.LinearLayout r0 = r7.f6554i     // Catch: java.lang.Exception -> L196
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L196
            goto L55
        L32:
            android.widget.ImageView r0 = r7.f6550e     // Catch: java.lang.Exception -> L196
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L196
            android.widget.LinearLayout r0 = r7.f6553h     // Catch: java.lang.Exception -> L196
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L196
            android.widget.LinearLayout r0 = r7.f6554i     // Catch: java.lang.Exception -> L196
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> L196
            android.widget.TextView r0 = r7.f6555j     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$4 r1 = new com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$4     // Catch: java.lang.Exception -> L196
            r1.<init>(r7)     // Catch: java.lang.Exception -> L196
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> L196
            android.widget.TextView r0 = r7.f6556k     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$5 r1 = new com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$5     // Catch: java.lang.Exception -> L196
            r1.<init>(r7)     // Catch: java.lang.Exception -> L196
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> L196
        L55:
            android.widget.ImageView r0 = r7.f6551f     // Catch: java.lang.Exception -> L196
            if (r0 == 0) goto L78
            com.beizi.ad.lance.ApkBean r0 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r0 = r0.getAppIconURL()     // Catch: java.lang.Exception -> L196
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L196
            if (r0 != 0) goto L78
            r0 = 0
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r0)     // Catch: java.lang.Exception -> L78
            com.beizi.ad.lance.ApkBean r1 = r7.l     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = r1.getAppIconURL()     // Catch: java.lang.Exception -> L78
            com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$6 r2 = new com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity$6     // Catch: java.lang.Exception -> L78
            r2.<init>(r7)     // Catch: java.lang.Exception -> L78
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L78
        L78:
            android.widget.TextView r0 = r7.f6547b     // Catch: java.lang.Exception -> L196
            if (r0 == 0) goto L93
            com.beizi.ad.lance.ApkBean r0 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r0 = r0.getApkTittleName()     // Catch: java.lang.Exception -> L196
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L196
            if (r0 != 0) goto L93
            android.widget.TextView r0 = r7.f6547b     // Catch: java.lang.Exception -> L196
            com.beizi.ad.lance.ApkBean r1 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r1 = r1.getApkTittleName()     // Catch: java.lang.Exception -> L196
            r0.setText(r1)     // Catch: java.lang.Exception -> L196
        L93:
            android.widget.TextView r0 = r7.f6548c     // Catch: java.lang.Exception -> L196
            if (r0 == 0) goto Lbf
            com.beizi.ad.lance.ApkBean r0 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r0 = r0.getAppVersion()     // Catch: java.lang.Exception -> L196
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L196
            if (r0 != 0) goto Lbf
            android.widget.TextView r0 = r7.f6548c     // Catch: java.lang.Exception -> L196
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L196
            r1.<init>()     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = "版本号 ："
            r1.append(r2)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppVersion()     // Catch: java.lang.Exception -> L196
            r1.append(r2)     // Catch: java.lang.Exception -> L196
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L196
            r0.setText(r1)     // Catch: java.lang.Exception -> L196
        Lbf:
            android.widget.TextView r0 = r7.f6549d     // Catch: java.lang.Exception -> L196
            if (r0 == 0) goto Leb
            com.beizi.ad.lance.ApkBean r0 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r0 = r0.getAppDeveloper()     // Catch: java.lang.Exception -> L196
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L196
            if (r0 != 0) goto Leb
            android.widget.TextView r0 = r7.f6549d     // Catch: java.lang.Exception -> L196
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L196
            r1.<init>()     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = "开发者 ："
            r1.append(r2)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppDeveloper()     // Catch: java.lang.Exception -> L196
            r1.append(r2)     // Catch: java.lang.Exception -> L196
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L196
            r0.setText(r1)     // Catch: java.lang.Exception -> L196
        Leb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L196
            r0.<init>()     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.download.b r1 = new com.beizi.ad.internal.download.b     // Catch: java.lang.Exception -> L196
            r1.<init>()     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = "应用权限"
            r1.a(r2)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppPermissionsUrl()     // Catch: java.lang.Exception -> L196
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L196
            java.lang.String r3 = "text"
            java.lang.String r4 = "h5"
            if (r2 != 0) goto L117
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppPermissionsUrl()     // Catch: java.lang.Exception -> L196
            r1.c(r2)     // Catch: java.lang.Exception -> L196
            r1.b(r4)     // Catch: java.lang.Exception -> L196
            goto L12f
        L117:
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppPermissionsDesc()     // Catch: java.lang.Exception -> L196
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L196
            if (r2 != 0) goto L12f
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppPermissionsDesc()     // Catch: java.lang.Exception -> L196
            r1.c(r2)     // Catch: java.lang.Exception -> L196
            r1.b(r3)     // Catch: java.lang.Exception -> L196
        L12f:
            r0.add(r1)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.download.b r1 = new com.beizi.ad.internal.download.b     // Catch: java.lang.Exception -> L196
            r1.<init>()     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = "隐私协议"
            r1.a(r2)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppPrivacyUrl()     // Catch: java.lang.Exception -> L196
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L196
            java.lang.String r6 = "http"
            if (r5 != 0) goto L15d
            boolean r5 = r2.startsWith(r6)     // Catch: java.lang.Exception -> L196
            if (r5 == 0) goto L157
            r1.c(r2)     // Catch: java.lang.Exception -> L196
            r1.b(r4)     // Catch: java.lang.Exception -> L196
            goto L15d
        L157:
            r1.c(r2)     // Catch: java.lang.Exception -> L196
            r1.b(r3)     // Catch: java.lang.Exception -> L196
        L15d:
            r0.add(r1)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.download.b r1 = new com.beizi.ad.internal.download.b     // Catch: java.lang.Exception -> L196
            r1.<init>()     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = "产品功能介绍"
            r1.a(r2)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.lance.ApkBean r2 = r7.l     // Catch: java.lang.Exception -> L196
            java.lang.String r2 = r2.getAppintro()     // Catch: java.lang.Exception -> L196
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L196
            if (r5 != 0) goto L189
            boolean r5 = r2.startsWith(r6)     // Catch: java.lang.Exception -> L196
            if (r5 == 0) goto L183
            r1.c(r2)     // Catch: java.lang.Exception -> L196
            r1.b(r4)     // Catch: java.lang.Exception -> L196
            goto L189
        L183:
            r1.c(r2)     // Catch: java.lang.Exception -> L196
            r1.b(r3)     // Catch: java.lang.Exception -> L196
        L189:
            r0.add(r1)     // Catch: java.lang.Exception -> L196
            com.beizi.ad.internal.download.a r1 = new com.beizi.ad.internal.download.a     // Catch: java.lang.Exception -> L196
            r1.<init>(r7, r0)     // Catch: java.lang.Exception -> L196
            android.widget.ExpandableListView r0 = r7.f6552g     // Catch: java.lang.Exception -> L196
            r0.setAdapter(r1)     // Catch: java.lang.Exception -> L196
        L196:
            return
    }

    static /* synthetic */ void c(com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity r0) {
            r0.e()
            return
    }

    static /* synthetic */ android.widget.ImageView d(com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity r0) {
            android.widget.ImageView r0 = r0.f6551f
            return r0
    }

    private void d() {
            r3 = this;
            com.beizi.ad.lance.ApkBean r0 = r3.l     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L5
            goto L4d
        L5:
            int r0 = r3.n     // Catch: java.lang.Exception -> L4d
            r1 = 2
            if (r0 != r1) goto L2b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = "android.intent.action.VIEW"
            com.beizi.ad.lance.ApkBean r2 = r3.l     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r2.getApkUrl()     // Catch: java.lang.Exception -> L4d
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L4d
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L4d
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L4d
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L4d
            java.util.List<java.lang.String> r0 = r3.o     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L4d
            com.beizi.ad.internal.h.l.a(r0)     // Catch: java.lang.Exception -> L4d
            return
        L2b:
            boolean r0 = com.beizi.ad.lance.a.o.a(r3)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L32
            return
        L32:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> L4d
            r0.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = "apkBean"
            com.beizi.ad.lance.ApkBean r2 = r3.l     // Catch: java.lang.Exception -> L4d
            r0.putSerializable(r1, r2)     // Catch: java.lang.Exception -> L4d
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L4d
            java.lang.Class<com.beizi.ad.DownloadService> r2 = com.beizi.ad.DownloadService.class
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "data"
            r1.putExtra(r2, r0)     // Catch: java.lang.Exception -> L4d
            r3.startService(r1)     // Catch: java.lang.Exception -> L4d
        L4d:
            return
    }

    private void e() {
            r4 = this;
            int r0 = r4.n
            r1 = 2
            if (r0 == r1) goto L6
            goto L78
        L6:
            java.lang.String r0 = r4.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = r4.p
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L78
            java.lang.Class r0 = com.beizi.ad.AdActivity.a()
            android.webkit.WebView r1 = new android.webkit.WebView     // Catch: java.lang.Exception -> L73
            r1.<init>(r4)     // Catch: java.lang.Exception -> L73
            com.beizi.ad.internal.h.x.a(r1)     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = r4.p     // Catch: java.lang.Exception -> L73
            java.util.Map r3 = com.beizi.ad.lance.a.j.a()     // Catch: java.lang.Exception -> L73
            r1.loadUrl(r2, r3)     // Catch: java.lang.Exception -> L73
            java.util.LinkedList<android.webkit.WebView> r2 = com.beizi.ad.internal.activity.a.a     // Catch: java.lang.Exception -> L73
            r2.add(r1)     // Catch: java.lang.Exception -> L73
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L73
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Exception -> L73
            android.content.Context r2 = r2.e()     // Catch: java.lang.Exception -> L73
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L73
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "ACTIVITY_TYPE"
            java.lang.String r2 = "DOWNLOADBROWSER"
            r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "ACTIVITY_CAN_JUMP"
            boolean r2 = r4.q     // Catch: java.lang.Exception -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "ACTIVITY_CAN_DOWNLOAD"
            boolean r2 = r4.r     // Catch: java.lang.Exception -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = r4.s     // Catch: java.lang.Exception -> L73
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L73
            if (r0 != 0) goto L6f
            java.lang.String r0 = "deeplinkUrl"
            java.lang.String r2 = r4.s     // Catch: java.lang.Exception -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "webDeepLink"
            int r2 = r4.t     // Catch: java.lang.Exception -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> L73
        L6f:
            r4.startActivity(r1)     // Catch: java.lang.Exception -> L73
            return
        L73:
            java.util.LinkedList<android.webkit.WebView> r0 = com.beizi.ad.internal.activity.a.a
            r0.remove()
        L78:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);
}
