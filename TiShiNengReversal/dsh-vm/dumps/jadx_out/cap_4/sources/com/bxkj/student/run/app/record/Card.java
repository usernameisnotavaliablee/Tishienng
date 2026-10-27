package com.bxkj.student.run.app.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Card extends android.widget.FrameLayout {
    private int a;
    private android.content.Context b;

    public Card(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r1.b = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r0 = 2131493113(0x7f0c00f9, float:1.8609697E38)
            r2.inflate(r0, r1)
            return
    }

    public static /* synthetic */ void a(android.widget.TextView r3, android.animation.ValueAnimator r4) {
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r2 = "0.000"
            r4.<init>(r2)
            java.lang.String r4 = r4.format(r0)
            r3.setText(r4)
            return
    }

    public static /* synthetic */ void b(android.widget.TextView r0, android.animation.ValueAnimator r1) {
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
    }

    public static /* synthetic */ java.lang.Double c(float r2, java.lang.Double r3, java.lang.Double r4) {
            double r0 = r4.doubleValue()
            double r3 = r3.doubleValue()
            double r0 = r0 - r3
            double r2 = (double) r2
            double r0 = r0 * r2
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private java.lang.String d(@com.bxkj.student.run.app.ready.RunType int r3) {
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L24
            r0 = 2
            if (r3 == r0) goto L1a
            r0 = 3
            r1 = 2131951909(0x7f130125, float:1.9540246E38)
            if (r3 == r0) goto L13
            android.content.Context r3 = r2.b
            java.lang.String r3 = r3.getString(r1)
            return r3
        L13:
            android.content.Context r3 = r2.b
            java.lang.String r3 = r3.getString(r1)
            return r3
        L1a:
            android.content.Context r3 = r2.b
            r0 = 2131952426(0x7f13032a, float:1.9541294E38)
            java.lang.String r3 = r3.getString(r0)
            return r3
        L24:
            android.content.Context r3 = r2.b
            r0 = 2131952105(0x7f1301e9, float:1.9540643E38)
            java.lang.String r3 = r3.getString(r0)
            return r3
    }

    public com.bxkj.student.run.app.record.Card e(int r2) {
            r1 = this;
            r0 = 2131296685(0x7f0901ad, float:1.8211294E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setCardBackgroundColor(r2)
            return r1
    }

    public com.bxkj.student.run.app.record.Card f(int r4) {
            r3 = this;
            r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.d(r4)
            r1.append(r2)
            java.lang.String r2 = "记录"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            r3.a = r4
            return r3
    }

    public int getRunType() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public void setCount(int r4) {
            r3 = this;
            r0 = 2131298848(0x7f090a20, float:1.821568E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            int[] r4 = new int[]{r1, r4}
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofInt(r4)
            r1 = 1000(0x3e8, double:4.94E-321)
            r4.setDuration(r1)
            com.bxkj.student.run.app.record.h r1 = new com.bxkj.student.run.app.record.h
            r1.<init>(r0)
            r4.addUpdateListener(r1)
            r4.start()
            return
    }

    public void setDistance(double r5) {
            r4 = this;
            r0 = 2131298881(0x7f090a41, float:1.8215748E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bxkj.student.run.app.record.f r1 = new com.bxkj.student.run.app.record.f
            r1.<init>()
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            r6[r3] = r2
            r2 = 1
            r6[r2] = r5
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofObject(r1, r6)
            r1 = 1000(0x3e8, double:4.94E-321)
            r5.setDuration(r1)
            com.bxkj.student.run.app.record.g r6 = new com.bxkj.student.run.app.record.g
            r6.<init>(r0)
            r5.addUpdateListener(r6)
            r5.start()
            return
    }
}
