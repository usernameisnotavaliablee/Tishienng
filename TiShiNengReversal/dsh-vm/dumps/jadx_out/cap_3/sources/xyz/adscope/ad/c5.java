package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c5 implements xyz.adscope.ad.a4 {
    private final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel a;
    private final xyz.adscope.ad.b5 b;
    private final android.content.Context c;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.o2> d;
    private final java.lang.String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private android.widget.RelativeLayout.LayoutParams m;
    private int n;
    private int o;
    private int p;
    private int q;
    private xyz.adscope.ad.o2 r;
    private boolean s;
    private xyz.adscope.ad.a4.a t;
    private boolean u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static int a(android.content.Context r6, android.widget.TextView r7) {
                r0 = 0
                if (r7 == 0) goto L35
                int r1 = r7.getLineCount()
                r2 = 1
                if (r1 <= 0) goto Lf
                int r1 = r7.getLineCount()
                goto L10
            Lf:
                r1 = 1
            L10:
                float r3 = r7.getLineSpacingExtra()
                float r4 = r7.getLineSpacingMultiplier()
                android.text.TextPaint r7 = r7.getPaint()
                android.graphics.Paint$FontMetricsInt r7 = r7.getFontMetricsInt()
                int r5 = r7.bottom
                int r7 = r7.top
                int r5 = r5 - r7
                float r3 = r3 * r4
                int r6 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r6, r3)
                if (r1 < r2) goto L2f
                int r0 = r1 + (-1)
            L2f:
                int r5 = r5 * r1
                int r6 = r6 * r0
                int r5 = r5 + r6
                return r5
            L35:
                return r0
        }
    }

    public c5(android.content.Context r3, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r4, xyz.adscope.ad.b5 r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.l = r0
            r1 = 0
            r2.r = r1
            r2.s = r0
            r2.u = r0
            r2.c = r3
            r2.a = r4
            r2.b = r5
            r2.e = r6
            java.util.Map r3 = r5.h()
            r2.d = r3
            return
    }

    private void a(java.lang.String r5) {
            r4 = this;
            xyz.adscope.ad.b5 r0 = r4.b
            java.util.List r0 = r0.g()
            if (r0 == 0) goto L79
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L79
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            xyz.adscope.ad.o2 r1 = (xyz.adscope.ad.o2) r1
            xyz.adscope.ad.a4 r2 = r1.a()
            java.lang.String r3 = "height"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L2f
            int r3 = r4.k
            r2.c(r3)
        L2f:
            java.lang.String r3 = "width"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L3c
            int r3 = r4.j
            r2.b(r3)
        L3c:
            java.lang.String r3 = "temp"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L4f
            boolean r3 = r1.b()
            if (r3 == 0) goto L4f
            int r3 = r4.o
            r2.c(r3)
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.e()
            r2.append(r1)
            java.lang.String r1 = " 设置宽高 "
            r2.append(r1)
            int r1 = r4.k
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            int r1 = r4.j
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r2, r1)
            goto L12
        L79:
            return
    }

    private void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r3) {
            r2 = this;
            r0 = -2
            int r3 = r2.c(r3)     // Catch: xyz.adscope.ad.z4 -> L8
            r2.k = r3     // Catch: xyz.adscope.ad.z4 -> L8
            goto La
        L8:
            r2.k = r0
        La:
            int r3 = r2.k
            if (r3 > 0) goto L17
            int r3 = r2.k()     // Catch: xyz.adscope.ad.z4 -> L15
            r2.k = r3     // Catch: xyz.adscope.ad.z4 -> L15
            goto L17
        L15:
            r2.k = r0
        L17:
            int r3 = r2.k
            if (r3 > 0) goto L26
            java.lang.String r3 = "temp"
            r2.a(r3)
            int r3 = r2.l()
            r2.k = r3
        L26:
            r2.j()     // Catch: xyz.adscope.ad.z4 -> L65
            boolean r3 = r2.s     // Catch: xyz.adscope.ad.z4 -> L65
            if (r3 == 0) goto L43
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r3 = r2.a     // Catch: xyz.adscope.ad.z4 -> L65
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r3 = r3.j()     // Catch: xyz.adscope.ad.z4 -> L65
            java.lang.String r3 = r3.c()     // Catch: xyz.adscope.ad.z4 -> L65
            float r3 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r3)     // Catch: xyz.adscope.ad.z4 -> L65
            int r1 = r2.k     // Catch: xyz.adscope.ad.z4 -> L65
            float r1 = (float) r1     // Catch: xyz.adscope.ad.z4 -> L65
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: xyz.adscope.ad.z4 -> L65
            r2.j = r3     // Catch: xyz.adscope.ad.z4 -> L65
        L43:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            xyz.adscope.ad.b5 r0 = r2.b
            java.lang.String r0 = r0.e()
            r3.append(r0)
            java.lang.String r0 = " calculate self height "
            r3.append(r0)
            int r0 = r2.k
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r0, r3)
            return
        L65:
            r2.k = r0
            xyz.adscope.ad.z4 r3 = new xyz.adscope.ad.z4
            java.lang.String r0 = "高度无法修正..."
            r3.<init>(r0)
            throw r3
    }

    private void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r3, java.lang.String r4, android.widget.RelativeLayout.LayoutParams r5) {
            r2 = this;
            if (r3 == 0) goto L39
            java.lang.String r0 = "x"
            boolean r0 = r0.equals(r4)
            r1 = -1
            if (r0 == 0) goto L10
            r0 = 14
            r5.addRule(r0, r1)
        L10:
            java.lang.String r0 = "y"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L39
            r4 = 15
            r5.addRule(r4, r1)
            java.lang.String r3 = r3.b()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L39
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r4 = r2.d
            java.lang.Object r4 = r4.get(r3)
            xyz.adscope.ad.o2 r4 = (xyz.adscope.ad.o2) r4
            if (r4 == 0) goto L39
            int r3 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r3)
            r4 = 4
            r5.addRule(r4, r3)
        L39:
            return
    }

    private void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r5, java.lang.String r6, android.widget.RelativeLayout.LayoutParams r7, int r8) {
            r4 = this;
            if (r5 == 0) goto L52
            java.lang.String r0 = r5.c()
            java.lang.String r1 = r5.b()
            java.lang.String r5 = r5.a()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            boolean r2 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r0)
            if (r2 == 0) goto L52
            float r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r0)
            java.lang.String r3 = "super"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L52
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L52
            boolean r5 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r0)
            if (r5 == 0) goto L3d
            if (r8 <= 0) goto L3d
            float r5 = java.lang.Math.abs(r2)
            float r8 = (float) r8
            float r5 = r5 * r8
            int r5 = (int) r5
            goto L3e
        L3d:
            r5 = 0
        L3e:
            java.lang.String r8 = "top"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L48
            r7.topMargin = r5
        L48:
            java.lang.String r8 = "bottom"
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L52
            r7.bottomMargin = r5
        L52:
            return
    }

    private int b(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L4e
            r4.getClass()
            int r0 = r4.hashCode()
            r2 = -1
            switch(r0) {
                case -1383228885: goto L34;
                case 115029: goto L29;
                case 3317767: goto L1e;
                case 108511772: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r0 = "right"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1c
            goto L3e
        L1c:
            r2 = 3
            goto L3e
        L1e:
            java.lang.String r0 = "left"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L27
            goto L3e
        L27:
            r2 = 2
            goto L3e
        L29:
            java.lang.String r0 = "top"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L32
            goto L3e
        L32:
            r2 = 1
            goto L3e
        L34:
            java.lang.String r0 = "bottom"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r2 = 0
        L3e:
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L48;
                case 2: goto L45;
                case 3: goto L42;
                default: goto L41;
            }
        L41:
            return r1
        L42:
            int r4 = r3.i
            return r4
        L45:
            int r4 = r3.h
            return r4
        L48:
            int r4 = r3.g
            return r4
        L4b:
            int r4 = r3.f
            return r4
        L4e:
            return r1
    }

    private void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r9) {
            r8 = this;
            if (r9 == 0) goto L138
            java.lang.String r0 = r9.c()
            java.lang.String r1 = r9.b()
            java.lang.String r9 = r9.a()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = -2
            if (r2 != 0) goto L135
            boolean r2 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r0)
            java.lang.String r4 = "RenderParams"
            if (r2 == 0) goto L116
            float r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r0)
            java.lang.String r2 = "own"
            boolean r2 = r2.equalsIgnoreCase(r1)
            java.lang.String r5 = " : "
            java.lang.String r6 = "height"
            if (r2 == 0) goto L65
            boolean r9 = r6.equalsIgnoreCase(r9)
            if (r9 == 0) goto L135
            int r9 = r8.k
            if (r9 <= 0) goto L5b
            float r9 = (float) r9
            float r1 = java.lang.Math.abs(r0)
            float r9 = r9 * r1
            int r3 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "宽度根据[定高] * 百分比计算 "
            r9.append(r1)
            r9.append(r0)
            r9.append(r5)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r4, r9)
            goto L135
        L5b:
            java.lang.String r9 = "宽度根据[高]计算, 但高度不定..."
            xyz.adscope.common.v2.log.SDKLog.renderError(r4, r9)
            r9 = 1
            r8.s = r9
            goto L135
        L65:
            java.lang.String r2 = "super"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Lab
            float r1 = java.lang.Math.abs(r0)
            int r2 = r8.n
            float r3 = (float) r2
            float r1 = r1 * r3
            int r1 = (int) r1
            int r3 = r8.h
            int r6 = r1 + r3
            int r7 = r8.i
            int r6 = r6 + r7
            if (r6 <= r2) goto L84
            int r2 = r2 - r3
            int r2 = r2 - r7
            r3 = r2
            goto L85
        L84:
            r3 = r1
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "宽度根据父布局 * 百分比计算 "
            r1.append(r2)
            r1.append(r0)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r4, r1)
            int r9 = r8.b(r9)
            if (r9 <= 0) goto L135
            float r9 = (float) r9
            float r0 = r0 * r9
            int r3 = (int) r0
            goto L135
        Lab:
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r2 = r8.d
            if (r2 == 0) goto L135
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L135
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r2 = r8.d
            java.lang.Object r1 = r2.get(r1)
            xyz.adscope.ad.o2 r1 = (xyz.adscope.ad.o2) r1
            if (r1 == 0) goto L135
            java.lang.String r2 = "width"
            boolean r2 = r2.equalsIgnoreCase(r9)
            if (r2 == 0) goto Leb
            xyz.adscope.ad.a4 r2 = r1.a()
            int r2 = r2.b()
            float r2 = (float) r2
            float r3 = java.lang.Math.abs(r0)
            float r2 = r2 * r3
            int r3 = (int) r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "宽度根据其他view的[宽]计算 "
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r4, r2)
        Leb:
            boolean r9 = r6.equalsIgnoreCase(r9)
            if (r9 == 0) goto L135
            xyz.adscope.ad.a4 r9 = r1.a()
            int r9 = r9.g()
            float r9 = (float) r9
            float r0 = java.lang.Math.abs(r0)
            float r9 = r9 * r0
            int r3 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "宽度根据其他view的[高]计算 "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r4, r9)
            goto L135
        L116:
            android.content.Context r9 = r8.c
            int r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
            float r0 = (float) r0
            int r3 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r9, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "宽度根据model固定值计算 "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r4, r9)
        L135:
            r8.j = r3
            return
        L138:
            int r9 = r8.n
            int r0 = r8.h
            int r9 = r9 - r0
            int r0 = r8.i
            int r9 = r9 - r0
            r8.j = r9
            return
    }

    private void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r18, java.lang.String r19, android.widget.RelativeLayout.LayoutParams r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            if (r18 == 0) goto L21d
            java.lang.String r3 = r18.c()
            java.lang.String r4 = r18.b()
            java.lang.String r5 = r18.a()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r9 = "RenderParams"
            if (r6 != 0) goto L52
            boolean r6 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r6 == 0) goto L28
            float r6 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r3)
        L26:
            r10 = 0
            goto L55
        L28:
            android.content.Context r6 = r0.c
            int r10 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r3)
            float r10 = (float) r10
            int r6 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r6, r10)
            int r6 = java.lang.Math.abs(r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r11 = " 设置定值 "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r10)
            r10 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L55
        L52:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L26
        L55:
            java.lang.String r11 = "own"
            boolean r11 = r11.equalsIgnoreCase(r4)
            if (r11 == 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "不应该传入 own reference..."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            xyz.adscope.common.v2.log.SDKLog.renderError(r9, r1)
            return
        L72:
            java.lang.String r11 = "super"
            boolean r11 = r11.equalsIgnoreCase(r4)
            r12 = 9
            r13 = 11
            java.lang.String r14 = "left"
            r15 = -1
            r18 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r8 = "right"
            if (r11 == 0) goto Lf9
            boolean r4 = r1.equalsIgnoreCase(r5)
            if (r4 == 0) goto Lf1
            boolean r3 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r3 == 0) goto Lb2
            float r3 = java.lang.Math.abs(r6)
            int r4 = r0.n
            float r4 = (float) r4
            float r3 = r3 * r4
            int r10 = (int) r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " 根据父布局百分比计算 "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r3)
        Lb2:
            boolean r3 = r8.equalsIgnoreCase(r1)
            if (r3 == 0) goto Ld1
            r0.i = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " 追加 ALIGN_PARENT_RIGHT"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r3)
            r2.addRule(r13, r15)
        Ld1:
            boolean r3 = r14.equalsIgnoreCase(r1)
            if (r3 == 0) goto L21d
            r0.h = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " 追加 ALIGN_PARENT_LEFT"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r1)
            r2.addRule(r12, r15)
            return
        Lf1:
            xyz.adscope.ad.z4 r1 = new xyz.adscope.ad.z4
            java.lang.String r2 = "左右交叉... 无法渲染..."
            r1.<init>(r2)
            throw r1
        Lf9:
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r11 = r0.d
            if (r11 == 0) goto L21d
            boolean r11 = r11.containsKey(r4)
            if (r11 == 0) goto L21d
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r11 = r0.d
            java.lang.Object r11 = r11.get(r4)
            xyz.adscope.ad.o2 r11 = (xyz.adscope.ad.o2) r11
            if (r11 == 0) goto L21d
            java.lang.String r16 = r11.e()
            int r12 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r16)
            if (r12 <= 0) goto L21d
            boolean r16 = r8.equalsIgnoreCase(r1)
            if (r16 == 0) goto L19a
            boolean r16 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r16 == 0) goto L148
            float r10 = r6 + r18
            xyz.adscope.ad.a4 r16 = r11.a()
            int r7 = r16.h()
            float r7 = (float) r7
            float r10 = r10 * r7
            int r10 = (int) r10
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r13 = " 根据其他view右边距计算 "
            r7.append(r13)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r7)
        L148:
            r0.i = r10
            boolean r7 = r8.equalsIgnoreCase(r5)
            if (r7 == 0) goto L179
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r13 = " 追加 ALIGN_RIGHT "
            r7.append(r13)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r7)
            java.lang.String r7 = r0.e
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L175
            r7 = 11
            r2.addRule(r7, r15)
            goto L179
        L175:
            r7 = 7
            r2.addRule(r7, r12)
        L179:
            boolean r7 = r14.equalsIgnoreCase(r5)
            if (r7 == 0) goto L19a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r13 = " 追加 LEFT_OF "
            r7.append(r13)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r7)
            r7 = 0
            r2.addRule(r7, r12)
        L19a:
            boolean r7 = r14.equalsIgnoreCase(r1)
            if (r7 == 0) goto L21d
            boolean r3 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r3 == 0) goto L1cb
            float r6 = r6 + r18
            xyz.adscope.ad.a4 r3 = r11.a()
            int r3 = r3.a()
            float r3 = (float) r3
            float r6 = r6 * r3
            int r10 = (int) r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r6 = " 根据其他view左边距计算 "
            r3.append(r6)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r3)
        L1cb:
            r0.h = r10
            boolean r3 = r14.equalsIgnoreCase(r5)
            if (r3 == 0) goto L1fc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r6 = " 追加 ALIGN_LEFT "
            r3.append(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r3)
            java.lang.String r3 = r0.e
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1f8
            r3 = 9
            r2.addRule(r3, r15)
            goto L1fc
        L1f8:
            r3 = 5
            r2.addRule(r3, r12)
        L1fc:
            boolean r3 = r8.equalsIgnoreCase(r5)
            if (r3 == 0) goto L21d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " 追加 RIGHT_OF "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r9, r1)
            r1 = 1
            r2.addRule(r1, r12)
        L21d:
            return
    }

    private int c(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r9) {
            r8 = this;
            java.lang.String r0 = "尝试根据[model]计算高度..."
            java.lang.String r1 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            if (r9 == 0) goto L17a
            java.lang.String r0 = r9.c()
            java.lang.String r2 = r9.b()
            java.lang.String r9 = r9.a()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L17a
            boolean r3 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r0)
            if (r3 == 0) goto L13d
            float r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r0)
            java.lang.String r3 = "own"
            boolean r3 = r3.equalsIgnoreCase(r2)
            java.lang.String r4 = "width"
            java.lang.String r5 = " : "
            r6 = 0
            if (r3 == 0) goto L6e
            boolean r9 = r4.equalsIgnoreCase(r9)
            if (r9 == 0) goto L15c
            boolean r9 = r8.s
            if (r9 != 0) goto L66
            float r9 = java.lang.Math.abs(r0)
            int r2 = r8.j
            float r2 = (float) r2
            float r9 = r9 * r2
            int r6 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "高度根据[宽] * 百分比计算 "
            r9.append(r2)
            float r0 = java.lang.Math.abs(r0)
            r9.append(r0)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r9)
            goto L15c
        L66:
            xyz.adscope.ad.z4 r9 = new xyz.adscope.ad.z4
            java.lang.String r0 = "宽高相互依赖自身值..."
            r9.<init>(r0)
            throw r9
        L6e:
            java.lang.String r3 = "super"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto Lbe
            int r2 = r8.o
            if (r2 <= 0) goto Lb2
            float r2 = java.lang.Math.abs(r0)
            int r3 = r8.o
            float r3 = (float) r3
            float r2 = r2 * r3
            int r2 = (int) r2
            int r3 = r8.g
            int r4 = r2 + r3
            int r6 = r8.f
            int r4 = r4 + r6
            int r7 = r8.n
            if (r4 <= r7) goto L93
            int r7 = r7 - r3
            int r7 = r7 - r6
            r6 = r7
            goto L94
        L93:
            r6 = r2
        L94:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "高度根据父布局[定高] * 百分比计算 "
            r2.append(r3)
            float r3 = java.lang.Math.abs(r0)
            r2.append(r3)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r2)
        Lb2:
            int r9 = r8.b(r9)
            if (r9 <= 0) goto L15c
            float r9 = (float) r9
            float r0 = r0 * r9
            int r6 = (int) r0
            goto L15c
        Lbe:
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r3 = r8.d
            if (r3 == 0) goto L15c
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L15c
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r3 = r8.d
            java.lang.Object r2 = r3.get(r2)
            xyz.adscope.ad.o2 r2 = (xyz.adscope.ad.o2) r2
            if (r2 == 0) goto L15c
            boolean r3 = r4.equalsIgnoreCase(r9)
            if (r3 == 0) goto L106
            xyz.adscope.ad.a4 r3 = r2.a()
            int r3 = r3.b()
            float r3 = (float) r3
            float r4 = java.lang.Math.abs(r0)
            float r3 = r3 * r4
            int r6 = (int) r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "高度根据其他view[宽] * 百分比计算 "
            r3.append(r4)
            float r4 = java.lang.Math.abs(r0)
            r3.append(r4)
            r3.append(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r3)
        L106:
            java.lang.String r3 = "height"
            boolean r9 = r3.equalsIgnoreCase(r9)
            if (r9 == 0) goto L15c
            xyz.adscope.ad.a4 r9 = r2.a()
            int r9 = r9.g()
            float r9 = (float) r9
            float r2 = java.lang.Math.abs(r0)
            float r9 = r9 * r2
            int r6 = (int) r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "高度根据其他view[高] * 百分比计算 "
            r9.append(r2)
            float r0 = java.lang.Math.abs(r0)
            r9.append(r0)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r9)
            goto L15c
        L13d:
            android.content.Context r9 = r8.c
            int r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
            float r0 = (float) r0
            int r6 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r9, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "高度根据model固定值计算 "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r9)
        L15c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            xyz.adscope.ad.b5 r0 = r8.b
            java.lang.String r0 = r0.e()
            r9.append(r0)
            java.lang.String r0 = " 高度根据model计算 "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r9)
            return r6
        L17a:
            xyz.adscope.ad.z4 r9 = new xyz.adscope.ad.z4
            java.lang.String r0 = "height结构为空..."
            r9.<init>(r0)
            throw r9
    }

    private void c(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r18, java.lang.String r19, android.widget.RelativeLayout.LayoutParams r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            if (r18 == 0) goto L22a
            java.lang.String r3 = r18.c()
            java.lang.String r4 = r18.b()
            java.lang.String r5 = r18.a()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r8 = "RenderParams"
            r9 = 0
            if (r6 != 0) goto L4e
            boolean r6 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r6 == 0) goto L28
            float r6 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r3)
            goto L50
        L28:
            android.content.Context r6 = r0.c
            int r9 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r3)
            float r9 = (float) r9
            int r6 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r6, r9)
            int r9 = java.lang.Math.abs(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r10 = " 设置定值 "
            r6.append(r10)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r6)
        L4e:
            r6 = 1065353216(0x3f800000, float:1.0)
        L50:
            java.lang.String r10 = "own"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L6d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "不应该传入 own reference..."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            xyz.adscope.common.v2.log.SDKLog.renderError(r8, r1)
            return
        L6d:
            java.lang.String r10 = "super"
            boolean r10 = r10.equalsIgnoreCase(r4)
            r11 = 12
            r12 = 10
            java.lang.String r13 = "bottom"
            r14 = -1
            java.lang.String r15 = "top"
            if (r10 == 0) goto Lee
            boolean r4 = r1.equalsIgnoreCase(r5)
            if (r4 == 0) goto L22a
            boolean r3 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r3 == 0) goto Laf
            int r3 = r0.o
            if (r3 <= 0) goto Laf
            float r3 = java.lang.Math.abs(r6)
            int r4 = r0.o
            float r4 = (float) r4
            float r3 = r3 * r4
            int r9 = (int) r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " 根据父布局百分比计算 "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r3)
        Laf:
            boolean r3 = r15.equalsIgnoreCase(r1)
            if (r3 == 0) goto Lce
            r0.g = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " 追加 ALIGN_PARENT_TOP"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r3)
            r2.addRule(r12, r14)
        Lce:
            boolean r3 = r13.equalsIgnoreCase(r1)
            if (r3 == 0) goto L22a
            r0.f = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " 追加 ALIGN_PARENT_BOTTOM"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r1)
            r2.addRule(r11, r14)
            return
        Lee:
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r10 = r0.d
            if (r10 == 0) goto L22a
            boolean r10 = r10.containsKey(r4)
            if (r10 == 0) goto L22a
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r10 = r0.d
            java.lang.Object r10 = r10.get(r4)
            xyz.adscope.ad.o2 r10 = (xyz.adscope.ad.o2) r10
            if (r10 == 0) goto L22a
            java.lang.String r16 = r10.e()
            r18 = 1065353216(0x3f800000, float:1.0)
            int r7 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r16)
            if (r7 <= 0) goto L22a
            boolean r16 = r15.equalsIgnoreCase(r1)
            if (r16 == 0) goto L1a7
            boolean r16 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r16 == 0) goto L13f
            float r9 = r6 + r18
            xyz.adscope.ad.a4 r16 = r10.a()
            int r11 = r16.f()
            float r11 = (float) r11
            float r9 = r9 * r11
            int r9 = (int) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            java.lang.String r12 = " 根据其他view右边距计算 "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r11)
        L13f:
            r0.g = r9
            boolean r11 = r13.equalsIgnoreCase(r5)
            if (r11 == 0) goto L178
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            java.lang.String r12 = " 追加 BELOW "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r11)
            r11 = 3
            r2.addRule(r11, r7)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "设置above的节点 "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r11)
            r0.r = r10
        L178:
            boolean r11 = r15.equalsIgnoreCase(r5)
            if (r11 == 0) goto L1a7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            java.lang.String r12 = " 追加 ALIGN_TOP "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r11)
            java.lang.String r11 = r0.e
            boolean r11 = r4.equals(r11)
            if (r11 == 0) goto L1a3
            r11 = 10
            r2.addRule(r11, r14)
            goto L1a7
        L1a3:
            r11 = 6
            r2.addRule(r11, r7)
        L1a7:
            boolean r11 = r13.equalsIgnoreCase(r1)
            if (r11 == 0) goto L22a
            boolean r3 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r3 == 0) goto L1c1
            float r6 = r6 + r18
            xyz.adscope.ad.a4 r3 = r10.a()
            int r3 = r3.i()
            float r3 = (float) r3
            float r6 = r6 * r3
            int r9 = (int) r6
        L1c1:
            r0.f = r9
            boolean r3 = r13.equalsIgnoreCase(r5)
            if (r3 == 0) goto L1f3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r6 = " 追加 ALIGN_BOTTOM "
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r3)
            java.lang.String r3 = r0.e
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1ee
            r3 = 12
            r2.addRule(r3, r14)
            goto L1f3
        L1ee:
            r3 = 8
            r2.addRule(r3, r7)
        L1f3:
            boolean r3 = r15.equalsIgnoreCase(r5)
            if (r3 == 0) goto L22a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " 追加 ABOVE "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r1)
            r1 = 2
            r2.addRule(r1, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "设置below的节点 "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r8, r1)
            r0.r = r10
        L22a:
            return
    }

    private int d(int r6) {
            r5 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            boolean r0 = r0.k()
            if (r0 == 0) goto Lba
            java.lang.String r0 = "当前节点, 高度自动调节, 需要根据最大, 最小值修正高度..."
            java.lang.String r1 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            java.lang.String r0 = r0.h()
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r0)
            if (r0 == 0) goto L2b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            java.lang.String r0 = r0.h()
            float r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r0)
            int r2 = r5.j
            float r2 = (float) r2
            float r2 = r2 * r0
            goto L35
        L2b:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            java.lang.String r0 = r0.h()
            float r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseFloat(r0)
        L35:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            java.lang.String r0 = r0.i()
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r0)
            if (r0 == 0) goto L51
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            java.lang.String r0 = r0.i()
            float r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r0)
            int r3 = r5.j
            float r3 = (float) r3
            float r3 = r3 * r0
            goto L5b
        L51:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r5.a
            java.lang.String r0 = r0.i()
            float r3 = xyz.adscope.common.v2.tool.str.StringUtil.parseFloat(r0)
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "当前节点, 高度自动调节, 最大高度: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = " 最小高度: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " calculate "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "parent width "
            r0.append(r4)
            int r4 = r5.n
            r0.append(r4)
            java.lang.String r4 = " parent height "
            r0.append(r4)
            int r4 = r5.o
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            int r0 = r5.o
            if (r6 > r0) goto La4
            goto Lba
        La4:
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb0
            float r1 = (float) r6
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lb0
            int r6 = (int) r2
            return r6
        Lb0:
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lba
            float r0 = (float) r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lba
            int r6 = (int) r3
        Lba:
            return r6
    }

    private boolean e(int r1) {
            r0 = this;
            if (r1 > 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    private void j() {
            r1 = this;
            int r0 = r1.k
            if (r0 >= 0) goto L7
            r0 = -2
            r1.k = r0
        L7:
            return
    }

    private int k() {
            r6 = this;
            java.lang.String r0 = "尝试根据[素材]计算高度..."
            java.lang.String r1 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            xyz.adscope.ad.b5 r0 = r6.b
            boolean r0 = r0.b()
            r2 = 0
            if (r0 == 0) goto La6
            int r0 = r6.p
            if (r0 <= 0) goto Lbd
            int r3 = r6.q
            if (r3 <= 0) goto Lbd
            int r4 = r6.j
            float r4 = (float) r4
            float r0 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r5
            float r4 = r4 / r0
            float r0 = (float) r3
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = r6.d(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            xyz.adscope.ad.b5 r4 = r6.b
            java.lang.String r4 = r4.e()
            r3.append(r4)
            java.lang.String r4 = " 主要资源view计算..."
            r3.append(r4)
            int r4 = r6.k
            r3.append(r4)
            java.lang.String r4 = " calculate "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r3)
            int r3 = r6.o
            if (r3 <= 0) goto L87
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r3 = r6.a
            boolean r3 = r3.k()
            if (r3 == 0) goto L87
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "容器高度固定时, 计算缩小的尺寸..."
            r3.append(r4)
            xyz.adscope.ad.o2 r4 = r6.r
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r3)
            xyz.adscope.ad.o2 r3 = r6.r
            if (r3 == 0) goto L87
            xyz.adscope.ad.a4 r3 = r3.a()
            int r3 = r3.c()
            int r4 = r6.o
            int r4 = r4 - r3
            if (r4 <= 0) goto L88
            if (r4 >= r0) goto L87
            r2 = r4
            goto L88
        L87:
            r2 = r0
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xyz.adscope.ad.b5 r3 = r6.b
            java.lang.String r3 = r3.e()
            r0.append(r3)
            java.lang.String r3 = " 高度根据素材计算 "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            return r2
        La6:
            xyz.adscope.ad.b5 r0 = r6.b
            xyz.adscope.ad.b4 r0 = r0.c()
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto Lbd
            android.content.Context r1 = r6.c
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = xyz.adscope.ad.c5.a.a(r1, r0)
            int r0 = r6.d(r0)
            return r0
        Lbd:
            return r2
    }

    private int l() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xyz.adscope.ad.b5 r1 = r7.b
            java.lang.String r1 = r1.e()
            r0.append(r1)
            java.lang.String r1 = " 开始根据[展开]计算..."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            r0 = 1
            r7.u = r0
            xyz.adscope.ad.b5 r1 = r7.b
            java.util.List r1 = r1.g()
            r2 = 0
            if (r1 == 0) goto L57
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L57
            int r3 = r1.size()
            int[] r4 = new int[r3]
            r5 = 0
        L35:
            int r6 = r1.size()
            if (r5 >= r6) goto L4e
            java.lang.Object r6 = r1.get(r5)
            xyz.adscope.ad.o2 r6 = (xyz.adscope.ad.o2) r6
            xyz.adscope.ad.a4 r6 = r6.a()
            int r6 = r6.c()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L35
        L4e:
            java.util.Arrays.sort(r4)
            int r3 = r3 - r0
            r0 = r4[r3]
            if (r0 <= 0) goto L57
            return r0
        L57:
            return r2
    }

    @Override // xyz.adscope.ad.a4
    public int a() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L7
            r1.d()
        L7:
            int r0 = r1.h
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public void a(int r4) {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r3.a
            if (r0 == 0) goto L1c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.g()
            android.widget.RelativeLayout$LayoutParams r1 = r3.m
            java.lang.String r2 = "top"
            r3.a(r0, r2, r1, r4)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r3.a
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.d()
            android.widget.RelativeLayout$LayoutParams r1 = r3.m
            java.lang.String r2 = "bottom"
            r3.a(r0, r2, r1, r4)
        L1c:
            return
    }

    @Override // xyz.adscope.ad.a4
    public void a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
            r0.p = r1
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            r0.q = r1
            return
    }

    @Override // xyz.adscope.ad.a4
    public void a(xyz.adscope.ad.a4.a r3) {
            r2 = this;
            r2.t = r3
            xyz.adscope.ad.b5 r3 = r2.b
            int r3 = r3.f()
            if (r3 <= 0) goto L2a
            xyz.adscope.ad.b5 r3 = r2.b
            java.util.List r3 = r3.g()
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            xyz.adscope.ad.o2 r0 = (xyz.adscope.ad.o2) r0
            xyz.adscope.ad.a4 r0 = r0.a()
            xyz.adscope.ad.a4$a r1 = r2.t
            r0.a(r1)
            goto L14
        L2a:
            return
    }

    @Override // xyz.adscope.ad.a4
    public int b() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L7
            r1.d()
        L7:
            int r0 = r1.j
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public void b(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // xyz.adscope.ad.a4
    public int c() {
            r2 = this;
            boolean r0 = r2.l
            if (r0 != 0) goto L7
            r2.d()
        L7:
            int r0 = r2.f
            int r1 = r2.g
            int r0 = r0 + r1
            int r1 = r2.k
            int r0 = r0 + r1
            xyz.adscope.ad.o2 r1 = r2.r
            if (r1 == 0) goto L1c
            xyz.adscope.ad.a4 r1 = r1.a()
            int r1 = r1.c()
            int r0 = r0 + r1
        L1c:
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public void c(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    @Override // xyz.adscope.ad.a4
    public void d() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--------------------Render Calculate------------------ "
            r0.append(r1)
            xyz.adscope.ad.b5 r1 = r4.b
            java.lang.String r1 = r1.e()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            boolean r0 = r4.l
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xyz.adscope.ad.b5 r2 = r4.b
            java.lang.String r2 = r2.e()
            r0.append(r2)
            java.lang.String r2 = "已经计算过宽高..."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
            return
        L3b:
            android.widget.RelativeLayout$LayoutParams r0 = r4.m
            if (r0 != 0) goto L48
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            r4.m = r0
        L48:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            if (r0 == 0) goto L194
            int r0 = r4.n     // Catch: xyz.adscope.ad.z4 -> L5d
            boolean r0 = r4.e(r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            if (r0 == 0) goto L60
            android.content.Context r0 = r4.c     // Catch: xyz.adscope.ad.z4 -> L5d
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenWidth(r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.n = r0     // Catch: xyz.adscope.ad.z4 -> L5d
            goto L60
        L5d:
            r0 = move-exception
            goto L19c
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.<init>()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.b5 r2 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = r2.e()     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "开始计算[横向margin]..."
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = r0.toString()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.f()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "right"
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.b(r0, r2, r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.e()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "left"
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.b(r0, r2, r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.a()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "x"
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.a(r0, r2, r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.<init>()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.b5 r2 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = r2.e()     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "开始计算[纵向margin]..."
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = r0.toString()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.g()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "top"
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.c(r0, r2, r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.d()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "bottom"
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.c(r0, r2, r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.b()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "y"
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.a(r0, r2, r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.<init>()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.b5 r2 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = r2.e()     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "开始计算自身[宽]..."
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = r0.toString()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.j()     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.b(r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = "width"
            r4.a(r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.<init>()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.b5 r2 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = r2.e()     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "开始计算自身[高]..."
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = r0.toString()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r4.a     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.par.LayoutParamModel r0 = r0.c()     // Catch: xyz.adscope.ad.z4 -> L5d
            r4.a(r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = "height"
            r4.a(r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            r0 = 1
            r4.l = r0     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.<init>()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "--------------------Calculate Finished------------------ "
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.b5 r2 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = r2.e()     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.append(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r0 = r0.toString()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.a4$a r0 = r4.t     // Catch: xyz.adscope.ad.z4 -> L5d
            if (r0 == 0) goto L158
            xyz.adscope.ad.b5 r2 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            r0.b(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
        L158:
            xyz.adscope.ad.b5 r0 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            int r0 = r0.f()     // Catch: xyz.adscope.ad.z4 -> L5d
            if (r0 <= 0) goto L1c6
            xyz.adscope.ad.b5 r0 = r4.b     // Catch: xyz.adscope.ad.z4 -> L5d
            java.util.List r0 = r0.g()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.util.Comparator r2 = xyz.adscope.ad.y4.a()     // Catch: xyz.adscope.ad.z4 -> L5d
            java.util.Collections.sort(r0, r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            java.util.Iterator r0 = r0.iterator()     // Catch: xyz.adscope.ad.z4 -> L5d
        L171:
            boolean r2 = r0.hasNext()     // Catch: xyz.adscope.ad.z4 -> L5d
            if (r2 == 0) goto L1c6
            java.lang.Object r2 = r0.next()     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.o2 r2 = (xyz.adscope.ad.o2) r2     // Catch: xyz.adscope.ad.z4 -> L5d
            xyz.adscope.ad.a4 r3 = r2.a()     // Catch: xyz.adscope.ad.z4 -> L5d
            r3.d()     // Catch: xyz.adscope.ad.z4 -> L5d
            boolean r3 = r4.u     // Catch: xyz.adscope.ad.z4 -> L5d
            if (r3 == 0) goto L171
            xyz.adscope.ad.a4 r2 = r2.a()     // Catch: xyz.adscope.ad.z4 -> L5d
            android.widget.RelativeLayout$LayoutParams r3 = r4.m     // Catch: xyz.adscope.ad.z4 -> L5d
            int r3 = r3.height     // Catch: xyz.adscope.ad.z4 -> L5d
            r2.a(r3)     // Catch: xyz.adscope.ad.z4 -> L5d
            goto L171
        L194:
            xyz.adscope.ad.z4 r0 = new xyz.adscope.ad.z4     // Catch: xyz.adscope.ad.z4 -> L5d
            java.lang.String r2 = "LayoutModel is null"
            r0.<init>(r2)     // Catch: xyz.adscope.ad.z4 -> L5d
            throw r0     // Catch: xyz.adscope.ad.z4 -> L5d
        L19c:
            r2 = 0
            r4.l = r2
            r2 = 0
            r4.m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " RenderException "
            r2.append(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xyz.adscope.common.v2.log.SDKLog.renderError(r1, r2)
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            xyz.adscope.ad.a4$a r0 = r4.t
            if (r0 == 0) goto L1c6
            xyz.adscope.ad.b5 r1 = r4.b
            r0.a(r1)
        L1c6:
            return
    }

    @Override // xyz.adscope.ad.a4
    public android.widget.RelativeLayout.LayoutParams e() {
            r2 = this;
            android.widget.RelativeLayout$LayoutParams r0 = r2.m
            int r1 = r2.j
            r0.width = r1
            int r1 = r2.k
            r0.height = r1
            int r1 = r2.g
            r0.topMargin = r1
            int r1 = r2.i
            r0.rightMargin = r1
            int r1 = r2.f
            r0.bottomMargin = r1
            int r1 = r2.h
            r0.leftMargin = r1
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_RENDER
            boolean r0 = xyz.adscope.common.v2.log.SDKLog.isLogLevel(r0)
            if (r0 == 0) goto L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            xyz.adscope.ad.b5 r1 = r2.b
            java.lang.String r1 = r1.e()
            r0.<init>(r1)
            java.lang.String r1 = "最后的计算结果:"
            r0.append(r1)
            java.lang.String r1 = " 宽: "
            r0.append(r1)
            android.widget.RelativeLayout$LayoutParams r1 = r2.m
            int r1 = r1.width
            r0.append(r1)
            java.lang.String r1 = " 高: "
            r0.append(r1)
            android.widget.RelativeLayout$LayoutParams r1 = r2.m
            int r1 = r1.height
            r0.append(r1)
            java.lang.String r1 = " 左边距: "
            r0.append(r1)
            android.widget.RelativeLayout$LayoutParams r1 = r2.m
            int r1 = r1.leftMargin
            r0.append(r1)
            java.lang.String r1 = " 上边距: "
            r0.append(r1)
            android.widget.RelativeLayout$LayoutParams r1 = r2.m
            int r1 = r1.topMargin
            r0.append(r1)
            java.lang.String r1 = " 右边距: "
            r0.append(r1)
            android.widget.RelativeLayout$LayoutParams r1 = r2.m
            int r1 = r1.rightMargin
            r0.append(r1)
            java.lang.String r1 = " 下边距: "
            r0.append(r1)
            android.widget.RelativeLayout$LayoutParams r1 = r2.m
            int r1 = r1.bottomMargin
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RenderParams"
            xyz.adscope.common.v2.log.SDKLog.renderInfo(r1, r0)
        L83:
            android.widget.RelativeLayout$LayoutParams r0 = r2.m
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public int f() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L7
            r1.d()
        L7:
            int r0 = r1.g
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public int g() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L7
            r1.d()
        L7:
            int r0 = r1.k
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public int h() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L7
            r1.d()
        L7:
            int r0 = r1.i
            return r0
    }

    @Override // xyz.adscope.ad.a4
    public int i() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L7
            r1.d()
        L7:
            int r0 = r1.f
            return r0
    }
}
