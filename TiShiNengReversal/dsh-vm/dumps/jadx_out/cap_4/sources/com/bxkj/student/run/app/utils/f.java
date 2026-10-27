package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private static final int a = 4;
    private static final java.lang.String b = "Go";
    private static int c = 4;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.animation.Animation.AnimationListener {
        final /* synthetic */ com.bxkj.student.run.app.utils.f.b a;
        final /* synthetic */ android.widget.TextView b;

        a(com.bxkj.student.run.app.utils.f.b r1, android.widget.TextView r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                android.widget.TextView r2 = r1.b
                r0 = 8
                r2.setVisibility(r0)
                com.bxkj.student.run.app.utils.f$b r2 = r1.a
                r2.end()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r2) {
                r1 = this;
                int r2 = com.bxkj.student.run.app.utils.f.a()
                int r2 = r2 + (-1)
                com.bxkj.student.run.app.utils.f.b(r2)
                int r2 = com.bxkj.student.run.app.utils.f.a()
                if (r2 != 0) goto L17
                android.widget.TextView r2 = r1.b
                java.lang.String r0 = "Go"
                r2.setText(r0)
                goto L24
            L17:
                android.widget.TextView r2 = r1.b
                int r0 = com.bxkj.student.run.app.utils.f.a()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2.setText(r0)
            L24:
                com.bxkj.student.run.app.utils.f$b r2 = r1.a
                r2.a()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
                com.bxkj.student.run.app.utils.f$b r1 = r0.a
                r1.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void end();

        void start();
    }

    static {
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ int a() {
            int r0 = com.bxkj.student.run.app.utils.f.c
            return r0
    }

    static /* bridge */ /* synthetic */ void b(int r0) {
            com.bxkj.student.run.app.utils.f.c = r0
            return
    }

    private static <T extends android.widget.TextView> void c(T r12, int r13, com.bxkj.student.run.app.utils.f.b r14) {
            r0 = 1
            int r13 = r13 - r0
            com.bxkj.student.run.app.utils.f.c = r13
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.setText(r13)
            r13 = 0
            r12.setVisibility(r13)
            android.view.animation.AlphaAnimation r13 = new android.view.animation.AlphaAnimation
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r13.<init>(r1, r2)
            android.view.animation.ScaleAnimation r3 = new android.view.animation.ScaleAnimation
            r10 = 1
            r11 = 1056964608(0x3f000000, float:0.5)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r5 = 1067869798(0x3fa66666, float:1.3)
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r7 = 1067869798(0x3fa66666, float:1.3)
            r8 = 1
            r9 = 1056964608(0x3f000000, float:0.5)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            int r1 = com.bxkj.student.run.app.utils.f.c
            r3.setRepeatCount(r1)
            int r1 = com.bxkj.student.run.app.utils.f.c
            r13.setRepeatCount(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            r13.setDuration(r1)
            r3.setDuration(r1)
            com.bxkj.student.run.app.utils.f$a r1 = new com.bxkj.student.run.app.utils.f$a
            r1.<init>(r14, r12)
            r3.setAnimationListener(r1)
            android.view.animation.AnimationSet r14 = new android.view.animation.AnimationSet
            r14.<init>(r0)
            r14.addAnimation(r13)
            r14.addAnimation(r3)
            r12.startAnimation(r14)
            return
    }

    public static <T extends android.widget.TextView> void d(T r1, com.bxkj.student.run.app.utils.f.b r2) {
            r0 = 4
            c(r1, r0, r2)
            return
    }
}
