package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Settings {
    public static final int COUNT = 10;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Settings.Companion Companion = null;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 4;
    public static final int MAX_CONCURRENT_STREAMS = 3;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;

    @org.jetbrains.annotations.NotNull
    private final int[] values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http2.Settings$Companion r0 = new okhttp3.internal.http2.Settings$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Settings.Companion = r0
            return
    }

    public Settings() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.values = r0
            return
    }

    public final void clear() {
            r7 = this;
            r0 = 0
            r7.set = r0
            int[] r1 = r7.values
            r5 = 6
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            kotlin.collections.n.T1(r1, r2, r3, r4, r5, r6)
            return
    }

    public final int get(int r2) {
            r1 = this;
            int[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }

    public final boolean getEnablePush(boolean r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 4
            if (r0 == 0) goto L10
            int[] r2 = r1.values
            r0 = 2
            r2 = r2[r0]
            r0 = 1
            if (r2 != r0) goto Lf
            return r0
        Lf:
            r2 = 0
        L10:
            return r2
    }

    public final int getHeaderTableSize() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 1
            r0 = r0[r1]
            return r0
        Lc:
            r0 = -1
            return r0
    }

    public final int getInitialWindowSize() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 4
            r0 = r0[r1]
            return r0
        Lc:
            r0 = 65535(0xffff, float:9.1834E-41)
            return r0
    }

    public final int getMaxConcurrentStreams() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 8
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 3
            r0 = r0[r1]
            return r0
        Lc:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    public final int getMaxFrameSize(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 32
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 5
            r2 = r2[r0]
        Lb:
            return r2
    }

    public final int getMaxHeaderListSize(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 64
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 6
            r2 = r2[r0]
        Lb:
            return r2
    }

    public final boolean isSet(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r0 << r3
            int r1 = r2.set
            r3 = r3 & r1
            if (r3 == 0) goto L9
            return r0
        L9:
            r3 = 0
            return r3
    }

    public final void merge(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) {
            r2 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
        L6:
            r1 = 10
            if (r0 >= r1) goto L1a
            boolean r1 = r3.isSet(r0)
            if (r1 == 0) goto L17
            int r1 = r3.get(r0)
            r2.set(r0, r1)
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Settings set(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.values
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.set
            r1 = r1 | r2
            r3.set = r1
            r0[r4] = r5
        L11:
            return r3
    }

    public final int size() {
            r1 = this;
            int r0 = r1.set
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }
}
