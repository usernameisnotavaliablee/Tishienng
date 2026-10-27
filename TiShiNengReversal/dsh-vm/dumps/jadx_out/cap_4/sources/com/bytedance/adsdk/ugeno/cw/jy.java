package com.bytedance.adsdk.ugeno.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy {
    private java.lang.String ae;
    private android.animation.AnimatorSet cw;
    android.graphics.Paint j;

    /* renamed from: m, reason: collision with root package name */
    private int f1925m;

    /* renamed from: r, reason: collision with root package name */
    private android.view.View f1926r;
    private int up;
    private com.bytedance.adsdk.ugeno.cw.j xt;


    public jy(android.view.View r1, com.bytedance.adsdk.ugeno.cw.j r2) {
            r0 = this;
            r0.<init>()
            r0.f1926r = r1
            r0.xt = r2
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r0.cw = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.j = r1
            r2 = 1
            r1.setAntiAlias(r2)
            return
    }

    static /* synthetic */ android.view.View j(com.bytedance.adsdk.ugeno.cw.jy r0) {
            android.view.View r0 = r0.f1926r
            return r0
    }

    public void j() {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.adsdk.ugeno.cw.j r1 = r11.xt
            java.util.List r1 = r1.cw()
            if (r1 == 0) goto L1d0
            int r2 = r1.size()
            if (r2 > 0) goto L15
            goto L1d0
        L15:
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L190
            java.lang.Object r2 = r1.next()
            com.bytedance.adsdk.ugeno.cw.j$j r2 = (com.bytedance.adsdk.ugeno.cw.j.C0187j) r2
            if (r2 == 0) goto L19
            android.animation.ObjectAnimator r3 = new android.animation.ObjectAnimator
            r3.<init>()
            long r4 = r2.j()
            r3.setDuration(r4)
            java.lang.String r4 = r2.getType()
            java.lang.String r5 = "translateX"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L45
            java.lang.String r4 = "translationX"
            r3.setPropertyName(r4)
            goto L5e
        L45:
            java.lang.String r4 = r2.getType()
            java.lang.String r5 = "translateY"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L57
            java.lang.String r4 = "translationY"
            r3.setPropertyName(r4)
            goto L5e
        L57:
            java.lang.String r4 = r2.getType()
            r3.setPropertyName(r4)
        L5e:
            long r4 = r2.r()
            r3.setStartDelay(r4)
            android.view.View r4 = r11.f1926r
            r3.setTarget(r4)
            java.lang.String r4 = r2.getType()
            java.lang.String r5 = "backgroundColor"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            r6 = 0
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L8b
            float r4 = r2.up()
            int r4 = (int) r4
            float r9 = r2.m()
            int r9 = (int) r9
            int[] r4 = new int[]{r4, r9}
            r3.setIntValues(r4)
            goto L9c
        L8b:
            float r4 = r2.up()
            float r9 = r2.m()
            float[] r10 = new float[r8]
            r10[r6] = r4
            r10[r7] = r9
            r3.setFloatValues(r10)
        L9c:
            com.bytedance.adsdk.ugeno.cw.j r4 = r11.xt
            float r4 = r4.xt()
            int r4 = (int) r4
            if (r4 == 0) goto La9
            r3.setRepeatCount(r4)
            goto Lb1
        La9:
            float r4 = r2.xt()
            int r4 = (int) r4
            r3.setRepeatCount(r4)
        Lb1:
            java.lang.String r4 = r2.getType()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto Lc3
            android.animation.ArgbEvaluator r4 = new android.animation.ArgbEvaluator
            r4.<init>()
            r3.setEvaluator(r4)
        Lc3:
            com.bytedance.adsdk.ugeno.cw.j r4 = r11.xt
            java.lang.String r4 = r4.m()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto Ld3
            java.lang.String r4 = r2.cw()
        Ld3:
            java.lang.String r5 = "reverse"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto Ldf
            r3.setRepeatMode(r8)
            goto Le2
        Ldf:
            r3.setRepeatMode(r7)
        Le2:
            float[] r4 = r2.ae()
            if (r4 == 0) goto Lf6
            float[] r4 = r2.ae()
            int r4 = r4.length
            if (r4 <= 0) goto Lf6
            float[] r4 = r2.ae()
            r3.setFloatValues(r4)
        Lf6:
            java.lang.String r4 = r2.getType()
            java.lang.String r5 = "rotationX"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L10c
            android.view.View r4 = r11.f1926r
            com.bytedance.adsdk.ugeno.cw.jy$1 r5 = new com.bytedance.adsdk.ugeno.cw.jy$1
            r5.<init>(r11)
            r4.post(r5)
        L10c:
            java.lang.String r4 = r2.getType()
            java.lang.String r5 = "ripple"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L11e
            java.lang.String r4 = r2.g()
            r11.ae = r4
        L11e:
            java.lang.String r2 = r2.tl()
            r2.getClass()
            int r4 = r2.hashCode()
            r5 = -1
            switch(r4) {
                case -1354466595: goto L15b;
                case -1263948740: goto L150;
                case -1102672091: goto L145;
                case 475910905: goto L13a;
                case 1312628413: goto L12f;
                default: goto L12d;
            }
        L12d:
            r6 = -1
            goto L164
        L12f:
            java.lang.String r4 = "standard"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L138
            goto L12d
        L138:
            r6 = 4
            goto L164
        L13a:
            java.lang.String r4 = "accelerateDecelerate"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L143
            goto L12d
        L143:
            r6 = 3
            goto L164
        L145:
            java.lang.String r4 = "linear"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L14e
            goto L12d
        L14e:
            r6 = 2
            goto L164
        L150:
            java.lang.String r4 = "decelerate"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L159
            goto L12d
        L159:
            r6 = 1
            goto L164
        L15b:
            java.lang.String r4 = "accelerate"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L164
            goto L12d
        L164:
            switch(r6) {
                case 0: goto L183;
                case 1: goto L17a;
                case 2: goto L171;
                case 3: goto L168;
                case 4: goto L171;
                default: goto L167;
            }
        L167:
            goto L18b
        L168:
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r3.setInterpolator(r2)
            goto L18b
        L171:
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
            r2.<init>()
            r3.setInterpolator(r2)
            goto L18b
        L17a:
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r3.setInterpolator(r2)
            goto L18b
        L183:
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            r3.setInterpolator(r2)
        L18b:
            r0.add(r3)
            goto L19
        L190:
            com.bytedance.adsdk.ugeno.cw.j r1 = r11.xt
            long r1 = r1.r()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1a7
            android.animation.AnimatorSet r1 = r11.cw
            com.bytedance.adsdk.ugeno.cw.j r2 = r11.xt
            long r2 = r2.r()
            r1.setDuration(r2)
        L1a7:
            android.animation.AnimatorSet r1 = r11.cw
            com.bytedance.adsdk.ugeno.cw.j r2 = r11.xt
            long r2 = r2.up()
            r1.setStartDelay(r2)
            com.bytedance.adsdk.ugeno.cw.j r1 = r11.xt
            java.lang.String r1 = r1.j()
            java.lang.String r2 = "sequentially"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L1c6
            android.animation.AnimatorSet r1 = r11.cw
            r1.playSequentially(r0)
            goto L1cb
        L1c6:
            android.animation.AnimatorSet r1 = r11.cw
            r1.playTogether(r0)
        L1cb:
            android.animation.AnimatorSet r0 = r11.cw
            r0.start()
        L1d0:
            return
    }

    public void j(int r1, int r2) {
            r0 = this;
            int r1 = r1 / 2
            r0.up = r1
            int r2 = r2 / 2
            r0.f1925m = r2
            return
    }

    public void j(android.graphics.Canvas r5, com.bytedance.adsdk.ugeno.cw.up r6) {
            r4 = this;
            float r0 = r6.getRipple()     // Catch: java.lang.Throwable -> L48
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            java.lang.String r0 = r4.ae     // Catch: java.lang.Throwable -> L48
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L4a
            java.lang.String r0 = r4.ae     // Catch: java.lang.Throwable -> L48
            int r0 = com.bytedance.adsdk.ugeno.m.j.j(r0)     // Catch: java.lang.Throwable -> L48
            android.graphics.Paint r1 = r4.j     // Catch: java.lang.Throwable -> L48
            r1.setColor(r0)     // Catch: java.lang.Throwable -> L48
            android.graphics.Paint r0 = r4.j     // Catch: java.lang.Throwable -> L48
            r1 = 90
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> L48
            android.view.View r0 = r4.f1926r     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L48
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r0.setClipChildren(r1)     // Catch: java.lang.Throwable -> L48
            int r0 = r4.up     // Catch: java.lang.Throwable -> L48
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L48
            int r2 = r4.f1925m     // Catch: java.lang.Throwable -> L48
            float r3 = (float) r2     // Catch: java.lang.Throwable -> L48
            int r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L48
            int r0 = r0 * 2
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L48
            float r6 = r6.getRipple()     // Catch: java.lang.Throwable -> L48
            float r0 = r0 * r6
            android.graphics.Paint r6 = r4.j     // Catch: java.lang.Throwable -> L48
            r5.drawCircle(r1, r3, r0, r6)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r5 = move-exception
            goto L4b
        L4a:
            return
        L4b:
            r5.getMessage()
            return
    }

    public void xt() {
            r1 = this;
            android.animation.AnimatorSet r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }
}
