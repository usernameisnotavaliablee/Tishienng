package xyz.adscope.ad.publish.ad.banner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class IBannerAdConfig extends xyz.adscope.ad.a2 implements xyz.adscope.ad.u3 {
    private final long g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.ad.publish.ad.banner.IBannerAdConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder extends xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> {
        private long f;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ long a(xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder r2) {
                long r0 = r2.f
                return r0
        }

        @Override // xyz.adscope.ad.a2.a
        protected xyz.adscope.ad.c a() {
                r1 = this;
                xyz.adscope.ad.c r0 = xyz.adscope.ad.c.c
                return r0
        }

        @Override // xyz.adscope.ad.a2.a
        protected /* bridge */ /* synthetic */ xyz.adscope.ad.publish.ad.banner.IBannerAdConfig f(xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> r1) {
                r0 = this;
                xyz.adscope.ad.publish.ad.banner.IBannerAdConfig r1 = r0.g(r1)
                return r1
        }

        protected xyz.adscope.ad.publish.ad.banner.IBannerAdConfig g(xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> r2) {
                r1 = this;
                xyz.adscope.ad.publish.ad.banner.IBannerAdConfig r2 = new xyz.adscope.ad.publish.ad.banner.IBannerAdConfig
                r0 = 0
                r2.<init>(r1, r0)
                return r2
        }

        @Override // xyz.adscope.ad.a2.a
        public /* bridge */ /* synthetic */ xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> setExpressSizePixel(float r1, float r2) {
                r0 = this;
                xyz.adscope.ad.publish.ad.banner.IBannerAdConfig$Builder r1 = r0.setExpressSizePixel2(r1, r2)
                return r1
        }

        @Override // xyz.adscope.ad.a2.a
        /* renamed from: setExpressSizePixel, reason: avoid collision after fix types in other method */
        public xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> setExpressSizePixel2(float r1, float r2) {
                r0 = this;
                xyz.adscope.ad.a2$a r1 = super.setExpressSizePixel(r1, r2)
                xyz.adscope.ad.publish.ad.banner.IBannerAdConfig$Builder r1 = (xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder) r1
                return r1
        }

        public xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder setIntervalSec(int r5) {
                r4 = this;
                long r0 = (long) r5
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 * r2
                r4.f = r0
                return r4
        }

        @Override // xyz.adscope.ad.a2.a
        public /* bridge */ /* synthetic */ xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> setTimeoutMillion(long r1) {
                r0 = this;
                xyz.adscope.ad.publish.ad.banner.IBannerAdConfig$Builder r1 = r0.setTimeoutMillion2(r1)
                return r1
        }

        @Override // xyz.adscope.ad.a2.a
        /* renamed from: setTimeoutMillion, reason: avoid collision after fix types in other method */
        public xyz.adscope.ad.a2.a<xyz.adscope.ad.publish.ad.banner.IBannerAdConfig> setTimeoutMillion2(long r1) {
                r0 = this;
                xyz.adscope.ad.a2$a r1 = super.setTimeoutMillion(r1)
                xyz.adscope.ad.publish.ad.banner.IBannerAdConfig$Builder r1 = (xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder) r1
                return r1
        }
    }

    private IBannerAdConfig(xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder r3) {
            r2 = this;
            r2.<init>(r3)
            long r0 = xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder.a(r3)
            r2.g = r0
            return
    }

    /* synthetic */ IBannerAdConfig(xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.Builder r1, xyz.adscope.ad.publish.ad.banner.IBannerAdConfig.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.u3
    public long getIntervalMillion() {
            r2 = this;
            long r0 = r2.g
            return r0
    }
}
