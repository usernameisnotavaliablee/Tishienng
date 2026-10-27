package com.facebook.rebound.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SpringConfiguratorView extends android.widget.FrameLayout {
    private static final int n = 100000;
    private static final float o = 0.0f;
    private static final float p = 200.0f;
    private static final float q = 0.0f;
    private static final float r = 50.0f;
    private static final java.text.DecimalFormat s = null;
    private final com.facebook.rebound.ui.SpringConfiguratorView.SpinnerAdapter a;
    private final java.util.List<com.facebook.rebound.SpringConfig> b;
    private final com.facebook.rebound.Spring c;
    private final float d;
    private final float e;
    private final com.facebook.rebound.SpringConfigRegistry f;
    private final int g;
    private android.widget.SeekBar h;
    private android.widget.SeekBar i;
    private android.widget.Spinner j;
    private android.widget.TextView k;
    private android.widget.TextView l;
    private com.facebook.rebound.SpringConfig m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.facebook.rebound.ui.SpringConfiguratorView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class OnNubTouchListener implements android.view.View.OnTouchListener {
        final /* synthetic */ com.facebook.rebound.ui.SpringConfiguratorView a;

        private OnNubTouchListener(com.facebook.rebound.ui.SpringConfiguratorView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ OnNubTouchListener(com.facebook.rebound.ui.SpringConfiguratorView r1, com.facebook.rebound.ui.SpringConfiguratorView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                int r1 = r2.getAction()
                if (r1 != 0) goto Lb
                com.facebook.rebound.ui.SpringConfiguratorView r1 = r0.a
                com.facebook.rebound.ui.SpringConfiguratorView.c(r1)
            Lb:
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class RevealerSpringListener implements com.facebook.rebound.SpringListener {
        final /* synthetic */ com.facebook.rebound.ui.SpringConfiguratorView a;

        private RevealerSpringListener(com.facebook.rebound.ui.SpringConfiguratorView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ RevealerSpringListener(com.facebook.rebound.ui.SpringConfiguratorView r1, com.facebook.rebound.ui.SpringConfiguratorView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.facebook.rebound.SpringListener
        public void onSpringActivate(com.facebook.rebound.Spring r1) {
                r0 = this;
                return
        }

        @Override // com.facebook.rebound.SpringListener
        public void onSpringAtRest(com.facebook.rebound.Spring r1) {
                r0 = this;
                return
        }

        @Override // com.facebook.rebound.SpringListener
        public void onSpringEndStateChange(com.facebook.rebound.Spring r1) {
                r0 = this;
                return
        }

        @Override // com.facebook.rebound.SpringListener
        public void onSpringUpdate(com.facebook.rebound.Spring r3) {
                r2 = this;
                double r0 = r3.f()
                float r3 = (float) r0
                com.facebook.rebound.ui.SpringConfiguratorView r0 = r2.a
                float r0 = com.facebook.rebound.ui.SpringConfiguratorView.d(r0)
                com.facebook.rebound.ui.SpringConfiguratorView r1 = r2.a
                float r1 = com.facebook.rebound.ui.SpringConfiguratorView.e(r1)
                float r1 = r1 - r0
                float r3 = r3 * r1
                float r3 = r3 + r0
                com.facebook.rebound.ui.SpringConfiguratorView r0 = r2.a
                r0.setTranslationY(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class SeekbarListener implements android.widget.SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ com.facebook.rebound.ui.SpringConfiguratorView a;

        private SeekbarListener(com.facebook.rebound.ui.SpringConfiguratorView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ SeekbarListener(com.facebook.rebound.ui.SpringConfiguratorView r1, com.facebook.rebound.ui.SpringConfiguratorView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r8, int r9, boolean r10) {
                r7 = this;
                com.facebook.rebound.ui.SpringConfiguratorView r10 = r7.a
                android.widget.SeekBar r10 = com.facebook.rebound.ui.SpringConfiguratorView.k(r10)
                r0 = 0
                r1 = 1203982336(0x47c35000, float:100000.0)
                if (r8 != r10) goto L42
                float r10 = (float) r9
                r2 = 1128792064(0x43480000, float:200.0)
                float r10 = r10 * r2
                float r10 = r10 / r1
                float r10 = r10 + r0
                com.facebook.rebound.ui.SpringConfiguratorView r2 = r7.a
                com.facebook.rebound.SpringConfig r2 = com.facebook.rebound.ui.SpringConfiguratorView.g(r2)
                double r3 = (double) r10
                double r5 = com.facebook.rebound.OrigamiValueConverter.d(r3)
                r2.b = r5
                java.text.DecimalFormat r10 = com.facebook.rebound.ui.SpringConfiguratorView.l()
                java.lang.String r10 = r10.format(r3)
                com.facebook.rebound.ui.SpringConfiguratorView r2 = r7.a
                android.widget.TextView r2 = com.facebook.rebound.ui.SpringConfiguratorView.m(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "T:"
                r3.append(r4)
                r3.append(r10)
                java.lang.String r10 = r3.toString()
                r2.setText(r10)
            L42:
                com.facebook.rebound.ui.SpringConfiguratorView r10 = r7.a
                android.widget.SeekBar r10 = com.facebook.rebound.ui.SpringConfiguratorView.a(r10)
                if (r8 != r10) goto L80
                float r8 = (float) r9
                r9 = 1112014848(0x42480000, float:50.0)
                float r8 = r8 * r9
                float r8 = r8 / r1
                float r8 = r8 + r0
                com.facebook.rebound.ui.SpringConfiguratorView r9 = r7.a
                com.facebook.rebound.SpringConfig r9 = com.facebook.rebound.ui.SpringConfiguratorView.g(r9)
                double r0 = (double) r8
                double r2 = com.facebook.rebound.OrigamiValueConverter.a(r0)
                r9.a = r2
                java.text.DecimalFormat r8 = com.facebook.rebound.ui.SpringConfiguratorView.l()
                java.lang.String r8 = r8.format(r0)
                com.facebook.rebound.ui.SpringConfiguratorView r9 = r7.a
                android.widget.TextView r9 = com.facebook.rebound.ui.SpringConfiguratorView.b(r9)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "F:"
                r10.append(r0)
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                r9.setText(r8)
            L80:
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class SpinnerAdapter extends android.widget.BaseAdapter {
        private final android.content.Context a;
        private final java.util.List<java.lang.String> b;
        final /* synthetic */ com.facebook.rebound.ui.SpringConfiguratorView c;

        public SpinnerAdapter(com.facebook.rebound.ui.SpringConfiguratorView r1, android.content.Context r2) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.b = r1
                return
        }

        public void a(java.lang.String r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.b
                r0.add(r2)
                r1.notifyDataSetChanged()
                return
        }

        public void b() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.b
                r0.clear()
                r1.notifyDataSetChanged()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.b
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.b
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                if (r3 != 0) goto L2b
                android.widget.TextView r3 = new android.widget.TextView
                android.content.Context r4 = r1.a
                r3.<init>(r4)
                android.widget.AbsListView$LayoutParams r4 = new android.widget.AbsListView$LayoutParams
                r0 = -1
                r4.<init>(r0, r0)
                r3.setLayoutParams(r4)
                com.facebook.rebound.ui.SpringConfiguratorView r4 = r1.c
                android.content.res.Resources r4 = r4.getResources()
                r0 = 1094713344(0x41400000, float:12.0)
                int r4 = com.facebook.rebound.ui.Util.f(r0, r4)
                r3.setPadding(r4, r4, r4, r4)
                com.facebook.rebound.ui.SpringConfiguratorView r4 = r1.c
                int r4 = com.facebook.rebound.ui.SpringConfiguratorView.f(r4)
                r3.setTextColor(r4)
                goto L2d
            L2b:
                android.widget.TextView r3 = (android.widget.TextView) r3
            L2d:
                java.util.List<java.lang.String> r4 = r1.b
                java.lang.Object r2 = r4.get(r2)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r3.setText(r2)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class SpringSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        final /* synthetic */ com.facebook.rebound.ui.SpringConfiguratorView a;

        private SpringSelectedListener(com.facebook.rebound.ui.SpringConfiguratorView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ SpringSelectedListener(com.facebook.rebound.ui.SpringConfiguratorView r1, com.facebook.rebound.ui.SpringConfiguratorView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.facebook.rebound.ui.SpringConfiguratorView r1 = r0.a
                java.util.List r2 = com.facebook.rebound.ui.SpringConfiguratorView.i(r1)
                java.lang.Object r2 = r2.get(r3)
                com.facebook.rebound.SpringConfig r2 = (com.facebook.rebound.SpringConfig) r2
                com.facebook.rebound.ui.SpringConfiguratorView.h(r1, r2)
                com.facebook.rebound.ui.SpringConfiguratorView r1 = r0.a
                com.facebook.rebound.SpringConfig r2 = com.facebook.rebound.ui.SpringConfiguratorView.g(r1)
                com.facebook.rebound.ui.SpringConfiguratorView.j(r1, r2)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    static {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#.#"
            r0.<init>(r1)
            com.facebook.rebound.ui.SpringConfiguratorView.s = r0
            return
    }

    public SpringConfiguratorView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SpringConfiguratorView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @android.annotation.TargetApi(11)
    public SpringConfiguratorView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.b = r7
            r7 = 255(0xff, float:3.57E-43)
            r8 = 225(0xe1, float:3.15E-43)
            int r7 = android.graphics.Color.argb(r7, r8, r8, r8)
            r5.g = r7
            com.facebook.rebound.SpringSystem r7 = com.facebook.rebound.SpringSystem.m()
            com.facebook.rebound.SpringConfigRegistry r8 = com.facebook.rebound.SpringConfigRegistry.c()
            r5.f = r8
            com.facebook.rebound.ui.SpringConfiguratorView$SpinnerAdapter r8 = new com.facebook.rebound.ui.SpringConfiguratorView$SpinnerAdapter
            r8.<init>(r5, r6)
            r5.a = r8
            android.content.res.Resources r0 = r5.getResources()
            r1 = 1109393408(0x42200000, float:40.0)
            int r1 = com.facebook.rebound.ui.Util.f(r1, r0)
            float r1 = (float) r1
            r5.e = r1
            r1 = 1133248512(0x438c0000, float:280.0)
            int r0 = com.facebook.rebound.ui.Util.f(r1, r0)
            float r0 = (float) r0
            r5.d = r0
            com.facebook.rebound.Spring r7 = r7.d()
            r5.c = r7
            com.facebook.rebound.ui.SpringConfiguratorView$RevealerSpringListener r1 = new com.facebook.rebound.ui.SpringConfiguratorView$RevealerSpringListener
            r2 = 0
            r1.<init>(r5, r2)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.facebook.rebound.Spring r7 = r7.v(r3)
            com.facebook.rebound.Spring r7 = r7.x(r3)
            r7.a(r1)
            android.view.View r6 = r5.o(r6)
            r5.addView(r6)
            com.facebook.rebound.ui.SpringConfiguratorView$SeekbarListener r6 = new com.facebook.rebound.ui.SpringConfiguratorView$SeekbarListener
            r6.<init>(r5, r2)
            android.widget.SeekBar r7 = r5.h
            r1 = 100000(0x186a0, float:1.4013E-40)
            r7.setMax(r1)
            android.widget.SeekBar r7 = r5.h
            r7.setOnSeekBarChangeListener(r6)
            android.widget.SeekBar r7 = r5.i
            r7.setMax(r1)
            android.widget.SeekBar r7 = r5.i
            r7.setOnSeekBarChangeListener(r6)
            android.widget.Spinner r6 = r5.j
            r6.setAdapter(r8)
            android.widget.Spinner r6 = r5.j
            com.facebook.rebound.ui.SpringConfiguratorView$SpringSelectedListener r7 = new com.facebook.rebound.ui.SpringConfiguratorView$SpringSelectedListener
            r7.<init>(r5, r2)
            r6.setOnItemSelectedListener(r7)
            r5.p()
            r5.setTranslationY(r0)
            return
    }

    static /* synthetic */ android.widget.SeekBar a(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            android.widget.SeekBar r0 = r0.i
            return r0
    }

    static /* synthetic */ android.widget.TextView b(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            android.widget.TextView r0 = r0.k
            return r0
    }

    static /* synthetic */ void c(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            r0.q()
            return
    }

    static /* synthetic */ float d(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            float r0 = r0.e
            return r0
    }

    static /* synthetic */ float e(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            float r0 = r0.d
            return r0
    }

    static /* synthetic */ int f(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            int r0 = r0.g
            return r0
    }

    static /* synthetic */ com.facebook.rebound.SpringConfig g(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            com.facebook.rebound.SpringConfig r0 = r0.m
            return r0
    }

    static /* synthetic */ com.facebook.rebound.SpringConfig h(com.facebook.rebound.ui.SpringConfiguratorView r0, com.facebook.rebound.SpringConfig r1) {
            r0.m = r1
            return r1
    }

    static /* synthetic */ java.util.List i(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            java.util.List<com.facebook.rebound.SpringConfig> r0 = r0.b
            return r0
    }

    static /* synthetic */ void j(com.facebook.rebound.ui.SpringConfiguratorView r0, com.facebook.rebound.SpringConfig r1) {
            r0.r(r1)
            return
    }

    static /* synthetic */ android.widget.SeekBar k(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            android.widget.SeekBar r0 = r0.h
            return r0
    }

    static /* synthetic */ java.text.DecimalFormat l() {
            java.text.DecimalFormat r0 = com.facebook.rebound.ui.SpringConfiguratorView.s
            return r0
    }

    static /* synthetic */ android.widget.TextView m(com.facebook.rebound.ui.SpringConfiguratorView r0) {
            android.widget.TextView r0 = r0.l
            return r0
    }

    private android.view.View o(android.content.Context r15) {
            r14 = this;
            android.content.res.Resources r0 = r14.getResources()
            r1 = 1084227584(0x40a00000, float:5.0)
            int r1 = com.facebook.rebound.ui.Util.f(r1, r0)
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = com.facebook.rebound.ui.Util.f(r2, r0)
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.facebook.rebound.ui.Util.f(r3, r0)
            android.widget.TableLayout$LayoutParams r4 = new android.widget.TableLayout$LayoutParams
            r5 = -2
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r4.<init>(r7, r5, r6)
            r4.setMargins(r7, r7, r1, r7)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r15)
            r5 = 1133903872(0x43960000, float:300.0)
            int r5 = com.facebook.rebound.ui.Util.f(r5, r0)
            r6 = -1
            android.widget.FrameLayout$LayoutParams r5 = com.facebook.rebound.ui.Util.a(r6, r5)
            r1.setLayoutParams(r5)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r15)
            android.widget.FrameLayout$LayoutParams r8 = com.facebook.rebound.ui.Util.b()
            r8.setMargins(r7, r3, r7, r7)
            r5.setLayoutParams(r8)
            r8 = 100
            int r8 = android.graphics.Color.argb(r8, r7, r7, r7)
            r5.setBackgroundColor(r8)
            r1.addView(r5)
            android.widget.Spinner r8 = new android.widget.Spinner
            r8.<init>(r15, r7)
            r14.j = r8
            android.widget.FrameLayout$LayoutParams r8 = com.facebook.rebound.ui.Util.c()
            r9 = 48
            r8.gravity = r9
            r8.setMargins(r2, r2, r2, r7)
            android.widget.Spinner r9 = r14.j
            r9.setLayoutParams(r8)
            android.widget.Spinner r8 = r14.j
            r5.addView(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r15)
            android.widget.FrameLayout$LayoutParams r9 = com.facebook.rebound.ui.Util.c()
            r10 = 1117782016(0x42a00000, float:80.0)
            int r10 = com.facebook.rebound.ui.Util.f(r10, r0)
            r9.setMargins(r7, r7, r7, r10)
            r10 = 80
            r9.gravity = r10
            r8.setLayoutParams(r9)
            r9 = 1
            r8.setOrientation(r9)
            r5.addView(r8)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r15)
            android.widget.FrameLayout$LayoutParams r10 = com.facebook.rebound.ui.Util.c()
            r10.setMargins(r2, r2, r2, r3)
            r5.setPadding(r2, r2, r2, r2)
            r5.setLayoutParams(r10)
            r5.setOrientation(r7)
            r8.addView(r5)
            android.widget.SeekBar r10 = new android.widget.SeekBar
            r10.<init>(r15)
            r14.h = r10
            r10.setLayoutParams(r4)
            android.widget.SeekBar r10 = r14.h
            r5.addView(r10)
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r11 = r14.getContext()
            r10.<init>(r11)
            r14.l = r10
            int r11 = r14.g
            r10.setTextColor(r11)
            r10 = 1112014848(0x42480000, float:50.0)
            int r11 = com.facebook.rebound.ui.Util.f(r10, r0)
            android.widget.FrameLayout$LayoutParams r11 = com.facebook.rebound.ui.Util.a(r11, r6)
            android.widget.TextView r12 = r14.l
            r13 = 19
            r12.setGravity(r13)
            android.widget.TextView r12 = r14.l
            r12.setLayoutParams(r11)
            android.widget.TextView r11 = r14.l
            r11.setMaxLines(r9)
            android.widget.TextView r11 = r14.l
            r5.addView(r11)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r15)
            android.widget.FrameLayout$LayoutParams r11 = com.facebook.rebound.ui.Util.c()
            r11.setMargins(r2, r2, r2, r3)
            r5.setPadding(r2, r2, r2, r2)
            r5.setLayoutParams(r11)
            r5.setOrientation(r7)
            r8.addView(r5)
            android.widget.SeekBar r2 = new android.widget.SeekBar
            r2.<init>(r15)
            r14.i = r2
            r2.setLayoutParams(r4)
            android.widget.SeekBar r2 = r14.i
            r5.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r3 = r14.getContext()
            r2.<init>(r3)
            r14.k = r2
            int r3 = r14.g
            r2.setTextColor(r3)
            int r2 = com.facebook.rebound.ui.Util.f(r10, r0)
            android.widget.FrameLayout$LayoutParams r2 = com.facebook.rebound.ui.Util.a(r2, r6)
            android.widget.TextView r3 = r14.k
            r3.setGravity(r13)
            android.widget.TextView r3 = r14.k
            r3.setLayoutParams(r2)
            android.widget.TextView r2 = r14.k
            r2.setMaxLines(r9)
            android.widget.TextView r2 = r14.k
            r5.addView(r2)
            android.view.View r2 = new android.view.View
            r2.<init>(r15)
            r15 = 1114636288(0x42700000, float:60.0)
            int r15 = com.facebook.rebound.ui.Util.f(r15, r0)
            r3 = 1109393408(0x42200000, float:40.0)
            int r0 = com.facebook.rebound.ui.Util.f(r3, r0)
            android.widget.FrameLayout$LayoutParams r15 = com.facebook.rebound.ui.Util.a(r15, r0)
            r0 = 49
            r15.gravity = r0
            r2.setLayoutParams(r15)
            com.facebook.rebound.ui.SpringConfiguratorView$OnNubTouchListener r15 = new com.facebook.rebound.ui.SpringConfiguratorView$OnNubTouchListener
            r0 = 0
            r15.<init>(r14, r0)
            r2.setOnTouchListener(r15)
            r15 = 164(0xa4, float:2.3E-43)
            r0 = 209(0xd1, float:2.93E-43)
            r3 = 255(0xff, float:3.57E-43)
            int r15 = android.graphics.Color.argb(r3, r7, r15, r0)
            r2.setBackgroundColor(r15)
            r1.addView(r2)
            return r1
    }

    private void q() {
            r6 = this;
            com.facebook.rebound.Spring r0 = r6.c
            double r0 = r0.h()
            com.facebook.rebound.Spring r2 = r6.c
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            r3 = 0
        L10:
            r2.x(r3)
            return
    }

    private void r(com.facebook.rebound.SpringConfig r6) {
            r5 = this;
            double r0 = r6.b
            double r0 = com.facebook.rebound.OrigamiValueConverter.c(r0)
            float r0 = (float) r0
            r1 = 0
            float r0 = r0 - r1
            r2 = 1203982336(0x47c35000, float:100000.0)
            float r0 = r0 * r2
            r3 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            double r3 = r6.a
            double r3 = com.facebook.rebound.OrigamiValueConverter.b(r3)
            float r6 = (float) r3
            float r6 = r6 - r1
            float r6 = r6 * r2
            r1 = 1112014848(0x42480000, float:50.0)
            float r6 = r6 / r1
            int r6 = java.lang.Math.round(r6)
            android.widget.SeekBar r1 = r5.h
            r1.setProgress(r0)
            android.widget.SeekBar r0 = r5.i
            r0.setProgress(r6)
            return
    }

    public void n() {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lb
            r0.removeView(r1)
        Lb:
            com.facebook.rebound.Spring r0 = r1.c
            r0.d()
            return
    }

    public void p() {
            r5 = this;
            com.facebook.rebound.SpringConfigRegistry r0 = r5.f
            java.util.Map r0 = r0.b()
            com.facebook.rebound.ui.SpringConfiguratorView$SpinnerAdapter r1 = r5.a
            r1.b()
            java.util.List<com.facebook.rebound.SpringConfig> r1 = r5.b
            r1.clear()
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.facebook.rebound.SpringConfig r4 = com.facebook.rebound.SpringConfig.c
            if (r3 != r4) goto L2d
            goto L18
        L2d:
            java.util.List<com.facebook.rebound.SpringConfig> r3 = r5.b
            java.lang.Object r4 = r2.getKey()
            r3.add(r4)
            com.facebook.rebound.ui.SpringConfiguratorView$SpinnerAdapter r3 = r5.a
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.a(r2)
            goto L18
        L42:
            java.util.List<com.facebook.rebound.SpringConfig> r1 = r5.b
            com.facebook.rebound.SpringConfig r2 = com.facebook.rebound.SpringConfig.c
            r1.add(r2)
            com.facebook.rebound.ui.SpringConfiguratorView$SpinnerAdapter r1 = r5.a
            com.facebook.rebound.SpringConfig r2 = com.facebook.rebound.SpringConfig.c
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            com.facebook.rebound.ui.SpringConfiguratorView$SpinnerAdapter r0 = r5.a
            r0.notifyDataSetChanged()
            java.util.List<com.facebook.rebound.SpringConfig> r0 = r5.b
            int r0 = r0.size()
            if (r0 <= 0) goto L69
            android.widget.Spinner r0 = r5.j
            r1 = 0
            r0.setSelection(r1)
        L69:
            return
    }
}
