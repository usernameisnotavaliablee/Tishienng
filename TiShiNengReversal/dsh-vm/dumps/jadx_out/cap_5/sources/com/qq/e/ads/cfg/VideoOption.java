package com.qq.e.ads.cfg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class VideoOption {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.qq.e.ads.cfg.VideoOption$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class AutoPlayPolicy {
        public static final int ALWAYS = 1;
        public static final int NEVER = 2;
        public static final int WIFI = 0;

        public AutoPlayPolicy() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private boolean a;
        private int b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private int h;
        private int i;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.a = r0
                r1.b = r0
                r1.c = r0
                r1.d = r0
                r1.e = r0
                r0 = 0
                r1.f = r0
                r1.g = r0
                return
        }

        static /* synthetic */ boolean a(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                boolean r0 = r0.a
                return r0
        }

        static /* synthetic */ int b(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                int r0 = r0.b
                return r0
        }

        static /* synthetic */ boolean c(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                boolean r0 = r0.c
                return r0
        }

        static /* synthetic */ boolean d(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                boolean r0 = r0.d
                return r0
        }

        static /* synthetic */ boolean e(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                boolean r0 = r0.e
                return r0
        }

        static /* synthetic */ boolean f(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                boolean r0 = r0.f
                return r0
        }

        static /* synthetic */ boolean g(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                boolean r0 = r0.g
                return r0
        }

        static /* synthetic */ int h(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                int r0 = r0.h
                return r0
        }

        static /* synthetic */ int i(com.qq.e.ads.cfg.VideoOption.Builder r0) {
                int r0 = r0.i
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption build() {
                r2 = this;
                com.qq.e.ads.cfg.VideoOption r0 = new com.qq.e.ads.cfg.VideoOption
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setAutoPlayMuted(boolean r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setAutoPlayPolicy(int r2) {
                r1 = this;
                if (r2 < 0) goto L5
                r0 = 2
                if (r2 <= r0) goto L1b
            L5:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "setAutoPlayPolicy 设置失败，值只能为0到2之间的数值, 重置为 : "
                r2.append(r0)
                r0 = 1
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                com.qq.e.comm.util.GDTLogger.e(r2)
                r2 = 1
            L1b:
                r1.b = r2
                return r1
        }

        @java.lang.Deprecated
        public com.qq.e.ads.cfg.VideoOption.Builder setDetailPageMuted(boolean r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        @java.lang.Deprecated
        public com.qq.e.ads.cfg.VideoOption.Builder setEnableDetailPage(boolean r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setEnableUserControl(boolean r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setMaxVideoDuration(int r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setMinVideoDuration(int r1) {
                r0 = this;
                r0.i = r1
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setNeedCoverImage(boolean r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public com.qq.e.ads.cfg.VideoOption.Builder setNeedProgressBar(boolean r1) {
                r0 = this;
                r0.c = r1
                return r0
        }
    }

    private VideoOption(com.qq.e.ads.cfg.VideoOption.Builder r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.qq.e.ads.cfg.VideoOption.Builder.a(r2)
            r1.a = r0
            int r0 = com.qq.e.ads.cfg.VideoOption.Builder.b(r2)
            r1.b = r0
            boolean r0 = com.qq.e.ads.cfg.VideoOption.Builder.c(r2)
            r1.c = r0
            boolean r0 = com.qq.e.ads.cfg.VideoOption.Builder.d(r2)
            r1.d = r0
            boolean r0 = com.qq.e.ads.cfg.VideoOption.Builder.e(r2)
            r1.e = r0
            boolean r0 = com.qq.e.ads.cfg.VideoOption.Builder.f(r2)
            r1.f = r0
            boolean r0 = com.qq.e.ads.cfg.VideoOption.Builder.g(r2)
            r1.g = r0
            int r0 = com.qq.e.ads.cfg.VideoOption.Builder.h(r2)
            r1.h = r0
            int r2 = com.qq.e.ads.cfg.VideoOption.Builder.i(r2)
            r1.i = r2
            return
    }

    /* synthetic */ VideoOption(com.qq.e.ads.cfg.VideoOption.Builder r1, com.qq.e.ads.cfg.VideoOption.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean getAutoPlayMuted() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public int getAutoPlayPolicy() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int getMaxVideoDuration() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public int getMinVideoDuration() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public org.json.JSONObject getOptions() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "autoPlayMuted"
            boolean r2 = r3.a     // Catch: java.lang.Exception -> L27
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "autoPlayPolicy"
            int r2 = r3.b     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "detailPageMuted"
            boolean r2 = r3.g     // Catch: java.lang.Exception -> L27
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L27
            return r0
        L27:
            r1 = move-exception
            r1.getMessage()
            return r0
    }

    @java.lang.Deprecated
    public boolean isDetailPageMuted() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    @java.lang.Deprecated
    public boolean isEnableDetailPage() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public boolean isEnableUserControl() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public boolean isNeedCoverImage() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public boolean isNeedProgressBar() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }
}
