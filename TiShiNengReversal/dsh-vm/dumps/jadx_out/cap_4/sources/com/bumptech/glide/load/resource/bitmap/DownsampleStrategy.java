package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class DownsampleStrategy {
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy a = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy b = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy c = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy d = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy e = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy f = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy g = null;
    public static final com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> h = null;
    static final boolean i = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SampleSizeRounding extends java.lang.Enum<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding> {
        private static final /* synthetic */ com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[] $VALUES = null;
        public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding MEMORY = null;
        public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding QUALITY = null;

        static {
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding
                java.lang.String r1 = "MEMORY"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY = r0
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding
                java.lang.String r3 = "QUALITY"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY = r1
                r3 = 2
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding[] r3 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.$VALUES = r3
                return
        }

        SampleSizeRounding(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding) r1
                return r1
        }

        public static com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[] values() {
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding[] r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding[] r0 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
                r0 = this;
                int r2 = r2 / r4
                int r1 = r1 / r3
                int r1 = java.lang.Math.min(r2, r1)
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 != 0) goto Lb
                return r2
            Lb:
                int r1 = java.lang.Integer.highestOneBit(r1)
                float r1 = (float) r1
                float r2 = r2 / r1
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
                r0 = this;
                float r2 = (float) r2
                float r4 = (float) r4
                float r2 = r2 / r4
                float r1 = (float) r1
                float r3 = (float) r3
                float r1 = r1 / r3
                float r1 = java.lang.Math.max(r2, r1)
                double r1 = (double) r1
                double r1 = java.lang.Math.ceil(r1)
                int r1 = (int) r1
                int r2 = java.lang.Integer.highestOneBit(r1)
                r3 = 1
                int r2 = java.lang.Math.max(r3, r2)
                if (r2 >= r1) goto L1c
                goto L1d
            L1c:
                r3 = 0
            L1d:
                int r1 = r2 << r3
                r2 = 1065353216(0x3f800000, float:1.0)
                float r1 = (float) r1
                float r2 = r2 / r1
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r3, int r4, int r5, int r6) {
                r2 = this;
                float r0 = r2.b(r3, r4, r5, r6)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Ld
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r3 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r3
            Ld:
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r3 = r0.a(r3, r4, r5, r6)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r2, int r3, int r4, int r5) {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
                float r2 = r0.b(r2, r3, r4, r5)
                r3 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.min(r3, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
                r0 = this;
                float r3 = (float) r3
                float r1 = (float) r1
                float r3 = r3 / r1
                float r1 = (float) r4
                float r2 = (float) r2
                float r1 = r1 / r2
                float r1 = java.lang.Math.max(r3, r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r1, int r2, int r3, int r4) {
                r0 = this;
                boolean r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.i
                if (r1 == 0) goto L7
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
            L7:
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.i
                if (r0 == 0) goto Lf
                float r4 = (float) r4
                float r2 = (float) r2
                float r4 = r4 / r2
                float r2 = (float) r5
                float r3 = (float) r3
                float r2 = r2 / r3
                float r2 = java.lang.Math.min(r4, r2)
                return r2
            Lf:
                int r3 = r3 / r5
                int r2 = r2 / r4
                int r2 = java.lang.Math.max(r3, r2)
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 != 0) goto L1a
                return r3
            L1a:
                int r2 = java.lang.Integer.highestOneBit(r2)
                float r2 = (float) r2
                float r3 = r3 / r2
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class f extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                return r1
        }
    }

    static {
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.a = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.b = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.d = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.e = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f r1 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f = r1
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.g = r0
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.g(r1, r0)
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.h = r0
            r0 = 1
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.i = r0
            return
    }

    public DownsampleStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding a(int r1, int r2, int r3, int r4);

    public abstract float b(int r1, int r2, int r3, int r4);
}
