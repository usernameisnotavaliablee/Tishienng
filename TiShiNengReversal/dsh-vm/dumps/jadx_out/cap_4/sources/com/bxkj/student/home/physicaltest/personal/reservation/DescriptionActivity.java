package com.bxkj.student.home.physicaltest.personal.reservation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DescriptionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.smartwebview.SmartWebView Y;
    private android.widget.Button Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a$a, reason: collision with other inner class name */
        class CountDownTimerC0079a extends android.os.CountDownTimer {
            final /* synthetic */ com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.a a;

            CountDownTimerC0079a(com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.a r1, long r2, long r4) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2, r4)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                    r2 = this;
                    com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a r0 = r2.a
                    com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.g0(r0)
                    r1 = 1
                    r0.setEnabled(r1)
                    com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a r0 = r2.a
                    com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.g0(r0)
                    java.lang.String r1 = "开始预约"
                    r0.setText(r1)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onTick(long r5) {
                    r4 = this;
                    com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a r0 = r4.a
                    com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.g0(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "开始预约("
                    r1.append(r2)
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 / r2
                    r1.append(r5)
                    java.lang.String r5 = "秒)"
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.setText(r5)
                    return
            }
        }

        a(com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r9) {
                r8 = this;
                com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0 = r8.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.h0(r0)
                java.lang.String r2 = "content"
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r2)
                r0.h(r9)
                com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r9 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r9 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.h0(r9)
                android.webkit.WebView r9 = r9.getWebView()
                android.webkit.WebSettings r9 = r9.getSettings()
                android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.LARGEST
                r9.setTextSize(r0)
                com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.g0(r9)
                r9.setEnabled(r1)
                com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a$a r2 = new com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a$a
                r4 = 4000(0xfa0, double:1.9763E-320)
                r6 = 1000(0x3e8, double:4.94E-321)
                r3 = r8
                r2.<init>(r3, r4, r6)
                r2.start()
                return
        }
    }

    public DescriptionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button g0(com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0) {
            android.widget.Button r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView h0(com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.Y
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492998(0x7f0c0086, float:1.8609464E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.P()
            r1 = 8
            r0.setVisibility(r1)
            android.widget.Button r0 = r4.Z
            java.lang.String r1 = "开始预约"
            r0.setText(r1)
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = "1"
            rx.e r1 = r1.z(r3, r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a r1 = new com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "预约说明"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296646(0x7f090186, float:1.8211215E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            r1 = 2131298609(0x7f090931, float:1.8215196E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            if (r3 == r0) goto La
            return
        La:
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity> r1 = com.bxkj.student.home.physicaltest.personal.reservation.ReservationListActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            r2.startActivity(r3)
            r2.finish()
            return
    }
}
