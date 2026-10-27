package androidx.core.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TextDirectionHeuristicsCompat {
    public static final androidx.core.text.TextDirectionHeuristicCompat ANYRTL_LTR = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_LTR = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_RTL = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat LOCALE = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat LTR = null;
    public static final androidx.core.text.TextDirectionHeuristicCompat RTL = null;
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AnyStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        static final androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong INSTANCE_RTL = null;
        private final boolean mLookForRtl;

        static {
                androidx.core.text.TextDirectionHeuristicsCompat$AnyStrong r0 = new androidx.core.text.TextDirectionHeuristicsCompat$AnyStrong
                r1 = 1
                r0.<init>(r1)
                androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong.INSTANCE_RTL = r0
                return
        }

        private AnyStrong(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.mLookForRtl = r1
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(java.lang.CharSequence r5, int r6, int r7) {
                r4 = this;
                int r7 = r7 + r6
                r0 = 0
                r1 = 0
            L3:
                if (r6 >= r7) goto L26
                char r2 = r5.charAt(r6)
                byte r2 = java.lang.Character.getDirectionality(r2)
                int r2 = androidx.core.text.TextDirectionHeuristicsCompat.isRtlText(r2)
                r3 = 1
                if (r2 == 0) goto L1e
                if (r2 == r3) goto L17
                goto L23
            L17:
                boolean r1 = r4.mLookForRtl
                if (r1 != 0) goto L1c
                return r3
            L1c:
                r1 = 1
                goto L23
            L1e:
                boolean r1 = r4.mLookForRtl
                if (r1 == 0) goto L1c
                return r0
            L23:
                int r6 = r6 + 1
                goto L3
            L26:
                if (r1 == 0) goto L2b
                boolean r5 = r4.mLookForRtl
                return r5
            L2b:
                r5 = 2
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class FirstStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        static final androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong INSTANCE = null;

        static {
                androidx.core.text.TextDirectionHeuristicsCompat$FirstStrong r0 = new androidx.core.text.TextDirectionHeuristicsCompat$FirstStrong
                r0.<init>()
                androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.INSTANCE = r0
                return
        }

        private FirstStrong() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(java.lang.CharSequence r3, int r4, int r5) {
                r2 = this;
                int r5 = r5 + r4
                r0 = 2
                r1 = 2
            L3:
                if (r4 >= r5) goto L16
                if (r1 != r0) goto L16
                char r1 = r3.charAt(r4)
                byte r1 = java.lang.Character.getDirectionality(r1)
                int r1 = androidx.core.text.TextDirectionHeuristicsCompat.isRtlTextOrFormat(r1)
                int r4 = r4 + 1
                goto L3
            L16:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface TextDirectionAlgorithm {
        int checkRtl(java.lang.CharSequence r1, int r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class TextDirectionHeuristicImpl implements androidx.core.text.TextDirectionHeuristicCompat {
        private final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm mAlgorithm;

        TextDirectionHeuristicImpl(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm r1) {
                r0 = this;
                r0.<init>()
                r0.mAlgorithm = r1
                return
        }

        private boolean doCheck(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm r0 = r1.mAlgorithm
                int r2 = r0.checkRtl(r2, r3, r4)
                r3 = 1
                if (r2 == 0) goto L12
                if (r2 == r3) goto L10
                boolean r2 = r1.defaultIsRtl()
                return r2
            L10:
                r2 = 0
                return r2
            L12:
                return r3
        }

        protected abstract boolean defaultIsRtl();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                if (r2 == 0) goto L1b
                if (r3 < 0) goto L1b
                if (r4 < 0) goto L1b
                int r0 = r2.length()
                int r0 = r0 - r4
                if (r0 < r3) goto L1b
                androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm r0 = r1.mAlgorithm
                if (r0 != 0) goto L16
                boolean r2 = r1.defaultIsRtl()
                return r2
            L16:
                boolean r2 = r1.doCheck(r2, r3, r4)
                return r2
            L1b:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] r1, int r2, int r3) {
                r0 = this;
                java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
                boolean r1 = r0.isRtl(r1, r2, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TextDirectionHeuristicInternal extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mDefaultIsRtl = r2
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
                r1 = this;
                boolean r0 = r1.mDefaultIsRtl
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TextDirectionHeuristicLocale extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        static final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale INSTANCE = null;

        static {
                androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale
                r0.<init>()
                androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.INSTANCE = r0
                return
        }

        TextDirectionHeuristicLocale() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
                r2 = this;
                java.util.Locale r0 = java.util.Locale.getDefault()
                int r0 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r0)
                r1 = 1
                if (r0 != r1) goto Lc
                return r1
            Lc:
                r0 = 0
                return r0
        }
    }

    static {
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            androidx.core.text.TextDirectionHeuristicsCompat.LTR = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            r3 = 1
            r0.<init>(r1, r3)
            androidx.core.text.TextDirectionHeuristicsCompat.RTL = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            androidx.core.text.TextDirectionHeuristicsCompat$FirstStrong r1 = androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.INSTANCE
            r0.<init>(r1, r2)
            androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            r0.<init>(r1, r3)
            androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal r0 = new androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal
            androidx.core.text.TextDirectionHeuristicsCompat$AnyStrong r1 = androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong.INSTANCE_RTL
            r0.<init>(r1, r2)
            androidx.core.text.TextDirectionHeuristicsCompat.ANYRTL_LTR = r0
            androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale r0 = androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.INSTANCE
            androidx.core.text.TextDirectionHeuristicsCompat.LOCALE = r0
            return
    }

    private TextDirectionHeuristicsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static int isRtlText(int r1) {
            r0 = 1
            if (r1 == 0) goto Lb
            if (r1 == r0) goto L9
            r0 = 2
            if (r1 == r0) goto L9
            return r0
        L9:
            r1 = 0
            return r1
        Lb:
            return r0
    }

    static int isRtlTextOrFormat(int r2) {
            r0 = 1
            if (r2 == 0) goto Le
            if (r2 == r0) goto Lc
            r1 = 2
            if (r2 == r1) goto Lc
            switch(r2) {
                case 14: goto Le;
                case 15: goto Le;
                case 16: goto Lc;
                case 17: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            r2 = 0
            return r2
        Le:
            return r0
    }
}
