package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j<K, A> {
    private float ae;
    protected com.bytedance.adsdk.lottie.m.cw<A> cw;
    final java.util.List<com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j> j;

    /* renamed from: m, reason: collision with root package name */
    private A f1801m;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1802r;
    private float tl;
    private final com.bytedance.adsdk.lottie.j.xt.j.cw<K> up;
    protected float xt;

    /* renamed from: com.bytedance.adsdk.lottie.j.xt.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private interface cw<T> {
        @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
        float cw();

        boolean j();

        boolean j(float r1);

        @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
        float r();

        com.bytedance.adsdk.lottie.m.j<T> xt();

        boolean xt(float r1);
    }

    /* renamed from: com.bytedance.adsdk.lottie.j.xt.j$j, reason: collision with other inner class name */
    public interface InterfaceC0184j {
        void j();
    }

    private static final class r<T> implements com.bytedance.adsdk.lottie.j.xt.j.cw<T> {
        private com.bytedance.adsdk.lottie.m.j<T> cw;
        private final java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> j;

        /* renamed from: r, reason: collision with root package name */
        private float f1803r;
        private com.bytedance.adsdk.lottie.m.j<T> xt;

        r(java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.cw = r0
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.f1803r = r0
                r1.j = r2
                r2 = 0
                com.bytedance.adsdk.lottie.m.j r2 = r1.cw(r2)
                r1.xt = r2
                return
        }

        private com.bytedance.adsdk.lottie.m.j<T> cw(float r4) {
                r3 = this;
                java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r0 = r3.j
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
                float r1 = r0.cw()
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 < 0) goto L17
                return r0
            L17:
                java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r0 = r3.j
                int r0 = r0.size()
                int r0 = r0 + (-2)
            L1f:
                if (r0 <= 0) goto L37
                java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r1 = r3.j
                java.lang.Object r1 = r1.get(r0)
                com.bytedance.adsdk.lottie.m.j r1 = (com.bytedance.adsdk.lottie.m.j) r1
                com.bytedance.adsdk.lottie.m.j<T> r2 = r3.xt
                if (r2 == r1) goto L34
                boolean r2 = r1.j(r4)
                if (r2 == 0) goto L34
                return r1
            L34:
                int r0 = r0 + (-1)
                goto L1f
            L37:
                java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r4 = r3.j
                r0 = 0
                java.lang.Object r4 = r4.get(r0)
                com.bytedance.adsdk.lottie.m.j r4 = (com.bytedance.adsdk.lottie.m.j) r4
                return r4
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public float cw() {
                r2 = this;
                java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r0 = r2.j
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
                float r0 = r0.cw()
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean j() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean j(float r3) {
                r2 = this;
                com.bytedance.adsdk.lottie.m.j<T> r0 = r2.xt
                boolean r0 = r0.j(r3)
                r1 = 1
                if (r0 == 0) goto L14
                com.bytedance.adsdk.lottie.m.j<T> r3 = r2.xt
                boolean r3 = r3.up()
                if (r3 != 0) goto L12
                return r1
            L12:
                r3 = 0
                return r3
            L14:
                com.bytedance.adsdk.lottie.m.j r3 = r2.cw(r3)
                r2.xt = r3
                return r1
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public float r() {
                r2 = this;
                java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r0 = r2.j
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
                float r0 = r0.r()
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public com.bytedance.adsdk.lottie.m.j<T> xt() {
                r1 = this;
                com.bytedance.adsdk.lottie.m.j<T> r0 = r1.xt
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean xt(float r3) {
                r2 = this;
                com.bytedance.adsdk.lottie.m.j<T> r0 = r2.cw
                com.bytedance.adsdk.lottie.m.j<T> r1 = r2.xt
                if (r0 != r1) goto Le
                float r0 = r2.f1803r
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto Le
                r3 = 1
                return r3
            Le:
                r2.cw = r1
                r2.f1803r = r3
                r3 = 0
                return r3
        }
    }

    private static final class up<T> implements com.bytedance.adsdk.lottie.j.xt.j.cw<T> {
        private final com.bytedance.adsdk.lottie.m.j<T> j;
        private float xt;

        up(java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r2) {
                r1 = this;
                r1.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.xt = r0
                r0 = 0
                java.lang.Object r2 = r2.get(r0)
                com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
                r1.j = r2
                return
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public float cw() {
                r1 = this;
                com.bytedance.adsdk.lottie.m.j<T> r0 = r1.j
                float r0 = r0.cw()
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean j() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean j(float r1) {
                r0 = this;
                com.bytedance.adsdk.lottie.m.j<T> r1 = r0.j
                boolean r1 = r1.up()
                if (r1 != 0) goto La
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public float r() {
                r1 = this;
                com.bytedance.adsdk.lottie.m.j<T> r0 = r1.j
                float r0 = r0.r()
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public com.bytedance.adsdk.lottie.m.j<T> xt() {
                r1 = this;
                com.bytedance.adsdk.lottie.m.j<T> r0 = r1.j
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean xt(float r2) {
                r1 = this;
                float r0 = r1.xt
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L8
                r2 = 1
                return r2
            L8:
                r1.xt = r2
                r2 = 0
                return r2
        }
    }

    private static final class xt<T> implements com.bytedance.adsdk.lottie.j.xt.j.cw<T> {
        private xt() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ xt(com.bytedance.adsdk.lottie.j.xt.j.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public float cw() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean j() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean j(float r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public float r() {
                r1 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                return r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public com.bytedance.adsdk.lottie.m.j<T> xt() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "not implemented"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.bytedance.adsdk.lottie.j.xt.j.cw
        public boolean xt(float r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "not implemented"
                r2.<init>(r0)
                throw r2
        }
    }

    j(java.util.List<? extends com.bytedance.adsdk.lottie.m.j<K>> r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.j = r0
            r0 = 0
            r2.f1802r = r0
            r0 = 0
            r2.xt = r0
            r0 = 0
            r2.f1801m = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.ae = r0
            r2.tl = r0
            com.bytedance.adsdk.lottie.j.xt.j$cw r3 = j(r3)
            r2.up = r3
            return
    }

    @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
    private float g() {
            r2 = this;
            float r0 = r2.ae
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
            com.bytedance.adsdk.lottie.j.xt.j$cw<K> r0 = r2.up
            float r0 = r0.cw()
            r2.ae = r0
        L10:
            float r0 = r2.ae
            return r0
    }

    private static <T> com.bytedance.adsdk.lottie.j.xt.j.cw<T> j(java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            com.bytedance.adsdk.lottie.j.xt.j$xt r2 = new com.bytedance.adsdk.lottie.j.xt.j$xt
            r0 = 0
            r2.<init>(r0)
            return r2
        Ld:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            com.bytedance.adsdk.lottie.j.xt.j$up r0 = new com.bytedance.adsdk.lottie.j.xt.j$up
            r0.<init>(r2)
            return r0
        L1a:
            com.bytedance.adsdk.lottie.j.xt.j$r r0 = new com.bytedance.adsdk.lottie.j.xt.j$r
            r0.<init>(r2)
            return r0
    }

    public A ae() {
            r4 = this;
            float r0 = r4.r()
            com.bytedance.adsdk.lottie.m.cw<A> r1 = r4.cw
            if (r1 != 0) goto L13
            com.bytedance.adsdk.lottie.j.xt.j$cw<K> r1 = r4.up
            boolean r1 = r1.xt(r0)
            if (r1 == 0) goto L13
            A r0 = r4.f1801m
            return r0
        L13:
            com.bytedance.adsdk.lottie.m.j r1 = r4.cw()
            android.view.animation.Interpolator r2 = r1.f1821r
            if (r2 == 0) goto L2e
            android.view.animation.Interpolator r3 = r1.up
            if (r3 == 0) goto L2e
            float r2 = r2.getInterpolation(r0)
            android.view.animation.Interpolator r3 = r1.up
            float r3 = r3.getInterpolation(r0)
            java.lang.Object r0 = r4.j(r1, r0, r2, r3)
            goto L36
        L2e:
            float r0 = r4.up()
            java.lang.Object r0 = r4.j(r1, r0)
        L36:
            r4.f1801m = r0
            return r0
    }

    protected com.bytedance.adsdk.lottie.m.j<K> cw() {
            r2 = this;
            java.lang.String r0 = "BaseKeyframeAnimation#getCurrentKeyframe"
            com.bytedance.adsdk.lottie.up.j(r0)
            com.bytedance.adsdk.lottie.j.xt.j$cw<K> r1 = r2.up
            com.bytedance.adsdk.lottie.m.j r1 = r1.xt()
            com.bytedance.adsdk.lottie.up.xt(r0)
            return r1
    }

    abstract A j(com.bytedance.adsdk.lottie.m.j<K> r1, float r2);

    protected A j(com.bytedance.adsdk.lottie.m.j<K> r1, float r2, float r3, float r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This animation does not support split dimensions!"
            r1.<init>(r2)
            throw r1
    }

    public void j() {
            r1 = this;
            r0 = 1
            r1.f1802r = r0
            return
    }

    public void j(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.j$cw<K> r0 = r1.up
            boolean r0 = r0.j()
            if (r0 == 0) goto L9
            goto L36
        L9:
            float r0 = r1.g()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L16
            float r2 = r1.g()
            goto L22
        L16:
            float r0 = r1.m()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            float r2 = r1.m()
        L22:
            float r0 = r1.xt
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L29
            goto L36
        L29:
            r1.xt = r2
            com.bytedance.adsdk.lottie.j.xt.j$cw<K> r0 = r1.up
            boolean r2 = r0.j(r2)
            if (r2 == 0) goto L36
            r1.xt()
        L36:
            return
    }

    public void j(com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r0 = r1.j
            r0.add(r2)
            return
    }

    @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
    float m() {
            r2 = this;
            float r0 = r2.tl
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
            com.bytedance.adsdk.lottie.j.xt.j$cw<K> r0 = r2.up
            float r0 = r0.r()
            r2.tl = r0
        L10:
            float r0 = r2.tl
            return r0
    }

    float r() {
            r3 = this;
            boolean r0 = r3.f1802r
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.bytedance.adsdk.lottie.m.j r0 = r3.cw()
            boolean r2 = r0.up()
            if (r2 == 0) goto L11
            return r1
        L11:
            float r1 = r3.xt
            float r2 = r0.cw()
            float r1 = r1 - r2
            float r2 = r0.r()
            float r0 = r0.cw()
            float r2 = r2 - r0
            float r1 = r1 / r2
            return r1
    }

    public float tl() {
            r1 = this;
            float r0 = r1.xt
            return r0
    }

    protected float up() {
            r2 = this;
            com.bytedance.adsdk.lottie.m.j r0 = r2.cw()
            if (r0 == 0) goto L18
            boolean r1 = r0.up()
            if (r1 == 0) goto Ld
            goto L18
        Ld:
            android.view.animation.Interpolator r0 = r0.cw
            float r1 = r2.r()
            float r0 = r0.getInterpolation(r1)
            return r0
        L18:
            r0 = 0
            return r0
    }

    public void xt() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r1 = r2.j
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j$j> r1 = r2.j
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.xt.j$j r1 = (com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j) r1
            r1.j()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}
