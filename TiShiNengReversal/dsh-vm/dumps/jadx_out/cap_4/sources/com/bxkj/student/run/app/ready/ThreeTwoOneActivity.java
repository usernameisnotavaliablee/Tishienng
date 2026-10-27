package com.bxkj.student.run.app.ready;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ThreeTwoOneActivity extends android.app.Activity {
    private android.widget.TextView a;
    private int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.bxkj.student.run.app.ready.ThreeTwoOneActivity a;

        a(com.bxkj.student.run.app.ready.ThreeTwoOneActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                super.onAnimationEnd(r3)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r3 = r2.a
                android.content.Intent r3 = r3.getIntent()
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0 = r2.a
                java.lang.Class<com.bxkj.student.run.app.RunningActivity> r1 = com.bxkj.student.run.app.RunningActivity.class
                r3.setClass(r0, r1)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0 = r2.a
                r0.startActivity(r3)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r3 = r2.a
                r0 = 2130771987(0x7f010013, float:1.714708E38)
                r1 = 2130771986(0x7f010012, float:1.7147078E38)
                r3.overridePendingTransition(r0, r1)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r3 = r2.a
                r3.finish()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationRepeat(r2)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r2 = r1.a
                int r0 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.a(r2)
                int r0 = r0 + (-1)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity.c(r2, r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "count="
                r2.append(r0)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0 = r1.a
                int r0 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.a(r0)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                com.orhanobut.logger.j.c(r2)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r2 = r1.a
                int r2 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.a(r2)
                if (r2 != 0) goto L3c
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r2 = r1.a
                android.widget.TextView r2 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.b(r2)
                java.lang.String r0 = "GO"
                r2.setText(r0)
                return
            L3c:
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r2 = r1.a
                android.widget.TextView r2 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.b(r2)
                com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0 = r1.a
                int r0 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.a(r0)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2.setText(r0)
                return
        }
    }

    static {
            r0 = 17228(0x434c, float:2.4142E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ThreeTwoOneActivity() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.b = r0
            return
    }

    static /* bridge */ /* synthetic */ int a(com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0) {
            int r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView b(com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0) {
            android.widget.TextView r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ void c(com.bxkj.student.run.app.ready.ThreeTwoOneActivity r0, int r1) {
            r0.b = r1
            return
    }

    private void d() {
            r7 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0048: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r2 = "scaleX"
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r2, r1)
            float[] r2 = new float[r0]
            r2 = {x0050: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r3 = "scaleY"
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r3, r2)
            float[] r3 = new float[r0]
            r3 = {x0058: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r4 = "alpha"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r4, r3)
            android.widget.TextView r4 = r7.a
            r5 = 3
            android.animation.PropertyValuesHolder[] r5 = new android.animation.PropertyValuesHolder[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r5[r0] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r5)
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setDuration(r1)
            r1 = 4
            r0.setRepeatCount(r1)
            r0.start()
            com.bxkj.student.run.app.ready.ThreeTwoOneActivity$a r1 = new com.bxkj.student.run.app.ready.ThreeTwoOneActivity$a
            r1.<init>(r7)
            r0.addListener(r1)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto L5
            r2 = 0
            return r2
        L5:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }
}
