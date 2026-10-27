package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class w4 extends com.acse.ottn.u4 {

    /* renamed from: c, reason: collision with root package name */
    public static final long f2859c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> f2860b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.animation.Animator.AnimatorListener {
        public final /* synthetic */ com.acse.ottn.j.a a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.w4 f2861b;

        public a(com.acse.ottn.w4 r1, com.acse.ottn.j.a r2) {
                r0 = this;
                r0.f2861b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                com.acse.ottn.j$a r2 = r1.a
                r0 = 0
                r2.d(r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.acse.ottn.j$a r2 = r1.a
                r0 = 0
                r2.b(r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r2) {
                r1 = this;
                com.acse.ottn.j$a r2 = r1.a
                r0 = 0
                r2.c(r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                com.acse.ottn.j$a r2 = r1.a
                r0 = 0
                r2.a(r0)
                return
        }
    }

    public w4(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r0.<init>(r2)
            r1.f2860b = r0
            return
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.alpha(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.setDuration(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.setInterpolator(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(com.acse.ottn.j.a r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r2.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto L19
            if (r3 != 0) goto L11
            r3 = 0
            r0.setListener(r3)
            return r2
        L11:
            com.acse.ottn.w4$a r1 = new com.acse.ottn.w4$a
            r1.<init>(r2, r3)
            r0.setListener(r1)
        L19:
            return r2
    }

    @Override // com.acse.ottn.u4
    public void a() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.cancel()
        Ld:
            return
    }

    @Override // com.acse.ottn.u4
    public long b() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r2.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Lf
            long r0 = r0.getDuration()
            return r0
        Lf:
            r0 = -1
            return r0
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 b(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.alphaBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 b(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.setStartDelay(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public long c() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r2.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Lf
            long r0 = r0.getStartDelay()
            return r0
        Lf:
            r0 = -1
            return r0
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 c(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.rotation(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 d(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.rotationBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public void d() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.start()
        Ld:
            return
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 e(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.rotationX(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 f(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.rotationXBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 g(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.rotationY(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 h(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.rotationYBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 i(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.scaleX(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 j(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.scaleXBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 k(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.scaleY(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 l(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.scaleYBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 m(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.translationX(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 n(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.translationXBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 o(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.translationY(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 p(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.translationYBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 q(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.x(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 r(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.xBy(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 s(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.y(r2)
        Ld:
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 t(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.ViewPropertyAnimator> r0 = r1.f2860b
            java.lang.Object r0 = r0.get()
            android.view.ViewPropertyAnimator r0 = (android.view.ViewPropertyAnimator) r0
            if (r0 == 0) goto Ld
            r0.yBy(r2)
        Ld:
            return r1
    }
}
