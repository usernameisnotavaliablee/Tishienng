package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DanmakuContext {
    private final master.flame.danmaku.danmaku.model.b A;
    public final master.flame.danmaku.danmaku.model.j B;
    public final master.flame.danmaku.controller.b C;
    public final master.flame.danmaku.danmaku.model.android.d D;
    public master.flame.danmaku.danmaku.model.android.c E;
    public byte F;
    public android.graphics.Typeface a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    java.util.List<java.lang.Integer> j;
    public int k;
    public float l;
    public int m;
    public master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType n;
    public master.flame.danmaku.danmaku.model.a o;
    public int p;
    java.util.List<java.lang.Integer> q;
    java.util.List<java.lang.Integer> r;
    java.util.List<java.lang.String> s;
    private java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext.a>> t;
    private boolean u;
    private boolean v;
    private boolean w;
    private master.flame.danmaku.danmaku.model.android.b x;
    private boolean y;
    private boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BorderType extends java.lang.Enum<master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType> {
        private static final /* synthetic */ master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType[] $VALUES = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType NONE = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType SHADOW = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType STROKEN = null;

        static {
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType r0 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.NONE = r0
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType r1 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType
                java.lang.String r3 = "SHADOW"
                r4 = 1
                r1.<init>(r3, r4)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.SHADOW = r1
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType r3 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType
                java.lang.String r5 = "STROKEN"
                r6 = 2
                r3.<init>(r5, r6)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.STROKEN = r3
                r5 = 3
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType[] r5 = new master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.$VALUES = r5
                return
        }

        BorderType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType valueOf(java.lang.String r1) {
                java.lang.Class<master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType> r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType r1 = (master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType) r1
                return r1
        }

        public static master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType[] values() {
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType[] r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.$VALUES
                java.lang.Object r0 = r0.clone()
                master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType[] r0 = (master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DanmakuConfigTag extends java.lang.Enum<master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag> {
        private static final /* synthetic */ master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag[] $VALUES = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag ALIGN_BOTTOM = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag BLOCK_GUEST_DANMAKU = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag COLOR_VALUE_WHITE_LIST = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag DANMAKU_BOLD = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag DANMAKU_MARGIN = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag DANMAKU_STYLE = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag DUPLICATE_MERGING_ENABLED = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag FB_DANMAKU_VISIBILITY = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag FT_DANMAKU_VISIBILITY = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag L2R_DANMAKU_VISIBILITY = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag MAXIMUM_NUMS_IN_SCREEN = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag MAXIMUN_LINES = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag OVERLAPPING_ENABLE = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag R2L_DANMAKU_VISIBILIY = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag SCALE_TEXTSIZE = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag SCROLL_SPEED_FACTOR = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag SPECIAL_DANMAKU_VISIBILITY = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag TRANSPARENCY = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag TYPEFACE = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag USER_HASH_BLACK_LIST = null;
        public static final master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag USER_ID_BLACK_LIST = null;

        static {
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r1 = "FT_DANMAKU_VISIBILITY"
                r2 = 0
                r0.<init>(r1, r2)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.FT_DANMAKU_VISIBILITY = r0
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r1 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r3 = "FB_DANMAKU_VISIBILITY"
                r4 = 1
                r1.<init>(r3, r4)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.FB_DANMAKU_VISIBILITY = r1
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r3 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r5 = "L2R_DANMAKU_VISIBILITY"
                r6 = 2
                r3.<init>(r5, r6)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.L2R_DANMAKU_VISIBILITY = r3
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r5 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r7 = "R2L_DANMAKU_VISIBILIY"
                r8 = 3
                r5.<init>(r7, r8)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.R2L_DANMAKU_VISIBILIY = r5
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r7 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r9 = "SPECIAL_DANMAKU_VISIBILITY"
                r10 = 4
                r7.<init>(r9, r10)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SPECIAL_DANMAKU_VISIBILITY = r7
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r9 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r11 = "TYPEFACE"
                r12 = 5
                r9.<init>(r11, r12)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.TYPEFACE = r9
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r11 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r13 = "TRANSPARENCY"
                r14 = 6
                r11.<init>(r13, r14)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.TRANSPARENCY = r11
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r13 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                java.lang.String r15 = "SCALE_TEXTSIZE"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE = r13
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r15 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r17 = 7
                java.lang.String r2 = "MAXIMUM_NUMS_IN_SCREEN"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN = r15
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r19 = 8
                java.lang.String r4 = "DANMAKU_STYLE"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_STYLE = r2
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r4 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r21 = 9
                java.lang.String r6 = "DANMAKU_BOLD"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_BOLD = r4
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r6 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r23 = 10
                java.lang.String r8 = "COLOR_VALUE_WHITE_LIST"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.COLOR_VALUE_WHITE_LIST = r6
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r8 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r25 = 11
                java.lang.String r10 = "USER_ID_BLACK_LIST"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_ID_BLACK_LIST = r8
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r10 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r27 = 12
                java.lang.String r12 = "USER_HASH_BLACK_LIST"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_HASH_BLACK_LIST = r10
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r12 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r29 = 13
                java.lang.String r14 = "SCROLL_SPEED_FACTOR"
                r30 = r0
                r0 = 14
                r12.<init>(r14, r0)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR = r12
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r14 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r31 = 14
                java.lang.String r0 = "BLOCK_GUEST_DANMAKU"
                r32 = r1
                r1 = 15
                r14.<init>(r0, r1)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.BLOCK_GUEST_DANMAKU = r14
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r33 = 15
                java.lang.String r1 = "DUPLICATE_MERGING_ENABLED"
                r34 = r2
                r2 = 16
                r0.<init>(r1, r2)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DUPLICATE_MERGING_ENABLED = r0
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r1 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r35 = 16
                java.lang.String r2 = "MAXIMUN_LINES"
                r36 = r0
                r0 = 17
                r1.<init>(r2, r0)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUN_LINES = r1
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r37 = 17
                java.lang.String r0 = "OVERLAPPING_ENABLE"
                r38 = r1
                r1 = 18
                r2.<init>(r0, r1)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.OVERLAPPING_ENABLE = r2
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r39 = 18
                java.lang.String r1 = "ALIGN_BOTTOM"
                r40 = r2
                r2 = 19
                r0.<init>(r1, r2)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.ALIGN_BOTTOM = r0
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r1 = new master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag
                r41 = 19
                java.lang.String r2 = "DANMAKU_MARGIN"
                r42 = r0
                r0 = 20
                r1.<init>(r2, r0)
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_MARGIN = r1
                r2 = 21
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag[] r2 = new master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag[r2]
                r2[r16] = r30
                r2[r18] = r32
                r2[r20] = r3
                r2[r22] = r5
                r2[r24] = r7
                r2[r26] = r9
                r2[r28] = r11
                r2[r17] = r13
                r2[r19] = r15
                r2[r21] = r34
                r2[r23] = r4
                r2[r25] = r6
                r2[r27] = r8
                r2[r29] = r10
                r2[r31] = r12
                r2[r33] = r14
                r2[r35] = r36
                r2[r37] = r38
                r2[r39] = r40
                r2[r41] = r42
                r2[r0] = r1
                master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.$VALUES = r2
                return
        }

        DanmakuConfigTag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag valueOf(java.lang.String r1) {
                java.lang.Class<master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag> r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r1 = (master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag) r1
                return r1
        }

        public static master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag[] values() {
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag[] r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.$VALUES
                java.lang.Object r0 = r0.clone()
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag[] r0 = (master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag[]) r0
                return r0
        }

        public boolean isVisibilityRelatedTag() {
                r1 = this;
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.FT_DANMAKU_VISIBILITY
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L3b
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.FB_DANMAKU_VISIBILITY
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L3b
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.L2R_DANMAKU_VISIBILITY
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L3b
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.R2L_DANMAKU_VISIBILIY
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L3b
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SPECIAL_DANMAKU_VISIBILITY
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L3b
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.COLOR_VALUE_WHITE_LIST
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L3b
                master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_ID_BLACK_LIST
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L39
                goto L3b
            L39:
                r0 = 0
                return r0
            L3b:
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean a(master.flame.danmaku.danmaku.model.android.DanmakuContext r1, master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag r2, java.lang.Object... r3);
    }

    public DanmakuContext() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            int r0 = master.flame.danmaku.danmaku.model.c.a
            r3.b = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.c = r0
            r1 = 0
            r3.d = r1
            r2 = 1
            r3.e = r2
            r3.f = r2
            r3.g = r2
            r3.h = r2
            r3.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.j = r2
            r2 = -1
            r3.k = r2
            r3.l = r0
            r0 = 15
            r3.m = r0
            master.flame.danmaku.danmaku.model.android.DanmakuContext$BorderType r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.BorderType.SHADOW
            r3.n = r0
            r0 = 3
            r3.p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.r = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.s = r0
            r3.u = r1
            r3.v = r1
            r3.w = r1
            master.flame.danmaku.danmaku.model.android.a r0 = new master.flame.danmaku.danmaku.model.android.a
            r0.<init>()
            r3.A = r0
            master.flame.danmaku.danmaku.model.j r0 = new master.flame.danmaku.danmaku.model.j
            r0.<init>()
            r3.B = r0
            master.flame.danmaku.controller.b r0 = new master.flame.danmaku.controller.b
            r0.<init>()
            r3.C = r0
            master.flame.danmaku.danmaku.model.android.d r0 = master.flame.danmaku.danmaku.model.android.d.a()
            r3.D = r0
            master.flame.danmaku.danmaku.model.android.c r0 = master.flame.danmaku.danmaku.model.android.c.n
            r3.E = r0
            r3.F = r1
            return
    }

    private void F(boolean r2, int r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.List<java.lang.Integer> r2 = r1.j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.remove(r3)
            return
        Lc:
            java.util.List<java.lang.Integer> r2 = r1.j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L21
            java.util.List<java.lang.Integer> r2 = r1.j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
        L21:
            return
    }

    private <T> void J(java.lang.String r2, T r3) {
            r1 = this;
            r0 = 1
            r1.K(r2, r3, r0)
            return
    }

    private <T> void K(java.lang.String r2, T r3, boolean r4) {
            r1 = this;
            master.flame.danmaku.controller.b r0 = r1.C
            master.flame.danmaku.controller.b$e r2 = r0.e(r2, r4)
            r2.a(r3)
            return
    }

    public static master.flame.danmaku.danmaku.model.android.DanmakuContext e() {
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = new master.flame.danmaku.danmaku.model.android.DanmakuContext
            r0.<init>()
            return r0
    }

    private void s(master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag r3, java.lang.Object... r4) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r2.t
            if (r0 == 0) goto L20
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$a r1 = (master.flame.danmaku.danmaku.model.android.DanmakuContext.a) r1
            if (r1 == 0) goto L8
            r1.a(r2, r3, r4)
            goto L8
        L20:
            return
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext A(boolean r4) {
            r3 = this;
            master.flame.danmaku.danmaku.model.b r0 = r3.A
            r0.x(r4)
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_BOLD
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext B(int r4) {
            r3 = this;
            int r0 = r3.d
            if (r0 == r4) goto L24
            r3.d = r4
            master.flame.danmaku.danmaku.model.b r0 = r3.A
            r0.f(r4)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.g()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_MARGIN
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L24:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext C(int r4, float... r5) {
            r3 = this;
            master.flame.danmaku.danmaku.model.b r0 = r3.A
            r0.b(r4, r5)
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_STYLE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r3.s(r0, r1)
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext D(master.flame.danmaku.danmaku.model.a r1) {
            r0 = this;
            r0.o = r1
            return r0
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext E(float r4) {
            r3 = this;
            int r0 = master.flame.danmaku.danmaku.model.c.a
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
            int r1 = r3.b
            if (r0 == r1) goto L20
            r3.b = r0
            master.flame.danmaku.danmaku.model.b r1 = r3.A
            r1.z(r0)
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.TRANSPARENCY
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L20:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext G(boolean r4) {
            r3 = this;
            boolean r0 = r3.v
            if (r0 == r4) goto L1a
            r3.v = r4
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DUPLICATE_MERGING_ENABLED
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L1a:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext H(boolean r4) {
            r3 = this;
            r0 = 4
            r3.F(r4, r0)
            java.lang.String r0 = "1010_Filter"
            java.util.List<java.lang.Integer> r1 = r3.j
            r3.J(r0, r1)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            boolean r0 = r3.f
            if (r0 == r4) goto L25
            r3.f = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.FB_DANMAKU_VISIBILITY
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L25:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext I(boolean r4) {
            r3 = this;
            r0 = 5
            r3.F(r4, r0)
            java.lang.String r0 = "1010_Filter"
            java.util.List<java.lang.Integer> r1 = r3.j
            r3.J(r0, r1)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            boolean r0 = r3.e
            if (r0 == r4) goto L25
            r3.e = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.FT_DANMAKU_VISIBILITY
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L25:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext L(boolean r4) {
            r3 = this;
            r0 = 6
            r3.F(r4, r0)
            java.lang.String r0 = "1010_Filter"
            java.util.List<java.lang.Integer> r1 = r3.j
            r3.J(r0, r1)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            boolean r0 = r3.g
            if (r0 == r4) goto L25
            r3.g = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.L2R_DANMAKU_VISIBILITY
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L25:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext M(int r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.b r0 = r1.A
            r0.q(r2)
            return r1
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext N(java.util.Map<java.lang.Integer, java.lang.Integer> r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            r4.y = r2
            java.lang.String r2 = "1018_Filter"
            if (r5 != 0) goto L13
            master.flame.danmaku.controller.b r3 = r4.C
            r3.l(r2, r1)
            goto L16
        L13:
            r4.K(r2, r5, r1)
        L16:
            master.flame.danmaku.danmaku.model.j r2 = r4.B
            r2.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUN_LINES
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            r4.s(r2, r0)
            return r4
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext O(int r6) {
            r5 = this;
            r5.k = r6
            r0 = 0
            r1 = 1
            java.lang.String r2 = "1012_Filter"
            java.lang.String r3 = "1011_Filter"
            if (r6 != 0) goto L22
            master.flame.danmaku.controller.b r4 = r5.C
            r4.k(r3)
            master.flame.danmaku.controller.b r3 = r5.C
            r3.k(r2)
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r5.s(r2, r1)
            return r5
        L22:
            r4 = -1
            if (r6 != r4) goto L3d
            master.flame.danmaku.controller.b r4 = r5.C
            r4.k(r3)
            master.flame.danmaku.controller.b r3 = r5.C
            r3.f(r2)
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r5.s(r2, r1)
            return r5
        L3d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5.J(r3, r2)
            master.flame.danmaku.danmaku.model.j r2 = r5.B
            r2.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r5.s(r2, r1)
            return r5
    }

    @java.lang.Deprecated
    public master.flame.danmaku.danmaku.model.android.DanmakuContext P(java.util.Map<java.lang.Integer, java.lang.Boolean> r1) {
            r0 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r0.t(r1)
            return r1
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext Q(boolean r4) {
            r3 = this;
            r0 = 1
            r3.F(r4, r0)
            java.lang.String r1 = "1010_Filter"
            java.util.List<java.lang.Integer> r2 = r3.j
            r3.J(r1, r2)
            master.flame.danmaku.danmaku.model.j r1 = r3.B
            r1.b()
            boolean r1 = r3.h
            if (r1 == r4) goto L24
            r3.h = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r1 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.R2L_DANMAKU_VISIBILIY
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            r3.s(r1, r0)
        L24:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext R(float r4) {
            r3 = this;
            float r0 = r3.c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            r3.c = r4
            master.flame.danmaku.danmaku.model.b r0 = r3.A
            r0.r()
            master.flame.danmaku.danmaku.model.b r0 = r3.A
            r0.y(r4)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.d()
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.g()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L2b:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext S(float r4) {
            r3 = this;
            float r0 = r3.l
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L26
            r3.l = r4
            master.flame.danmaku.danmaku.model.android.d r0 = r3.D
            r0.l(r4)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.d()
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.g()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L26:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext T(boolean r4) {
            r3 = this;
            r0 = 7
            r3.F(r4, r0)
            java.lang.String r0 = "1010_Filter"
            java.util.List<java.lang.Integer> r1 = r3.j
            r3.J(r0, r1)
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            boolean r0 = r3.i
            if (r0 == r4) goto L25
            r3.i = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SPECIAL_DANMAKU_VISIBILITY
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L25:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext U(android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Typeface r0 = r1.a
            if (r0 == r2) goto L18
            r1.a = r2
            master.flame.danmaku.danmaku.model.b r0 = r1.A
            r0.r()
            master.flame.danmaku.danmaku.model.b r0 = r1.A
            r0.A(r2)
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.TYPEFACE
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.s(r2, r0)
        L18:
            return r1
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext V(java.lang.String... r4) {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.s
            r0.clear()
            java.lang.String r0 = "1015_Filter"
            if (r4 == 0) goto L18
            int r1 = r4.length
            if (r1 != 0) goto Ld
            goto L18
        Ld:
            java.util.List<java.lang.String> r1 = r3.s
            java.util.Collections.addAll(r1, r4)
            java.util.List<java.lang.String> r4 = r3.s
            r3.J(r0, r4)
            goto L1d
        L18:
            master.flame.danmaku.controller.b r4 = r3.C
            r4.k(r0)
        L1d:
            master.flame.danmaku.danmaku.model.j r4 = r3.B
            r4.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r4 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_HASH_BLACK_LIST
            java.util.List<java.lang.String> r0 = r3.s
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r3.s(r4, r1)
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext W(java.lang.Integer... r4) {
            r3 = this;
            java.util.List<java.lang.Integer> r0 = r3.r
            r0.clear()
            java.lang.String r0 = "1014_Filter"
            if (r4 == 0) goto L18
            int r1 = r4.length
            if (r1 != 0) goto Ld
            goto L18
        Ld:
            java.util.List<java.lang.Integer> r1 = r3.r
            java.util.Collections.addAll(r1, r4)
            java.util.List<java.lang.Integer> r4 = r3.r
            r3.J(r0, r4)
            goto L1d
        L18:
            master.flame.danmaku.controller.b r4 = r3.C
            r4.k(r0)
        L1d:
            master.flame.danmaku.danmaku.model.j r4 = r3.B
            r4.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r4 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_ID_BLACK_LIST
            java.util.List<java.lang.Integer> r0 = r3.r
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r3.s(r4, r1)
            return r3
    }

    public void X() {
            r1 = this;
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r1.t
            if (r0 == 0) goto La
            r0.clear()
            r0 = 0
            r1.t = r0
        La:
            return
    }

    public void Y(master.flame.danmaku.danmaku.model.android.DanmakuContext.a r3) {
            r2 = this;
            if (r3 == 0) goto L26
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r2.t
            if (r0 != 0) goto L7
            goto L26
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lb
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r2.t
            r0.remove(r3)
        L26:
            return
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext a(java.lang.String... r4) {
            r3 = this;
            if (r4 == 0) goto L24
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L24
        L6:
            java.util.List<java.lang.String> r0 = r3.s
            java.util.Collections.addAll(r0, r4)
            java.lang.String r4 = "1015_Filter"
            java.util.List<java.lang.String> r0 = r3.s
            r3.J(r4, r0)
            master.flame.danmaku.danmaku.model.j r4 = r3.B
            r4.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r4 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_HASH_BLACK_LIST
            java.util.List<java.lang.String> r0 = r3.s
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r3.s(r4, r1)
        L24:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext b(java.lang.Integer... r4) {
            r3 = this;
            if (r4 == 0) goto L24
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L24
        L6:
            java.util.List<java.lang.Integer> r0 = r3.r
            java.util.Collections.addAll(r0, r4)
            java.lang.String r4 = "1014_Filter"
            java.util.List<java.lang.Integer> r0 = r3.r
            r3.J(r4, r0)
            master.flame.danmaku.danmaku.model.j r4 = r3.B
            r4.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r4 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_ID_BLACK_LIST
            java.util.List<java.lang.Integer> r0 = r3.r
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r3.s(r4, r1)
        L24:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext c(boolean r4) {
            r3 = this;
            boolean r0 = r3.w
            if (r0 == r4) goto L1a
            r3.w = r4
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.ALIGN_BOTTOM
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
            master.flame.danmaku.danmaku.model.j r4 = r3.B
            r4.g()
        L1a:
            return r3
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext d(boolean r4) {
            r3 = this;
            boolean r0 = r3.u
            if (r0 == r4) goto L2b
            r3.u = r4
            java.lang.String r0 = "1016_Filter"
            if (r4 == 0) goto L12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r3.J(r0, r1)
            goto L17
        L12:
            master.flame.danmaku.controller.b r1 = r3.C
            r1.k(r0)
        L17:
            master.flame.danmaku.danmaku.model.j r0 = r3.B
            r0.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.BLOCK_GUEST_DANMAKU
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r3.s(r0, r1)
        L2b:
            return r3
    }

    public java.util.List<java.lang.Integer> f() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.q
            return r0
    }

    public master.flame.danmaku.danmaku.model.b g() {
            r1 = this;
            master.flame.danmaku.danmaku.model.b r0 = r1.A
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public boolean k() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    public boolean l() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public java.util.List<java.lang.String> m() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.s
            return r0
    }

    public java.util.List<java.lang.Integer> n() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.r
            return r0
    }

    public boolean o() {
            r1 = this;
            boolean r0 = r1.w
            return r0
    }

    public boolean p() {
            r1 = this;
            boolean r0 = r1.v
            return r0
    }

    public boolean q() {
            r1 = this;
            boolean r0 = r1.y
            return r0
    }

    public boolean r() {
            r1 = this;
            boolean r0 = r1.z
            return r0
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext t(java.util.Map<java.lang.Integer, java.lang.Boolean> r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            r4.z = r2
            java.lang.String r2 = "1019_Filter"
            if (r5 != 0) goto L13
            master.flame.danmaku.controller.b r3 = r4.C
            r3.l(r2, r1)
            goto L16
        L13:
            r4.K(r2, r5, r1)
        L16:
            master.flame.danmaku.danmaku.model.j r2 = r4.B
            r2.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r2 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.OVERLAPPING_ENABLE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            r4.s(r2, r0)
            return r4
    }

    public void u(master.flame.danmaku.danmaku.model.android.DanmakuContext.a r3) {
            r2 = this;
            if (r3 == 0) goto L6
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r2.t
            if (r0 != 0) goto L11
        L6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r2.t = r0
        L11:
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r2.t
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L17
            return
        L2e:
            java.util.List<java.lang.ref.WeakReference<master.flame.danmaku.danmaku.model.android.DanmakuContext$a>> r0 = r2.t
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext v(java.lang.String... r6) {
            r5 = this;
            if (r6 == 0) goto L2d
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L2d
        L6:
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            java.util.List<java.lang.String> r4 = r5.s
            r4.remove(r3)
            int r2 = r2 + 1
            goto L9
        L15:
            java.lang.String r6 = "1015_Filter"
            java.util.List<java.lang.String> r0 = r5.s
            r5.J(r6, r0)
            master.flame.danmaku.danmaku.model.j r6 = r5.B
            r6.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r6 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_HASH_BLACK_LIST
            java.util.List<java.lang.String> r0 = r5.s
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            r5.s(r6, r2)
        L2d:
            return r5
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext w(java.lang.Integer... r6) {
            r5 = this;
            if (r6 == 0) goto L2d
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L2d
        L6:
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            java.util.List<java.lang.Integer> r4 = r5.r
            r4.remove(r3)
            int r2 = r2 + 1
            goto L9
        L15:
            java.lang.String r6 = "1014_Filter"
            java.util.List<java.lang.Integer> r0 = r5.r
            r5.J(r6, r0)
            master.flame.danmaku.danmaku.model.j r6 = r5.B
            r6.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r6 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.USER_ID_BLACK_LIST
            java.util.List<java.lang.Integer> r0 = r5.r
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            r5.s(r6, r2)
        L2d:
            return r5
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext x(master.flame.danmaku.danmaku.model.android.b r1, master.flame.danmaku.danmaku.model.android.b.a r2) {
            r0 = this;
            r0.x = r1
            if (r1 == 0) goto Le
            r1.h(r2)
            master.flame.danmaku.danmaku.model.b r1 = r0.A
            master.flame.danmaku.danmaku.model.android.b r2 = r0.x
            r1.v(r2)
        Le:
            return r0
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext y(master.flame.danmaku.danmaku.model.android.c r1) {
            r0 = this;
            r0.E = r1
            return r0
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext z(java.lang.Integer... r4) {
            r3 = this;
            java.util.List<java.lang.Integer> r0 = r3.q
            r0.clear()
            java.lang.String r0 = "1013_Filter"
            if (r4 == 0) goto L18
            int r1 = r4.length
            if (r1 != 0) goto Ld
            goto L18
        Ld:
            java.util.List<java.lang.Integer> r1 = r3.q
            java.util.Collections.addAll(r1, r4)
            java.util.List<java.lang.Integer> r4 = r3.q
            r3.J(r0, r4)
            goto L1d
        L18:
            master.flame.danmaku.controller.b r4 = r3.C
            r4.k(r0)
        L1d:
            master.flame.danmaku.danmaku.model.j r4 = r3.B
            r4.b()
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r4 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.COLOR_VALUE_WHITE_LIST
            java.util.List<java.lang.Integer> r0 = r3.q
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r3.s(r4, r1)
            return r3
    }
}
