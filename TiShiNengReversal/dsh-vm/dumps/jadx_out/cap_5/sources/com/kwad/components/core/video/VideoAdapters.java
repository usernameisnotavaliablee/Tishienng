package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class VideoAdapters {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.video.VideoAdapters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] aaV = null;

        static {
                com.kwad.components.core.video.VideoAdapters$AdaptType[] r0 = com.kwad.components.core.video.VideoAdapters.AdaptType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kwad.components.core.video.VideoAdapters.AnonymousClass1.aaV = r0
                com.kwad.components.core.video.VideoAdapters$AdaptType r1 = com.kwad.components.core.video.VideoAdapters.AdaptType.PORTRAIT_VERTICAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kwad.components.core.video.VideoAdapters.AnonymousClass1.aaV     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kwad.components.core.video.VideoAdapters$AdaptType r1 = com.kwad.components.core.video.VideoAdapters.AdaptType.LANDSCAPE_HORIZONTAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kwad.components.core.video.VideoAdapters.AnonymousClass1.aaV     // Catch: java.lang.NoSuchFieldError -> L28
                com.kwad.components.core.video.VideoAdapters$AdaptType r1 = com.kwad.components.core.video.VideoAdapters.AdaptType.PORTRAIT_HORIZONTAL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kwad.components.core.video.VideoAdapters.AnonymousClass1.aaV     // Catch: java.lang.NoSuchFieldError -> L33
                com.kwad.components.core.video.VideoAdapters$AdaptType r1 = com.kwad.components.core.video.VideoAdapters.AdaptType.LANDSCAPE_VERTICAL     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum AdaptType extends java.lang.Enum<com.kwad.components.core.video.VideoAdapters.AdaptType> {
        private static final /* synthetic */ com.kwad.components.core.video.VideoAdapters.AdaptType[] $VALUES = null;
        public static final com.kwad.components.core.video.VideoAdapters.AdaptType LANDSCAPE_HORIZONTAL = null;
        public static final com.kwad.components.core.video.VideoAdapters.AdaptType LANDSCAPE_VERTICAL = null;
        public static final com.kwad.components.core.video.VideoAdapters.AdaptType PORTRAIT_HORIZONTAL = null;
        public static final com.kwad.components.core.video.VideoAdapters.AdaptType PORTRAIT_VERTICAL = null;

        static {
                com.kwad.components.core.video.VideoAdapters$AdaptType r0 = new com.kwad.components.core.video.VideoAdapters$AdaptType
                java.lang.String r1 = "PORTRAIT_VERTICAL"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.core.video.VideoAdapters.AdaptType.PORTRAIT_VERTICAL = r0
                com.kwad.components.core.video.VideoAdapters$AdaptType r1 = new com.kwad.components.core.video.VideoAdapters$AdaptType
                java.lang.String r3 = "PORTRAIT_HORIZONTAL"
                r4 = 1
                r1.<init>(r3, r4)
                com.kwad.components.core.video.VideoAdapters.AdaptType.PORTRAIT_HORIZONTAL = r1
                com.kwad.components.core.video.VideoAdapters$AdaptType r3 = new com.kwad.components.core.video.VideoAdapters$AdaptType
                java.lang.String r5 = "LANDSCAPE_VERTICAL"
                r6 = 2
                r3.<init>(r5, r6)
                com.kwad.components.core.video.VideoAdapters.AdaptType.LANDSCAPE_VERTICAL = r3
                com.kwad.components.core.video.VideoAdapters$AdaptType r5 = new com.kwad.components.core.video.VideoAdapters$AdaptType
                java.lang.String r7 = "LANDSCAPE_HORIZONTAL"
                r8 = 3
                r5.<init>(r7, r8)
                com.kwad.components.core.video.VideoAdapters.AdaptType.LANDSCAPE_HORIZONTAL = r5
                r7 = 4
                com.kwad.components.core.video.VideoAdapters$AdaptType[] r7 = new com.kwad.components.core.video.VideoAdapters.AdaptType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.kwad.components.core.video.VideoAdapters.AdaptType.$VALUES = r7
                return
        }

        AdaptType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kwad.components.core.video.VideoAdapters.AdaptType valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.core.video.VideoAdapters$AdaptType> r0 = com.kwad.components.core.video.VideoAdapters.AdaptType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.core.video.VideoAdapters$AdaptType r1 = (com.kwad.components.core.video.VideoAdapters.AdaptType) r1
                return r1
        }

        public static com.kwad.components.core.video.VideoAdapters.AdaptType[] values() {
                com.kwad.components.core.video.VideoAdapters$AdaptType[] r0 = com.kwad.components.core.video.VideoAdapters.AdaptType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.core.video.VideoAdapters$AdaptType[] r0 = (com.kwad.components.core.video.VideoAdapters.AdaptType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a implements com.kwad.components.core.video.c {


        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static boolean C(android.view.View r1) {
                boolean r0 = r1.isInLayout()
                if (r0 != 0) goto Lf
                boolean r1 = r1.isLayoutRequested()
                if (r1 == 0) goto Ld
                goto Lf
            Ld:
                r1 = 0
                return r1
            Lf:
                r1 = 1
                return r1
        }

        private static boolean b(android.view.View r1, android.view.View r2, int r3, int r4) {
                r0 = 0
                if (r1 != 0) goto L4
                return r0
            L4:
                if (r3 == 0) goto L1b
                if (r4 != 0) goto L9
                goto L1b
            L9:
                if (r2 != 0) goto Lc
                return r0
            Lc:
                int r1 = r2.getWidth()
                int r2 = r2.getHeight()
                if (r1 == 0) goto L1b
                if (r2 != 0) goto L19
                goto L1b
            L19:
                r1 = 1
                return r1
            L1b:
                return r0
        }

        @Override // com.kwad.components.core.video.c
        public final void a(android.view.View r5, android.view.View r6, int r7, int r8) {
                r4 = this;
                boolean r0 = b(r5, r6, r7, r8)
                if (r0 != 0) goto Le
                java.lang.String r5 = "AbstractVideoViewAdapter"
                java.lang.String r6 = "adaptVideo checkArguments invalid"
                com.kwad.sdk.core.d.c.d(r5, r6)
                return
            Le:
                int r0 = r6.getHeight()
                float r0 = (float) r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.kwad.components.core.video.VideoAdapters$d r1 = new com.kwad.components.core.video.VideoAdapters$d
                r1.<init>(r6, r0)
                com.kwad.components.core.video.VideoAdapters$d r6 = new com.kwad.components.core.video.VideoAdapters$d
                float r7 = (float) r7
                float r8 = (float) r8
                r6.<init>(r7, r8)
                float r7 = r6.getRatio()
                r8 = 0
                r0 = 1
                r2 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r7 < 0) goto L32
                r7 = 1
                goto L33
            L32:
                r7 = 0
            L33:
                float r3 = r1.getRatio()
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 < 0) goto L3c
                r8 = 1
            L3c:
                if (r8 == 0) goto L43
                if (r7 == 0) goto L43
                com.kwad.components.core.video.VideoAdapters$AdaptType r7 = com.kwad.components.core.video.VideoAdapters.AdaptType.PORTRAIT_VERTICAL
                goto L4f
            L43:
                if (r8 == 0) goto L48
                com.kwad.components.core.video.VideoAdapters$AdaptType r7 = com.kwad.components.core.video.VideoAdapters.AdaptType.PORTRAIT_HORIZONTAL
                goto L4f
            L48:
                if (r7 == 0) goto L4d
                com.kwad.components.core.video.VideoAdapters$AdaptType r7 = com.kwad.components.core.video.VideoAdapters.AdaptType.LANDSCAPE_VERTICAL
                goto L4f
            L4d:
                com.kwad.components.core.video.VideoAdapters$AdaptType r7 = com.kwad.components.core.video.VideoAdapters.AdaptType.LANDSCAPE_HORIZONTAL
            L4f:
                android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
                r4.a(r7, r8, r1, r6)
                boolean r6 = C(r5)
                if (r6 == 0) goto L65
                com.kwad.components.core.video.VideoAdapters$a$1 r6 = new com.kwad.components.core.video.VideoAdapters$a$1
                r6.<init>(r4, r5, r8)
                r5.post(r6)
                return
            L65:
                r5.setLayoutParams(r8)
                return
        }

        protected abstract void a(@androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.AdaptType r1, @androidx.annotation.NonNull android.view.ViewGroup.LayoutParams r2, @androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.d r3, @androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.d r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.kwad.components.core.video.VideoAdapters.a {
        private float aaY;
        private float aaZ;
        private float aba;

        public b() {
                r1 = this;
                r1.<init>()
                r0 = 1061997773(0x3f4ccccd, float:0.8)
                r1.aaY = r0
                r0 = 1064304640(0x3f700000, float:0.9375)
                r1.aaZ = r0
                r0 = 1066230664(0x3f8d6388, float:1.1046)
                r1.aba = r0
                return
        }

        @Override // com.kwad.components.core.video.VideoAdapters.a
        protected final void a(@androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.AdaptType r9, @androidx.annotation.NonNull android.view.ViewGroup.LayoutParams r10, @androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.d r11, @androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.d r12) {
                r8 = this;
                float r0 = r11.uc()
                float r1 = r12.uc()
                float r2 = r11.ub()
                float r3 = r11.ua()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "onAdaptVideo containerSize: "
                r4.<init>(r5)
                r4.append(r3)
                java.lang.String r5 = ", "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.String r6 = "FullHeightAdapter"
                com.kwad.sdk.core.d.c.d(r6, r4)
                int[] r4 = com.kwad.components.core.video.VideoAdapters.AnonymousClass1.aaV
                int r9 = r9.ordinal()
                r9 = r4[r9]
                r4 = 1
                r7 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
                if (r9 == r4) goto L4d
                r4 = 2
                if (r9 == r4) goto L4d
                r11 = 3
                if (r9 == r11) goto L46
                r11 = 4
                if (r9 == r11) goto L46
                r9 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
                r2 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
                goto L79
            L46:
                float r9 = r8.aba
                float r2 = r2 * r9
            L4a:
                float r9 = r2 / r1
                goto L79
            L4d:
                int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r9 <= 0) goto L67
                float r9 = r11.ua()
                float r11 = r9 / r1
                float r0 = r2 / r11
                float r3 = r8.aaY
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 < 0) goto L62
                r2 = r9
                r9 = r11
                goto L79
            L62:
                float r9 = r2 / r3
                float r2 = r9 * r1
                goto L79
            L67:
                float r9 = r11.ub()
                float r2 = r1 * r9
                float r11 = r3 / r2
                float r0 = r8.aaZ
                int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r11 < 0) goto L76
                goto L79
            L76:
                float r2 = r3 / r0
                goto L4a
            L79:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "onAdaptVideo result: "
                r11.<init>(r0)
                r11.append(r2)
                r11.append(r5)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
                com.kwad.sdk.core.d.c.d(r6, r11)
                int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r11 == 0) goto Lb1
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto Lb1
                float r11 = r12.getHeight()
                float r12 = r12.getWidth()
                int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r11 < 0) goto Lab
                int r9 = (int) r9
                r10.width = r9
                int r9 = (int) r2
                r10.height = r9
                return
            Lab:
                int r9 = (int) r9
                r10.height = r9
                int r9 = (int) r2
                r10.width = r9
            Lb1:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends com.kwad.components.core.video.VideoAdapters.a {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.components.core.video.VideoAdapters.a
        protected final void a(@androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.AdaptType r5, @androidx.annotation.NonNull android.view.ViewGroup.LayoutParams r6, @androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.d r7, @androidx.annotation.NonNull com.kwad.components.core.video.VideoAdapters.d r8) {
                r4 = this;
                float r0 = r7.uc()
                float r1 = r8.uc()
                int[] r2 = com.kwad.components.core.video.VideoAdapters.AnonymousClass1.aaV
                int r5 = r5.ordinal()
                r5 = r2[r5]
                r2 = 1
                r3 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
                if (r5 == r2) goto L29
                r2 = 2
                if (r5 == r2) goto L29
                r0 = 3
                if (r5 == r0) goto L22
                r0 = 4
                if (r5 == r0) goto L22
                r5 = 0
                r7 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
                goto L39
            L22:
                float r5 = r7.ub()
            L26:
                float r7 = r5 / r1
                goto L39
            L29:
                int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r5 < 0) goto L34
                float r7 = r7.ub()
                float r5 = r7 * r1
                goto L39
            L34:
                float r5 = r7.ua()
                goto L26
            L39:
                int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r0 == 0) goto L5a
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 == 0) goto L5a
                float r0 = r8.getHeight()
                float r8 = r8.getWidth()
                int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r8 <= 0) goto L54
                int r7 = (int) r7
                r6.width = r7
                int r5 = (int) r5
                r6.height = r5
                return
            L54:
                int r7 = (int) r7
                r6.height = r7
                int r5 = (int) r5
                r6.width = r5
            L5a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d {
        float abb;
        float height;
        float width;

        public d(float r3, float r4) {
                r2 = this;
                r2.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r2.abb = r0
                r2.width = r3
                r2.height = r4
                r0 = 0
                int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r1 <= 0) goto L17
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L17
                float r4 = r4 / r3
                r2.abb = r4
            L17:
                return
        }

        private boolean isValid() {
                r2 = this;
                float r0 = r2.width
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto Lf
                float r0 = r2.height
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto Lf
                r0 = 1
                return r0
            Lf:
                r0 = 0
                return r0
        }

        public final float getHeight() {
                r1 = this;
                float r0 = r1.height
                return r0
        }

        public final float getRatio() {
                r1 = this;
                float r0 = r1.abb
                return r0
        }

        public final float getWidth() {
                r1 = this;
                float r0 = r1.width
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ViewSize{width="
                r0.<init>(r1)
                float r1 = r2.width
                r0.append(r1)
                java.lang.String r1 = ", height="
                r0.append(r1)
                float r1 = r2.height
                r0.append(r1)
                java.lang.String r1 = ", ratio="
                r0.append(r1)
                float r1 = r2.abb
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final float ua() {
                r2 = this;
                boolean r0 = r2.isValid()
                if (r0 != 0) goto L9
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                return r0
            L9:
                float r0 = r2.width
                float r1 = r2.height
                float r0 = java.lang.Math.max(r0, r1)
                return r0
        }

        public final float ub() {
                r2 = this;
                boolean r0 = r2.isValid()
                if (r0 != 0) goto L9
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                return r0
            L9:
                float r0 = r2.width
                float r1 = r2.height
                float r0 = java.lang.Math.min(r0, r1)
                return r0
        }

        public final float uc() {
                r3 = this;
                boolean r0 = r3.isValid()
                if (r0 != 0) goto L9
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                return r0
            L9:
                float r0 = r3.height
                float r1 = r3.width
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L13
                float r0 = r0 / r1
                return r0
            L13:
                float r1 = r1 / r0
                return r1
        }
    }

    public VideoAdapters() {
            r1 = this;
            r1.<init>()
            return
    }
}
