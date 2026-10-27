package androidx.core.view.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PathInterpolatorCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.animation.Interpolator createPathInterpolator(float r1, float r2) {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.animation.Interpolator createPathInterpolator(float r1, float r2, float r3, float r4) {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.animation.Interpolator createPathInterpolator(android.graphics.Path r1) {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r0.<init>(r1)
                return r0
        }
    }

    private PathInterpolatorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.view.animation.Interpolator create(float r0, float r1) {
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.animation.Interpolator create(float r0, float r1, float r2, float r3) {
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.animation.Interpolator create(@androidx.annotation.NonNull android.graphics.Path r0) {
            android.view.animation.Interpolator r0 = androidx.core.view.animation.PathInterpolatorCompat.Api21Impl.createPathInterpolator(r0)
            return r0
    }
}
