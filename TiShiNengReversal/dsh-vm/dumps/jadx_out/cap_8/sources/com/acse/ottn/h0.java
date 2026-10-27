package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h0 {
    public static com.acse.ottn.h0 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2346b = "ButtonColorUtil";

    static {
            return
    }

    public h0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.h0 a() {
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.h0> r0 = com.acse.ottn.h0.class
            monitor-enter(r0)
            com.acse.ottn.h0 r1 = com.acse.ottn.h0.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.h0 r1 = new com.acse.ottn.h0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.h0.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a
            return r0
    }

    public java.lang.String a(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r3 = "👉【运动世界】—请启用🏃"
            return r3
        Lf:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r3 = "👉【体适能】—请启用🏃"
            return r3
        L1e:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            java.lang.String r3 = "👉【步道乐跑】—请启用🏃"
            return r3
        L2d:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            java.lang.String r3 = "👉【闪动校园】—请启用🏃"
            return r3
        L3c:
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            java.lang.String r3 = "👉【闪动校园Pro】—请启用🏃"
            return r3
        L4b:
            java.lang.String r3 = "👉【体适能demo】—请启用🏃"
            return r3
    }

    public java.lang.String a(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r3 = "wxd67633bd92006e63"
            return r3
        Lf:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.t
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            goto L49
        L28:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            java.lang.String r3 = "wx5a2e1ff396785475"
            return r3
        L37:
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.u
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            java.lang.String r3 = "wxc9214f296e1fba92"
            return r3
        L46:
            java.lang.String r3 = "wx0b99368ff4dd7868"
            return r3
        L49:
            java.lang.String r3 = "wx15d677743c454371"
            return r3
    }

    public void a(android.app.Activity r3, android.text.TextPaint r4) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.String r3 = "#5FCA8B"
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setColor(r3)
            return
        L16:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2f
            goto L39
        L2f:
            java.lang.String r3 = "#3ECDA1"
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setColor(r3)
            return
        L39:
            java.lang.String r3 = "#650AEC"
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setColor(r3)
            return
    }

    public void a(android.app.Activity r3, android.view.View r4) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.t
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.v
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L3d
            goto L43
        L3d:
            r3 = 8
            r4.setVisibility(r3)
            return
        L43:
            r3 = 0
            r4.setVisibility(r3)
            return
    }

    public void a(android.app.Activity r3, android.widget.ImageView r4) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            int r3 = com.acse.ottn.R.mipmap.ydsj_up
            r4.setImageResource(r3)
            return
        L12:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2b
            goto L31
        L2b:
            int r3 = com.acse.ottn.R.mipmap.up_green
            r4.setImageResource(r3)
            return
        L31:
            int r3 = com.acse.ottn.R.mipmap.sdxy_up
            r4.setImageResource(r3)
            return
    }

    public void a(android.app.Activity r7, android.widget.ImageView r8, android.widget.ImageView r9) {
            r6 = this;
            r0 = 8
            r9.setVisibility(r0)
            r9 = 0
            r8.setVisibility(r9)
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            r1 = -1
            r2 = -2
            if (r0 == 0) goto L2a
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r1, r2)
            r8.setLayoutParams(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.FIT_XY
            r8.setScaleType(r7)
            int r7 = com.acse.ottn.R.mipmap.run_dialog_icon
            r8.setImageResource(r7)
            return
        L2a:
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r3)
            r3 = 60
            r4 = 14
            if (r0 == 0) goto L53
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER
            r8.setScaleType(r7)
            int r7 = com.acse.ottn.R.mipmap.bdlp_running_icon
            r8.setImageResource(r7)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r2, r2)
            r7.addRule(r4)
            r7.setMargins(r9, r3, r9, r9)
            r8.setLayoutParams(r7)
            return
        L53:
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r5 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L85
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L6c
            goto L85
        L6c:
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER
            r8.setScaleType(r7)
            int r7 = com.acse.ottn.R.mipmap.running_icon
            r8.setImageResource(r7)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r2, r2)
            r7.addRule(r4)
            r7.setMargins(r9, r3, r9, r9)
            r8.setLayoutParams(r7)
            return
        L85:
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r1, r2)
            r8.setLayoutParams(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.FIT_XY
            r8.setScaleType(r7)
            int r7 = com.acse.ottn.R.mipmap.sdxy_run_icon
            r8.setImageResource(r7)
            return
    }

    public void a(android.app.Activity r17, android.widget.ImageView r18, android.widget.ImageView r19, android.widget.ImageView r20, android.widget.ImageView r21, android.widget.RelativeLayout r22, android.widget.RelativeLayout r23, android.widget.RelativeLayout r24, android.widget.RelativeLayout r25, android.widget.TextView r26) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            int r10 = com.acse.ottn.R.mipmap.premission_unreadly
            r1.setImageResource(r10)
            r3.setImageResource(r10)
            r2.setImageResource(r10)
            r4.setImageResource(r10)
            int r10 = com.acse.ottn.R.drawable.permission_background
            r5.setBackgroundResource(r10)
            r7.setBackgroundResource(r10)
            r8.setBackgroundResource(r10)
            r6.setBackgroundResource(r10)
            java.lang.String r10 = "允许后台使用精准定位，以便持续记录跑步轨迹。"
            r9.setText(r10)
            java.lang.String r10 = "#AAAAAA"
            int r10 = android.graphics.Color.parseColor(r10)
            r9.setTextColor(r10)
            java.lang.String r10 = r0.getPackageName()
            java.lang.String r11 = com.acse.ottn.l0.r
            boolean r10 = r10.equals(r11)
            java.lang.String r11 = "#FD5439"
            java.lang.String r12 = "开启异常请在设置中手动开启"
            r13 = 2
            java.lang.String r14 = "location_permission_size"
            if (r10 == 0) goto Lca
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            boolean r10 = r10.e()
            if (r10 == 0) goto L65
            int r10 = com.acse.ottn.R.mipmap.permission_readly
            r1.setImageResource(r10)
            int r1 = com.acse.ottn.R.drawable.permission_green_background
            r5.setBackgroundResource(r1)
        L65:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.a()
            if (r1 == 0) goto L79
            int r1 = com.acse.ottn.R.mipmap.permission_readly
            r3.setImageResource(r1)
            int r1 = com.acse.ottn.R.drawable.permission_green_background
            r7.setBackgroundResource(r1)
        L79:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L98
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L98
            int r1 = com.acse.ottn.R.mipmap.permission_readly
            r2.setImageResource(r1)
            int r1 = com.acse.ottn.R.drawable.permission_green_background
            r6.setBackgroundResource(r1)
            goto Lb1
        L98:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            int r1 = r1.c(r14)
            if (r1 <= r13) goto Lb1
            int r1 = com.acse.ottn.R.mipmap.premission_location_exceptional
            r2.setImageResource(r1)
            r9.setText(r12)
            int r1 = android.graphics.Color.parseColor(r11)
            r9.setTextColor(r1)
        Lb1:
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.a()
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L1d5
            int r0 = com.acse.ottn.R.mipmap.permission_readly
            r4.setImageResource(r0)
            int r0 = com.acse.ottn.R.drawable.permission_green_background
            r8.setBackgroundResource(r0)
            return
        Lca:
            java.lang.String r10 = r0.getPackageName()
            java.lang.String r15 = com.acse.ottn.l0.s
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L15d
            java.lang.String r10 = r0.getPackageName()
            java.lang.String r15 = com.acse.ottn.l0.t
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto Le4
            goto L15d
        Le4:
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            boolean r10 = r10.e()
            if (r10 == 0) goto Lf8
            int r10 = com.acse.ottn.R.mipmap.permission_readly_tsn
            r1.setImageResource(r10)
            int r1 = com.acse.ottn.R.drawable.permission_tsn_green_background
            r5.setBackgroundResource(r1)
        Lf8:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L117
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L117
            int r1 = com.acse.ottn.R.mipmap.permission_readly_tsn
            r2.setImageResource(r1)
            int r1 = com.acse.ottn.R.drawable.permission_tsn_green_background
            r6.setBackgroundResource(r1)
            goto L130
        L117:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            int r1 = r1.c(r14)
            if (r1 <= r13) goto L130
            int r1 = com.acse.ottn.R.mipmap.premission_location_exceptional
            r2.setImageResource(r1)
            r9.setText(r12)
            int r1 = android.graphics.Color.parseColor(r11)
            r9.setTextColor(r1)
        L130:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.a()
            if (r1 == 0) goto L144
            int r1 = com.acse.ottn.R.mipmap.permission_readly_tsn
            r3.setImageResource(r1)
            int r1 = com.acse.ottn.R.drawable.permission_tsn_green_background
            r7.setBackgroundResource(r1)
        L144:
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.a()
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L1d5
            int r0 = com.acse.ottn.R.mipmap.permission_readly_tsn
            r4.setImageResource(r0)
            int r0 = com.acse.ottn.R.drawable.permission_tsn_green_background
            r8.setBackgroundResource(r0)
            return
        L15d:
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            boolean r10 = r10.e()
            if (r10 == 0) goto L171
            int r10 = com.acse.ottn.R.mipmap.shandong_select
            r1.setImageResource(r10)
            int r1 = com.acse.ottn.R.drawable.permission_sd_background
            r5.setBackgroundResource(r1)
        L171:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.a()
            if (r1 == 0) goto L185
            int r1 = com.acse.ottn.R.mipmap.shandong_select
            r3.setImageResource(r1)
            int r1 = com.acse.ottn.R.drawable.permission_sd_background
            r7.setBackgroundResource(r1)
        L185:
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L1a4
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.a()
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L1a4
            int r1 = com.acse.ottn.R.mipmap.shandong_select
            r2.setImageResource(r1)
            int r1 = com.acse.ottn.R.drawable.permission_sd_background
            r6.setBackgroundResource(r1)
            goto L1bd
        L1a4:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            int r1 = r1.c(r14)
            if (r1 <= r13) goto L1bd
            int r1 = com.acse.ottn.R.mipmap.premission_location_exceptional
            r2.setImageResource(r1)
            r9.setText(r12)
            int r1 = android.graphics.Color.parseColor(r11)
            r9.setTextColor(r1)
        L1bd:
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.a()
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L1d5
            int r0 = com.acse.ottn.R.mipmap.shandong_select
            r4.setImageResource(r0)
            int r0 = com.acse.ottn.R.drawable.permission_sd_background
            r8.setBackgroundResource(r0)
        L1d5:
            return
    }

    public void a(android.app.Activity r1, android.widget.RelativeLayout r2) {
            r0 = this;
            int r1 = com.acse.ottn.R.drawable.circle_rect_in
            r2.setBackgroundResource(r1)
            return
    }

    public void a(android.app.Activity r1, android.widget.TextView r2) {
            r0 = this;
            java.lang.String r1 = "#DEE2EC"
            int r1 = android.graphics.Color.parseColor(r1)
            r2.setBackgroundColor(r1)
            return
    }

    public void a(android.app.Activity r1, android.widget.TextView r2, android.widget.TextView r3) {
            r0 = this;
            if (r2 == 0) goto L7
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r1)
        L7:
            if (r3 == 0) goto L12
            java.lang.String r1 = "#AAAAAA"
            int r1 = android.graphics.Color.parseColor(r1)
            r3.setTextColor(r1)
        L12:
            return
    }

    public void a(android.app.Activity r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            return
        L3e:
            java.lang.String r3 = "警告"
            r4.setText(r3)
            java.lang.String r3 = "当前必要权限不完整，将无法记录准确的跑步轨迹，可能会影响您的跑步成绩! \n \n您仍然可以开始跑步，但建议您保持程序一直在前台运行，并保持屏幕常亮，以便记录成绩。\n"
            r5.setText(r3)
            java.lang.String r3 = "继续使用"
            r6.setText(r3)
            java.lang.String r3 = "尝试开权限"
            r7.setText(r3)
            return
    }

    public boolean a(android.app.Activity r5, android.widget.ImageView r6, android.widget.ImageView r7, android.widget.ImageView r8, android.widget.ImageView r9, com.acse.ottn.adapter.AutoScrollViewPager r10, android.widget.ImageView r11) {
            r4 = this;
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            r1 = 1
            r2 = 8
            if (r0 == 0) goto L2c
            r10.setVisibility(r2)
            int r5 = com.acse.ottn.R.mipmap.yundong
            r11.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.ydsj_accessiblity_green
            r6.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.ydsj_flow_window_green
            r8.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.ydsj_location_green_position
            r7.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.ydsj_battery_green
            r9.setImageResource(r5)
            return r1
        L2c:
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r3 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L55
            r10.setVisibility(r2)
            int r5 = com.acse.ottn.R.mipmap.accessiblity_green_logo
            r6.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.location_green_position
            r7.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.flow_window_green
            r8.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.bdlp_banner
            r11.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.battery_green_icon
            r9.setImageResource(r5)
            return r1
        L55:
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r3 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L8b
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6e
            goto L8b
        L6e:
            r10.setVisibility(r2)
            int r5 = com.acse.ottn.R.mipmap.accessiblity_green_logo
            r6.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.location_green_position
            r7.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.flow_window_green
            r8.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.banner_6
            r11.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.battery_green_icon
            r9.setImageResource(r5)
            return r1
        L8b:
            r10.setVisibility(r2)
            int r5 = com.acse.ottn.R.mipmap.shandong_fuzhu_s
            r6.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.shandong_dingwei_s
            r7.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.shandong_xuanfu_s
            r8.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.shandong_banner
            r11.setImageResource(r5)
            int r5 = com.acse.ottn.R.mipmap.shandong_houtai_s
            r9.setImageResource(r5)
            return r1
    }

    public java.lang.String b(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r3 = "https://h5.gxapp.iydsj.com/gxapp/privacy_policy/index.html"
            return r3
        Lf:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r3 = "https://www.boxkj.com/resources/user_agreement.html"
            return r3
        L1e:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            java.lang.String r3 = "https://api2.lptiyu.com/v3/api.php/Login/user_privacy"
            return r3
        L2d:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            java.lang.String r3 = "https://mh5.huachenjie.com/h5/contract/document.html?code=502"
            return r3
        L3c:
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            java.lang.String r3 = "https://mh5.huachenjie.com/h5/contract/document.html?code=802"
            return r3
        L4b:
            java.lang.String r3 = ""
            return r3
    }

    public void b(android.app.Activity r3, android.widget.ImageView r4) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            int r3 = com.acse.ottn.R.mipmap.sjxy_warning
            r4.setImageResource(r3)
            return
        L12:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            int r3 = com.acse.ottn.R.mipmap.bdlp_warning
            r4.setImageResource(r3)
            return
        L24:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L3d
            goto L43
        L3d:
            int r3 = com.acse.ottn.R.mipmap.warning
            r4.setImageResource(r3)
            return
        L43:
            int r3 = com.acse.ottn.R.mipmap.sdxy_warning
            r4.setImageResource(r3)
            return
    }

    public void b(android.app.Activity r1, android.widget.RelativeLayout r2) {
            r0 = this;
            java.lang.String r1 = "#F3F3F3"
            int r1 = android.graphics.Color.parseColor(r1)
            r2.setBackgroundColor(r1)
            return
    }

    public void b(android.app.Activity r3, android.widget.TextView r4) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            int r3 = com.acse.ottn.R.drawable.accessibilty_ydsj_green_button
            r4.setBackgroundResource(r3)
            return
        L12:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2b
            goto L31
        L2b:
            int r3 = com.acse.ottn.R.drawable.accessibilty_green_button
            r4.setBackgroundResource(r3)
            return
        L31:
            int r3 = com.acse.ottn.R.drawable.accessibilty_sdxu_button
            r4.setBackgroundResource(r3)
            return
    }

    public java.lang.String c(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L3d
            goto L40
        L3d:
            java.lang.String r3 = "https://www.idazhe.net/course/snt-privacyagreement?name=省钱助手"
            return r3
        L40:
            java.lang.String r3 = "https://www.idazhe.net/course/snt-privacyagreement?name=DETN"
            return r3
    }

    public void c(android.app.Activity r2, android.widget.TextView r3) {
            r1 = this;
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.r
            boolean r2 = r2.equals(r0)
            r0 = 0
            if (r2 == 0) goto L11
            r3.setVisibility(r0)
            return
        L11:
            r3.setVisibility(r0)
            return
    }

    public java.lang.String d(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r3 = "https://h5.gxapp.iydsj.com/gxapp/privacy_policy/userService.html"
            return r3
        Lf:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r3 = "https://www.boxkj.com/resources/user_agreement_info.html"
            return r3
        L1e:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            java.lang.String r3 = "https://api2.lptiyu.com/v3/api.php/Login/user_notice"
            return r3
        L2d:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            java.lang.String r3 = "https://mh5.huachenjie.com/h5/contract/document.html?code=501"
            return r3
        L3c:
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            java.lang.String r3 = "https://mh5.huachenjie.com/h5/contract/document.html?code=801"
            return r3
        L4b:
            java.lang.String r3 = ""
            return r3
    }

    public void d(android.app.Activity r3, android.widget.TextView r4) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.String r3 = "#5FCA8B"
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setTextColor(r3)
            return
        L16:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2f
            goto L39
        L2f:
            java.lang.String r3 = "#3ECDA1"
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setTextColor(r3)
            return
        L39:
            java.lang.String r3 = "#650AEC"
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setTextColor(r3)
            return
    }

    public java.lang.String e(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.v
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L3d
            goto L40
        L3d:
            java.lang.String r3 = "https://www.idazhe.net/course/snt-serviceagreement?name=省钱助手"
            return r3
        L40:
            java.lang.String r3 = "https://www.idazhe.net/course/snt-serviceagreement?name=DETN"
            return r3
    }

    public java.lang.String f(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r3 = "#5FCA8B"
            return r3
        Lf:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = com.acse.ottn.l0.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r0 = com.acse.ottn.l0.t
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L28
            goto L2b
        L28:
            java.lang.String r3 = "#3ECDA1"
            return r3
        L2b:
            java.lang.String r3 = "#650AEC"
            return r3
    }
}
