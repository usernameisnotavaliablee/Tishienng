package q.rorbin.badgeview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends android.animation.ValueAnimator {
    private q.rorbin.badgeview.b.c[][] a;
    private java.lang.ref.WeakReference<q.rorbin.badgeview.QBadgeView> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ q.rorbin.badgeview.b a;

        a(q.rorbin.badgeview.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                q.rorbin.badgeview.b r2 = r1.a
                java.lang.ref.WeakReference r2 = q.rorbin.badgeview.b.a(r2)
                java.lang.Object r2 = r2.get()
                q.rorbin.badgeview.QBadgeView r2 = (q.rorbin.badgeview.QBadgeView) r2
                if (r2 == 0) goto L19
                boolean r0 = r2.isShown()
                if (r0 != 0) goto L15
                goto L19
            L15:
                r2.invalidate()
                return
            L19:
                q.rorbin.badgeview.b r2 = r1.a
                r2.cancel()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: q.rorbin.badgeview.b$b, reason: collision with other inner class name */
    class C0094b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ q.rorbin.badgeview.b a;

        C0094b(q.rorbin.badgeview.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                q.rorbin.badgeview.b r1 = r0.a
                java.lang.ref.WeakReference r1 = q.rorbin.badgeview.b.a(r1)
                java.lang.Object r1 = r1.get()
                q.rorbin.badgeview.QBadgeView r1 = (q.rorbin.badgeview.QBadgeView) r1
                if (r1 == 0) goto L11
                r1.M()
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c {
        java.util.Random a;
        float b;
        float c;
        float d;
        int e;
        int f;
        android.graphics.Paint g;
        final /* synthetic */ q.rorbin.badgeview.b h;

        public c(q.rorbin.badgeview.b r2) {
                r1 = this;
                r1.h = r2
                r1.<init>()
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>()
                r1.g = r2
                r0 = 1
                r2.setAntiAlias(r0)
                android.graphics.Paint r2 = r1.g
                android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
                r2.setStyle(r0)
                java.util.Random r2 = new java.util.Random
                r2.<init>()
                r1.a = r2
                return
        }

        public void a(float r6, android.graphics.Canvas r7) {
                r5 = this;
                android.graphics.Paint r0 = r5.g
                int r1 = r5.e
                r0.setColor(r1)
                float r0 = r5.b
                java.util.Random r1 = r5.a
                int r2 = r5.f
                int r1 = r1.nextInt(r2)
                float r1 = (float) r1
                r2 = 1036831949(0x3dcccccd, float:0.1)
                float r1 = r1 * r2
                java.util.Random r3 = r5.a
                float r3 = r3.nextFloat()
                r4 = 1056964608(0x3f000000, float:0.5)
                float r3 = r3 - r4
                float r1 = r1 * r3
                float r0 = r0 + r1
                r5.b = r0
                float r0 = r5.c
                java.util.Random r1 = r5.a
                int r3 = r5.f
                int r1 = r1.nextInt(r3)
                float r1 = (float) r1
                float r1 = r1 * r2
                java.util.Random r2 = r5.a
                float r2 = r2.nextFloat()
                float r2 = r2 - r4
                float r1 = r1 * r2
                float r0 = r0 + r1
                r5.c = r0
                float r1 = r5.b
                float r2 = r5.d
                float r6 = r6 * r2
                float r2 = r2 - r6
                android.graphics.Paint r6 = r5.g
                r7.drawCircle(r1, r0, r2, r6)
                return
        }
    }

    public b(android.graphics.Bitmap r3, android.graphics.PointF r4, q.rorbin.badgeview.QBadgeView r5) {
            r2 = this;
            r2.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r2.b = r0
            r5 = 2
            float[] r5 = new float[r5]
            r5 = {x0030: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r2.setFloatValues(r5)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            q.rorbin.badgeview.b$c[][] r3 = r2.c(r3, r4)
            r2.a = r3
            q.rorbin.badgeview.b$a r3 = new q.rorbin.badgeview.b$a
            r3.<init>(r2)
            r2.addUpdateListener(r3)
            q.rorbin.badgeview.b$b r3 = new q.rorbin.badgeview.b$b
            r3.<init>(r2)
            r2.addListener(r3)
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference a(q.rorbin.badgeview.b r0) {
            java.lang.ref.WeakReference<q.rorbin.badgeview.QBadgeView> r0 = r0.b
            return r0
    }

    private q.rorbin.badgeview.b.c[][] c(android.graphics.Bitmap r14, android.graphics.PointF r15) {
            r13 = this;
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            int r2 = java.lang.Math.min(r0, r1)
            float r2 = (float) r2
            r3 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 / r3
            float r3 = r15.x
            int r4 = r14.getWidth()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 - r4
            float r15 = r15.y
            int r4 = r14.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r5
            float r15 = r15 - r4
            float r4 = (float) r1
            float r4 = r4 / r2
            int r4 = (int) r4
            float r5 = (float) r0
            float r5 = r5 / r2
            int r5 = (int) r5
            r6 = 2
            int[] r6 = new int[r6]
            r7 = 1
            r6[r7] = r5
            r5 = 0
            r6[r5] = r4
            java.lang.Class<q.rorbin.badgeview.b$c> r4 = q.rorbin.badgeview.b.c.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r6)
            q.rorbin.badgeview.b$c[][] r4 = (q.rorbin.badgeview.b.c[][]) r4
            r6 = 0
        L3c:
            int r7 = r4.length
            if (r6 >= r7) goto L70
            r7 = 0
        L40:
            r8 = r4[r6]
            int r8 = r8.length
            if (r7 >= r8) goto L6d
            q.rorbin.badgeview.b$c r8 = new q.rorbin.badgeview.b$c
            r8.<init>(r13)
            float r9 = (float) r7
            float r9 = r9 * r2
            int r10 = (int) r9
            float r11 = (float) r6
            float r11 = r11 * r2
            int r12 = (int) r11
            int r10 = r14.getPixel(r10, r12)
            r8.e = r10
            float r9 = r9 + r3
            r8.b = r9
            float r11 = r11 + r15
            r8.c = r11
            r8.d = r2
            int r9 = java.lang.Math.max(r0, r1)
            r8.f = r9
            r9 = r4[r6]
            r9[r7] = r8
            int r7 = r7 + 1
            goto L40
        L6d:
            int r6 = r6 + 1
            goto L3c
        L70:
            r14.recycle()
            return r4
    }

    public void b(android.graphics.Canvas r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            q.rorbin.badgeview.b$c[][] r2 = r5.a
            int r2 = r2.length
            if (r1 >= r2) goto L26
            r2 = 0
        L8:
            q.rorbin.badgeview.b$c[][] r3 = r5.a
            r3 = r3[r1]
            int r4 = r3.length
            if (r2 >= r4) goto L23
            r3 = r3[r2]
            java.lang.Object r4 = r5.getAnimatedValue()
            java.lang.String r4 = r4.toString()
            float r4 = java.lang.Float.parseFloat(r4)
            r3.a(r4, r6)
            int r2 = r2 + 1
            goto L8
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }
}
