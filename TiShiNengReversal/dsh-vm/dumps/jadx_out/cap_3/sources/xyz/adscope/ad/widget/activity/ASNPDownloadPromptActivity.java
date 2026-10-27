package xyz.adscope.ad.widget.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPDownloadPromptActivity extends android.app.Activity {
    private android.widget.TextView a;
    private android.widget.TextView b;
    private android.widget.TextView c;
    private android.widget.ImageView d;
    private android.widget.ImageView e;
    private android.widget.ExpandableListView f;
    private android.widget.LinearLayout g;
    private android.widget.LinearLayout h;
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel i;
    private int j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private final java.lang.String a;
        private final java.lang.String b;
        private final java.lang.String c;

        private b(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.c = r1
                return
        }

        /* synthetic */ b(java.lang.String r1, java.lang.String r2, java.lang.String r3, xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b r0) {
                java.lang.String r0 = r0.c
                return r0
        }

        private boolean a() {
                r2 = this;
                java.lang.String r0 = r2.b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L11
                java.lang.String r0 = r2.b
                java.lang.String r1 = "http"
                boolean r0 = r0.startsWith(r1)
                return r0
            L11:
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean b(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b r0) {
                boolean r0 = r0.a()
                return r0
        }

        static /* synthetic */ java.lang.String c(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.String d(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b r0) {
                java.lang.String r0 = r0.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends android.widget.BaseExpandableListAdapter {
        private final android.content.Context a;
        private final java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class a {
            android.widget.TextView a;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView b;

            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class b {
            android.widget.TextView a;
            android.widget.ImageView b;
            android.view.View c;

            public b() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        private c(android.content.Context r2, java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b> r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.b = r0
                r1.a = r2
                r0.clear()
                r0.addAll(r3)
                return
        }

        /* synthetic */ c(android.content.Context r1, java.util.List r2, xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.widget.ExpandableListAdapter
        public java.lang.Object getChild(int r1, int r2) {
                r0 = this;
                java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b> r2 = r0.b
                java.lang.Object r1 = r2.get(r1)
                return r1
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int r1, int r2) {
                r0 = this;
                long r1 = (long) r2
                return r1
        }

        @Override // android.widget.ExpandableListAdapter
        public android.view.View getChildView(int r2, int r3, boolean r4, android.view.View r5, android.view.ViewGroup r6) {
                r1 = this;
                if (r5 != 0) goto L2c
                android.content.Context r3 = r1.a
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                int r4 = xyz.adscope.amps.R.layout.asnp_download_dialog_expand_child_item
                r5 = 0
                android.view.View r5 = r3.inflate(r4, r5)
                xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c$a r3 = new xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c$a
                r3.<init>()
                int r4 = xyz.adscope.amps.R.id.addeci_content_tv
                android.view.View r4 = r5.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.a = r4
                int r4 = xyz.adscope.amps.R.id.addeci_content_wb
                android.view.View r4 = r5.findViewById(r4)
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r4 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView) r4
                r3.b = r4
                r5.setTag(r3)
                goto L32
            L2c:
                java.lang.Object r3 = r5.getTag()
                xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c$a r3 = (xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.c.a) r3
            L32:
                java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b> r4 = r1.b
                java.lang.Object r2 = r4.get(r2)
                xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b r2 = (xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b) r2
                boolean r4 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b.b(r2)
                r6 = 0
                r0 = 8
                if (r4 == 0) goto L67
                android.widget.TextView r4 = r3.a
                r4.setVisibility(r0)
                java.lang.String r4 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b.c(r2)
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L61
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r4 = r3.b
                r4.setVisibility(r6)
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r3 = r3.b
                java.lang.String r2 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b.c(r2)
                r3.loadUrl(r2)
                return r5
            L61:
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r2 = r3.b
                r2.setVisibility(r0)
                return r5
            L67:
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r4 = r3.b
                r4.setVisibility(r0)
                java.lang.String r4 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b.d(r2)
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L98
                android.widget.TextView r4 = r3.a
                java.lang.String r2 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b.d(r2)
                r4.setText(r2)
                android.widget.TextView r2 = r3.a
                r2.setVisibility(r6)
                android.widget.TextView r2 = r3.a     // Catch: java.lang.Exception -> L97
                xyz.adscope.ad.b7 r3 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L97
                java.lang.String r4 = "#8C8C8C"
                java.lang.String r3 = r3.a(r4)     // Catch: java.lang.Exception -> L97
                int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L97
                r2.setTextColor(r3)     // Catch: java.lang.Exception -> L97
            L97:
                return r5
            L98:
                android.widget.TextView r2 = r3.a
                r2.setVisibility(r0)
                return r5
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.widget.ExpandableListAdapter
        public java.lang.Object getGroup(int r2) {
                r1 = this;
                java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b> r0 = r1.b
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
                r1 = this;
                java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b> r0 = r1.b
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.ExpandableListAdapter
        public android.view.View getGroupView(int r3, boolean r4, android.view.View r5, android.view.ViewGroup r6) {
                r2 = this;
                if (r5 != 0) goto L34
                android.content.Context r5 = r2.a
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                int r6 = xyz.adscope.amps.R.layout.asnp_download_dialog_expand_parent_item
                r0 = 0
                android.view.View r5 = r5.inflate(r6, r0)
                xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c$b r6 = new xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c$b
                r6.<init>()
                int r0 = xyz.adscope.amps.R.id.addep_title_tv
                android.view.View r0 = r5.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r6.a = r0
                int r0 = xyz.adscope.amps.R.id.addep_fold_iv
                android.view.View r0 = r5.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r6.b = r0
                int r0 = xyz.adscope.amps.R.id.addep_item_divider_view
                android.view.View r0 = r5.findViewById(r0)
                r6.c = r0
                r5.setTag(r6)
                goto L3a
            L34:
                java.lang.Object r6 = r5.getTag()
                xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c$b r6 = (xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.c.b) r6
            L3a:
                android.widget.TextView r0 = r6.a
                java.util.List<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b> r1 = r2.b
                java.lang.Object r1 = r1.get(r3)
                xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b r1 = (xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b) r1
                java.lang.String r1 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.b.a(r1)
                r0.setText(r1)
                if (r4 == 0) goto L60
                android.widget.TextView r4 = r6.a
                java.lang.String r0 = "#FF8E15"
                int r0 = android.graphics.Color.parseColor(r0)
                r4.setTextColor(r0)
                android.widget.ImageView r4 = r6.b
                int r0 = xyz.adscope.amps.R.mipmap.asnp_icon_arrow_unfold
                r4.setBackgroundResource(r0)
                goto L7f
            L60:
                android.widget.TextView r4 = r6.a     // Catch: java.lang.Exception -> L74
                xyz.adscope.ad.b7 r0 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L74
                java.lang.String r1 = "#333333"
                java.lang.String r0 = r0.a(r1)     // Catch: java.lang.Exception -> L74
                int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L74
                r4.setTextColor(r0)     // Catch: java.lang.Exception -> L74
                goto L78
            L74:
                r4 = move-exception
                xyz.adscope.common.v2.log.SDKLog.stack(r4)
            L78:
                android.widget.ImageView r4 = r6.b
                int r0 = xyz.adscope.amps.R.mipmap.asnp_icon_arrow_fold
                r4.setBackgroundResource(r0)
            L7f:
                if (r3 != 0) goto L89
                android.view.View r3 = r6.c
                r4 = 8
                r3.setVisibility(r4)
                goto L8f
            L89:
                android.view.View r3 = r6.c
                r4 = 0
                r3.setVisibility(r4)
            L8f:
                return r5
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            r0 = 55677(0xd97d, float:7.802E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ASNPDownloadPromptActivity() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.j = r0
            return
    }

    private java.lang.String a(java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 == 0) goto L36
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L36
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel) r1
            java.lang.String r2 = r1.c()
            java.lang.String r1 = r1.a()
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            goto L11
        L36:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void a() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L29
            java.lang.String r1 = "download_info_key"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L29
            boolean r1 = xyz.adscope.common.v2.tool.json.JsonUtil.isValidJson(r0)
            if (r1 == 0) goto L29
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1 = new xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel
            org.json.JSONObject r0 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r0)
            r1.<init>(r0)
            boolean r0 = r1.hasParseException()
            if (r0 != 0) goto L29
            r2.i = r1
        L29:
            return
    }

    private /* synthetic */ void a(int r3) {
            r2 = this;
            int r0 = r2.j
            r1 = -1
            if (r0 == r1) goto La
            android.widget.ExpandableListView r1 = r2.f
            r1.collapseGroup(r0)
        La:
            r2.j = r3
            return
    }

    private /* synthetic */ void a(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.a(r1)
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity r0, android.view.View r1) {
            r0.b(r1)
            return
    }

    private void a(boolean r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.asnp.ad.ACTION_DOWNLOAD_PROMPT_RESULT"
            r0.setAction(r1)
            java.lang.String r1 = "prompt"
            if (r3 == 0) goto L14
            java.lang.String r3 = "confirm"
            r0.putExtra(r1, r3)
            goto L19
        L14:
            java.lang.String r3 = "cancel"
            r0.putExtra(r1, r3)
        L19:
            r2.finish()
            android.content.Context r3 = r2.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r3 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            r3.sendBroadcast(r0)
            return
    }

    private void b() {
            r6 = this;
            java.lang.String r0 = "#8C8C8C"
            java.lang.String r1 = "#000000"
            int r2 = xyz.adscope.amps.R.id.adscope_download_dialog_total_layout
            android.view.View r2 = r6.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r6.h = r2
            int r2 = xyz.adscope.amps.R.id.adscope_download_dialog_divider_view
            android.view.View r2 = r6.findViewById(r2)
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_close_iv
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r6.d = r3
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_icon_iv
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r6.e = r3
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_name_tv
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.a = r3
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_version_tv
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.b = r3
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_developer_tv
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.c = r3
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_expand_lv
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ExpandableListView r3 = (android.widget.ExpandableListView) r3
            r6.f = r3
            int r3 = xyz.adscope.amps.R.id.adscope_download_dialog_download_ll
            android.view.View r3 = r6.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r6.g = r3
            android.widget.ExpandableListView r3 = r6.f
            xyz.adscope.ad.widget.activity.e r4 = new xyz.adscope.ad.widget.activity.e
            r4.<init>(r6)
            r3.setOnGroupExpandListener(r4)
            android.widget.LinearLayout r3 = r6.h     // Catch: java.lang.Exception -> Ld1
            xyz.adscope.ad.b7 r4 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r5 = "#FFFFFF"
            java.lang.String r4 = r4.a(r5)     // Catch: java.lang.Exception -> Ld1
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Exception -> Ld1
            r3.setBackgroundColor(r4)     // Catch: java.lang.Exception -> Ld1
            xyz.adscope.ad.b7 r3 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r4 = "#CCCCCC"
            java.lang.String r3 = r3.a(r4)     // Catch: java.lang.Exception -> Ld1
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> Ld1
            r2.setBackgroundColor(r3)     // Catch: java.lang.Exception -> Ld1
            android.widget.ImageView r2 = r6.d     // Catch: java.lang.Exception -> Ld1
            xyz.adscope.ad.b7 r3 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r3 = r3.a(r1)     // Catch: java.lang.Exception -> Ld1
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> Ld1
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)     // Catch: java.lang.Exception -> Ld1
            r2.setImageTintList(r3)     // Catch: java.lang.Exception -> Ld1
            android.widget.TextView r2 = r6.a     // Catch: java.lang.Exception -> Ld1
            xyz.adscope.ad.b7 r3 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r1 = r3.a(r1)     // Catch: java.lang.Exception -> Ld1
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> Ld1
            r2.setTextColor(r1)     // Catch: java.lang.Exception -> Ld1
            android.widget.TextView r1 = r6.b     // Catch: java.lang.Exception -> Ld1
            xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r2 = r2.a(r0)     // Catch: java.lang.Exception -> Ld1
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> Ld1
            r1.setTextColor(r2)     // Catch: java.lang.Exception -> Ld1
            android.widget.TextView r1 = r6.c     // Catch: java.lang.Exception -> Ld1
            xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r2.a(r0)     // Catch: java.lang.Exception -> Ld1
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> Ld1
            r1.setTextColor(r0)     // Catch: java.lang.Exception -> Ld1
            return
        Ld1:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            return
    }

    private /* synthetic */ void b(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.a(r1)
            return
    }

    public static /* synthetic */ void b(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity r0, android.view.View r1) {
            r0.a(r1)
            return
    }

    private void c() {
            r8 = this;
            android.widget.ImageView r0 = r8.d
            xyz.adscope.ad.widget.activity.c r1 = new xyz.adscope.ad.widget.activity.c
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r8.g
            xyz.adscope.ad.widget.activity.d r1 = new xyz.adscope.ad.widget.activity.d
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r8.i
            if (r0 != 0) goto L19
            return
        L19:
            android.widget.ImageView r1 = r8.e
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.String r0 = r0.e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L37
            xyz.adscope.common.v2.image.loader.ImageLoader r0 = xyz.adscope.common.v2.image.loader.ImageLoader.getInstance()
            android.widget.ImageView r1 = r8.e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3 = r8.i
            java.lang.String r3 = r3.e()
            r0.loadPermanentImage(r1, r3, r2)
        L37:
            android.widget.TextView r0 = r8.a
            if (r0 == 0) goto L52
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r8.i
            java.lang.String r0 = r0.f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L52
            android.widget.TextView r0 = r8.a
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1 = r8.i
            java.lang.String r1 = r1.f()
            r0.setText(r1)
        L52:
            android.widget.TextView r0 = r8.b
            r1 = 1
            r3 = 2
            java.lang.String r4 = "%s %s"
            if (r0 == 0) goto L81
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r8.i
            java.lang.String r0 = r0.l()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L81
            android.widget.TextView r0 = r8.b
            int r5 = xyz.adscope.amps.R.string.adscope_version_code
            java.lang.String r5 = r8.getString(r5)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r6 = r8.i
            java.lang.String r6 = r6.l()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r5
            r7[r1] = r6
            java.lang.String r5 = java.lang.String.format(r4, r7)
            r0.setText(r5)
        L81:
            android.widget.TextView r0 = r8.c
            if (r0 == 0) goto Lac
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r8.i
            java.lang.String r0 = r0.d()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lac
            android.widget.TextView r0 = r8.c
            int r5 = xyz.adscope.amps.R.string.adscope_developer
            java.lang.String r5 = r8.getString(r5)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r6 = r8.i
            java.lang.String r6 = r6.d()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r5
            r3[r1] = r6
            java.lang.String r1 = java.lang.String.format(r4, r3)
            r0.setText(r1)
        Lac:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b r1 = new xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b
            int r2 = xyz.adscope.amps.R.string.adscope_app_permission
            java.lang.String r2 = r8.getString(r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3 = r8.i
            java.util.List r3 = r3.g()
            java.lang.String r3 = r8.a(r3)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r4 = r8.i
            java.lang.String r4 = r4.h()
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b r1 = new xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b
            int r2 = xyz.adscope.amps.R.string.adscope_app_privacy_policy
            java.lang.String r2 = r8.getString(r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3 = r8.i
            java.lang.String r3 = r3.i()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r4 = r8.i
            java.lang.String r4 = r4.j()
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b r1 = new xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$b
            int r2 = xyz.adscope.amps.R.string.adscope_app_intro_info
            java.lang.String r2 = r8.getString(r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3 = r8.i
            java.lang.String r3 = r3.b()
            java.lang.String r4 = ""
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c r1 = new xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity$c
            r1.<init>(r8, r0, r5)
            android.widget.ExpandableListView r0 = r8.f
            r0.setAdapter(r1)
            return
    }

    public static /* synthetic */ void c(xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity r0, int r1) {
            r0.a(r1)
            return
    }

    private void d() {
            r8 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.view.Window r2 = r8.getWindow()
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getSize(r1)
            android.view.Window r2 = r8.getWindow()
            android.view.WindowManager$LayoutParams r3 = r2.getAttributes()
            int r4 = r1.x
            r3.width = r4
            int r4 = r1.y
            double r4 = (double) r4
            r6 = 4601778099247172813(0x3fdccccccccccccd, double:0.45)
            double r4 = r4 * r6
            int r4 = (int) r4
            r3.height = r4
            r4 = 80
            r3.gravity = r4
            r2.setAttributes(r3)
            int r2 = r1.x
            r0.width = r2
            int r1 = r1.y
            double r1 = (double) r1
            double r1 = r1 * r6
            int r1 = (int) r1
            r0.height = r1
            r0.gravity = r4
            android.widget.LinearLayout r1 = r8.h
            r1.setLayoutParams(r0)
            android.widget.LinearLayout r0 = r8.h
            r0.requestLayout()
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r0 = this;
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);
}
