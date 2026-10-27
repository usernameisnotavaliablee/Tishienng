package xyz.adscope.ad.publish.ad.unified;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class UnifiedMediaConfig extends xyz.adscope.ad.l6.d {
    public static int AUTO_PLAY_ALWAYS = 0;
    public static int AUTO_PLAY_NEVER = 2;
    public static int AUTO_PLAY_WIFI = 1;
    private boolean a;
    private boolean b;
    private int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private int a;
        private boolean b;
        private boolean c;

        public Builder() {
                r1 = this;
                r1.<init>()
                int r0 = xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.AUTO_PLAY_ALWAYS
                r1.a = r0
                r0 = 0
                r1.b = r0
                r1.c = r0
                return
        }

        static /* synthetic */ int a(xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean b(xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder r0) {
                boolean r0 = r0.b
                return r0
        }

        static /* synthetic */ boolean c(xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder r0) {
                boolean r0 = r0.c
                return r0
        }

        public xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder autoPlayCondition(int r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig build() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig r0 = new xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder loopPlayback(boolean r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder silentPlayback(boolean r1) {
                r0 = this;
                r0.b = r1
                return r0
        }
    }

    static {
            return
    }

    private UnifiedMediaConfig(xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            int r0 = xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.AUTO_PLAY_ALWAYS
            r1.c = r0
            int r0 = xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder.a(r2)
            r1.c = r0
            boolean r0 = xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder.b(r2)
            r1.a = r0
            boolean r2 = xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder.c(r2)
            r1.b = r2
            return
    }

    /* synthetic */ UnifiedMediaConfig(xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.Builder r1, xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.l6.d
    public int getAutoPlayCondition() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // xyz.adscope.ad.l6.d
    public boolean isLoopPlayback() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // xyz.adscope.ad.l6.d
    public boolean isSilentPlayback() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @Override // xyz.adscope.ad.l6.d
    public boolean renderForUnified() {
            r1 = this;
            r0 = 1
            return r0
    }
}
